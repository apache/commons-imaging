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

import org.apache.commons.imaging.ImageReadException;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class PngChunkScalTest {
   private final double delta = 0.001;
   private final int chunkType = 1933787468;

   @Test
   public void testConstructMeters() throws IOException, ImageReadException {
      final PngChunkScal pngChunkScal = new PngChunkScal(10, chunkType, 0,
            new byte[]{1, 48, 46, 48, 49, 0, 48, 46, 48, 50});

      assertEquals("Invalid unit specifier", pngChunkScal.unitSpecifier, 1);
      assertEquals("Invalid units per pixel x axis", pngChunkScal.unitsPerPixelXAxis, 0.01, delta);
      assertEquals("Invalid units per pixel y axis", pngChunkScal.unitsPerPixelYAxis, 0.02, delta);
   }

   @Test
   public void testConstructRadians() throws IOException, ImageReadException {
      final PngChunkScal pngChunkScal = new PngChunkScal(10, chunkType, 0,
            new byte[]{2, 48, 46, 48, 49, 0, 48, 46, 48, 50});

      assertEquals("Invalid unit specifier", pngChunkScal.unitSpecifier, 2);
      assertEquals("Invalid units per pixel x axis", pngChunkScal.unitsPerPixelXAxis, 0.01, delta);
      assertEquals("Invalid units per pixel y axis", pngChunkScal.unitsPerPixelYAxis, 0.02, delta);
   }

   @Test(expected = ImageReadException.class)
   public void testConstruct_InvalidUnitSpecifier() throws IOException, ImageReadException {
      new PngChunkScal(10, chunkType, 0, new byte[]{3, 48, 46, 48, 49, 0, 48, 46, 48, 50});
   }

   @Test(expected = ImageReadException.class)
   public void testConstruct_MissingSeparator() throws IOException, ImageReadException {
      new PngChunkScal(9, chunkType, 0, new byte[]{1, 48, 46, 48, 49, 48, 46, 48, 50});
   }

   @Test(expected = ImageReadException.class)
   public void testConstruct_InvalidDblValue() throws IOException, ImageReadException {
      new PngChunkScal(10, chunkType, 0, new byte[]{2, 65, 46, 48, 49, 0, 48, 46, 48, 50});
   }

   @Test(expected = ImageReadException.class)
   public void testConstruct_MissingXValue() throws IOException, ImageReadException {
      new PngChunkScal(2, chunkType, 0, new byte[]{2, 0});
   }

   @Test(expected = ImageReadException.class)
   public void testConstruct_MissingYValue() throws IOException, ImageReadException {
      new PngChunkScal(6, chunkType, 0, new byte[]{2, 48, 46, 48, 49, 0});
   }
}
