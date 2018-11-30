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
import java.nio.ByteBuffer;
import java.util.Arrays;

import org.apache.commons.imaging.common.BinaryFileParser;
import org.apache.commons.imaging.formats.png.ChunkType;

public class PngChunk extends BinaryFileParser {

    
    public final ChunkType chunkType;
    public int crc;

    protected final ByteBuffer rawContents;
    
    /**
     * Should be set to true when child classes are used to
     * modify the buffer.
     */
    protected boolean wasChanged;
    
    public PngChunk(final ChunkType chunkType, final ByteBuffer rawContents) {
        this.chunkType = chunkType;
        this.rawContents = rawContents;
    }
    
    /*
    @deprecated, why not use ChunkType directly and also use bytes.length
    */
    public PngChunk(final int length, final int chunkType, final int crc, final byte[] bytes) {
        this.chunkType = ChunkType.forCode(chunkType);// nonsense use above ctor
        this.crc = crc;
        this.rawContents = ByteBuffer.wrap(bytes);
    }

    public byte[] getBytes() {
        return Arrays.copyOf(rawContents.array(), rawContents.capacity());
    }
    
    /**
     * Returns the size of this chunk's contents.
     * 
     * Replaced {@code Chunk.length} as it was not required.
     * 
     * @return 
     */
    public final int contentSize() {
        return rawContents.capacity();
    }
    
    /**
     * Returns type code of this chunk.
     * 
     * Is overridden by PngChunkUnknown as there is no ChunkType
     * having the typeCode required.
     * 
     * @return 
     */
    public int typeCode() {
        return chunkType.toCode();
    }
    
    /**
     * Returns whether this chunk was modified after setting
     * {@code wasChanged} to true (or after construction).
     * 
     * @return wasChanged 
     */
    public boolean wasChanged() {
        return wasChanged;
    }
    
    /**
     * Returns {@code wasChanged} and sets its new value to
     * false if required (shouldFlip).
     * 
     * @param shouldFlip - whether to set wasChanged to false
     * @return wasChanged (old value)
     */
    public boolean wasChanged(boolean shouldFlip) {
        boolean localCopy = wasChanged;
        if(shouldFlip)
            wasChanged = false;
        
        return localCopy;
    }

    protected ByteArrayInputStream getDataStream() {
        return new ByteArrayInputStream(getBytes());
    }

}
