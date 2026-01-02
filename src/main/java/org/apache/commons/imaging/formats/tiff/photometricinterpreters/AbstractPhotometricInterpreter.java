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
package org.apache.commons.imaging.formats.tiff.photometricinterpreters;

import java.io.IOException;
import java.util.Objects;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.common.ImageBuilder;

/**
 * Interpreter for photometric information in TIFF images. The photometric interpretation tag is a requirement for valid TIFF images, and defines the color
 * space of the image data.
 *
 * @see <a href= "https://www.awaresystems.be/imaging/tiff/tifftags/photometricinterpretation.html"> Baseline TIFF Tag PhotometricInterpretation</a>
 */
public abstract class AbstractPhotometricInterpreter {

    /** The number of samples per pixel. */
    protected final int samplesPerPixel;

    private final int[] bitsPerSample;

    /** The predictor value. */
    protected final int predictor;

    /** The image width. */
    protected final int width;

    /** The image height. */
    protected final int height;

    /**
     * Constructs a new photometric interpreter.
     *
     * @param samplesPerPixel the number of samples per pixel.
     * @param bitsPerSample the bits per sample array.
     * @param predictor the predictor value.
     * @param width the image width.
     * @param height the image height.
     */
    public AbstractPhotometricInterpreter(final int samplesPerPixel, final int[] bitsPerSample, final int predictor, final int width, final int height) {
        this.samplesPerPixel = samplesPerPixel;
        this.bitsPerSample = Objects.requireNonNull(bitsPerSample, "bitsPerSample");
        this.predictor = predictor;
        this.width = width;
        this.height = height;
    }

    /**
     * Gets the bits per sample at the specified offset.
     *
     * @param offset the sample offset.
     * @return the bits per sample.
     */
    protected int getBitsPerSample(final int offset) {
        return bitsPerSample[offset];
    }

    /**
     * Interprets a pixel and adds it to the image builder.
     *
     * @param imageBuilder the image builder.
     * @param samples the pixel sample values.
     * @param x the x coordinate.
     * @param y the y coordinate.
     * @throws ImagingException if the image format is invalid.
     * @throws IOException if an I/O error occurs.
     */
    public abstract void interpretPixel(ImageBuilder imageBuilder, int[] samples, int x, int y) throws ImagingException, IOException;
}
