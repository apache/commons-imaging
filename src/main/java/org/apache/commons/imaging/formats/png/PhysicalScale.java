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

/**
 * Used to specify physical scale when reading or storing image information.
 */
public final class PhysicalScale {
   private static final int METER_UNITS = 1;
   private static final int RADIAN_UNITS = 2;
   public static final PhysicalScale UNDEFINED = createFromMeters(-1.0, -1.0);

   public static PhysicalScale createFromMeters(final double x, final double y) {
      return new PhysicalScale(METER_UNITS, x, y);
   }
   public static PhysicalScale createFromRadians(final double x, final double y) {
      return new PhysicalScale(RADIAN_UNITS, x, y);
   }
   private final int units;

   private final double horizontalUnitsPerPixel;

   private final double verticalUnitsPerPixel;

   private PhysicalScale(final int units, final double horizontalUnitsPerPixel,
                         final double verticalUnitsPerPixel) {
      this.units = units;
      this.horizontalUnitsPerPixel = horizontalUnitsPerPixel;
      this.verticalUnitsPerPixel = verticalUnitsPerPixel;
   }

   public double getHorizontalUnitsPerPixel() {
      return horizontalUnitsPerPixel;
   }

   public double getVerticalUnitsPerPixel() {
      return verticalUnitsPerPixel;
   }

   public boolean isInMeters() {
      return METER_UNITS == units;
   }

   public boolean isInRadians() {
      return RADIAN_UNITS == units;
   }
}
