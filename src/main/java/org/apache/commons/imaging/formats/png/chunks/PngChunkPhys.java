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
package org.apache.commons.imaging.formats.png.chunks;

import static org.apache.commons.imaging.common.BinaryFunctions.read4Bytes;
import static org.apache.commons.imaging.common.BinaryFunctions.readByte;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * PNG pHYs chunk with physical pixel dimensions.
 */
public final class PngChunkPhys extends PngChunk {

    private final int pixelsPerUnitXAxis;
    private final int pixelsPerUnitYAxis;
    private final int unitSpecifier;

    /**
     * Constructs a PNG pHYs chunk.
     *
     * @param length the chunk length.
     * @param chunkType the chunk type.
     * @param crc the CRC.
     * @param bytes the chunk bytes.
     * @throws IOException if an I/O error occurs.
     */
    public PngChunkPhys(final int length, final int chunkType, final int crc, final byte[] bytes) throws IOException {
        super(length, chunkType, crc, bytes);
        final ByteArrayInputStream is = new ByteArrayInputStream(bytes);
        pixelsPerUnitXAxis = read4Bytes("PixelsPerUnitXAxis", is, "Not a Valid PNG File: pHYs Corrupt", getByteOrder());
        pixelsPerUnitYAxis = read4Bytes("PixelsPerUnitYAxis", is, "Not a Valid PNG File: pHYs Corrupt", getByteOrder());
        unitSpecifier = readByte("Unit specifier", is, "Not a Valid PNG File: pHYs Corrupt");
    }

    /**
     * Gets the pixels per unit on the X axis.
     *
     * @return pixels per unit on the X axis.
     */
    public int getPixelsPerUnitXAxis() {
        return pixelsPerUnitXAxis;
    }

    /**
     * Gets the pixels per unit on the Y axis.
     *
     * @return pixels per unit on the Y axis.
     */
    public int getPixelsPerUnitYAxis() {
        return pixelsPerUnitYAxis;
    }

    /**
     * Gets the unit specifier (0 = unknown, 1 = meter).
     *
     * @return the unit specifier.
     */
    public int getUnitSpecifier() {
        return unitSpecifier;
    }

}
