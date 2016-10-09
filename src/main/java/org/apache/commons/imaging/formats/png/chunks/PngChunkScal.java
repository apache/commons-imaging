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

import java.io.IOException;

import static org.apache.commons.imaging.common.BinaryFunctions.findNull;

public class PngChunkScal extends PngChunk {
   public final double unitsPerPixelXAxis;
   public final double unitsPerPixelYAxis;
   public final int unitSpecifier;

   public PngChunkScal(int length, int chunkType, int crc, byte[] bytes)
         throws ImageReadException, IOException {
      super(length, chunkType, crc, bytes);

      unitSpecifier = bytes[0];
      if (unitSpecifier != 1 && unitSpecifier != 2) {
         throw new ImageReadException("PNG sCAL invalid unit specifier: " + unitSpecifier);
      }

      final int separator = findNull(bytes);
      if (separator < 0) {
         throw new ImageReadException("PNG sCAL x and y axis value separator not found.");
      }

      final int xIndex = 1;
      final String xStr = new String(bytes, xIndex, separator - 1, "ISO-8859-1");
      unitsPerPixelXAxis = toDouble(xStr);

      final int yIndex = separator + 1;
      if (yIndex >= length) {
         throw new ImageReadException("PNG sCAL chunk missing the y axis value.");
      }

      final String yStr = new String(bytes, yIndex, length - yIndex, "ISO-8859-1");
      unitsPerPixelYAxis = toDouble(yStr);
   }

   private double toDouble(final String str) throws ImageReadException {
      try {
         return Double.valueOf(str);
      } catch (NumberFormatException e) {
         throw new ImageReadException("PNG sCAL error reading axis value - " + str);
      }
   }
}
