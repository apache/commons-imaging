/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str3 = tiffImageMetadata1.toString("\thi!: ");
        tiffImageMetadata1.add("\thi!: \n\thi!: ", "\thi!: \thi!: ");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents7 = tiffImageMetadata1.contents;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray9 = tiffImageMetadata1.getFieldValue(tagInfoSRationals8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(tiffContents7);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("hi!", "\thi!: ");
        tiffImageMetadata1.add("\thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: ", "\thi!: \n\thi!: hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte10 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = tiffImageMetadata1.getFieldValue(tagInfoByte10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        java.lang.String str13 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeSeconds;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str3 = tiffImageMetadata1.toString("\thi!: ");
        tiffImageMetadata1.add("\thi!: \n\thi!: ", "\thi!: \thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffField tiffField8 = tiffImageMetadata1.findField(tagInfo7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.longitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
        org.junit.Assert.assertNull(rationalNumber18);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        java.lang.String str4 = tiffImageMetadata1.toString("\thi!: \n\thi!: ");
        java.lang.String str6 = tiffImageMetadata1.toString("hi!");
        tiffImageMetadata1.add("\thi!: ", "\thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: ");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet10 = tiffImageMetadata1.getOutputSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: hi!", "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: " + "'", str11, "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ");
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeMinutes;
        java.lang.String str14 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents4 = tiffImageMetadata1.contents;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = tiffImageMetadata1.getFieldValue(tagInfoDoubles5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tiffContents4);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeMinutes;
        java.lang.String str17 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeMinutes;
        java.lang.String str17 = gpsInfo8.latitudeRef;
        java.lang.String str18 = gpsInfo8.latitudeRef;
        java.lang.String str19 = gpsInfo8.longitudeRef;
        java.lang.String str20 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber21 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(rationalNumber21);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory4 = tiffImageMetadata1.findDirectory((int) ' ');
        java.lang.String str5 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = tiffImageMetadata1.getFieldValue(tagInfoGpsText6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(tiffDirectory4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
        org.junit.Assert.assertNull(rationalNumber18);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        java.lang.String str12 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        java.lang.String str3 = tiffImageMetadata1.toString();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList4 = tiffImageMetadata1.getAllFields();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = tiffImageMetadata1.getFieldValue(tagInfo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(tiffFieldList4);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: ", "\thi!: \n\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        java.lang.String str4 = tiffImageMetadata1.toString("\thi!: \n\thi!: ");
        java.lang.String str6 = tiffImageMetadata1.toString("hi!");
        tiffImageMetadata1.add("\thi!: \thi!: ", "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = tiffImageMetadata1.getFieldValue(tagInfoXpString10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("\thi!: ", "hi!");
        tiffImageMetadata1.add("\t\thi!: \n\thi!: : \thi!: \n\thi!: ", "\thi!: \thi!: \thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem14 = null;
        tiffImageMetadata1.add(imageMetadataItem14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = tiffImageMetadata1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem7 = null;
        tiffImageMetadata1.add(imageMetadataItem7);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem9 = null;
        tiffImageMetadata1.add(imageMetadataItem9);
        tiffImageMetadata1.add("hi!", "\thi!: hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory15 = tiffImageMetadata1.findDirectory((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents4 = tiffImageMetadata1.contents;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet5 = tiffImageMetadata1.getOutputSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tiffContents4);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.latitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        java.lang.String str11 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents8 = tiffImageMetadata1.contents;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray10 = tiffImageMetadata1.getFieldValue(tagInfoRationals9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tiffContents8);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents8 = tiffImageMetadata1.contents;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts9 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray10 = tiffImageMetadata1.getFieldValue(tagInfoSShorts9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tiffContents8);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem4 = null;
        tiffImageMetadata1.add(imageMetadataItem4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList6 = tiffImageMetadata1.getAllFields();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        java.lang.String str3 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents4 = tiffImageMetadata1.contents;
        tiffImageMetadata1.add("\t\thi!: \n\thi!: : \thi!: \n\thi!: ", "\t\thi!: \thi!: : \thi!: \thi!: \thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = tiffImageMetadata1.getFieldValue(tagInfoAscii8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(tiffContents4);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ", "\thi!: \n\thi!: \n\t: hi!\t\thi!: \thi!: : \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem7 = null;
        tiffImageMetadata1.add(imageMetadataItem7);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs tagInfoSLongs9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = tiffImageMetadata1.getFieldValue(tagInfoSLongs9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\t\thi!: \thi!: : \thi!: \thi!: \thi!: ", "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: hi!", "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \n\thi!: hi!", "\thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: \thi!: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeMinutes;
        java.lang.String str17 = gpsInfo8.latitudeRef;
        java.lang.String str18 = gpsInfo8.latitudeRef;
        java.lang.String str19 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber20 = gpsInfo8.longitudeMinutes;
        java.lang.String str21 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(rationalNumber20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        java.lang.String str8 = tiffImageMetadata1.toString();
        java.lang.String str10 = tiffImageMetadata1.toString("hi!\thi!: hi!");
        java.lang.String str12 = tiffImageMetadata1.toString("hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList13 = tiffImageMetadata1.getAllFields();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem cannot be cast to class org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory (org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem and org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\thi!: \n\thi!: " + "'", str8, "\thi!: \n\thi!: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: " + "'", str10, "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \thi!: \nhi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \thi!: " + "'", str12, "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \thi!: \nhi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \thi!: ");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeDegrees;
        java.lang.String str14 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeDegrees;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: ", "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.latitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\thi!: \thi!: \thi!: " + "'", str9, "\thi!: \thi!: \thi!: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: " + "'", str10, "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: ");
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        java.lang.String str15 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        java.lang.String str15 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.longitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
        org.junit.Assert.assertNull(rationalNumber18);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeMinutes;
        java.lang.String str14 = gpsInfo8.longitudeRef;
        java.lang.String str15 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(rationalNumber16);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: ", "\thi!: \n\thi!: \n\t: hi!\t\thi!: \thi!: : \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.latitudeRef;
        java.lang.String str10 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\thi!: " + "'", str9, "\thi!: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\thi!: " + "'", str10, "\thi!: ");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeSeconds;
        java.lang.String str11 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        java.lang.Class<?> wildcardClass13 = gpsInfo8.getClass();
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        java.lang.String str15 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.latitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        java.lang.String str4 = tiffImageMetadata1.toString("\thi!: \n\thi!: ");
        java.lang.String str6 = tiffImageMetadata1.toString("hi!");
        tiffImageMetadata1.add("\thi!: ", "\thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffField tiffField12 = tiffImageMetadata1.findField(tagInfo10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str3 = tiffImageMetadata1.toString("\thi!: ");
        tiffImageMetadata1.add("\thi!: \n\thi!: ", "\thi!: \thi!: ");
        java.lang.String str8 = tiffImageMetadata1.toString("\thi!: \n\thi!: hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs tagInfoSLongs9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = tiffImageMetadata1.getFieldValue(tagInfoSLongs9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\thi!: \n\thi!: hi!\t\thi!: \n\thi!: : \thi!: \thi!: " + "'", str8, "\thi!: \n\thi!: hi!\t\thi!: \n\thi!: : \thi!: \thi!: ");
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        java.lang.String str11 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeMinutes;
        java.lang.String str17 = gpsInfo8.longitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: ", "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.latitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\thi!: \thi!: \thi!: " + "'", str9, "\thi!: \thi!: \thi!: ");
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: \n\t: hi!", "\t\t\thi!: \n\thi!: : \thi!: \n\thi!: : \thi!: \thi!: \thi!: \n\t: hi!\t\thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: : \thi!: \n\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        java.lang.String str8 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents9 = tiffImageMetadata1.contents;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts10 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray11 = tiffImageMetadata1.getFieldValue(tagInfoShorts10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\thi!: \n\thi!: " + "'", str8, "\thi!: \n\thi!: ");
        org.junit.Assert.assertNull(tiffContents9);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeSeconds;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem7 = null;
        tiffImageMetadata1.add(imageMetadataItem7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo9 = tiffImageMetadata1.getGpsInfo();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: ", "\thi!: hi!\n\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: ", "\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \n\thi!: ", "\thi!: \n\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        java.lang.String str8 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = tiffImageMetadata1.getFieldValue(tagInfoDoubles9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\thi!: \n\thi!: " + "'", str8, "\thi!: \n\thi!: ");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes tagInfoSBytes3 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray4 = tiffImageMetadata1.getFieldValue(tagInfoSBytes3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.longitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
        org.junit.Assert.assertNull(rationalNumber18);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        java.lang.String str11 = gpsInfo8.latitudeRef;
        java.lang.Class<?> wildcardClass12 = gpsInfo8.getClass();
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        java.lang.String str3 = tiffImageMetadata1.toString();
        tiffImageMetadata1.add("\thi!: ", "\t\thi!: \thi!: : \thi!: \thi!: \thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffField tiffField9 = tiffImageMetadata1.findField(tagInfo7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!", "\thi!: \thi!: \thi!: \n\t: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\thi!: hi!" + "'", str9, "\thi!: hi!");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem7 = null;
        tiffImageMetadata1.add(imageMetadataItem7);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem9 = null;
        tiffImageMetadata1.add(imageMetadataItem9);
        tiffImageMetadata1.add("hi!", "\thi!: hi!");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem14 = null;
        tiffImageMetadata1.add(imageMetadataItem14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet16 = tiffImageMetadata1.getOutputSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem7 = null;
        tiffImageMetadata1.add(imageMetadataItem7);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem9 = null;
        tiffImageMetadata1.add(imageMetadataItem9);
        tiffImageMetadata1.add("hi!", "\thi!: hi!");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem14 = null;
        tiffImageMetadata1.add(imageMetadataItem14);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffField tiffField18 = tiffImageMetadata1.findField(tagInfo16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory4 = tiffImageMetadata1.findDirectory((int) ' ');
        tiffImageMetadata1.add("\thi!: ", "\thi!: \thi!: \thi!: ");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents8 = tiffImageMetadata1.contents;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffField tiffField11 = tiffImageMetadata1.findField(tagInfo9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(tiffDirectory4);
        org.junit.Assert.assertNull(tiffContents8);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: ", "\thi!: \n\thi!: \n\t: hi!\t\thi!: \thi!: : \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.Class<?> wildcardClass9 = gpsInfo8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory4 = tiffImageMetadata1.findDirectory((int) ' ');
        tiffImageMetadata1.add("\thi!: ", "\thi!: \thi!: \thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffField tiffField10 = tiffImageMetadata1.findField(tagInfo8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(tiffDirectory4);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        java.lang.String str4 = tiffImageMetadata1.toString("\thi!: \n\thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = tiffImageMetadata1.getFieldValue(tagInfoLongs5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        java.lang.String str11 = gpsInfo8.latitudeRef;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.longitudeMinutes;
        java.lang.String str19 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
        org.junit.Assert.assertNull(rationalNumber18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        java.lang.String str14 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeSeconds;
        java.lang.String str16 = gpsInfo8.latitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!", "\thi!: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        java.lang.Class<?> wildcardClass11 = gpsInfo8.getClass();
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeMinutes;
        java.lang.String str17 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.longitudeMinutes;
        java.lang.String str19 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(rationalNumber18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        java.lang.String str3 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte4 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = tiffImageMetadata1.getFieldValue(tagInfoByte4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents4 = tiffImageMetadata1.contents;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs tagInfoSLongs5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = tiffImageMetadata1.getFieldValue(tagInfoSLongs5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tiffContents4);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: ", "\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory4 = tiffImageMetadata1.findDirectory((int) ' ');
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo5 = tiffImageMetadata1.getGpsInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = tiffImageMetadata1.getFieldValue(tagInfoXpString6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(tiffDirectory4);
        org.junit.Assert.assertNull(gpsInfo5);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeMinutes;
        java.lang.String str14 = gpsInfo8.longitudeRef;
        java.lang.Class<?> wildcardClass15 = gpsInfo8.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeMinutes;
        java.lang.String str16 = gpsInfo8.longitudeRef;
        java.lang.Class<?> wildcardClass17 = gpsInfo8.getClass();
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!", "\thi!: \thi!: \thi!: \n\t: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem7 = null;
        tiffImageMetadata1.add(imageMetadataItem7);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes tagInfoSBytes9 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = tiffImageMetadata1.getFieldValue(tagInfoSBytes9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        java.lang.String str8 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents9 = tiffImageMetadata1.contents;
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem10 = null;
        tiffImageMetadata1.add(imageMetadataItem10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\thi!: \n\thi!: " + "'", str8, "\thi!: \n\thi!: ");
        org.junit.Assert.assertNull(tiffContents9);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = tiffImageMetadata1.getFieldValue(tagInfoDoubles7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: hi!", "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\thi!: \thi!: \thi!: hi!" + "'", str9, "\thi!: \thi!: \thi!: hi!");
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!", "\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\thi!: " + "'", str9, "\thi!: ");
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        java.lang.String str3 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes tagInfoSBytes4 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = tiffImageMetadata1.getFieldValue(tagInfoSBytes4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: ", "\thi!: \thi!: \thi!: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory4 = tiffImageMetadata1.findDirectory((int) ' ');
        java.lang.String str5 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray7 = tiffImageMetadata1.getFieldValue(tagInfoRationals6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(tiffDirectory4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeDegrees;
        java.lang.String str13 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str3 = tiffImageMetadata1.toString("\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem4 = null;
        tiffImageMetadata1.add(imageMetadataItem4);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = tiffImageMetadata1.getFieldValue(tagInfoGpsText6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("hi!", "\thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes tagInfoSBytes7 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = tiffImageMetadata1.getFieldValue(tagInfoSBytes7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeDegrees;
        java.lang.String str14 = gpsInfo8.longitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: hi!", "\thi!: \thi!: \thi!: \n\t: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeSeconds;
        java.lang.String str10 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\thi!: \thi!: \thi!: hi!" + "'", str10, "\thi!: \thi!: \thi!: hi!");
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        java.lang.String str14 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeSeconds;
        java.lang.String str16 = gpsInfo8.latitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeDegrees;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeMinutes;
        java.lang.String str12 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeMinutes;
        java.lang.Class<?> wildcardClass14 = gpsInfo8.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        java.lang.String str8 = tiffImageMetadata1.toString();
        java.lang.String str10 = tiffImageMetadata1.toString("hi!\thi!: hi!");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem11 = null;
        tiffImageMetadata1.add(imageMetadataItem11);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte13 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = tiffImageMetadata1.getFieldValue(tagInfoByte13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\thi!: \n\thi!: " + "'", str8, "\thi!: \n\thi!: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: " + "'", str10, "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ");
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        java.lang.String str8 = tiffImageMetadata1.toString();
        tiffImageMetadata1.add("hi!\thi!: hi!", "\thi!: \n\thi!: \n\t: hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = tiffImageMetadata1.getFieldValue(tagInfoXpString12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\thi!: \n\thi!: " + "'", str8, "\thi!: \n\thi!: ");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory4 = tiffImageMetadata1.findDirectory((int) ' ');
        tiffImageMetadata1.add("\thi!: ", "\thi!: \thi!: \thi!: ");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = tiffImageMetadata1.getGpsInfo();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem cannot be cast to class org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory (org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem and org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(tiffDirectory4);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = rationalNumber14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        java.lang.String str4 = tiffImageMetadata1.toString("\thi!: \n\thi!: ");
        java.lang.String str6 = tiffImageMetadata1.toString("hi!");
        tiffImageMetadata1.add("\thi!: ", "\thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte10 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = tiffImageMetadata1.getFieldValue(tagInfoByte10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        java.lang.String str16 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.latitudeDegrees;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(rationalNumber17);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        java.lang.String str15 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.latitudeDegrees;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
        org.junit.Assert.assertNull(rationalNumber18);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: \n\t: hi!\t\thi!: \thi!: : \thi!: \thi!: ", "\thi!: \n\thi!: \n\t: hi!\t\thi!: \thi!: : \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: hi!", "\thi!: hi!\thi!: \n\thi!: hi!\thi!: hi!\t\thi!: \thi!: : \thi!: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.latitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeMinutes;
        java.lang.String str14 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        java.lang.String str8 = tiffImageMetadata1.toString();
        java.lang.String str10 = tiffImageMetadata1.toString("hi!\thi!: hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes tagInfoSBytes11 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = tiffImageMetadata1.getFieldValue(tagInfoSBytes11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\thi!: \n\thi!: " + "'", str8, "\thi!: \n\thi!: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: " + "'", str10, "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        java.lang.String str4 = tiffImageMetadata1.toString("\thi!: \n\thi!: ");
        java.lang.String str6 = tiffImageMetadata1.toString("hi!");
        tiffImageMetadata1.add("\thi!: \thi!: ", "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes tagInfoSBytes10 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = tiffImageMetadata1.getFieldValue(tagInfoSBytes10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: ", "\thi!: \thi!: \thi!: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeMinutes;
        java.lang.String str16 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\thi!: \thi!: " + "'", str16, "\thi!: \thi!: ");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        java.lang.String str15 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.longitudeDegrees;
        java.lang.String str18 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        java.lang.String str4 = tiffImageMetadata1.toString("\thi!: \n\thi!: ");
        java.lang.String str6 = tiffImageMetadata1.toString("hi!");
        tiffImageMetadata1.add("\thi!: \thi!: ", "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: ");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents10 = tiffImageMetadata1.contents;
        java.lang.String str11 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffField tiffField13 = tiffImageMetadata1.findField(tagInfo12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(tiffContents10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: " + "'", str11, "\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: ");
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        java.lang.String str15 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
        org.junit.Assert.assertNull(rationalNumber18);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: ", "hi!\thi!: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: ", "\thi!: \thi!: \thi!: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \n\thi!: \n\t: hi!\t\thi!: \thi!: : \thi!: \thi!: ", "\thi!: \n\thi!: \n\t: hi!\t\thi!: \thi!: : \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\thi!: \n\thi!: \n\t: hi!\t\thi!: \thi!: : \thi!: \thi!: " + "'", str9, "\thi!: \n\thi!: \n\t: hi!\t\thi!: \thi!: : \thi!: \thi!: ");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeMinutes;
        java.lang.String str14 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        java.lang.String str16 = gpsInfo8.latitudeRef;
        java.lang.String str17 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        java.lang.String str4 = tiffImageMetadata1.toString("\thi!: \n\thi!: ");
        java.lang.String str6 = tiffImageMetadata1.toString("hi!");
        tiffImageMetadata1.add("\thi!: \thi!: ", "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: ");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents10 = tiffImageMetadata1.contents;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray12 = tiffImageMetadata1.getFieldValue(tagInfoAscii11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(tiffContents10);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = tiffImageMetadata1.getFieldValue(tagInfoGpsText3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber19 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
        org.junit.Assert.assertNull(rationalNumber18);
        org.junit.Assert.assertNull(rationalNumber19);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!\thi!: hi!", "\thi!: \n\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents8 = tiffImageMetadata1.contents;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList9 = tiffImageMetadata1.getAllFields();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem cannot be cast to class org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory (org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem and org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tiffContents8);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeMinutes;
        java.lang.String str14 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents5 = tiffImageMetadata1.contents;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = tiffImageMetadata1.getFieldValue(tagInfoXpString6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tiffContents5);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeDegrees;
        java.lang.String str13 = gpsInfo8.longitudeRef;
        java.lang.String str14 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        java.lang.String str3 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem4 = null;
        tiffImageMetadata1.add(imageMetadataItem4);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte6 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = tiffImageMetadata1.getFieldValue(tagInfoByte6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: hi!", "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("hi!", "\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem7 = null;
        tiffImageMetadata1.add(imageMetadataItem7);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs tagInfoSLongs9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = tiffImageMetadata1.getFieldValue(tagInfoSLongs9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeMinutes;
        java.lang.String str17 = gpsInfo8.latitudeRef;
        java.lang.String str18 = gpsInfo8.latitudeRef;
        java.lang.String str19 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber20 = gpsInfo8.longitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(rationalNumber20);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        java.lang.String str12 = gpsInfo8.longitudeRef;
        java.lang.Class<?> wildcardClass13 = gpsInfo8.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("hi!", "\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem7 = null;
        tiffImageMetadata1.add(imageMetadataItem7);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = tiffImageMetadata1.getFieldValue(tagInfo9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        java.lang.String str11 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        java.lang.String str14 = gpsInfo8.longitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        java.lang.String str3 = tiffImageMetadata1.toString();
        tiffImageMetadata1.add("\thi!: ", "\t\thi!: \thi!: : \thi!: \thi!: \thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffField tiffField9 = tiffImageMetadata1.findField(tagInfo7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!", "\thi!: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        java.lang.String str11 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!: hi!" + "'", str11, "\thi!: hi!");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        java.lang.String str3 = tiffImageMetadata1.toString();
        java.lang.String str5 = tiffImageMetadata1.toString("\thi!: \thi!: ");
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo6 = tiffImageMetadata1.getGpsInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray8 = tiffImageMetadata1.getFieldValue(tagInfoRationals7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(gpsInfo6);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \n\thi!: hi!", "\thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeSeconds;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\t\t\thi!: \n\thi!: : \thi!: \n\thi!: : \thi!: \thi!: \thi!: \n\t: hi!\t\thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: : \thi!: \n\thi!: ", "\thi!: \n\thi!: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.latitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
        org.junit.Assert.assertNull(rationalNumber18);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!", "\thi!: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeSeconds;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!\n\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ", "\t\t\thi!: \n\thi!: : \thi!: \n\thi!: : \thi!: \thi!: \thi!: \n\t: hi!\t\thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: : \thi!: \n\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeMinutes;
        java.lang.String str17 = gpsInfo8.latitudeRef;
        java.lang.String str18 = gpsInfo8.latitudeRef;
        java.lang.String str19 = gpsInfo8.longitudeRef;
        java.lang.String str20 = gpsInfo8.latitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        java.lang.String str14 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeSeconds;
        java.lang.String str16 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.longitudeDegrees;
        java.lang.String str18 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber19 = gpsInfo8.latitudeDegrees;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(rationalNumber17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(rationalNumber19);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str3 = tiffImageMetadata1.toString("\thi!: ");
        tiffImageMetadata1.add("\thi!: \n\thi!: ", "\thi!: \thi!: ");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents7 = tiffImageMetadata1.contents;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts8 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray9 = tiffImageMetadata1.getFieldValue(tagInfoShorts8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(tiffContents7);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        java.lang.String str15 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
        org.junit.Assert.assertNull(rationalNumber18);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeDegrees;
        java.lang.String str16 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.longitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(rationalNumber17);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: \n\t: hi!", "\thi!: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents4 = tiffImageMetadata1.contents;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray6 = tiffImageMetadata1.getFieldValue(tagInfoAscii5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tiffContents4);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeSeconds;
        java.lang.String str14 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \n\thi!: hi!\n\t\thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: \thi!: hi!: \thi!: hi!", "\t\thi!: \n\thi!: : \thi!: \n\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: ", "\thi!: \thi!: \thi!: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str3 = tiffImageMetadata1.toString("\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem4 = null;
        tiffImageMetadata1.add(imageMetadataItem4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo6 = tiffImageMetadata1.getGpsInfo();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeMinutes;
        java.lang.String str17 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.longitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(rationalNumber18);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: hi!", "\thi!: \n\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeSeconds;
        java.lang.String str11 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!: \thi!: \thi!: hi!" + "'", str11, "\thi!: \thi!: \thi!: hi!");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: hi!", "\thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: \thi!: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeMinutes;
        java.lang.String str12 = gpsInfo8.longitudeRef;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "\t\thi!: \n\thi!: : \thi!: \n\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: hi!", "\thi!: \thi!: \thi!: \n\t: hi!\t\thi!: \thi!: : \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "\t\thi!: \n\thi!: : \thi!: \n\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeDegrees;
        java.lang.String str12 = gpsInfo8.longitudeRef;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!", "\thi!: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        java.lang.String str13 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeMinutes;
        java.lang.Class<?> wildcardClass16 = gpsInfo8.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeSeconds;
        java.lang.String str14 = gpsInfo8.longitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: \thi!: ", "\thi!: hi!\n\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        java.lang.String str16 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeDegrees;
        java.lang.String str14 = gpsInfo8.longitudeRef;
        java.lang.String str15 = gpsInfo8.longitudeRef;
        java.lang.Class<?> wildcardClass16 = gpsInfo8.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeDegrees;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: hi!", "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\thi!: \thi!: \thi!: hi!" + "'", str9, "\thi!: \thi!: \thi!: hi!");
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str3 = tiffImageMetadata1.toString("\thi!: ");
        tiffImageMetadata1.add("\thi!: \n\thi!: ", "\thi!: \thi!: ");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents7 = tiffImageMetadata1.contents;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = tiffContents7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(tiffContents7);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber19 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber20 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
        org.junit.Assert.assertNull(rationalNumber18);
        org.junit.Assert.assertNull(rationalNumber19);
        org.junit.Assert.assertNull(rationalNumber20);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        java.lang.String str8 = tiffImageMetadata1.toString();
        tiffImageMetadata1.add("hi!\thi!: hi!", "\thi!: \n\thi!: \n\t: hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts12 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray13 = tiffImageMetadata1.getFieldValue(tagInfoSShorts12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\thi!: \n\thi!: " + "'", str8, "\thi!: \n\thi!: ");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: ", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeMinutes;
        java.lang.String str13 = gpsInfo8.longitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str3 = tiffImageMetadata1.toString("\thi!: ");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet4 = tiffImageMetadata1.getOutputSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\t\t\thi!: \n\thi!: : \thi!: \n\thi!: : \thi!: \thi!: \thi!: \n\t: hi!", "\thi!: \thi!: \t: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        java.lang.String str4 = tiffImageMetadata1.toString("\thi!: \n\thi!: ");
        java.lang.String str6 = tiffImageMetadata1.toString("hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = tiffImageMetadata1.getFieldValue(tagInfoGpsText7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \n\thi!: \n\t: hi!\t\thi!: \thi!: : \thi!: \thi!: ", "\t\t\thi!: \n\thi!: : \thi!: \n\thi!: : \thi!: \thi!: \thi!: \n\t: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \n\thi!: ", "\thi!: \n\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        java.lang.String str3 = tiffImageMetadata1.toString();
        java.lang.String str5 = tiffImageMetadata1.toString("\thi!: \thi!: ");
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo6 = tiffImageMetadata1.getGpsInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs tagInfoSLongs7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = tiffImageMetadata1.getFieldValue(tagInfoSLongs7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(gpsInfo6);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: ", "\thi!: \n\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = rationalNumber12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeMinutes;
        java.lang.String str12 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.latitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
        org.junit.Assert.assertNull(rationalNumber18);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!", "\thi!: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: ", "\thi!: \thi!: \thi!: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \n\thi!: ", "\thi!: \n\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        java.lang.String str3 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts4 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray5 = tiffImageMetadata1.getFieldValue(tagInfoSShorts4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: ", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeMinutes;
        java.lang.String str14 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: ", "\thi!: \thi!: \thi!: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory8 = tiffImageMetadata1.findDirectory(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory8 = tiffImageMetadata1.findDirectory(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeDegrees;
        java.lang.String str15 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeDegrees;
        java.lang.String str13 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.longitudeRef;
        java.lang.String str14 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        java.lang.String str13 = gpsInfo8.longitudeRef;
        java.lang.String str14 = gpsInfo8.longitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        java.lang.String str12 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: ", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("hi!", "\thi!: ");
        tiffImageMetadata1.add("\thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: ", "\thi!: \n\thi!: hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes tagInfoSBytes10 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = tiffImageMetadata1.getFieldValue(tagInfoSBytes10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory4 = tiffImageMetadata1.findDirectory((int) ' ');
        tiffImageMetadata1.add("\thi!: ", "\thi!: \thi!: \thi!: ");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents8 = tiffImageMetadata1.contents;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = tiffImageMetadata1.getFieldValue(tagInfoLongs9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(tiffDirectory4);
        org.junit.Assert.assertNull(tiffContents8);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem7 = null;
        tiffImageMetadata1.add(imageMetadataItem7);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem9 = null;
        tiffImageMetadata1.add(imageMetadataItem9);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem11 = null;
        tiffImageMetadata1.add(imageMetadataItem11);
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents13 = tiffImageMetadata1.contents;
        org.junit.Assert.assertNull(tiffContents13);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeMinutes;
        java.lang.String str16 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.longitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(rationalNumber17);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: \n\t: hi!\t\thi!: \thi!: : \thi!: \thi!: ", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeMinutes;
        java.lang.String str17 = gpsInfo8.latitudeRef;
        java.lang.String str18 = gpsInfo8.latitudeRef;
        java.lang.String str19 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber20 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber21 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(rationalNumber20);
        org.junit.Assert.assertNull(rationalNumber21);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        java.lang.String str15 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(rationalNumber16);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
        org.junit.Assert.assertNull(rationalNumber18);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: \n\t: hi!\t\thi!: \thi!: : \thi!: \thi!: ", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeSeconds;
        java.lang.String str16 = gpsInfo8.longitudeRef;
        java.lang.String str17 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber19 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber20 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(rationalNumber18);
        org.junit.Assert.assertNull(rationalNumber19);
        org.junit.Assert.assertNull(rationalNumber20);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        java.lang.String str12 = gpsInfo8.longitudeRef;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \n\thi!: ", "\thi!: \n\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        java.lang.String str14 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeSeconds;
        java.lang.String str16 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.longitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(rationalNumber17);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeDegrees;
        java.lang.String str13 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        java.lang.String str3 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem4 = null;
        tiffImageMetadata1.add(imageMetadataItem4);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem6 = null;
        tiffImageMetadata1.add(imageMetadataItem6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        java.lang.String str4 = tiffImageMetadata1.toString("\thi!: \n\thi!: ");
        java.lang.String str6 = tiffImageMetadata1.toString("hi!");
        tiffImageMetadata1.add("\thi!: \thi!: ", "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: ");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents10 = tiffImageMetadata1.contents;
        java.lang.String str11 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = tiffImageMetadata1.getFieldValue(tagInfoLongs12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(tiffContents10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: " + "'", str11, "\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: ");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        java.lang.String str3 = tiffImageMetadata1.toString();
        java.lang.String str5 = tiffImageMetadata1.toString("\thi!: \thi!: ");
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo6 = tiffImageMetadata1.getGpsInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet7 = tiffImageMetadata1.getOutputSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(gpsInfo6);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeMinutes;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: ", "\thi!: \thi!: \thi!: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        java.lang.String str3 = tiffImageMetadata1.toString();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList4 = tiffImageMetadata1.getAllFields();
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory6 = tiffImageMetadata1.findDirectory((int) (short) 0);
        java.lang.String str7 = tiffImageMetadata1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(tiffFieldList4);
        org.junit.Assert.assertNull(tiffDirectory6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!", "\thi!: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!", "\thi!: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\thi!: \thi!: \thi!: " + "'", str10, "\thi!: \thi!: \thi!: ");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: \thi!: ", "\thi!: \thi!: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        java.lang.String str3 = tiffImageMetadata1.toString();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList4 = tiffImageMetadata1.getAllFields();
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory6 = tiffImageMetadata1.findDirectory((int) (short) 0);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts7 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray8 = tiffImageMetadata1.getFieldValue(tagInfoShorts7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(tiffFieldList4);
        org.junit.Assert.assertNull(tiffDirectory6);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem4 = null;
        tiffImageMetadata1.add(imageMetadataItem4);
        tiffImageMetadata1.add("\thi!: \thi!: \thi!: ", "\t\thi!: \thi!: : \thi!: \thi!: \n\thi!\thi!: hi!: \thi!: \thi!: \thi!: hi!");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: hi!", "\thi!: \n\thi!: \n\t: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str3 = tiffImageMetadata1.toString("\thi!: ");
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList4 = tiffImageMetadata1.getAllFields();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts5 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray6 = tiffImageMetadata1.getFieldValue(tagInfoShorts5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(tiffFieldList4);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeMinutes;
        java.lang.String str10 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeDegrees;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: hi!", "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        java.lang.String str16 = gpsInfo8.longitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "\thi!: \n\thi!: hi!\n\t\thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: \thi!: hi!: \thi!: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber19 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
        org.junit.Assert.assertNull(rationalNumber18);
        org.junit.Assert.assertNull(rationalNumber19);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeDegrees;
        java.lang.String str13 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = tiffImageMetadata1.getFieldValue(tagInfo8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeSeconds;
        java.lang.String str14 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeMinutes;
        java.lang.String str16 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        java.lang.String str8 = tiffImageMetadata1.toString();
        java.lang.String str10 = tiffImageMetadata1.toString("hi!\thi!: hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = tiffImageMetadata1.getFieldValue(tagInfoXpString11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\thi!: \n\thi!: " + "'", str8, "\thi!: \n\thi!: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: " + "'", str10, "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\t\t\thi!: \n\thi!: : \thi!: \n\thi!: : \thi!: \thi!: \thi!: \n\t: hi!\t\thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: : \thi!: \n\thi!: ", "\thi!: \n\thi!: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeSeconds;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: ", "hi!\thi!: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        java.lang.String str10 = gpsInfo8.latitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("hi!", "\thi!: ");
        tiffImageMetadata1.add("\thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: ", "\thi!: \n\thi!: hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet10 = tiffImageMetadata1.getOutputSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: ", "\thi!: \thi!: \thi!: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: \thi!: ", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: ", "\thi!: \thi!: \thi!: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: ", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeMinutes;
        java.lang.String str10 = gpsInfo8.latitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\thi!: \thi!: \thi!: " + "'", str10, "\thi!: \thi!: \thi!: ");
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        java.lang.String str4 = tiffImageMetadata1.toString("\thi!: \n\thi!: ");
        java.lang.String str6 = tiffImageMetadata1.toString("hi!");
        tiffImageMetadata1.add("\thi!: hi!\n\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ", "\thi!: hi!\n\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs tagInfoSLongs10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = tiffImageMetadata1.getFieldValue(tagInfoSLongs10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: ", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeMinutes;
        java.lang.String str10 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\thi!: " + "'", str10, "\thi!: ");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \thi!: \nhi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \thi!: ", "\thi!: \thi!: \thi!: \n\t: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\thi!: \thi!: \thi!: \n\t: hi!" + "'", str9, "\thi!: \thi!: \thi!: \n\t: hi!");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("", "hi!");
        java.lang.String str11 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffField tiffField13 = tiffImageMetadata1.findField(tagInfo12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!: \n\thi!: \n\t: hi!" + "'", str11, "\thi!: \n\thi!: \n\t: hi!");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!\thi!: \n\thi!: hi!\thi!: hi!\t\thi!: \thi!: : \thi!: \thi!: \thi!: ", "\thi!: \thi!: \thi!: \n\t: hi!\t\thi!: \thi!: : \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!", "\thi!: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.longitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeSeconds;
        java.lang.String str17 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        java.lang.String str16 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.latitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(rationalNumber17);
        org.junit.Assert.assertNull(rationalNumber18);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.latitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        java.lang.String str11 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \n\thi!: hi!", "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \thi!: \nhi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\thi!: \n\thi!: hi!" + "'", str9, "\thi!: \n\thi!: hi!");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: ", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeSeconds;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \thi!: \nhi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \thi!: \t\thi!: : \thi!: \thi!: \thi!: ", "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.Class<?> wildcardClass9 = gpsInfo8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!", "\thi!: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        java.lang.String str4 = tiffImageMetadata1.toString("\thi!: \n\thi!: ");
        java.lang.String str6 = tiffImageMetadata1.toString("hi!");
        tiffImageMetadata1.add("\thi!: \thi!: ", "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: ");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents10 = tiffImageMetadata1.contents;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = tiffImageMetadata1.getFieldValue(tagInfo11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(tiffContents10);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: hi!", "\thi!: \n\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeDegrees;
        java.lang.String str14 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
        org.junit.Assert.assertNull(rationalNumber18);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("hi!", "\thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \thi!: \nhi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \thi!: \t\thi!: : \thi!: \thi!: \thi!: ", "\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: \thi!: \n\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: \thi!: hi!\n\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: \t: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem7 = null;
        tiffImageMetadata1.add(imageMetadataItem7);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem9 = null;
        tiffImageMetadata1.add(imageMetadataItem9);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffField tiffField13 = tiffImageMetadata1.findField(tagInfo11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: ", "\thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        java.lang.Class<?> wildcardClass11 = gpsInfo8.getClass();
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeSeconds;
        java.lang.String str16 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber19 = gpsInfo8.longitudeDegrees;
        java.lang.String str20 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(rationalNumber17);
        org.junit.Assert.assertNull(rationalNumber18);
        org.junit.Assert.assertNull(rationalNumber19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeMinutes;
        java.lang.String str17 = gpsInfo8.latitudeRef;
        java.lang.String str18 = gpsInfo8.latitudeRef;
        java.lang.String str19 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber20 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber21 = gpsInfo8.latitudeMinutes;
        java.lang.String str22 = gpsInfo8.longitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            double double23 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(rationalNumber20);
        org.junit.Assert.assertNull(rationalNumber21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory4 = tiffImageMetadata1.findDirectory((int) ' ');
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo5 = tiffImageMetadata1.getGpsInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffField tiffField7 = tiffImageMetadata1.findField(tagInfo6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(tiffDirectory4);
        org.junit.Assert.assertNull(gpsInfo5);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!\thi!: \n\thi!: hi!\thi!: hi!", "\thi!: hi!\n\t\thi!: \n\thi!: : ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        java.lang.String str15 = gpsInfo8.latitudeRef;
        java.lang.String str16 = gpsInfo8.latitudeRef;
        java.lang.String str17 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeMinutes;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = tiffImageMetadata1.getFieldValue(tagInfoGpsText7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "\thi!: \thi!: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        java.lang.String str8 = tiffImageMetadata1.toString();
        java.lang.String str9 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte10 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = tiffImageMetadata1.getFieldValue(tagInfoByte10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\thi!: \n\thi!: " + "'", str8, "\thi!: \n\thi!: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\thi!: \n\thi!: " + "'", str9, "\thi!: \n\thi!: ");
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \n\thi!: hi!\n\t\thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: \thi!: hi!: \thi!: hi!", "\thi!: hi!\n\t\thi!: \n\thi!: : ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: ", "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        java.lang.String str3 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents4 = tiffImageMetadata1.contents;
        tiffImageMetadata1.add("\t\thi!: \n\thi!: : \thi!: \n\thi!: ", "\t\thi!: \thi!: : \thi!: \thi!: \thi!: ");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory9 = tiffImageMetadata1.findDirectory((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem cannot be cast to class org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory (org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem and org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(tiffContents4);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeSeconds;
        java.lang.String str11 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: ", "hi!\thi!: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: ", "\thi!: \thi!: \thi!: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeDegrees;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem7 = null;
        tiffImageMetadata1.add(imageMetadataItem7);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem9 = null;
        tiffImageMetadata1.add(imageMetadataItem9);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem11 = null;
        tiffImageMetadata1.add(imageMetadataItem11);
        tiffImageMetadata1.add("\t\thi!: \thi!: : \thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: ", "\t\thi!: hi!\n\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: : \thi!: hi!\n\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: hi!\n\t\thi!: \n\thi!: : : \thi!: \thi!: \thi!: ");
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ", "\thi!: hi!\n\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        java.lang.String str13 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeDegrees;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents5 = tiffImageMetadata1.contents;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats tagInfoFloats6 = null;
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray7 = tiffImageMetadata1.getFieldValue(tagInfoFloats6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tiffContents5);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        java.lang.String str15 = gpsInfo8.latitudeRef;
        java.lang.String str16 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(rationalNumber17);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        java.lang.String str4 = tiffImageMetadata1.toString("\thi!: \n\thi!: ");
        java.lang.String str6 = tiffImageMetadata1.toString("hi!");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents7 = tiffImageMetadata1.contents;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray9 = tiffImageMetadata1.getFieldValue(tagInfoSRationals8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(tiffContents7);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeSeconds;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        java.lang.String str11 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: hi!", "\thi!: \thi!: \thi!: \n\t: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.Class<?> wildcardClass9 = gpsInfo8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        java.lang.String str15 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
        org.junit.Assert.assertNull(rationalNumber18);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        java.lang.String str4 = tiffImageMetadata1.toString("\thi!: \n\thi!: ");
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList5 = tiffImageMetadata1.getAllFields();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte6 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = tiffImageMetadata1.getFieldValue(tagInfoByte6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tiffFieldList5);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: hi!", "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.longitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: \n\t: hi!\t\thi!: \thi!: : \thi!: \thi!: ", "\thi!: \n\thi!: \n\t: hi!\t\thi!: \thi!: : \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!", "\thi!: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str3 = tiffImageMetadata1.toString("\thi!: ");
        tiffImageMetadata1.add("\thi!: \n\thi!: ", "\thi!: \thi!: ");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents7 = tiffImageMetadata1.contents;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory9 = tiffImageMetadata1.findDirectory((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem cannot be cast to class org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory (org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem and org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(tiffContents7);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!", "\thi!: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        java.lang.String str11 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!: hi!" + "'", str11, "\thi!: hi!");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber19 = gpsInfo8.latitudeDegrees;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
        org.junit.Assert.assertNull(rationalNumber18);
        org.junit.Assert.assertNull(rationalNumber19);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem7 = null;
        tiffImageMetadata1.add(imageMetadataItem7);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem9 = null;
        tiffImageMetadata1.add(imageMetadataItem9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo11 = tiffImageMetadata1.getGpsInfo();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        java.lang.String str16 = gpsInfo8.latitudeRef;
        java.lang.String str17 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        java.lang.String str13 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeDegrees;
        java.lang.String str15 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("\thi!: ", "hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = tiffImageMetadata1.getFieldValue(tagInfoGpsText11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: ", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\t\thi!: \thi!: : \thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: ", "\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: \thi!: \n\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: \thi!: hi!\n\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: \t: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\t\thi!: hi!\n\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: : \thi!: hi!\n\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ", "\thi!: hi!\thi!: \n\thi!: hi!\thi!: hi!\t\thi!: \thi!: : \thi!: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
        org.junit.Assert.assertNull(rationalNumber18);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: ", "\thi!: \thi!: \thi!: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!: \thi!: \thi!: hi!" + "'", str11, "\thi!: \thi!: \thi!: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\thi!: \thi!: " + "'", str12, "\thi!: \thi!: ");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: \n\t: hi!\t\thi!: \thi!: : \thi!: \thi!: ", "\thi!: \thi!: \thi!: \n\t: hi!\t\thi!: \thi!: : \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\t\thi!: hi!\n\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: : \thi!: hi!\n\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: hi!\n\t\thi!: \n\thi!: : : \thi!: \thi!: \thi!: ", "\t\thi!: \thi!: : \thi!: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeMinutes;
        java.lang.String str12 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        java.lang.String str15 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        java.lang.String str3 = tiffImageMetadata1.toString();
        java.lang.String str5 = tiffImageMetadata1.toString("\thi!: \thi!: ");
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo6 = tiffImageMetadata1.getGpsInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray8 = tiffImageMetadata1.getFieldValue(tagInfoSRationals7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(gpsInfo6);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("hi!", "\thi!: ");
        tiffImageMetadata1.add("\thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: ", "\thi!: \n\thi!: hi!");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem10 = null;
        tiffImageMetadata1.add(imageMetadataItem10);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray13 = tiffImageMetadata1.getFieldValue(tagInfoSRationals12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        java.lang.String str12 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeSeconds;
        java.lang.String str14 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!", "\thi!: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeSeconds;
        java.lang.String str13 = gpsInfo8.longitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\thi!: \thi!: \thi!: " + "'", str13, "\thi!: \thi!: \thi!: ");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\t: \thi!: hi!\thi!: hi!", "hi!\thi!: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \n\thi!: ", "\thi!\thi!: hi!: \thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: ", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        java.lang.String str11 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!: \thi!: \thi!: " + "'", str11, "\thi!: \thi!: \thi!: ");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("\thi!: ", "hi!");
        tiffImageMetadata1.add("\t\thi!: \n\thi!: : \thi!: \n\thi!: ", "\thi!: \thi!: \thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem14 = null;
        tiffImageMetadata1.add(imageMetadataItem14);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem16 = null;
        tiffImageMetadata1.add(imageMetadataItem16);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray19 = tiffImageMetadata1.getFieldValue(tagInfoRationals18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem7 = null;
        tiffImageMetadata1.add(imageMetadataItem7);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem9 = null;
        tiffImageMetadata1.add(imageMetadataItem9);
        tiffImageMetadata1.add("hi!", "\thi!: hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = tiffImageMetadata1.toString("\t: \thi!: hi!\thi!: hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeDegrees;
        java.lang.String str13 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: ", "\thi!: \n\thi!: hi!\t\thi!: \n\thi!: : \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!", "\thi!: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeMinutes;
        java.lang.Class<?> wildcardClass12 = gpsInfo8.getClass();
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("hi!", "\thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = tiffImageMetadata1.getFieldValue(tagInfoGpsText7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\t\thi!: \thi!: : \thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: ", "\t\thi!: \thi!: \thi!: hi!: \thi!: \thi!: \thi!: \n\t: hi!\t\thi!: \thi!: : \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeDegrees;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "\thi!: hi!\n\t\thi!: \n\thi!: : ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: \n\t: hi!\t\thi!: \thi!: : \thi!: \thi!: ", "\thi!: \n\thi!: \n\t: hi!\t\thi!: \thi!: : \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        java.lang.String str4 = tiffImageMetadata1.toString("\thi!: \n\thi!: ");
        java.lang.String str6 = tiffImageMetadata1.toString("hi!");
        tiffImageMetadata1.add("\thi!: \thi!: ", "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: ");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents10 = tiffImageMetadata1.contents;
        java.lang.String str11 = tiffImageMetadata1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo12 = tiffImageMetadata1.getGpsInfo();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem cannot be cast to class org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory (org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem and org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(tiffContents10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: " + "'", str11, "\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: ");
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("\thi!: ", "hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = tiffImageMetadata1.getFieldValue(tagInfoDoubles11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: hi!", "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\thi!: \thi!: \thi!: hi!" + "'", str9, "\thi!: \thi!: \thi!: hi!");
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeDegrees;
        java.lang.String str16 = gpsInfo8.latitudeRef;
        java.lang.String str17 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(rationalNumber18);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        java.lang.String str8 = tiffImageMetadata1.toString();
        java.lang.String str10 = tiffImageMetadata1.toString("hi!\thi!: hi!");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem11 = null;
        tiffImageMetadata1.add(imageMetadataItem11);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts13 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray14 = tiffImageMetadata1.getFieldValue(tagInfoSShorts13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\thi!: \n\thi!: " + "'", str8, "\thi!: \n\thi!: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: " + "'", str10, "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        java.lang.String str12 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeMinutes;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        java.lang.String str8 = tiffImageMetadata1.toString();
        java.lang.String str10 = tiffImageMetadata1.toString("hi!\thi!: hi!");
        java.lang.String str12 = tiffImageMetadata1.toString("hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = tiffImageMetadata1.getFieldValue(tagInfoDoubles13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\thi!: \n\thi!: " + "'", str8, "\thi!: \n\thi!: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: " + "'", str10, "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \thi!: \nhi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \thi!: " + "'", str12, "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \thi!: \nhi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \thi!: ");
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: hi!", "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeMinutes;
        java.lang.String str17 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.longitudeDegrees;
        java.lang.String str19 = gpsInfo8.latitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            double double20 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(rationalNumber18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        java.lang.String str14 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeSeconds;
        java.lang.String str16 = gpsInfo8.latitudeRef;
        java.lang.String str17 = gpsInfo8.longitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeSeconds;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeMinutes;
        java.lang.String str14 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: hi!", "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeMinutes;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        java.lang.String str14 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.latitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!", "\thi!: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeSeconds;
        java.lang.Class<?> wildcardClass10 = gpsInfo8.getClass();
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        java.lang.String str15 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(rationalNumber16);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!\thi!: hi!", "\t\thi!: hi!\n\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: : \thi!: hi!\n\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\thi!: hi!\thi!: hi!" + "'", str9, "\thi!: hi!\thi!: hi!");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        java.lang.String str4 = tiffImageMetadata1.toString("\thi!: \n\thi!: ");
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList5 = tiffImageMetadata1.getAllFields();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = tiffImageMetadata1.getFieldValue(tagInfoDoubles6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tiffFieldList5);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        java.lang.String str15 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
        org.junit.Assert.assertNull(rationalNumber18);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        java.lang.String str15 = gpsInfo8.latitudeRef;
        java.lang.String str16 = gpsInfo8.latitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.longitudeSeconds;
        java.lang.String str19 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
        org.junit.Assert.assertNull(rationalNumber18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeDegrees;
        java.lang.String str16 = gpsInfo8.latitudeRef;
        java.lang.String str17 = gpsInfo8.longitudeRef;
        java.lang.String str18 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: hi!", "\thi!: \thi!: \thi!: \n\t: hi!\t\thi!: \thi!: : \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\t\thi!: hi!\n\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: : \thi!: hi!\n\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: hi!\n\t\thi!: \n\thi!: : : \thi!: \thi!: \thi!: ", "\thi!: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeMinutes;
        java.lang.String str14 = gpsInfo8.longitudeRef;
        java.lang.String str15 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: hi!", "\thi!: \n\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        java.lang.String str14 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.longitudeDegrees;
        java.lang.Class<?> wildcardClass18 = gpsInfo8.getClass();
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!\n\t\thi!: \n\thi!: : ", "\thi!: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        java.lang.String str4 = tiffImageMetadata1.toString("\thi!: \n\thi!: ");
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList5 = tiffImageMetadata1.getAllFields();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts6 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray7 = tiffImageMetadata1.getFieldValue(tagInfoShorts6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tiffFieldList5);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \n\thi!: hi!", "\t\thi!: \thi!: : \thi!: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeDegrees;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: ", "\thi!: \thi!: \thi!: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeMinutes;
        java.lang.String str12 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \n\thi!: hi!\n\t\thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: \thi!: hi!: \thi!: hi!", "\t\thi!: \n\thi!: : \thi!: \n\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.Class<?> wildcardClass9 = gpsInfo8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeSeconds;
        java.lang.String str11 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \n\thi!: hi!", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber19 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
        org.junit.Assert.assertNull(rationalNumber18);
        org.junit.Assert.assertNull(rationalNumber19);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\t\thi!: \thi!: : \thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: ", "\thi!: \n\thi!: hi!\t\thi!: \n\thi!: : \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeSeconds;
        java.lang.String str11 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!\thi!: \n\thi!: hi!\thi!: hi!\t\thi!: \thi!: \thi!: hi!: \thi!: \thi!: \thi!: \n\t: hi!\t\thi!: \thi!: : \thi!: \thi!: ", "\t\t\thi!: \thi!: : \thi!: \thi!: \thi!: : \t\thi!: \thi!: : \thi!: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \n\thi!: hi!\t\thi!: \n\thi!: : \thi!: \thi!: ", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: hi!", "\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: \thi!: \n\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: \thi!: hi!\n\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: \t: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        java.lang.String str10 = gpsInfo8.latitudeRef;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ", "\thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents8 = tiffImageMetadata1.contents;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs tagInfoSLongs9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = tiffImageMetadata1.getFieldValue(tagInfoSLongs9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tiffContents8);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: ", "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: ", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = rationalNumber9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: ", "\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\thi!: \thi!: " + "'", str9, "\thi!: \thi!: ");
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: ", "hi!\thi!: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!\thi!: hi!" + "'", str9, "hi!\thi!: hi!");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!\thi!: hi!", "\t\thi!: \thi!: : \thi!: \thi!: \n\thi!\thi!: hi!: \thi!: \thi!: \thi!: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!", "\thi!: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        java.lang.Class<?> wildcardClass10 = gpsInfo8.getClass();
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        java.lang.String str15 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.longitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
        org.junit.Assert.assertNull(rationalNumber18);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        java.lang.String str4 = tiffImageMetadata1.toString("\thi!: \n\thi!: ");
        java.lang.String str6 = tiffImageMetadata1.toString("hi!");
        tiffImageMetadata1.add("\thi!: \thi!: ", "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: ");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents10 = tiffImageMetadata1.contents;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList11 = tiffImageMetadata1.getAllFields();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem cannot be cast to class org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory (org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem and org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(tiffContents10);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.latitudeDegrees;
        java.lang.String str19 = gpsInfo8.latitudeRef;
        java.lang.String str20 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
        org.junit.Assert.assertNull(rationalNumber18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("hi!", "\thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \n\thi!: hi!", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeDegrees;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.latitudeDegrees;
        java.lang.String str19 = gpsInfo8.latitudeRef;
        java.lang.String str20 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
        org.junit.Assert.assertNull(rationalNumber18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ", "\thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        java.lang.String str16 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.longitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(rationalNumber17);
        org.junit.Assert.assertNull(rationalNumber18);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeMinutes;
        java.lang.String str17 = gpsInfo8.latitudeRef;
        java.lang.String str18 = gpsInfo8.latitudeRef;
        java.lang.String str19 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber20 = gpsInfo8.longitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(rationalNumber20);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.longitudeRef;
        java.lang.String str14 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        java.lang.String str13 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeSeconds;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\t: \thi!: hi!", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeSeconds;
        java.lang.String str17 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        java.lang.String str11 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.longitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeDegrees;
        java.lang.String str14 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.latitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        java.lang.String str11 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeDegrees;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        java.lang.String str10 = gpsInfo8.latitudeRef;
        java.lang.Class<?> wildcardClass11 = gpsInfo8.getClass();
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        java.lang.String str15 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }
}

