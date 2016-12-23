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

public final class ColorHunterLab {

    /**
     * A constant for color black. Color components are:
     * <pre>
     *     L: 0
     *     a: 0
     *     b: 0
     * </pre>
     */
    public static final ColorHunterLab BLACK = new ColorHunterLab(0, 0, 0);

    /**
     * A constant for color white. Color components are:
     * <pre>
     *     L: 100.000
     *     a:  -5.336
     *     b:   5.433
     * </pre>
     */
    public static final ColorHunterLab WHITE = new ColorHunterLab(100, -5.336, 5.433);

    /**
     * A constant for color red. Color components are:
     * <pre>
     *     L: 46.109
     *     a: 78.962
     *     b: 29.794
     * </pre>
     */
    public static final ColorHunterLab RED = new ColorHunterLab(46.109, 78.962, 29.794);

    /**
     * A constant for color green. Color components are:
     * <pre>
     *     L:  84.569
     *     a: -72.518
     *     b:  50.842
     * </pre>
     */
    public static final ColorHunterLab GREEN = new ColorHunterLab(84.569, -72.518, 50.842);

    /**
     * A constant for color blue. Color components are:
     * <pre>
     *     L:   26.870
     *     a:   72.885
     *     b: -190.923
     * </pre>
     */
    public static final ColorHunterLab BLUE = new ColorHunterLab(26.870, 72.885, -190.923);

    public final double L;
    public final double a;
    public final double b;

    public ColorHunterLab(final double L, final double a, final double b) {
        this.L = L;
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "{L: " + L + ", a: " + a + ", b: " + b + "}";
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final ColorHunterLab that = (ColorHunterLab) o;
        if (Double.compare(that.L, L) != 0) {
            return false;
        }
        if (Double.compare(that.a, a) != 0) {
            return false;
        }
        if (Double.compare(that.b, b) != 0) {
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
        temp = Double.doubleToLongBits(a);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(b);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
