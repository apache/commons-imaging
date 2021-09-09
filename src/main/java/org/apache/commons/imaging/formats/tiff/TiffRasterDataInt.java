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
 * <p>
 * <strong>Note:</strong> The getData() and getIntData() methods can return
 * direct references to the internal arrays stored in instances of this class.
 * Because these are not safe copies of the data, an application that
 * modified the arrays returned by these methods will change the content
 * of the associated instance. This approach is used for purposes of efficiency
 * when dealing with very large TIFF images.
 */
public class TiffRasterDataInt extends TiffRasterData {


    private final int[] data;

    /**
     * Construct an instance allocating memory for the specified dimensions.
     *
     * @param width a value of 1 or greater
     * @param height a value of 1 or greater
     */
    public TiffRasterDataInt(final int width, final int height) {
        super(width, height);
        final int nCells = width * height;
        data = new int[nCells];
    }

    /**
     * Construct an instance allocating memory for the specified dimensions.
     *
     * @param width a value of 1 or greater
     * @param height a value of 1 or greater
     * @param data the data to be stored in the raster.
     */
    public TiffRasterDataInt(final int width, final int height, final int[] data) {
        super(width, height);

        if (data == null || data.length < width * height) {
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
        return TiffRasterDataType.INTEGER;
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
        int index = checkCoordinatesAndComputeIndex(x, y);
        data[index] = (int)value;
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
        int index = checkCoordinatesAndComputeIndex(x, y);
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
        int index = checkCoordinatesAndComputeIndex(x, y);
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
        int index = checkCoordinatesAndComputeIndex(x, y);
        return data[index];
    }



    /**
     * Tabulates simple statistics for the raster and returns an instance
     * containing general metadata.
     *
     * @return a valid instance containing a safe copy of the current simple
   * statistics for the raster.     */
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
     * it directly affects the content of the instance. While this design approach
     * carries some risk in terms of data security, it was chosen for reasons of
     * performance and memory conservation. TIFF images that contain
     * floating-point data are often quite large. Sizes of 100 million raster
     * cells are common. Making a redundant copy of such a large in-memory object
     * might exceed the resources available to a Java application.
     *
     * @return a direct reference to the data array stored in this instance.
     */
    @Override
    public int [] getIntData() {
        return data;
    }

    /**
     * Returns an array of floating-point equivalents to the integer
     * values stored in this instance.  To do so, a float array is
     * allocated and each integer value in the source
     * data is cast to a float.
     *
     * @return the floating-point equivalents of the content stored
     * in this instance.
     */
    @Override
    public float[] getData() {
        final int nCells = width * height;
        final float[] result = new float[nCells];
        for (int i = 0; i < nCells; i++) {
            result[i] = (int) data[i];
        }
        return result;
    }
}
