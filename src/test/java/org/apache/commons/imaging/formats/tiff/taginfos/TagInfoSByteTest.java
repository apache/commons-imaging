package org.apache.commons.imaging.formats.tiff.taginfos;

import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;
import org.junit.Test;

import java.nio.ByteOrder;

import static org.junit.Assert.assertArrayEquals;

/**
 * Unit tests for class {@link TagInfoSByte}.
 *
 * @date 13.07.2017
 * @see TagInfoSByte
 *
 **/
public class TagInfoSByteTest{


  @Test
  public void testCreatesTagInfoSByteAndCallsEncodeValue() {

      TiffDirectoryType tiffDirectoryType = TiffDirectoryType.EXIF_DIRECTORY_GPS;
      TagInfoSByte tagInfoSByte = new TagInfoSByte("", 0, tiffDirectoryType);
      ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
      byte[] byteArray = tagInfoSByte.encodeValue(byteOrder, (byte)6);

      assertArrayEquals(new byte[] {(byte)6}, byteArray);

  }


}