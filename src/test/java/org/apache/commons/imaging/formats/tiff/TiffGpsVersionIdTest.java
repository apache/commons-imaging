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

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.stream.Stream;

import org.apache.commons.imaging.FormatCompliance;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.bytesource.ByteSource;
import org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

/** Tests IMAGING-371 without depending on the TIFF writer or external images. */
class TiffGpsVersionIdTest {

    private static byte[] createGpsMetadata(final ByteOrder order) {
        final ByteBuffer buffer = ByteBuffer.allocate(56).order(order);
        final byte marker = (byte) (order == ByteOrder.LITTLE_ENDIAN ? 'I' : 'M');
        buffer.put(marker).put(marker).putShort((short) 42).putInt(8);
        buffer.putShort((short) 1);
        // Root GPSInfo pointer: LONG[1], pointing to the GPS IFD at offset 26.
        buffer.putShort((short) 0x8825).putShort((short) 4).putInt(1).putInt(26);
        buffer.putInt(0);
        buffer.putShort((short) 2);
        // GPSVersionID: BYTE[4], stored inline. Tag zero is valid in this IFD.
        buffer.putShort((short) 0).putShort((short) 1).putInt(4).put(new byte[] { 2, 3, 0, 0 });
        // GPSLatitudeRef is a control for directory traversal and entry alignment.
        buffer.putShort((short) 1).putShort((short) 2).putInt(2).put(new byte[] { 'N', 0, 0, 0 });
        buffer.putInt(0);
        return buffer.array();
    }

    private static Stream<Arguments> readerOptions() {
        return Stream.of(Arguments.of(ByteOrder.LITTLE_ENDIAN, false), Arguments.of(ByteOrder.LITTLE_ENDIAN, true),
                Arguments.of(ByteOrder.BIG_ENDIAN, false), Arguments.of(ByteOrder.BIG_ENDIAN, true));
    }

    @ParameterizedTest
    @ValueSource(booleans = { false, true })
    void testGpsVersionIdThroughPublicMetadataApi(final boolean littleEndian) throws IOException {
        final ByteOrder order = littleEndian ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
        final TiffImageMetadata metadata = (TiffImageMetadata) Imaging.getMetadata(createGpsMetadata(order));
        final TiffField version = metadata.findField(GpsTagConstants.GPS_TAG_GPS_VERSION_ID, true);
        Assertions.assertNotNull(version, "GPSVersionID must be present in the GPS directory");
        Assertions.assertArrayEquals(new byte[] { 2, 3, 0, 0 }, version.getByteArrayValue());
        Assertions.assertEquals("N", metadata.findField(GpsTagConstants.GPS_TAG_GPS_LATITUDE_REF, true).getStringValue());
    }

    @ParameterizedTest
    @MethodSource("readerOptions")
    void testGpsVersionIdThroughReader(final ByteOrder order, final boolean strict) throws IOException {
        final TiffContents contents = new TiffReader(strict).readDirectories(ByteSource.array(createGpsMetadata(order)), false,
                FormatCompliance.getDefault());
        Assertions.assertEquals(2, contents.directories.size());
        final TiffDirectory gps = contents.directories.get(1);
        Assertions.assertEquals(TiffDirectoryConstants.DIRECTORY_TYPE_GPS, gps.type);
        Assertions.assertEquals("N", gps.findField(GpsTagConstants.GPS_TAG_GPS_LATITUDE_REF).getStringValue());
        Assertions.assertNotNull(gps.findField(GpsTagConstants.GPS_TAG_GPS_VERSION_ID), "GPSVersionID must not be skipped");
        Assertions.assertArrayEquals(new byte[] { 2, 3, 0, 0 }, gps.getFieldValue(GpsTagConstants.GPS_TAG_GPS_VERSION_ID, true));
    }

    @ParameterizedTest
    @MethodSource("readerOptions")
    void testNonGpsTagZeroRemainsSkipped(final ByteOrder order, final boolean strict) throws IOException {
        final ByteBuffer buffer = ByteBuffer.allocate(38).order(order);
        final byte marker = (byte) (order == ByteOrder.LITTLE_ENDIAN ? 'I' : 'M');
        buffer.put(marker).put(marker).putShort((short) 42).putInt(8);
        buffer.putShort((short) 2);
        // A malformed root entry must be skipped before interpreting its enormous count.
        buffer.putShort((short) 0).putShort((short) 1).putInt(-1).putInt(0);
        buffer.putShort((short) 0x010e).putShort((short) 2).putInt(2).put(new byte[] { 'X', 0, 0, 0 });
        buffer.putInt(0);
        final TiffContents contents = new TiffReader(strict).readDirectories(ByteSource.array(buffer.array()), false,
                FormatCompliance.getDefault());
        Assertions.assertEquals(1, contents.directories.size());
        final TiffDirectory root = contents.directories.get(0);
        Assertions.assertNull(root.findField(GpsTagConstants.GPS_TAG_GPS_VERSION_ID));
        Assertions.assertEquals("X", root.findField(TiffTagConstants.TIFF_TAG_IMAGE_DESCRIPTION).getStringValue());
    }
}
