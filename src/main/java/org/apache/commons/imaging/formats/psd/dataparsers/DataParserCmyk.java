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

import org.apache.commons.imaging.color.ColorConversions;
import org.apache.commons.imaging.formats.psd.PsdImageContents;

public class DataParserCmyk extends DataParser {
    @Override
    protected int getRGB(final int[][][] data, final int x, final int y,
            final PsdImageContents imageContents) {
        int sc = 0xff & data[0][y][x];
        int sm = 0xff & data[1][y][x];
        int sy = 0xff & data[2][y][x];
        int sk = 0xff & data[3][y][x];

        // CRAZY adobe has to store the bytes in reverse form.
        final double SC = 100 - sc/2.550;
        final double SM = 100 - sm/2.550;
        final double SY = 100 - sy/2.550;
        final double SK = 100 - sk/2.550;

        return ColorConversions.convertCMYKtoRGB(SC, SM, SY, SK);
    }

    @Override
    public int getBasicChannelsCount() {
        return 4;
    }

}
