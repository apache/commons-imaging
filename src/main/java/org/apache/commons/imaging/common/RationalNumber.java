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
 * <p>
 * The TIFF format specifies two data types for rational numbers based on
 * a pair of 32-bit integers.  Rational is based on unsigned 32-bit integers
 * and SRational is based on signed 32-bit integers.  This treatment is
 * problematic in Java because Java does not support unsigned types.
 * Type address this challenge, this class stores the numerator and divisor
 * in long (64-bit) integers, applying masks as necessary for the unsigned
 * type.
 */
public class RationalNumber extends Number {

    private static final long serialVersionUID = -8412262656468158691L;

    // int-precision tolerance
    private static final double TOLERANCE = 1E-8;

    // The TIFF and EXIF specifications call for the use
    // of 32 bit unsigned integers.  Since Java does not have an
    // unsigned type, this class widens the type to long in order
    // to avoid unintended negative numbers.
    public final long numerator;
    public final long divisor;
    public final boolean unsignedType;

    /**
     * Constructs an instance based on signed integers
     * @param numerator a 32-bit signed integer
     * @param divisor a non-zero 32-bit signed integer
     */
    public RationalNumber(final int numerator, final int divisor) {
        this.numerator = numerator;
        this.divisor = divisor;
        this.unsignedType = false;
    }

    /**
     * Constructs an instance supports either signed or unsigned integers.
     * @param numerator a numerator in the indicated form (signed or unsigned)
     * @param divisor a non-zero divisor in the indicated form (signed or unsigned)
     * @param unsignedType indicates whether the input values are to be treated
     * as unsigned.
     */
    public RationalNumber(final int numerator, final int divisor, final boolean unsignedType) {
        this.unsignedType = unsignedType;
        if (unsignedType) {
            this.numerator = numerator & 0xffffffffL;
            this.divisor = divisor & 0xffffffffL;
        } else {
            this.numerator = numerator;
            this.divisor = divisor;
        }
    }

    /**
     * A private constructor for methods such as negate() that create instances
     * of this class using the content of the current instance.
     * @param numerator a valid numerator
     * @param divisor a valid denominator
     * @param unsignedType indicates how numerator and divisor values
     * are to be interpreted.
     */
    private RationalNumber(final long numerator, final long divisor, boolean unsignedType){
        this.numerator = numerator;
        this.divisor   = divisor;
        this.unsignedType = unsignedType;
    }

    static RationalNumber factoryMethod(long n, long d) {
        // safer than constructor - handles values outside min/max range.
        // also does some simple finding of common denominators.

        if (n > Integer.MAX_VALUE || n < Integer.MIN_VALUE
                || d > Integer.MAX_VALUE || d < Integer.MIN_VALUE) {
            while ((n > Integer.MAX_VALUE || n < Integer.MIN_VALUE
                    || d > Integer.MAX_VALUE || d < Integer.MIN_VALUE)
                    && (Math.abs(n) > 1) && (Math.abs(d) > 1)) {
                // brutal, imprecise truncation =(
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
        }
        return gcd(b, a % b);
    }

    /**
     * Negates the value of the RationalNumber. If the numerator of this
     * instance has its high-order bit set, then its value is too large
     * to be treated as a Java 32-bit signed integer.  In such a case, the
     * only way that a RationalNumber instance can be negated is to
     * sacrifice one bit of precision by dividing both the numerator and
     * the denominator by 2. However, if that computation would result
     * in a zero denominator, then the value cannot be negated and an
     * exception is thrown.
     * @return a valid instance with a negated value.
     */
    public RationalNumber negate() {
        long n = numerator;
        long d = divisor;
        if (unsignedType) {
            // An instance of an unsigned type can be negated if and only if
            // its high-order bit (the sign bit) is clear. If the bit is set,
            // it is necessary to adjust the
            if ((n >> 31) == 1) {
                // the unsigned value is so large that the high-order bit is set
                // it cannot be converted to a negative number.  But perhaps
                // there is an option to reduce its magnitude.
                long g = gcd(numerator, divisor);
                if (g != 0) {
                    n /= g;
                    d /= g;
                }
                if ((n >> 31) == 1) {
                    throw new NumberFormatException(
                            "Unsigned numerator is too large to negate "
                            + numerator);
                }
            }
        }
        return new RationalNumber(-n, d, false);
    }

    @Override
    public double doubleValue() {
        return (double) numerator / (double) divisor;
    }

    @Override
    public float floatValue() {
        // The computation uses double value in order to preserve
        // as much of the precision of the source numerator and denominator
        // as possible.  Note that the expression
        //    return (float)numerator/(float) denominator
        // could lose precision since a Java float only carries 24 bits
        // of precision while an integer carries 32.
        return (float) doubleValue();
    }

    @Override
    public int intValue() {
        return (int)(numerator / divisor);
    }

    @Override
    public long longValue() {
        return numerator / divisor;
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
            return Long.toString(numerator / divisor);
        }
        final NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(3);
        return nf.format((double) numerator / (double) divisor);
    }

    private static final class Option {
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
     *
     * @param value rational number double value
     * @return the RationalNumber representation of the double value
     */
    public static RationalNumber valueOf(double value) {
        if (value >= Integer.MAX_VALUE) {
            return new RationalNumber(Integer.MAX_VALUE, 1);
        }
        if (value <= -Integer.MAX_VALUE) {
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
        }
        if (value >= 1) {
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

        final int maxIterations = 100; // value is quite high, actually.
                                       // shouldn't matter.
        for (int count = 0; bestOption.error > TOLERANCE
                && count < maxIterations; count++) {
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
