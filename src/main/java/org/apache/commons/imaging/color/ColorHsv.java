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
 * Represents a color in the HSV color space.
 *
 * <p>
 * Contains the constant values for black, white, red, green, blue, cyan, magenta, and yellow.
 * </p>
 *
 * @see <a href="https://en.wikipedia.org/wiki/HSL_and_HSV">https://en.wikipedia.org/wiki/HSL_and_HSV</a>
 * @since 1.0-alpha1
 */
public final class ColorHsv {

    /**
     * A constant for color black. Color components are:
     *
     * <pre>
     *     Hue:        0
     *     Saturation: 0
     *     Value:      0
     * </pre>
     */
    public static final ColorHsv BLACK = new ColorHsv(0, 0, 0);

    /**
     * A constant for color white. Color components are:
     *
     * <pre>
     *     Hue:        0
     *     Saturation: 0
     *     Value:      100
     * </pre>
     */
    public static final ColorHsv WHITE = new ColorHsv(0, 0, 100);

    /**
     * A constant for color red. Color components are:
     *
     * <pre>
     *     Hue:        0
     *     Saturation: 100
     *     Value:      100
     * </pre>
     */
    public static final ColorHsv RED = new ColorHsv(0, 100, 100);

    /**
     * A constant for color green. Color components are:
     *
     * <pre>
     *     Hue:        120
     *     Saturation: 100
     *     Value:      100
     * </pre>
     */
    public static final ColorHsv GREEN = new ColorHsv(120, 100, 100);

    /**
     * A constant for color blue. Color components are:
     *
     * <pre>
     *     Hue:        240
     *     Saturation: 100
     *     Value:      100
     * </pre>
     */
    public static final ColorHsv BLUE = new ColorHsv(240, 100, 100);

    public final double h;
    public final double s;
    public final double v;

    public ColorHsv(final double h, final double s, final double v) {
        this.h = h;
        this.s = s;
        this.v = v;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final ColorHsv colorHsv = (ColorHsv) o;
        if (Double.compare(colorHsv.h, h) != 0) {
            return false;
        }
        if (Double.compare(colorHsv.s, s) != 0) {
            return false;
        }
        if (Double.compare(colorHsv.v, v) != 0) {
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
        temp = Double.doubleToLongBits(v);
        return 31 * result + (int) (temp ^ temp >>> 32);
    }

    @Override
    public String toString() {
        return "{H: " + h + ", S: " + s + ", V: " + v + "}";
    }
}
