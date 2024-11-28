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
 * The TIFF format specifies two data types for rational numbers based on a pair of 32-bit integers. Rational is based on unsigned 32-bit integers and SRational
 * is based on signed 32-bit integers. This treatment is problematic in Java because Java does not support unsigned types. To address this challenge, this class
 * stores the numerator and divisor in long (64-bit) integers, applying masks as necessary for the unsigned type.
 */
public class RationalNumber extends Number {

    // Constants for Magic Numbers
    private static final long MASK_32_BITS = 0xffffffffL;
    private static final int SHIFT_31_BITS = 31;
    private static final int MAX_ITERATIONS = 100;
    private static final int MAX_FRACTION_DIGITS = 3;
    private static final double TOLERANCE = 1E-8;
    public static final int SHALLOW_SIZE = 32; // Defined to fix the issue

    // Fields
    public final long numerator;
    public final long divisor;
    public final boolean unsignedType;

    // Constructor
    public RationalNumber(final int numerator, final int divisor) {
        this.numerator = numerator;
        this.divisor = divisor;
        this.unsignedType = false;
    }

    public RationalNumber(final int numerator, final int divisor, final boolean unsignedType) {
        this.unsignedType = unsignedType;
        if (unsignedType) {
            this.numerator = numerator & MASK_32_BITS;
            this.divisor = divisor & MASK_32_BITS;
        } else {
            this.numerator = numerator;
            this.divisor = divisor;
        }
    }

    private RationalNumber(final long numerator, final long divisor, final boolean unsignedType) {
        this.numerator = numerator;
        this.divisor = divisor;
        this.unsignedType = unsignedType;
    }

    // Static Factory Method
    static RationalNumber factoryMethod(long n, long d) {
        normalizeBounds(n, d);
        if (d == 0) {
            throw new NumberFormatException("Invalid value, numerator: " + n + ", divisor: " + d);
        }
        final long gcd = computeGCD(n, d);
        return new RationalNumber((int) (n / gcd), (int) (d / gcd));
    }

    private static void normalizeBounds(long n, long d) {
        while (isOutOfBounds(n, d) && Math.abs(n) > 1 && Math.abs(d) > 1) {
            n >>= 1;
            d >>= 1;
        }
    }

    private static boolean isOutOfBounds(long n, long d) {
        return n > Integer.MAX_VALUE || n < Integer.MIN_VALUE || d > Integer.MAX_VALUE || d < Integer.MIN_VALUE;
    }

    private static long computeGCD(final long a, final long b) {
        return (b == 0) ? a : computeGCD(b, a % b);
    }

    public static RationalNumber valueOf(double value) {
        if (value >= Integer.MAX_VALUE) {
            return new RationalNumber(Integer.MAX_VALUE, 1);
        }
        if (value <= -Integer.MAX_VALUE) {
            return new RationalNumber(-Integer.MAX_VALUE, 1);
        }

        boolean negative = value < 0;
        value = Math.abs(value);

        // Determine initial bounds
        RationalNumber low = adjustBounds(value, false);
        RationalNumber high = adjustBounds(value, true);

        // Find the best approximation
        RationalNumber bestApproximation = findBestApproximation(value, low, high);

        return negative ? bestApproximation.negate() : bestApproximation;
    }

    private static RationalNumber findBestApproximation(double value, RationalNumber low, RationalNumber high) {
        Option lowOption = Option.create(low, value);
        Option highOption = Option.create(high, value);

        Option bestOption = lowOption.error < highOption.error ? lowOption : highOption;

        for (int count = 0; bestOption.error > TOLERANCE && count < MAX_ITERATIONS; count++) {
            RationalNumber mediant = createMediant(lowOption, highOption);
            Option mediantOption = Option.create(mediant, value);

            if (value < mediant.doubleValue()) {
                if (highOption.error <= mediantOption.error) break;
                highOption = mediantOption;
            } else {
                if (lowOption.error <= mediantOption.error) break;
                lowOption = mediantOption;
            }

            if (mediantOption.error < bestOption.error) {
                bestOption = mediantOption;
            }
        }

        return bestOption.rationalNumber;
    }

    private static RationalNumber adjustBounds(double value, boolean increase) {
        if (value == 0) return new RationalNumber(0, 1);

        if (value >= 1) {
            int approx = (int) value;
            return increase ? new RationalNumber(approx + 1, 1) : new RationalNumber(approx, 1);
        } else {
            int approx = (int) (1.0 / value);
            return increase ? new RationalNumber(1, approx - 1) : new RationalNumber(1, approx);
        }
    }

    private static RationalNumber createMediant(Option low, Option high) {
        return factoryMethod(
                low.rationalNumber.numerator + high.rationalNumber.numerator,
                low.rationalNumber.divisor + high.rationalNumber.divisor
        );
    }

    // Refactored negate Method
    public RationalNumber negate() {
        long n = numerator;
        long d = divisor;
        if (unsignedType && n >> SHIFT_31_BITS == 1) {
            long gcd = computeGCD(numerator, divisor);
            long adjustedNumerator = numerator / gcd;
            long adjustedDivisor = divisor / gcd;

            if (adjustedNumerator >> SHIFT_31_BITS == 1) {
                throw new NumberFormatException("Unsigned numerator is too large to negate: " + numerator);
            }
            return new RationalNumber(-adjustedNumerator, adjustedDivisor, false);
        }
        return new RationalNumber(-numerator, divisor, false);
    }

    // Utility Methods
    public String toDisplayString() {
        if (numerator % divisor == 0) {
            return Long.toString(numerator / divisor);
        }
        NumberFormat formatter = NumberFormat.getInstance();
        formatter.setMaximumFractionDigits(MAX_FRACTION_DIGITS);
        return formatter.format((double) numerator / divisor);
    }

    @Override
    public String toString() {
        if (divisor == 0) {
            return "Invalid rational (" + numerator + "/" + divisor + ")";
        }
        if (numerator % divisor == 0) {
            return String.valueOf(numerator / divisor);
        }
        return numerator + "/" + divisor + " (" + doubleValue() + ")";
    }

    @Override
    public double doubleValue() {
        return (double) numerator / divisor;
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public int intValue() {
        return (int) (numerator / divisor);
    }

    @Override
    public long longValue() {
        return numerator / divisor;
    }

    // Nested Option Class
    private static final class Option {
        public final RationalNumber rationalNumber;
        public final double error;

        private Option(RationalNumber rationalNumber, double error) {
            this.rationalNumber = rationalNumber;
            this.error = error;
        }

        public static Option create(RationalNumber rationalNumber, double value) {
            return new Option(rationalNumber, Math.abs(rationalNumber.doubleValue() - value));
        }

        @Override
        public String toString() {
            return rationalNumber.toString();
        }
    }
}