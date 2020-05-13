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
 * Provides a simple container for floating-point data. Some TIFF files are used
 * to store floating-point data rather than images. This class is intended to
 * support access to those TIFF files.
 */
public class TiffRasterData {


    private final int width;
    private final int height;
    private final float[] data;

    /**
     * Construct an instance allocating memory for the specified dimensions.
     *
     * @param width a value of 1 or greater
     * @param height a value of 1 or greater
     */
    public TiffRasterData(int width, int height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException(
                "Raster dimensions less than or equal to zero are not supported");
        }
        int nCells = width * height;
        data = new float[nCells];
        this.width = width;
        this.height = height;

    }

    /**
     * Construct an instance allocating memory for the specified dimensions.
     *
     * @param width a value of 1 or greater
     * @param height a value of 1 or greater
     * @param data the data to be stored in the raster.
     */
    public TiffRasterData(int width, int height, float[] data) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException(
                "Raster dimensions less than or equal to zero are not supported");
        }
        if (data == null || data.length < width * height) {
            throw new IllegalArgumentException(
                "Specified data does not contain sufficient elements");
        }
        this.width = width;
        this.height = height;
        this.data = data;

    }

    /**
     * Sets the value stored at the specified raster coordinates.
     *
     * @param x integer coordinate in the columnar direction
     * @param y integer coordinate in the row direction
     * @param value the value to be stored at the specified location;
     * potentially a Float&#46;NaN.
     */
    public void setValue(int x, int y, float value) {
        if (x < 0 || x >= width || y < 0 || y >= height) {
            throw new IllegalArgumentException(
                "Coordinates out of range (" + x + ", " + y + ")");
        }
        data[y * width + x] = value;
    }

    /**
     * Gets the value stored at the specified raster coordinates.
     *
     * @param x integer coordinate in the columnar direction
     * @param y integer coordinate in the row direction
     * @return the value stored at the specified location; potentially a
     * Float&#46;NaN.
     */
    public float getValue(int x, int y) {
        if (x < 0 || x >= width || y < 0 || y >= height) {
            throw new IllegalArgumentException(
                "Coordinates out of range (" + x + ", " + y + ")");
        }
        return data[y * width + x];
    }

    /**
     * Tabulates simple statistics for the raster and returns an instance
     * containing general metadata.
     *
     * @return a valid instance containing a safe copy of the current simple
   * statistics for the raster.     */
    public TiffRasterStatistics getSimpleStatistics() {
        return new TiffRasterStatistics(this, Float.NaN);
    }

    /**
     * Tabulates simple statistics for the raster excluding the specified value
     * and returns an instance containing general metadata,
     *
     * @param valueToExclude exclude samples with this specified value.
     * @return a valid instance.
     */
    public TiffRasterStatistics getSimpleStatistics(float valueToExclude) {
        return new TiffRasterStatistics(this, valueToExclude);
    }

    /**
     * Gets the width (number of columns) of the raster.
     *
     * @return the width of the raster
     */
    public int getWidth() {
        return width;
    }

    /**
     * Gets the height (number of rows) of the raster.
     *
     * @return the height of the raster.
     */
    public int getHeight() {
        return height;
    }

    /**
     * Returns a reference to the data array stored in this instance. Note that
     * value is <strong>not</strong> a safe copy and that modifying it would
     * directly affect the content of the instance. While this design approach
     * carries some risk in terms of data security, it was chosen for reasons of
     * performance and memory conservation. TIFF images that contain
   * floating-point data are often quite large. Sizes of 100 million raster
   * cells are common. Making a redundant copy of such a large in-memory object
   * might exceed the resources available to a Java application.
     *
     * @return a direct reference to the data array stored in this instance.
     */
    public float[] getData() {
        return data;
    }

}
