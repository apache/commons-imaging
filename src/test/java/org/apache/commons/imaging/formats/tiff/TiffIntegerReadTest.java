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
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.imaging.FormatCompliance;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImagingTestConstants;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.formats.tiff.constants.TiffConstants;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterTranscribeSample0;
import org.junit.jupiter.api.Test;

/**
 * Performs tests that access the content of TIFF files containing floating
 * point data.
 */
public class TiffIntegerReadTest {

    /**
     * Gets a file from the TIFF test directory that contains floating-point
     * data.
     *
     * @param name a valid file name
     * @return a valid file reference.
     */
    private File getTiffFile(final String name) {
        final File tiffFolder = new File(ImagingTestConstants.TEST_IMAGE_FOLDER, "tiff");
        final File fpFolder = new File(tiffFolder, "9");
        return new File(fpFolder, name);
    }


    /**
     * Read the floating-point content from a TIFF file.
     *
     * @param target the specified TIFF file
     * @param params an optional map of parameters for reading.
     * @return if successful, a valid raster data instance
     * @throws ImageReadException in the event of an unsupported or malformed
     * file data element.
     * @throws IOException in the event of an I/O error
     */
    private ImageBuilder readImageBuilderFromTIFF(
        final File target,
        final Map<String, Object> params)
        throws ImageReadException, IOException {
        final ByteSourceFile byteSource = new ByteSourceFile(target);
        final TiffReader tiffReader = new TiffReader(true);
        final TiffContents contents = tiffReader.readDirectories(
            byteSource,
            true, // indicates that application should read image data, if present
            FormatCompliance.getDefault());
        final TiffDirectory directory = contents.directories.get(0);
        return directory.getImageBuilder(params);
    }

    @Test
    public void test() {
        final Map<String, Object> params = new HashMap<>();
        PhotometricInterpreterTranscribeSample0 pi =
             new  PhotometricInterpreterTranscribeSample0(16);

         params.put(TiffConstants.PARAM_KEY_CUSTOM_PHOTOMETRIC_INTERPRETER, pi);

        try {
            File target = getTiffFile("Sample16BitIntStrips.tiff");
            ImageBuilder iBuilder = readImageBuilderFromTIFF(target, params);
            int width = iBuilder.getWidth();
            int height = iBuilder.getHeight();
            for(int i=0; i<height; i++){
                for(int j=0; j<height; j++){
                    int test = iBuilder.getSample(j, i);
                    assertEquals(test, i-j, "Value mismatch at ("+j+", "+i+")");
                }
            }


        } catch (ImageReadException | IOException ex) {
            fail("Exception during test " + ex.getMessage());
        }
    }


}
