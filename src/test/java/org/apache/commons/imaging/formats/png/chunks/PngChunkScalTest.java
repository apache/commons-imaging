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
package org.apache.commons.imaging.formats.png.chunks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.commons.imaging.ImageReadException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PngChunkScalTest {
   private static final double delta = 0.001;
   private static final int chunkType = 1933787468;

   @Test
   public void testConstructMeters() throws ImageReadException {
      final PngChunkScal pngChunkScal = new PngChunkScal(10, chunkType, 0,
            new byte[]{1, 48, 46, 48, 49, 0, 48, 46, 48, 50});

      assertEquals(pngChunkScal.unitSpecifier, 1);
      assertEquals(pngChunkScal.unitsPerPixelXAxis, 0.01, delta);
      assertEquals(pngChunkScal.unitsPerPixelYAxis, 0.02, delta);
   }

   @Test
   public void testConstructRadians() throws ImageReadException {
      final PngChunkScal pngChunkScal = new PngChunkScal(10, chunkType, 0,
            new byte[]{2, 48, 46, 48, 49, 0, 48, 46, 48, 50});

      assertEquals(pngChunkScal.unitSpecifier, 2);
      assertEquals(pngChunkScal.unitsPerPixelXAxis, 0.01, delta);
      assertEquals(pngChunkScal.unitsPerPixelYAxis, 0.02, delta);
   }

   @Test
   public void testConstruct_InvalidUnitSpecifier() {
       Assertions.assertThrows(ImageReadException.class,() -> {
           new PngChunkScal(10, chunkType, 0, new byte[]{3, 48, 46, 48, 49, 0, 48, 46, 48, 50});
       });
   }

   @Test
   public void testConstruct_MissingSeparator() {
      Assertions.assertThrows(ImageReadException.class,() -> {
          new PngChunkScal(9, chunkType, 0, new byte[]{1, 48, 46, 48, 49, 48, 46, 48, 50});
      });
   }

   @Test
   public void testConstruct_InvalidDblValue() {
       Assertions.assertThrows(ImageReadException.class,() -> {
           new PngChunkScal(10, chunkType, 0, new byte[]{2, 65, 46, 48, 49, 0, 48, 46, 48, 50});
       });
   }

   @Test
   public void testConstruct_MissingXValue() {
      Assertions.assertThrows(ImageReadException.class,() -> {
          new PngChunkScal(2, chunkType, 0, new byte[]{2, 0});
      });
   }

   @Test
   public void testConstruct_MissingYValue() {
       Assertions.assertThrows(ImageReadException.class,() -> {
           new PngChunkScal(6, chunkType, 0, new byte[]{2, 48, 46, 48, 49, 0});
       });
   }
}
