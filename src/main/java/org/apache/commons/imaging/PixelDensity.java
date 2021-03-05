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
package org.apache.commons.imaging;

/**
 * Used to specify pixel density and physical dimensions when reading or
 * storing image information.
 */
public final class PixelDensity {
    private static final int PIXEL_NO_UNIT = 0;
    private static final int PIXEL_PER_INCH = 254;
    private static final int PIXEL_PER_METRE = 10000;
    private static final int PIXEL_PER_CENTIMETRE = 100;

    private final double horizontalDensity;
    private final double verticalDensity;
    // / One-tenth of a millimetre units.
    private final int unitLength;

    private PixelDensity(final double horizontalDensity, final double verticalDensity,
            final int unitLength) {
        this.horizontalDensity = horizontalDensity;
        this.verticalDensity = verticalDensity;
        this.unitLength = unitLength;
    }

    public static PixelDensity createUnitless(final double x, final double y) {
        return new PixelDensity(x, y, PIXEL_NO_UNIT);
    }

    public static PixelDensity createFromPixelsPerInch(final double x, final double y) {
        return new PixelDensity(x, y, PIXEL_PER_INCH);
    }

    public static PixelDensity createFromPixelsPerMetre(final double x, final double y) {
        return new PixelDensity(x, y, PIXEL_PER_METRE);
    }

    public static PixelDensity createFromPixelsPerCentimetre(final double x, final double y) {
        return new PixelDensity(x, y, PIXEL_PER_CENTIMETRE);
    }

    public boolean isUnitless() {
        return unitLength == PIXEL_NO_UNIT;
    }

    public boolean isInInches() {
        return unitLength == PIXEL_PER_INCH;
    }

    public boolean isInCentimetres() {
        return unitLength == PIXEL_PER_CENTIMETRE;
    }

    public boolean isInMetres() {
        return unitLength == PIXEL_PER_METRE;
    }

    public double getRawHorizontalDensity() {
        return horizontalDensity;
    }

    public double getRawVerticalDensity() {
        return verticalDensity;
    }

    public double horizontalDensityInches() {
        if (isInInches()) {
            return horizontalDensity;
        }
        return horizontalDensity * PIXEL_PER_INCH / unitLength;
    }

    public double verticalDensityInches() {
        if (isInInches()) {
            return verticalDensity;
        }
        return verticalDensity * PIXEL_PER_INCH / unitLength;
    }

    public double horizontalDensityMetres() {
        if (isInMetres()) {
            return horizontalDensity;
        }
        return horizontalDensity * PIXEL_PER_METRE / unitLength;
    }

    public double verticalDensityMetres() {
        if (isInMetres()) {
            return verticalDensity;
        }
        return verticalDensity * PIXEL_PER_METRE / unitLength;
    }

    public double horizontalDensityCentimetres() {
        if (isInCentimetres()) {
            return horizontalDensity;
        }
        return horizontalDensity * PIXEL_PER_CENTIMETRE / unitLength;
    }

    public double verticalDensityCentimetres() {
        if (isInCentimetres()) {
            return verticalDensity;
        }
        return verticalDensity * PIXEL_PER_CENTIMETRE / unitLength;
    }
}
