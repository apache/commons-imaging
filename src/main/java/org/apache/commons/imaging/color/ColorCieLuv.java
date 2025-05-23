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
 * Represents a color in the CIELUV color space.
 *
 * <p>
 * Contains the constant values for black, white, red, green, and blue.
 * </p>
 *
 * @see <a href="https://en.wikipedia.org/wiki/CIELUV">https://en.wikipedia.org/wiki/CIELUV</a>
 * @since 1.0-alpha1
 */
public final class ColorCieLuv {

    /**
     * A constant for color black. Color components are:
     *
     * <pre>
     *     L*: 0.000
     *     u*: 0.000
     *     v*: 0.000
     * </pre>
     */
    public static final ColorCieLuv BLACK = new ColorCieLuv(0, 0, 0);

    /**
     * A constant for color white. Color components are:
     *
     * <pre>
     *     L*: 100.000
     *     u*:   0.000
     *     v*:  -0.017
     * </pre>
     */
    public static final ColorCieLuv WHITE = new ColorCieLuv(100, 0, -0.017);

    /**
     * A constant for color red. Color components are:
     *
     * <pre>
     *     L*:  53.233
     *     u*: 175.053
     *     v*:  37.751
     * </pre>
     */
    public static final ColorCieLuv RED = new ColorCieLuv(53.233, 175.053, 37.751);

    /**
     * A constant for color green. Color components are:
     *
     * <pre>
     *     L*:  87.737
     *     u*: -83.080
     *     v*: 107.401
     * </pre>
     */
    public static final ColorCieLuv GREEN = new ColorCieLuv(87.737, -83.080, 107.401);

    /**
     * A constant for color blue. Color components are:
     *
     * <pre>
     *     L*:   32.303
     *     u*:   -9.400
     *     v*: -130.358
     * </pre>
     */
    public static final ColorCieLuv BLUE = new ColorCieLuv(32.303, -9.400, -130.358);

    /** Luminance L*. */
    public final double l;

    /** Chromaticity component u*. */
    public final double u;

    /** Chromaticity component v*. */
    public final double v;

    /**
     * Constructs a new instance.
     *
     * @param l Luminance L*.
     * @param u Chromaticity component u*.
     * @param v Chromaticity component v*.
     */
    public ColorCieLuv(final double l, final double u, final double v) {
        this.l = l;
        this.u = u;
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

        final ColorCieLuv that = (ColorCieLuv) o;
        if (Double.compare(that.l, l) != 0) {
            return false;
        }
        if (Double.compare(that.u, u) != 0) {
            return false;
        }
        if (Double.compare(that.v, v) != 0) {
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
        temp = Double.doubleToLongBits(u);
        result = 31 * result + (int) (temp ^ temp >>> 32);
        temp = Double.doubleToLongBits(v);
        return 31 * result + (int) (temp ^ temp >>> 32);
    }

    @Override
    public String toString() {
        return "{L: " + l + ", u: " + u + ", v: " + v + "}";
    }
}
