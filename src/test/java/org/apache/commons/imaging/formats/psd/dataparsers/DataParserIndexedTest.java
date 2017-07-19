package org.apache.commons.imaging.formats.psd.dataparsers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class DataParserIndexedTest{

  @Test
  public void testFailsToCreateDataParserIndexedThrowsArrayIndexOutOfBoundsException() {
      byte[] byteArray = new byte[24];
      DataParserIndexed dataParserIndexed = null;

      try {
        dataParserIndexed = new DataParserIndexed(byteArray);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         assertEquals("256",e.getMessage());
         assertEquals(DataParserIndexed.class.getName(), e.getStackTrace()[0].getClassName());
      }
  }

}