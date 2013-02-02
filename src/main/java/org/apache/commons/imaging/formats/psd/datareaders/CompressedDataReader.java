/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.imaging.formats.psd.datareaders;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.BinaryFileParser;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.common.ByteOrder;
import org.apache.commons.imaging.common.PackBits;
import org.apache.commons.imaging.common.mylzw.BitsToByteInputStream;
import org.apache.commons.imaging.common.mylzw.MyBitInputStream;
import org.apache.commons.imaging.formats.psd.ImageContents;
import org.apache.commons.imaging.formats.psd.PsdHeaderInfo;
import org.apache.commons.imaging.formats.psd.dataparsers.DataParser;

public class CompressedDataReader extends DataReader {

    public CompressedDataReader(final DataParser fDataParser) {
        super(fDataParser);
    }

    @Override
    public void readData(final InputStream is, final BufferedImage bi,
            final ImageContents imageContents, final BinaryFileParser bfp)
            throws ImageReadException, IOException {
        final PsdHeaderInfo header = imageContents.header;
        final int width = header.Columns;
        final int height = header.Rows;

        // this.setDebug(true);
        final int scanline_count = height * header.Channels;
        final int scanline_bytecounts[] = new int[scanline_count];
        for (int i = 0; i < scanline_count; i++) {
            scanline_bytecounts[i] = BinaryFunctions.read2Bytes("scanline_bytecount[" + i
                    + "]", is, "PSD: bad Image Data", bfp.getByteOrder());
        }
        bfp.setDebug(false);
        // System.out.println("fImageContents.Compression: "
        // + imageContents.Compression);

        final int depth = header.Depth;

        final int channel_count = dataParser.getBasicChannelsCount();
        final int data[][][] = new int[channel_count][height][];
        // channels[0] =
        for (int channel = 0; channel < channel_count; channel++) {
            for (int y = 0; y < height; y++) {
                final int index = channel * height + y;
                final byte packed[] = BinaryFunctions.readBytes("scanline",
                        scanline_bytecounts[index], is,
                        "PSD: Missing Image Data");

                final byte unpacked[] = new PackBits().decompress(packed, width);
                final InputStream bais = new ByteArrayInputStream(unpacked);
                final MyBitInputStream mbis = new MyBitInputStream(bais,
                        ByteOrder.MOTOROLA);
                final BitsToByteInputStream bbis = new BitsToByteInputStream(mbis, 8); // we
                                                                                 // want
                                                                                 // all
                                                                                 // samples
                                                                                 // to
                                                                                 // be
                                                                                 // bytes
                final int scanline[] = bbis.readBitsArray(depth, width);
                data[channel][y] = scanline;

            }
        }

        dataParser.parseData(data, bi, imageContents);

    }
}
