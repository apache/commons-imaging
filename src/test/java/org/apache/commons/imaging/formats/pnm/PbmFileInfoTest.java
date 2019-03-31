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

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class PbmFileInfoTest{

  @Test
  public void testGetRGBThrowsIOException() throws IOException {
      final PbmFileInfo pbmFileInfo = new PbmFileInfo(2764, 354, true);
      final byte[] byteArray = new byte[2];
      final InputStream inputStream = new ByteArrayInputStream(byteArray);
      inputStream.read(byteArray);

      try {
        pbmFileInfo.getRGB(inputStream);
        fail("Expecting exception: IOException");
      } catch(final IOException e) {
         assertEquals("PBM: Unexpected EOF",e.getMessage());
         assertEquals(PbmFileInfo.class.getName(), e.getStackTrace()[0].getClassName());
      }
  }

}