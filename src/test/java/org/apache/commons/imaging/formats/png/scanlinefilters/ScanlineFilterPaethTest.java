package org.apache.commons.imaging.formats.png.scanlinefilters;

import org.apache.commons.imaging.ImageReadException;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertArrayEquals;

/**
 * Unit tests for class {@link ScanlineFilterPaeth}.
 *
 * @date 2017-07-13
 * @see ScanlineFilterPaeth
 *
 **/
public class ScanlineFilterPaethTest{


  @Test
  public void testUnfilter() throws IOException, ImageReadException {

      ScanlineFilterPaeth scanlineFilterPaeth = new ScanlineFilterPaeth(0);
      byte[] byteArray = new byte[5];
      scanlineFilterPaeth.unfilter(byteArray, byteArray, (byte[]) null);

      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray);

  }


}