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

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Provides unit test for the raster-data class.
 */
public class TiffRasterDataTest {

    int width = 11;
    int height = 10;
    float[] data;
    TiffRasterData raster;
    float meanValue;

    public TiffRasterDataTest() {
        double sum = 0;
        data = new float[width * height];
        int k = 0;
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                data[k] = k;
                sum += k;
                k++;
            }
        }
        raster = new TiffRasterData(width, height, data);
        meanValue = (float) (sum / k);
    }

    /**
     * Test of setValue method, of class TiffRasterData.
     */
    @Test
    public void testSetValue() {
        TiffRasterData instance = new TiffRasterData(width, height);
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int index = y * width + height;
                instance.setValue(x, y, (float) index);
                int test = (int) instance.getValue(x, y);
                assertEquals(index, test, "Set/get value test failed");
            }
        }
    }

    /**
     * Test of getValue method, of class TiffRasterData.
     */
    @Test
    public void testGetValue() {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int index = y * width + x;
                int test = (int) raster.getValue(x, y);
                assertEquals(index, test, "Get into source data test failed at (" + x + "," + y + ")");
            }
        }
    }

    /**
     * Test of getSimpleStatistics method, of class TiffRasterData.
     */
    @Test
    public void testGetSimpleStatistics_0args() {

        TiffRasterStatistics result = raster.getSimpleStatistics();
        assertEquals(0, result.getMinValue(), "Min value failure");
        assertEquals(width * height - 1, result.getMaxValue(), "Max value failure");
        assertEquals(meanValue, result.getMeanValue(), "Mean value failure");
    }

    /**
     * Test of getSimpleStatistics method, of class TiffRasterData.
     */
    @Test
    public void testGetSimpleStatistics_float() {
        // exclude the maximum value (width*height-1).  This will result
        // in a max value of width*height-2
        TiffRasterStatistics result = raster.getSimpleStatistics(width * height - 1);
        assertEquals(width * height - 2, result.getMaxValue(), "Max value failure");
    }

    /**
     * Test of getWidth method, of class TiffRasterData.
     */
    @Test
    public void testGetWidth() {
        assertEquals(width, raster.getWidth(), "Improper width stored");
    }

    /**
     * Test of getHeight method, of class TiffRasterData.
     */
    @Test
    public void testGetHeight() {
        assertEquals(width, raster.getWidth(), "Improper height stored");
    }

    /**
     * Test of getData method, of class TiffRasterData.
     */
    @Test
    public void testGetData() {
        float[] result = raster.getData();
        assertArrayEquals(data, result);
    }

}
