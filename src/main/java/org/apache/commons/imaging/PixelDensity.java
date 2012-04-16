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
package org.apache.commons.imaging;

public class PixelDensity {
    private double horizontalDensity;
    private double verticalDensity;
    /// One-tenth of a millimetre units.
    private int unitLength;
    
    private PixelDensity(double horizontalDensity, double verticalDensity, int unitLength) {
        this.horizontalDensity = horizontalDensity;
        this.verticalDensity = verticalDensity;
        this.unitLength = unitLength;
    }
    
    public static PixelDensity createUnitless(double x, double y) {
        return new PixelDensity(x, y, 0);
    }
    
    public static PixelDensity createFromPixelsPerInch(double x, double y) {
        return new PixelDensity(x, y, 254);
    }
    
    public static PixelDensity createFromPixelsPerMetre(double x, double y) {
        return new PixelDensity(x, y, 10000);
    }
    
    public static PixelDensity createFromPixelsPerCentimetre(double x, double y) {
        return new PixelDensity(x, y, 100);
    }
    
    public boolean isUnitless() {
        return unitLength == 0;
    }
    
    public boolean isInInches() {
        return unitLength == 254;
    }
    
    public boolean isInCentimetres() {
        return unitLength == 100;
    }
    
    public boolean isInMetres() {
        return unitLength == 10000;
    }
    
    public double getRawHorizontalDensity() {
        return horizontalDensity;
    }
    
    public double getRawVerticalDensity() {
        return verticalDensity;
    }
    
    public double horizontalDensityInches() {
        if (isInInches()) {
            return horizontalDensity;
        } else {
            return horizontalDensity * 254 / unitLength;
        }
    }
    
    public double verticalDensityInches() {
        if (isInInches()) {
            return verticalDensity;
        } else {
            return verticalDensity * 254 / unitLength; 
        }
    }
    
    public double horizontalDensityMetres() {
        if (isInMetres()) {
            return horizontalDensity;
        } else {
            return horizontalDensity * 10000 / unitLength;
        }
    }
    
    public double verticalDensityMetres() {
        if (isInMetres()) {
            return verticalDensity;
        } else {
            return verticalDensity * 10000 / unitLength;
        }
    }
    
    public double horizontalDensityCentimetres() {
        if (isInCentimetres()) {
            return horizontalDensity;
        } else {
            return horizontalDensity * 100 / unitLength;
        }
    }
    
    public double verticalDensityCentimetres() {
        if (isInCentimetres()) {
            return verticalDensity;
        } else {
            return verticalDensity * 100 / unitLength;
        }
    }
}
