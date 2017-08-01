/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.imaging.formats.jpeg.segments;

import org.apache.commons.imaging.ImageReadException;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;

/**
 * Unit tests for class {@link App2Segment}.
 *
 * @date 2017-08-01
 * @see App2Segment
 *
 **/
public class App2SegmentTest{

  @Test
  public void testEqualsReturningTrue()  throws IOException, ImageReadException {
      App2Segment app2Segment = new App2Segment(0, 0, null);

      assertTrue(app2Segment.equals(app2Segment));
  }

  @Test
  public void testEqualsReturningFalse()  throws IOException, ImageReadException {
      byte[] byteArray = new byte[3];
      App2Segment app2Segment = new App2Segment(65475, byteArray);

      assertFalse(app2Segment.equals(byteArray));
  }

  @Test
  public void testCompareTo() throws IOException, ImageReadException {
      App2Segment app2Segment = new App2Segment(0, 0, null);

      assertEquals(0, app2Segment.compareTo(app2Segment));
  }

}