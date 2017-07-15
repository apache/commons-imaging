package org.apache.commons.imaging.formats.jpeg.segments;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for class {@link SosSegment}.
 *
 * @date 13.07.2017
 * @see SosSegment
 *
 **/
public class SosSegmentTest{


  @Test
  public void testGetComponentsTakingNoArguments() throws IOException {

      byte[] byteArray = new byte[5];
      SosSegment sosSegment = new SosSegment((-1044), byteArray);
      sosSegment.getComponents();

      assertEquals(0, sosSegment.successiveApproximationBitHigh);
      assertEquals(0, sosSegment.successiveApproximationBitLow);

  }


  @Test
  public void testCreatesSosSegmentTakingThreeArguments() throws IOException {

      byte[] byteArray = new byte[5];
      SosSegment sosSegment = new SosSegment((-1044), byteArray);

      assertEquals(0, sosSegment.successiveApproximationBitLow);
      assertEquals(0, sosSegment.successiveApproximationBitHigh);

      assertEquals("[Segment: SOS (Unknown)]", sosSegment.toString());

  }


}