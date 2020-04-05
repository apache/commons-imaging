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
 * Provides a palette entry for a color assignment to a single value. This class
 * will assign a color to a value only if it is an exact match for the input.
 * This class will also support Float.NaN
 */
public class PaletteEntryForValue implements PaletteEntry {

    private final float value;
    private final int iColor;
    private final Color color;
    private boolean isNull;

    /**
     * Constructs a palette entry for a single value.
     * <p>
     * This class will support color-assignments for Float.NaN.
     *
     * @param value the color value associated with this palette entry; a
     * Float&#46;NaN is allowed.
     * @param color the color assigned to value
     */
    public PaletteEntryForValue(float value, Color color) {
        if (color == null) {
            throw new IllegalArgumentException("Null colors not allowed");
        }
        this.value = value;
        this.color = color;
        this.iColor = color.getRGB();
        isNull = Float.isNaN(value);

    }

    @Override
    public boolean isCovered(float f) {
        if (isNull) {
            return Float.isNaN(f);
        }
        return f == value;
    }

    @Override
    public int getARGB(float f) {
        if (isNull && Float.isNaN(f)) {
            return iColor;
        } else if (f == value) {
            return iColor;
        }
        return 0;
    }

    @Override
    public Color getColor(float f) {
        if (isNull && Float.isNaN(f)) {
            return color;
        } else if (f == value) {
            return color;
        }
        return null;
    }

    @Override
    public boolean coversSingleEntry() {
        return true;
    }

    @Override
    public float getLowerBound() {
        return value;
    }

    @Override
    public float getUpperBound() {
        return value;
    }

    @Override
    public String toString() {
        return "PaletteEntry for single value" + value;
    }
}
