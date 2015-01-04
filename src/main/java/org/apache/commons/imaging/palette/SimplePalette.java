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
package org.apache.commons.imaging.palette;

public class SimplePalette implements Palette {
    private final int[] palette;

    public SimplePalette(final int[] palette) {
        this.palette = palette;
    }

    public int getPaletteIndex(final int rgb) {
        return getPaletteIndex(palette, rgb);
    }

    public int getEntry(final int index) {
        return palette[index];
    }

    private int getPaletteIndex(final int[] palette, final int argb) {
        for (int i = 0; i < palette.length; i++) {
            if (palette[i] == argb) {
                return i;
            }
        }

        return -1;
    }

    public int length() {
        return palette.length;
    }
}
