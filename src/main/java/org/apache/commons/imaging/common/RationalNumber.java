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

import java.text.NumberFormat;

/**
 * Rational number, as used by the TIFF image format.
 */
public class RationalNumber extends Number {

    private static final long serialVersionUID = -8412262656468158691L;    

    // int-precision tolerance
    private static final double TOLERANCE = 1E-8;

    public final int numerator;
    public final int divisor;

    public RationalNumber(final int numerator, final int divisor) {
        this.numerator = numerator;
        this.divisor = divisor;
    }

    static RationalNumber factoryMethod(long n, long d) {
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
                throw new NumberFormatException("Invalid value, numerator: " + n + ", divisor: " + d);
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

    @Override
    public String toString() {
        if (divisor == 0) {
            return "Invalid rational (" + numerator + "/" + divisor + ")";
        }
        final NumberFormat nf = NumberFormat.getInstance();

        if ((numerator % divisor) == 0) {
            return nf.format(numerator / divisor);
        }
        return numerator + "/" + divisor + " (" + nf.format((double) numerator / divisor) + ")";
    }

    public String toDisplayString() {
        if ((numerator % divisor) == 0) {
            return Integer.toString(numerator / divisor);
        }
        final NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(3);
        return nf.format((double) numerator / (double) divisor);
    }
    

    private static class Option {
        public final RationalNumber rationalNumber;
        public final double error;

        private Option(final RationalNumber rationalNumber, final double error) {
            this.rationalNumber = rationalNumber;
            this.error = error;
        }

        public static Option factory(final RationalNumber rationalNumber, final double value) {
            return new Option(rationalNumber, Math.abs(rationalNumber .doubleValue() - value));
        }

        @Override
        public String toString() {
            return rationalNumber.toString();
        }
    }

    /**
     * Calculate rational number using successive approximations.
     */
    public static RationalNumber valueOf(double value) {
        if (value >= Integer.MAX_VALUE) {
            return new RationalNumber(Integer.MAX_VALUE, 1);
        } else if (value <= -Integer.MAX_VALUE) {
            return new RationalNumber(-Integer.MAX_VALUE, 1);
        }

        boolean negative = false;
        if (value < 0) {
            negative = true;
            value = Math.abs(value);
        }

        RationalNumber l;
        RationalNumber h;

        if (value == 0) {
            return new RationalNumber(0, 1);
        } else if (value >= 1) {
            final int approx = (int) value;
            if (approx < value) {
                l = new RationalNumber(approx, 1);
                h = new RationalNumber(approx + 1, 1);
            } else {
                l = new RationalNumber(approx - 1, 1);
                h = new RationalNumber(approx, 1);
            }
        } else {
            final int approx = (int) (1.0 / value);
            if ((1.0 / approx) < value) {
                l = new RationalNumber(1, approx);
                h = new RationalNumber(1, approx - 1);
            } else {
                l = new RationalNumber(1, approx + 1);
                h = new RationalNumber(1, approx);
            }
        }
        Option low = Option.factory(l, value);
        Option high = Option.factory(h, value);

        Option bestOption = (low.error < high.error) ? low : high;

        final int MAX_ITERATIONS = 100; // value is quite high, actually.
                                        // shouldn't matter.
        for (int count = 0; bestOption.error > TOLERANCE
                && count < MAX_ITERATIONS; count++) {
            final RationalNumber mediant = RationalNumber.factoryMethod(
                    (long) low.rationalNumber.numerator
                            + (long) high.rationalNumber.numerator,
                    (long) low.rationalNumber.divisor
                            + (long) high.rationalNumber.divisor);
            final Option mediantOption = Option.factory(mediant, value);

            if (value < mediant.doubleValue()) {
                if (high.error <= mediantOption.error) {
                    break;
                }

                high = mediantOption;
            } else {
                if (low.error <= mediantOption.error) {
                    break;
                }

                low = mediantOption;
            }

            if (mediantOption.error < bestOption.error) {
                bestOption = mediantOption;
            }
        }

        return negative ? bestOption.rationalNumber.negate()
                : bestOption.rationalNumber;
    }

}
