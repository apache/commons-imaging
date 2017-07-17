package org.apache.commons.imaging.formats.tiff.taginfos;

import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;
import org.junit.Test;

import java.nio.ByteOrder;

import static org.junit.Assert.assertArrayEquals;

/**
 * Unit tests for class {@link TagInfoSShorts}.
 *
 * @date 2017-07-13
 * @see TagInfoSShorts
 *
 **/
public class TagInfoSShortsTest{


  @Test
  public void testEncodeValue() {

      TiffDirectoryType tiffDirectoryType = TiffDirectoryType.TIFF_DIRECTORY_IFD0;
      TagInfoSShorts tagInfoSShorts = new TagInfoSShorts("", 2269, 2269, tiffDirectoryType);
      ByteOrder byteOrder = ByteOrder.nativeOrder();
      short[] shortArray = new short[2];

      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, tagInfoSShorts.encodeValue(byteOrder, shortArray));

  }


}