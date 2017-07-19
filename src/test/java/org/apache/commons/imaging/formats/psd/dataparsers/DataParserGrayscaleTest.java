package org.apache.commons.imaging.formats.psd.dataparsers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DataParserGrayscaleTest{

  @Test
  public void testGetBasicChannelsCount() {
      DataParserGrayscale dataParserGrayscale = new DataParserGrayscale();

      assertEquals(1, dataParserGrayscale.getBasicChannelsCount());
  }

}