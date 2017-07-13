package org.apache.commons.imaging.formats.pcx;

import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Unit tests for class {@link RleReader}.
 *
 * @date 13.07.2017
 * @see RleReader
 *
 **/
public class RleReaderTest{


  @Test
  public void testReadWithNonNull() {

      RleReader rleReader = new RleReader(false);
      byte[] byteArray = new byte[1];
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray, (byte) (-64), (byte) (-64));

      try { 
        rleReader.read(byteArrayInputStream, byteArray);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         assertEquals("Premature end of file reading image data",e.getMessage());
         assertEquals(RleReader.class.getName(), e.getStackTrace()[0].getClassName());
      }

  }


}