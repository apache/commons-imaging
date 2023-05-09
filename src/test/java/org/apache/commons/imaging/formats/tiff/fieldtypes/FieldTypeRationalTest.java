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
package org.apache.commons.imaging.formats.tiff.fieldtypes;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.nio.ByteOrder;

import org.apache.commons.imaging.ImageWriteException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for class {@link FieldTypeRational}.
 * @see FieldTypeRational
 *
 **/
public class FieldTypeRationalTest {

  @Test
  public void testWriteDataWithNonNull() {
      final FieldTypeRational fieldTypeRational = new FieldTypeRational((-922), "z_AX");
      final ByteOrder byteOrder = ByteOrder.nativeOrder();
      Assertions.assertThrows(ImageWriteException.class, () -> fieldTypeRational.writeData("z_AX", byteOrder));
  }

  @Test
  public void testWriteDataWithNull() throws ImageWriteException {
      final FieldTypeRational fieldTypeRational = new FieldTypeRational(9, null);
      final Double doubleOne = 2.2d;
      final byte[] byteArray = fieldTypeRational.writeData(doubleOne, null);

      assertArrayEquals(new byte[] {(byte)11, (byte)0, (byte)0, (byte)0, (byte)5, (byte)0, (byte)0, (byte)0}, byteArray);
  }

}
