package org.apache.commons.imaging.formats.jpeg.segments;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for class {@link AppnSegment}.
 *
 * @date 13.07.2017
 * @see AppnSegment
 *
 **/
public class AppnSegmentTest{


  @Test
  public void testCreatesAppnSegment() throws IOException {

      InputStream inputStream = new ByteArrayInputStream(new byte[0]);
      AppnSegment appnSegment = new AppnSegment(0, 0, inputStream);

      assertEquals("[Segment: APPN (APP-65504) (Unknown)]", appnSegment.toString());

  }


}