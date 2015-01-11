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
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.apache.commons.imaging.formats.tiff.constants.TiffConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryConstants;
import org.junit.Before;
import org.junit.Test;

public class TiffOutputDirectoryTest {

    private TiffOutputDirectory directory;

    @Before
    public void setUp() throws Exception {
        directory = new TiffOutputDirectory(TiffDirectoryConstants.DIRECTORY_TYPE_ROOT, TiffConstants.DEFAULT_TIFF_BYTE_ORDER);
    }

    @Test
    public void testFindField() throws Exception {
        directory.add(TIFF_TAG_DOCUMENT_NAME, "Test.tiff");

        TiffOutputField field = directory.findField(TIFF_TAG_DOCUMENT_NAME);

        assertNotNull(field);
        assertEquals(TIFF_TAG_DOCUMENT_NAME, field.tagInfo);
        byte[] documentNameAsBytes = TIFF_TAG_DOCUMENT_NAME.encodeValue(TiffConstants.DEFAULT_TIFF_BYTE_ORDER, "Test.tiff");
        assertTrue(field.bytesEqual(documentNameAsBytes));
    }
}