package org.apache.commons.imaging;

import org.junit.Test;

import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for class {@link ImageDump}.
 *
 * @date 13.07.2017
 * @see ImageDump
 *
 **/
public class ImageDumpTest{


  @Test
  public void testDumpColorSpace() {

      ImageDump imageDump = new ImageDump();
      ColorSpace colorSpace = ColorSpace.getInstance(1004);
      imageDump.dumpColorSpace("Ku&]N>!4'C#Jzn+", colorSpace);

      assertEquals(3, colorSpace.getNumComponents());

  }


  @Test
  public void testDump() {

      ImageDump imageDump = new ImageDump();
      BufferedImage bufferedImage = new BufferedImage(10, 10, 10);
      imageDump.dump(bufferedImage);

      assertEquals(10, bufferedImage.getHeight());

  }


}