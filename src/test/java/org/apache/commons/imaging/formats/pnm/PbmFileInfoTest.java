package org.apache.commons.imaging.formats.pnm;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Unit tests for class {@link PbmFileInfo}.
 *
 * @date 13.07.2017
 * @see PbmFileInfo
 *
 **/
public class PbmFileInfoTest{


  @Test
  public void testGetRGBThrowsIOException() throws IOException {

      PbmFileInfo pbmFileInfo = new PbmFileInfo(2764, 354, true);
      byte[] byteArray = new byte[2];
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
      byteArrayInputStream.read(byteArray);

      try { 
        pbmFileInfo.getRGB((InputStream) byteArrayInputStream);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
         assertEquals("PBM: Unexpected EOF",e.getMessage());
         assertEquals(PbmFileInfo.class.getName(), e.getStackTrace()[0].getClassName());
      }

  }


}