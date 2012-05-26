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
package org.apache.commons.imaging.formats.png.scanlinefilters;

import java.io.IOException;

import org.apache.commons.imaging.ImageReadException;

public class ScanlineFilterAverage extends ScanlineFilter {
    private final int BytesPerPixel;

    public ScanlineFilterAverage(int BytesPerPixel) {
        this.BytesPerPixel = BytesPerPixel;
    }

    @Override
    public void unfilter(byte src[], byte dst[], byte up[])
            throws ImageReadException, IOException {
        for (int i = 0; i < src.length; i++) {
            int Raw = 0;
            int prev_index = i - BytesPerPixel;
            if (prev_index >= 0)
                Raw = dst[prev_index];

            int Prior = 0;
            if (up != null)
                Prior = up[i];

            int Average = ((0xff & Raw) + (0xff & Prior)) / 2;

            dst[i] = (byte) ((src[i] + Average) % 256);
            // dst[i] = src[i];
            // dst[i] = (byte) 255;
        }
    }
}
