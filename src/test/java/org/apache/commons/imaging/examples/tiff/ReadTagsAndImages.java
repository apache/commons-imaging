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
import java.util.List;
import javax.imageio.ImageIO;
import org.apache.commons.imaging.FormatCompliance;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.formats.tiff.TiffContents;
import org.apache.commons.imaging.formats.tiff.TiffDirectory;
import org.apache.commons.imaging.formats.tiff.TiffField;
import org.apache.commons.imaging.formats.tiff.TiffReader;


/**
 * Provides a example application showing how to access metadata and imagery
 * from TIFF files using the low-level access routines. This approach is
 * especially useful if the TIFF file includes multiple images.
 */
public class ReadTagsAndImages {

    private static final String[] USAGE = {
        "Usage ReadTagsAndImages <input file>  [output file]",
        "   input file: mandatory file to be read",
        "   output file: optional root name and path for files to be written"
    };

    /**
     * Open the specified TIFF file and print its metadata (fields) to standard
     * output. If an output root-name is specified, write images to specified
     * path.
     *
     * @param args the command line arguments
     * @throws org.apache.commons.imaging.ImageReadException in the event of an
     * internal data format or version compatibility error reading the image.
     * @throws java.io.IOException in the event of an I/O error.
     */
    public static void main(String[] args)
        throws ImageReadException, IOException {
        if (args.length == 0) {
            // Print usage and exit
            for (String s : USAGE) {
                System.err.println(s);
            }
            System.exit(0);
        }

        File target = new File(args[0]);
        String rootName = null;
        if (args.length == 2) {
            rootName = args[1];
        }
        boolean optionalImageReadingEnabled
            = rootName != null && !rootName.isEmpty();

        ByteSourceFile byteSource = new ByteSourceFile(target);
        HashMap<String, Object> params = new HashMap<>();


        // Establish a TiffReader. This is just a simple constructor that
        // does not actually access the file.  So the application cannot
        // obtain the byteOrder, or other details, until the contents has
        // been read.  Then read the directories associated with the
        // file by passing in the byte source and options.
        TiffReader tiffReader = new TiffReader(true);
        TiffContents contents = tiffReader.readDirectories(
            byteSource,
            optionalImageReadingEnabled, // read image data, if present
            FormatCompliance.getDefault());

        // Loop on the directories and fetch the metadata and
        // image (if available, and configured to do so)
        int iDirectory = 0;
        for (TiffDirectory directory : contents.directories) {
            // Get the metadata (Tags) and write them to standard output
            boolean hasTiffImageData = directory.hasTiffImageData();
            System.out.format("Directory %2d %s, description: %s%n",
                iDirectory,
                hasTiffImageData ? "Has TIFF Image Data" : "No TIFF Image Data",
                directory.description());
            // Loop on the fields, printing the metadata (fields) ----------
            List<TiffField> fieldList = directory.getDirectoryEntries();
            for (TiffField tiffField : fieldList) {
                String s = tiffField.toString();
                if (s.length() > 90) {
                    s = s.substring(0, 90);
                }
                // In the case if the offsets (file positions) for the Strips
                // or Tiles, the string may be way too long for output and
                // will be truncated.  Therefore, indicate the numnber of entries.
                // These fields are indicated by numerical tags 0x144 and 0x145
                if (tiffField.getTag() == 0x144 || tiffField.getTag() == 0x145) {
                    int i = s.indexOf(')');
                    int[] a = tiffField.getIntArrayValue();
                    s = s.substring(0, i + 2) + " [" + a.length + " entries]";
                }
                System.out.println(" " + s);
            }

            if (optionalImageReadingEnabled && hasTiffImageData) {
                File output = new File(rootName + "_" + iDirectory + ".jpg");
                System.out.println("Writing image to " + output.getPath());
                BufferedImage bImage = directory.getTiffImage(params);
                ImageIO.write(bImage, "JPEG", output);
            }
            System.out.println("");
            iDirectory++;
        }
    }

}
