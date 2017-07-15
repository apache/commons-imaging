package org.apache.commons.imaging.formats.pnm;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for class {@link WhiteSpaceReader}.
 *
 * @date 13.07.2017
 * @see WhiteSpaceReader
 *
 **/
public class WhiteSpaceReaderTest{


  @Test
  public void testReadLineReturningNonEmptyString() throws IOException {

      byte[] byteArray = new byte[6];
      byteArray[4] = (byte)13;
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
      WhiteSpaceReader whiteSpaceReader = new WhiteSpaceReader(byteArrayInputStream);

      assertEquals(6, byteArrayInputStream.available());
      assertEquals("[0, 0, 0, 0]", Arrays.toString( whiteSpaceReader.readLine().getBytes() ) );

  }


}