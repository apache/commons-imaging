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
package org.apache.commons.imaging.formats.png;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PhysicalScaleTest {
   private static final double delta = 0.01;

   @Test
   public void createFromMeters() {
      final PhysicalScale physicalScale = PhysicalScale.createFromMeters(1.0, 2.0);

      assertTrue("Should be in meteres", physicalScale.isInMeters());
      assertFalse("Should not be in radians", physicalScale.isInRadians());
      assertEquals("Invalid horizontal units per pixel", physicalScale.getHorizontalUnitsPerPixel(), 1.0, delta);
      assertEquals("Invalid vertical units per pixel", physicalScale.getVerticalUnitsPerPixel(), 2.0, delta);
   }

   @Test
   public void createFromRadians() {
      final PhysicalScale physicalScale = PhysicalScale.createFromRadians(2.0, 1.0);

      assertFalse("Should not be in meteres", physicalScale.isInMeters());
      assertTrue("Should be in radians", physicalScale.isInRadians());
      assertEquals("Invalid horizontal units per pixel", physicalScale.getHorizontalUnitsPerPixel(), 2.0, delta);
      assertEquals("Invalid vertical units per pixel", physicalScale.getVerticalUnitsPerPixel(), 1.0, delta);
   }
}
