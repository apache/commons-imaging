/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.imaging;

/**
 * Used to specify pixel density and physical dimensions when reading or storing image information.
 */
public final class PixelDensity {
    private static final int PIXEL_NO_UNIT = 0;
    private static final int PIXEL_PER_INCH = 254;
    private static final int PIXEL_PER_METRE = 10000;
    private static final int PIXEL_PER_CENTIMETRE = 100;

    /**
     * Creates a pixel density from pixels per centimetre.
     *
     * @param x horizontal density in pixels per centimetre.
     * @param y vertical density in pixels per centimetre.
     * @return the pixel density.
     */
    public static PixelDensity createFromPixelsPerCentimetre(final double x, final double y) {
        return new PixelDensity(x, y, PIXEL_PER_CENTIMETRE);
    }

    /**
     * Creates a pixel density from pixels per inch.
     *
     * @param x horizontal density in pixels per inch.
     * @param y vertical density in pixels per inch.
     * @return the pixel density.
     */
    public static PixelDensity createFromPixelsPerInch(final double x, final double y) {
        return new PixelDensity(x, y, PIXEL_PER_INCH);
    }

    /**
     * Creates a pixel density from pixels per metre.
     *
     * @param x horizontal density in pixels per metre.
     * @param y vertical density in pixels per metre.
     * @return the pixel density.
     */
    public static PixelDensity createFromPixelsPerMetre(final double x, final double y) {
        return new PixelDensity(x, y, PIXEL_PER_METRE);
    }

    /**
     * Creates a unitless pixel density.
     *
     * @param x horizontal density (unitless).
     * @param y vertical density (unitless).
     * @return the pixel density.
     */
    public static PixelDensity createUnitless(final double x, final double y) {
        return new PixelDensity(x, y, PIXEL_NO_UNIT);
    }

    private final double horizontalDensity;

    private final double verticalDensity;

    // One-tenth of a millimetre units.
    private final int unitLength;

    private PixelDensity(final double horizontalDensity, final double verticalDensity, final int unitLength) {
        this.horizontalDensity = horizontalDensity;
        this.verticalDensity = verticalDensity;
        this.unitLength = unitLength;
    }

    /**
     * Gets the raw horizontal density.
     *
     * @return the raw horizontal density.
     */
    public double getRawHorizontalDensity() {
        return horizontalDensity;
    }

    /**
     * Gets the raw vertical density.
     *
     * @return the raw vertical density.
     */
    public double getRawVerticalDensity() {
        return verticalDensity;
    }

    /**
     * Gets the horizontal density in pixels per centimetre.
     *
     * @return the horizontal density in pixels per centimetre.
     */
    public double horizontalDensityCentimetres() {
        if (isInCentimetres()) {
            return horizontalDensity;
        }
        return horizontalDensity * PIXEL_PER_CENTIMETRE / unitLength;
    }

    /**
     * Gets the horizontal density in pixels per inch.
     *
     * @return the horizontal density in pixels per inch.
     */
    public double horizontalDensityInches() {
        if (isInInches()) {
            return horizontalDensity;
        }
        return horizontalDensity * PIXEL_PER_INCH / unitLength;
    }

    /**
     * Gets the horizontal density in pixels per metre.
     *
     * @return the horizontal density in pixels per metre.
     */
    public double horizontalDensityMetres() {
        if (isInMetres()) {
            return horizontalDensity;
        }
        return horizontalDensity * PIXEL_PER_METRE / unitLength;
    }

    /**
     * Checks if the density is in centimetres.
     *
     * @return true if in centimetres, false otherwise.
     */
    public boolean isInCentimetres() {
        return unitLength == PIXEL_PER_CENTIMETRE;
    }

    /**
     * Checks if the density is in inches.
     *
     * @return true if in inches, false otherwise.
     */
    public boolean isInInches() {
        return unitLength == PIXEL_PER_INCH;
    }

    /**
     * Checks if the density is in metres.
     *
     * @return true if in metres, false otherwise.
     */
    public boolean isInMetres() {
        return unitLength == PIXEL_PER_METRE;
    }

    /**
     * Checks if the density is unitless.
     *
     * @return true if unitless, false otherwise.
     */
    public boolean isUnitless() {
        return unitLength == PIXEL_NO_UNIT;
    }

    /**
     * Gets the vertical density in pixels per centimetre.
     *
     * @return the vertical density in pixels per centimetre.
     */
    public double verticalDensityCentimetres() {
        if (isInCentimetres()) {
            return verticalDensity;
        }
        return verticalDensity * PIXEL_PER_CENTIMETRE / unitLength;
    }

    /**
     * Gets the vertical density in pixels per inch.
     *
     * @return the vertical density in pixels per inch.
     */
    public double verticalDensityInches() {
        if (isInInches()) {
            return verticalDensity;
        }
        return verticalDensity * PIXEL_PER_INCH / unitLength;
    }

    /**
     * Gets the vertical density in pixels per metre.
     *
     * @return the vertical density in pixels per metre.
     */
    public double verticalDensityMetres() {
        if (isInMetres()) {
            return verticalDensity;
        }
        return verticalDensity * PIXEL_PER_METRE / unitLength;
    }
}
