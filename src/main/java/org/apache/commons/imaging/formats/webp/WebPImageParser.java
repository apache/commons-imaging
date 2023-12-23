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
package org.apache.commons.imaging.formats.webp;

import static org.apache.commons.imaging.common.BinaryFunctions.read4Bytes;
import static org.apache.commons.imaging.common.BinaryFunctions.readBytes;
import static org.apache.commons.imaging.common.BinaryFunctions.skipBytes;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.ByteOrder;
import java.util.ArrayList;

import org.apache.commons.imaging.AbstractImageParser;
import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.bytesource.ByteSource;
import org.apache.commons.imaging.common.XmpEmbeddable;
import org.apache.commons.imaging.common.XmpImagingParameters;
import org.apache.commons.imaging.formats.tiff.TiffImageMetadata;
import org.apache.commons.imaging.formats.tiff.TiffImageParser;
import org.apache.commons.imaging.formats.webp.chunks.WebPChunk;
import org.apache.commons.imaging.formats.webp.chunks.WebPChunkVp8;
import org.apache.commons.imaging.formats.webp.chunks.WebPChunkVp8l;
import org.apache.commons.imaging.formats.webp.chunks.WebPChunkVp8x;
import org.apache.commons.imaging.formats.webp.chunks.WebPChunkXml;
import org.apache.commons.imaging.internal.SafeOperations;

/**
 * WebP image parser.
 *
 * @since 1.0-alpha4
 */
public class WebPImageParser extends AbstractImageParser<WebPImagingParameters> implements XmpEmbeddable<WebPImagingParameters> {

    private static final class ChunksReader implements Closeable {
        private final InputStream is;
        private final WebPChunkType[] chunkTypes;
        private int sizeCount = 4;
        private boolean firstChunk = true;

        final int fileSize;

        ChunksReader(final ByteSource byteSource) throws IOException, ImagingException {
            this(byteSource, (WebPChunkType[]) null);
        }

        ChunksReader(final ByteSource byteSource, final WebPChunkType... chunkTypes) throws ImagingException, IOException {
            this.is = byteSource.getInputStream();
            this.chunkTypes = chunkTypes;
            this.fileSize = readFileHeader(is);
        }

        @Override
        public void close() throws IOException {
            is.close();
        }

        int getOffset() {
            return SafeOperations.add(sizeCount, 8); // File Header
        }

        WebPChunk readChunk() throws ImagingException, IOException {
            while (sizeCount < fileSize) {
                final int type = read4Bytes("Chunk Type", is, "Not a valid WebP file", ByteOrder.LITTLE_ENDIAN);
                final int payloadSize = read4Bytes("Chunk Size", is, "Not a valid WebP file", ByteOrder.LITTLE_ENDIAN);
                if (payloadSize < 0) {
                    throw new ImagingException("Chunk Payload is too long:" + payloadSize);
                }
                final boolean padding = payloadSize % 2 != 0;
                final int chunkSize = SafeOperations.add(8, padding ? 1 : 0, payloadSize);

                if (firstChunk) {
                    firstChunk = false;
                    if (type != WebPChunkType.VP8.value && type != WebPChunkType.VP8L.value && type != WebPChunkType.VP8X.value) {
                        throw new ImagingException("First Chunk must be VP8, VP8L or VP8X");
                    }
                }

                if (chunkTypes != null) {
                    boolean skip = true;
                    for (final WebPChunkType t : chunkTypes) {
                        if (t.value == type) {
                            skip = false;
                            break;
                        }
                    }
                    if (skip) {
                        skipBytes(is, payloadSize + (padding ? 1 : 0));
                        sizeCount = SafeOperations.add(sizeCount, chunkSize);
                        continue;
                    }
                }

                final byte[] bytes = readBytes("Chunk Payload", is, payloadSize);
                final WebPChunk chunk = WebPChunkType.makeChunk(type, payloadSize, bytes);
                if (padding) {
                    skipBytes(is, 1);
                }

                sizeCount = SafeOperations.add(sizeCount, chunkSize);
                return chunk;
            }

            if (firstChunk) {
                throw new ImagingException("No WebP chunks found");
            }
            return null;
        }
    }

    private static final String DEFAULT_EXTENSION = ImageFormats.WEBP.getDefaultExtension();

    private static final String[] ACCEPTED_EXTENSIONS = ImageFormats.WEBP.getExtensions();

    /**
     * Read the file header of WebP file.
     *
     * @return file size in file header (including the WebP signature, excluding the TIFF signature and the file size field).
     */
    private static int readFileHeader(final InputStream is) throws IOException, ImagingException {
        final byte[] buffer = new byte[4];
        if (is.read(buffer) < 4 || !WebPConstants.RIFF_SIGNATURE.equals(buffer)) {
            throw new ImagingException("Not a valid WebP file");
        }

        final int fileSize = read4Bytes("File Size", is, "Not a valid WebP file", ByteOrder.LITTLE_ENDIAN);
        if (fileSize < 0) {
            throw new ImagingException("File size is too long:" + fileSize);
        }

        if (is.read(buffer) < 4 || !WebPConstants.WEBP_SIGNATURE.equals(buffer)) {
            throw new ImagingException("Not a valid WebP file");
        }

        return fileSize;
    }

    @Override
    public boolean dumpImageFile(final PrintWriter pw, final ByteSource byteSource) throws ImagingException, IOException {
        pw.println("webp.dumpImageFile");
        try (ChunksReader reader = new ChunksReader(byteSource)) {
            int offset = reader.getOffset();
            WebPChunk chunk = reader.readChunk();
            if (chunk == null) {
                throw new ImagingException("No WebP chunks found");
            }

            // TODO: this does not look too risky; a user could craft an image
            // with millions of chunks, that are really expensive to dump,
            // but that should result in a large image, where we can short-
            // -circuit the operation somewhere else - if needed.
            do {
                chunk.dump(pw, offset);

                offset = reader.getOffset();
                chunk = reader.readChunk();
            } while (chunk != null);
        }
        return true;
    }

    @Override
    protected String[] getAcceptedExtensions() {
        return ACCEPTED_EXTENSIONS;
    }

    @Override
    protected ImageFormat[] getAcceptedTypes() {
        return new ImageFormat[] { ImageFormats.WEBP };
    }

    @Override
    public BufferedImage getBufferedImage(final ByteSource byteSource, final WebPImagingParameters params) throws ImagingException, IOException {
        throw new ImagingException("Reading WebP files is currently not supported");
    }

    @Override
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Override
    public WebPImagingParameters getDefaultParameters() {
        return new WebPImagingParameters();
    }

    @Override
    public byte[] getIccProfileBytes(final ByteSource byteSource, final WebPImagingParameters params) throws ImagingException, IOException {
        try (ChunksReader reader = new ChunksReader(byteSource, WebPChunkType.ICCP)) {
            final WebPChunk chunk = reader.readChunk();
            return chunk == null ? null : chunk.getBytes();
        }
    }

    @Override
    public ImageInfo getImageInfo(final ByteSource byteSource, final WebPImagingParameters params) throws ImagingException, IOException {
        try (ChunksReader reader = new ChunksReader(byteSource, WebPChunkType.VP8, WebPChunkType.VP8L, WebPChunkType.VP8X, WebPChunkType.ANMF)) {
            String formatDetails;
            int width;
            int height;
            int numberOfImages;
            boolean hasAlpha = false;
            ImageInfo.ColorType colorType = ImageInfo.ColorType.RGB;

            WebPChunk chunk = reader.readChunk();
            if (chunk instanceof WebPChunkVp8) {
                formatDetails = "WebP/Lossy";
                numberOfImages = 1;

                final WebPChunkVp8 vp8 = (WebPChunkVp8) chunk;
                width = vp8.getWidth();
                height = vp8.getHeight();
                colorType = ImageInfo.ColorType.YCbCr;
            } else if (chunk instanceof WebPChunkVp8l) {
                formatDetails = "WebP/Lossless";
                numberOfImages = 1;

                final WebPChunkVp8l vp8l = (WebPChunkVp8l) chunk;
                width = vp8l.getImageWidth();
                height = vp8l.getImageHeight();
            } else if (chunk instanceof WebPChunkVp8x) {
                final WebPChunkVp8x vp8x = (WebPChunkVp8x) chunk;
                width = vp8x.getCanvasWidth();
                height = vp8x.getCanvasHeight();
                hasAlpha = ((WebPChunkVp8x) chunk).hasAlpha();

                if (vp8x.hasAnimation()) {
                    formatDetails = "WebP/Animation";

                    numberOfImages = 0;
                    while ((chunk = reader.readChunk()) != null) {
                        if (chunk.getType() == WebPChunkType.ANMF.value) {
                            numberOfImages++;
                        }
                    }

                } else {
                    numberOfImages = 1;
                    chunk = reader.readChunk();

                    if (chunk == null) {
                        throw new ImagingException("Image has no content");
                    }

                    if (chunk.getType() == WebPChunkType.ANMF.value) {
                        throw new ImagingException("Non animated image should not contain ANMF chunks");
                    }

                    if (chunk.getType() == WebPChunkType.VP8.value) {
                        formatDetails = "WebP/Lossy (Extended)";
                        colorType = ImageInfo.ColorType.YCbCr;
                    } else if (chunk.getType() == WebPChunkType.VP8L.value) {
                        formatDetails = "WebP/Lossless (Extended)";
                    } else {
                        throw new ImagingException("Unknown WebP chunk type: " + chunk);
                    }
                }
            } else {
                throw new ImagingException("Unknown WebP chunk type: " + chunk);
            }

            return new ImageInfo(formatDetails, 32, new ArrayList<>(), ImageFormats.WEBP, "webp", height, "image/webp", numberOfImages, -1, -1, -1, -1, width,
                    false, hasAlpha, false, colorType, ImageInfo.CompressionAlgorithm.UNKNOWN);
        }
    }

    @Override
    public Dimension getImageSize(final ByteSource byteSource, final WebPImagingParameters params) throws ImagingException, IOException {
        try (ChunksReader reader = new ChunksReader(byteSource)) {
            final WebPChunk chunk = reader.readChunk();
            if (chunk instanceof WebPChunkVp8) {
                final WebPChunkVp8 vp8 = (WebPChunkVp8) chunk;
                return new Dimension(vp8.getWidth(), vp8.getHeight());
            }
            if (chunk instanceof WebPChunkVp8l) {
                final WebPChunkVp8l vp8l = (WebPChunkVp8l) chunk;
                return new Dimension(vp8l.getImageWidth(), vp8l.getImageHeight());
            }
            if (chunk instanceof WebPChunkVp8x) {
                final WebPChunkVp8x vp8x = (WebPChunkVp8x) chunk;
                return new Dimension(vp8x.getCanvasWidth(), vp8x.getCanvasHeight());
            }
            throw new ImagingException("Unknown WebP chunk type: " + chunk);
        }
    }

    @Override
    public WebPImageMetadata getMetadata(final ByteSource byteSource, final WebPImagingParameters params) throws ImagingException, IOException {
        try (ChunksReader reader = new ChunksReader(byteSource, WebPChunkType.EXIF)) {
            final WebPChunk chunk = reader.readChunk();
            return chunk == null ? null : new WebPImageMetadata((TiffImageMetadata) new TiffImageParser().getMetadata(chunk.getBytes()));
        }
    }

    @Override
    public String getName() {
        return "WebP-Custom";
    }

    @Override
    public String getXmpXml(final ByteSource byteSource, final XmpImagingParameters<WebPImagingParameters> params) throws ImagingException, IOException {
        try (ChunksReader reader = new ChunksReader(byteSource, WebPChunkType.XMP)) {
            final WebPChunkXml chunk = (WebPChunkXml) reader.readChunk();
            return chunk == null ? null : chunk.getXml();
        }
    }
}
