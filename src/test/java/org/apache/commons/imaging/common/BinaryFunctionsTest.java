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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class BinaryFunctionsTest {
    @ParameterizedTest
    @ValueSource(ints = {Integer.MIN_VALUE, -1, 6, Integer.MAX_VALUE})
    void testSlice_Invalid(int length) {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> BinaryFunctions.slice(new byte[5], -4, length));
        assertEquals("Invalid start or count", e.getMessage());

        e = assertThrows(IllegalArgumentException.class, () -> BinaryFunctions.slice(new byte[5], 0, length));
        assertEquals("Invalid start or count", e.getMessage());
    }
}
