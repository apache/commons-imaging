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

public final class ColorCieLch {

    /**
     * A constant for color black. Color components are:
     * <pre>
     *     L: 0
     *     c: 0
     *     h: 0
     * </pre>
     */
    public static final ColorCieLch BLACK = new ColorCieLch(0, 0, 0);

    /**
     * A constant for color white. Color components are:
     * <pre>
     *     L: 100
     *     c:   0
     *     h: 297
     * </pre>
     */
    public static final ColorCieLch WHITE = new ColorCieLch(100, 0, 297);

    /**
     * A constant for color red. Color components are:
     * <pre>
     *     L: 53
     *     c: 80
     *     h: 67
     * </pre>
     */
    public static final ColorCieLch RED = new ColorCieLch(53, 80, 67);

    /**
     * A constant for color green. Color components are:
     * <pre>
     *     L:  88
     *     c: -86
     *     h:  83
     * </pre>
     */
    public static final ColorCieLch GREEN = new ColorCieLch(88, -86, 83);

    /**
     * A constant for color blue. Color components are:
     * <pre>
     *     L:   32
     *     c:   79
     *     h: -108
     * </pre>
     */
    public static final ColorCieLch BLUE = new ColorCieLch(32, 79, -108);

    public final double L;
    public final double C;
    public final double H;

    public ColorCieLch(final double L, final double C, final double H) {
        this.L = L;
        this.C = C;
        this.H = H;
    }

    @Override
    public String toString() {
        return "{L: " + L + ", C: " + C + ", H: " + H + "}";
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ColorCieLch that = (ColorCieLch) o;
        if (Double.compare(that.C, C) != 0) {
            return false;
        }
        if (Double.compare(that.H, H) != 0) {
            return false;
        }
        if (Double.compare(that.L, L) != 0) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(L);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(C);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(H);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
