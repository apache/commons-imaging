package org.apache.commons.imaging.formats.tiff.taginfos;

import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;
import org.junit.Test;

import java.nio.ByteOrder;

import static org.junit.Assert.assertSame;

/**
 * Unit tests for class {@link TagInfoSBytes}.
 *
 * @date 2017-07-13
 * @see TagInfoSBytes
 *
 **/
public class TagInfoSBytesTest{


  @Test
  public void testCreatesTagInfoSBytesAndCallsEncodeValue() {

      TiffDirectoryType tiffDirectoryType = TiffDirectoryType.TIFF_DIRECTORY_IFD3;
      TagInfoSBytes tagInfoSBytes = new TagInfoSBytes("", (-198), 10, tiffDirectoryType);
      ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
      byte[] byteArray = new byte[2];
      byte[] byteArrayTwo = tagInfoSBytes.encodeValue(byteOrder, byteArray);

      assertSame(byteArrayTwo, byteArray);

  }


}