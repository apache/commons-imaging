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
import java.io.PrintStream;
import java.util.HashMap;
import java.util.List;
import javax.imageio.ImageIO;
import org.apache.commons.imaging.FormatCompliance;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.formats.jpeg.JpegImagingParameters;
import org.apache.commons.imaging.formats.tiff.TiffContents;
import org.apache.commons.imaging.formats.tiff.TiffDirectory;
import org.apache.commons.imaging.formats.tiff.TiffField;
import org.apache.commons.imaging.formats.tiff.TiffReader;
import org.apache.commons.imaging.formats.tiff.constants.GdalLibraryTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.GeoTiffTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;

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
    public static void main(final String[] args)
        throws ImageReadException, IOException {
        if (args.length == 0) {
            // Print usage and exit
            for (final String s : USAGE) {
                System.err.println(s);
            }
            System.exit(0);
        }

        // For brevity, map System.out to a PrintStream reference.
        // In the future, this might also be used for writing to a text file
        // rather than standard output.
        PrintStream ps = System.out;

        final File target = new File(args[0]);
        String rootName = null;
        if (args.length == 2) {
            rootName = args[1];
        }
        final boolean optionalImageReadingEnabled
            = rootName != null && !rootName.isEmpty();

        final ByteSourceFile byteSource = new ByteSourceFile(target);
        final JpegImagingParameters params = new JpegImagingParameters();

        // Establish a TiffReader. This is just a simple constructor that
        // does not actually access the file.  So the application cannot
        // obtain the byteOrder, or other details, until the contents has
        // been read.  Then read the directories associated with the
        // file by passing in the byte source and options.
        final TiffReader tiffReader = new TiffReader(true);
        final TiffContents contents = tiffReader.readDirectories(
            byteSource,
            optionalImageReadingEnabled, // read image data, if present
            FormatCompliance.getDefault());

        // Loop on the directories and fetch the metadata and
        // image (if available, and configured to do so)
        int iDirectory = 0;
        for (final TiffDirectory directory : contents.directories) {
            // Get the metadata (Tags) and write them to standard output
            final boolean hasTiffImageData = directory.hasTiffImageData();
            if (iDirectory > 0) {
                ps.println("\n-----------------------------------------------------\n");
            }

            String contentType = "";
            if (directory.hasTiffRasterData()) {
                contentType = "Numeric raster data";
            } else if (directory.hasTiffImageData()) {
                contentType = "Image data";
            }
            ps.format("Directory %2d %s, description: %s%n",
                iDirectory,
                contentType,
                directory.description());
            // Loop on the fields, printing the metadata (fields) ----------
            final List<TiffField> fieldList = directory.getDirectoryEntries();
            for (final TiffField tiffField : fieldList) {
                String s = tiffField.toString();
                if (s.length() > 90) {
                    s = s.substring(0, 90);
                }
                // In the case if the offsets (file positions) for the Strips
                // or Tiles, the string may be way too long for output and
                // will be truncated.  Therefore, indicate the numnber of entries.
                // These fields are indicated by numerical tags 0x144 and 0x145
                if (tiffField.getTag() == 0x144 || tiffField.getTag() == 0x145) {
                    final int i = s.indexOf(')');
                    final int[] a = tiffField.getIntArrayValue();
                    s = s.substring(0, i + 2) + " [" + a.length + " entries]";
                }
                ps.println(" " + s);
            }

            summarizeGeoTiffTags(ps, directory);

            if (optionalImageReadingEnabled && hasTiffImageData) {
                final File output = new File(rootName + "_" + iDirectory + ".jpg");
                ps.println("Writing image to " + output.getPath());
                final BufferedImage bImage = directory.getTiffImage(params);
                ImageIO.write(bImage, "JPEG", output);
            }
            ps.println("");
            iDirectory++;
        }
    }

    // The following elements were copied from the original
    // GeoTIFF specification document
    //     Ritter, Niles and Ruth, Mike (1995). GeoTIFF Format Specification,
    //     GeoTIFF Revision 1.0. Specification Version 1.8.1. 31 October 1995
    //     Appendix 6.
    // See also:
    //     Open Geospatial Consortium [OGC] (2019) OGC GeoTIFF Standard Version 1.1
    //     http://www.opengis.net/doc/IS/GeoTIFF/1.1
    
    enum GeoKey{
      // From 6.2.1 GeoTiff Configuration Keys
        GTModelTypeGeoKey(             1024), /* Section 6.3.1.1 Codes       */
        GTRasterTypeGeoKey(            1025), /* Section 6.3.1.2 Codes       */
        GTCitationGeoKey(              1026), /* documentation */
        
        // From 6.2.2 Geographic Coordinate System Parameter Keys
        GeographicTypeGeoKey(          2048), /* Section 6.3.2.1 Codes     */
        GeogCitationGeoKey(            2049), /* documentation             */
        GeogGeodeticDatumGeoKey(       2050), /* Section 6.3.2.2 Codes     */
        GeogPrimeMeridianGeoKey(       2051), /* Section 6.3.2.4 codes     */
        GeogLinearUnitsGeoKey(         2052), /* Section 6.3.1.3 Codes     */
        GeogLinearUnitSizeGeoKey(      2053), /* meters                    */
        GeogAngularUnitsGeoKey(        2054), /* Section 6.3.1.4 Codes     */
        GeogAngularUnitSizeGeoKey(     2055), /* radians                   */
        GeogEllipsoidGeoKey(           2056), /* Section 6.3.2.3 Codes     */
        GeogSemiMajorAxisGeoKey(       2057), /* GeogLinearUnits           */
        GeogSemiMinorAxisGeoKey(       2058), /* GeogLinearUnits           */
        GeogInvFlatteningGeoKey(       2059), /* ratio                     */
        GeogAzimuthUnitsGeoKey(        2060), /* Section 6.3.1.4 Codes     */
        GeogPrimeMeridianLongGeoKey(   2061), /* GeogAngularUnit           */
        
        // From 6.2.3 Projected Coordinate System Parameter Keys
        ProjectedCRSGeoKey(              3072),  /* Section 6.3.3.1 codes   */
        PCSCitationGeoKey(               3073),  /* documentation           */
        ProjectionGeoKey(                3074),  /* Section 6.3.3.2 codes   */
        ProjCoordTransGeoKey(            3075),  /* Section 6.3.3.3 codes   */
        ProjLinearUnitsGeoKey(           3076),  /* Section 6.3.1.3 codes   */
        ProjLinearUnitSizeGeoKey(        3077),  /* meters                  */
        ProjStdParallel1GeoKey(          3078),  /* GeogAngularUnit */
        ProjStdParallel2GeoKey(          3079),  /* GeogAngularUnit */
        ProjNatOriginLongGeoKey(         3080),  /* GeogAngularUnit */
        ProjNatOriginLatGeoKey(          3081),  /* GeogAngularUnit */
        ProjFalseEastingGeoKey(          3082),  /* ProjLinearUnits */
        ProjFalseNorthingGeoKey(         3083),  /* ProjLinearUnits */
        ProjFalseOriginLongGeoKey(       3084),  /* GeogAngularUnit */
        ProjFalseOriginLatGeoKey(        3085),  /* GeogAngularUnit */
        ProjFalseOriginEastingGeoKey(    3086),  /* ProjLinearUnits */
        ProjFalseOriginNorthingGeoKey(   3087),  /* ProjLinearUnits */
        ProjCenterLongGeoKey(            3088),  /* GeogAngularUnit */
        ProjCenterLatGeoKey(             3089),  /* GeogAngularUnit */
        ProjCenterEastingGeoKey(         3090),  /* ProjLinearUnits */
        ProjCenterNorthingGeoKey(        3091),  /* ProjLinearUnits */
        ProjScaleAtNatOriginGeoKey(      3092),  /* ratio   */
        ProjScaleAtCenterGeoKey(         3093),  /* ratio   */
        ProjAzimuthAngleGeoKey(          3094),  /* GeogAzimuthUnit */
        ProjStraightVertPoleLongGeoKey(  3095),  /* GeogAngularUnit */
        // From 6.2.4 Vertical Coordinate System Keys
        VerticalCSTypeGeoKey(            4096),   /* Section 6.3.4.1 codes   */
        VerticalCitationGeoKey(          4097),   /* documentation */
        VerticalDatumGeoKey(             4098),   /* Section 6.3.4.2 codes   */
        VerticalUnitsGeoKey(             4099),   /* Section 6.3.1.3 codes   */
        
        // Widely used key not defined in original specification
        To_WGS84_GeoKey(                 2062);   /* Not in original spec */
         
        int key;
        GeoKey(int key) {
            this.key = key; 
        }
    };
    
    private static HashMap<Integer, GeoKey> keyMap;
    private static String nameFormat;

    /**
     * Checks to see if the directory has GeoTIFF tags and, if so, provides a
     * summary of their content.
     *
     * @param ps a valid instance to receive output
     * @param directory a valid directory
     * @throws ImageReadException in the event of a data-format error or
     * unhandled I/O error.
     */
    private static void summarizeGeoTiffTags(PrintStream ps, TiffDirectory directory)
        throws ImageReadException {

        if (keyMap == null) {
            GeoKey[] values = GeoKey.values();
            int maxNameLength = 0;
            keyMap = new HashMap<>();
            for (GeoKey g : values) {
                String name = g.name();
                if (name.length() > maxNameLength) {
                    maxNameLength = name.length();
                }
                keyMap.put(g.key, g);
            }
            // create a formatting string that will pad all names
            // out with trailing spaces to provide text alignment in code below.
            nameFormat = String.format("   %%-%ds", maxNameLength);
        }

        // check to see if the directory has GeoTIFF tags.
        short[] geoKeyDirectory = directory.getFieldValue(
            GeoTiffTagConstants.EXIF_TAG_GEO_KEY_DIRECTORY_TAG, false);
        if (geoKeyDirectory == null || geoKeyDirectory.length < 4) {
            // The TIFF directory does not contain GeoTIFF information
            return;
        }
        ps.println("");
        ps.println("Summary of GeoTIFF Elements ----------------------------");

        short[] bitsPerSample = directory.getFieldValue(
            TiffTagConstants.TIFF_TAG_BITS_PER_SAMPLE, false);
        short[] sampleFormat = directory.getFieldValue(
            TiffTagConstants.TIFF_TAG_SAMPLE_FORMAT, false);
        String contentTypeString = null;
        if (bitsPerSample != null && sampleFormat != null) {
            if (bitsPerSample[0] == 16 && sampleFormat[0] == TiffTagConstants.SAMPLE_FORMAT_VALUE_TWOS_COMPLEMENT_SIGNED_INTEGER) {
                contentTypeString = "Numeric, Short Integer";
            } else if ((bitsPerSample[0] == 32 || bitsPerSample[0] == 64)
                && sampleFormat[0] == TiffTagConstants.SAMPLE_FORMAT_VALUE_IEEE_FLOATING_POINT) {
                contentTypeString = "Numeric, Floating Point (" + bitsPerSample[0] + "-bit samples)";
            }
        }
        if (contentTypeString != null) {
            ps.format("%nContent Type: %s", contentTypeString);
            String gdalNoDataString[] = directory.getFieldValue(
                GdalLibraryTagConstants.EXIF_TAG_GDAL_NO_DATA, false);
            if (gdalNoDataString != null && gdalNoDataString.length > 0) {
                ps.format("    GDAL No-Data value: %s", gdalNoDataString[0]);
            }
            ps.format("%n");
        }

        // all GeoKeyDirectory elements are unsigned shorts (2 bytes).
        // Some of which exceed the value 32767, the maximum value of 
        // a signed short). Because Java does not support an unsigned short type,
        // we need to mask in the low-order 2 bytes and obtain a 4-byte integer 
        // equivalent.
        int[] elements = new int[geoKeyDirectory.length];
        for (int i = 0; i < geoKeyDirectory.length; i++) {
            elements[i] = geoKeyDirectory[i] & 0xffff;
        }

        // Get the double field, Tag ID=34736 (0x87B0).  This field
        // will usually be present. Some TIFF products supply only the
        // European Petroleum Survey Group (EPSG) map projection ID
        // and may omit the floating-point map-projection parameters.
        // That approach is generally discouraged, but not prohibited.
        TiffField doubleParametersField = directory.findField(
            GeoTiffTagConstants.EXIF_TAG_GEO_DOUBLE_PARAMS_TAG);
        double[] doubleParameters = null;
        if (doubleParametersField != null) {
            doubleParameters = doubleParametersField.getDoubleArrayValue();
        }

        // Get the ASCII field, Tag ID=34737 (0x87B1). This field
        // is often, but not always, present.
        TiffField asciiParametersField = directory.findField(
            GeoTiffTagConstants.EXIF_TAG_GEO_ASCII_PARAMS_TAG);
        String asciiParameters = null;
        if (asciiParametersField != null) {
            asciiParameters = asciiParametersField.getStringValue();
        }

        ps.format("%nGeoKey Table%n");
        ps.println("     key     ref     len   value/pos     name");
        int k = 0;
        int n = elements.length / 4;
        for (int i = 0; i < n; i++) {
            int key = elements[k];
            int ref = elements[k + 1];
            int len = elements[k + 2];
            int vop = elements[k + 3];
            String label = "";
            if (ref == GeoTiffTagConstants.EXIF_TAG_GEO_ASCII_PARAMS_TAG.tag) {
                label = "(A)";
            } else if (ref == GeoTiffTagConstants.EXIF_TAG_GEO_DOUBLE_PARAMS_TAG.tag) {
                label = "(D)";
            }
            for (int j = 0; j < 4; j++) {
                ps.format("%8d", elements[k++]);
            }
            ps.format("   %-3s", label);

            // The first four elements in the integer array are not
            // actually a GeoKey, but rather an overall identifier
            GeoKey geoKey;
            String name;
            String interpretation;
            if (i == 0) {
                name = "~~~";
                interpretation = "~~~";
            } else {
                geoKey = keyMap.get(key);
                if (geoKey == null) {
                    name = "Unknown GeoKey";
                    interpretation = "~~~";
                } else {
                    name = geoKey.name();
                    interpretation
                        = interpretElements(
                            geoKey, ref, len, vop,
                            doubleParameters, asciiParameters);
                }
            }

            ps.format(nameFormat, name);
            ps.format("%s", interpretation);
            ps.format("%n");
        }

        // Note:  The y coordinate of the model pixel scale is backwards.
        //        GeoTIFF images are stored  from upper-left corner downward
        //        (following the conventional graphics standards). In cases
        //        where the rows in the image or rster run from north to south,
        //        one might expect that the delta-Y between rows would be
        //        a negative number.  But by the GeoTIFF standard, 
        //        the verical spacing is given as a postive   number.
        TiffField pixelScaleField = directory.findField(
            GeoTiffTagConstants.EXIF_TAG_MODEL_PIXEL_SCALE_TAG);
        double[] pixelScale;
        if (pixelScaleField == null) {
            ps.format("%nModelPixelScale is not supplied%n");
        } else {
            pixelScale = pixelScaleField.getDoubleArrayValue();
            ps.format("%nModelPixelScale%n");
            for (int i = 0; i < pixelScale.length; i++) {
                ps.format("   %15.10e", pixelScale[i]);
            }
            ps.format("%n");
        }

        TiffField modelTiepointField = directory.findField(
            GeoTiffTagConstants.EXIF_TAG_MODEL_TIEPOINT_TAG);
        if (modelTiepointField != null) {
            ps.format("%nModelTiepointTag%n");
            ps.println("           Pixel                           Model");

            double[] tiePoints = modelTiepointField.getDoubleArrayValue();
            n = tiePoints.length / 6;
            for (int i = 0; i < n; i++) {
                ps.format("   ");
                for (int j = 0; j < 3; j++) {
                    ps.format("%6.1f", tiePoints[i * 6 + j]);
                }
                ps.format("     ");
                for (int j = 3; j < 6; j++) {
                    ps.format("%13.3f", tiePoints[i * 6 + j]);
                }
                ps.format("%n");
            }
        }

        TiffField modelTransformField = directory.findField(
            GeoTiffTagConstants.EXIF_TAG_MODEL_TRANSFORMATION_TAG);
        if (modelTransformField != null) {
            ps.format("%nModelTransformationTag%n");
            double[] mtf = modelTiepointField.getDoubleArrayValue();
            if (mtf.length >= 16) {
                for (int i = 0; i < 4; i++) {
                    ps.format("   ");
                    for (int j = 0; j < 4; j++) {
                        ps.format("%13.3f", mtf[i * 4 + j]);
                    }
                    ps.format("%n");
                }
            }
        }
    }

    /**
     * Provides specifications for Coordinate Transformation Codes as defined
     * in Appendix 6.3.3.3 "Coordinate Transformation Codes" of the
     * original GeoTiff specification (Ritter, 1995).
     */
    enum CoordinateTransformationCode {
        TransverseMercator(             1),
        TransvMercator_Modified_Alaska( 2),
        ObliqueMercator(                3),
        ObliqueMercator_Laborde(        4),
        ObliqueMercator_Rosenmund(      5),
        ObliqueMercator_Spherical(      6),
        Mercator(                       7),
        LambertConfConic_2SP(           8),
        LambertConfConic_Helmert(       9),
        LambertAzimEqualArea(          10),
        AlbersEqualArea(               11),
        AzimuthalEquidistant(          12),
        EquidistantConic(              13),
        Stereographic(                 14),
        PolarStereographic(            15),
        ObliqueStereographic(          16),
        Equirectangular(               17),
        CassiniSoldner(                18),
        Gnomonic(                      19),
        MillerCylindrical(             20),
        Orthographic(                  21),
        Polyconic(                     22),
        Robinson(                      23),
        Sinusoidal(                    24),
        VanDerGrinten(                 25),
        NewZealandMapGrid(             26),
        TransvMercator_SouthOriented(  27);

        int key;

        CoordinateTransformationCode(int key){
         this.key = key;
        } 
        
        /**
         * Gets the enumeration value associated with the specified
         * key if any.
         * @param key a positive integer
         * @return if the key is matched, a value enumeration value;
         * otherwise, a null.
         */
        static CoordinateTransformationCode getValueForKey(int key){
            for(CoordinateTransformationCode v: values()){
                if(v.key==key){
                    return v;
                }
            }
            return null;
        }
    }

    /**
     * Interprets elements from one row of the GeoKey table, returning a
     * descriptive string where possible. The GeoTIFF specification is
     * extensive, and only a subset of the possible descriptions are supported
     * here.
     *
     * @param geoKey a valid GeoKey enumeration
     * @param ref the reference (not used at this time)
     * @param len the length of the associated string or floating-point value
     * array (if used)
     * @param valueOrPosition a single integer value or the position within the
     * associated floating point array
     * @param doubleParameters an array of doubles
     * @param asciiParameters a String consisting of ASCII characters.
     * @return a valid string, potentially a note to see the specification if a
     * more useful description is not available.
     */
    private static String interpretElements(
        GeoKey geoKey, int ref, int len, int valueOrPosition,
        double[] doubleParameters, String asciiParameters) {
        switch (geoKey) {
            case GTModelTypeGeoKey:
                switch (valueOrPosition) {
                    case 1:
                        return "Projected Coordinate System";
                    case 2:
                        return "Geographic Coordinate System";
                    case 3:
                        // the Geocentric coordinate system is seldom used
                        return "Geocentric Coordinate System";
                    default:
                        break;
                }
            case GTRasterTypeGeoKey:
                switch (valueOrPosition) {
                    case 1:
                        return "RasterPixelIsArea";
                    case 2:
                        return "RasterPixelIsPoint";
                    default:
                        return "User Defined";
                }
            case GeographicTypeGeoKey:
                switch (valueOrPosition) {
                    case 4269:
                        return "North American Datum 1983";
                    case 4030:
                        return "World Geodetic Survey 1984";
                    case 4326:
                        return "EPSG 4326, Geographic 2D WGS 84";
                    default:
                        break;
                }
            case GTCitationGeoKey:
                return extractAscii(asciiParameters, valueOrPosition, len);
            case GeogCitationGeoKey:
                return extractAscii(asciiParameters, valueOrPosition, len);
            case GeogAngularUnitsGeoKey:
                switch (valueOrPosition) {
                    case 9101:
                        return "Radians";
                    case 9102:
                        return "Degrees";
                    default:
                        break;
                }
            case GeogSemiMajorAxisGeoKey:
                return extractDouble(doubleParameters, valueOrPosition, len);
            case GeogInvFlatteningGeoKey:
                return extractDouble(doubleParameters, valueOrPosition, len);
            case To_WGS84_GeoKey:
                return extractDouble(doubleParameters, valueOrPosition, len);
            case ProjectedCRSGeoKey:
                // in original spec was "ProjectedCSTypeGeoKey"
                if (0 <= valueOrPosition && valueOrPosition <= 1023) {
                    return "Reserved";
                } else if (1024 <= valueOrPosition && valueOrPosition <= 32766) {
                    return "EPSG Code #" + valueOrPosition;
                } else if (valueOrPosition == 32767) {
                    return "User-Defined Projection";
                }
                break;
            case ProjectionGeoKey:
                if(valueOrPosition==32767){
                    return "User-Defined";
                }
                break;
            case ProjCoordTransGeoKey:
                CoordinateTransformationCode code = 
                    CoordinateTransformationCode.getValueForKey(valueOrPosition);
                if(code!=null){
                    return code.name();
                }
                break;
            case ProjLinearUnitsGeoKey:
                switch (valueOrPosition) {
                    case 9001:
                        return "Meter";
                    case 9002:
                        return "Foot";
                    case 9003:
                        return "Survey Foot"; // used in U.S.
                    default:
                        break;
                }
                break;
            case ProjStdParallel1GeoKey:
            case ProjStdParallel2GeoKey:
            case ProjNatOriginLongGeoKey:
            case ProjFalseEastingGeoKey:
            case ProjFalseNorthingGeoKey:
            case ProjFalseOriginLongGeoKey:
            case ProjFalseOriginLatGeoKey:
            case ProjFalseOriginEastingGeoKey:
            case ProjFalseOriginNorthingGeoKey:
            case ProjCenterLongGeoKey:
            case ProjCenterLatGeoKey:
                return String.format("%13.4f", doubleParameters[valueOrPosition]);
                
            default:
                break;
        }
        return "See GeoTIFF specification";
    }

    /**
     * Extract a sub-string from the ASCII parameters. The ASCII parameters
     * include a vertical-bar symbol to act as a separator between strings. This
     * method includes some safety-checking logic which should not be necessary
     * except in the case of a badly formatted GeoTIFF file.
     *
     * @param asciiParameters the content of TIFF Tag ID=34737.
     * @param pos the position of the sub-string within the content
     * @param len the length of the sub-string.
     * @return a valid string.
     */
    private static String extractAscii(String asciiParameters, int pos, int len) {
        if (asciiParameters != null && len > 0 && pos + len <= asciiParameters.length()) {
            return asciiParameters.substring(pos, pos + len - 1);
        }
        return "~~~";
    }

    /**
     * Extract a string giving the floating-point values for the content taken
     * from TIFF Tag ID=34736. Because a TAG might potentially include a large
     * number of entries, this method limits the return value to the first three
     * entries. This method includes some safety-checking logic which should not
     * be necessary except in the case of a badly formed GeoTIFF file.
     *
     * @param doubleParameters an array of values
     * @param pos the starting position of the values for the GeoKey
     * @param len the number of values for the GeoKey
     * @return a formatted string.
     */
    private static String extractDouble(double[] doubleParameters, int pos, int len) {
        if (doubleParameters != null && doubleParameters.length >= pos + len) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < len && i < 3; i++) {
                if (i > 0) {
                    sb.append(" | ");
                }
                sb.append(Double.toString(doubleParameters[pos + i]));
            }
            if (len > 3) {
                sb.append(" | ...");
            }
            return sb.toString();
        }
        return "~~~";
    }
}
