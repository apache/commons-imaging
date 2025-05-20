/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.imaging.formats.tiff.itu_t4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class T4_T6_TablesTest {

    @Test
    public void testCreatesT4_T6_TablesTakingNoArgumentsAndCallsWriteBits() {
        try (BitArrayOutputStream bitArrayOutputStream = new BitArrayOutputStream(2309)) {
            T4_T6_Tables.EOL16.writeBits(bitArrayOutputStream);

            assertEquals(2, bitArrayOutputStream.size());
            assertEquals("[0, 1]", Arrays.toString(bitArrayOutputStream.toByteArray()));
        }
    }

}
