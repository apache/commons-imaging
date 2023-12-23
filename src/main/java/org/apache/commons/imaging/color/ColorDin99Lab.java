/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.imaging.color;

/**
 * Represents a color in the DIN99 color space, a derivation of the CIE LAB color space.
 *
 * @see <a href="de.wikipedia.org/wiki/DIN99-Farbraum">de.wikipedia.org/wiki/DIN99-Farbraum</a>
 * @see <a href= "https://pdfs.semanticscholar.org/647b/20bda458133ff2b883041746bc8cb75527fc.pdf">Comparison of the metrics between the CIELAB and the DIN99
 *      uniform color spaces</a>
 * @see <a href="https://www.researchgate.net/publication/229891006_Uniform_colour_spaces_based_on_the_DIN99_colour-difference_formula">DIN99b P.284:
 *      Uniform_colour_spaces_based_on_the_DIN99_colour-difference_formula</a>
 * @since 1.0-alpha3
 */
public final class ColorDin99Lab {

    public final double l99;

    public final double a99;

    public final double b99;

    public ColorDin99Lab(final double l99, final double a99, final double b99) {
        this.l99 = l99;
        this.a99 = a99;
        this.b99 = b99;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final ColorDin99Lab that = (ColorDin99Lab) o;
        if (Double.compare(that.l99, l99) != 0) {
            return false;
        }
        if (Double.compare(that.a99, a99) != 0) {
            return false;
        }
        if (Double.compare(that.b99, b99) != 0) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(l99);
        result = (int) (temp ^ temp >>> 32);
        temp = Double.doubleToLongBits(a99);
        result = 31 * result + (int) (temp ^ temp >>> 32);
        temp = Double.doubleToLongBits(b99);
        result = 31 * result + (int) (temp ^ temp >>> 32);
        return result;
    }

    @Override
    public String toString() {
        return "{l: " + l99 + ", a: " + a99 + ", b: " + b99 + "}";
    }
}
