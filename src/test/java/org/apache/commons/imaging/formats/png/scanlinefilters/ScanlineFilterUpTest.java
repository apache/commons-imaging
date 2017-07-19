package org.apache.commons.imaging.formats.png.scanlinefilters;

import org.apache.commons.imaging.ImageReadException;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertArrayEquals;

public class ScanlineFilterUpTest {

  @Test
  public void testUnfilterWithNull() throws IOException, ImageReadException {
      ScanlineFilterUp scanlineFilterUp = new ScanlineFilterUp();
      byte[] byteArray = new byte[4];
      scanlineFilterUp.unfilter(byteArray, byteArray, (byte[]) null);

      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray);
  }

}