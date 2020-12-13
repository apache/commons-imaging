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
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter;

/**
 * Implements a custom photometric interpreter that can be supplied by
 * applications in order to render Java images from real-valued TIFF data
 * products. Most TIFF files include a specification for a "photometric
 * interpreter" that implements logic for transforming the raw data in a TIFF
 * file to a rendered image. But the TIFF standard does not include a
 * specification for a photometric interpreter that can be used for rendering
 * floating-point data. TIFF files are sometimes used to specify non-image data
 * as a floating-point raster. This approach is particularly common in GeoTIFF
 * files (TIFF files that contain tags for supporting geospatial reference
 * metadata for Geographic Information Systems). Because of the limits of the
 * stock photometric interpreters, most floating-point TIFF files to not produce
 * useful images.
 * <p>
 * This class allows an Apache Commons implementation to construct and specify a
 * custom photometric interpreter when reading from a TIFF file. Applications
 * may supply their own palette that maps real-valued data to specified colors.
 * <p>
 * This class provides two constructors:
 * <ol>
 * <li>A simple constructor to support gray scales</li>
 * <li>A constructor to support a color palette (with potential
 * interpolation)</li>
 * </ol>
 * <p>
 * To use this class, an application must access the TIFF file using the
 * low-level, TIFF-specific API provided by the Apache Commons Imaging library.
 *
 */
public class PhotometricInterpreterFloat extends PhotometricInterpreter {

    final ArrayList<PaletteEntry> rangePaletteEntries = new ArrayList<>();
    final ArrayList<PaletteEntry> singleValuePaletteEntries = new ArrayList<>();

    float minFound = Float.POSITIVE_INFINITY;
    float maxFound = Float.NEGATIVE_INFINITY;
    int xMin;
    int yMin;
    int xMax;
    int yMax;

    double sumFound;
    int nFound;

    /**
     * Constructs a photometric interpreter that will produce a gray scale
     * linearly distributed across the RGB color space for values in the range
     * valueBlack to valueWhite. Note that the two values may be given in either
     * ascending order or descending order, but they must not be equal. Infinite
     * values will not result in proper numerical computations.
     *
     * @param valueBlack the value associated with the dark side of the gray
     * scale
     * @param valueWhite the value associated with the light side of the gray
     * scale
     */
    public PhotometricInterpreterFloat(
        final float valueBlack, final float valueWhite) {
        // The abstract base class requires that the following fields
        // be set in the constructor:
        //     samplesPerPixel (int)
        //     bits per sample (array of type int[samplesPerPixel])
        //     predictor (int, not used by this class)
        //     width (int)
        //     height (int)
        super(
            1,
            new int[]{32}, // bits per sample
            0, // not used by this class
            32, // pro forma width value
            32 // pro format height value
        );


        if (valueWhite > valueBlack) {
            final PaletteEntryForRange entry
                = new PaletteEntryForRange(valueBlack, valueWhite, Color.black, Color.white);
            rangePaletteEntries.add(entry);
        } else {
            final PaletteEntryForRange entry
                = new PaletteEntryForRange(valueWhite, valueBlack, Color.white, Color.black);
            rangePaletteEntries.add(entry);
        }
    }

    /**
     * Constructs a photometric interpreter that will use the specified palette
     * to assign colors to floating-point values.
     * <p>
     * Although there is no prohibition against using palette entries with overlapping ranges,
     * the behavior of such specifications is undefined and subject to change in the future.
     * Therefore, it is not recommended.  The exception in in the use of single-value
     * palette entries which may be used to override the specifications for ranges.
     *
     * @param paletteEntries a valid, non-empty list of palette entries
     */
    public PhotometricInterpreterFloat(final List<PaletteEntry> paletteEntries) {
        // The abstract base class requires that the following fields
        // be set in the constructor:
        //     samplesPerPixel (int)
        //     bits per sample (array of type int[samplesPerPixel])
        //     predictor (int, not used by this class)
        //     width (int)
        //     height (int)
        super(
            1,
            new int[]{32}, // bits per sample
            0, // not used by this class
            32, // pro forma width value
            32 // pro format height value
        );

        if (paletteEntries == null || paletteEntries.isEmpty()) {
            throw new IllegalArgumentException(
                "Palette entries list must be non-null and non-empty");
        }

        for (final PaletteEntry entry : paletteEntries) {
            if (entry.coversSingleEntry()) {
                singleValuePaletteEntries.add(entry);
            } else {
                rangePaletteEntries.add(entry);
            }
        }

        final Comparator<PaletteEntry> comparator = (o1, o2) -> {
            if (o1.getLowerBound() == o2.getLowerBound()) {
                return Double.compare(o1.getUpperBound(), o2.getUpperBound());
            }
            return Double.compare(o1.getLowerBound(), o2.getLowerBound());
        };

        Collections.sort(rangePaletteEntries, comparator);
        Collections.sort(singleValuePaletteEntries, comparator);
    }

    @Override
    public void interpretPixel(
        final ImageBuilder imageBuilder,
        final int[] samples, final int x, final int y)
        throws ImageReadException, IOException {

        final float f = Float.intBitsToFloat(samples[0]);
        // in the event of NaN, do not store entry in the image builder.

        // only the single bound palette entries support NaN
        for (final PaletteEntry entry : singleValuePaletteEntries) {
            if (entry.isCovered(f)) {
                final int p = entry.getARGB(f);
                imageBuilder.setRGB(x, y, p);
                return;
            }
        }

        if (Float.isNaN(f)) {
            // if logic reaches here, there is no definition
            // for a NaN.
            return;
        }
        if (f < minFound) {
            minFound = f;
            xMin = x;
            yMin = y;
        }
        if (f > maxFound) {
            maxFound = f;
            xMax = x;
            yMax = y;
        }
        nFound++;
        sumFound += f;

        for (final PaletteEntry entry : singleValuePaletteEntries) {
            if (entry.isCovered(f)) {
                final int p = entry.getARGB(f);
                imageBuilder.setRGB(x, y, p);
                return;
            }
        }

        for (final PaletteEntry entry : rangePaletteEntries) {
            if (entry.isCovered(f)) {
                final int p = entry.getARGB(f);
                imageBuilder.setRGB(x, y, p);
                break;
            }
        }
    }

    /**
     * Gets the minimum value found while rendering the image
     *
     * @return if data was processed, a valid value; otherwise, Positive
     * Infinity
     */
    public float getMinFound() {
        return minFound;
    }

    /**
     * Gets the coordinates (x,y) at which the maximum value was identified
     * during processing
     *
     * @return a valid array of length 2.
     */
    public int[] getMaxXY() {
        return new int[]{xMax, yMax};
    }

    /**
     * Gets the maximum value found while rendering the image
     *
     * @return if data was processed, a valid value; otherwise, Negative
     * Infinity
     */
    public float getMaxFound() {
        return maxFound;
    }

    /**
     * Gets the coordinates (x,y) at which the minimum value was identified
     * during processing
     *
     * @return a valid array of length 2.
     */
    public int[] getMinXY() {
        return new int[]{xMin, yMin};
    }

    /**
     * Get the mean of the values found while processing
     *
     * @return if data was processed, a valid mean value; otherwise, a zero.
     */
    public float getMeanFound() {
        if (nFound == 0) {
            return 0;
        }
        return (float) (sumFound / nFound);
    }

    /**
     * Provides a method for mapping a pixel value to an integer (ARGB) value.
     * This method is not defined for the standard photometric interpreters and
     * is provided as a convenience to applications that are processing data
     * outside the standard TIFF image-reading modules.
     *
     * @param f the floating point value to be mapped to an ARGB value
     * @return a valid ARGB value, or zero if no palette specification covers
     * the input value.
     */
    public int mapValueToARGB(final float f) {

        // The single-value palette entries can accept a Float.NaN as
        // a target while the range-of-values entries cannot.  So
        // check the single-values before testing for Float.isNaN()
        // because NaN may have special treatment.
        for (final PaletteEntry entry : singleValuePaletteEntries) {
            if (entry.isCovered(f)) {
                return entry.getARGB(f);
            }
        }

        if (Float.isNaN(f)) {
            // if logic reaches here, there is no definition
            // for a NaN.
            return 0;
        }

        for (final PaletteEntry entry : rangePaletteEntries) {
            if (entry.isCovered(f)) {
                return entry.getARGB(f);
            }
        }
        return 0;
    }

}
