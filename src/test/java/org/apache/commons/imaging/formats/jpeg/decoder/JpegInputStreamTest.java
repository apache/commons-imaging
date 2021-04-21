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
package org.apache.commons.imaging.formats.jpeg.decoder;

import org.apache.commons.imaging.ImageReadException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for class {@link JpegInputStream}.
 * @see JpegInputStream
 **/
public class JpegInputStreamTest {

  @Test
  public void testNextBitThrowsImageReadExceptionOne() {
    final int[] byteArray = new int[6];
    byteArray[0] = (byte) (-1);
    byteArray[1] = (byte) 74;
    final JpegInputStream jpegInputStream = new JpegInputStream(byteArray);

    Assertions.assertThrows(ImageReadException.class, jpegInputStream::nextBit);

  }

  @Test
  public void testNextBitThrowsImageReadExceptionTwo() {
    final int[] byteArray = new int[0];
    final JpegInputStream jpegInputStream = new JpegInputStream(byteArray);

    Assertions.assertThrows(IllegalStateException.class, jpegInputStream::nextBit);

  }

}
