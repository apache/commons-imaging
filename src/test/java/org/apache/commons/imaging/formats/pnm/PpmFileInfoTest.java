package org.apache.commons.imaging.formats.pnm;

import org.apache.commons.imaging.ImageReadException;
import org.junit.Test;

/**
 * Unit tests for class {@link PpmFileInfo}.
 *
 * @date 2017-08-01
 * @see PpmFileInfo
 *
 **/
public class PpmFileInfoTest{

  @Test(expected = ImageReadException.class)
  public void testCreatesPpmFileInfoOne() throws ImageReadException {
      new PpmFileInfo(0, 0, false, 16711680);
  }

  @Test(expected = ImageReadException.class)
  public void testCreatesPpmFileInfoThree() throws ImageReadException {
      new PpmFileInfo(0, 0, true, 0);
  }

}