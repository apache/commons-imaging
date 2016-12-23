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

public final class ColorHsl {

    /**
     * A constant for color black. Color components are:
     * <pre>
     *     Hue:        0
     *     Saturation: 0
     *     Lightness:  0
     * </pre>
     */
    public static final ColorHsl BLACK = new ColorHsl(0, 0, 0);

    /**
     * A constant for color white. Color components are:
     * <pre>
     *     Hue:        0
     *     Saturation: 0
     *     Lightness:  100
     * </pre>
     */
    public static final ColorHsl WHITE = new ColorHsl(0, 0, 100);

    /**
     * A constant for color red. Color components are:
     * <pre>
     *     Hue:        0
     *     Saturation: 100
     *     Lightness:  100
     * </pre>
     */
    public static final ColorHsl RED = new ColorHsl(0, 100, 100);

    /**
     * A constant for color green. Color components are:
     * <pre>
     *     Hue:        120
     *     Saturation: 100
     *     Lightness:  100
     * </pre>
     */
    public static final ColorHsl GREEN = new ColorHsl(120, 100, 100);

    /**
     * A constant for color blue. Color components are:
     * <pre>
     *     Hue:        240
     *     Saturation: 100
     *     Lightness:  100
     * </pre>
     */
    public static final ColorHsl BLUE = new ColorHsl(240, 100, 100);

    public final double H;
    public final double S;
    public final double L;

    public ColorHsl(final double H, final double S, final double L) {
        this.H = H;
        this.S = S;
        this.L = L;
    }

    @Override
    public String toString() {
        return "{H: " + H + ", S: " + S + ", L: " + L + "}";
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
        if (Double.compare(colorHsl.H, H) != 0) {
            return false;
        }
        if (Double.compare(colorHsl.L, L) != 0) {
            return false;
        }
        if (Double.compare(colorHsl.S, S) != 0) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(H);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(S);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(L);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
