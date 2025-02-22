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
package org.apache.commons.imaging.color;

/**
 * Represents a color in the CMYK color space.
 *
 * <p>
 * Contains the constant values for black, white, red, green, blue, cyan, magenta, and yellow.
 * </p>
 *
 * @see <a href="https://en.wikipedia.org/wiki/CMYK_color_model">https://en.wikipedia.org/wiki/CMYK_color_model</a>
 * @since 1.0-alpha1
 */
public final class ColorCmyk {

    /**
     * A constant for color cyan. Color components are:
     *
     * <pre>
     *     cyan:    100
     *     magenta: 0
     *     yellow:  0
     *     key:     0
     * </pre>
     */
    public static final ColorCmyk CYAN = new ColorCmyk(100, 0, 0, 0);

    /**
     * A constant for color magenta. Color components are:
     *
     * <pre>
     *     cyan:    0
     *     magenta: 100
     *     yellow:  0
     *     key:     0
     * </pre>
     */
    public static final ColorCmyk MAGENTA = new ColorCmyk(0, 100, 0, 0);

    /**
     * A constant for color yellow. Color components are:
     *
     * <pre>
     *     cyan:    0
     *     magenta: 0
     *     yellow:  100
     *     key:     0
     * </pre>
     */
    public static final ColorCmyk YELLOW = new ColorCmyk(0, 0, 100, 0);

    /**
     * A constant for color black. Color components are:
     *
     * <pre>
     *     cyan:    0
     *     magenta: 0
     *     yellow:  0
     *     key:     100
     * </pre>
     */
    public static final ColorCmyk BLACK = new ColorCmyk(0, 0, 0, 100);

    /**
     * A constant for color white. Color components are:
     *
     * <pre>
     *     cyan:    0
     *     magenta: 0
     *     yellow:  0
     *     key:     0
     * </pre>
     */
    public static final ColorCmyk WHITE = new ColorCmyk(0, 0, 0, 0);

    /**
     * A constant for color red. Color components are:
     *
     * <pre>
     *     cyan:    0
     *     magenta: 100
     *     yellow:  100
     *     key:     0
     * </pre>
     */
    public static final ColorCmyk RED = new ColorCmyk(0, 100, 100, 0);

    /**
     * A constant for color green. Color components are:
     *
     * <pre>
     *     cyan:    100
     *     magenta: 0
     *     yellow:  100
     *     key:     0
     * </pre>
     */
    public static final ColorCmyk GREEN = new ColorCmyk(100, 0, 100, 0);

    /**
     * A constant for color blue. Color components are:
     *
     * <pre>
     *     cyan:    100
     *     magenta: 100
     *     yellow:  0
     *     key:     0
     * </pre>
     */
    public static final ColorCmyk BLUE = new ColorCmyk(100, 100, 0, 0);

    /** Cyan. */
    public final double c;

    /** Magenta. */
    public final double m;

    /** Yellow. */
    public final double y;

    /** Key. */
    public final double k;

    /**
     * Constructs a new instance.
     *
     * @param c cyan.
     * @param m magenta.
     * @param y yellow.
     * @param k key.
     */
    public ColorCmyk(final double c, final double m, final double y, final double k) {
        this.c = c;
        this.m = m;
        this.y = y;
        this.k = k;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final ColorCmyk colorCmyk = (ColorCmyk) o;
        if (Double.compare(colorCmyk.c, c) != 0) {
            return false;
        }
        if (Double.compare(colorCmyk.k, k) != 0) {
            return false;
        }
        if (Double.compare(colorCmyk.m, m) != 0) {
            return false;
        }
        if (Double.compare(colorCmyk.y, y) != 0) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(c);
        result = (int) (temp ^ temp >>> 32);
        temp = Double.doubleToLongBits(m);
        result = 31 * result + (int) (temp ^ temp >>> 32);
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ temp >>> 32);
        temp = Double.doubleToLongBits(k);
        return 31 * result + (int) (temp ^ temp >>> 32);
    }

    @Override
    public String toString() {
        return "{C: " + c + ", M: " + m + ", Y: " + y + ", K: " + k + "}";
    }
}
