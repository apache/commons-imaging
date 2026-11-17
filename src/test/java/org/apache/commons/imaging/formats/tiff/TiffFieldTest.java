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

package org.apache.commons.imaging.formats.tiff;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.File;
import java.nio.ByteOrder;

import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeByte;
import org.apache.commons.imaging.test.TestResources;
import org.junit.jupiter.api.Test;

/**
 * Tests for the single-value getters of {@link TiffField}.
 * <p>
 * A field with a BYTE type and a count other than 1 has a {@code byte[]} value. The getters document that they throw an {@link ImagingException} when the
 * value cannot be converted, so a value that is not a number must not surface as a {@link ClassCastException}.
 * </p>
 */
class TiffFieldTest {

    /** A FillOrder field (which the specification defines as a single SHORT) that a malformed file declares as BYTE with a count of zero. */
    private static TiffField byteArrayField() {
        return new TiffField(TiffTagConstants.TIFF_TAG_FILL_ORDER.tag, TiffDirectoryConstants.DIRECTORY_TYPE_ROOT, new FieldTypeByte(1, "Byte"), 0, 0,
                new byte[0], ByteOrder.LITTLE_ENDIAN, 0);
    }

    private static TiffField byteField() {
        return new TiffField(TiffTagConstants.TIFF_TAG_FILL_ORDER.tag, TiffDirectoryConstants.DIRECTORY_TYPE_ROOT, new FieldTypeByte(1, "Byte"), 1, 0,
                new byte[] { 2 }, ByteOrder.LITTLE_ENDIAN, 0);
    }

    @Test
    void testGetDoubleValueRejectsNonNumber() {
        assertThrows(ImagingException.class, () -> byteArrayField().getDoubleValue());
    }

    /**
     * For https://issues.apache.org/jira/browse/IMAGING-386.
     * <p>
     * The file declares its FillOrder tag as a BYTE with a count of zero. {@code Imaging.getBufferedImage} is documented to throw {@link ImagingException},
     * not a {@link ClassCastException}.
     * </p>
     */
    @Test
    void testGetBufferedImageWithNonNumericFillOrder() {
        final File tiff = TestResources.resourceToFile("/images/tiff/IMAGING-386/crash-46f4bb78375b6353270d3c220d17d6101f916eab.tif");
        assertThrows(ImagingException.class, () -> Imaging.getBufferedImage(tiff));
    }

    @Test
    void testGetIntValueRejectsNonNumber() {
        assertThrows(ImagingException.class, () -> byteArrayField().getIntValue());
    }

    @Test
    void testGetLongValueRejectsNonNumber() {
        assertThrows(ImagingException.class, () -> byteArrayField().getLongValue());
    }

    @Test
    void testNumericValues() throws ImagingException {
        final TiffField field = byteField();
        assertEquals(2, field.getIntValue());
        assertEquals(2L, field.getLongValue());
        assertEquals(2.0, field.getDoubleValue());
    }
}
