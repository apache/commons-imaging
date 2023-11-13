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

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import org.apache.commons.imaging.Imaging;

import org.apache.commons.imaging.ImagingTestConstants;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Reads files in the BigTIFF samples folder and compares the
 * BigTIFF files against the standard "classic" tiff image.
 */
public class TiffJpegTest extends TiffBaseTest {

    static final String[] testSet0 = {
        "TestSample.tiff",
        "TestJpegStrips.tiff",
        "TestJpegTiles.tiff",
        "TestJpegStripsRgb.tiff",
        "TestJpegTilesRgb.tiff",
        "TestJpegCMYK.tiff",};

    static final String[] testSet1 = {
        "TestSample264x264.tiff",
        "TestJpegStrips264x264.tiff",
        "TestJpegStrips264x264BigEndian.tiff",
        "TestJpegTiles264x264.tiff",
        "TestJpegTiles264x264BigEndian.tiff",};

    static final String[] testSet2 = {
        "TestSampleArgb.tiff",
        "TestJpegArgb.tiff",};

    private File getTiffFile(String name) {
        final File tiffFolder = new File(ImagingTestConstants.TEST_IMAGE_FOLDER, "tiff");
        final File tiffJpegFolder = new File(tiffFolder, "14");
        return new File(tiffJpegFolder, name);
    }

    private int gray(int argb) {
        int r = (argb >> 16) & 0xff;
        int g = (argb >> 8) & 0xff;
        int b = argb & 0xff;
        return (int) (0.299 * r + 0.587 * g + 0.114 * b + 0.5);
    }

    /**
     * Process a set of files using the first name in the array as
     * the master image and comparing all subsequent files against its
     * content on a pixel-by-pixel bases. The first name will usually be
     * a TIFF file that is stored using a non-lossy compression format
     * (something other than JPEG). All subsequent files will use
     * JPEG based compression with an alternate geometry (strips, tiles, etc.).
     * Because JPEG is lossy, we define a match as values of pixels that
     * produce gray tones withing a threshold.
     *
     * @param testSet an array of 2 or more TIFF file names
     * @throws IOException in the event of an unexpected I/O exception
     */
    private void processTestSet(String[] testSet) throws IOException {
        File masterFile = getTiffFile(testSet[0]);
        BufferedImage masterImage = Imaging.getBufferedImage(masterFile);
        int w = masterImage.getWidth();
        int h = masterImage.getHeight();
        int[] masterArgb = new int[w * h];
        masterImage.getRGB(0, 0, w, h, masterArgb, 0, w);

        int[] masterGray = new int[w * h];
        for (int i = 0; i < masterArgb.length; i++) {
            masterGray[i] = gray(masterArgb[i]);
        }

        for (int iFile = 1; iFile < testSet.length; iFile++) {
            String name = testSet[iFile];
            File f = getTiffFile(name);
            BufferedImage test = Imaging.getBufferedImage(f);
            int testW = test.getWidth();
            int testH = test.getHeight();
            assertEquals(w, testW, "Width mismatch for " + name);
            assertEquals(h, testH, "Height mismatch for " + name);

            String label = "Pixel match for " + name;
            int[] testArgb = new int[w * h];
            test.getRGB(0, 0, w, h, testArgb, 0, w);
            for (int i = 0; i < testArgb.length; i++) {
                int testGray = gray(testArgb[i]);
                int masterA = masterArgb[i] >>> 24;
                int testA = testArgb[i] >>> 24;
                assertEquals(masterA, testA, 1, label);
                assertEquals(masterGray[i], testGray, 4, label);
            }
        }
    }

    void performSubImageTest(String name) throws IOException {
        // get the full image to be used as a basis for comparison
        File target = getTiffFile(name);
        BufferedImage master = Imaging.getBufferedImage(target);
        int w = master.getWidth();
        int h = master.getHeight();
        int[] masterArgb = new int[w * h];
        master.getRGB(0, 0, w, h, masterArgb, 0, w);

        // Get a subimage
        TiffImageParser tiffImageParser = new TiffImageParser();
        TiffImagingParameters params = new TiffImagingParameters();
        int testX0 = 11;
        int testY0 = 11;
        int testW = w - testX0 - 1;
        int testH = h - testY0 - 1;
        params.setSubImage(testX0, testY0, testW, testH);

        BufferedImage test = tiffImageParser.getBufferedImage(target, params);
        int[] testArgb = new int[testW * testH];
        test.getRGB(0, 0, testW, testH, testArgb, 0, testW);
        String label = "Pixel mismatch for " + name;
        for (int i = 0; i < testH; i++) {
            for (int j = 0; j < testH; j++) {
                int masterIndex = (i + testY0) * w + (j + testX0);
                int testIndex = i * testW + j;
                int masterPixel = masterArgb[masterIndex];
                int testPixel = testArgb[testIndex];
                assertEquals(masterPixel, testPixel, label);
            }
        }

    }

    /**
     * Verify that TIFF files using JPEG compression provide a pixel-by-pixel
     * match with source files that use a lossless compression.
     */
    @Test
    public void testFullPixelMatch() throws IOException {

        // testSet1 is more comprehensive than testSet0 and
        // would be sufficient to cover all cases.  The test files for testSet0
        // are simpler and might be more useful for debugging
        processTestSet(testSet0);
        processTestSet(testSet1);

        // test set 2 includes a TIFF-specific alpha channel
        processTestSet(testSet2);
    }

    /**
     * Verify that a sub-image extraction supports a pixel-by-pixel match
     * with the full image extraction.
     */
    @Test
    public void testSubImage() throws IOException {
        performSubImageTest("TestJpegProgressive.tiff"); // strips
        performSubImageTest("TestJpegTiles264x264.tiff"); // tiles
    }

}
