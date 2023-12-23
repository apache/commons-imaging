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

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingTestConstants;
import org.junit.jupiter.api.Test;

/**
 * Reads files in the BigTIFF samples folder and compares the BigTIFF files against the standard "classic" tiff image.
 */
public class TiffJpegTest extends TiffBaseTest {

    static final String[] testSet0 = { "TestSample.tiff", "TestJpegStrips.tiff", "TestJpegTiles.tiff", "TestJpegStripsRgb.tiff", "TestJpegTilesRgb.tiff",
            "TestJpegCMYK.tiff" };

    static final String[] testSet1 = { "TestSample264x264.tiff", "TestJpegStrips264x264.tiff", "TestJpegStrips264x264BigEndian.tiff",
            "TestJpegTiles264x264.tiff", "TestJpegTiles264x264BigEndian.tiff" };

    static final String[] testSet2 = { "TestSampleArgb.tiff", "TestJpegArgb.tiff" };

    static final String[] testSet3 = { "TestSampleRgb127x127.tiff", "TestJpegRgb127x127.tiff" };

    private File getTiffFile(final String name) {
        final File tiffFolder = new File(ImagingTestConstants.TEST_IMAGE_FOLDER, "tiff");
        final File tiffJpegFolder = new File(tiffFolder, "14");
        return new File(tiffJpegFolder, name);
    }

    private int gray(final int argb) {
        final int r = argb >> 16 & 0xff;
        final int g = argb >> 8 & 0xff;
        final int b = argb & 0xff;
        return (int) (0.299 * r + 0.587 * g + 0.114 * b + 0.5);
    }

    void performSubImageTest(final String name) throws IOException {
        // get the full image to be used as a basis for comparison
        final File target = getTiffFile(name);
        final BufferedImage master = Imaging.getBufferedImage(target);
        final int w = master.getWidth();
        final int h = master.getHeight();
        final int[] masterArgb = new int[w * h];
        master.getRGB(0, 0, w, h, masterArgb, 0, w);

        // Get a subimage
        final TiffImageParser tiffImageParser = new TiffImageParser();
        final TiffImagingParameters params = new TiffImagingParameters();
        final int testX0 = 11;
        final int testY0 = 11;
        final int testW = w - testX0 - 1;
        final int testH = h - testY0 - 1;
        params.setSubImage(testX0, testY0, testW, testH);

        final BufferedImage test = tiffImageParser.getBufferedImage(target, params);
        final int[] testArgb = new int[testW * testH];
        test.getRGB(0, 0, testW, testH, testArgb, 0, testW);
        final String label = "Pixel mismatch for " + name;
        for (int i = 0; i < testH; i++) {
            for (int j = 0; j < testH; j++) {
                final int masterIndex = (i + testY0) * w + j + testX0;
                final int testIndex = i * testW + j;
                final int masterPixel = masterArgb[masterIndex];
                final int testPixel = testArgb[testIndex];
                assertEquals(masterPixel, testPixel, label);
            }
        }

    }

    /**
     * Process a set of files using the first name in the array as the master image and comparing all subsequent files against its content on a pixel-by-pixel
     * bases. The first name will usually be a TIFF file that is stored using a non-lossy compression format (something other than JPEG). All subsequent files
     * will use JPEG based compression with an alternate geometry (strips, tiles, etc.). Because JPEG is lossy, we define a match as values of pixels that
     * produce gray tones withing a threshold.
     *
     * @param testSet an array of 2 or more TIFF file names
     * @throws IOException in the event of an unexpected I/O exception
     */
    private void processTestSet(final String[] testSet) throws IOException {
        final File masterFile = getTiffFile(testSet[0]);
        final BufferedImage masterImage = Imaging.getBufferedImage(masterFile);
        final int w = masterImage.getWidth();
        final int h = masterImage.getHeight();
        final int[] masterArgb = new int[w * h];
        masterImage.getRGB(0, 0, w, h, masterArgb, 0, w);

        final int[] masterGray = new int[w * h];
        for (int i = 0; i < masterArgb.length; i++) {
            masterGray[i] = gray(masterArgb[i]);
        }

        for (int iFile = 1; iFile < testSet.length; iFile++) {
            final String name = testSet[iFile];
            final File f = getTiffFile(name);
            final BufferedImage test = Imaging.getBufferedImage(f);
            final int testW = test.getWidth();
            final int testH = test.getHeight();
            assertEquals(w, testW, "Width mismatch for " + name);
            assertEquals(h, testH, "Height mismatch for " + name);

            final String label = "Pixel match for " + name;
            final int[] testArgb = new int[w * h];
            test.getRGB(0, 0, w, h, testArgb, 0, w);
            for (int i = 0; i < testArgb.length; i++) {
                final int testGray = gray(testArgb[i]);
                final int masterA = masterArgb[i] >>> 24;
                final int testA = testArgb[i] >>> 24;
                assertEquals(masterA, testA, 1, label);
                assertEquals(masterGray[i], testGray, 4, label);
            }
        }
    }

    /**
     * Verify that TIFF files using JPEG compression provide a pixel-by-pixel match with source files that use a lossless compression.
     */
    @Test
    public void testFullPixelMatch() throws IOException {

        // testSet1 is more comprehensive than testSet0 and
        // would be sufficient to cover all cases. The test files for testSet0
        // are simpler and might be more useful for debugging
        processTestSet(testSet0);
        processTestSet(testSet1);

        // test set 2 includes a TIFF-specific alpha channel
        processTestSet(testSet2);

        // test set 3 includes an add-valued width and height that does
        // not evently fit a block of JPEG data. It is used to test
        // for the proper handling of edge-cases.
        processTestSet(testSet3);
    }

    /**
     * Verify that a sub-image extraction supports a pixel-by-pixel match with the full image extraction.
     */
    @Test
    public void testSubImage() throws IOException {
        performSubImageTest("TestJpegProgressive.tiff"); // strips
        performSubImageTest("TestJpegTiles264x264.tiff"); // tiles
        performSubImageTest("TestJpegRgb127x127.tiff");
    }

}
