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
package org.apache.commons.imaging.palette;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ColorComponentTest {

    @Test
    public void testArgbComponent() {
        int argb = 0x11223344;
        assertEquals(0x11, ColorComponent.ALPHA.argbComponent(argb));
        assertEquals(0x22, ColorComponent.RED.argbComponent(argb));
        assertEquals(0x33, ColorComponent.GREEN.argbComponent(argb));
        assertEquals(0x44, ColorComponent.BLUE.argbComponent(argb));
    }
}
