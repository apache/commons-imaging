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
package org.apache.commons.imaging.palette;

import org.apache.commons.imaging.ImagingException;

/**
 * Color palette.
 */
public interface Palette {

    /**
     * Gets the color for a given palette index.
     *
     * @param index the palette index to look up
     * @return the color in ARGB format
     */
    int getEntry(int index);

    /**
     * Gets the palette index for a given color.
     *
     * @param rgb the color to look up
     * @return the palette index
     * @throws ImagingException if it fails to read the palette index
     */
    int getPaletteIndex(int rgb) throws ImagingException;

    /**
     * Gets the number of entries in the palette.
     *
     * @return the number of palette entries
     */
    int length();

}
