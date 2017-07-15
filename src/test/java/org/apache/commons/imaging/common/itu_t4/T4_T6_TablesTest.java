package org.apache.commons.imaging.common.itu_t4;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for class {@link T4_T6_Tables}.
 *
 * @date 13.07.2017
 * @see T4_T6_Tables
 *
 **/
public class T4_T6_TablesTest{


  @Test
  public void testCreatesT4_T6_TablesTakingNoArgumentsAndCallsWriteBits() {

      T4_T6_Tables t4_T6_Tables = new T4_T6_Tables();
      BitArrayOutputStream bitArrayOutputStream = new BitArrayOutputStream(2309);
      t4_T6_Tables.EOL16.writeBits(bitArrayOutputStream);

      assertEquals(2, bitArrayOutputStream.size());
      assertEquals("[0, 1]", Arrays.toString(bitArrayOutputStream.toByteArray()));

  }


}