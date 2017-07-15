package org.apache.commons.imaging.formats.tiff.taginfos;

import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for class {@link TagInfoUnknown}.
 *
 * @date 13.07.2017
 * @see TagInfoUnknown
 *
 **/
public class TagInfoUnknownTest{


  @Test
  public void testCreatesTagInfoUnknown() {

      TiffDirectoryType tiffDirectoryType = TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
      TagInfoUnknown tagInfoUnknown = new TagInfoUnknown("", 2670, tiffDirectoryType);

      assertEquals((-1), TagInfo.LENGTH_UNKNOWN);

  }


}