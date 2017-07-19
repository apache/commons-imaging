package org.apache.commons.imaging.formats.tiff.taginfos;

import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;
import org.junit.Test;

import java.nio.ByteOrder;

import static org.junit.Assert.assertArrayEquals;

public class TagInfoByteTest {

    @Test
    public void testCreatesTagInfoByteTakingFourArgumentsAndCallsEncodeValue() {
        TiffDirectoryType tiffDirectoryType = TiffDirectoryType.TIFF_DIRECTORY_IFD0;
        TagInfoByte tagInfoByte = new TagInfoByte("", 347, tiffDirectoryType);

        assertArrayEquals(new byte[]{(byte) 0}, tagInfoByte.encodeValue((ByteOrder) null, (byte) 0));
    }

}