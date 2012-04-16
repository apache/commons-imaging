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
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.BinaryFileParser;
import org.apache.commons.imaging.common.mylzw.BitsToByteInputStream;
import org.apache.commons.imaging.common.mylzw.MyBitInputStream;
import org.apache.commons.imaging.formats.psd.ImageContents;
import org.apache.commons.imaging.formats.psd.PsdHeaderInfo;
import org.apache.commons.imaging.formats.psd.dataparsers.DataParser;

public class UncompressedDataReader extends DataReader
{
    public UncompressedDataReader(DataParser fDataParser)
    {
        super(fDataParser);
    }

    @Override
    public void readData(InputStream is, BufferedImage bi,
            ImageContents imageContents, BinaryFileParser bfp)
            throws ImageReadException, IOException
    {
        PsdHeaderInfo header = imageContents.header;
        int width = header.Columns;
        int height = header.Rows;

        bfp.setDebug(false);

        int channel_count = dataParser.getBasicChannelsCount();
        int depth = header.Depth;
        MyBitInputStream mbis = new MyBitInputStream(is, BYTE_ORDER_MSB);
        BitsToByteInputStream bbis = new BitsToByteInputStream(mbis, 8); // we want all samples to be bytes

        int data[][][] = new int[channel_count][height][width];
        for (int channel = 0; channel < channel_count; channel++)
            for (int y = 0; y < height; y++)
                for (int x = 0; x < width; x++)
                {
                    int b = bbis.readBits(depth);

                    data[channel][y][x] = (byte) b;
                }

        dataParser.parseData(data, bi, imageContents);

    }
}