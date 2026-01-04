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
package org.apache.commons.imaging;

import org.apache.commons.imaging.common.BufferedImageFactory;

/**
 * Imaging parameters.
 *
 * <p>
 * Contains parameters that are common to all formats. Implementations must include the specific parameters for each image format.
 * </p>
 *
 * @param <E> This type
 * @since 1.0-alpha3
 */
public class ImagingParameters<E extends ImagingParameters<E>> {

    /**
     * Whether to throw an exception when any issue occurs during reading or writing a file format. Default is {@code false}.
     */
    private boolean strict;

    /**
     * An optional file name, used for the description of input streams where a file name would be hard (or not possible) to be identified. Default is
     * {@code null}.
     */
    private String fileName;

    /**
     * Creates {@code BufferedImage}s. Default is {@code null}.
     */
    private BufferedImageFactory bufferedImageFactory;

    /**
     * <p>
     * Parameter key. Used in write operations to indicate the desired pixel density (DPI), and/or aspect ratio.
     * </p>
     */
    private PixelDensity pixelDensity;

    /**
     * Constructs a new instance.
     */
    public ImagingParameters() {
    }

    /**
     * Returns this instance typed as the subclass type {@code E}.
     * <p>
     * This is the same as the expression:
     * </p>
     * <pre>
     * (B) this
     * </pre>
     *
     * @return {@code this} instance typed as the subclass type {@code E}.
     */
    @SuppressWarnings("unchecked")
    public E asThis() {
        return (E) this;
    }

    /**
     * Gets the buffered image factory.
     *
     * @return the buffered image factory, or null if not set.
     */
    public BufferedImageFactory getBufferedImageFactory() {
        return bufferedImageFactory;
    }

    /**
     * Gets the file name.
     *
     * @return the file name, or null if not set.
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Gets the pixel density.
     *
     * @return the pixel density, or null if not set.
     */
    public PixelDensity getPixelDensity() {
        return pixelDensity;
    }

    /**
     * Gets whether strict mode is enabled.
     *
     * @return true if strict mode is enabled, false otherwise.
     */
    public boolean isStrict() {
        return strict;
    }

    /**
     * Sets the buffered image factory.
     *
     * @param bufferedImageFactory the buffered image factory.
     * @return this instance.
     */
    public E setBufferedImageFactory(final BufferedImageFactory bufferedImageFactory) {
        this.bufferedImageFactory = bufferedImageFactory;
        return asThis();
    }

    /**
     * Sets the file name.
     *
     * @param fileName the file name.
     * @return this instance.
     */
    public E setFileName(final String fileName) {
        this.fileName = fileName;
        return asThis();
    }

    /**
     * Sets the pixel density.
     *
     * @param pixelDensity the pixel density.
     * @return this instance.
     */
    public E setPixelDensity(final PixelDensity pixelDensity) {
        this.pixelDensity = pixelDensity;
        return asThis();
    }

    /**
     * Sets whether strict mode is enabled.
     *
     * @param strict true to enable strict mode, false otherwise.
     * @return this instance.
     */
    public E setStrict(final boolean strict) {
        this.strict = strict;
        return asThis();
    }
}
