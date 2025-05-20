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
package org.apache.commons.imaging.examples.tiff;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.commons.imaging.FormatCompliance;
import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.bytesource.ByteSource;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.formats.tiff.AbstractTiffRasterData;
import org.apache.commons.imaging.formats.tiff.TiffContents;
import org.apache.commons.imaging.formats.tiff.TiffDirectory;
import org.apache.commons.imaging.formats.tiff.TiffImagingParameters;
import org.apache.commons.imaging.formats.tiff.TiffRasterStatistics;
import org.apache.commons.imaging.formats.tiff.TiffReader;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntryForRange;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntryForValue;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PhotometricInterpreterFloat;
import org.apache.commons.lang3.StringUtils;

/**
 * A simple example application that reads the content of a TIFF file containing floating-point data and extracts its content. TIFF files are * sometimes used
 * to store non-image information for scientific and geophysical data products, including terrestrial elevation and ocean depth data.
 */
public class ExampleReadFloatingPointData {

    private static final String[] USAGE = { "Usage ReadFloatingPointData <input file> [output file]", "   input file:  Mandatory file to be read",
            "   output file: Optional output path for file to be written.", "                This name should not include a file extension.",
            "                Output data will be written using the JPEG format." };

    /**
     * Reads the content of a TIFF file containing floating-point data and obtains some simple statistics
     *
     * @param args the command line arguments giving the path to an input TIFF file
     * @throws org.apache.commons.imaging.ImagingException in the event of an internal data format or version compatibility error reading the image.
     * @throws IOException                                 in the event of an I/O error.
     */
    public static void main(final String[] args) throws ImagingException, IOException {
        if (args.length == 0) {
            // Print usage and exit
            for (final String s : USAGE) {
                System.err.println(s);
            }
            System.exit(0);
        }

        final File target = new File(args[0]);
        String outputPath = null;
        if (args.length >= 2) {
            outputPath = args[1];
        }
        final boolean optionalImageWritingEnabled = StringUtils.isNotEmpty(outputPath);

        final ByteSource byteSource = ByteSource.file(target);

        // Establish a TiffReader. This is just a simple constructor that
        // does not actually access the file until one of its methods such as
        // readDirectories is called.
        final TiffReader tiffReader = new TiffReader(true);

        // Read the directories in the TIFF file. Directories are the
        // main data element of a TIFF file. They usually include an image
        // element, but sometimes just carry metadata. This example
        // reads all the directories in the file. Typically reading
        // the directories is not a time-consuming operation.
        final TiffContents contents = tiffReader.readDirectories(byteSource, true, // indicates that application should read image data, if present
                FormatCompliance.getDefault());

        // Read the first directory in the file. A practical implementation
        // could use any of the directories in the file. This demo uses the
        // first one just for simplicity.
        final TiffDirectory directory = contents.directories.get(0);
        // Render the first directory in the file
        if (!directory.hasTiffFloatingPointRasterData()) {
            System.err.println("Specified directory does not contain floating-point data");
            System.exit(-1);
        }

        // Construct a TiffImageParser instance and use it to read the data.
        // If only a sub-image is desired, the params Mao can be used
        // to specify what section of the data is to be extracted.
        // See the Javadoc for readFloatingPointRasterData for more details.
        final long time0Nanos = System.nanoTime();
        final TiffImagingParameters params = new TiffImagingParameters();
        final AbstractTiffRasterData rasterData = directory.getRasterData(params);
        final long time1Nanos = System.nanoTime();
        System.out.println("Data read in " + (time1Nanos - time0Nanos) / 1.0e+6 + " ms");

        // One of the test files in the Commons Imaging distribution uses
        // the value 9999 as a special "No Data" indicator. In that case,
        // we do not want to include 9999 in the simple-statistics survey.
        final float excludedValue = Float.NaN;
        final TiffRasterStatistics simpleStats;
        if ("Sample64BitFloatingPointPix451x337.tiff".equals(target.getName())) {
            simpleStats = rasterData.getSimpleStatistics(9999);
        } else {
            // just gather the standard statistics
            simpleStats = rasterData.getSimpleStatistics();
        }

        final int w = rasterData.getWidth();
        final int h = rasterData.getHeight();
        final float minValue = simpleStats.getMinValue();
        final float maxValue = simpleStats.getMaxValue();

        System.out.format("Image size %dx%d%n", w, h);
        System.out.format("Range of values in TIFF: %f %f%n", minValue, maxValue);
        System.out.format("Number of data values found %d%n", simpleStats.getCountOfSamples());

        if (optionalImageWritingEnabled) {
            // The easiest way to get an image is by using the
            // TiffDirectory class' getTiffImage() methods and passing in
            // an optional photometric interpreter as shown in the
            // ReadAndRenderFloatingPoint.java example, But in this case,
            // we'll take the approach of building an image from the
            // raster data that was obtained above.
            final File output = new File(outputPath);
            System.out.println("Writing image to " + output.getPath());
            // create a new photometric interpreter based on the range
            // of values found above.
            final List<PaletteEntry> paletteList = new ArrayList<>();
            if (!Float.isNaN(excludedValue)) {
                // draw the excluded value in red.
                paletteList.add(new PaletteEntryForValue(excludedValue, Color.red));
            }
            paletteList.add(new PaletteEntryForRange(minValue, maxValue, Color.black, Color.white));
            // palette entries are defined for ranges minValue <= value < maxValue.
            // Thus raster cells containing the maximum value would not be
            // color-coded unless we add an additional palette entry to
            // handle the single-value for the maximum.
            paletteList.add(new PaletteEntryForValue(maxValue, Color.white));
            final PhotometricInterpreterFloat photometricInterpreter = new PhotometricInterpreterFloat(paletteList);

            // Now construct an ImageBuilder to store the results
            final ImageBuilder builder = new ImageBuilder(w, h, false);
            for (int y = 0; y < h; y++) {
                for (int x = 0; x < w; x++) {
                    final float f = rasterData.getValue(x, y);
                    final int argb = photometricInterpreter.mapValueToArgb(f);
                    builder.setRgb(x, y, argb);
                }
            }

            final BufferedImage bImage = builder.getBufferedImage();
            ImageIO.write(bImage, "JPEG", output);
        }
    }
}
