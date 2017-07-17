package org.apache.commons.imaging.formats.tiff.fieldtypes;

import org.junit.Test;

import java.nio.ByteOrder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Unit tests for class {@link FieldTypeLong}.
 *
 * @date 2017-07-13
 * @see FieldTypeLong
 **/
public class FieldTypeLongTest {


    @Test
    public void testWriteDataWithNonNull() {

        FieldTypeLong fieldTypeLong = FieldType.IFD;
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;

        try {
            fieldTypeLong.writeData(byteOrder, byteOrder);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            assertEquals("Invalid data: BIG_ENDIAN (java.nio.ByteOrder)", e.getMessage());
            assertEquals(FieldTypeLong.class.getName(), e.getStackTrace()[0].getClassName());
        }

    }


}