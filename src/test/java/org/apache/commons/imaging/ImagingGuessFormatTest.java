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

package org.apache.commons.imaging;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Stream;

import org.apache.commons.io.FilenameUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ImagingGuessFormatTest extends ImagingTest {

    public static final String BMP_IMAGE_FILE = "bmp\\1\\Oregon Scientific DS6639 - DSC_0307 - small.bmp";
    public static final String PNG_IMAGE_FILE = "png\\1\\Oregon Scientific DS6639 - DSC_0307 - small.png";
    public static final String GIF_IMAGE_FILE = "gif\\single\\1\\Oregon Scientific DS6639 - DSC_0307 - small.gif";
    public static final String ICNS_IMAGE_FILE = "icns\\1\\poedit48x48.icns";
    public static final String ICO_IMAGE_FILE = "ico\\1\\Oregon Scientific DS6639 - DSC_0307 - small.ico";
    public static final String TIFF_IMAGE_FILE = "tiff\\1\\Oregon Scientific DS6639 - DSC_0307 - small.tif";
    public static final String JPEG_IMAGE_FILE = "jpg\\1\\Oregon Scientific DS6639 - DSC_0307 - small.jpg";
    public static final String PSD_IMAGE_FILE = "psd\\1\\Oregon Scientific DS6639 - DSC_0307 - small.psd";
    public static final String PBM_IMAGE_FILE = "pbm\\1\\Oregon Scientific DS6639 - DSC_0307 - small.pbm";
    public static final String PGM_IMAGE_FILE = "pbm\\1\\Oregon Scientific DS6639 - DSC_0307 - small.pgm";
    public static final String PPM_IMAGE_FILE = "pbm\\1\\Oregon Scientific DS6639 - DSC_0307 - small.ppm";
    public static final String TGA_IMAGE_FILE = "tga\\1\\Oregon Scientific DS6639 - DSC_0307 - small.tga";
    public static final String UNKNOWN_IMAGE_FILE = "info.txt";

    public static Stream<Object[]> data() {
        return Arrays.asList(
                new Object[] { ImageFormats.PNG, PNG_IMAGE_FILE },
                new Object[] { ImageFormats.GIF, GIF_IMAGE_FILE },
                new Object[] { ImageFormats.ICNS, ICNS_IMAGE_FILE },
                // TODO(cmchen): add ability to sniff ICOs if possible.
                // new Object[] { ImageFormat.IMAGE_FORMAT_ICO, ICO_IMAGE_FILE },
                new Object[] { ImageFormats.TIFF, TIFF_IMAGE_FILE },
                new Object[] { ImageFormats.JPEG, JPEG_IMAGE_FILE },
                new Object[] { ImageFormats.BMP, BMP_IMAGE_FILE },
                new Object[] { ImageFormats.PSD, PSD_IMAGE_FILE },
                new Object[] { ImageFormats.PBM, PBM_IMAGE_FILE },
                new Object[] { ImageFormats.PGM, PGM_IMAGE_FILE },
                new Object[] { ImageFormats.PPM, PPM_IMAGE_FILE },
                // TODO(cmchen): add ability to sniff TGAs if possible.
                // new Object[] { ImageFormat.IMAGE_FORMAT_TGA, TGA_IMAGE_FILE },
                // TODO(cmchen): Add test images for these formats.
                // new Object[] { ImageFormat.IMAGE_FORMAT_PNM, PNM_IMAGE_FILE },
                // new Object[] { ImageFormat.IMAGE_FORMAT_JBIG2, JBIG2_IMAGE_FILE },
                new Object[] { ImageFormats.UNKNOWN, UNKNOWN_IMAGE_FILE }
        ).stream();
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testGuessFormat(ImageFormats expectedFormat, String pathToFile) throws Exception {
        final String imagePath = FilenameUtils.separatorsToSystem(pathToFile);
        final File imageFile = new File(ImagingTestConstants.TEST_IMAGE_FOLDER, imagePath);

        final ImageFormat guessedFormat = Imaging.guessFormat(imageFile);
        assertEquals(expectedFormat, guessedFormat);
    }

}
