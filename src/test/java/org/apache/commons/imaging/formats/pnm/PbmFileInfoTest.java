package org.apache.commons.imaging.formats.pnm;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class PbmFileInfoTest{

  @Test
  public void testGetRGBThrowsIOException() throws IOException {
      PbmFileInfo pbmFileInfo = new PbmFileInfo(2764, 354, true);
      byte[] byteArray = new byte[2];
      InputStream inputStream = new ByteArrayInputStream(byteArray);
      inputStream.read(byteArray);

      try { 
        pbmFileInfo.getRGB(inputStream);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         assertEquals("PBM: Unexpected EOF",e.getMessage());
         assertEquals(PbmFileInfo.class.getName(), e.getStackTrace()[0].getClassName());
      }
  }

}