package org.apache.commons.imaging.formats.psd.dataparsers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DataParserLabTest{

  @Test
  public void testGetBasicChannelsCount() {
      DataParserLab dataParserLab = new DataParserLab();

      assertEquals(3, dataParserLab.getBasicChannelsCount());
  }

}