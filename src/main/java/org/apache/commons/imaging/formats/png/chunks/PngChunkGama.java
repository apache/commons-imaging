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

import static org.apache.commons.imaging.common.BinaryFunctions.read4Bytes;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.formats.png.ChunkType;

public final class PngChunkGama extends PngChunk {
    
    public final int gamma;

    PngChunkGama(final ByteBuffer contents) throws ImageReadException {
        super(ChunkType.gAMA, contents);
        
        if(contentSize() > 4) {
            throw new ImageReadException("PNG Component: Illegal Gama chunk, "
                    + "has illegal size (should be 4 bytes only): " + 
                    contentSize());
        }
        
        this.gamma = contents.getInt(0);
    }

    public double getGamma() {
        return 1.0 / (gamma / 100000.0);
    }

}
