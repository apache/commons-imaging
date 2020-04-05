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
package org.apache.commons.imaging.examples.tiff;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.ByteOrder;
import java.util.HashMap;
import javax.imageio.ImageIO;
import org.apache.commons.imaging.FormatCompliance;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.formats.tiff.TiffContents;
import org.apache.commons.imaging.formats.tiff.TiffDirectory;
import org.apache.commons.imaging.formats.tiff.TiffReader;
import org.apache.commons.imaging.formats.tiff.constants.TiffConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.fp.PhotometricInterpreterFloat;

/**
 * A simple example application that reads the content of a TIFF file containing
 * floating-point data and renders it using a gray-scale palette. TIFF files are
 * sometimes used to store non-image information for scientific and geophysical
 * data products, including terrestrial elevation and ocean depth data.
 *
 */
public class ReadAndRenderFloatingPoint {

    private static final String[] USAGE = {
        "Usage ReadAndRendserFloatingPoint <input file>  [output file]",
        "   input file:  Mandatory file to be read",
        "   output file: Optional output path for file to be written.",
        "                This name should not include a file extension.",
        "                Output data will be written using the JPEG format."
    };

    /**
     * Reads the content of a TIFF file containing floating-point data and
     * renders it using a gray-scale palette.
     *
     * @param args the command line arguments giving the path to an input TIFF
     * file and an output JPEG.
     * @throws org.apache.commons.imaging.ImageReadException in the event of an
     * internal data format or version compatibility error reading the image.
     * @throws java.io.IOException in the event of an I/O error.
     */
    public static void main(String[] args) throws ImageReadException, IOException {
        if (args.length == 0) {
            // Print usage and exit
            for (String s : USAGE) {
                System.err.println(s);
            }
            System.exit(0);
        }

        File target = new File(args[0]);
        String outputPath = null;
        if (args.length == 2) {
            outputPath = args[1];
        }
        boolean optionalImageWritingEnabled
            = outputPath != null && !outputPath.isEmpty();

        ByteSourceFile byteSource = new ByteSourceFile(target);

        // Establish a TiffReader. This is just a simple constructor that
        // does not actually access the file.  So the application cannot
        // obtain the byteOrder, or other details, until the contents has
        // been read.  Then read the directories associated with the
        // file by passing in the byte source and options.
        TiffReader tiffReader = new TiffReader(true);

        // Read the directories in the TIFF file.  Directories are the
        // main data element of a TIFF file. They usually include an image
        // element, but sometimes just carry metadata. This example
        // reads all the directories in the file, but if we were interested
        // in just the first element, Commons Imaging provides alternate API's
        // that would be more efficient.
        TiffContents contents = tiffReader.readDirectories(
            byteSource,
            true, // indicates that application should read image data, if present
            FormatCompliance.getDefault());
        ByteOrder byteOrder = tiffReader.getByteOrder();

        // Render the first directory in the file.  A practical implementation
        // could use any of the directories in the file. This demo uses the
        // first one just for simplicity.
        TiffDirectory directory = contents.directories.get(0);
        // Render the first directory in the file
        if (!directory.hasTiffImageData()) {
            System.err.println("First directory in file does not have image");
            System.exit(-1);
        }

        // Obtain metadata about what kind of data is in the product.
        // Because this demo is designed for floating-point data, 
        // it will expect the sample format to include only one element
        // of type floating point.   Beyond that, the TIFF specification 
        // allows a large number of variations in format (16, 24, or 32 byte
        // floats; tiles versus strips; etc.).  Unfortunately the test data
        // for the less common variations was not available when Commons Imaging
        // was implemented and so the API will not be able to handle all
        // of them.  This test will simply allow the API to throw an exception
        // if an unsupported format is encountered.
        //    The getFieldValue call allows an application to provide a
        // boolean indicating that the field must be present for processing 
        // to continue. If it does not, an exception is thrown.
        short[] sampleFormat = directory.getFieldValue(TiffTagConstants.TIFF_TAG_SAMPLE_FORMAT, true);
        short samplesPerPixel = directory.getFieldValue(TiffTagConstants.TIFF_TAG_SAMPLES_PER_PIXEL);
        short[] bitsPerPixel = directory.getFieldValue(TiffTagConstants.TIFF_TAG_BITS_PER_SAMPLE, true);
        if (sampleFormat[0] != TiffTagConstants.SAMPLE_FORMAT_VALUE_IEEE_FLOATING_POINT) {
            System.err.println("This example requires a data source with a floating-point format");
            System.exit(-1);
        }

        System.out.print("Bits per pixel: ");
        for (int i = 0; i < samplesPerPixel; i++) {
            System.out.format("%s%d", i > 0 ? ", " : "", bitsPerPixel[i]);
        }
        System.out.println("");

        // Create a TIFF Photometric Interpreter to perform a grayscale
        // rendering.  A Photometric Interpreter is a class that maps a
        // floating-point value to a pixel (RGB) equivalent.
        // Because there is no way to know the range of
        // values in the TIFF before it is read.  So the special-purpose
        // interpreter permits an application to extract the
        // min and maximum bounds of the data as an auxiliary function
        // of interpreting the data. Unfortunately, if we wish for a
        // good interpretation, we need to read the data twice.
        //    For this demo, we store the Photometric Interpreter instance
        // as a option-parameter to be passed into the read-image method.
        PhotometricInterpreterFloat pi
            = new PhotometricInterpreterFloat(directory, 0.0f, 1.0f);
        HashMap<String, Object> params = new HashMap<>();
        params.put(TiffConstants.PARAM_KEY_CUSTOM_PHOTOMETRIC_INTERPRETER, pi);
        System.out.println("Reading image");
        BufferedImage bImage = directory.getTiffImage(byteOrder, params);

        float maxValue = pi.getMaxFound();
        float minValue = pi.getMinFound();

        System.out.format("Image size %dx%d%n", bImage.getWidth(), bImage.getHeight());
        System.out.format("Range of values in TIFF: %f %f%n", minValue, maxValue);

        if (optionalImageWritingEnabled) {
            File output = new File(outputPath);
            System.out.println("Writing image to " + output.getPath());
            // create a new photometric interpreter based on the range
            // of values found above.
            PhotometricInterpreterFloat grayScale
                = new PhotometricInterpreterFloat(directory, minValue, maxValue);
            params = new HashMap<>();
            params.put(TiffConstants.PARAM_KEY_CUSTOM_PHOTOMETRIC_INTERPRETER, grayScale);
            bImage = directory.getTiffImage(byteOrder, params);
            ImageIO.write(bImage, "JPEG", output);
        }
    }
}
