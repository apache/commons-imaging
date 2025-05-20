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

package org.apache.commons.imaging.formats.icns;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.apache.commons.imaging.common.AllocationRequestException;
import org.junit.jupiter.api.Test;

public class IcnsImageParserTest {

    @Test
    public void testGetImageSize() throws Exception {
        final byte[] bytes = {
                // Header
                'i', 'c', 'n', 's',
                // (Too large) file size
                (byte) 0b0111_1111, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF - 10,
                // Type (does not matter?)
                0, 0, 0, 0,
                // (Too large) element size
                (byte) 0b0111_1111, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF - 10 - 8, };
        assertThrows(AllocationRequestException.class, () -> new IcnsImageParser().getImageSize(bytes));
    }
}
