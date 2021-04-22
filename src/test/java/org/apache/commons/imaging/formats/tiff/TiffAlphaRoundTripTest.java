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
import static org.junit.jupiter.api.Assertions.fail;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteOrder;
import java.nio.file.Path;

import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSet;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * Performs a round-trip that writes an image containing Alpha and then reads it
 * back.
 * Selected non-opaque pixels are tested for correctness,
 */
public class TiffAlphaRoundTripTest {

    @TempDir
    Path tempDir;

    @Test
    public void test() throws Exception {

        // This test will exercise two passes to test the implementation
        // of the TIFF support for writing and reading images containing
        // an alpha channel.  In the first pass, the alpha writing is enabled
        // in the second pass it is suppressed.
        for (int i = 0; i < 2; i++) {
            // Step 0, create a buffered image that includes transparency
            // in the form of two rectangles, one completely opaque,
            // and one giving 50 percent opaque red.
            final int width = 400;
            final int height = 400;
            BufferedImage image0;
            if (i == 0) {
                image0 = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            } else {
                image0 = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            }
            Graphics2D g2d = image0.createGraphics();
            g2d.setColor(Color.red);
            g2d.fillRect(0, 0, width, height);
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC));
            g2d.setColor(new Color(0, 0, 0, 0));
            g2d.fillRect(100, 100, 100, 100);
            g2d.setColor(new Color(0xff, 0, 0, 0x80));
            g2d.fillRect(200, 200, 100, 100);

            // Step 1: write the Buffered Image to an output file and
            //         then read it back in.  This action will test the
            //         correctness of a round-trip test.
            final File file = new File(tempDir.toFile(), "TiffAlphaRoundTripTest.tif");
            file.delete();
            Imaging.writeImage(image0, file, new TiffImagingParameters());
            final BufferedImage image1 = Imaging.getBufferedImage(file);

            // Step 2:  create a composite image overlaying a white background
            //          with the results from the TIFF file.
            final BufferedImage compImage
                = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            g2d = compImage.createGraphics();
            g2d.setColor(Color.white);
            g2d.fillRect(0, 0, width, height);
            g2d.drawImage(image1, 0, 0, null);

            // Step 3, verify that the correct values are in the image.
            final int test1 = compImage.getRGB(150, 150); // in the transparent rectangle
            final int test2 = compImage.getRGB(250, 250);
            if (i == 0) {
                doPixelsMatch(150, 150, 0xffffffff, test1);
                doPixelsMatch(250, 250, 0xffff7f7f, test2);
            } else {
                doPixelsMatch(151, 151, 0xff000000, test1);
                doPixelsMatch(251, 251, 0xffff0000, test2);
            }
        }
    }

    void doPixelsMatch(final int x, final int y, final int a, final int b) {
        if (!componentMatch(a, b, 0, 2)
            || !componentMatch(a, b, 8, 2)
            || !componentMatch(a, b, 16, 2)
            || !componentMatch(a, b, 24, 2)) {

            final String complaint = String.format("Pixel mismatch at (%d,%d): 0x%08x 0x%08x",
                x, y, a, b);
            fail(complaint);
        }
    }

    /**
     * Checks to see if a pixel component (A, R, G, or B) for two specified
     * values are within a specified tolerance.
     *
     * @param a the first value
     * @param b the second value
     * @param iShift a multiple of 8 telling how far to shift values
     * to extract components (24, 16, 8, or zero for ARGB)
     * @param iTolerance a small positive integer
     * @return true if the components of the values match
     */
    boolean componentMatch(final int a, final int b, final int iShift, final int iTolerance) {
        int delta = ((a >> iShift) & 0xff) - ((b >> iShift) & 0xff);
        if (delta < 0) {
            delta = -delta;
        }
        return delta < iTolerance;
    }

    @Test
    void testExtraSamples() throws Exception{

        final int bytesPerSample = 4;
        final int width = 10;
        final int height = 10;
        final int nBytesPerStrip = bytesPerSample * height * width;
        final ByteOrder byteOrder = ByteOrder.nativeOrder();

        int[] samples = new int[width * height];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int index = i * width + j;
                samples[index] = j > i ? 0xffff0000 : 0x88ff0000;
            }
        }

        for (int iExtra = 0; iExtra < 3; iExtra++) {
            final TiffOutputSet outputSet = new TiffOutputSet(byteOrder);
            final TiffOutputDirectory outDir = outputSet.addRootDirectory();
            outDir.add(TiffTagConstants.TIFF_TAG_IMAGE_WIDTH, width);
            outDir.add(TiffTagConstants.TIFF_TAG_IMAGE_LENGTH, height);
            outDir.add(TiffTagConstants.TIFF_TAG_SAMPLES_PER_PIXEL, (short) 4);
            outDir.add(TiffTagConstants.TIFF_TAG_BITS_PER_SAMPLE, new short[]{8, 8, 8, 8});
            outDir.add(TiffTagConstants.TIFF_TAG_PHOTOMETRIC_INTERPRETATION,
                    (short) TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_RGB);
            outDir.add(TiffTagConstants.TIFF_TAG_COMPRESSION,
                    (short) TiffTagConstants.COMPRESSION_VALUE_UNCOMPRESSED);
            outDir.add(TiffTagConstants.TIFF_TAG_PLANAR_CONFIGURATION,
                    (short) TiffTagConstants.PLANAR_CONFIGURATION_VALUE_CHUNKY);
            outDir.add(TiffTagConstants.TIFF_TAG_ROWS_PER_STRIP, height);
            outDir.add(TiffTagConstants.TIFF_TAG_STRIP_BYTE_COUNTS, nBytesPerStrip);

            outDir.add(TiffTagConstants.TIFF_TAG_EXTRA_SAMPLES, (short) iExtra);

            final byte[] b = new byte[nBytesPerStrip];
            int k = 0;
            for (int sample : samples) {
                b[k++] = (byte) ((sample >> 16) & 0xff);  // R
                b[k++] = (byte) ((sample >> 8) & 0xff);   // G
                b[k++] = (byte) (sample & 0xff);          // B
                b[k++] = (byte) ((sample >> 24) & 0xff);  // A
            }

            final TiffElement.DataElement[] imageData = new TiffElement.DataElement[1];
            imageData[0] = new TiffImageData.Data(0, b.length, b);

            TiffImageData tiffImageData
                = new TiffImageData.Strips(imageData, height);

            outDir.setTiffImageData(tiffImageData);

            final File outputFile = new File(tempDir.toFile(), "TestExtraSamples" + iExtra + ".tiff");
            try (FileOutputStream fos = new FileOutputStream(outputFile);
                    BufferedOutputStream bos = new BufferedOutputStream(fos)) {
                final TiffImageWriterLossy writer = new TiffImageWriterLossy(byteOrder);
                writer.write(bos, outputSet);
                bos.flush();
            }

            BufferedImage result = Imaging.getBufferedImage(outputFile);
            int []argb = new int[samples.length];
            result.getRGB(0, 0, width, height, argb, 0, width);
            int index = 3*width+1;
            int iSample = samples[index];
            int iArgb   = argb[index];
            if (iExtra == 0) {
                // when extra samples is zero, the alpha channel is ignored.
                // We expect ARGB to start with 0xff.  So we OR in 0xff for
                // the alpha value of the sample
                iSample |= 0xff000000;
            } else if (iExtra==1) {
                // The pre-multiply alpha case
                iSample = 0x89de0000;
            }
            String p = String.format("%08x", iSample);
            String q = String.format("%08x", iArgb);
            assertEquals(p, q, "Failure on ExtraSamples="+iExtra);
        }
    }
}
