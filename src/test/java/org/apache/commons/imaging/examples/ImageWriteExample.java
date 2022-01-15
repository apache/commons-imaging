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
package org.apache.commons.imaging.examples;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.formats.tiff.TiffImageParser;
import org.apache.commons.imaging.formats.tiff.TiffImagingParameters;
import org.apache.commons.imaging.formats.tiff.constants.TiffConstants;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

public class ImageWriteExample {
    public static byte[] imageWriteExample(final File file)
            throws ImageReadException, ImageWriteException, IOException {
        // read image
        final BufferedImage image = Imaging.getBufferedImage(file);

        // set optional parameters if you like
        final TiffImagingParameters params = new TiffImagingParameters();
        params.setCompression(TiffConstants.TIFF_COMPRESSION_UNCOMPRESSED);

        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            new TiffImageParser().writeImage(image, baos, params);
            return baos.toByteArray();
        }
    }

}
