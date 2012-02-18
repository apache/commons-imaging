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
package org.apache.commons.sanselan.formats.tiff.datareaders;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.sanselan.ImageReadException;
import org.apache.commons.sanselan.common.BinaryConstants;
import org.apache.commons.sanselan.common.BitInputStream;
import org.apache.commons.sanselan.common.PackBits;
import org.apache.commons.sanselan.common.itu_t4.T4AndT6Compression;
import org.apache.commons.sanselan.common.mylzw.MyLzwDecompressor;
import org.apache.commons.sanselan.formats.tiff.TiffDirectory;
import org.apache.commons.sanselan.formats.tiff.TiffField;
import org.apache.commons.sanselan.formats.tiff.constants.ExifTagConstants;
import org.apache.commons.sanselan.formats.tiff.constants.TiffConstants;
import org.apache.commons.sanselan.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.sanselan.formats.tiff.photometricinterpreters.PhotometricInterpreter;

public abstract class DataReader implements TiffConstants, BinaryConstants
{
    protected final TiffDirectory directory;
    protected final PhotometricInterpreter photometricInterpreter;
    protected final int bitsPerSample[];
    protected final int last[];

    protected final int predictor;
    protected final int samplesPerPixel;
    protected final int width, height;

    public DataReader(TiffDirectory directory,
            PhotometricInterpreter photometricInterpreter,
            int bitsPerSample[], int predictor, int samplesPerPixel,
            int width, int height)
    {
        this.directory = directory;
        this.photometricInterpreter = photometricInterpreter;
        this.bitsPerSample = bitsPerSample;
        this.samplesPerPixel = samplesPerPixel;
        this.predictor = predictor;
        this.width = width;
        this.height = height;
        last = new int[samplesPerPixel];
    }

    //    public abstract void readImageData(BufferedImage bi, ByteSource byteSource)
    public abstract void readImageData(BufferedImage bi)
            throws ImageReadException, IOException;

    protected int[] getSamplesAsBytes(BitInputStream bis)
            throws IOException
    {
        int result[] = new int[bitsPerSample.length];
        for (int i = 0; i < bitsPerSample.length; i++)
        {
            int bits = bitsPerSample[i];
            int sample = bis.readBits(bits);
            if (bits < 8)
            {
                int sign = sample & 1;
                sample = sample << (8 - bits); // scale to byte.
                if (sign > 0)
                    sample = sample | ((1 << (8 - bits)) - 1); // extend to byte
            }
            else if (bits > 8)
            {
                sample = sample >> (bits - 8); // extend to byte.
            }
            result[i] = sample;
        }

        return result;
    }

    protected int[] applyPredictor(int samples[], int x)
    {
        if (predictor == 2) // Horizontal differencing.
        {
            for (int i = 0; i < samples.length; i++)
            {
                if (x > 0)
                {
                    samples[i] = 0xff & (samples[i] + last[i]);
                }
                last[i] = samples[i];
            }
        }

        return samples;
    }

    private int count = 0;

    protected byte[] decompress(byte compressed[], int compression,
            int expected_size, int tileWidth, int tileHeight) throws ImageReadException, IOException
    {
        TiffField fillOrderField = directory.findField(TiffTagConstants.TIFF_TAG_FILL_ORDER);
        int fillOrder = ExifTagConstants.FILL_ORDER_VALUE_NORMAL;
        if (fillOrderField != null) {
            fillOrder = fillOrderField.getIntValue();
        }
        if (fillOrder == ExifTagConstants.FILL_ORDER_VALUE_NORMAL) {
            // good
        } else if (fillOrder == ExifTagConstants.FILL_ORDER_VALUE_REVERSED) {
            for (int i = 0; i < compressed.length; i++) {
                compressed[i] = (byte) (Integer.reverse(0xff & compressed[i]) >>> 24);
            }
        } else {
            throw new ImageReadException("TIFF FillOrder=" + fillOrder + " is invalid");
        }
        
        switch (compression)
        {
            case TIFF_COMPRESSION_UNCOMPRESSED : // None;
                return compressed;
            case TIFF_COMPRESSION_CCITT_1D : // CCITT Group 3 1-Dimensional Modified Huffman run-length encoding.
                return T4AndT6Compression.decompressModifiedHuffman(compressed, tileWidth, tileHeight);
            case TIFF_COMPRESSION_CCITT_GROUP_3 :
            {
                int t4Options = 0;
                TiffField field = directory.findField(TiffTagConstants.TIFF_TAG_T4_OPTIONS);
                if (field != null) {
                    t4Options = field.getIntValue();
                }
                boolean is2D = (t4Options & TIFF_FLAG_T4_OPTIONS_2D) != 0;
                boolean usesUncompressedMode = (t4Options & TIFF_FLAG_T4_OPTIONS_UNCOMPRESSED_MODE) != 0;
                if (usesUncompressedMode) {
                    throw new ImageReadException("T.4 compression with the uncompressed mode extension is not yet supported");
                }
                boolean hasFillBitsBeforeEOL = (t4Options & TIFF_FLAG_T4_OPTIONS_FILL) != 0;
                if (is2D) {
                    return T4AndT6Compression.decompressT4_2D(compressed, tileWidth, tileHeight, hasFillBitsBeforeEOL);
                } else {
                    return T4AndT6Compression.decompressT4_1D(compressed, tileWidth, tileHeight, hasFillBitsBeforeEOL);
                }
            }
            case TIFF_COMPRESSION_CCITT_GROUP_4 :
            {
                int t6Options = 0;
                TiffField field = directory.findField(TiffTagConstants.TIFF_TAG_T6_OPTIONS);
                if (field != null) {
                    t6Options = field.getIntValue();
                }
                boolean usesUncompressedMode = (t6Options & TIFF_FLAG_T6_OPTIONS_UNCOMPRESSED_MODE) != 0;
                if (usesUncompressedMode) {
                    throw new ImageReadException("T.6 compression with the uncompressed mode extension is not yet supported");
                }
                return T4AndT6Compression.decompressT6(compressed, tileWidth, tileHeight);
            }
            case TIFF_COMPRESSION_LZW : // LZW
            {
                InputStream is = new ByteArrayInputStream(compressed);

                int LZWMinimumCodeSize = 8;

                MyLzwDecompressor myLzwDecompressor = new MyLzwDecompressor(
                        LZWMinimumCodeSize, BYTE_ORDER_NETWORK);

                myLzwDecompressor.setTiffLZWMode();

                byte[] result = myLzwDecompressor.decompress(is, expected_size);

                return result;
            }

            case TIFF_COMPRESSION_PACKBITS : // Packbits
            {
                byte unpacked[] = new PackBits().decompress(compressed,
                        expected_size);
                count++;

                return unpacked;
            }

            default :
                throw new ImageReadException("Tiff: unknown/unsupported compression: "
                        + compression);
        }
    }

}