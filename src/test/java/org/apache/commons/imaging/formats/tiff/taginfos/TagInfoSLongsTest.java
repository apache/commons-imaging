package org.apache.commons.imaging.formats.tiff.taginfos;

import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.ByteOrder;

public class TagInfoSLongsTest {

    @Test
    public void testEncodeValueLittleEndian() {
        TagInfoSLongs tagInfo = new TagInfoSLongs("TestTag", 1, 3, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        int[] values = {123, 231, 135};
        byte[] encoded = tagInfo.encodeValue(byteOrder, values);
        byte[] expected = {(byte) 0x7b, 0, 0, 0, (byte) 0xe7, 0, 0, 0, (byte) 0x87, 0, 0, 0};

        Assertions.assertArrayEquals(expected, encoded);
    }

    @Test
    public void testEncodeValueBigEndian() {
        TagInfoSLongs tagInfo = new TagInfoSLongs("TestTag", 1, 3, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        int[] values = {123, 231, 135};
        byte[] encoded = tagInfo.encodeValue(byteOrder, values);
        byte[] expected = {0, 0, 0, (byte) 0x7b, 0, 0, 0, (byte) 0xe7, 0, 0, 0, (byte) 0x87};

        Assertions.assertArrayEquals(expected, encoded);
    }

    @Test
    public void testGetValueLittleEndian() {
        TagInfoSLongs tagInfo = new TagInfoSLongs("TestTag", 1, 3, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byte[] bytes = {(byte) 0x7b, 0, 0, 0, (byte) 0xe7, 0, 0, 0, (byte) 0x87, 0, 0, 0};

        int[] decoded = tagInfo.getValue(byteOrder, bytes);

        int[] expected = {123, 231, 135};
        Assertions.assertArrayEquals(expected, decoded);
    }

    @Test
    public void testGetValueBigEndian() {
        TagInfoSLongs tagInfo = new TagInfoSLongs("TestTag", 1, 3, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        byte[] bytes = {0, 0, 0, (byte) 0x7b, 0, 0, 0, (byte) 0xe7, 0, 0, 0, (byte) 0x87};

        int[] decoded = tagInfo.getValue(byteOrder, bytes);

        int[] expected = {123, 231, 135};
        Assertions.assertArrayEquals(expected, decoded);
    }
}
