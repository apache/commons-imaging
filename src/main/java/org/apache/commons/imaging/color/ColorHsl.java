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
package org.apache.commons.imaging.color;

/**
 * Represents a color in the HSL color space.
 *
 * <p>
 * Contains the constant values for black, white, red, green, blue, cyan, magenta, and yellow.
 * </p>
 *
 * @see <a href="https://en.wikipedia.org/wiki/HSL_and_HSV">https://en.wikipedia.org/wiki/HSL_and_HSV</a>
 * @since 1.0-alpha1
 */
public final class ColorHsl {

    /**
     * A constant for color black. Color components are:
     *
     * <pre>
     *     Hue:        0
     *     Saturation: 0
     *     Lightness:  0
     * </pre>
     */
    public static final ColorHsl BLACK = new ColorHsl(0, 0, 0);

    /**
     * A constant for color white. Color components are:
     *
     * <pre>
     *     Hue:        0
     *     Saturation: 0
     *     Lightness:  100
     * </pre>
     */
    public static final ColorHsl WHITE = new ColorHsl(0, 0, 100);

    /**
     * A constant for color red. Color components are:
     *
     * <pre>
     *     Hue:        0
     *     Saturation: 100
     *     Lightness:  100
     * </pre>
     */
    public static final ColorHsl RED = new ColorHsl(0, 100, 100);

    /**
     * A constant for color green. Color components are:
     *
     * <pre>
     *     Hue:        120
     *     Saturation: 100
     *     Lightness:  100
     * </pre>
     */
    public static final ColorHsl GREEN = new ColorHsl(120, 100, 100);

    /**
     * A constant for color blue. Color components are:
     *
     * <pre>
     *     Hue:        240
     *     Saturation: 100
     *     Lightness:  100
     * </pre>
     */
    public static final ColorHsl BLUE = new ColorHsl(240, 100, 100);

    /** The hue component (0-360). */
    public final double h;

    /** The saturation component (0-100). */
    public final double s;

    /** The lightness component (0-100). */
    public final double l;

    /**
     * Constructs a new ColorHsl.
     *
     * @param h the hue component (0-360).
     * @param s the saturation component (0-100).
     * @param l the lightness component (0-100).
     */
    public ColorHsl(final double h, final double s, final double l) {
        this.h = h;
        this.s = s;
        this.l = l;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final ColorHsl colorHsl = (ColorHsl) o;
        if (Double.compare(colorHsl.h, h) != 0) {
            return false;
        }
        if (Double.compare(colorHsl.l, l) != 0) {
            return false;
        }
        if (Double.compare(colorHsl.s, s) != 0) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(h);
        result = (int) (temp ^ temp >>> 32);
        temp = Double.doubleToLongBits(s);
        result = 31 * result + (int) (temp ^ temp >>> 32);
        temp = Double.doubleToLongBits(l);
        return 31 * result + (int) (temp ^ temp >>> 32);
    }

    @Override
    public String toString() {
        return "{H: " + h + ", S: " + s + ", L: " + l + "}";
    }
}
