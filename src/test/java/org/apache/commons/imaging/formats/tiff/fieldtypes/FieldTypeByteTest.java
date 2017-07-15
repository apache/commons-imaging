package org.apache.commons.imaging.formats.tiff.fieldtypes;

import org.junit.Test;

import java.nio.ByteOrder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Unit tests for class {@link FieldTypeByte}.
 *
 * @date 13.07.2017
 * @see FieldTypeByte
 *
 **/
public class FieldTypeByteTest{


  @Test
  public void testWriteDataWithNull() {

      FieldTypeByte fieldTypeByte = FieldType.UNDEFINED;
      ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;

      try { 
        fieldTypeByte.writeData( null, byteOrder);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         assertEquals("Invalid data: null (null)",e.getMessage());
         assertEquals(FieldTypeByte.class.getName(), e.getStackTrace()[0].getClassName());
      }

  }


}