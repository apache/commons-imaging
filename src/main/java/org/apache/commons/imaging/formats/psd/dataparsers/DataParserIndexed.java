/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.imaging.formats.psd.dataparsers;

import java.util.Arrays;

import org.apache.commons.imaging.formats.psd.PsdImageContents;

/**
 * Parses indexed color mode PSD image data.
 */
public class DataParserIndexed extends AbstractDataParser {
    private final int[] colorTable;

    /**
     * Constructs a new indexed color data parser.
     *
     * @param colorModeData the color mode data containing the color table.
     */
    public DataParserIndexed(final byte[] colorModeData) {
        colorTable = new int[256];
        Arrays.setAll(colorTable, i -> {
            final int red = 0xff & colorModeData[0 * 256 + i];
            final int green = 0xff & colorModeData[1 * 256 + i];
            final int blue = 0xff & colorModeData[2 * 256 + i];
            final int alpha = 0xff;

            // return RGB
            return (0xff & alpha) << 24 | (0xff & red) << 16 | (0xff & green) << 8 | (0xff & blue) << 0;
        });
    }

    @Override
    public int getBasicChannelsCount() {
        return 1;
    }

    @Override
    protected int getRgb(final int[][][] data, final int x, final int y, final PsdImageContents imageContents) {
        final int sample = 0xff & data[0][y][x];
        return colorTable[sample];
    }

}
