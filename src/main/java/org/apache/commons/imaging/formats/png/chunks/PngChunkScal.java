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
package org.apache.commons.imaging.formats.png.chunks;

import java.nio.charset.StandardCharsets;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.common.BinaryFunctions;

public final class PngChunkScal extends PngChunk {

    private final double unitsPerPixelXAxis;
    private final double unitsPerPixelYAxis;
    private final int unitSpecifier;

    public PngChunkScal(final int length, final int chunkType, final int crc, final byte[] bytes) throws ImagingException {
        super(length, chunkType, crc, bytes);

        unitSpecifier = bytes[0];
        if (getUnitSpecifier() != 1 && getUnitSpecifier() != 2) {
            throw new ImagingException("PNG sCAL invalid unit specifier: " + getUnitSpecifier());
        }

        final int separator = BinaryFunctions.indexOf0(bytes, "PNG sCAL x and y axis value separator not found.");
        final int xIndex = 1;
        final String xStr = new String(bytes, xIndex, separator - 1, StandardCharsets.ISO_8859_1);
        unitsPerPixelXAxis = toDouble(xStr);

        final int yIndex = separator + 1;
        if (yIndex >= length) {
            throw new ImagingException("PNG sCAL chunk missing the y axis value.");
        }

        final String yStr = new String(bytes, yIndex, length - yIndex, StandardCharsets.ISO_8859_1);
        unitsPerPixelYAxis = toDouble(yStr);
    }

    public int getUnitSpecifier() {
        return unitSpecifier;
    }

    public double getUnitsPerPixelXAxis() {
        return unitsPerPixelXAxis;
    }

    public double getUnitsPerPixelYAxis() {
        return unitsPerPixelYAxis;
    }

    private double toDouble(final String str) throws ImagingException {
        try {
            return Double.parseDouble(str);
        } catch (final NumberFormatException e) {
            throw new ImagingException("PNG sCAL error reading axis value - " + str);
        }
    }
}
