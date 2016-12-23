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

public final class ColorCmyk {

    /**
     * A constant for color cyan. Color components are:
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
     * <pre>
     *     cyan:    100
     *     magenta: 100
     *     yellow:  0
     *     key:     0
     * </pre>
     */
    public static final ColorCmyk BLUE = new ColorCmyk(100, 100, 0, 0);

    public final double C;
    public final double M;
    public final double Y;
    public final double K;

    public ColorCmyk(final double C, final double M, final double Y, final double K) {
        this.C = C;
        this.M = M;
        this.Y = Y;
        this.K = K;
    }

    @Override
    public String toString() {
        return "{C: " + C + ", M: " + M + ", Y: " + Y + ", K: " + K + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ColorCmyk colorCmyk = (ColorCmyk) o;
        if (Double.compare(colorCmyk.C, C) != 0) {
            return false;
        }
        if (Double.compare(colorCmyk.K, K) != 0) {
            return false;
        }
        if (Double.compare(colorCmyk.M, M) != 0) {
            return false;
        }
        if (Double.compare(colorCmyk.Y, Y) != 0) {
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
        temp = Double.doubleToLongBits(K);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
