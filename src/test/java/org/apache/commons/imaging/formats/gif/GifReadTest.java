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
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;
import java.util.stream.Stream;

import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.Imaging;
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

    @Disabled(value = "RoundtripTest has to be fixed befor implementation can throw UnsupportedOperationException")
    @ParameterizedTest
    @MethodSource("data")
    public void testMetadata(File imageFile) throws Exception {
        Assertions.assertThrows(UnsupportedOperationException.class, () -> {
            Imaging.getMetadata(imageFile);
        });
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testImageInfo(File imageFile) throws Exception {
        final ImageInfo imageInfo = Imaging.getImageInfo(imageFile);
        assertNotNull(imageInfo);
        // TODO assert more
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testImageDimensions(File imageFile) throws Exception {
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
    public void testBufferedImage(File imageFile) throws Exception {
        final BufferedImage image = Imaging.getBufferedImage(imageFile);
        assertNotNull(image);
        // TODO assert more
    }

    @ParameterizedTest
    @MethodSource("singleImageData")
    public void testBufferedImagesForSingleImageGif(File imageFile) throws Exception {
        final List<BufferedImage> images = Imaging.getAllBufferedImages(imageFile);
        assertTrue(images.size() == 1);
    }

    @ParameterizedTest
    @MethodSource("animatedImageData")
    public void testBufferedImagesForAnimatedImageGif(File imageFile) throws Exception {
        final List<BufferedImage> images = Imaging.getAllBufferedImages(imageFile);
        assertTrue(images.size() > 1);
    }

    @Test
    public void testCreateMetadataWithDisposalMethods() {
        for(DisposalMethod disposalMethod : DisposalMethod.values()) {
            GifImageMetadataItem metadataItem = new GifImageMetadataItem(0, 0, 0, disposalMethod);
            Assertions.assertEquals(disposalMethod, metadataItem.getDisposalMethod());
        }
    }

    @Test
    public void testConvertValidDisposalMethodValues() throws ImageReadException {
        DisposalMethod unspecified = GifImageParser.createDisposalMethodFromIntValue(0);
        DisposalMethod doNotDispose = GifImageParser.createDisposalMethodFromIntValue(1);
        DisposalMethod restoreToBackground = GifImageParser.createDisposalMethodFromIntValue(2);
        DisposalMethod restoreToPrevious = GifImageParser.createDisposalMethodFromIntValue(3);
        DisposalMethod toBeDefined1 = GifImageParser.createDisposalMethodFromIntValue(4);
        DisposalMethod toBeDefined2 = GifImageParser.createDisposalMethodFromIntValue(5);
        DisposalMethod toBeDefined3 = GifImageParser.createDisposalMethodFromIntValue(6);
        DisposalMethod toBeDefined4 = GifImageParser.createDisposalMethodFromIntValue(7);
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
}
