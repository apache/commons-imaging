package org.apache.commons.imaging.formats.psd.dataparsers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for class {@link DataParserGrayscale}.
 *
 * @date 13.07.2017
 * @see DataParserGrayscale
 *
 **/
public class DataParserGrayscaleTest{


  @Test
  public void testGetBasicChannelsCount() {

      DataParserGrayscale dataParserGrayscale = new DataParserGrayscale();

      assertEquals(1, dataParserGrayscale.getBasicChannelsCount());

  }


}