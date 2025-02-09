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
package org.apache.commons.imaging.formats.tiff.write;

import static org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_DOCUMENT_NAME;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.apache.commons.imaging.formats.tiff.constants.TiffConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryConstants;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TiffOutputDirectoryTest {

    private TiffOutputDirectory directory;

    @BeforeEach
    public void setUp() {
        directory = new TiffOutputDirectory(TiffDirectoryConstants.DIRECTORY_TYPE_ROOT, TiffConstants.DEFAULT_TIFF_BYTE_ORDER);
    }

    @Test
    public void testFindField() throws Exception {
        directory.add(TIFF_TAG_DOCUMENT_NAME, "Test.tiff");

        final TiffOutputField field = directory.findField(TIFF_TAG_DOCUMENT_NAME);

        assertNotNull(field);
        assertEquals(TIFF_TAG_DOCUMENT_NAME, field.tagInfo);
        final byte[] documentNameAsBytes = TIFF_TAG_DOCUMENT_NAME.encodeValue(TiffConstants.DEFAULT_TIFF_BYTE_ORDER, "Test.tiff");
        assertArrayEquals(field.getData(), documentNameAsBytes);
    }
}
