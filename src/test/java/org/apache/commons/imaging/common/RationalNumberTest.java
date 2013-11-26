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

import org.apache.commons.imaging.ImagingTest;
import org.apache.commons.imaging.util.Debug;

public class RationalNumberTest extends ImagingTest {

    public void test() {
        final double testValues[] = {
                0, //
                0.1, //
                0.01, //
                0.001, //
                0.0001, //
                0.00001, //
                0.000001, //
                0.0000001, //
                0.123456789, //
                1, //
                0.9, //
                1.1, //
                2.0, //
                123.123, //
                123123123.123, //

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

                -0.1, //
                -0.01, //
                -0.001, //
                -0.0001, //
                -0.00001, //
                -0.000001, //
                -0.0000001, //
                -0.123456789, //
                -1, //
                -0.9, //
                -1.1, //
                -2.0, //
                -123.123, //
                -123123123.123, //

                34, //

                Integer.MAX_VALUE, //
                Integer.MAX_VALUE + 0.1, //
                Integer.MAX_VALUE - 0.1, //
                -(Integer.MAX_VALUE ), //
                -(Integer.MAX_VALUE + 0.1), //
                -(Integer.MAX_VALUE - 0.1), //

                Long.MAX_VALUE, //
                Long.MAX_VALUE + 0.1, //
                Long.MAX_VALUE - 0.1, //
                -(Long.MAX_VALUE ), //
                -(Long.MAX_VALUE + 0.1), //
                -(Long.MAX_VALUE - 0.1), //
        };

        for (final double value : testValues) {
            final RationalNumber rational = RationalNumber.valueOf(value);
            final double difference = Math.abs(value - rational.doubleValue());

            final NumberFormat nf = DecimalFormat.getInstance();
            nf.setMaximumFractionDigits(15);

            Debug.debug("value", nf.format(value));
            Debug.debug("rational", rational);
            Debug.debug("difference", difference);
            Debug.debug();
        }
    }
}
