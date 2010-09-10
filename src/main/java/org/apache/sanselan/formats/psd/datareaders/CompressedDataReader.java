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
package org.apache.sanselan.formats.psd.datareaders;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.common.BinaryFileParser;
import org.apache.sanselan.common.PackBits;
import org.apache.sanselan.common.mylzw.BitsToByteInputStream;
import org.apache.sanselan.common.mylzw.MyBitInputStream;
import org.apache.sanselan.formats.psd.ImageContents;
import org.apache.sanselan.formats.psd.PSDHeaderInfo;
import org.apache.sanselan.formats.psd.dataparsers.DataParser;

public class CompressedDataReader extends DataReader
{

    public CompressedDataReader(DataParser fDataParser)
    {
        super(fDataParser);
    }

    public void readData(InputStream is, BufferedImage bi,
            ImageContents imageContents, BinaryFileParser bfp)
            throws ImageReadException, IOException
    {
        PSDHeaderInfo header = imageContents.header;
        int width = header.Columns;
        int height = header.Rows;

        //                this.setDebug(true);
        int scanline_count = height * header.Channels;
        int scanline_bytecounts[] = new int[scanline_count];
        for (int i = 0; i < scanline_count; i++)
            scanline_bytecounts[i] = bfp.read2Bytes("scanline_bytecount[" + i
                    + "]", is, "PSD: bad Image Data");
        bfp.setDebug(false);
        //        System.out.println("fImageContents.Compression: "
        //                + imageContents.Compression);

        int depth = header.Depth;

        int channel_count = dataParser.getBasicChannelsCount();
        int data[][][] = new int[channel_count][height][];
        //            channels[0] =
        for (int channel = 0; channel < channel_count; channel++)
            for (int y = 0; y < height; y++)
            {
                int index = channel * height + y;
                byte packed[] = bfp.readByteArray("scanline",
                        scanline_bytecounts[index], is,
                        "PSD: Missing Image Data");

                byte unpacked[] = new PackBits().decompress(packed, width);
                InputStream bais = new ByteArrayInputStream(unpacked);
                MyBitInputStream mbis = new MyBitInputStream(bais,
                        BYTE_ORDER_MSB);
                BitsToByteInputStream bbis = new BitsToByteInputStream(mbis, 8); // we want all samples to be bytes
                int scanline[] = bbis.readBitsArray(depth, width);
                data[channel][y] = scanline;

            }

        dataParser.parseData(data, bi, imageContents);

    }
}