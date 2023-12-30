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

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.formats.tiff.constants.TiffConstants;
import org.apache.commons.imaging.internal.Debug;
import org.junit.jupiter.api.Test;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Param;

public class TiffRoundtripTest extends TiffBaseTest {

    @Test
    public void test() throws Exception {
        int numThreads = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newFixedThreadPool(numThreads);

        final List<File> images = getTiffImages();
        for (final File imageFile : images) {

            Debug.debug("imageFile", imageFile);

            final ImageMetadata metadata = Imaging.getMetadata(imageFile);
            assertNotNull(metadata);

            final ImageInfo imageInfo = Imaging.getImageInfo(imageFile);
            assertNotNull(imageInfo);



            final TiffImageParser tiffImageParser = new TiffImageParser();

            final int[] compressions = {
                    TiffConstants.TIFF_COMPRESSION_UNCOMPRESSED,
                    TiffConstants.TIFF_COMPRESSION_LZW,
                    TiffConstants.TIFF_COMPRESSION_PACKBITS,
                    TiffConstants.TIFF_COMPRESSION_DEFLATE_ADOBE
            };
            executorService.submit(() -> {

                final BufferedImage image;
                try {
                    image = Imaging.getBufferedImage(imageFile);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                assertNotNull(image);

                for (final int compression : compressions) {
                    try {
                        final byte[] tempFile;
                        final TiffImagingParameters params = new TiffImagingParameters();
                        params.setCompression(compression);

                        try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
                            tiffImageParser.writeImage(image, bos, params);
                            tempFile = bos.toByteArray();
                        }

                        final BufferedImage image2 = Imaging.getBufferedImage(tempFile);
                        assertNotNull(image2);
                    } catch (IOException e) {
                        // Handle exception as needed
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    @Benchmark
    public void processUncompressed() throws Exception {
        int[] compressions = {TiffConstants.TIFF_COMPRESSION_UNCOMPRESSED};
        runTest(compressions);
    }

    @Benchmark
    public void processLzw() throws Exception {
        int[] compressions = {TiffConstants.TIFF_COMPRESSION_LZW};
        runTest(compressions);
    }

    @Benchmark
    public void processPackbits() throws Exception {
        int[] compressions = {TiffConstants.TIFF_COMPRESSION_PACKBITS};
        runTest(compressions);
    }

    @Benchmark
    public void processDeflateAdobe() throws Exception {
        int[] compressions = {TiffConstants.TIFF_COMPRESSION_DEFLATE_ADOBE};
        runTest(compressions);
    }

    private void runTest(int[] compressions) throws IOException {
        final List<File> images = getTiffImages();


        int numThreads = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newFixedThreadPool(numThreads);

        for (final File imageFile : images) {

            Debug.debug("imageFile", imageFile);

            final ImageMetadata metadata = Imaging.getMetadata(imageFile);
            assertNotNull(metadata);

            final ImageInfo imageInfo = Imaging.getImageInfo(imageFile);
            assertNotNull(imageInfo);

            final BufferedImage image = Imaging.getBufferedImage(imageFile);
            assertNotNull(image);

            final TiffImageParser tiffImageParser = new TiffImageParser();
            executorService.submit(() -> {

                for (final int compression : compressions) {
                    try {
                        final byte[] tempFile;
                        final TiffImagingParameters params = new TiffImagingParameters();
                        params.setCompression(compression);

                        try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
                            tiffImageParser.writeImage(image, bos, params);
                            tempFile = bos.toByteArray();
                        }

                        final BufferedImage image2 = Imaging.getBufferedImage(tempFile);
                        assertNotNull(image2);
                    } catch (IOException e) {
                        // Handle exception as needed
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
