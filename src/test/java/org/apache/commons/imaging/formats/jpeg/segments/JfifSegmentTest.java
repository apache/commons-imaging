package org.apache.commons.imaging.formats.jpeg.segments;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Unit tests for class {@link JfifSegment}.
 *
 * @date 13.07.2017
 * @see JfifSegment
 *
 **/
public class JfifSegmentTest{


  @Test
  public void testCreatesJfifSegment() {

      byte[] byteArray = new byte[25];
      JfifSegment jfifSegment = null;

      try {
        jfifSegment = new JfifSegment((-2275), byteArray);
        fail("Expecting exception: Exception");
      } catch(Throwable e) {
         assertEquals("Not a Valid JPEG File: missing JFIF string",e.getMessage());
         assertEquals(JfifSegment.class.getName(), e.getStackTrace()[0].getClassName());
      }

  }


}