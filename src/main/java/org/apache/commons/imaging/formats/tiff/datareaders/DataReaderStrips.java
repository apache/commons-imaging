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
package org.apache.commons.imaging.formats.tiff.datareaders;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteOrder;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.formats.tiff.TiffDirectory;
import org.apache.commons.imaging.formats.tiff.TiffImageData;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterRgb;

public final class DataReaderStrips extends ImageDataReader {

    private final int bitsPerPixel;
    private final int compression;
    private final int rowsPerStrip;
    private final ByteOrder byteOrder;
    private int x;
    private int y;
    private final TiffImageData.Strips imageData;

    public DataReaderStrips(final TiffDirectory directory,
            final PhotometricInterpreter photometricInterpreter, final int bitsPerPixel,
            final int[] bitsPerSample, final int predictor, final int samplesPerPixel, final int width,
            final int height, final int compression, final ByteOrder byteOrder, final int rowsPerStrip,
            final TiffImageData.Strips imageData) {
        super(directory, photometricInterpreter, bitsPerSample, predictor,
                samplesPerPixel, width, height);

        this.bitsPerPixel = bitsPerPixel;
        this.compression = compression;
        this.rowsPerStrip = rowsPerStrip;
        this.imageData = imageData;
        this.byteOrder = byteOrder;
    }

    private void interpretStrip(
            final ImageBuilder imageBuilder,
            final byte[] bytes,
            final int pixelsPerStrip,
            final int yLimit) throws ImageReadException, IOException {
        if (y >= yLimit) {
            return;
        }

        // changes added May 2012
        // In the original implementation, a general-case bit reader called
        // getSamplesAsBytes is used to retrieve the samples (raw data values)
        // for each pixel in the strip. These samples are then passed into a
        // photogrammetric interpreter that converts them to ARGB pixel values
        // and stores them in the image. Because the bit-reader must handle
        // a large number of formats, it involves several conditional
        // branches that must be executed each time a pixel is read.
        // Depending on the size of an image, the same evaluations must be
        // executed redundantly thousands and perhaps millions of times
        // in order to process the complete collection of pixels.
        // This code attempts to remove that redundancy by
        // evaluating the format up-front and bypassing the general-format
        // code for two commonly used data formats: the 8 bits-per-pixel
        // and 24 bits-per-pixel cases. For these formats, the
        // special case code achieves substantial reductions in image-loading
        // time. In other cases, it simply falls through to the original code
        // and continues to read the data correctly as it did in previous
        // versions of this class.
        // In addition to bypassing the getBytesForSample() method,
        // the 24-bit case also implements a special block for RGB
        // formatted images. To get a sense of the contributions of each
        // optimization (removing getSamplesAsBytes and removing the
        // photometric interpreter), consider the following results from tests
        // conducted with large TIFF images using the 24-bit RGB format
        // bypass getSamplesAsBytes: 67.5 % reduction
        // bypass both optimizations: 77.2 % reduction
        //
        //
        // Future Changes
        // Both of the 8-bit and 24-bit blocks make the assumption that a strip
        // always begins on x = 0 and that each strip exactly fills out the rows
        // it contains (no half rows). The original code did not make this
        // assumption, but the approach is consistent with the TIFF 6.0 spec
        // (1992),
        // and should probably be considered as an enhancement to the
        // original general-case code block that remains from the original
        // implementation. Taking this approach saves one conditional
        // operation per pixel or about 5 percent of the total run time
        // in the 8 bits/pixel case.

        // verify that all samples are one byte in size
        final boolean allSamplesAreOneByte = isHomogenous(8);

        if (predictor != 2 && bitsPerPixel == 8 && allSamplesAreOneByte) {
            int k = 0;
            int nRows = pixelsPerStrip / width;
            if (y + nRows > yLimit) {
                nRows = yLimit - y;
            }
            final int i0 = y;
            final int i1 = y + nRows;
            x = 0;
            y += nRows;
            final int[] samples = new int[1];
            for (int i = i0; i < i1; i++) {
                for (int j = 0; j < width; j++) {
                    samples[0] = bytes[k++] & 0xff;
                    photometricInterpreter.interpretPixel(imageBuilder,
                            samples, j, i);
                }
            }
            return;
        } else if (predictor != 2 && bitsPerPixel == 24 && allSamplesAreOneByte) {
            int k = 0;
            int nRows = pixelsPerStrip / width;
            if (y + nRows > yLimit) {
                nRows = yLimit - y;
            }
            final int i0 = y;
            final int i1 = y + nRows;
            x = 0;
            y += nRows;
            if (photometricInterpreter instanceof PhotometricInterpreterRgb) {
                for (int i = i0; i < i1; i++) {
                    for (int j = 0; j < width; j++, k += 3) {
                        final int rgb = 0xff000000
                                | (((bytes[k] << 8) | (bytes[k + 1] & 0xff)) << 8)
                                | (bytes[k + 2] & 0xff);
                        imageBuilder.setRGB(j, i, rgb);
                    }
                }
            } else {
                final int[] samples = new int[3];
                for (int i = i0; i < i1; i++) {
                    for (int j = 0; j < width; j++) {
                        samples[0] = bytes[k++] & 0xff;
                        samples[1] = bytes[k++] & 0xff;
                        samples[2] = bytes[k++] & 0xff;
                        photometricInterpreter.interpretPixel(imageBuilder,
                                samples, j, i);
                    }
                }
            }

            return;
        }

        // ------------------------------------------------------------
        // original code before May 2012 modification
        // this logic will handle all cases not conforming to the
        // special case handled above

        try (final BitInputStream bis = new BitInputStream(new ByteArrayInputStream(bytes), byteOrder)) {

            int[] samples = new int[bitsPerSampleLength];
            resetPredictor();
            for (int i = 0; i < pixelsPerStrip; i++) {
                getSamplesAsBytes(bis, samples);

                if (x < width) {
                    samples = applyPredictor(samples);

                    photometricInterpreter.interpretPixel(imageBuilder, samples, x, y);
                }

                x++;
                if (x >= width) {
                    x = 0;
                    resetPredictor();
                    y++;
                    bis.flushCache();
                    if (y >= yLimit) {
                        break;
                    }
                }
            }
        }
    }

    @Override
    public void readImageData(final ImageBuilder imageBuilder)
            throws ImageReadException, IOException {
        for (int strip = 0; strip < imageData.getImageDataLength(); strip++) {
            final long rowsPerStripLong = 0xFFFFffffL & rowsPerStrip;
            final long rowsRemaining = height - (strip * rowsPerStripLong);
            final long rowsInThisStrip = Math.min(rowsRemaining, rowsPerStripLong);
            final long bytesPerRow = (bitsPerPixel * width + 7) / 8;
            final long bytesPerStrip = rowsInThisStrip * bytesPerRow;
            final long pixelsPerStrip = rowsInThisStrip * width;

            final byte[] compressed = imageData.getImageData(strip).getData();

            final byte[] decompressed = decompress(compressed, compression,
                    (int) bytesPerStrip, width, (int) rowsInThisStrip);

            interpretStrip(
                    imageBuilder,
                    decompressed,
                    (int) pixelsPerStrip,
                    height);

        }
    }


    @Override
    public BufferedImage readImageData(final Rectangle subImage)
            throws ImageReadException, IOException
    {
        // the legacy code is optimized to the reading of whole
        // strips (except for the last strip in the image, which can
        // be a partial).  So create a working image with compatible
        // dimensions and read that.  Later on, the working image
        // will be sub-imaged to the proper size.

        // strip0 and strip1 give the indices of the strips containing
        // the first and last rows of pixels in the subimage
        final int strip0 = subImage.y / rowsPerStrip;
        final int strip1 = (subImage.y + subImage.height - 1) / rowsPerStrip;
        final int workingHeight = (strip1 - strip0 + 1) * rowsPerStrip;


        // the legacy code uses a member element "y" to keep track
        // of the row index of the output image that is being processed
        // by interpretStrip. y is set to zero before the first
        // call to interpretStrip.  y0 will be the index of the first row
        // in the full image (the source image) that will be processed.

        final int y0 = strip0 * rowsPerStrip;
        final int yLimit = subImage.y - y0 + subImage.height;


        // TO DO: we can probably save some processing by using yLimit instead
        //        or working
        final ImageBuilder workingBuilder =
                new ImageBuilder(width, workingHeight, false);

        for (int strip = strip0; strip <= strip1; strip++) {
            final long rowsPerStripLong = 0xFFFFffffL & rowsPerStrip;
            final long rowsRemaining = height - (strip * rowsPerStripLong);
            final long rowsInThisStrip = Math.min(rowsRemaining, rowsPerStripLong);
            final long bytesPerRow = (bitsPerPixel * width + 7) / 8;
            final long bytesPerStrip = rowsInThisStrip * bytesPerRow;
            final long pixelsPerStrip = rowsInThisStrip * width;

            final byte[] compressed = imageData.getImageData(strip).getData();

            final byte[] decompressed = decompress(compressed, compression,
                    (int) bytesPerStrip, width, (int) rowsInThisStrip);

            interpretStrip(
                    workingBuilder,
                    decompressed,
                    (int) pixelsPerStrip,
                    yLimit);
        }


        if (subImage.x == 0
                && subImage.y == y0
                && subImage.width == width
                && subImage.height == workingHeight) {
            // the subimage exactly matches the ImageBuilder bounds
            return workingBuilder.getBufferedImage();
        }
        return workingBuilder.getSubimage(
                subImage.x,
                subImage.y - y0,
                subImage.width,
                subImage.height);
    }

}
