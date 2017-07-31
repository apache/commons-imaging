package org.apache.commons.imaging.formats.jpeg.segments;

import org.apache.commons.imaging.ImageReadException;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;

/**
 * Unit tests for class {@link App2Segment}.
 *
 * @date 2017-08-01
 * @see App2Segment
 *
 **/
public class App2SegmentTest{

  @Test
  public void testEqualsReturningTrue()  throws IOException, ImageReadException {
      App2Segment app2Segment = new App2Segment(0, 0, null);

      assertTrue(app2Segment.equals(app2Segment));
  }

  @Test
  public void testEqualsReturningFalse()  throws IOException, ImageReadException {
      byte[] byteArray = new byte[3];
      App2Segment app2Segment = new App2Segment(65475, byteArray);

      assertFalse(app2Segment.equals(byteArray));
  }

  @Test
  public void testCompareTo() throws IOException, ImageReadException {
      App2Segment app2Segment = new App2Segment(0, 0, null);

      assertEquals(0, app2Segment.compareTo(app2Segment));
  }

}