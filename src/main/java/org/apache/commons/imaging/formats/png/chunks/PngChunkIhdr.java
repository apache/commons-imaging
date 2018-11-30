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
import java.nio.ByteBuffer;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.formats.png.ChunkType;
import org.apache.commons.imaging.formats.png.InterlaceMethod;
import org.apache.commons.imaging.formats.png.PngColorType;

// BIG FAT NOTE: PngChunkIhdr has now become read-write (mutable) to
// remove its duplicate PngWriter.ImageHeader.

/**
 * {@code PngChunkIhdr} are mutable PNG chunk objects that holds image
 * header information.
 * 
 * Note that PngChunkIhdr was made mutable to allow PngWriter.ImageHeader
 * to be removed. Other chunks are (supposed to be) immutable.
 * 
 * @author Shukant Pal
 */
public final class PngChunkIhdr extends PngChunk {
    
    private int width;
    private int height;
    private int bitDepth;
    private PngColorType pngColorType;
    private int compressionMethod;
    private int filterMethod;
    private InterlaceMethod interlaceMethod;
    
    /**
     * Constructs a {@code PNGChunkIhdr} from the contents given.
     * 
     * @param contents
     * @throws ImageReadException 
     */
    PngChunkIhdr(ByteBuffer contents) throws ImageReadException {
        super(ChunkType.IHDR, contents);
        int interlaceMethodCode;
        
        this.width = rawContents.getInt(0);
        this.height = rawContents.getInt(4);
        this.bitDepth = rawContents.get(8);
        this.pngColorType = PngColorType.getColorType(rawContents.get(9));
        this.compressionMethod = rawContents.get(10);
        this.filterMethod = rawContents.get(11);
        interlaceMethodCode = rawContents.get(12);
        
        if(interlaceMethodCode < 0 ||
                interlaceMethodCode > InterlaceMethod.values().length) {
            throw new ImageReadException("Interlace method is invalid "
                    + "by Apache Commons Imaging Library.");
        }
        
        this.interlaceMethod = InterlaceMethod.values()[interlaceMethodCode];
        
        if(pngColorType == null) {
            throw new ImageReadException("PNG color type is invalid or not recognized "
                    + "by Apache Commons Imaging Library.");
        }
    }

    public PngChunkIhdr(final int length, final int chunkType, final int crc,
            final byte[] bytes) throws ImageReadException, IOException {
        super(length, chunkType, crc, bytes);

        final ByteArrayInputStream is = new ByteArrayInputStream(bytes);
        width = rawContents.getInt(0);
        height = rawContents.getInt(4);
        bitDepth = rawContents.get(8);
        pngColorType = PngColorType.getColorType(rawContents.get(9));

        if (pngColorType == null) {
            throw new ImageReadException("PNG Component: Unsupported PNG color "
                    + "type value found: " + rawContents.get(9));
        }
        
        compressionMethod = rawContents.get(10);
        filterMethod = rawContents.get(11);
        final int method = rawContents.get(12);
        
        if (method < 0 && method >= InterlaceMethod.values().length) {
            throw new ImageReadException("PNG: unknown interlace method: " + method);
        }
        
        interlaceMethod = InterlaceMethod.values()[method];
    }
    
    public PngChunkIhdr(int width, int height, int bitDepth, PngColorType pngColorType,
            int compressionMethod, int filterMethod, InterlaceMethod interlaceMethod) {
        super(13, ChunkType.IHDR.toCode(), 0, new byte[13]);
        
        setWidth(width);
        setHeight(height);
        setBitDepth(bitDepth);
        setPngColorType(pngColorType);
        setCompressionMethod(compressionMethod);
        setFilterMethod(filterMethod);
        setInterlaceMethod(interlaceMethod);
        // wasChanged = true, hence invalid CRC allowed
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        wasChanged = true;
        this.width = width;
        this.rawContents.putInt(0, width);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        wasChanged = true;
        this.height = height;
        this.rawContents.putInt(4, height);
    }

    public int getBitDepth() {
        return bitDepth;
    }

    public void setBitDepth(int bitDepth) {
        wasChanged = true;
        this.bitDepth = bitDepth;
        this.rawContents.put(8, (byte)(bitDepth & 0xFF));
    }

    public PngColorType getPngColorType() {
        return pngColorType;
    }

    public void setPngColorType(PngColorType pngColorType) {
        wasChanged = true;
        this.pngColorType = pngColorType;
        this.rawContents.put(9, (byte)(pngColorType.getValue()));
    }

    public int getCompressionMethod() {
        return compressionMethod;
    }

    public void setCompressionMethod(int compressionMethod) {
        wasChanged = true;
        this.compressionMethod = compressionMethod;
        this.rawContents.put(10, (byte)(compressionMethod & 0xFF));
    }

    public int getFilterMethod() {
        return filterMethod;
    }

    public void setFilterMethod(int filterMethod) {
        wasChanged = true;
        this.filterMethod = filterMethod;
        this.rawContents.put(11, (byte)(filterMethod & 0xFF));
    }

    public InterlaceMethod getInterlaceMethod() {
        return interlaceMethod;
    }

    public void setInterlaceMethod(InterlaceMethod interlaceMethod) {
        wasChanged = true;
        this.interlaceMethod = interlaceMethod;
        this.rawContents.put(12, (byte)(interlaceMethod.ordinal()));
    }
    
}
