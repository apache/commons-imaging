package org.apache.commons.imaging.formats.png.transparencyfilters;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Unit tests for class {@link TransparencyFilterIndexedColor}.
 *
 * @date 13.07.2017
 * @see TransparencyFilterIndexedColor
 *
 **/
public class TransparencyFilterIndexedColorTest{


  @Test
  public void testFilterWithNegativeAndNegative() {

      byte[] byteArray = new byte[0];
      TransparencyFilterIndexedColor transparencyFilterIndexedColor = new TransparencyFilterIndexedColor(byteArray);

      try { 
        transparencyFilterIndexedColor.filter((-416), (-398));
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         assertEquals("TransparencyFilterIndexedColor index: -398, bytes.length: 0",e.getMessage());
         assertEquals(TransparencyFilterIndexedColor.class.getName(), e.getStackTrace()[0].getClassName());
      }

  }


}