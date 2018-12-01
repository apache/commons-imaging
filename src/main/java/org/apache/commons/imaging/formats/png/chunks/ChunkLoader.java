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

import java.io.DataInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.formats.png.ChunkType;

/**
 * {@code ChunkLoader} objects provide common methods to extract
 * a chunk from the input stream.
 *
 * Instead of storing the CRC in the PngChunk itself, these objects
 * will separately get the CRC. Each png chunk class should register
 * a ChunkLoader.
 *
 * <h2>Usage</h2>
 * 
 * The ChunkLoader object only contains the results of loading a
 * chunk from a PNG input stream. The real building is done by the
 * {@code ChunkLoader.run} method. It returns a ChunkLoader object
 * that has the loadedChunk & its storedCrc. For an example usage,
 * see {@link PngImageParser.readAllChunks}.
 * 
 * @author Shukant Pal
 */
public final class ChunkLoader {

    private DataInputStream chunkInput;
    private ByteBuffer contents;
    private int storedCrc;
    private boolean isLast = false;

    private PngChunk loadedChunk;

    public ChunkLoader() {
        this.chunkInput = null;
    }

    protected ChunkLoader(DataInputStream chunkInput) {
        setInput(chunkInput);
    }

    public DataInputStream getInput() {
        return this.chunkInput;
    }
    
    public void setInput(DataInputStream chunkInput) {
        this.chunkInput = chunkInput;
    }
    
    public boolean isLast() {
        return isLast;
    }
    
    /**
     * Reads the chunk contents and then builds a {@code Chunk}
     * object (specific class inheriting from Chunk) from that.
     *
     * @param length
     * @param chunkType
     * @return
     * @throws ImageReadException
     * @throws IOException
     */
    public ChunkLoader build(int length, ChunkType chunkType) throws ImageReadException, IOException {
        if (chunkInput == null) {
            throw new ImageReadException("Chunk input not initialized...");
        }
        
        final byte[] contentsRaw = new byte[length];
        int realLength = chunkInput.read(contentsRaw);
        
        if (realLength != length) {
            throw new ImageReadException("The PNG file contains an illegal " +
                    "chunk length, that doesn't exist");
        }
        
        this.contents = ByteBuffer.wrap(contentsRaw);
        this.storedCrc = chunkInput.readInt();
        
        if (chunkType != null) switch (chunkType) {
            case IHDR:
                loadedChunk = new PngChunkIhdr(contents);
                break;
            case PLTE:
                loadedChunk = new PngChunkPlte(contents);
                break;
            case IDAT:
                loadedChunk = new PngChunkIdat(contents);
                break;
            case IEND:
                loadedChunk = new PngChunk(chunkType, contents);
                isLast = true;
                break;
            case gAMA:
                loadedChunk = new PngChunkGama(contents);
                break;
            case iCCP:
                loadedChunk = new PngChunkIccp(contents);
                break;
            case iTXt:
                loadedChunk = new PngChunkItxt(contents);
                break;
            case pHYs:
                loadedChunk = new PngChunkPhys(contents);
                break;
            case sCAL:
                loadedChunk = new PngChunkScal(contents);
                break;
            case tEXt:
                loadedChunk = new PngChunkText(contents);
                break;
            case zTXt:
                loadedChunk = new PngChunkZtxt(contents);
                break;
            default:
                loadedChunk = new PngChunk(chunkType, contents);
                break;
        } else {
            loadedChunk = null;
        }
        
        return this;
    }
    
    public PngChunk loadedChunk() {
        return loadedChunk;
    }

    public int chunkCrc() {
        return storedCrc;
    }

    /**
     * Creates {@code ChunkLoader} object for the next chunk in the input
     * stream.
     * 
     * If the {@code selector} rejects the chunk-type, then the required
     * amount of bytes are skipped in the input stream. The next chunk can
     * be read directly.
     * 
     * @param chunkInput
     * @param selector
     * @return
     * @throws ImageReadException
     * @throws IOException 
     */
    public static ChunkLoader run(DataInputStream chunkInput, ChunkSelector selector)
            throws ImageReadException, IOException {
        final int length = chunkInput.readInt();
        final ChunkType chunkType = ChunkType.forCode(chunkInput.readInt());
        
        // IEND chunk is compulsory to allow reader to get
        // EOF
        if ((selector == null || selector.whetherToKeep(chunkType))) {
            return new ChunkLoader(chunkInput).build(length, chunkType);
        } else if (chunkType == ChunkType.IEND) {
           // must tell
           final ChunkLoader loader = new ChunkLoader();
           loader.isLast = true;
           return loader;
        } else {
            BinaryFunctions.skipBytes(chunkInput, length + 4,
                    "IOException error: BinaryFunctions.skipBytes(), PNG Component");
            return new ChunkLoader();// not null
        }
    }
    
    /**
     * ChunkSelector object filter out chunks that are not to be
     * loaded by {@code ChunkLoader.run()} to reduce overall
     * overhead.
     * 
     * <h2>NOTICE</h2>
     * 
     * (Replaces PngImageParser.keepChunk}. ChunkSelector also
     * supports two mode - whiteList and blackList. In whiteList,
     * the chunk types are the ones to be loaded, and in blackList
     * all chunks are loaded except the given ones.
     * 
     * <h2>USAGE</h2>
     * There are two ChunkSelector implementations - ChunkListSelector
     * and ChunkUniselector.
     */
    public static abstract class ChunkSelector {
        
        protected final boolean whiteList;

        /**
         * Constructs a new ChunkSelector.
         * 
         * @param whiteList - whether chunk types given are to be
         *      accepted or refused
         */
        protected ChunkSelector(boolean whiteList) {
            this.whiteList = whiteList;
        }
        
        public boolean isWhiteList() {
            return whiteList;
        }
        
        public boolean isBlackList() {
            return !whiteList;
        }
        
        /**
         * Returns whether the given chunk is to be selected for
         * building.
         * 
         * @param chunkType
         * @return 
         */
        public abstract boolean whetherToKeep(ChunkType chunkType);
        
        /**
         * Filters all the chunks in src and the result contains
         * only chunks which satisfy whetherToKeep(chunk.chunkType)
         * 
         * @param src
         * @return 
         */
        public List<PngChunk> filter(List<PngChunk> src) {
            List<PngChunk> dst = new ArrayList<>();
            
            for(PngChunk chunk : src) {
                if(whetherToKeep(chunk.chunkType))
                    dst.add(chunk);
            }
            
            return dst;
        }
        
        public PngChunk filterOnlyOne(List<PngChunk> src) throws ImageReadException {
            List<PngChunk> filtered = filter(src);
            
            if(filtered.size() > 1) {
                throw new ImageReadException("More than one present in filtered: " +
                        "type is " + filtered.get(0).chunkType);
            } else if(filtered.size() == 0) {
                return null;
            }
            
            return filtered.get(0);
        }
        
    }
    
    public static class ChunkListSelector extends ChunkSelector {

        private final ChunkType[] list;
        
        public ChunkListSelector(boolean whiteList, ChunkType[] list) {
            super(whiteList);
            this.list = list;
        }
        
        public ChunkType[] getList() {
            return Arrays.copyOf(list, list.length);
        }
        
        @Override
        public boolean whetherToKeep(ChunkType chunkType) {
            if(list == null) {
                return !whiteList;
            }
            
            for(ChunkType type : list) {
                if(type == chunkType) {
                    return whiteList;
                }
            }
            
            return !whiteList;
        }
        
    }
    
    public static class ChunkUniselector extends ChunkSelector {
        
        private final ChunkType selected;
        
        public ChunkUniselector(boolean whiteList, ChunkType selected) {
            super(whiteList);
            this.selected = selected;
        }
 
        public ChunkType getSelected() {
            return selected;
        }
        
        @Override
        public boolean whetherToKeep(ChunkType type) {
            if(type == selected)
                return whiteList;
            return !whiteList;
        }
        
    }
    
}
