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
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.fp.IPaletteEntry;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.fp.PaletteEntryForRange;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.fp.PaletteEntryForValue;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.fp.PhotometricInterpreterFloat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
    private File getTiffFile(String name) {
        File tiffFolder = new File(ImagingTestConstants.TEST_IMAGE_FOLDER, "tiff");
        File fpFolder = new File(tiffFolder, "9");
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
        File target, float f0, float f1, float fNot) throws ImageReadException, IOException {
        ByteSourceFile byteSource = new ByteSourceFile(target);
        TiffReader tiffReader = new TiffReader(true);
        TiffContents contents = tiffReader.readDirectories(
            byteSource,
            true, // indicates that application should read image data, if present
            FormatCompliance.getDefault());
        ByteOrder byteOrder = tiffReader.getByteOrder();
        TiffDirectory directory = contents.directories.get(0);
        List<IPaletteEntry> pList = new ArrayList<>();
        pList.add(new PaletteEntryForValue(fNot, Color.red));
        pList.add(new PaletteEntryForRange(f0, f1, Color.black, Color.white));
        PhotometricInterpreterFloat pInterp = new PhotometricInterpreterFloat(pList);
        HashMap<String, Object> params = new HashMap<>();
        params.put(TiffConstants.PARAM_KEY_CUSTOM_PHOTOMETRIC_INTERPRETER, pInterp);
        BufferedImage bImage = directory.getTiffImage(byteOrder, params);
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
        File target, Map<String, Object> params)
        throws ImageReadException, IOException {
        ByteSourceFile byteSource = new ByteSourceFile(target);
        TiffReader tiffReader = new TiffReader(true);
        TiffContents contents = tiffReader.readDirectories(
            byteSource,
            true, // indicates that application should read image data, if present
            FormatCompliance.getDefault());
        ByteOrder byteOrder = tiffReader.getByteOrder();
        TiffDirectory directory = contents.directories.get(0);
        TiffImageParser parser = new TiffImageParser();
        return parser.readFloatingPointRasterData(directory, byteOrder, params);
    }

    @Test
    public void test() {
        Map<String, Object> params = new HashMap<>();

        // These TIFF sample data includes files that contain known
        // floating-point values in various formats.  We know the range
        // of values from inspection using separate utilies. This
        // test verifies that the data can be fetched successfully.
        //   Note that when evaluating the range of values in a TIFF file,
        // the photometric interpreter does not include the special no-data
        // code in the tabulation.  If you have a file that does not
        // define a no-data value, just use Float.NaN for testing purposes.
        try {
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
            // the sub-raster.  Compare the results.  The offsets of
            // 17 are just an arbitrary value not likely to align with
            // any arbitrary features in the TIFF files.
            params.clear();
            params.put(TiffConstants.PARAM_KEY_SUBIMAGE_X, 17);
            params.put(TiffConstants.PARAM_KEY_SUBIMAGE_Y, 17);
            params.put(TiffConstants.PARAM_KEY_SUBIMAGE_WIDTH, 200);
            params.put(TiffConstants.PARAM_KEY_SUBIMAGE_HEIGHT, 200);
            TiffRasterData fullRaster = readRasterFromTIFF(target, null);
            TiffRasterData partRaster = readRasterFromTIFF(target, params);
            assertEquals(200, partRaster.getWidth(), "Invalid width in partial for " + target.getName());
            assertEquals(200, partRaster.getHeight(), "Invalid height in partial for " + target.getName());
            for (int y = 17; y < 217; y++) {
                for (int x = 17; x < 217; x++) {
                    float vFull = fullRaster.getValue(x, y);
                    float vPart = partRaster.getValue(x - 17, y - 17);
                    assertEquals(vFull, vPart, "Invalid value match for partial at (" + x + "," + y + ")");
                }
            }

            // We know from inspection that this sample file contains values
            // in the range -2 to 62 and uses -99999 as a "no-data" value.
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

            params.clear();
            params.put(TiffConstants.PARAM_KEY_SUBIMAGE_X, 17);
            params.put(TiffConstants.PARAM_KEY_SUBIMAGE_Y, 17);
            params.put(TiffConstants.PARAM_KEY_SUBIMAGE_WIDTH, 200);
            params.put(TiffConstants.PARAM_KEY_SUBIMAGE_HEIGHT, 200);
            fullRaster = readRasterFromTIFF(target, null);
            partRaster = readRasterFromTIFF(target, params);
            assertEquals(200, partRaster.getWidth(), "Invalid width in partial for " + target.getName());
            assertEquals(200, partRaster.getHeight(), "Invalid height in partial for " + target.getName());
            for (int y = 17; y < 217; y++) {
                for (int x = 17; x < 217; x++) {
                    float vFull = fullRaster.getValue(x, y);
                    float vPart = partRaster.getValue(x - 17, y - 17);
                    assertEquals(vFull, vPart, "Invalid value match for partial at (" + x + "," + y + ")");
                }
            }

        } catch (ImageReadException | IOException ex) {
            fail("Exception during test " + ex.getMessage());
        }
    }

}
