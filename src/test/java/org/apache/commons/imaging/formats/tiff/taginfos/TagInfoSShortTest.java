package org.apache.commons.imaging.formats.tiff.taginfos;

import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;
import org.junit.Test;

import java.nio.ByteOrder;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for class {@link TagInfoSShort}.
 *
 * @date 13.07.2017
 * @see TagInfoSShort
 *
 **/
public class TagInfoSShortTest{


  @Test
  public void testGetValue() {

      TiffDirectoryType tiffDirectoryType = TiffDirectoryType.TIFF_DIRECTORY_IFD3;
      TagInfoSShort tagInfoSShort = new TagInfoSShort("n1SN[2cj\"2),+O", (-1785), tiffDirectoryType);
      ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;

      assertEquals((short) (-10231), tagInfoSShort.getValue(null, tagInfoSShort.encodeValue(byteOrder, (short) 2520)));

  }


}