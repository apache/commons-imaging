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
package org.apache.sanselan.formats.tiff.datareaders;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.common.BinaryConstants;
import org.apache.sanselan.common.BitInputStream;
import org.apache.sanselan.common.PackBits;
import org.apache.sanselan.common.itu_t4.T4Compression;
import org.apache.sanselan.common.mylzw.MyLZWDecompressor;
import org.apache.sanselan.formats.tiff.constants.TiffConstants;
import org.apache.sanselan.formats.tiff.photometricinterpreters.PhotometricInterpreter;

public abstract class DataReader implements TiffConstants, BinaryConstants
{
    protected final PhotometricInterpreter photometricInterpreter;
    protected final int bitsPerSample[];
    protected final int last[];

    protected final int predictor;
    protected final int samplesPerPixel;
    protected final int width, height;

    public DataReader(PhotometricInterpreter photometricInterpreter,
            int bitsPerSample[], int predictor, int samplesPerPixel,
            int width, int height)
    {
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
            throws ImageReadException, IOException
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
            int expected_size) throws ImageReadException, IOException
    {
        switch (compression)
        {
            case TIFF_COMPRESSION_UNCOMPRESSED : // None;
                return compressed;
            case TIFF_COMPRESSION_CCITT_1D : // CCITT Group 3 1-Dimensional Modified Huffman run-length encoding.
                return T4Compression.decompress1D(compressed, width, height);
            case TIFF_COMPRESSION_LZW : // LZW
            {
                InputStream is = new ByteArrayInputStream(compressed);

                int LZWMinimumCodeSize = 8;

                MyLZWDecompressor myLzwDecompressor = new MyLZWDecompressor(
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