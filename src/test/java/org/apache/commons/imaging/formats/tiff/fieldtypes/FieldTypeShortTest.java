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
package org.apache.commons.imaging.formats.tiff.fieldtypes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.nio.ByteOrder;

import org.junit.jupiter.api.Test;

public class FieldTypeShortTest {

    @Test
    void testCreatesFieldTypeShortAndCallsWriteData() {
        final FieldTypeShort fieldTypeShort = new FieldTypeShort(1234, "");
        final ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;

        try {
            fieldTypeShort.writeData("", byteOrder);
            fail("Expecting exception: Exception");
        } catch (final Exception e) {
            assertEquals("Invalid data:  (java.lang.String)", e.getMessage());
            assertEquals(FieldTypeShort.class.getName(), e.getStackTrace()[0].getClassName());
        }
    }

}
