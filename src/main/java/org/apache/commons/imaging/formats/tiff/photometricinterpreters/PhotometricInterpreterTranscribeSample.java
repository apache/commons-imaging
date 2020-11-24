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
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;

/**
 * Provides an implementation of a custom photometric interpreter that
 * does not transform the content of a TIFF image to the RGB format
 * but simply transcribes the first sample at each pixel location to an integer.
 * <p>
 * This class is meant to support applications that use TIFF files to store
 * integer data rather than imagery. This approach is widely used in
 * GeoTIFF image formats to store geophysical data.
 * <p>
 * Note that this implementation only processes the first sample for a pixel.
 * Developers requiring access to additional samples may use this class as
 * an example.  However, the ImageBuilder class currently has the limitation
 * that it cannot store more than one 32 bit integer per pixel or
 * raster cell.
 * <p>
 * The data stored by this class is treated as a signed integer value.
 */
public class PhotometricInterpreterTranscribeSample extends PhotometricInterpreter {

    private final int signBit;

    /**
     * A simple constructor for a one-sample transcription specification.
     * @param bitsPerSample the number of bits in the sample
     */
    public PhotometricInterpreterTranscribeSample(int bitsPerSample) {
        super(1, new int[]{bitsPerSample},
            TiffTagConstants.PREDICTOR_VALUE_NONE,
            1, 1);
        checkSignBit(bitsPerSample);
        signBit = (1 << (bitsPerSample - 1));
    }

    /**
     * A constructor in the form currently used internally by the Imaging API.
     * Many of these arguments are legacy elements that perform no function.
     * @param samplesPerPixel the number of samples per pixel
     * @param bitsPerSample an array of dimension samplesPerPixel giving the
     * size of each sample in bits.
     * @param predictor a flag indicating the predictor for the data (not
     * currently used)
     * @param width the width of the raster (not currently used)
     * @param height the height of the raster (not currently used)
     */
    public PhotometricInterpreterTranscribeSample(
        final int samplesPerPixel,
        final int[] bitsPerSample,
        final int predictor,
        final int width,
        final int height) {
        super(samplesPerPixel, bitsPerSample, predictor, width, height);
        checkSignBit(bitsPerSample[0]);
        signBit = (1 << (bitsPerSample[0] - 1));
        if(samplesPerPixel!=1){
            throw new IllegalArgumentException(
                "Unsupported samples-per-pixel value, "
                +samplesPerPixel
                +", required value is 1");
        }
    }

    private void checkSignBit(int bitsInSample) {
        if (bitsInSample < 1 || bitsInSample > 32) {
            throw new IllegalArgumentException(
                "The number of bits in sample is out of supported range: "
                + "received " + bitsInSample + ", expected [1,32]");
        }
    }


    @Override
    public void interpretPixel(final ImageBuilder imageBuilder,
        final int[] samples,
        final int x,
        final int y) throws ImageReadException, IOException {
        int test = samples[0];

        // This module is going to store this value as a 32 bit integer.
        // If the bits per sample is less than 32, then it needs to
        // to ensure that all higher-order bits are populated with
        // the value of the sign bit
        test |= (test&signBit)*0xffffffff;
        imageBuilder.setRGB(x, y, test);
    }

    @Override
    public boolean isByteSampleFormatRequired() {
        // this return status will prevent the TIFF reader classes from
        // reducing larger samples down to a single byte. See the notes
        // in the PhotometricInterpreter base class for more detail.
        return false;
    }
}
