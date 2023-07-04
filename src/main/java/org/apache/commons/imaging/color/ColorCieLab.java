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
 * Represents a color in the CIELAB color space, also
 * known as LAB color space.
 *
 * <p>Contains the constant values for black, white, red,
 * green, and blue.</p>
 *
 * @see <a href="https://en.wikipedia.org/wiki/CIELAB_color_space#CIELAB">https://en.wikipedia.org/wiki/CIELAB_color_space#CIELAB</a>
 * @since 1.0-alpha1
 */
public final class ColorCieLab {

    /**
     * A constant for color black. Color components are:
     * <pre>
     *     L: 0
     *     a: 0
     *     b: 0
     * </pre>
     */
    public static final ColorCieLab BLACK = new ColorCieLab(0, 0, 0);

    /**
     * A constant for color white. Color components are:
     * <pre>
     *     L: 100
     *     a: 0
     *     b: 0
     * </pre>
     */
    public static final ColorCieLab WHITE = new ColorCieLab(100, 0, 0);

    /**
     * A constant for color red. Color components are:
     * <pre>
     *     L: 53
     *     a: 80
     *     b: 67
     * </pre>
     */
    public static final ColorCieLab RED = new ColorCieLab(53, 80, 67);

    /**
     * A constant for color green. Color components are:
     * <pre>
     *     L:  88
     *     a: -86
     *     b:  83
     * </pre>
     */
    public static final ColorCieLab GREEN = new ColorCieLab(88, -86, 83);

    /**
     * A constant for color blue. Color components are:
     * <pre>
     *     L:   32
     *     a:   79
     *     b: -108
     * </pre>
     */
    public static final ColorCieLab BLUE = new ColorCieLab(32, 79, -108);

    public final double l;
    public final double a;
    public final double b;

    public ColorCieLab(final double l, final double a, final double b) {
        this.l = l;
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final ColorCieLab that = (ColorCieLab) o;
        if (Double.compare(that.l, l) != 0) {
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
        temp = Double.doubleToLongBits(l);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(a);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(b);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "{L: " + l + ", a: " + a + ", b: " + b + "}";
    }
}
