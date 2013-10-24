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
package org.apache.commons.imaging.common;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Rational number, as used by the TIFF image format.
 */
public class RationalNumber extends Number {
    private static final long serialVersionUID = -1;

    public final int numerator;
    public final int divisor;

    public RationalNumber(final int numerator, final int divisor) {
        this.numerator = numerator;
        this.divisor = divisor;
    }

    public static final RationalNumber factoryMethod(long n, long d) {
        // safer than constructor - handles values outside min/max range.
        // also does some simple finding of common denominators.

        if (n > Integer.MAX_VALUE || n < Integer.MIN_VALUE
                || d > Integer.MAX_VALUE || d < Integer.MIN_VALUE) {
            while ((n > Integer.MAX_VALUE || n < Integer.MIN_VALUE
                    || d > Integer.MAX_VALUE || d < Integer.MIN_VALUE)
                    && (Math.abs(n) > 1) && (Math.abs(d) > 1)) {
                // brutal, inprecise truncation =(
                // use the sign-preserving right shift operator.
                n >>= 1;
                d >>= 1;
            }

            if (d == 0) {
                throw new NumberFormatException("Invalid value, numerator: "
                        + n + ", divisor: " + d);
            }
        }

        final long gcd = gcd(n, d);
        d = d / gcd;
        n = n / gcd;

        return new RationalNumber((int) n, (int) d);
    }

    /**
     * Return the greatest common divisor
     */
    private static long gcd(final long a, final long b) {

        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public RationalNumber negate() {
        return new RationalNumber(-numerator, divisor);
    }

    @Override
    public double doubleValue() {
        return (double) numerator / (double) divisor;
    }

    @Override
    public float floatValue() {
        return (float) numerator / (float) divisor;
    }

    @Override
    public int intValue() {
        return numerator / divisor;
    }

    @Override
    public long longValue() {
        return (long) numerator / (long) divisor;
    }

    public boolean isValid() {
        return divisor != 0;
    }

    @Override
    public String toString() {
        if (divisor == 0) {
            return "Invalid rational (" + numerator + "/" + divisor + ")";
        }
        final NumberFormat nf = NumberFormat.getInstance();

        if ((numerator % divisor) == 0) {
            return nf.format(numerator / divisor);
        }
        return numerator + "/" + divisor + " ("
                + nf.format((double) numerator / divisor) + ")";
    }

    public String toDisplayString() {
        if ((numerator % divisor) == 0) {
            return "" + (numerator / divisor);
        }
        final NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(3);
        return nf.format((double) numerator / (double) divisor);
    }
}
