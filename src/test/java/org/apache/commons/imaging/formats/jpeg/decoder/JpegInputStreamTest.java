package org.apache.commons.imaging.formats.jpeg.decoder;

import org.apache.commons.imaging.ImageReadException;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Unit tests for class {@link JpegInputStream}.
 *
 * @date 2017-08-01
 * @see JpegInputStream
 **/
public class JpegInputStreamTest {

  @Test(expected = ImageReadException.class)
  public void testNextBitThrowsImageReadExceptionOne() throws IOException, ImageReadException {
    byte[] byteArray = new byte[6];
    byteArray[0] = (byte) (-1);
    byteArray[1] = (byte) 74;
    InputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
    JpegInputStream jpegInputStream = new JpegInputStream(byteArrayInputStream);

    jpegInputStream.nextBit();

  }

  @Test(expected = ImageReadException.class)
  public void testNextBitThrowsImageReadExceptionTwo() throws IOException, ImageReadException {
    byte[] byteArray = new byte[0];
    InputStream byteArrayInputStream = new ByteArrayInputStream(byteArray, 0, (-1));
    JpegInputStream jpegInputStream = new JpegInputStream(byteArrayInputStream);

    jpegInputStream.nextBit();

  }

}