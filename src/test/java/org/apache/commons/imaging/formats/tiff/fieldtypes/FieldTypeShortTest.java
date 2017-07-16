package org.apache.commons.imaging.formats.tiff.fieldtypes;

import org.junit.Test;

import java.nio.ByteOrder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Unit tests for class {@link FieldTypeShort}.
 *
 * @date 13.07.2017
 * @see FieldTypeShort
 **/
public class FieldTypeShortTest {


    @Test
    public void testCreatesFieldTypeShortAndCallsWriteData() {

        FieldTypeShort fieldTypeShort = new FieldTypeShort(1234, "");
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;

        try {
            fieldTypeShort.writeData("", byteOrder);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            assertEquals("Invalid data:  (java.lang.String)", e.getMessage());
            assertEquals(FieldTypeShort.class.getName(), e.getStackTrace()[0].getClassName());
        }

    }


}