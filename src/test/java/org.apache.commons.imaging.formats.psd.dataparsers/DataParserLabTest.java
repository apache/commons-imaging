package org.apache.commons.imaging.formats.psd.dataparsers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for class {@link DataParserLab}.
 *
 * @date 13.07.2017
 * @see DataParserLab
 *
 **/
public class DataParserLabTest{


  @Test
  public void testGetBasicChannelsCount() {

      DataParserLab dataParserLab = new DataParserLab();

      assertEquals(3, dataParserLab.getBasicChannelsCount());

  }


}