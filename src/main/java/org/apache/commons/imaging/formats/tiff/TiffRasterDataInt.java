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

import org.apache.commons.imaging.common.Allocator;

/**
 * Provides a simple container for floating-point data. Some TIFF files are used to store floating-point data rather than images. This class is intended to
 * support access to those TIFF files.
 * <p>
 * <strong>Note:</strong> The getData() and getIntData() methods can return direct references to the internal arrays stored in instances of this class. Because
 * these are not safe copies of the data, an application that modified the arrays returned by these methods will change the content of the associated instance.
 * This approach is used for purposes of efficiency when dealing with very large TIFF images.
 * <p>
 * <strong>Data layout:</strong> The elements in the returned array are stored in row-major order. In cases where the data contains multiple samples per raster
 * cell (pixel), the data is organized into blocks of data one sample at a time. The first block contains width*height values for the first sample for each
 * cell, the second block contains width*height values for the second sample for each cell, etc. Thus, the array index for a particular value is computed as
 *
 * <pre>
 * index = y * width + x + iSample * width * height;
 * </pre>
 */
public class TiffRasterDataInt extends TiffRasterData {

    private final int[] data;

    /**
     * Constructs an instance allocating memory for the specified dimensions.
     *
     * @param width  a value of 1 or greater
     * @param height a value of 1 or greater
     */
    public TiffRasterDataInt(final int width, final int height) {
        super(width, height, 1);
        data = Allocator.intArray(nCells);
    }

    /**
     * Constructs an instance allocating memory for the specified dimensions.
     *
     * @param width           a value of 1 or greater
     * @param height          a value of 1 or greater
     * @param samplesPerPixel a value of 1 or greater
     */
    public TiffRasterDataInt(final int width, final int height, final int samplesPerPixel) {
        super(width, height, samplesPerPixel);
        data = Allocator.intArray(nCells);
    }

    /**
     * Constructs an instance allocating memory for the specified dimensions.
     *
     * @param width           a value of 1 or greater
     * @param height          a value of 1 or greater
     * @param samplesPerPixel a value of 1 or greater
     * @param data            the data to be stored in the raster.
     */
    public TiffRasterDataInt(final int width, final int height, final int samplesPerPixel, final int[] data) {
        super(width, height, samplesPerPixel);

        if (data == null || data.length < nCells) {
            throw new IllegalArgumentException("Specified data does not contain sufficient elements");
        }
        this.data = data;
    }

    /**
     * Constructs an instance allocating memory for the specified dimensions.
     *
     * @param width  a value of 1 or greater
     * @param height a value of 1 or greater
     * @param data   the data to be stored in the raster.
     */
    public TiffRasterDataInt(final int width, final int height, final int[] data) {
        super(width, height, 1);

        if (data == null || data.length < nCells) {
            throw new IllegalArgumentException("Specified data does not contain sufficient elements");
        }
        this.data = data;
    }

    /**
     * Returns an array of floating-point equivalents to the integer values stored in this instance. To do so, a float array is allocated and each integer value
     * in the source data is cast to a float.
     *
     * @return the floating-point equivalents of the content stored in this instance.
     */
    @Override
    public float[] getData() {
        final float[] result = Allocator.floatArray(nCells);
        for (int i = 0; i < nCells; i++) {
            result[i] = data[i];
        }
        return result;
    }

    /**
     * Gets the raster data type from the instance.
     *
     * @return a value of TiffRasterDataType&#46;FLOAT.
     */
    @Override
    public TiffRasterDataType getDataType() {
        return TiffRasterDataType.INTEGER;
    }

    /**
     * Returns a reference to the data array stored in this instance. Note that the array returned is <strong>not</strong> a safe copy and that modifying it
     * directly affects the content of the instance. While this design approach carries some risk in terms of data security, it was chosen for reasons of
     * performance and memory conservation. TIFF images that contain floating-point data are often quite large. Sizes of 100 million raster cells are common.
     * Making a redundant copy of such a large in-memory object might exceed the resources available to a Java application.
     *
     * @return a direct reference to the data array stored in this instance.
     */
    @Override
    public int[] getIntData() {
        return data;
    }

    /**
     * Gets the value stored at the specified raster coordinates.
     *
     * @param x integer coordinate in the columnar direction
     * @param y integer coordinate in the row direction
     * @return the value stored at the specified location
     */
    @Override
    public int getIntValue(final int x, final int y) {
        final int index = checkCoordinatesAndComputeIndex(x, y, 0);
        return data[index];
    }

    /**
     * Gets the value stored at the specified raster coordinates.
     *
     * @param x integer coordinate in the columnar direction
     * @param y integer coordinate in the row direction
     * @param i integer sample index (for data sets giving multiple samples per raster cell).
     * @return the value stored at the specified location
     */
    @Override
    public int getIntValue(final int x, final int y, final int i) {
        final int index = checkCoordinatesAndComputeIndex(x, y, i);
        return data[index];
    }

    /**
     * Tabulates simple statistics for the raster and returns an instance containing general metadata.
     *
     * @return a valid instance containing a safe copy of the current simple statistics for the raster.
     */
    @Override
    public TiffRasterStatistics getSimpleStatistics() {
        return new TiffRasterStatistics(this, Float.NaN);
    }

    /**
     * Tabulates simple statistics for the raster excluding the specified value and returns an instance containing general metadata.
     *
     * @param valueToExclude exclude samples with this specified value.
     * @return a valid instance.
     */
    @Override
    public TiffRasterStatistics getSimpleStatistics(final float valueToExclude) {
        return new TiffRasterStatistics(this, valueToExclude);
    }

    /**
     * Gets the value stored at the specified raster coordinates.
     *
     * @param x integer coordinate in the columnar direction
     * @param y integer coordinate in the row direction
     * @return the value stored at the specified location; potentially a Float&#46;NaN.
     */
    @Override
    public float getValue(final int x, final int y) {
        final int index = checkCoordinatesAndComputeIndex(x, y, 0);
        return data[index];
    }

    /**
     * Gets the value stored at the specified raster coordinates.
     *
     * @param x integer coordinate in the columnar direction
     * @param y integer coordinate in the row direction
     * @param i integer sample index (for data sets giving multiple samples per raster cell.
     * @return the value stored at the specified location; potentially a Float&#46;NaN.
     */
    @Override
    public float getValue(final int x, final int y, final int i) {
        final int index = checkCoordinatesAndComputeIndex(x, y, i);
        return data[index];
    }

    /**
     * Sets the value stored at the specified raster coordinates.
     *
     * @param x     integer coordinate in the columnar direction
     * @param y     integer coordinate in the row direction
     * @param value the value to be stored at the specified location
     */
    @Override
    public void setIntValue(final int x, final int y, final int value) {
        final int index = checkCoordinatesAndComputeIndex(x, y, 0);
        data[index] = value;
    }

    /**
     * Sets the value stored at the specified raster coordinates.
     *
     * @param x     integer coordinate in the columnar direction
     * @param y     integer coordinate in the row direction
     * @param i     integer sample index (for data sets giving multiple samples per raster cell).
     * @param value the value to be stored at the specified location
     */
    @Override
    public void setIntValue(final int x, final int y, final int i, final int value) {
        final int index = checkCoordinatesAndComputeIndex(x, y, i);
        data[index] = value;
    }

    /**
     * Sets the value stored at the specified raster coordinates.
     *
     * @param x     integer coordinate in the columnar direction
     * @param y     integer coordinate in the row direction
     * @param value the value to be stored at the specified location; potentially a Float&#46;NaN.
     */
    @Override
    public void setValue(final int x, final int y, final float value) {
        final int index = checkCoordinatesAndComputeIndex(x, y, 0);
        data[index] = (int) value;
    }

    /**
     * Sets the value stored at the specified raster coordinates.
     *
     * @param x     integer coordinate in the columnar direction
     * @param y     integer coordinate in the row direction
     * @param i     integer sample index (for data sets giving multiple samples per raster cell).
     * @param value the value to be stored at the specified location; potentially a Float&#46;NaN.
     */
    @Override
    public void setValue(final int x, final int y, final int i, final float value) {
        final int index = checkCoordinatesAndComputeIndex(x, y, i);
        data[index] = (int) value;
    }
}
