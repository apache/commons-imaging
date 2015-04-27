package org.apache.commons.imaging.formats.pnm;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Map;

import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageReadException;
import org.junit.Test;

public class PnmImageParserTest {

  private static final Charset US_ASCII = Charset.forName("US-ASCII");

  @Test
  public void testGetImageInfo_happyCase() throws ImageReadException, IOException {
    byte[] bytes = "P1\n3 2\n0 1 0\n1 0 1\n".getBytes(US_ASCII);
    Map<String, Object> params = Collections.emptyMap();
    PnmImageParser underTest = new PnmImageParser();
    ImageInfo results = underTest.getImageInfo(bytes, params);
    assertEquals(results.getBitsPerPixel(), 1);
    assertEquals(results.getWidth(), 3);
    assertEquals(results.getHeight(), 2);
    assertEquals(results.getNumberOfImages(), 1);
  }

  /**
   * If an invalid width is specified, should throw {@link ImageReadException} rather than
   * {@link NumberFormatException}.
   */
  @Test(expected = ImageReadException.class)
  public void testGetImageInfo_invalidWidth() throws ImageReadException, IOException {
    byte[] bytes = "P1\na 2\n0 0 0 0 0 0 0 0 0 0 0\n1 1 1 1 1 1 1 1 1 1 1\n".getBytes(US_ASCII);
    Map<String, Object> params = Collections.emptyMap();
    PnmImageParser underTest = new PnmImageParser();
    underTest.getImageInfo(bytes, params);
  }

  @Test(expected = ImageReadException.class)
  public void testGetImageInfo_invalidHeight() throws ImageReadException, IOException {
    byte[] bytes = "P1\n2 a\n0 0\n0 0\n0 0\n0 0\n0 0\n0 1\n1 1\n1 1\n1 1\n1 1\n1 1\n".getBytes(US_ASCII);
    Map<String, Object> params = Collections.emptyMap();
    PnmImageParser underTest = new PnmImageParser();
    underTest.getImageInfo(bytes, params);
  }
}
