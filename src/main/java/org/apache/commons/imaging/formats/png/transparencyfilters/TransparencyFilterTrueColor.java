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
package org.apache.commons.imaging.formats.png.transparencyfilters;

import static org.apache.commons.imaging.common.BinaryFunctions.read2Bytes;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.apache.commons.imaging.ImagingException;

public final class TransparencyFilterTrueColor extends AbstractTransparencyFilter {
    private final int transparentColor;

    public TransparencyFilterTrueColor(final byte[] bytes) throws IOException {
        super(bytes);

        final ByteArrayInputStream is = new ByteArrayInputStream(bytes);
        final int transparentRed = read2Bytes("transparentRed", is, "tRNS: Missing transparentColor", getByteOrder());
        final int transparentGreen = read2Bytes("transparentGreen", is, "tRNS: Missing transparentColor", getByteOrder());
        final int transparentBlue = read2Bytes("transparentBlue", is, "tRNS: Missing transparentColor", getByteOrder());

        transparentColor = (0xff & transparentRed) << 16 | (0xff & transparentGreen) << 8 | (0xff & transparentBlue) << 0;

    }

    @Override
    public int filter(final int rgb, final int sample) throws ImagingException, IOException {
        if ((0x00ffffff & rgb) == transparentColor) {
            return 0x00;
        }

        return rgb;
    }
}
