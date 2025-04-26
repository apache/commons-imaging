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
package org.apache.commons.imaging.formats.psd.dataparsers;

import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;

import org.apache.commons.imaging.formats.psd.PsdHeaderInfo;
import org.apache.commons.imaging.formats.psd.PsdImageContents;

public abstract class AbstractDataParser {
    public abstract int getBasicChannelsCount();

    protected abstract int getRgb(int[][][] data, int x, int y, PsdImageContents imageContents);

    public final void parseData(final int[][][] data, final BufferedImage bi, final PsdImageContents imageContents) {
        final DataBuffer buffer = bi.getRaster().getDataBuffer();

        final PsdHeaderInfo header = imageContents.header;
        final int width = header.columns;
        final int height = header.rows;

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                final int rgb = getRgb(data, x, y, imageContents);
                buffer.setElem(y * width + x, rgb);
            }
        }
    }
}
