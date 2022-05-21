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

import org.apache.commons.imaging.common.BufferedImageFactory;

/**
 * Imaging parameters.
 *
 * <p>Contains parameters that are common to all formats. Implementations must include
 * the specific parameters for each image format.</p>
 *
 * @since 1.0-alpha3
 */
public class ImagingParameters {

    /**
     * Whether to throw an exception when any issue occurs during reading
     * or writing a file format. Default is {@code false}.
     */
    private boolean strict = false;

    /**
     * An optional file name, used for the description of input streams
     * where a file name would be hard (or not possible) to be identified.
     * Default is {@code null}.
     */
    private String fileName = null;

    /**
     * Factory to create {@code BufferedImage}s. Default is {@code null}.
     */
    private BufferedImageFactory bufferedImageFactory = null;

    /**
     * <p>Parameter key. Used in write operations to indicate the desired pixel
     * density (DPI), and/or aspect ratio.</p>
     */
    private PixelDensity pixelDensity;

    // getters and setters

    public boolean isStrict() {
        return strict;
    }

    public void setStrict(final boolean strict) {
        this.strict = strict;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(final String fileName) {
        this.fileName = fileName;
    }

    public BufferedImageFactory getBufferedImageFactory() {
        return bufferedImageFactory;
    }

    public void setBufferedImageFactory(final BufferedImageFactory bufferedImageFactory) {
        this.bufferedImageFactory = bufferedImageFactory;
    }

    public PixelDensity getPixelDensity() {
        return pixelDensity;
    }

    public void setPixelDensity(final PixelDensity pixelDensity) {
        this.pixelDensity = pixelDensity;
    }
}
