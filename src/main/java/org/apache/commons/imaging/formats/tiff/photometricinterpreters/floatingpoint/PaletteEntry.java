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
 * Defines an interface for specifying color assignments to floating point
 * values.
 */
public interface PaletteEntry {

    /**
     * Indicates that the entry covers exactly one unique value (including,
     * potentially, Float&#46;NaN).
     *
     * @return true if the entry covers exactly one unique value
     */
    boolean coversSingleEntry();

    /**
     * Gets the integer ARGB color assignment associated with the input value.
     * If the input value is not within the covered range of this instance, the
     * return value is undefined (though the value zero is often used).
     *
     * @param f valid floating point value, or a NaN.
     * @return an integer value
     */
    int getArgb(float f);

    /**
     * Gets the color assignment associated with the input value. If the input
     * value is not within the covered range of this instance, the return value
     * is undefined (though a null return is often used).
     *
     * @param f a valid floating point value, or a NaN.
     * @return a valid color instance or, potentially, a null if the floating
     * point input is not within the covered range.
     */
    Color getColor(float f);

    /**
     * Gets the lower-bound value for the palette entry
     *
     * @return if defined, a valid floating point value; otherwise, a null.
     */
    float getLowerBound();

    /**
     * Gets the upper-bound value for the palette entry
     *
     * @return if defined, a valid floating point value; otherwise, a null.
     */
    float getUpperBound();

    /**
     * Indicates whether the indicated floating-point value is within the range
     * covered by this palette entry and can be assigned a valid color by the
     * implementation.
     *
     * @param f a valid floating point value, or a NaN.
     * @return true if the entry can assign a color to the entry; otherwise,
     * false.
     */
    boolean isCovered(float f);
}
