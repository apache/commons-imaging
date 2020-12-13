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
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.formats.tiff.constants.TiffConstants;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntryForRange;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntryForValue;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PhotometricInterpreterFloat;
import org.junit.jupiter.api.Test;

/**
 * Performs tests that access the content of TIFF files containing floating
 * point data.
 */
public class TiffFloatingPointReadTest {

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
     * Read a TIFF file using a PhotometricInterpreter with entries for the
     * specified range of values and an arbitrary no-data value. If the image is
     * successfully read, the interpreter instance will be returned.
     *
     * @param target the specified TIFF file
     * @param f0 the expected minimum bound or lower
     * @param f1 the expected maximum bound or higher
     * @param fNot an arbitrary non-data value or NaN
     * @return if successful, a valid photometric interpreter.
     * @throws ImageReadException in the event of an unsupported or malformed
     * file data element.
     * @throws IOException in the event of an I/O error
     */
    private PhotometricInterpreterFloat readAndInterpretTIFF(
        final File target, final float f0, final float f1, final float fNot) throws ImageReadException, IOException {
        final ByteSourceFile byteSource = new ByteSourceFile(target);
        final TiffReader tiffReader = new TiffReader(true);
        final TiffContents contents = tiffReader.readDirectories(
            byteSource,
            true, // indicates that application should read image data, if present
            FormatCompliance.getDefault());
        final ByteOrder byteOrder = tiffReader.getByteOrder();
        final TiffDirectory directory = contents.directories.get(0);
        if (!directory.hasTiffFloatingPointRasterData()) {
            fail("Internal error, sample file does not have floating-point data "
                + target.getName());
        }
        final List<PaletteEntry> pList = new ArrayList<>();
        pList.add(new PaletteEntryForValue(fNot, Color.red));
        pList.add(new PaletteEntryForRange(f0, f1, Color.black, Color.white));
        final PhotometricInterpreterFloat pInterp = new PhotometricInterpreterFloat(pList);
        final HashMap<String, Object> params = new HashMap<>();
        params.put(TiffConstants.PARAM_KEY_CUSTOM_PHOTOMETRIC_INTERPRETER, pInterp);
        final BufferedImage bImage = directory.getTiffImage(byteOrder, params);
        if (bImage == null) {
            return null;
        }
        return pInterp;
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
    private TiffRasterData readRasterFromTIFF(
        final File target, final Map<String, Object> params)
        throws ImageReadException, IOException {
        final ByteSourceFile byteSource = new ByteSourceFile(target);
        final TiffReader tiffReader = new TiffReader(true);
        final TiffContents contents = tiffReader.readDirectories(
            byteSource,
            true, // indicates that application should read image data, if present
            FormatCompliance.getDefault());
        final TiffDirectory directory = contents.directories.get(0);
        return directory.getFloatingPointRasterData(params);
    }

    @Test
    public void test() {
        final Map<String, Object> params = new HashMap<>();
        // These TIFF sample data includes files that contain known
        // floating-point values in various formats.  We know the range
        // of values from inspection using separate utilies. This
        // test verifies that the data can be fetched successfully.
        //   Note that when evaluating the range of values in a TIFF file,
        // the photometric interpreter does not include the special no-data
        // code in the tabulation.  If you have a file that does not
        // define a no-data value, just use Float.NaN for testing purposes.
        try {
            // Test the satellite-derived cloud imagery file -----------------------------
            // We know from inspection that this sample file contains values
            // in the range 0 to 1 and uses 9999 as a "no-data" value.
            File target = getTiffFile("Sample64BitFloatingPointPix451x337.tiff");
            PhotometricInterpreterFloat pInterp = readAndInterpretTIFF(target, 0f, 1f, 9999f);
            if (pInterp == null) {
                fail("Failed to read image " + target.getAbsolutePath());
            }
            float minVal = pInterp.getMinFound();
            float maxVal = pInterp.getMaxFound();
            boolean testCondition = 0.0 <= minVal && minVal <= 1.0 && 0.0 <= maxVal && maxVal <= 1.0;
            assertTrue(testCondition, "Min,Max values not in range 0 to 1: " + minVal + ", " + maxVal);
            assertTrue(minVal <= maxVal, "Min Value not <= maxVal: " + minVal + ", " + maxVal);

            // To test the sub-image logic, read the full raster and then
            // the sub-raster.  Compare the results.  We know from inspection
            // that the source file is organized using strips of 2 rows each.
            // The source file is of dimensions 451x337.
            // The dimensions of the sub-image are arbitrary
            TiffRasterData fullRaster = readRasterFromTIFF(target, null);
            int height = fullRaster.getHeight();
            int width  = fullRaster.getWidth();
            // checks based on the 2-rows per strip model
            checkSubImage(target, fullRaster, 17, 17, 200, 200);
            checkSubImage(target, fullRaster, 1, 3, width-2, 1);
            checkSubImage(target, fullRaster, 1, 3, width-2, 3);
            checkSubImage(target, fullRaster, 1, 4, width-2, 1);
            checkSubImage(target, fullRaster, 1, 4, width-2, 3);
            // check the 4 edges
            checkSubImage(target, fullRaster, 0, 0, width, 1);         // bottom row
            checkSubImage(target, fullRaster, 0, 0, 1, height);        // left column
            checkSubImage(target, fullRaster, 0, height-1, width, 1);  // top row
            checkSubImage(target, fullRaster, width-1, 0, 1, height);  // right column

            // test along the main diagnonal and a parallel that reaches the top-right corner
            final int s = width-height;
            for(int i=0; i<height-8; i++){
                checkSubImage(target, fullRaster, i, i, 8, 8);
                checkSubImage(target, fullRaster, i+1, i, 8, 8);
            }

            // now read the entire image
            checkSubImage(target, fullRaster, 0, 0, width, height);

            // Test the USGS overview file ------------------------------
            // We know from inspection that this sample file contains values
            // in the range -2 to 62 and uses -99999 as a "no-data" value.
            // The file is organized using tiles of size 128-by-128.
            // and that the overall image size is 338-by-338.
            target = getTiffFile("USGS_13_n38w077_dir5.tiff");
            pInterp = readAndInterpretTIFF(target, -2f, 62f, -99999f);
            if (pInterp == null) {
                fail("Failed to read image " + target.getAbsolutePath());
            }
            minVal = pInterp.getMinFound();
            maxVal = pInterp.getMaxFound();
            testCondition = -2 <= minVal && minVal <= 62 && -2 <= maxVal && maxVal <= 62;
            assertTrue(testCondition, "Min,Max values not in range -2 to 62: " + minVal + ", " + maxVal);
            assertTrue(minVal <= maxVal, "Min Value not <= maxVal: " + minVal + ", " + maxVal);

            fullRaster = readRasterFromTIFF(target, null);
            // The tile size for this file is 128-by-128. The following tests
            // read subsections starting right before the tile transition and right after it.
            height = fullRaster.getHeight();
            width  = fullRaster.getWidth();
            // checks based on the 128-by-128 tile model
            checkSubImage(target, fullRaster, 126, 126, 132, 132);
            checkSubImage(target, fullRaster, 128, 128, 128, 128);
            checkSubImage(target, fullRaster, 1, 1, width-2, height-2);
            // check the 4 edges
            checkSubImage(target, fullRaster, 0, 0, width, 1);         // bottom row
            checkSubImage(target, fullRaster, 0, 0, 1, height);        // left column
            checkSubImage(target, fullRaster, 0, height-1, width, 1);  // top row
            checkSubImage(target, fullRaster, width-1, 0, 1, height);  // right column

            // now test along the main diagonal
            for(int i=0; i<height-8; i++){
                checkSubImage(target, fullRaster, i, i, 8, 8);
            }

            // now read the entire image
            checkSubImage(target, fullRaster, 0, 0, width, height);
        } catch (final ImageReadException | IOException ex) {
            fail("Exception during test " + ex.getMessage());
        }
    }


    private void checkSubImage(final File target, final TiffRasterData fullRaster, final int x0, final int y0, final int width, final int height){
        try{
            final Map<String, Object> params = new HashMap<>();
            params.put(TiffConstants.PARAM_KEY_SUBIMAGE_X, x0);
            params.put(TiffConstants.PARAM_KEY_SUBIMAGE_Y, y0);
            params.put(TiffConstants.PARAM_KEY_SUBIMAGE_WIDTH, width);
            params.put(TiffConstants.PARAM_KEY_SUBIMAGE_HEIGHT, height);
            final TiffRasterData partRaster = readRasterFromTIFF(target, params);
            assertEquals(width, partRaster.getWidth(), "Invalid width in partial for " + target.getName());
            assertEquals(height, partRaster.getHeight(), "Invalid height in partial for " + target.getName());
            for (int y = y0; y < y0+height; y++) {
                for (int x = x0; x < x0+width; x++) {
                    final float vFull = fullRaster.getValue(x, y);
                    final float vPart = partRaster.getValue(x - x0, y - y0);
                    assertEquals(vFull, vPart, "Invalid value match for partial at (" + x + "," + y + ") for "+target.getName());
                }
            }
        }catch (final ImageReadException | IOException ex) {
            fail("Exception during test " + ex.getMessage());
        }
    }

}
