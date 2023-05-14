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
package org.apache.commons.imaging.palette;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.image.BufferedImage;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.imaging.ImagingException;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for class {@link Dithering}.
 **/
public class DitheringTest {

  @Test
  public void testApplyFloydSteinbergDitheringWithNonNullOne() throws ImagingException {
      final BufferedImage bufferedImage = new BufferedImage(8, 8, 8);
      bufferedImage.setRGB(2, 2, 2);
      final List<ColorSpaceSubset> linkedList = new LinkedList<>();
      final ColorSpaceSubset colorSpaceSubset = new ColorSpaceSubset((-234), (-352));
      colorSpaceSubset.rgb = 8;
      linkedList.add(colorSpaceSubset);
      final QuantizedPalette quantizedPalette = new QuantizedPalette(linkedList, 8);
      Dithering.applyFloydSteinbergDithering(bufferedImage, quantizedPalette);

      assertEquals(-16777208, bufferedImage.getRGB(0,0) );
      assertEquals(-16777208, bufferedImage.getRGB(1,1) );
      assertEquals(-16777208, bufferedImage.getRGB(2,1) );
      assertEquals(-16777208, bufferedImage.getRGB(2,2) );
  }

  @Test
  public void testApplyFloydSteinbergDitheringWithNonNullTwo() throws ImagingException {
      final BufferedImage bufferedImage = new BufferedImage(3, 3, 3);
      bufferedImage.setRGB(1, 2, 4);
      final List<ColorSpaceSubset> linkedList = new LinkedList<>();
      final ColorSpaceSubset colorSpaceSubset = new ColorSpaceSubset((-234), (-352));
      linkedList.add(colorSpaceSubset);
      final QuantizedPalette quantizedPalette = new QuantizedPalette(linkedList, 3);
      Dithering.applyFloydSteinbergDithering(bufferedImage, quantizedPalette);

      assertEquals(-1, bufferedImage.getRGB(0,0) );
      assertEquals(-1, bufferedImage.getRGB(1,1) );
      assertEquals(-1, bufferedImage.getRGB(2,1) );
      assertEquals(-1, bufferedImage.getRGB(2,2) );
  }

}
