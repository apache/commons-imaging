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
 * Represents a color in the CIE 1931 color space, also known as XYZ color space.
 *
 * <p>
 * Contains the constant values for black, white, red, green, and blue.
 * </p>
 *
 * @see <a href="https://en.wikipedia.org/wiki/CIE_1931_color_space">https://en.wikipedia.org/wiki/CIE_1931_color_space</a>
 * @since 1.0-alpha1
 */
public final class ColorXyz {

    /**
     * A constant for color black. Color components are:
     *
     * <pre>
     *     X: 0
     *     Y: 0
     *     Z: 0
     * </pre>
     */
    public static final ColorXyz BLACK = new ColorXyz(0, 0, 0);

    /**
     * A constant for color white. Color components are:
     *
     * <pre>
     *     X:  95.05
     *     Y: 100.00
     *     Z: 108.90
     * </pre>
     */
    public static final ColorXyz WHITE = new ColorXyz(95.05, 100, 108.9);

    /**
     * A constant for color red. Color components are:
     *
     * <pre>
     *     X: 41.24
     *     Y: 21.26
     *     Z:  1.93
     * </pre>
     */
    public static final ColorXyz RED = new ColorXyz(41.24, 21.26, 1.93);

    /**
     * A constant for color green. Color components are:
     *
     * <pre>
     *     X: 35.76
     *     Y: 71.52
     *     Z: 11.92
     * </pre>
     */
    public static final ColorXyz GREEN = new ColorXyz(35.76, 71.52, 11.92);

    /**
     * A constant for color blue. Color components are:
     *
     * <pre>
     *     X: 18.05
     *     Y:  7.22
     *     Z: 95.05
     * </pre>
     */
    public static final ColorXyz BLUE = new ColorXyz(18.05, 7.22, 95.05);

    public final double x;
    public final double y;
    public final double z;

    public ColorXyz(final double x, final double y, final double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final ColorXyz colorXyz = (ColorXyz) o;
        if (Double.compare(colorXyz.x, x) != 0) {
            return false;
        }
        if (Double.compare(colorXyz.y, y) != 0) {
            return false;
        }
        if (Double.compare(colorXyz.z, z) != 0) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = (int) (temp ^ temp >>> 32);
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ temp >>> 32);
        temp = Double.doubleToLongBits(z);
        result = 31 * result + (int) (temp ^ temp >>> 32);
        return result;
    }

    @Override
    public String toString() {
        return "{X: " + x + ", Y: " + y + ", Z: " + z + "}";
    }
}
