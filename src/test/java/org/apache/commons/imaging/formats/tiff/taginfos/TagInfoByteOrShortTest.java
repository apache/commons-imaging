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
package org.apache.commons.imaging.formats.tiff.taginfos;

import org.junit.Test;
import static org.junit.Assert.*;
import java.nio.ByteOrder;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;

/**
 * Unit tests for class {@link TagInfoByteOrShort}.
 *
 * @date 2017-08-01
 * @see TagInfoByteOrShort
 *
 **/
public class TagInfoByteOrShortTest{

  @Test
  public void testEncodeValueTaking1And1AndEncodeValueTaking1And1AndEncodeValueTaking1And1ReturningNonEmptyArrayOne() {
      TiffDirectoryType tiffDirectoryType = TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES;
      TagInfoByteOrShort tagInfoByteOrShort = new TagInfoByteOrShort("r", 500, 500, tiffDirectoryType);
      ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
      short[] shortArray = new short[2];
      byte[] byteArray = tagInfoByteOrShort.encodeValue(byteOrder, shortArray);

      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray);
  }

  @Test
  public void testEncodeValueTaking1And1AndEncodeValueTaking1And1AndEncodeValueTaking1And1ReturningNonEmptyArrayTwo() {
      TiffDirectoryType tiffDirectoryType = TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES;
      TagInfoByteOrShort tagInfoByteOrShort = new TagInfoByteOrShort("r", 500, 500, tiffDirectoryType);
      ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
      byte[] byteArray = new byte[2];
      byte[] byteArrayTwo = tagInfoByteOrShort.encodeValue(byteOrder, byteArray);

      assertSame(byteArrayTwo, byteArray);
  }

}