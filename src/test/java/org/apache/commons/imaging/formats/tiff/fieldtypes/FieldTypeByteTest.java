package org.apache.commons.imaging.formats.tiff.fieldtypes;

import org.apache.commons.imaging.ImageWriteException;
import org.junit.Test;

import java.nio.ByteOrder;

public class FieldTypeByteTest{

  @Test(expected = ImageWriteException.class)
  public void testWriteDataWithNull() throws ImageWriteException {
      FieldTypeByte fieldTypeByte = FieldType.UNDEFINED;
      ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;

      fieldTypeByte.writeData( null, byteOrder);
  }

}