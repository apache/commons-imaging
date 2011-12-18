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
package org.apache.commons.sanselan.formats.psd.dataparsers;

import org.apache.commons.sanselan.formats.psd.ImageContents;

public class DataParserIndexed extends DataParser
{
    private final int ColorTable[];

    public DataParserIndexed(byte ColorModeData[])
    {
        ColorTable = new int[256];
        for (int i = 0; i < 256; i++)
        {
            int red = 0xff & ColorModeData[0 * 256 + i];
            int green = 0xff & ColorModeData[1 * 256 + i];
            int blue = 0xff & ColorModeData[2 * 256 + i];
            int alpha = 0xff;

            int rgb = ((0xff & alpha) << 24) | ((0xff & red) << 16)
                    | ((0xff & green) << 8) | ((0xff & blue) << 0);

            ColorTable[i] = rgb;
        }
    }

    protected int getRGB(int data[][][], int x, int y,
            ImageContents imageContents)
    {
        int sample = 0xff & data[0][y][x];
        int rgb = ColorTable[sample];

        return rgb;
    }

    public int getBasicChannelsCount()
    {
        return 1;
    }

}