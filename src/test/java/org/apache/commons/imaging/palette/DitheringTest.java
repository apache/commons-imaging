package org.apache.commons.imaging.palette;

import org.apache.commons.imaging.ImageWriteException;
import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.image.BufferedImage;
import java.util.LinkedList;
import java.util.List;

/**
 * Unit tests for class {@link Dithering}.
 *
 * @date 2017-08-01
 * @see Dithering
 *
 **/
public class DitheringTest{

  @Test
  public void testApplyFloydSteinbergDitheringWithNonNullOne() throws ImageWriteException {
      BufferedImage bufferedImage = new BufferedImage(8, 8, 8);
      bufferedImage.setRGB(2, 2, 2);
      List<ColorSpaceSubset> linkedList = new LinkedList<ColorSpaceSubset>();
      ColorSpaceSubset colorSpaceSubset = new ColorSpaceSubset((-234), (-352));
      colorSpaceSubset.rgb = 8;
      linkedList.add(colorSpaceSubset);
      QuantizedPalette quantizedPalette = new QuantizedPalette(linkedList, 8);
      Dithering.applyFloydSteinbergDithering(bufferedImage, quantizedPalette);

      assertEquals(-16777208, bufferedImage.getRGB(0,0) );
      assertEquals(-16777208, bufferedImage.getRGB(1,1) );
      assertEquals(-16777208, bufferedImage.getRGB(2,1) );
      assertEquals(-16777208, bufferedImage.getRGB(2,2) );
  }

  @Test
  public void testApplyFloydSteinbergDitheringWithNonNullTwo() throws ImageWriteException {
      BufferedImage bufferedImage = new BufferedImage(3, 3, 3);
      bufferedImage.setRGB(1, 2, 4);
      List<ColorSpaceSubset> linkedList = new LinkedList();
      ColorSpaceSubset colorSpaceSubset = new ColorSpaceSubset((-234), (-352));
      linkedList.add(colorSpaceSubset);
      QuantizedPalette quantizedPalette = new QuantizedPalette(linkedList, 3);
      Dithering.applyFloydSteinbergDithering(bufferedImage, quantizedPalette);

      assertEquals(-1, bufferedImage.getRGB(0,0) );
      assertEquals(-1, bufferedImage.getRGB(1,1) );
      assertEquals(-1, bufferedImage.getRGB(2,1) );
      assertEquals(-1, bufferedImage.getRGB(2,2) );
  }

}