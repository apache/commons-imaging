package org.apache.commons.imaging.formats.tiff.taginfos;

import org.junit.Test;
import static org.junit.Assert.*;
import java.nio.ByteOrder;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;

/**
 * Unit tests for class {@link TagInfoByteOrShort}.
 *
 * @date 2017-08-01
 * @see TagInfoByteOrShort
 *
 **/
public class TagInfoByteOrShortTest{

  @Test
  public void testEncodeValueTaking1And1AndEncodeValueTaking1And1AndEncodeValueTaking1And1ReturningNonEmptyArrayOne() {
      TiffDirectoryType tiffDirectoryType = TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES;
      TagInfoByteOrShort tagInfoByteOrShort = new TagInfoByteOrShort("r", 500, 500, tiffDirectoryType);
      ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
      short[] shortArray = new short[2];
      byte[] byteArray = tagInfoByteOrShort.encodeValue(byteOrder, shortArray);

      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray);
  }

  @Test
  public void testEncodeValueTaking1And1AndEncodeValueTaking1And1AndEncodeValueTaking1And1ReturningNonEmptyArrayTwo() {
      TiffDirectoryType tiffDirectoryType = TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES;
      TagInfoByteOrShort tagInfoByteOrShort = new TagInfoByteOrShort("r", 500, 500, tiffDirectoryType);
      ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
      byte[] byteArray = new byte[2];
      byte[] byteArrayTwo = tagInfoByteOrShort.encodeValue(byteOrder, byteArray);

      assertSame(byteArrayTwo, byteArray);
  }

}