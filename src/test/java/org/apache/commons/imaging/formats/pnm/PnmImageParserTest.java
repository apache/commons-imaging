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
package org.apache.commons.imaging.formats.pnm;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Map;

import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageReadException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PnmImageParserTest {

    private static final Charset US_ASCII = StandardCharsets.US_ASCII;

    @Test
    public void testGetImageInfo_happyCase() throws ImageReadException, IOException {
        final byte[] bytes = "P1\n3 2\n0 1 0\n1 0 1\n".getBytes(US_ASCII);
        final Map<String, Object> params = Collections.emptyMap();
        final PnmImageParser underTest = new PnmImageParser();
        final ImageInfo results = underTest.getImageInfo(bytes, params);
        assertEquals(results.getBitsPerPixel(), 1);
        assertEquals(results.getWidth(), 3);
        assertEquals(results.getHeight(), 2);
        assertEquals(results.getNumberOfImages(), 1);
    }

    /**
     * If an invalid width is specified, should throw {@link ImageReadException} rather than
     * {@link NumberFormatException}.
     */
    @Test(expected = ImageReadException.class)
    public void testGetImageInfo_invalidWidth() throws ImageReadException, IOException {
        final byte[] bytes = "P1\na 2\n0 0 0 0 0 0 0 0 0 0 0\n1 1 1 1 1 1 1 1 1 1 1\n".getBytes(US_ASCII);
        final Map<String, Object> params = Collections.emptyMap();
        final PnmImageParser underTest = new PnmImageParser();
        underTest.getImageInfo(bytes, params);
    }

    @Test(expected = ImageReadException.class)
    public void testGetImageInfo_invalidHeight() throws ImageReadException, IOException {
        final byte[] bytes = "P1\n2 a\n0 0\n0 0\n0 0\n0 0\n0 0\n0 1\n1 1\n1 1\n1 1\n1 1\n1 1\n".getBytes(US_ASCII);
        final Map<String, Object> params = Collections.emptyMap();
        final PnmImageParser underTest = new PnmImageParser();
        underTest.getImageInfo(bytes, params);
    }

    @Test(expected = ImageReadException.class)
    public void testGetImageInfo_missingWidthValue() throws ImageReadException, IOException {
        final byte[] bytes = "P7\nWIDTH \n".getBytes(US_ASCII);
        final Map<String, Object> params = Collections.emptyMap();
        final PnmImageParser underTest = new PnmImageParser();
        underTest.getImageInfo(bytes, params);
    }
}
