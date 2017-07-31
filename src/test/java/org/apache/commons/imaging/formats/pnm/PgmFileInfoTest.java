package org.apache.commons.imaging.formats.pnm;

import org.apache.commons.imaging.ImageReadException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for class {@link PgmFileInfo}.
 *
 * @date 2017-08-01
 * @see PgmFileInfo
 *
 **/
public class PgmFileInfoTest{

  @Test(expected = ImageReadException.class)
  public void testCreateThrowsImageReadExceptionOne() throws ImageReadException {
      new PgmFileInfo(16711680, 16711680, false, 16711680);
  }

  @Test(expected = ImageReadException.class)
  public void testCreateThrowsImageReadExceptionTwo() throws ImageReadException {
      new PgmFileInfo(0, 0, true, 0);
  }

  @Test
  public void testGetBitDepth() throws ImageReadException {
      PgmFileInfo pgmFileInfo = new PgmFileInfo(65535, 65535, false, 65535);

      assertEquals(65535, pgmFileInfo.getBitDepth());
  }

}