package org.apache.commons.imaging.formats.png.scanlinefilters;

import org.apache.commons.imaging.ImageReadException;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertArrayEquals;

public class ScanlineFilterAverageTest{

  @Test
  public void testUnfilterWithNull() throws IOException, ImageReadException {
      ScanlineFilterAverage scanlineFilterAverage = new ScanlineFilterAverage(2);
      byte[] byteArray = new byte[9];
      scanlineFilterAverage.unfilter(byteArray, byteArray, (byte[]) null);

      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray);
  }

}