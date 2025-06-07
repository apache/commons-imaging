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
package org.apache.commons.imaging.formats.tiff.taginfos;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.nio.ByteOrder;

import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;
import org.junit.jupiter.api.Test;

public class TagInfoByteOrShortTest {

    @Test
    void testEncodeValueTakingByteOrderAndByteArrayOne() {
        final TiffDirectoryType tiffDirectoryType = TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES;
        final TagInfoByteOrShort tagInfoByteOrShort = new TagInfoByteOrShort("r", 500, 500, tiffDirectoryType);
        final ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        final short[] shortArray = new short[2];
        final byte[] byteArray = tagInfoByteOrShort.encodeValue(byteOrder, shortArray);

        assertArrayEquals(new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0 }, byteArray);
    }

    @Test
    void testEncodeValueTakingByteOrderAndByteArrayTwo() {
        final TiffDirectoryType tiffDirectoryType = TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES;
        final TagInfoByteOrShort tagInfoByteOrShort = new TagInfoByteOrShort("r", 500, 500, tiffDirectoryType);
        final ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        final byte[] byteArray = new byte[2];
        final byte[] byteArrayTwo = tagInfoByteOrShort.encodeValue(byteOrder, byteArray);

        assertSame(byteArrayTwo, byteArray);
    }

}
