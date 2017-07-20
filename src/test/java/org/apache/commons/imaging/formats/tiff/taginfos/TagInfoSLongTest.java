package org.apache.commons.imaging.formats.tiff.taginfos;

import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;
import org.junit.Test;

import java.nio.ByteOrder;

import static org.junit.Assert.assertArrayEquals;

public class TagInfoSLongTest{

  @Test
  public void testEncodeValue() {
      TiffDirectoryType tiffDirectoryType = TiffDirectoryType.TIFF_DIRECTORY_IFD0;
      TagInfoSLong tagInfoSLong = new TagInfoSLong("ttq{\"0r{s}'RQ", (-1770), tiffDirectoryType);
      ByteOrder byteOrder = ByteOrder.nativeOrder();

      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, tagInfoSLong.encodeValue(byteOrder, 0));
  }

}