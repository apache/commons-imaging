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
package org.apache.commons.imaging.formats.webp.chunks;

import java.io.IOException;
import java.io.PrintWriter;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.formats.tiff.TiffImageMetadata;
import org.apache.commons.imaging.formats.tiff.TiffImageParser;

/**
 * Exif (metadata) chunk.
 *
 * <pre>{@code
 *  0                   1                   2                   3
 *  0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1
 * +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
 * |                      ChunkHeader('EXIF')                      |
 * |                                                               |
 * +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
 * :                        Exif Metadata                          :
 * +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
 * }</pre>
 *
 * @see <a href="https://developers.google.com/speed/webp/docs/riff_container#metadata">Extended File Format#Metadata</a>
 * @since 1.0-alpha4
 */
public final class WebPChunkExif extends WebPChunk {

    /**
     * Create an Exif chunk.
     *
     * @param type  chunk type.
     * @param size  chunk size.
     * @param bytes chunk data.
     * @throws ImagingException if the chunk data and the size provided do not match.
     */
    public WebPChunkExif(int type, int size, byte[] bytes) throws ImagingException {
        super(type, size, bytes);
    }

    @Override
    public void dump(PrintWriter pw, int offset) throws ImagingException, IOException {
        super.dump(pw, offset);
        TiffImageMetadata metadata = (TiffImageMetadata) new TiffImageParser().getMetadata(bytes);
        for (ImageMetadata.ImageMetadataItem item : metadata.getItems()) {
            pw.println(item.toString("  "));
        }
    }
}
