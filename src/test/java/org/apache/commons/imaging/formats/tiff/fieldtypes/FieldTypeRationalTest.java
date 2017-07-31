package org.apache.commons.imaging.formats.tiff.fieldtypes;

import org.apache.commons.imaging.ImageWriteException;
import org.junit.Test;
import static org.junit.Assert.*;
import java.nio.ByteOrder;
import org.apache.commons.imaging.common.RationalNumber;
import org.apache.commons.imaging.formats.tiff.TiffField;

/**
 * Unit tests for class {@link FieldTypeRational}.
 *
 * @date 2017-08-01
 * @see FieldTypeRational
 *
 **/
public class FieldTypeRationalTest{

  @Test
  public void testWriteDataWithNull() throws ImageWriteException {
      FieldTypeRational fieldTypeRational = new FieldTypeRational(9, null);
      Double doubleOne = new Double(2.2);
      byte[] byteArray = fieldTypeRational.writeData(doubleOne, null);

      assertArrayEquals(new byte[] {(byte)11, (byte)0, (byte)0, (byte)0, (byte)5, (byte)0, (byte)0, (byte)0}, byteArray);
  }

  @Test(expected = ImageWriteException.class)
  public void testWriteDataWithNonNull() throws ImageWriteException {
      FieldTypeRational fieldTypeRational = new FieldTypeRational((-922), "z_AX");
      ByteOrder byteOrder = ByteOrder.nativeOrder();

      fieldTypeRational.writeData("z_AX", byteOrder);

  }

}