package org.apache.commons.imaging.formats.psd.dataparsers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for class {@link DataParserCmyk}.
 *
 * @date 13.07.2017
 * @see DataParserCmyk
 *
 **/
public class DataParserCmykTest{


  @Test
  public void testGetBasicChannelsCount() {

      DataParserCmyk dataParserCmyk = new DataParserCmyk();

      assertEquals(4, dataParserCmyk.getBasicChannelsCount());

  }


}