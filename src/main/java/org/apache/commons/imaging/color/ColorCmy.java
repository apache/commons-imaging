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
 * Represents a color in the CMY color space.
 *
 * <p>Contains the constant values for black, white, red,
 * green, blue, cyan, magenta, and yellow.</p>
 *
 * @see <a href="https://en.wikipedia.org/wiki/CMY_color_model">https://en.wikipedia.org/wiki/CMY_color_model</a>
 * @since 1.0-alpha1
 */
public final class ColorCmy {

    /**
     * A constant for color cyan. Color components are:
     * <pre>
     *     cyan:    100
     *     magenta: 0
     *     yellow:  0
     * </pre>
     */
    public static final ColorCmy CYAN = new ColorCmy(100, 0, 0);

    /**
     * A constant for color magenta. Color components are:
     * <pre>
     *     cyan:    0
     *     magenta: 100
     *     yellow:  0
     * </pre>
     */
    public static final ColorCmy MAGENTA = new ColorCmy(0, 100, 0);

    /**
     * A constant for color yellow. Color components are:
     * <pre>
     *     cyan:    0
     *     magenta: 0
     *     yellow:  100
     * </pre>
     */
    public static final ColorCmy YELLOW = new ColorCmy(0, 0, 100);

    /**
     * A constant for color black. Color components are:
     * <pre>
     *     cyan:    100
     *     magenta: 100
     *     yellow:  100
     * </pre>
     */
    public static final ColorCmy BLACK = new ColorCmy(100, 100, 100);

    /**
     * A constant for color white. Color components are:
     * <pre>
     *     cyan:    0
     *     magenta: 0
     *     yellow:  0
     * </pre>
     */
    public static final ColorCmy WHITE = new ColorCmy(0, 0, 0);

    /**
     * A constant for color red. Color components are:
     * <pre>
     *     cyan:    0
     *     magenta: 100
     *     yellow:  100
     * </pre>
     */
    public static final ColorCmy RED = new ColorCmy(0, 100, 100);

    /**
     * A constant for color green. Color components are:
     * <pre>
     *     cyan:    100
     *     magenta: 0
     *     yellow:  100
     * </pre>
     */
    public static final ColorCmy GREEN = new ColorCmy(100, 0, 100);

    /**
     * A constant for color blue. Color components are:
     * <pre>
     *     cyan:    100
     *     magenta: 100
     *     yellow:  0
     * </pre>
     */
    public static final ColorCmy BLUE = new ColorCmy(100, 100, 0);

    public final double C;
    public final double M;
    public final double Y;

    public ColorCmy(final double C, final double M, final double Y) {
        this.C = C;
        this.M = M;
        this.Y = Y;
    }

    @Override
    public String toString() {
        return "{C: " + C + ", M: " + M + ", Y: " + Y + "}";
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final ColorCmy colorCmy = (ColorCmy) o;
        if (Double.compare(colorCmy.C, C) != 0) {
            return false;
        }
        if (Double.compare(colorCmy.M, M) != 0) {
            return false;
        }
        if (Double.compare(colorCmy.Y, Y) != 0) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(C);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(M);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(Y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
