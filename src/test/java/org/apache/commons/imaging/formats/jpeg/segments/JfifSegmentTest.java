package org.apache.commons.imaging.formats.jpeg.segments;

import org.apache.commons.imaging.ImageReadException;
import org.junit.Test;

import java.io.IOException;

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
  public void testCreatesJfifSegment() throws IOException {

      byte[] byteArray = new byte[25];
      JfifSegment jfifSegment = null;

      try {
        jfifSegment = new JfifSegment((-2275), byteArray);
        fail("Expecting exception: Exception");
      } catch(ImageReadException e) {
         assertEquals("Not a Valid JPEG File: missing JFIF string",e.getMessage());
         assertEquals(JfifSegment.class.getName(), e.getStackTrace()[0].getClassName());
      }

  }


}