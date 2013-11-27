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
package org.apache.commons.imaging.formats.tiff.datareaders;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.common.PackBits;
import org.apache.commons.imaging.common.itu_t4.T4AndT6Compression;
import org.apache.commons.imaging.common.mylzw.MyLzwDecompressor;
import org.apache.commons.imaging.formats.tiff.TiffDirectory;
import org.apache.commons.imaging.formats.tiff.TiffField;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter;

import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.*;

public abstract class DataReader {
    protected final TiffDirectory directory;
    protected final PhotometricInterpreter photometricInterpreter;
    protected final int[] bitsPerSample;
    protected final int[] last;

    protected final int predictor;
    protected final int samplesPerPixel;
    protected final int width, height;

    public DataReader(final TiffDirectory directory,
            final PhotometricInterpreter photometricInterpreter, final int[] bitsPerSample,
            final int predictor, final int samplesPerPixel, final int width, final int height) {
        this.directory = directory;
        this.photometricInterpreter = photometricInterpreter;
        this.bitsPerSample = bitsPerSample;
        this.samplesPerPixel = samplesPerPixel;
        this.predictor = predictor;
        this.width = width;
        this.height = height;
        last = new int[samplesPerPixel];
    }

    // public abstract void readImageData(BufferedImage bi, ByteSource
    // byteSource)
    public abstract void readImageData(ImageBuilder imageBuilder)
            throws ImageReadException, IOException;


    public abstract BufferedImage readImageData(Rectangle subImage)
            throws ImageReadException, IOException;

    
    
    /**
     * Reads samples and returns them in an int array.
     * 
     * @param bis
     *            the stream to read from
     * @param result
     *            the samples array to populate, must be the same length as
     *            bitsPerSample.length
     * @throws IOException
     */
    void getSamplesAsBytes(final BitInputStream bis, final int[] result) throws IOException {
        for (int i = 0; i < bitsPerSample.length; i++) {
            final int bits = bitsPerSample[i];
            int sample = bis.readBits(bits);
            if (bits < 8) {
                final int sign = sample & 1;
                sample = sample << (8 - bits); // scale to byte.
                if (sign > 0) {
                    sample = sample | ((1 << (8 - bits)) - 1); // extend to byte
                }
            } else if (bits > 8) {
                sample = sample >> (bits - 8); // extend to byte.
            }
            result[i] = sample;
        }
    }

    protected void resetPredictor() {
        for (int i = 0; i < last.length; i++) {
            last[i] = 0;
        }
    }

    protected int[] applyPredictor(final int[] samples) {
        if (predictor == 2) {
            // Horizontal differencing.
            for (int i = 0; i < samples.length; i++) {
                samples[i] = 0xff & (samples[i] + last[i]);
                last[i] = samples[i];
            }
        }

        return samples;
    }

    protected byte[] decompress(final byte[] compressed, final int compression,
            final int expectedSize, final int tileWidth, final int tileHeight)
            throws ImageReadException, IOException {
        final TiffField fillOrderField = directory
                .findField(TiffTagConstants.TIFF_TAG_FILL_ORDER);
        int fillOrder = TiffTagConstants.FILL_ORDER_VALUE_NORMAL;
        if (fillOrderField != null) {
            fillOrder = fillOrderField.getIntValue();
        }
        if (fillOrder == TiffTagConstants.FILL_ORDER_VALUE_NORMAL) {
            // good
        } else if (fillOrder == TiffTagConstants.FILL_ORDER_VALUE_REVERSED) {
            for (int i = 0; i < compressed.length; i++) {
                compressed[i] = (byte) (Integer.reverse(0xff & compressed[i]) >>> 24);
            }
        } else {
            throw new ImageReadException("TIFF FillOrder=" + fillOrder
                    + " is invalid");
        }

        switch (compression) {
        case TIFF_COMPRESSION_UNCOMPRESSED: // None;
            return compressed;
        case TIFF_COMPRESSION_CCITT_1D: // CCITT Group 3 1-Dimensional Modified
                                        // Huffman run-length encoding.
            return T4AndT6Compression.decompressModifiedHuffman(compressed,
                    tileWidth, tileHeight);
        case TIFF_COMPRESSION_CCITT_GROUP_3: {
            int t4Options = 0;
            final TiffField field = directory
                    .findField(TiffTagConstants.TIFF_TAG_T4_OPTIONS);
            if (field != null) {
                t4Options = field.getIntValue();
            }
            final boolean is2D = (t4Options & TIFF_FLAG_T4_OPTIONS_2D) != 0;
            final boolean usesUncompressedMode = (t4Options & TIFF_FLAG_T4_OPTIONS_UNCOMPRESSED_MODE) != 0;
            if (usesUncompressedMode) {
                throw new ImageReadException(
                        "T.4 compression with the uncompressed mode extension is not yet supported");
            }
            final boolean hasFillBitsBeforeEOL = (t4Options & TIFF_FLAG_T4_OPTIONS_FILL) != 0;
            if (is2D) {
                return T4AndT6Compression.decompressT4_2D(compressed,
                        tileWidth, tileHeight, hasFillBitsBeforeEOL);
            }
            return T4AndT6Compression.decompressT4_1D(compressed,
                    tileWidth, tileHeight, hasFillBitsBeforeEOL);
        }
        case TIFF_COMPRESSION_CCITT_GROUP_4: {
            int t6Options = 0;
            final TiffField field = directory
                    .findField(TiffTagConstants.TIFF_TAG_T6_OPTIONS);
            if (field != null) {
                t6Options = field.getIntValue();
            }
            final boolean usesUncompressedMode = (t6Options & TIFF_FLAG_T6_OPTIONS_UNCOMPRESSED_MODE) != 0;
            if (usesUncompressedMode) {
                throw new ImageReadException(
                        "T.6 compression with the uncompressed mode extension is not yet supported");
            }
            return T4AndT6Compression.decompressT6(compressed, tileWidth,
                    tileHeight);
        }
        case TIFF_COMPRESSION_LZW: // LZW
        {
            final InputStream is = new ByteArrayInputStream(compressed);

            final int lzwMinimumCodeSize = 8;

            final MyLzwDecompressor myLzwDecompressor = new MyLzwDecompressor(
                    lzwMinimumCodeSize, ByteOrder.BIG_ENDIAN);

            myLzwDecompressor.setTiffLZWMode();

            return myLzwDecompressor.decompress(is, expectedSize);
        }

        case TIFF_COMPRESSION_PACKBITS: // Packbits
        {
            return new PackBits().decompress(compressed, expectedSize);
        }

        default:
            throw new ImageReadException("Tiff: unknown/unsupported compression: " + compression);
        }
    }
}
