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

public final class PngChunkPhys extends PngChunk {

    private final int pixelsPerUnitXAxis;
    private final int pixelsPerUnitYAxis;
    private final int unitSpecifier;

    public PngChunkPhys(final int length, final int chunkType, final int crc, final byte[] bytes) throws IOException {
        super(length, chunkType, crc, bytes);
        final ByteArrayInputStream is = new ByteArrayInputStream(bytes);
        pixelsPerUnitXAxis = read4Bytes("PixelsPerUnitXAxis", is, "Not a Valid PNG File: pHYs Corrupt", getByteOrder());
        pixelsPerUnitYAxis = read4Bytes("PixelsPerUnitYAxis", is, "Not a Valid PNG File: pHYs Corrupt", getByteOrder());
        unitSpecifier = readByte("Unit specifier", is, "Not a Valid PNG File: pHYs Corrupt");
    }

    public int getPixelsPerUnitXAxis() {
        return pixelsPerUnitXAxis;
    }

    public int getPixelsPerUnitYAxis() {
        return pixelsPerUnitYAxis;
    }

    public int getUnitSpecifier() {
        return unitSpecifier;
    }

}
