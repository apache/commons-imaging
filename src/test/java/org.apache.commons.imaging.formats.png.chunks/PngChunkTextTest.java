package org.apache.commons.imaging.formats.png.chunks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Unit tests for class {@link PngChunkText}.
 *
 * @date 13.07.2017
 * @see PngChunkText
 *
 **/
public class PngChunkTextTest{


  @Test
  public void testCreatesPngChunkText() {

      byte[] byteArray = new byte[0];
      PngChunkText pngChunkText = null;

      try {
        pngChunkText = new PngChunkText(1214, 1214, 0, byteArray);
        fail("Expecting exception: Exception");
      } catch(Throwable e) {
         assertEquals("PNG tEXt chunk keyword is not terminated.",e.getMessage());
         assertEquals(PngChunkText.class.getName(), e.getStackTrace()[0].getClassName());
      }

  }


}