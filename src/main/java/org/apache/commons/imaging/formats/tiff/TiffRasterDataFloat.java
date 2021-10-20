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

import java.util.stream.IntStream;

/**
 * Provides a simple container for floating-point data. Some TIFF files are used
 * to store floating-point data rather than images. This class is intended to
 * support access to those TIFF files.
 * <p>
 * <strong>Note:</strong> The getData() and getIntData() methods can return
 * direct references to the internal arrays stored in instances of this class.
 * Because these are not safe copies of the data, an application that modified
 * the arrays returned by these methods will change the content of the
 * associated instance. This approach is used for purposes of efficiency when
 * dealing with very large TIFF images.
 * <p>
 * <strong>Data layout:</strong> The elements in the returned array are stored
 * in row-major order. In cases where the data contains multiple samples per
 * raster cell (pixel), the data is organized into blocks of data one sample at
 * a time. The first block contains width*height values for the first sample for
 * each cell, the second block contains width*height values for the second
 * sample for each cell, etc. Thus, the array index for a particular value is
 * computed as
 * <pre>
 *    index = y*width + x + iSample * width *height;
 * </pre>
 */
public class TiffRasterDataFloat extends TiffRasterData {

    private final float[] data;

    /**
     * Construct an instance allocating memory for the specified dimensions.
     *
     * @param width a value of 1 or greater
     * @param height a value of 1 or greater
     */
    public TiffRasterDataFloat(final int width, final int height) {
        super(width, height, 1);
        data = new float[nCells];
    }

    /**
     * Construct an instance allocating memory for the specified dimensions.
     *
     * @param width a value of 1 or greater
     * @param height a value of 1 or greater
     * @param samplesPerPixel a value of 1 or greater
     */
    public TiffRasterDataFloat(final int width, final int height, int samplesPerPixel) {
        super(width, height, samplesPerPixel);
        data = new float[nCells];
    }

    /**
     * Construct an instance allocating memory for the specified dimensions.
     *
     * @param width a value of 1 or greater
     * @param height a value of 1 or greater
     * @param data the data to be stored in the raster.
     */
    public TiffRasterDataFloat(final int width, final int height, final float[] data) {
        super(width, height, 1);

        if (data == null || data.length < nCells) {
            throw new IllegalArgumentException(
                    "Specified data does not contain sufficient elements");
        }
        this.data = data;
    }

    /**
     * Construct an instance allocating memory for the specified dimensions.
     *
     * @param width a value of 1 or greater
     * @param height a value of 1 or greater
     * @param samplesPerCell the number of samples per pixel
     * @param data the data to be stored in the raster.
     */
    public TiffRasterDataFloat(final int width, final int height, int samplesPerCell, final float[] data) {
        super(width, height, samplesPerCell);

        if (data == null || data.length < nCells) {
            throw new IllegalArgumentException(
                "Specified data does not contain sufficient elements");
        }
        this.data = data;
    }

    /**
     * Gets the raster data type from the instance.
     *
     * @return a value of TiffRasterDataType&#46;FLOAT.
     */
    @Override
    public TiffRasterDataType getDataType() {
        return TiffRasterDataType.FLOAT;
    }

    /**
     * Sets the value stored at the specified raster coordinates.
     *
     * @param x integer coordinate in the columnar direction
     * @param y integer coordinate in the row direction
     * @param value the value to be stored at the specified location;
     * potentially a Float&#46;NaN.
     */
    @Override
    public void setValue(final int x, final int y, final float value) {
        int index = checkCoordinatesAndComputeIndex(x, y, 0);
        data[index] = value;
    }

    /**
     * Sets the value stored at the specified raster coordinates.
     *
     * @param x integer coordinate in the columnar direction
     * @param y integer coordinate in the row direction
     * @param i integer sample index (for data sets giving multiple samples per
     * raster cell).
     * @param value the value to be stored at the specified location;
     * potentially a Float&#46;NaN.
     */
    @Override
    public void setValue(final int x, final int y, int i, final float value) {
        int index = checkCoordinatesAndComputeIndex(x, y, i);
        data[index] = value;
    }

    /**
     * Gets the value stored at the specified raster coordinates.
     *
     * @param x integer coordinate in the columnar direction
     * @param y integer coordinate in the row direction
     * @return the value stored at the specified location; potentially a
     * Float&#46;NaN.
     */
    @Override
    public float getValue(final int x, final int y) {
        int index = checkCoordinatesAndComputeIndex(x, y, 0);
        return data[index];
    }

    /**
     * Gets the value stored at the specified raster coordinates.
     *
     * @param x integer coordinate in the columnar direction
     * @param y integer coordinate in the row direction
     * @param i integer sample index (for data sets giving multiple samples per
     * raster cell).
     * @return the value stored at the specified location; potentially a
     * Float&#46;NaN.
     */
    @Override
    public float getValue(final int x, final int y, int i) {
        int index = checkCoordinatesAndComputeIndex(x, y, i);
        return data[index];
    }

    /**
     * Sets the value stored at the specified raster coordinates.
     *
     * @param x integer coordinate in the columnar direction
     * @param y integer coordinate in the row direction
     * @param value the value to be stored at the specified location
     */
    @Override
    public void setIntValue(final int x, final int y, final int value) {
        int index = checkCoordinatesAndComputeIndex(x, y, 0);
        data[index] = value;
    }

    /**
     * Sets the value stored at the specified raster coordinates.
     *
     * @param x integer coordinate in the columnar direction
     * @param y integer coordinate in the row direction
     * @param i integer sample index (for data sets giving multiple samples per
     * raster cell).
     * @param value the value to be stored at the specified location
     */
    @Override
    public void setIntValue(final int x, final int y, int i, final int value) {
        int index = checkCoordinatesAndComputeIndex(x, y, 0);
        data[index] = value;
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
        int index = checkCoordinatesAndComputeIndex(x, y, 0);
        return (int) data[index];
    }

    /**
     * Gets the value stored at the specified raster coordinates.
     *
     * @param x integer coordinate in the columnar direction
     * @param y integer coordinate in the row direction
     * @param i integer sample index (for data sets giving multiple samples per
     * raster cell).
     * @return the value stored at the specified location
     */
    @Override
    public int getIntValue(final int x, final int y, int i) {
        int index = checkCoordinatesAndComputeIndex(x, y, 0);
        return (int) data[index];
    }

    /**
     * Tabulates simple statistics for the raster and returns an instance
     * containing general metadata.
     *
     * @return a valid instance containing a safe copy of the current simple
     * statistics for the raster.
     */
    @Override
    public TiffRasterStatistics getSimpleStatistics() {
        return new TiffRasterStatistics(this, Float.NaN);
    }

    /**
     * Tabulates simple statistics for the raster excluding the specified value
     * and returns an instance containing general metadata.
     *
     * @param valueToExclude exclude samples with this specified value.
     * @return a valid instance.
     */
    @Override
    public TiffRasterStatistics getSimpleStatistics(final float valueToExclude) {
        return new TiffRasterStatistics(this, valueToExclude);
    }

    /**
     * Returns a reference to the data array stored in this instance. Note that
     * the array returned is <strong>not</strong> a safe copy and that modifying
     * it directly affects the content of the instance. While this design
     * approach carries some risk in terms of data security, it was chosen for
     * reasons of performance and memory conservation. TIFF images that contain
     * floating-point data are often quite large. Sizes of 100 million raster
     * cells are common. Making a redundant copy of such a large in-memory
     * object might exceed the resources available to a Java application.
     * <p>
     * See the class API documentation above for notes on accessing array
     * elements.
     *
     * @return a direct reference to the data array stored in this instance.
     */
    @Override
    public float[] getData() {
        return data;
    }

    /**
     * Returns an array of integer approximations for the floating-point content
     * stored as an array in this instance.
     * <p>
     * See the class API documentation above for notes on accessing array
     * elements.
     *
     * @return the integer equivalents to the data content stored in this
     * instance.
     */
    @Override
    public int[] getIntData() {
        return IntStream.range(0, nCells)
                .map(i -> (int) data[i])
                .toArray();
    }

}
