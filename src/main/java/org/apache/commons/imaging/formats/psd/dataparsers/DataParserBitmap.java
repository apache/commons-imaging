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

import org.apache.commons.imaging.formats.psd.ImageContents;

public class DataParserBitmap extends DataParser {

    @Override
    protected int getRGB(final int[][][] data, final int x, final int y,
            final ImageContents imageContents) {
        int sample = 0xff & data[0][y][x];
        if (sample == 0) {
            sample = 255;
        } else {
            sample = 0;
        }
        // sample = 255- sample;
        final int alpha = 0xff;

        return ((0xff & alpha)  << 24)
             | ((0xff & sample) << 16)
             | ((0xff & sample) << 8)
             | ((0xff & sample) << 0);
    }

    @Override
    public int getBasicChannelsCount() {
        return 1;
    }

}
