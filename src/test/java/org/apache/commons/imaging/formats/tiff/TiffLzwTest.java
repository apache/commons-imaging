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

package org.apache.commons.imaging.formats.tiff;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.bytesource.ByteSource;
import org.apache.commons.imaging.internal.Debug;
import org.apache.commons.imaging.mylzw.MyLzwCompressor;
import org.apache.commons.imaging.mylzw.MyLzwDecompressor;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TiffLzwTest extends TiffBaseTest {

    private void compressRoundtripAndValidate(final byte[] src) throws IOException, ImagingException {
        final boolean DEBUG = false;

        if (DEBUG) {
            Debug.debug();
            Debug.debug("roundtripAndValidate: " + src.length);
            Debug.debug();
        }

        final int LZW_MINIMUM_CODE_SIZE = 8;
        final List<Integer> codes = new ArrayList<>();
        final MyLzwCompressor.Listener compressionListener = new MyLzwCompressor.Listener() {
            @Override
            public void clearCode(final int code) {
                codes.add(code);
            }

            @Override
            public void dataCode(final int code) {
                codes.add(code);
            }

            @Override
            public void eoiCode(final int code) {
                codes.add(code);
            }

            @Override
            public void init(final int clearCode, final int eoiCode) {
            }
        };

        final MyLzwCompressor compressor = new MyLzwCompressor(LZW_MINIMUM_CODE_SIZE, ByteOrder.BIG_ENDIAN, true, compressionListener);
        final byte[] compressed = compressor.compress(src);

        final MyLzwDecompressor.Listener decompressionListener = new MyLzwDecompressor.Listener() {

            int index;
            int clearCode;
            int eoiCode;

            @Override
            public void code(final int code) {
                if (DEBUG) {
                    if (code == clearCode) {
                        Debug.debug("clearCode: " + index + "/" + codes.size());
                        Debug.debug();
                    }
                    if (code == eoiCode) {
                        Debug.debug("eoiCode: " + index + "/" + codes.size());
                        Debug.debug();
                    }
                }
                final Integer expectedCode = codes.get(index++);
                if (code != expectedCode) {
                    Debug.debug("bad code: " + index + "/" + codes.size());
                    Debug.debug("code: " + code + " (0x" + Integer.toHexString(code) + ") " + Integer.toBinaryString(code));
                    Debug.debug("expected: " + expectedCode + " (0x" + Integer.toHexString(expectedCode) + ") " + Integer.toBinaryString(expectedCode));
                    Debug.debug("clearCode: " + clearCode + " (0x" + Integer.toHexString(clearCode) + ") " + Integer.toBinaryString(clearCode));
                    Debug.debug("eoiCode: " + eoiCode + " (0x" + Integer.toHexString(eoiCode) + ") " + Integer.toBinaryString(eoiCode));
                    Debug.debug();
                }
            }

            @Override
            public void init(final int clearCode, final int eoiCode) {
                this.clearCode = clearCode;
                this.eoiCode = eoiCode;
            }

        };
        final InputStream is = new ByteArrayInputStream(compressed);
        final MyLzwDecompressor decompressor = new MyLzwDecompressor(LZW_MINIMUM_CODE_SIZE, ByteOrder.BIG_ENDIAN, true, decompressionListener);
        final byte[] decompressed = decompressor.decompress(is, src.length);

        assertEquals(src.length, decompressed.length);
        for (int i = 0; i < src.length; i++) {
            assertEquals(src[i], decompressed[i]);
        }
    }

    private void decompressRoundtripAndValidate(final byte[] src) throws IOException, ImagingException {
        Debug.debug();
        Debug.debug("roundtripAndValidate: " + src.length);
        Debug.debug();

        final int LZW_MINIMUM_CODE_SIZE = 8;
        final List<Integer> codes = new ArrayList<>();

        final MyLzwDecompressor.Listener decompressionListener = new MyLzwDecompressor.Listener() {

            @Override
            public void code(final int code) {
                Debug.debug("listener code: " + code + " (0x" + Integer.toHexString(code) + ") " + Integer.toBinaryString(code) + ", index: " + codes.size());
                codes.add(code);
            }

            @Override
            public void init(final int clearCode, final int eoiCode) {
            }

        };
        final InputStream is = new ByteArrayInputStream(src);
        final MyLzwDecompressor decompressor = new MyLzwDecompressor(LZW_MINIMUM_CODE_SIZE, ByteOrder.BIG_ENDIAN, true, decompressionListener);
        final byte[] decompressed = decompressor.decompress(is, src.length);

        final MyLzwCompressor.Listener compressionListener = new MyLzwCompressor.Listener() {

            int clearCode;
            int eoiCode;
            int index;

            @Override
            public void clearCode(final int code) {
                code(code);
            }

            private void code(final int code) {

                if (code == clearCode) {
                    Debug.debug("clearCode: " + index + "/" + codes.size());
                    Debug.debug();
                }
                if (code == eoiCode) {
                    Debug.debug("eoiCode: " + index + "/" + codes.size());
                    Debug.debug();
                }
                final Integer expectedCode = codes.get(index++);
                if (code != expectedCode) {
                    Debug.debug("bad code: " + index + "/" + codes.size());
                    Debug.debug("code: " + code + " (0x" + Integer.toHexString(code) + ") " + Integer.toBinaryString(code));
                    Debug.debug("expected: " + expectedCode + " (0x" + Integer.toHexString(expectedCode) + ") " + Integer.toBinaryString(expectedCode));
                    Debug.debug("clearCode: " + clearCode + " (0x" + Integer.toHexString(clearCode) + ") " + Integer.toBinaryString(clearCode));
                    Debug.debug("eoiCode: " + eoiCode + " (0x" + Integer.toHexString(eoiCode) + ") " + Integer.toBinaryString(eoiCode));
                    Debug.debug();
                }
            }

            @Override
            public void dataCode(final int code) {
                code(code);
            }

            @Override
            public void eoiCode(final int code) {
                code(code);
            }

            @Override
            public void init(final int clearCode, final int eoiCode) {
                this.clearCode = clearCode;
                this.eoiCode = eoiCode;
            }

        };

        final MyLzwCompressor compressor = new MyLzwCompressor(LZW_MINIMUM_CODE_SIZE, ByteOrder.BIG_ENDIAN, true, compressionListener);
        final byte[] compressed = compressor.compress(decompressed);

        assertEquals(src.length, compressed.length);
        for (int i = 0; i < src.length; i++) {
            assertEquals(src[i], compressed[i]);
        }
    }

    @Test
    public void testMedium() throws Exception {
        final int LENGTH = 1024 * 32;
        final byte[] bytes = new byte[LENGTH];
        for (int modulator = 1; modulator < 255; modulator += 3) {
            for (int i = 0; i < LENGTH; i++) {
                bytes[i] = (byte) (0xff & i % modulator);
            }

            compressRoundtripAndValidate(bytes);
        }
    }

    @Disabled // FIXME fails with java.io.IOException: Bad Code: -1 codes: 258 code_size: 9, table: 4096
    @Test
    public void testTiffImageData() throws IOException, ImagingException {
        final List<File> images = getTiffImages();
        for (final File image : images) {

            Debug.debug("imageFile", image);

            final ByteSource byteSource = ByteSource.file(image);
            final List<byte[]> data = new TiffImageParser().collectRawImageData(byteSource, new TiffImagingParameters());

            for (final byte[] bytes : data) {
                decompressRoundtripAndValidate(bytes);
            }
        }
    }

    @Test
    public void testTrivial() throws Exception {
        final byte[] bytes = { 0, };
        compressRoundtripAndValidate(bytes);
    }

}
