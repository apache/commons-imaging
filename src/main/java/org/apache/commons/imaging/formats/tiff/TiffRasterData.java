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
 * Provides a simple container for numeric-raster data. Some TIFF files are used
 * to store floating-point or integer data rather than images. This class is
 * intended to support access to those TIFF files.
 * <p>
 * <strong>Note:</strong> The getData() and getIntData() methods can return
 * direct references to the internal arrays stored in instances of this class.
 * Because these are not safe copies of the data, an application that
 * modified the arrays returned by these methods will change the content
 * of the associated instance. This approach is used for purposes of efficiency
 * when dealing with very large TIFF images.
 */
public abstract class TiffRasterData {

    protected final int width;
    protected final int height;

    /**
     * Construct an instance allocating memory for the specified dimensions.
     *
     * @param width a value of 1 or greater
     * @param height a value of 1 or greater
     */
    public TiffRasterData(final int width, final int height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException(
                    "Raster dimensions less than or equal to zero are not supported");
        }
        this.width = width;
        this.height = height;
    }

    protected final int checkCoordinatesAndComputeIndex(final int x, final int y) {
        if (x < 0 || x >= width || y < 0 || y >= height) {
            throw new IllegalArgumentException(
                    "Coordinates out of range (" + x + ", " + y + ")");
        }
        return y * width + x;
    }

    /**
     * Gets the width (number of columns) of the raster.
     *
     * @return the width of the raster
     */
    public final int getWidth() {
        return width;
    }

    /**
     * Gets the height (number of rows) of the raster.
     *
     * @return the height of the raster.
     */
    public final int getHeight() {
        return height;
    }

    /**
     * Gets the raster data type from the instance.
     *
     * @return a valid enumeration value.
     */
    public abstract TiffRasterDataType getDataType();

    /**
     * Sets the value stored at the specified raster coordinates.
     *
     * @param x integer coordinate in the columnar direction
     * @param y integer coordinate in the row direction
     * @param value the value to be stored at the specified location;
     * potentially a Float&#46;NaN.
     */
    public abstract void setValue(int x, int y, float value);

    /**
     * Gets the value stored at the specified raster coordinates.
     *
     * @param x integer coordinate in the columnar direction
     * @param y integer coordinate in the row direction
     * @return the value stored at the specified location; potentially a
     * Float&#46;NaN.
     */
    public abstract float getValue(int x, int y);

    /**
     * Sets the value stored at the specified raster coordinates.
     *
     * @param x integer coordinate in the columnar direction
     * @param y integer coordinate in the row direction
     * @param value the value to be stored at the specified location.
     */
    public abstract void setIntValue(int x, int y, int value);

    /**
     * Gets the value stored at the specified raster coordinates.
     *
     * @param x integer coordinate in the columnar direction
     * @param y integer coordinate in the row direction
     * @return the value stored at the specified location
     */
    public abstract int getIntValue(int x, int y);

    /**
     * Tabulates simple statistics for the raster and returns an instance
     * containing general metadata.
     *
     * @return a valid instance containing a safe copy of the current simple
     * statistics for the raster.
     */
    public abstract TiffRasterStatistics getSimpleStatistics();

    /**
     * Tabulates simple statistics for the raster excluding the specified value
     * and returns an instance containing general metadata.
     *
     * @param valueToExclude exclude samples with this specified value.
     * @return a valid instance.
     */
    public abstract TiffRasterStatistics getSimpleStatistics(float valueToExclude);

    /**
     * Returns the content stored as an array in this instance. Note that in
     * many cases, the returned array is <strong>not</strong> a safe copy of the
     * data but a direct reference to the member element. In such cases,
     * modifying it would directly affect the content of the instance. While
     * this design approach carries some risk in terms of data security, it was
     * chosen for reasons of performance and memory conservation. TIFF images
     * that contain floating-point data are often quite large. Sizes of 100
     * million raster cells are common. Making a redundant copy of such a large
     * in-memory object might exceed the resources available to a Java
     * application.
     *
     * @return the data content stored in this instance.
     */
    public abstract float[] getData();

    /**
     * Returns the content stored as an array in this instance. Note that in
     * many cases, the returned array is <strong>not</strong> a safe copy of the
     * data but a direct reference to the member element. In such cases,
     * modifying it would directly affect the content of the instance. While
     * this design approach carries some risk in terms of data security, it was
     * chosen for reasons of performance and memory conservation. TIFF images
     * that contain floating-point data are often quite large. Sizes of 100
     * million raster cells are common. Making a redundant copy of such a large
     * in-memory object might exceed the resources available to a Java
     * application.
     *
     * @return the data content stored in this instance.
     */
    public abstract int[] getIntData();
}
