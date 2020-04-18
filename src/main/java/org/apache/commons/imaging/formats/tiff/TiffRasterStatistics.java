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

/**
 * Collects and stores a set of simple statistics from the input raster.
 */
public class TiffRasterStatistics {

    private final int nSample;
    private final int nNull;
    private final float minValue;
    private final float maxValue;
    private final float meanValue;
    private final float excludedValue;

    /**
     * Constructs an instance of this class, tabulating results from the input
     * raster data.
     *
     * @param raster the input data
     * @param excludedValue an optional value to ignore; use Float&#46;NaN if no
     * value is to be ignored.
     */
    TiffRasterStatistics(TiffRasterData raster, float excludedValue) {
        this.excludedValue = excludedValue;
        float vMin = Float.POSITIVE_INFINITY;
        float vMax = Float.NEGATIVE_INFINITY;
        double vSum = 0;
        int nS = 0;
        int nN = 0;
        float[] data = raster.getData();
        for (int i = 0; i < data.length; i++) {
            float test = data[i];
            if (Float.isNaN(test)) {
                nN++;
                continue;
            }
            if (test == excludedValue) {
                continue;
            }

            nS++;
            vSum += test;
            if (test < vMin) {
                vMin = test;
            }
            if (test > vMax) {
                vMax = test;
            }
        }

        minValue = vMin;
        maxValue = vMax;
        nSample = nS;
        nNull = nN;
        if (nSample == 0) {
            meanValue = 0;
        } else {
            meanValue = (float) (vSum / nSample);
        }
    }

    /**
     * Get the count of the number of non-null and non-excluded samples in the
     * collection.
     *
     * @return the a positive number, potentially zero
     */
    public int getCountOfSamples() {
        return nSample;
    }

    /**
     * Get the count of the number of null samples in the collection.
     *
     * @return the a positive number, potentially zero
     */
    public int getCountOfNulls() {
        return nNull;
    }

    /**
     * Get the minimum value found in the source data
     *
     * @return the minimum value found in the source data
     */
    public float getMinValue() {
        return minValue;
    }

    /**
     * Get the maximum value found in the source data
     *
     * @return the maximum value found in the source data
     */
    public float getMaxValue() {
        return maxValue;
    }

    /**
     * Get the mean value for all sample values in the raster. Null-data values
     * and excluded values are not considered.
     *
     * @return the meanValuethe mean value of the samples
     */
    public float getMeanValue() {
        return meanValue;
    }

    /**
     * Indicates if a sample value was set to be deliberately excluded from the
     * statistics.
     *
     * @return true if a value was set for exclusion; otherwise, false
     */
    public boolean isAnExcludedValueSet() {
        return !Float.isNaN(excludedValue);
    }

    /**
     * Get the value that was set for exclusion, or a Float&#46;NaN if not was
     * set.
     *
     * @return the excluded value (if any).
     */
    public float getExcludedValue() {
        return excludedValue;
    }
}
