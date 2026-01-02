/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.imaging.formats.png.transparencyfilters;

import java.io.IOException;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.common.BinaryFileParser;

/**
 * Abstract class for PNG transparency filters.
 */
public abstract class AbstractTransparencyFilter extends BinaryFileParser {

    private final byte[] bytes;

    /**
     * Constructs a new instance.
     *
     * @param bytes bytes.
     */
    public AbstractTransparencyFilter(final byte[] bytes) {
        this.bytes = bytes.clone();
    }

    /**
     * Filters a pixel's RGB value based on transparency information.
     *
     * @param rgb the RGB value.
     * @param index the pixel index.
     * @return the filtered RGB value.
     * @throws ImagingException if the image format is invalid.
     * @throws IOException if an I/O error occurs.
     */
    public abstract int filter(int rgb, int index) throws ImagingException, IOException;

    /**
     * Gets the byte at the given offset.
     *
     * @param offset offset.
     * @return a byte.
     */
    public byte getByte(final int offset) {
        return bytes[offset];
    }

    /**
     * Gets the length.
     *
     * @return the length
     */
    public int getLength() {
        return bytes.length;
    }
}
