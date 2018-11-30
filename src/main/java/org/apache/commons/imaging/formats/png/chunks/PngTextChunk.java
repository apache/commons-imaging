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

import java.nio.ByteBuffer;
import org.apache.commons.imaging.formats.png.ChunkType;
import org.apache.commons.imaging.formats.png.PngText;

/**
 * PngTextChunk is an abstraction to iTXT, tEXt, and zTXt chunks,
 * all of which have a keyword and text value.
 * 
 * @author Shukant Pal
 */
public abstract class PngTextChunk extends PngChunk {

    protected PngTextChunk(final ChunkType type, final ByteBuffer contents) {
        super(type, contents);
    }
    
    public PngTextChunk(final int length, final int chunkType, final int crc, final byte[] bytes) {
        super(length, chunkType, crc, bytes);
    }

    /**
     * Returns the keyword
     * 
    * @return keyword
     */
    public abstract String getKeyword();

    /**
     * Returns the text contents
     * 
     * @return text contents 
     */
    public abstract String getText();

    public abstract PngText getContents();

}
