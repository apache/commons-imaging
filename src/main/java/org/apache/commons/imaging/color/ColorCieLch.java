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
 * Represents a color in the CIELCH color space.
 *
 * <p>
 * Contains the constant values for black, white, red, green, and blue.
 * </p>
 *
 * @see <a href=
 *      "https://en.wikipedia.org/wiki/CIELUV#Cylindrical_representation_(CIELCH)">https://en.wikipedia.org/wiki/CIELUV#Cylindrical_representation_(CIELCH)</a>
 * @since 1.0-alpha1
 */
public final class ColorCieLch {

    /**
     * A constant for color black. Color components are:
     *
     * <pre>
     *     L*: 0
     *     C*: 0
     *     h: 0
     * </pre>
     */
    public static final ColorCieLch BLACK = new ColorCieLch(0, 0, 0);

    /**
     * A constant for color white. Color components are:
     *
     * <pre>
     *     L*: 100
     *     C*:   0
     *     h: 297
     * </pre>
     */
    public static final ColorCieLch WHITE = new ColorCieLch(100, 0, 297);

    /**
     * A constant for color red. Color components are:
     *
     * <pre>
     *     L*: 53
     *     C*: 80
     *     h: 67
     * </pre>
     */
    public static final ColorCieLch RED = new ColorCieLch(53, 80, 67);

    /**
     * A constant for color green. Color components are:
     *
     * <pre>
     *     L*:  88
     *     C*: -86
     *     h:  83
     * </pre>
     */
    public static final ColorCieLch GREEN = new ColorCieLch(88, -86, 83);

    /**
     * A constant for color blue. Color components are:
     *
     * <pre>
     *     L*:   32
     *     C*:   79
     *     h: -108
     * </pre>
     */
    public static final ColorCieLch BLUE = new ColorCieLch(32, 79, -108);

    /** L* lightness. */
    public final double l;

    /** C* chroma. */
    public final double c;

    /** Hue. */
    public final double h;

    /**
     * Constructs a new instance.
     *
     * @param l L* lightness.
     * @param c chroma.
     * @param h hue.
     */
    public ColorCieLch(final double l, final double c, final double h) {
        this.l = l;
        this.c = c;
        this.h = h;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final ColorCieLch that = (ColorCieLch) o;
        if (Double.compare(that.c, c) != 0) {
            return false;
        }
        if (Double.compare(that.h, h) != 0) {
            return false;
        }
        if (Double.compare(that.l, l) != 0) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(l);
        result = (int) (temp ^ temp >>> 32);
        temp = Double.doubleToLongBits(c);
        result = 31 * result + (int) (temp ^ temp >>> 32);
        temp = Double.doubleToLongBits(h);
        return 31 * result + (int) (temp ^ temp >>> 32);
    }

    @Override
    public String toString() {
        return "{L: " + l + ", C: " + c + ", h: " + h + "}";
    }
}
