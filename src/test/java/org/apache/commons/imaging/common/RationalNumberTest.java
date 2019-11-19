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
import java.util.Arrays;
import java.util.stream.Stream;

import org.apache.commons.imaging.ImagingTest;
import org.apache.commons.imaging.internal.Debug;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RationalNumberTest extends ImagingTest {

    public static Stream<Double> data() {
        return Arrays.<Double> asList(
                0d, //
                0.1d, //
                0.01d, //
                0.001d, //
                0.0001d, //
                0.00001d, //
                0.000001d, //
                0.0000001d, //
                0.123456789d, //
                1d, //
                0.9d, //
                1.1d, //
                2.0d, //
                123.123d, //
                123123123.123d, //

                (double) 123 / 45678, //
                (double) 12 / 34, //
                (double) 1 / 2, //
                (double) 1 / 3, //
                (double) 1 / 4, //
                (double) 1 / 5, //
                (double) 1 / 6, //
                (double) 1 / 7, //
                (double) 1 / 8, //
                (double) 1 / 9, //
                (double) 3 / 2, //
                (double) 2 / 3, //
                (double) 3 / 4, //
                (double) 4 / 5, //
                (double) 5 / 6, //
                (double) 6 / 7, //
                (double) 7 / 8, //
                (double) 8 / 9, //
                (double) 3 / 5, //
                (double) 3 / 6, //
                (double) 3 / 7, //
                (double) 3 / 8, //
                (double) 3 / 9, //

                -0.1d, //
                -0.01d, //
                -0.001d, //
                -0.0001d, //
                -0.00001d, //
                -0.000001d, //
                -0.0000001d, //
                -0.123456789d, //
                -1d, //
                -0.9d, //
                -1.1d, //
                -2.0d, //
                -123.123d, //
                -123123123.123d, //

                34d, //

                (double) Integer.MAX_VALUE, //
                Integer.MAX_VALUE + 0.1, //
                Integer.MAX_VALUE - 0.1, //
                (double) -(Integer.MAX_VALUE), //
                -(Integer.MAX_VALUE + 0.1), //
                -(Integer.MAX_VALUE - 0.1), //

                (double) Long.MAX_VALUE, //
                Long.MAX_VALUE + 0.1, //
                Long.MAX_VALUE - 0.1, //
                (double) -(Long.MAX_VALUE), //
                -(Long.MAX_VALUE + 0.1), //
                -(Long.MAX_VALUE - 0.1) //
        ).stream();
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testRationalNumber(double testValue) {
        final RationalNumber rational = RationalNumber.valueOf(testValue);
        final double difference = Math.abs(testValue - rational.doubleValue());

        final NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(15);

        // TODO assert something here, the following will fail for some values. Do we have a bug?
        // assertEquals(0.0, difference, 0.0d);
        Debug.debug("value: " + nf.format(testValue));
        Debug.debug("rational: " + rational);
        Debug.debug("difference: " + difference);
        Debug.debug();
    }

}
