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

package org.apache.commons.imaging;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

/**
 * Tests {@link ImageFormats}.
 */
public class ImageFormatsTest {

    @ParameterizedTest
    @EnumSource(ImageFormats.class)
    public void testDefaultExtension(final ImageFormats imageFormats) {
        assertNotNull(imageFormats.getDefaultExtension());
        assertFalse(imageFormats.getDefaultExtension().isEmpty());
    }

    @ParameterizedTest
    @EnumSource(ImageFormats.class)
    public void testExtensions(final ImageFormats imageFormats) {
        assertNotNull(imageFormats.getExtensions());
        assertNotEquals(0, imageFormats.getExtensions().length);
    }

    @ParameterizedTest
    @EnumSource(ImageFormats.class)
    public void testName(final ImageFormats imageFormats) {
        assertNotNull(imageFormats.getName());
        assertFalse(imageFormats.getName().isEmpty());
    }
}
