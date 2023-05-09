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
package org.apache.commons.imaging.formats.tiff.photometricinterpreters;

import java.io.IOException;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.ImageBuilder;

/**
 * Interpreter for photometric information in TIFF images. The photometric
 * interpretation tag is a requirement for valid TIFF images, and defines the
 * color space of the image data.
 *
 * @see <a href=
 *      "https://www.awaresystems.be/imaging/tiff/tifftags/photometricinterpretation.html">
 *      Baseline TIFF Tag PhotometricInterpretation </a>
 */
public abstract class PhotometricInterpreter {
    protected final int samplesPerPixel;
    private final int[] bitsPerSample;
    protected final int predictor;
    protected final int width;
    protected final int height;

    public PhotometricInterpreter(final int samplesPerPixel, final int[] bitsPerSample,
            final int predictor, final int width, final int height) {
        this.samplesPerPixel = samplesPerPixel;
        this.bitsPerSample = bitsPerSample;
        this.predictor = predictor;
        this.width = width;
        this.height = height;
    }

    protected int getBitsPerSample(final int offset) {
        return bitsPerSample[offset];
    }

    public abstract void interpretPixel(ImageBuilder imageBuilder,
            int[] samples, int x, int y) throws ImageReadException, IOException;
}
