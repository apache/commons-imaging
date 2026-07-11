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

package org.apache.commons.imaging.common;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class AllocatorTest {

    /** 536870912 * Integer.BYTES overflows int to a negative value. */
    @Test
    void testArrayListOverflowIsRejected() {
        assertThrows(AllocationRequestException.class, () -> Allocator.arrayList(536870912));
    }

    /** 107374183 * 40 overflows int to 24, slipping past the byte-cost limit. */
    @Test
    void testArrayOverflowIsRejected() {
        assertThrows(AllocationRequestException.class, () -> Allocator.array(107374183, Object[]::new, 40));
    }
}
