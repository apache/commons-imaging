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

import java.io.IOException;

import org.apache.commons.imaging.ImageReadException;
import org.junit.Test;

/**
 * Unit tests for class {@link JpegInputStream}.
 * @see JpegInputStream
 **/
public class JpegInputStreamTest {

  @Test(expected = ImageReadException.class)
  public void testNextBitThrowsImageReadExceptionOne() throws IOException, ImageReadException {
    int[] byteArray = new int[6];
    byteArray[0] = (byte) (-1);
    byteArray[1] = (byte) 74;
    JpegInputStream jpegInputStream = new JpegInputStream(byteArray);

    jpegInputStream.nextBit();

  }

  @Test(expected = IllegalStateException.class)
  public void testNextBitThrowsImageReadExceptionTwo() throws IOException, ImageReadException {
    int[] byteArray = new int[0];
    JpegInputStream jpegInputStream = new JpegInputStream(byteArray);

    jpegInputStream.nextBit();

  }

}
