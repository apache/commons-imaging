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

package org.apache.commons.imaging.formats.tiff.photometricinterpreters.fp;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.formats.tiff.TiffDirectory;
import org.apache.commons.imaging.formats.tiff.TiffField;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
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
 * <li>A constructor to support a color palette (with potential interpolation)</li>
 * </ol>
 * <p>
 * To use this class, an application must access the TIFF file using the
 * low-level, TIFF-specific API provided by the Apache Commons Imaging library.
 *
 */
public class PhotometricInterpreterFloat extends PhotometricInterpreter {

    ArrayList<IPaletteEntry> rangePaletteEntries = new ArrayList<>();
    ArrayList<IPaletteEntry> singleValuePaletteEntries = new ArrayList<>();

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
     * ascending order or descending order, but they must not be equal.
     * Infinite values will not result in proper numerical computations.
     *
     * @param directory a valid directory
     * @param valueBlack the value associated with the dark side of the gray
     * scale
     * @param valueWhite the value associated with the light side of the gray
     * scale
     * @throws ImageReadException in the event of an improper specification or
     * an incompatible TIFF directory
     */
    public PhotometricInterpreterFloat(
        TiffDirectory directory,
        float valueBlack,
        float valueWhite) throws ImageReadException {
        // The abstract base class requires that the following fields
        // be set in the constructor:
        //     samplesPerPixel (int)
        //     bits per sample (array of type int[samplesPerPixel])
        //     predictor (int, not used by this class)
        //     width (int)
        //     height (int)
        // All the access methods that get data from the directory will throw
        // an ImageReadException if they cannot extract TIFF tags, so
        // there is no need for null-checls
        super(
            directory.getFieldValue(TiffTagConstants.TIFF_TAG_SAMPLES_PER_PIXEL),
            directory.findField(
                TiffTagConstants.TIFF_TAG_BITS_PER_SAMPLE, true).getIntArrayValue(),
            0, // not used by this class
            directory.getSingleFieldValue(TiffTagConstants.TIFF_TAG_IMAGE_WIDTH),
            directory.getSingleFieldValue(TiffTagConstants.TIFF_TAG_IMAGE_LENGTH)
        );

        if (!directory.hasTiffImageData()) {
            throw new ImageReadException(
                "The specified TIFF directory does not store an image");
        }

        if (valueWhite > valueBlack) {
            PaletteEntryForRange entry
                = new PaletteEntryForRange(valueBlack, valueWhite, Color.black, Color.white);
            rangePaletteEntries.add(entry);
        } else {
            PaletteEntryForRange entry
                = new PaletteEntryForRange(valueWhite, valueBlack, Color.white, Color.black);
            rangePaletteEntries.add(entry);
        }

        TiffField dataFormatField = directory.findField(
            TiffTagConstants.TIFF_TAG_SAMPLE_FORMAT, true);
        int[] dataFormat = dataFormatField.getIntArrayValue();
        if (dataFormat.length == 0
            || dataFormat[0] != TiffTagConstants.SAMPLE_FORMAT_VALUE_IEEE_FLOATING_POINT) {
            throw new ImageReadException("TIFF directory does not specify a floating-point format");
        }
    }

    /**
     * Constructs a photometric interpreter that will produce a gray scale
     * linearly distributed across the RGB color space for values in the range
     * valueBlack to valueWhite. Note that the two values may be given in either
     * ascending order or descending order, but they must not be equal.
     *
     * @param directory a valid directory
     * @param paletteEntries a valid, non-empty list of palette entries
     * @throws ImageReadException in the event of an improper specification or
     * an incompatible TIFF directory
     */

    public PhotometricInterpreterFloat(
        TiffDirectory directory,
        List<IPaletteEntry> paletteEntries) throws ImageReadException {
        // The abstract base class requires that the following fields
        // be set in the constructor:
        //     samplesPerPixel (int)
        //     bits per sample (array of type int[samplesPerPixel])
        //     predictor (int, not used by this class)
        //     width (int)
        //     height (int)
        // All the access methods that get data from the directory will throw
        // an ImageReadException if they cannot extract TIFF tags, so
        // there is no need for null-checls
        super(
            directory.getFieldValue(TiffTagConstants.TIFF_TAG_SAMPLES_PER_PIXEL),
            directory.findField(
                TiffTagConstants.TIFF_TAG_BITS_PER_SAMPLE, true).getIntArrayValue(),
            0, // not used by this class
            directory.getSingleFieldValue(TiffTagConstants.TIFF_TAG_IMAGE_WIDTH),
            directory.getSingleFieldValue(TiffTagConstants.TIFF_TAG_IMAGE_LENGTH)
        );

        if (!directory.hasTiffImageData()) {
            throw new ImageReadException(
                "The specified TIFF directory does not store an image");
        }

        if (paletteEntries == null || paletteEntries.isEmpty()) {
            throw new IllegalArgumentException(
                "Palette entries list must be non-null and non-empty");
        }

        for (IPaletteEntry entry : paletteEntries) {
            if (entry.coversSingleEntry()) {
                singleValuePaletteEntries.add(entry);
            } else {
                rangePaletteEntries.add(entry);
            }
        }

        Comparator<IPaletteEntry> comparator = new Comparator<IPaletteEntry>() {
            @Override
            public int compare(IPaletteEntry o1, IPaletteEntry o2) {
                if (o1.getLowerBound() == o2.getLowerBound()) {
                    return Double.compare(o1.getUpperBound(), o2.getUpperBound());
                }
                return Double.compare(o1.getLowerBound(), o2.getLowerBound());
            }
        };

        Collections.sort(rangePaletteEntries, comparator);
        Collections.sort(singleValuePaletteEntries, comparator);

        TiffField dataFormatField = directory.findField(
            TiffTagConstants.TIFF_TAG_SAMPLE_FORMAT, true);
        int[] dataFormat = dataFormatField.getIntArrayValue();
        if (dataFormat.length == 0
            || dataFormat[0] != TiffTagConstants.SAMPLE_FORMAT_VALUE_IEEE_FLOATING_POINT) {
            throw new ImageReadException(
                "TIFF directory does not specify a floating-point format");
        }
    }

    @Override
    public void interpretPixel(
        ImageBuilder imageBuilder,
        int[] samples, int x, int y)
        throws ImageReadException, IOException {

        Float f = Float.intBitsToFloat(samples[0]);
        // in the event of NaN, do not stored entry in the image builder.
        if (Float.isNaN(f)) {
            // only the single bound palette entries support NaN
            for (IPaletteEntry entry : singleValuePaletteEntries) {
                if (entry.coversSingleEntry()) {
                    int p = entry.getARGB(f);
                    imageBuilder.setRGB(x, y, p);
                    return;
                }
            }
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
        
        for (IPaletteEntry entry : singleValuePaletteEntries) {
            if (entry.isCovered(f)) {
                int p = entry.getARGB(f);
                imageBuilder.setRGB(x, y, p);
                return;
            }
        }
        
        for (IPaletteEntry entry : rangePaletteEntries) {
            if (entry.isCovered(f)) {
                int p = entry.getARGB(f);
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
        return new int[]{xMin, yMin};
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

}
