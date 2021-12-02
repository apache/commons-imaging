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

package org.apache.commons.imaging.formats.gif;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GifReadTest extends GifBaseTest {

    public static Stream<File> data() throws Exception {
        return getGifImages().stream();
    }

    public static Stream<File> singleImageData() throws Exception {
        return getGifImagesWithSingleImage().stream();
    }

    public static Stream<File> animatedImageData() throws Exception {
        return getAnimatedGifImages().stream();
    }

    @Disabled(value = "RoundtripTest has to be fixed before implementation can throw UnsupportedOperationException")
    @ParameterizedTest
    @MethodSource("data")
    public void testMetadata(final File imageFile) {
        Assertions.assertThrows(UnsupportedOperationException.class, () -> Imaging.getMetadata(imageFile));
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testImageInfo(final File imageFile) throws Exception {
        final ImageInfo imageInfo = Imaging.getImageInfo(imageFile);
        assertNotNull(imageInfo);
        // TODO assert more
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testImageDimensions(final File imageFile) throws Exception {
        final ImageInfo imageInfo = Imaging.getImageInfo(imageFile);
        final GifImageMetadata metadata = (GifImageMetadata) Imaging.getMetadata(imageFile);
        final List<BufferedImage> images = Imaging.getAllBufferedImages(imageFile);

        int width = 0;
        int height = 0;
        for(int i = 0; i < images.size(); i++) {
            final BufferedImage image = images.get(i);
            final GifImageMetadataItem metadataItem = metadata.getItems().get(i);
            final int xOffset = metadataItem.getLeftPosition();
            final int yOffset = metadataItem.getTopPosition();
            width = Math.max(width, image.getWidth() + xOffset);
            height = Math.max(height, image.getHeight() + yOffset);
        }

        assertEquals(width, metadata.getWidth());
        assertEquals(height, metadata.getHeight());
        assertEquals(width, imageInfo.getWidth());
        assertEquals(height, imageInfo.getHeight());
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testBufferedImage(final File imageFile) throws Exception {
        final BufferedImage image = Imaging.getBufferedImage(imageFile);
        assertNotNull(image);
        // TODO assert more
    }

    @ParameterizedTest
    @MethodSource("singleImageData")
    public void testBufferedImagesForSingleImageGif(final File imageFile) throws Exception {
        final List<BufferedImage> images = Imaging.getAllBufferedImages(imageFile);
        assertEquals(1, images.size());
    }

    @ParameterizedTest
    @MethodSource("animatedImageData")
    public void testBufferedImagesForAnimatedImageGif(final File imageFile) throws Exception {
        final List<BufferedImage> images = Imaging.getAllBufferedImages(imageFile);
        assertTrue(images.size() > 1);
    }

    @Test
    public void testCreateMetadataWithDisposalMethods() {
        for(final DisposalMethod disposalMethod : DisposalMethod.values()) {
            final GifImageMetadataItem metadataItem = new GifImageMetadataItem(0, 0, 0, disposalMethod);
            Assertions.assertEquals(disposalMethod, metadataItem.getDisposalMethod());
        }
    }

    @Test
    public void testConvertValidDisposalMethodValues() throws ImageReadException {
        final DisposalMethod unspecified = GifImageParser.createDisposalMethodFromIntValue(0);
        final DisposalMethod doNotDispose = GifImageParser.createDisposalMethodFromIntValue(1);
        final DisposalMethod restoreToBackground = GifImageParser.createDisposalMethodFromIntValue(2);
        final DisposalMethod restoreToPrevious = GifImageParser.createDisposalMethodFromIntValue(3);
        final DisposalMethod toBeDefined1 = GifImageParser.createDisposalMethodFromIntValue(4);
        final DisposalMethod toBeDefined2 = GifImageParser.createDisposalMethodFromIntValue(5);
        final DisposalMethod toBeDefined3 = GifImageParser.createDisposalMethodFromIntValue(6);
        final DisposalMethod toBeDefined4 = GifImageParser.createDisposalMethodFromIntValue(7);
        Assertions.assertEquals(unspecified, DisposalMethod.UNSPECIFIED);
        Assertions.assertEquals(doNotDispose, DisposalMethod.DO_NOT_DISPOSE);
        Assertions.assertEquals(restoreToBackground, DisposalMethod.RESTORE_TO_BACKGROUND);
        Assertions.assertEquals(restoreToPrevious, DisposalMethod.RESTORE_TO_PREVIOUS);
        Assertions.assertEquals(toBeDefined1, DisposalMethod.TO_BE_DEFINED_1);
        Assertions.assertEquals(toBeDefined2, DisposalMethod.TO_BE_DEFINED_2);
        Assertions.assertEquals(toBeDefined3, DisposalMethod.TO_BE_DEFINED_3);
        Assertions.assertEquals(toBeDefined4, DisposalMethod.TO_BE_DEFINED_4);
    }

    @Test
    public void testConvertInvalidDisposalMethodValues() {
        Assertions.assertThrows(ImageReadException.class, () -> GifImageParser.createDisposalMethodFromIntValue(8));
    }

    /**
     * The GIF image data may lead to out of bound array access. This
     * test verifies that we handle that case and raise an appropriate
     * exception.
     *
     * <p>See Google OSS Fuzz issue 33501</p>
     *
     * @throws IOException if it fails to read the test image
     */
    @Test
    public void testUncaughtExceptionOssFuzz33501() throws IOException {
        final String input = "/images/gif/oss-fuzz-33501/clusterfuzz-testcase-minimized-ImagingGifFuzzer-5914278319226880";
        final String file = GifReadTest.class.getResource(input).getFile();
        final GifImageParser parser = new GifImageParser();
        assertThrows(ImageReadException.class, () -> parser.getBufferedImage(new ByteSourceFile(new File(file)), new GifImagingParameters()));
    }

    /**
     * The GIF image Lzw compression may contain a table with length inferior to
     * the length of entries in the image data. Which results in an ArrayOutOfBoundsException.
     * This verifies that instead of throwing an AOOBE, we are handling the case and
     * informing the user why the parser failed to read it, by throwin an ImageReadException
     * with a more descriptive message.
     *
     * <p>See Google OSS Fuzz issue 33464</p>
     *
     * @throws IOException if it fails to read the test image
     */
    @Test
    public void testUncaughtExceptionOssFuzz33464() throws IOException {
        final String input = "/images/gif/oss-fuzz-33464/clusterfuzz-testcase-minimized-ImagingGifFuzzer-5174009164595200";
        final String file = GifReadTest.class.getResource(input).getFile();
        final GifImageParser parser = new GifImageParser();
        assertThrows(ImageReadException.class, () -> parser.getBufferedImage(new ByteSourceFile(new File(file)), new GifImagingParameters()));
    }

    /**
     * Test that invalid indexes are validated when accessing GIF color table array.
     *
     * <p>See Google OSS Fuzz issue 34185</p>
     *
     * @throws IOException if it fails to read the test image
     */
    @Test
    public void testUncaughtExceptionOssFuzz34185() throws IOException {
        final String input = "/images/gif/IMAGING-318/clusterfuzz-testcase-minimized-ImagingGifFuzzer-5005192379629568";
        final String file = GifReadTest.class.getResource(input).getFile();
        final GifImageParser parser = new GifImageParser();
        assertThrows(ImageReadException.class, () -> parser.getBufferedImage(new ByteSourceFile(new File(file)), new GifImagingParameters()));
    }
}
