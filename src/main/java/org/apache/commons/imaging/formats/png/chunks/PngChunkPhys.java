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

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class PngChunkPhys extends PngChunk {
    public final int pixelsPerUnitXAxis;
    public final int pixelsPerUnitYAxis;
    public final int unitSpecifier;

    public PngChunkPhys(final int Length, final int ChunkType, final int CRC, final byte[] bytes)
            throws IOException {
        super(Length, ChunkType, CRC, bytes);

        final ByteArrayInputStream is = new ByteArrayInputStream(bytes);

        pixelsPerUnitXAxis = read4Bytes("PixelsPerUnitXAxis", is, "Not a Valid Png File: pHYs Corrupt");
        pixelsPerUnitYAxis = read4Bytes("PixelsPerUnitYAxis", is, "Not a Valid Png File: pHYs Corrupt");
        unitSpecifier = readByte("Unit specifier", is, "Not a Valid Png File: pHYs Corrupt");
    }

}
