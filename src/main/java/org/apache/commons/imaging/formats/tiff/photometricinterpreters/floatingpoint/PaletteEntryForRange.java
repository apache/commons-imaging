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
package org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint;

import java.awt.Color;

/**
 * Provides a palette entry for colors associated with a range of values. The
 * return value will be interpolated between the minimum and maximum value for
 * this entry.
 * <p>
 * In keeping with the conventions of many Geographic Information Systems (GIS)
 * and art applications, this instance "covered" values in the range v0 &le; f
 * &lt; v1. Thus, a value that exactly matches the upper bound of the range is
 * not considered "covered".
 */
public class PaletteEntryForRange implements IPaletteEntry {

    private final float v0;
    private final float v1;
    private final float r0;
    private final float r1;
    private final float g0;
    private final float g1;
    private final float b0;
    private final float b1;
    private final float a0;
    private final float a1;

    /**
     * Constructs a palette entry for the range of values v0 &le; f &lt; v1. The
     * return color value will be interpolated between the two specified colors.
     *
     * @param v0 the lower bounds (inclusive) of the covered range of values
     * @param v1 the upper bounds (non-inclusive) of the covered range of value
     * @param color0 the color assigned to value v0
     * @param color1 the color assigned to value v1
     */
    public PaletteEntryForRange(float v0, float v1, Color color0, Color color1) {
        this.v0 = v0;
        this.v1 = v1;
        float deltaV = v1 - v0;
        // check for range volation
        if (deltaV <= 0 || Float.isNaN(deltaV)) {
            throw new IllegalArgumentException("Specified values must be v0<v1");
        }
        if (color0 == null || color1 == null) {
            throw new IllegalArgumentException("Null colors not allowed");
        }
        int argb0 = color0.getRGB();
        a0 = (argb0 >> 24) & 0xff;
        r0 = (argb0 >> 16) & 0xff;
        g0 = (argb0 >> 8) & 0xff;
        b0 = argb0 & 0xff;

        int argb1 = color1.getRGB();
        a1 = (argb1 >> 24) & 0xff;
        r1 = (argb1 >> 16) & 0xff;
        g1 = (argb1 >> 8) & 0xff;
        b1 = argb1 & 0xff;
    }

    /**
     * Constructs a palette entry for the range of values v0 &le; f &lt; v1. A
     * single color will be returned for all values in range
     *
     * @param v0 the lower bounds (inclusive) of the covered range of values
     * @param v1 the upper bounds (non-inclusive) of the covered range of value
     * @param color the color assigned to value v0
     */
    public PaletteEntryForRange(float v0, float v1, Color color) {
        this.v0 = v0;
        this.v1 = v1;
        float deltaV = v1 - v0;
        // check for range volation
        if (deltaV <= 0 || Float.isNaN(deltaV)) {
            throw new IllegalArgumentException("Specified values must be v0<v1");
        }
        if (color == null) {
            throw new IllegalArgumentException("Null colors not allowed");
        }

        int argb0 = color.getRGB();
        a0 = (argb0 >> 24) & 0xff;
        r0 = (argb0 >> 16) & 0xff;
        g0 = (argb0 >> 8) & 0xff;
        b0 = argb0 & 0xff;

        int argb1 = color.getRGB();
        a1 = (argb1 >> 24) & 0xff;
        r1 = (argb1 >> 16) & 0xff;
        g1 = (argb1 >> 8) & 0xff;
        b1 = argb1 & 0xff;
    }

    @Override
    public boolean isCovered(float f) {
        return v0 <= f && f < v1;
    }

    @Override
    public int getARGB(float f) {
        if (v0 <= f && f <= v1) {
            float t = (f - v0) / (v1 - v0);
            int a = (int) (t * (a1 - a0) + a0 + 0.5);
            int r = (int) (t * (r1 - r0) + r0 + 0.5);
            int g = (int) (t * (g1 - g0) + g0 + 0.5);
            int b = (int) (t * (b1 - b0) + b0 + 0.5);
            return (((((a << 8) | r) << 8) | g) << 8) | b;
        }
        return 0;
    }

    @Override
    public Color getColor(float f) {
        if (v0 <= f && f <= v1) {
            float t = (f - v0) / (v1 - v0);
            int a = (int) (t * (a1 - a0) + a0 + 0.5);
            int r = (int) (t * (r1 - r0) + r0 + 0.5);
            int g = (int) (t * (g1 - g0) + g0 + 0.5);
            int b = (int) (t * (b1 - b0) + b0 + 0.5);
            return new Color(r, g, b, a);
        }
        return null;
    }

    @Override
    public boolean coversSingleEntry() {
        return false;
    }

    @Override
    public float getLowerBound() {
        return v0;
    }

    @Override
    public float getUpperBound() {
        return v1;
    }

    @Override
    public String toString() {
        return "PaletteEntry for range " + v0 + ", " + v1;
    }
}
