package org.apache.commons.imaging.formats.tiff.fieldtypes;

import org.apache.commons.imaging.ImageWriteException;
import org.junit.Test;
import static org.junit.Assert.*;
import java.nio.ByteOrder;
import org.apache.commons.imaging.formats.tiff.TiffField;

/**
 * Unit tests for class {@link FieldTypeAscii}.
 *
 * @date 2017-08-01
 * @see FieldTypeAscii
 *
 **/
public class FieldTypeAsciiTest{

  @Test(expected = ImageWriteException.class)
  public void testCreatesFieldTypeAsciiAndCallsWriteData() throws ImageWriteException {
      FieldTypeAscii fieldTypeAscii = new FieldTypeAscii(0, "1");
      byte[] byteArray = new byte[1];
      ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
      TiffField tiffField = new TiffField(0, 0, fieldTypeAscii, 0L, 0, byteArray, byteOrder, 1);

      fieldTypeAscii.writeData(tiffField, byteOrder);

  }

  @Test
  public void testCreatesFieldTypeAsciiAndWriteDataUsingByteArray() throws ImageWriteException {
      FieldTypeAscii fieldTypeAscii = new FieldTypeAscii(0, "1");
      byte[] byteArray = new byte[1];
      ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
      byte[] byteArrayTwo = fieldTypeAscii.writeData(byteArray, byteOrder);

      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArrayTwo);
  }

    @Test
    public void testCreatesFieldTypeAsciiAndWriteDataUsingString() throws ImageWriteException {
        FieldTypeAscii fieldTypeAscii = new FieldTypeAscii(0, "1");
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        byte[] byteArrayTwo = fieldTypeAscii.writeData("asdf", byteOrder);

        assertArrayEquals(new byte[] {(byte)97, (byte)115, (byte)100, (byte)102, (byte)0}, byteArrayTwo);
    }

}