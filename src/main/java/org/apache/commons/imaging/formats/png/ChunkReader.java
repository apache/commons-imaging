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
package org.apache.commons.imaging.formats.png;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.imaging.ImageReadException;
import static org.apache.commons.imaging.common.BinaryFunctions.readAndVerifyBytes;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.formats.png.chunks.ChunkLoader;
import org.apache.commons.imaging.formats.png.chunks.PngChunk;
import org.apache.commons.imaging.formats.png.chunks.PngChunkIhdr;

// Replaces readChunk in PngImageParser.
// This should be a public API. This will allow 3rd party apps
// to read chunks. Shouldn't ever break.

/**
 * {@code PngReader} objects can be used to read PNG chunks from
 * an input stream.
 * 
 * @author Shukant Pal
 */
public class ChunkReader {
    
    DataInputStream input;
    
    /**
     * Asserts that the input stream contains the PNG signature at the
     * very beginning; throws an ImageReadException otherwise.
     * 
     * @throws IOException
     * @throws ImageReadException 
     */
    private void assertSignature() throws IOException, ImageReadException {
        readAndVerifyBytes(input, PngConstants.PNG_SIGNATURE,
                "Not a Valid PNG Segment: Incorrect Signature");
    }
    
    public ChunkReader() {    
    }
    
    public ChunkReader(InputStream input) throws ImageReadException, IOException {
        setInput(input);
    }
    
    public final DataInputStream getInput() {
        return input;
    }
    
    public final void setInput(InputStream input) throws ImageReadException, IOException {
        this.input = new DataInputStream(input);
        assertSignature();
    }
    
    /**
     * Reads all the chunks (satisfying any filters) from the input
     * stream containing a PNG file.
     * 
     * @param selector can be used to filter chunks
     * @param returnAfterFirst
     * @return
     * @throws IOException
     * @throws ImageReadException 
     */
    public List<PngChunk> readChunks(
            final ChunkLoader.ChunkSelector selector, final boolean returnAfterFirst)
            throws IOException, ImageReadException {
        final List<PngChunk> result = new ArrayList<>();
        
        while(true) {
            final ChunkLoader nextChunkLoaded = ChunkLoader.run(input, selector);
            PngChunk loadedChunk = nextChunkLoaded.loadedChunk();
            
            if(loadedChunk != null) {
                { // (Shukant Pal): I essentially hate how developers
                  // have created a dumb PngCrc object. Couldn't it just be
                  // in one method call. Anyways, CRC checking wasn't
                  // done before. I added this.
                    final PngCrc png_crc = new PngCrc();

                    final long crc1 = png_crc.start_partial_crc(loadedChunk.chunkType.array, 4);
                    final long crc2 = loadedChunk.getBytes() == null ? crc1 :
                           png_crc.continue_partial_crc(
                                crc1, loadedChunk.getBytes(), loadedChunk.contentSize());

                    int chunkCRC = (int) png_crc.finish_partial_crc(crc2);
                    
                    if(chunkCRC != nextChunkLoaded.chunkCrc()) {
                        throw new ImageReadException("Illegal CRC value found" + 
                                "(ChunkType: " + loadedChunk.chunkType +")," +
                                "(CRC VALUE: " + nextChunkLoaded.chunkCrc() + ")," +
                                "(CRC EXPECTED " + chunkCRC + ")");
                    }
                }
                
                result.add(loadedChunk);
                
                if(returnAfterFirst) {
                    break;
                }
            }
            
            if(nextChunkLoaded.isLast()) {
                break;
            } // loadedChunk may be null still
        }
        
        return result;
    }
    
    public PngChunkIhdr getHeader() throws IOException, ImageReadException {
        List<PngChunk> result = readChunks(PngImageParser.IHDR_SEL, true);
        return (PngChunkIhdr) result.get(0);
    }
    
    public static ChunkReader newInstance(InputStream input)
            throws ImageReadException, IOException {
        return new ChunkReader(input);
    }
    
    public static ChunkReader newInstance(ByteSource input)
            throws ImageReadException, IOException {
        return new ChunkReader(input.getInputStream());
    }
    
}
