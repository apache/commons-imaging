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
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) -1, (int) (short) 0, abstractFieldType2, 10L, (long) (byte) 10, byteArray16, byteOrder20, (int) ' ');
        int int23 = tiffField22.getSortHint();
        java.nio.ByteOrder byteOrder24 = tiffField22.getByteOrder();
        long long25 = tiffField22.getCount();
        int int26 = tiffField22.getDirectoryType();
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertNull(byteOrder24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType2, (long) (short) 100, (long) 52, byteArray16, byteOrder20, (int) (byte) 100);
        java.lang.String str23 = tiffField22.getTagName();
        int int24 = tiffField22.getTag();
        java.nio.ByteOrder byteOrder25 = tiffField22.getByteOrder();
        java.lang.String str26 = tiffField22.getDescriptionWithoutValue();
        long long27 = tiffField22.getCount();
        java.nio.ByteOrder byteOrder28 = tiffField22.getByteOrder();
        java.lang.String str29 = tiffField22.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            int int30 = tiffField22.getIntValueOrArraySum();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Unknown Tag (0x34)" + "'", str23, "Unknown Tag (0x34)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNull(byteOrder25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "52 (0x34: Unknown Tag): " + "'", str26, "52 (0x34: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertNull(byteOrder28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "52 (0x34: Unknown Tag): " + "'", str29, "52 (0x34: Unknown Tag): ");
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType2, (long) (short) -1, (long) (short) -1, byteArray16, byteOrder20, 1);
        long long23 = tiffField22.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType24 = tiffField22.getFieldType();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement27 = tiffField22.new OversizeValueElement(0, (int) (byte) 100);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo28 = tiffField22.getTagInfo();
        java.io.PrintWriter printWriter29 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField22.dump(printWriter29, "10 (0xa: GPSMeasureMode): ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertNull(abstractFieldType24);
        org.junit.Assert.assertNotNull(tagInfo28);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        long long18 = tiffField14.getCount();
        int int19 = tiffField14.getSortHint();
        java.nio.ByteOrder byteOrder20 = tiffField14.getByteOrder();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(byteOrder20);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 10, 10, abstractFieldType12, (long) 1, (long) (byte) 100, byteArray26, byteOrder30, 100);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField((-1), (int) (byte) 100, abstractFieldType7, 0L, 10L, byteArray26, byteOrder33, 97);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField((int) ' ', (int) (byte) 100, abstractFieldType2, 0L, (long) (short) 0, byteArray26, byteOrder36, 100);
        long long39 = tiffField38.getCount();
        java.lang.Class<?> wildcardClass40 = tiffField38.getClass();
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) -1, (int) (short) 0, abstractFieldType2, 10L, (long) (byte) 10, byteArray16, byteOrder20, (int) ' ');
        int int23 = tiffField22.getSortHint();
        java.nio.ByteOrder byteOrder24 = tiffField22.getByteOrder();
        int int25 = tiffField22.getOffset();
        int int26 = tiffField22.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo27 = tiffField22.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo28 = tiffField22.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            int int29 = tiffField22.getIntValueOrArraySum();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertNull(byteOrder24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(tagInfo27);
        org.junit.Assert.assertNotNull(tagInfo28);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getSortHint();
        long long16 = tiffField14.getCount();
        long long17 = tiffField14.getCount();
        java.lang.String str18 = tiffField14.getTagName();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType19 = tiffField14.getFieldType();
        int int20 = tiffField14.getDirectoryType();
        int int21 = tiffField14.getTag();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = tiffField14.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = tiffField14.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertNull(abstractFieldType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNull(abstractFieldType22);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        long long20 = tiffField14.getCount();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = tiffField14.getIntArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        java.nio.ByteOrder byteOrder20 = tiffField14.getByteOrder();
        java.nio.ByteOrder byteOrder21 = tiffField14.getByteOrder();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement22 = tiffField14.getOversizeValueElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNull(byteOrder20);
        org.junit.Assert.assertNull(byteOrder21);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType2, (long) (short) -1, (long) (short) -1, byteArray16, byteOrder20, 1);
        int int23 = tiffField22.getTag();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType24 = tiffField22.getFieldType();
        long long25 = tiffField22.getCount();
        int int26 = tiffField22.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo27 = tiffField22.getTagInfo();
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertNull(abstractFieldType24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(tagInfo27);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        long long18 = tiffField14.getCount();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = tiffField14.isLocalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        int int17 = tiffField14.getSortHint();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        long long19 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo20 = tiffField14.getTagInfo();
        int int21 = tiffField14.getTag();
        long long22 = tiffField14.getCount();
        int int23 = tiffField14.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = tiffField14.getValueDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(tagInfo20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = tiffField14.getFieldType();
        java.lang.String str18 = tiffField14.getDescriptionWithoutValue();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = tiffField14.getIntValueOrArraySum();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str18, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getDirectoryType();
        int int16 = tiffField14.getOffset();
        java.lang.String str17 = tiffField14.getTagName();
        long long18 = tiffField14.getCount();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Unknown Tag (0x61)" + "'", str17, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType2, (long) (short) 100, (long) 52, byteArray16, byteOrder20, (int) (byte) 100);
        java.lang.String str23 = tiffField22.getTagName();
        int int24 = tiffField22.getTag();
        java.nio.ByteOrder byteOrder25 = tiffField22.getByteOrder();
        long long26 = tiffField22.getCount();
        int int27 = tiffField22.getOffset();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType28 = tiffField22.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = tiffField22.getValueDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Unknown Tag (0x34)" + "'", str23, "Unknown Tag (0x34)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNull(byteOrder25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertNull(abstractFieldType28);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getDirectoryType();
        java.lang.String str16 = tiffField14.getDescriptionWithoutValue();
        int int17 = tiffField14.getSortHint();
        java.lang.String str18 = tiffField14.getTagName();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = tiffField14.getIntValueOrArraySum();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str16, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        int int17 = tiffField14.getSortHint();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        int int19 = tiffField14.getDirectoryType();
        long long20 = tiffField14.getCount();
        int int21 = tiffField14.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getSortHint();
        long long16 = tiffField14.getCount();
        long long17 = tiffField14.getCount();
        java.lang.String str18 = tiffField14.getTagName();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType19 = tiffField14.getFieldType();
        java.lang.String str20 = tiffField14.getDescriptionWithoutValue();
        java.nio.ByteOrder byteOrder21 = tiffField14.getByteOrder();
        int int22 = tiffField14.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = tiffField14.getStringValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertNull(abstractFieldType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str20, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertNull(byteOrder21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType17, (long) (short) -1, (long) (short) -1, byteArray31, byteOrder35, 1);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType12, (long) '4', (long) 1, byteArray31, byteOrder38, (int) (short) 100);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType7, (long) (byte) 100, (long) '#', byteArray31, byteOrder41, (int) (short) 1);
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 1, (-1), abstractFieldType2, (long) 100, 0L, byteArray31, byteOrder44, (int) (short) 0);
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement49 = tiffField46.new OversizeValueElement(100, (int) '#');
        java.nio.ByteOrder byteOrder50 = tiffField46.getByteOrder();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo51 = tiffField46.getTagInfo();
        int int52 = tiffField46.getDirectoryType();
        java.lang.String str53 = tiffField46.getTagName();
        // The following exception was thrown during execution in test generation
        try {
            long long54 = tiffField46.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNull(byteOrder50);
        org.junit.Assert.assertNotNull(tagInfo51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "InteroperabilityIndex" + "'", str53, "InteroperabilityIndex");
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) -1, (int) (short) 0, abstractFieldType2, 10L, (long) (byte) 10, byteArray16, byteOrder20, (int) ' ');
        int int23 = tiffField22.getSortHint();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo24 = tiffField22.getTagInfo();
        int int25 = tiffField22.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = tiffField22.getValueDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertNotNull(tagInfo24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        long long20 = tiffField14.getCount();
        java.lang.String str21 = tiffField14.getDescriptionWithoutValue();
        int int22 = tiffField14.getOffset();
        java.nio.ByteOrder byteOrder23 = tiffField14.getByteOrder();
        java.io.PrintWriter printWriter24 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump(printWriter24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str21, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNull(byteOrder23);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType20 = tiffField14.getFieldType();
        java.lang.String str21 = tiffField14.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            int int22 = tiffField14.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertNull(abstractFieldType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str21, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType27 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType32 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType37 = null;
        byte[] byteArray46 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder47 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField49 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType37, (long) 0, 10L, byteArray46, byteOrder47, (int) (byte) -1);
        java.nio.ByteOrder byteOrder50 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField52 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType32, (long) (short) -1, (long) (short) -1, byteArray46, byteOrder50, 1);
        java.nio.ByteOrder byteOrder53 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField55 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType27, (long) '4', (long) 1, byteArray46, byteOrder53, (int) (short) 100);
        java.nio.ByteOrder byteOrder56 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField58 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 0, 10, abstractFieldType22, (long) 35, (long) ' ', byteArray46, byteOrder56, (-1));
        java.nio.ByteOrder byteOrder59 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField61 = new org.apache.commons.imaging.formats.tiff.TiffField(0, (int) '4', abstractFieldType17, 0L, (long) 52, byteArray46, byteOrder59, 0);
        java.nio.ByteOrder byteOrder62 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField64 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 0, (int) (short) 1, abstractFieldType12, 97L, (long) 1, byteArray46, byteOrder62, (int) (short) 100);
        java.nio.ByteOrder byteOrder65 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField67 = new org.apache.commons.imaging.formats.tiff.TiffField(52, 0, abstractFieldType7, (long) 0, (long) (byte) 1, byteArray46, byteOrder65, 0);
        java.nio.ByteOrder byteOrder68 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField70 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) 10, (int) (byte) 10, abstractFieldType2, (long) 35, (long) (-1), byteArray46, byteOrder68, (int) (short) 1);
        java.io.PrintWriter printWriter71 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField70.dump(printWriter71, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement22 = tiffField14.new OversizeValueElement((int) (short) 0, (int) (byte) 100);
        java.lang.String str23 = tiffField14.getTagName();
        java.nio.ByteOrder byteOrder24 = tiffField14.getByteOrder();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement27 = tiffField14.new OversizeValueElement((int) '4', 97);
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType28 = tiffField14.getFieldType();
        long long29 = tiffField14.getCount();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray30 = tiffField14.getDoubleArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Unknown Tag (0x61)" + "'", str23, "Unknown Tag (0x61)");
        org.junit.Assert.assertNull(byteOrder24);
        org.junit.Assert.assertNull(abstractFieldType28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType27 = null;
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder37 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField39 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType27, (long) 0, 10L, byteArray36, byteOrder37, (int) (byte) -1);
        java.nio.ByteOrder byteOrder40 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField42 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType22, (long) (short) -1, (long) (short) -1, byteArray36, byteOrder40, 1);
        java.nio.ByteOrder byteOrder43 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField45 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType17, (long) '4', (long) 1, byteArray36, byteOrder43, (int) (short) 100);
        java.nio.ByteOrder byteOrder46 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField48 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType12, (long) (byte) 100, (long) '#', byteArray36, byteOrder46, (int) (short) 1);
        java.nio.ByteOrder byteOrder49 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField51 = new org.apache.commons.imaging.formats.tiff.TiffField(10, 97, abstractFieldType7, (long) '#', 0L, byteArray36, byteOrder49, (int) ' ');
        java.nio.ByteOrder byteOrder52 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField54 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 10, 0, abstractFieldType2, (long) 'a', (long) (byte) -1, byteArray36, byteOrder52, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long55 = tiffField54.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField(35, (int) (byte) 1, abstractFieldType12, (long) '#', (long) 1, byteArray26, byteOrder30, 1);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField(35, 52, abstractFieldType7, (long) (byte) 100, (long) 35, byteArray26, byteOrder33, 52);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) 0, 0, abstractFieldType2, (long) 35, 10L, byteArray26, byteOrder36, (int) (short) 1);
        java.lang.String str39 = tiffField38.getDescriptionWithoutValue();
        java.lang.String str40 = tiffField38.getTagName();
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "0 (0x0: Unknown Tag): " + "'", str39, "0 (0x0: Unknown Tag): ");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Unknown Tag (0x0)" + "'", str40, "Unknown Tag (0x0)");
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray5 = new byte[] {};
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField8 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) 10, (int) ' ', abstractFieldType2, (long) 97, (long) (short) 10, byteArray5, byteOrder6, (int) '#');
        java.nio.ByteOrder byteOrder9 = tiffField8.getByteOrder();
        java.nio.ByteOrder byteOrder10 = tiffField8.getByteOrder();
        java.nio.ByteOrder byteOrder11 = tiffField8.getByteOrder();
        java.lang.String str12 = tiffField8.getDescriptionWithoutValue();
        int int13 = tiffField8.getDirectoryType();
        int int14 = tiffField8.getDirectoryType();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNull(byteOrder9);
        org.junit.Assert.assertNull(byteOrder10);
        org.junit.Assert.assertNull(byteOrder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10 (0xa: Unknown Tag): " + "'", str12, "10 (0xa: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        java.nio.ByteOrder byteOrder19 = tiffField14.getByteOrder();
        int int20 = tiffField14.getDirectoryType();
        java.nio.ByteOrder byteOrder21 = tiffField14.getByteOrder();
        java.lang.String str22 = tiffField14.getDescriptionWithoutValue();
        int int23 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo24 = tiffField14.getTagInfo();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertNull(byteOrder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNull(byteOrder21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str22, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(tagInfo24);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) -1, (int) (short) 0, abstractFieldType2, 10L, (long) (byte) 10, byteArray16, byteOrder20, (int) ' ');
        int int23 = tiffField22.getSortHint();
        java.nio.ByteOrder byteOrder24 = tiffField22.getByteOrder();
        int int25 = tiffField22.getDirectoryType();
        int int26 = tiffField22.getDirectoryType();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType27 = tiffField22.getFieldType();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType28 = tiffField22.getFieldType();
        int int29 = tiffField22.getTag();
        // The following exception was thrown during execution in test generation
        try {
            long long30 = tiffField22.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertNull(byteOrder24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(abstractFieldType27);
        org.junit.Assert.assertNull(abstractFieldType28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        long long19 = tiffField14.getCount();
        java.nio.ByteOrder byteOrder20 = tiffField14.getByteOrder();
        int int21 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo22 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray23 = tiffField14.getDoubleArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNull(byteOrder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(tagInfo22);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType2, (long) (short) 100, (long) 52, byteArray16, byteOrder20, (int) (byte) 100);
        int int23 = tiffField22.getTag();
        int int24 = tiffField22.getSortHint();
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType2, (long) (short) 100, (long) 52, byteArray16, byteOrder20, (int) (byte) 100);
        java.lang.String str23 = tiffField22.getTagName();
        int int24 = tiffField22.getTag();
        java.nio.ByteOrder byteOrder25 = tiffField22.getByteOrder();
        long long26 = tiffField22.getCount();
        int int27 = tiffField22.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            int int28 = tiffField22.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Unknown Tag (0x34)" + "'", str23, "Unknown Tag (0x34)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNull(byteOrder25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = tiffField14.getFieldType();
        java.lang.String str18 = tiffField14.getDescriptionWithoutValue();
        java.lang.String str19 = tiffField14.getTagName();
        java.lang.String str20 = tiffField14.getTagName();
        int int21 = tiffField14.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            int int22 = tiffField14.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str18, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Unknown Tag (0x61)" + "'", str19, "Unknown Tag (0x61)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Unknown Tag (0x61)" + "'", str20, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) -1, (int) (short) 0, abstractFieldType2, 10L, (long) (byte) 10, byteArray16, byteOrder20, (int) ' ');
        int int23 = tiffField22.getSortHint();
        java.nio.ByteOrder byteOrder24 = tiffField22.getByteOrder();
        int int25 = tiffField22.getDirectoryType();
        java.io.PrintWriter printWriter26 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField22.dump(printWriter26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertNull(byteOrder24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        java.nio.ByteOrder byteOrder16 = tiffField14.getByteOrder();
        long long17 = tiffField14.getCount();
        int int18 = tiffField14.getDirectoryType();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo19 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement22 = tiffField14.new OversizeValueElement(1, (int) '#');
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement25 = tiffField14.new OversizeValueElement((int) (byte) 100, (int) (short) 10);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo26 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            long long27 = tiffField14.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertNull(byteOrder16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(tagInfo19);
        org.junit.Assert.assertNotNull(tagInfo26);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray22 = new byte[] { (byte) 0, (byte) 1 };
        java.nio.ByteOrder byteOrder23 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField25 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, 100, abstractFieldType17, 52L, 100L, byteArray22, byteOrder23, 1);
        java.nio.ByteOrder byteOrder26 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField28 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 10, (int) (byte) 100, abstractFieldType12, (long) '4', (long) 97, byteArray22, byteOrder26, 35);
        java.nio.ByteOrder byteOrder29 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField31 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '#', (int) (byte) -1, abstractFieldType7, 0L, (long) (-1), byteArray22, byteOrder29, (int) (short) 0);
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) 10, (int) (byte) 10, abstractFieldType2, 100L, 1L, byteArray22, byteOrder32, 100);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 0, (byte) 1 });
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        java.lang.String str20 = tiffField14.getTagName();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement23 = tiffField14.new OversizeValueElement((int) (short) 1, (int) (short) 1);
        int int24 = tiffField14.getOffset();
        java.nio.ByteOrder byteOrder25 = tiffField14.getByteOrder();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Unknown Tag (0x61)" + "'", str20, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNull(byteOrder25);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray5 = new byte[] {};
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField8 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) 10, (int) ' ', abstractFieldType2, (long) 97, (long) (short) 10, byteArray5, byteOrder6, (int) '#');
        java.nio.ByteOrder byteOrder9 = tiffField8.getByteOrder();
        java.nio.ByteOrder byteOrder10 = tiffField8.getByteOrder();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement13 = tiffField8.new OversizeValueElement((-1), 0);
        java.lang.String str14 = tiffField8.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = tiffField8.getValueDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNull(byteOrder9);
        org.junit.Assert.assertNull(byteOrder10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10 (0xa: Unknown Tag): " + "'", str14, "10 (0xa: Unknown Tag): ");
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement19 = tiffField14.new OversizeValueElement((int) (byte) 10, (-1));
        long long20 = oversizeValueElement19.offset;
        long long21 = oversizeValueElement19.offset;
        int int22 = oversizeValueElement19.length;
        int int23 = oversizeValueElement19.length;
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        java.nio.ByteOrder byteOrder16 = tiffField14.getByteOrder();
        long long17 = tiffField14.getCount();
        int int18 = tiffField14.getSortHint();
        int int19 = tiffField14.getSortHint();
        java.lang.Class<?> wildcardClass20 = tiffField14.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertNull(byteOrder16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        java.nio.ByteOrder byteOrder19 = tiffField14.getByteOrder();
        int int20 = tiffField14.getTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = tiffField14.getStringValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertNull(byteOrder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getDirectoryType();
        java.lang.String str16 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getSortHint();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement22 = tiffField14.new OversizeValueElement(35, (int) '#');
        java.io.PrintWriter printWriter23 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump(printWriter23, "Unknown Tag (0x0)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str16, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        int int17 = tiffField14.getSortHint();
        int int18 = tiffField14.getDirectoryType();
        java.lang.String str19 = tiffField14.getTagName();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo20 = tiffField14.getTagInfo();
        int int21 = tiffField14.getSortHint();
        int int22 = tiffField14.getSortHint();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Unknown Tag (0x61)" + "'", str19, "Unknown Tag (0x61)");
        org.junit.Assert.assertNotNull(tagInfo20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType17, (long) (short) -1, (long) (short) -1, byteArray31, byteOrder35, 1);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType12, (long) '4', (long) 1, byteArray31, byteOrder38, (int) (short) 100);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType7, (long) (byte) 100, (long) '#', byteArray31, byteOrder41, (int) (short) 1);
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 1, (-1), abstractFieldType2, (long) 100, 0L, byteArray31, byteOrder44, (int) (short) 0);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo47 = tiffField46.getTagInfo();
        int int48 = tiffField46.getDirectoryType();
        java.io.PrintWriter printWriter49 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField46.dump(printWriter49, "-1 (0xffffffff: Unknown Tag): ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType12, (long) (short) -1, (long) (short) -1, byteArray26, byteOrder30, 1);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField(10, (int) '#', abstractFieldType7, 0L, (long) (short) 0, byteArray26, byteOrder33, (int) '#');
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 100, 52, abstractFieldType2, (long) (byte) 10, (long) (short) 1, byteArray26, byteOrder36, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = tiffField38.getIntValueOrArraySum();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement21 = tiffField14.new OversizeValueElement(1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = tiffField14.getFieldTypeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getSortHint();
        long long16 = tiffField14.getCount();
        java.nio.ByteOrder byteOrder17 = tiffField14.getByteOrder();
        int int18 = tiffField14.getTag();
        int int19 = tiffField14.getTag();
        java.io.PrintWriter printWriter20 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump(printWriter20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(byteOrder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType27 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType32 = null;
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder42 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField44 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType32, (long) 0, 10L, byteArray41, byteOrder42, (int) (byte) -1);
        java.nio.ByteOrder byteOrder45 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField47 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType27, (long) (short) -1, (long) (short) -1, byteArray41, byteOrder45, 1);
        java.nio.ByteOrder byteOrder48 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField50 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType22, (long) '4', (long) 1, byteArray41, byteOrder48, (int) (short) 100);
        java.nio.ByteOrder byteOrder51 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField53 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 0, 10, abstractFieldType17, (long) 35, (long) ' ', byteArray41, byteOrder51, (-1));
        java.nio.ByteOrder byteOrder54 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField56 = new org.apache.commons.imaging.formats.tiff.TiffField(0, (int) '4', abstractFieldType12, 0L, (long) 52, byteArray41, byteOrder54, 0);
        java.nio.ByteOrder byteOrder57 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField59 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 0, (int) (short) 1, abstractFieldType7, 97L, (long) 1, byteArray41, byteOrder57, (int) (short) 100);
        java.nio.ByteOrder byteOrder60 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField62 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) 0, 10, abstractFieldType2, (long) 0, (-1L), byteArray41, byteOrder60, 32);
        java.lang.String str63 = tiffField62.getDescriptionWithoutValue();
        java.io.PrintWriter printWriter64 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField62.dump(printWriter64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "0 (0x0: Unknown Tag): " + "'", str63, "0 (0x0: Unknown Tag): ");
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        long long19 = tiffField14.getCount();
        java.nio.ByteOrder byteOrder20 = tiffField14.getByteOrder();
        int int21 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo22 = tiffField14.getTagInfo();
        java.io.PrintWriter printWriter23 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump(printWriter23, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNull(byteOrder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(tagInfo22);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        int int17 = tiffField14.getSortHint();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        java.lang.String str20 = tiffField14.getDescriptionWithoutValue();
        int int21 = tiffField14.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            int int22 = tiffField14.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str20, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getSortHint();
        long long16 = tiffField14.getCount();
        long long17 = tiffField14.getCount();
        java.lang.String str18 = tiffField14.getTagName();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType19 = tiffField14.getFieldType();
        java.lang.String str20 = tiffField14.getTagName();
        java.lang.String str21 = tiffField14.getDescriptionWithoutValue();
        java.lang.String str22 = tiffField14.getTagName();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertNull(abstractFieldType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Unknown Tag (0x61)" + "'", str20, "Unknown Tag (0x61)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str21, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Unknown Tag (0x61)" + "'", str22, "Unknown Tag (0x61)");
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = tiffField14.getFieldType();
        java.lang.String str18 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType19 = tiffField14.getFieldType();
        long long20 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo21 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = tiffField14.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = tiffField14.isLocalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str18, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertNull(abstractFieldType19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(tagInfo21);
        org.junit.Assert.assertNull(abstractFieldType22);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        java.lang.String str17 = tiffField14.getDescriptionWithoutValue();
        java.lang.String str18 = tiffField14.getTagName();
        long long19 = tiffField14.getCount();
        int int20 = tiffField14.getTag();
        int int21 = tiffField14.getSortHint();
        int int22 = tiffField14.getOffset();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str17, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType12, (long) (short) -1, (long) (short) -1, byteArray26, byteOrder30, 1);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType7, (long) '4', (long) 1, byteArray26, byteOrder33, (int) (short) 100);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 0, 10, abstractFieldType2, (long) 35, (long) ' ', byteArray26, byteOrder36, (-1));
        int int39 = tiffField38.getTag();
        long long40 = tiffField38.getCount();
        int int41 = tiffField38.getOffset();
        java.lang.String str42 = tiffField38.getDescriptionWithoutValue();
        int int43 = tiffField38.getOffset();
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 35L + "'", long40 == 35L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 32 + "'", int41 == 32);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "0 (0x0: Unknown Tag): " + "'", str42, "0 (0x0: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 32 + "'", int43 == 32);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        java.lang.String str16 = tiffField14.getTagName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement17 = tiffField14.getOversizeValueElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Unknown Tag (0x61)" + "'", str16, "Unknown Tag (0x61)");
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        java.nio.ByteOrder byteOrder16 = tiffField14.getByteOrder();
        long long17 = tiffField14.getCount();
        int int18 = tiffField14.getDirectoryType();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo19 = tiffField14.getTagInfo();
        int int20 = tiffField14.getOffset();
        int int21 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement24 = tiffField14.new OversizeValueElement((int) (byte) 1, (int) (short) 1);
        int int25 = tiffField14.getOffset();
        java.nio.ByteOrder byteOrder26 = tiffField14.getByteOrder();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertNull(byteOrder16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(tagInfo19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNull(byteOrder26);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType27 = null;
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder37 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField39 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType27, (long) 0, 10L, byteArray36, byteOrder37, (int) (byte) -1);
        java.nio.ByteOrder byteOrder40 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField42 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType22, (long) (short) -1, (long) (short) -1, byteArray36, byteOrder40, 1);
        java.nio.ByteOrder byteOrder43 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField45 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType17, (long) '4', (long) 1, byteArray36, byteOrder43, (int) (short) 100);
        java.nio.ByteOrder byteOrder46 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField48 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType12, (long) (byte) 100, (long) '#', byteArray36, byteOrder46, (int) (short) 1);
        java.nio.ByteOrder byteOrder49 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField51 = new org.apache.commons.imaging.formats.tiff.TiffField(10, 97, abstractFieldType7, (long) '#', 0L, byteArray36, byteOrder49, (int) ' ');
        java.nio.ByteOrder byteOrder52 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField54 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 10, 0, abstractFieldType2, (long) 'a', (long) (byte) -1, byteArray36, byteOrder52, 0);
        int int55 = tiffField54.getTag();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement58 = tiffField54.new OversizeValueElement(0, (int) (short) 10);
        java.lang.String str59 = tiffField54.getTagName();
        int int60 = tiffField54.getDirectoryType();
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Unknown Tag (0xa)" + "'", str59, "Unknown Tag (0xa)");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) -1, (int) (short) 0, abstractFieldType2, 10L, (long) (byte) 10, byteArray16, byteOrder20, (int) ' ');
        int int23 = tiffField22.getSortHint();
        java.nio.ByteOrder byteOrder24 = tiffField22.getByteOrder();
        int int25 = tiffField22.getDirectoryType();
        int int26 = tiffField22.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = tiffField22.getStringValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertNull(byteOrder24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 10, 10, abstractFieldType12, (long) 1, (long) (byte) 100, byteArray26, byteOrder30, 100);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField((-1), (int) (byte) 100, abstractFieldType7, 0L, 10L, byteArray26, byteOrder33, 97);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField((int) ' ', (int) (byte) 100, abstractFieldType2, 0L, (long) (short) 0, byteArray26, byteOrder36, 100);
        long long39 = tiffField38.getCount();
        long long40 = tiffField38.getCount();
        int int41 = tiffField38.getTag();
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 32 + "'", int41 == 32);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        java.nio.ByteOrder byteOrder19 = tiffField14.getByteOrder();
        int int20 = tiffField14.getDirectoryType();
        java.nio.ByteOrder byteOrder21 = tiffField14.getByteOrder();
        int int22 = tiffField14.getOffset();
        int int23 = tiffField14.getTag();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertNull(byteOrder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNull(byteOrder21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        long long20 = tiffField14.getCount();
        int int21 = tiffField14.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = tiffField14.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = tiffField14.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        int int16 = tiffField14.getOffset();
        int int17 = tiffField14.getTag();
        java.nio.ByteOrder byteOrder18 = tiffField14.getByteOrder();
        int int19 = tiffField14.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = tiffField14.getIntValueOrArraySum();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNull(byteOrder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement18 = tiffField14.new OversizeValueElement((-1), (int) (byte) 100);
        long long19 = oversizeValueElement18.offset;
        int int20 = oversizeValueElement18.length;
        int int21 = oversizeValueElement18.length;
        int int22 = oversizeValueElement18.length;
        long long23 = oversizeValueElement18.offset;
        int int24 = oversizeValueElement18.length;
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder22 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField24 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType12, (long) 0, 10L, byteArray21, byteOrder22, (int) (byte) -1);
        java.nio.ByteOrder byteOrder25 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField27 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType7, (long) (short) -1, (long) (short) -1, byteArray21, byteOrder25, 1);
        java.nio.ByteOrder byteOrder28 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField30 = new org.apache.commons.imaging.formats.tiff.TiffField(10, (int) '#', abstractFieldType2, 0L, (long) (short) 0, byteArray21, byteOrder28, (int) '#');
        int int31 = tiffField30.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = tiffField30.isLocalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        int int17 = tiffField14.getSortHint();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        int int19 = tiffField14.getDirectoryType();
        java.lang.String str20 = tiffField14.getTagName();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = tiffField14.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Unknown Tag (0x61)" + "'", str20, "Unknown Tag (0x61)");
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType19 = tiffField14.getFieldType();
        java.lang.String str20 = tiffField14.getTagName();
        java.io.PrintWriter printWriter21 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump(printWriter21, "97 (0x61: Unknown Tag): ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertNull(abstractFieldType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Unknown Tag (0x61)" + "'", str20, "Unknown Tag (0x61)");
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement21 = tiffField14.new OversizeValueElement(1, (int) 'a');
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement24 = tiffField14.new OversizeValueElement(35, (int) (short) -1);
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement27 = tiffField14.new OversizeValueElement(0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = tiffField14.getStringValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getDirectoryType();
        java.lang.String str16 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement19 = tiffField14.new OversizeValueElement((-1), (int) (byte) 100);
        java.lang.String str20 = tiffField14.getTagName();
        int int21 = tiffField14.getTag();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement24 = tiffField14.new OversizeValueElement((int) (byte) 100, 1);
        long long25 = oversizeValueElement24.offset;
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str16, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Unknown Tag (0x61)" + "'", str20, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder22 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField24 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType12, (long) 0, 10L, byteArray21, byteOrder22, (int) (byte) -1);
        java.nio.ByteOrder byteOrder25 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField27 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 10, 10, abstractFieldType7, (long) 1, (long) (byte) 100, byteArray21, byteOrder25, 100);
        java.nio.ByteOrder byteOrder28 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField30 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 0, abstractFieldType2, (long) (short) 100, (long) '4', byteArray21, byteOrder28, 0);
        int int31 = tiffField30.getOffset();
        int int32 = tiffField30.getOffset();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement35 = tiffField30.new OversizeValueElement((int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = tiffField14.getFieldType();
        java.lang.String str18 = tiffField14.getDescriptionWithoutValue();
        int int19 = tiffField14.getTag();
        int int20 = tiffField14.getOffset();
        long long21 = tiffField14.getCount();
        java.nio.ByteOrder byteOrder22 = tiffField14.getByteOrder();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = tiffField14.getValueDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str18, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNull(byteOrder22);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) -1, (int) (short) 0, abstractFieldType2, 10L, (long) (byte) 10, byteArray16, byteOrder20, (int) ' ');
        int int23 = tiffField22.getSortHint();
        java.nio.ByteOrder byteOrder24 = tiffField22.getByteOrder();
        long long25 = tiffField22.getCount();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = tiffField22.isLocalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertNull(byteOrder24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getSortHint();
        long long16 = tiffField14.getCount();
        long long17 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement20 = tiffField14.new OversizeValueElement((int) 'a', (int) (short) 1);
        java.lang.String str21 = tiffField14.getTagName();
        int int22 = tiffField14.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            int int23 = tiffField14.getIntValueOrArraySum();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Unknown Tag (0x61)" + "'", str21, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        java.nio.ByteOrder byteOrder16 = tiffField14.getByteOrder();
        long long17 = tiffField14.getCount();
        java.io.PrintWriter printWriter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump(printWriter18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertNull(byteOrder16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        java.lang.String str20 = tiffField14.getTagName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = tiffField14.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Unknown Tag (0x61)" + "'", str20, "Unknown Tag (0x61)");
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement21 = tiffField14.new OversizeValueElement(1, (int) 'a');
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement24 = tiffField14.new OversizeValueElement(35, (int) (short) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo25 = tiffField14.getTagInfo();
        int int26 = tiffField14.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = tiffField14.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertNotNull(tagInfo25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo20 = tiffField14.getTagInfo();
        int int21 = tiffField14.getTag();
        int int22 = tiffField14.getOffset();
        int int23 = tiffField14.getSortHint();
        java.lang.String str24 = tiffField14.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement25 = tiffField14.getOversizeValueElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertNotNull(tagInfo20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str24, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        int int17 = tiffField14.getSortHint();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType18 = tiffField14.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = tiffField14.getByteArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(abstractFieldType18);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType17, (long) (short) -1, (long) (short) -1, byteArray31, byteOrder35, 1);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType12, (long) '4', (long) 1, byteArray31, byteOrder38, (int) (short) 100);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType7, (long) (byte) 100, (long) '#', byteArray31, byteOrder41, (int) (short) 1);
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField(0, 35, abstractFieldType2, (long) 35, 97L, byteArray31, byteOrder44, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str47 = tiffField46.getFieldTypeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        long long20 = tiffField14.getCount();
        java.lang.String str21 = tiffField14.getDescriptionWithoutValue();
        int int22 = tiffField14.getSortHint();
        java.lang.String str23 = tiffField14.getTagName();
        java.lang.String str24 = tiffField14.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            int int25 = tiffField14.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str21, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Unknown Tag (0x61)" + "'", str23, "Unknown Tag (0x61)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str24, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        java.lang.String str17 = tiffField14.getDescriptionWithoutValue();
        int int18 = tiffField14.getTag();
        long long19 = tiffField14.getCount();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = tiffField14.isLocalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str17, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1 };
        java.nio.ByteOrder byteOrder8 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField10 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, 100, abstractFieldType2, 52L, 100L, byteArray7, byteOrder8, 1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo11 = tiffField10.getTagInfo();
        int int12 = tiffField10.getDirectoryType();
        int int13 = tiffField10.getDirectoryType();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType12, (long) (short) -1, (long) (short) -1, byteArray26, byteOrder30, 1);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField(97, (int) '#', abstractFieldType7, (long) ' ', (long) (byte) 10, byteArray26, byteOrder33, 100);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) -1, 10, abstractFieldType2, (long) (short) 100, (long) (byte) 100, byteArray26, byteOrder36, (int) (byte) 100);
        long long39 = tiffField38.getCount();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray40 = tiffField38.getDoubleArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 100L + "'", long39 == 100L);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getSortHint();
        long long16 = tiffField14.getCount();
        long long17 = tiffField14.getCount();
        java.lang.String str18 = tiffField14.getTagName();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType19 = tiffField14.getFieldType();
        java.lang.String str20 = tiffField14.getDescriptionWithoutValue();
        java.nio.ByteOrder byteOrder21 = tiffField14.getByteOrder();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = tiffField14.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            int int23 = tiffField14.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertNull(abstractFieldType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str20, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertNull(byteOrder21);
        org.junit.Assert.assertNull(abstractFieldType22);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType17, (long) (short) -1, (long) (short) -1, byteArray31, byteOrder35, 1);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType12, (long) '4', (long) 1, byteArray31, byteOrder38, (int) (short) 100);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 0, 10, abstractFieldType7, (long) 35, (long) ' ', byteArray31, byteOrder41, (-1));
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 100, abstractFieldType2, 35L, (long) (byte) 10, byteArray31, byteOrder44, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long47 = tiffField46.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType17, (long) (short) -1, (long) (short) -1, byteArray31, byteOrder35, 1);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType12, (long) '4', (long) 1, byteArray31, byteOrder38, (int) (short) 100);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 0, 10, abstractFieldType7, (long) 35, (long) ' ', byteArray31, byteOrder41, (-1));
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 10, (-1), abstractFieldType2, (long) 'a', (long) 52, byteArray31, byteOrder44, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int47 = tiffField46.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getDirectoryType();
        int int16 = tiffField14.getOffset();
        java.nio.ByteOrder byteOrder17 = tiffField14.getByteOrder();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(byteOrder17);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray5 = null;
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField8 = new org.apache.commons.imaging.formats.tiff.TiffField(32, (int) (byte) 1, abstractFieldType2, (long) (byte) 0, (long) 0, byteArray5, byteOrder6, (int) 'a');
        int int9 = tiffField8.getOffset();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getDirectoryType();
        java.lang.String str16 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = tiffField14.getStringValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str16, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType27 = null;
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder37 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField39 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType27, (long) 0, 10L, byteArray36, byteOrder37, (int) (byte) -1);
        java.nio.ByteOrder byteOrder40 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField42 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType22, (long) (short) -1, (long) (short) -1, byteArray36, byteOrder40, 1);
        java.nio.ByteOrder byteOrder43 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField45 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType17, (long) '4', (long) 1, byteArray36, byteOrder43, (int) (short) 100);
        java.nio.ByteOrder byteOrder46 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField48 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType12, (long) (byte) 100, (long) '#', byteArray36, byteOrder46, (int) (short) 1);
        java.nio.ByteOrder byteOrder49 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField51 = new org.apache.commons.imaging.formats.tiff.TiffField(10, 97, abstractFieldType7, (long) '#', 0L, byteArray36, byteOrder49, (int) ' ');
        java.nio.ByteOrder byteOrder52 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField54 = new org.apache.commons.imaging.formats.tiff.TiffField(0, 32, abstractFieldType2, (long) (short) -1, (long) 32, byteArray36, byteOrder52, (int) '#');
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType55 = tiffField54.getFieldType();
        int int56 = tiffField54.getSortHint();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo57 = tiffField54.getTagInfo();
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNull(abstractFieldType55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 35 + "'", int56 == 35);
        org.junit.Assert.assertNotNull(tagInfo57);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType2, (long) (short) 100, (long) 52, byteArray16, byteOrder20, (int) (byte) 100);
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement25 = tiffField22.new OversizeValueElement((int) (short) 10, 97);
        int int26 = tiffField22.getSortHint();
        java.lang.String str27 = tiffField22.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            int int28 = tiffField22.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "52 (0x34: Unknown Tag): " + "'", str27, "52 (0x34: Unknown Tag): ");
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 10, 10, abstractFieldType17, (long) 1, (long) (byte) 100, byteArray31, byteOrder35, 100);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 0, abstractFieldType12, (long) (short) 100, (long) '4', byteArray31, byteOrder38, 0);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField(0, (int) (byte) 0, abstractFieldType7, (long) 97, (long) 0, byteArray31, byteOrder41, 10);
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '#', (int) '#', abstractFieldType2, (long) (byte) 0, 97L, byteArray31, byteOrder44, (int) (short) -1);
        int int47 = tiffField46.getDirectoryType();
        java.io.PrintWriter printWriter48 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField46.dump(printWriter48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 35 + "'", int47 == 35);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement18 = tiffField14.new OversizeValueElement((-1), (int) (byte) 100);
        long long19 = oversizeValueElement18.offset;
        int int20 = oversizeValueElement18.length;
        int int21 = oversizeValueElement18.length;
        long long22 = oversizeValueElement18.offset;
        long long23 = oversizeValueElement18.offset;
        long long24 = oversizeValueElement18.offset;
        int int25 = oversizeValueElement18.length;
        int int26 = oversizeValueElement18.length;
        long long27 = oversizeValueElement18.offset;
        int int28 = oversizeValueElement18.length;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = oversizeValueElement18.getElementDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getSortHint();
        long long16 = tiffField14.getCount();
        java.nio.ByteOrder byteOrder17 = tiffField14.getByteOrder();
        int int18 = tiffField14.getTag();
        java.lang.String str19 = tiffField14.getTagName();
        java.lang.Class<?> wildcardClass20 = tiffField14.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(byteOrder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Unknown Tag (0x61)" + "'", str19, "Unknown Tag (0x61)");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType17, (long) (short) -1, (long) (short) -1, byteArray31, byteOrder35, 1);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType12, (long) '4', (long) 1, byteArray31, byteOrder38, (int) (short) 100);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType7, (long) (byte) 100, (long) '#', byteArray31, byteOrder41, (int) (short) 1);
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 1, (-1), abstractFieldType2, (long) 100, 0L, byteArray31, byteOrder44, (int) (short) 0);
        int int47 = tiffField46.getOffset();
        int int48 = tiffField46.getTag();
        int int49 = tiffField46.getSortHint();
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        int int20 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement23 = tiffField14.new OversizeValueElement((int) (short) 0, (int) (byte) 10);
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement26 = tiffField14.new OversizeValueElement((int) (short) -1, (int) 'a');
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo27 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo28 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            int int29 = tiffField14.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(tagInfo27);
        org.junit.Assert.assertNotNull(tagInfo28);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder22 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField24 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType12, (long) 0, 10L, byteArray21, byteOrder22, (int) (byte) -1);
        java.nio.ByteOrder byteOrder25 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField27 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType7, (long) (short) 100, (long) 52, byteArray21, byteOrder25, (int) (byte) 100);
        java.nio.ByteOrder byteOrder28 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField30 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) 10, 35, abstractFieldType2, (long) (short) 100, (long) (-1), byteArray21, byteOrder28, 32);
        java.lang.String str31 = tiffField30.getDescriptionWithoutValue();
        java.lang.String str32 = tiffField30.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            long long33 = tiffField30.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "10 (0xa: Unknown Tag): " + "'", str31, "10 (0xa: Unknown Tag): ");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "10 (0xa: Unknown Tag): " + "'", str32, "10 (0xa: Unknown Tag): ");
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        java.lang.String str17 = tiffField14.getDescriptionWithoutValue();
        int int18 = tiffField14.getTag();
        int int19 = tiffField14.getSortHint();
        int int20 = tiffField14.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = tiffField14.isLocalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str17, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType2, (long) (short) 100, (long) 52, byteArray16, byteOrder20, (int) (byte) 100);
        java.lang.String str23 = tiffField22.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = tiffField22.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "52 (0x34: Unknown Tag): " + "'", str23, "52 (0x34: Unknown Tag): ");
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType27 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType32 = null;
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder42 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField44 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType32, (long) 0, 10L, byteArray41, byteOrder42, (int) (byte) -1);
        java.nio.ByteOrder byteOrder45 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField47 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType27, (long) (short) 100, (long) 52, byteArray41, byteOrder45, (int) (byte) 100);
        java.nio.ByteOrder byteOrder48 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField50 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) (short) 0, abstractFieldType22, (long) (byte) 1, (long) (byte) 0, byteArray41, byteOrder48, (int) '4');
        java.nio.ByteOrder byteOrder51 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField53 = new org.apache.commons.imaging.formats.tiff.TiffField((-1), 32, abstractFieldType17, 0L, (long) (short) 100, byteArray41, byteOrder51, 35);
        java.nio.ByteOrder byteOrder54 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField56 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) 0, 32, abstractFieldType12, 0L, (long) (short) 1, byteArray41, byteOrder54, 100);
        java.nio.ByteOrder byteOrder57 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField59 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) 10, (int) (short) -1, abstractFieldType7, 0L, (long) 97, byteArray41, byteOrder57, (-1));
        java.nio.ByteOrder byteOrder60 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField62 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) 100, (int) (byte) 100, abstractFieldType2, (long) (byte) 10, (-1L), byteArray41, byteOrder60, 1);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        java.nio.ByteOrder byteOrder16 = tiffField14.getByteOrder();
        long long17 = tiffField14.getCount();
        java.lang.String str18 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo19 = tiffField14.getTagInfo();
        java.lang.String str20 = tiffField14.getTagName();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType21 = tiffField14.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = tiffField14.getFieldTypeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertNull(byteOrder16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str18, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertNotNull(tagInfo19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Unknown Tag (0x61)" + "'", str20, "Unknown Tag (0x61)");
        org.junit.Assert.assertNull(abstractFieldType21);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getSortHint();
        long long16 = tiffField14.getCount();
        long long17 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement20 = tiffField14.new OversizeValueElement((int) 'a', (int) (short) 1);
        java.lang.String str21 = tiffField14.getTagName();
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Unknown Tag (0x61)" + "'", str21, "Unknown Tag (0x61)");
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType17, (long) (short) -1, (long) (short) -1, byteArray31, byteOrder35, 1);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType12, (long) '4', (long) 1, byteArray31, byteOrder38, (int) (short) 100);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType7, (long) (byte) 100, (long) '#', byteArray31, byteOrder41, (int) (short) 1);
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 1, (-1), abstractFieldType2, (long) 100, 0L, byteArray31, byteOrder44, (int) (short) 0);
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement49 = tiffField46.new OversizeValueElement(100, (int) '#');
        java.nio.ByteOrder byteOrder50 = tiffField46.getByteOrder();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo51 = tiffField46.getTagInfo();
        int int52 = tiffField46.getDirectoryType();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType53 = tiffField46.getFieldType();
        java.nio.ByteOrder byteOrder54 = tiffField46.getByteOrder();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType55 = tiffField46.getFieldType();
        int int56 = tiffField46.getTag();
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNull(byteOrder50);
        org.junit.Assert.assertNotNull(tagInfo51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNull(abstractFieldType53);
        org.junit.Assert.assertNull(byteOrder54);
        org.junit.Assert.assertNull(abstractFieldType55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) -1, (int) (short) 0, abstractFieldType2, 10L, (long) (byte) 10, byteArray16, byteOrder20, (int) ' ');
        int int23 = tiffField22.getSortHint();
        java.nio.ByteOrder byteOrder24 = tiffField22.getByteOrder();
        long long25 = tiffField22.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType26 = tiffField22.getFieldType();
        java.nio.ByteOrder byteOrder27 = tiffField22.getByteOrder();
        java.lang.Class<?> wildcardClass28 = tiffField22.getClass();
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertNull(byteOrder24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertNull(abstractFieldType26);
        org.junit.Assert.assertNull(byteOrder27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType2, (long) (short) 100, (long) 52, byteArray16, byteOrder20, (int) (byte) 100);
        java.lang.String str23 = tiffField22.getTagName();
        int int24 = tiffField22.getTag();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement25 = tiffField22.getOversizeValueElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Unknown Tag (0x34)" + "'", str23, "Unknown Tag (0x34)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        java.nio.ByteOrder byteOrder20 = tiffField14.getByteOrder();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement23 = tiffField14.new OversizeValueElement(100, (int) (short) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo24 = tiffField14.getTagInfo();
        int int25 = tiffField14.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray26 = tiffField14.getLongArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNull(byteOrder20);
        org.junit.Assert.assertNotNull(tagInfo24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getSortHint();
        long long16 = tiffField14.getCount();
        long long17 = tiffField14.getCount();
        java.lang.String str18 = tiffField14.getTagName();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType19 = tiffField14.getFieldType();
        java.lang.String str20 = tiffField14.getTagName();
        java.lang.String str21 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo22 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = tiffField14.getIntArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertNull(abstractFieldType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Unknown Tag (0x61)" + "'", str20, "Unknown Tag (0x61)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str21, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertNotNull(tagInfo22);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) -1, (int) (short) 0, abstractFieldType2, 10L, (long) (byte) 10, byteArray16, byteOrder20, (int) ' ');
        int int23 = tiffField22.getSortHint();
        java.nio.ByteOrder byteOrder24 = tiffField22.getByteOrder();
        int int25 = tiffField22.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray26 = tiffField22.getDoubleArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertNull(byteOrder24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder22 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField24 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType12, (long) 0, 10L, byteArray21, byteOrder22, (int) (byte) -1);
        java.nio.ByteOrder byteOrder25 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField27 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType7, (long) (short) 100, (long) 52, byteArray21, byteOrder25, (int) (byte) 100);
        java.nio.ByteOrder byteOrder28 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField30 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) 10, 35, abstractFieldType2, (long) (short) 100, (long) (-1), byteArray21, byteOrder28, 32);
        java.lang.String str31 = tiffField30.getDescriptionWithoutValue();
        int int32 = tiffField30.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray33 = tiffField30.getIntArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "10 (0xa: Unknown Tag): " + "'", str31, "10 (0xa: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getDirectoryType();
        java.lang.String str16 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        java.lang.String str20 = tiffField14.getTagName();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = tiffField14.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str16, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Unknown Tag (0x61)" + "'", str20, "Unknown Tag (0x61)");
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        java.nio.ByteOrder byteOrder16 = tiffField14.getByteOrder();
        long long17 = tiffField14.getCount();
        int int18 = tiffField14.getDirectoryType();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo19 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement22 = tiffField14.new OversizeValueElement(1, (int) '#');
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement25 = tiffField14.new OversizeValueElement((int) (byte) 100, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = oversizeValueElement25.getElementDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertNull(byteOrder16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(tagInfo19);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1 };
        java.nio.ByteOrder byteOrder8 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField10 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, 100, abstractFieldType2, 52L, 100L, byteArray7, byteOrder8, 1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo11 = tiffField10.getTagInfo();
        java.lang.String str12 = tiffField10.getDescriptionWithoutValue();
        int int13 = tiffField10.getOffset();
        int int14 = tiffField10.getTag();
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField10.dump(printWriter15, "InteroperabilityIndex");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 (0xffffffff: Unknown Tag): " + "'", str12, "-1 (0xffffffff: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType12, (long) (short) -1, (long) (short) -1, byteArray26, byteOrder30, 1);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType7, (long) '4', (long) 1, byteArray26, byteOrder33, (int) (short) 100);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 0, 10, abstractFieldType2, (long) 35, (long) ' ', byteArray26, byteOrder36, (-1));
        int int39 = tiffField38.getSortHint();
        int int40 = tiffField38.getTag();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo41 = tiffField38.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            long long42 = tiffField38.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(tagInfo41);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement19 = tiffField14.new OversizeValueElement((int) (short) -1, (int) (short) 10);
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType20 = tiffField14.getFieldType();
        int int21 = tiffField14.getTag();
        java.nio.ByteOrder byteOrder22 = tiffField14.getByteOrder();
        // The following exception was thrown during execution in test generation
        try {
            int int23 = tiffField14.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNull(byteOrder22);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray5 = null;
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField8 = new org.apache.commons.imaging.formats.tiff.TiffField(35, 97, abstractFieldType2, (long) (short) -1, (long) 0, byteArray5, byteOrder6, 32);
        java.lang.Class<?> wildcardClass9 = tiffField8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = tiffField14.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(tagInfo18);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        int int17 = tiffField14.getSortHint();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        java.lang.String str20 = tiffField14.getDescriptionWithoutValue();
        int int21 = tiffField14.getDirectoryType();
        int int22 = tiffField14.getSortHint();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement25 = tiffField14.new OversizeValueElement((int) (short) 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = oversizeValueElement25.getElementDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str20, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField(35, (int) (byte) 1, abstractFieldType17, (long) '#', (long) 1, byteArray31, byteOrder35, 1);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField(35, 52, abstractFieldType12, (long) (byte) 100, (long) 35, byteArray31, byteOrder38, 52);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) (short) 100, abstractFieldType7, (long) 100, (long) 52, byteArray31, byteOrder41, (int) (byte) 10);
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField(35, 0, abstractFieldType2, (long) (byte) 100, 52L, byteArray31, byteOrder44, (int) (short) 0);
        int int47 = tiffField46.getSortHint();
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getDirectoryType();
        java.lang.String str16 = tiffField14.getDescriptionWithoutValue();
        long long17 = tiffField14.getCount();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement18 = tiffField14.getOversizeValueElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str16, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 10, 10, abstractFieldType12, (long) 1, (long) (byte) 100, byteArray26, byteOrder30, 100);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) -1, (int) (byte) 100, abstractFieldType7, (long) 10, (long) (-1), byteArray26, byteOrder33, 0);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField(10, (-1), abstractFieldType2, (long) (short) 100, (long) (short) 10, byteArray26, byteOrder36, 0);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo39 = tiffField38.getTagInfo();
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo39);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType19 = tiffField14.getFieldType();
        java.lang.String str20 = tiffField14.getTagName();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = tiffField14.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertNull(abstractFieldType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Unknown Tag (0x61)" + "'", str20, "Unknown Tag (0x61)");
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType2, (long) (short) -1, (long) (short) -1, byteArray16, byteOrder20, 1);
        int int23 = tiffField22.getTag();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType24 = tiffField22.getFieldType();
        java.io.PrintWriter printWriter25 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField22.dump(printWriter25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertNull(abstractFieldType24);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray5 = new byte[] {};
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField8 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) 10, (int) ' ', abstractFieldType2, (long) 97, (long) (short) 10, byteArray5, byteOrder6, (int) '#');
        java.nio.ByteOrder byteOrder9 = tiffField8.getByteOrder();
        java.nio.ByteOrder byteOrder10 = tiffField8.getByteOrder();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement13 = tiffField8.new OversizeValueElement((-1), 0);
        long long14 = tiffField8.getCount();
        java.lang.Class<?> wildcardClass15 = tiffField8.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNull(byteOrder9);
        org.junit.Assert.assertNull(byteOrder10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = tiffField14.getFieldType();
        java.lang.String str18 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType19 = tiffField14.getFieldType();
        int int20 = tiffField14.getDirectoryType();
        java.lang.String str21 = tiffField14.getDescriptionWithoutValue();
        java.io.PrintWriter printWriter22 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump(printWriter22, "Unknown Tag (0x23)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str18, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertNull(abstractFieldType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str21, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = tiffField14.getFieldType();
        java.lang.String str18 = tiffField14.getDescriptionWithoutValue();
        java.lang.String str19 = tiffField14.getTagName();
        long long20 = tiffField14.getCount();
        int int21 = tiffField14.getOffset();
        int int22 = tiffField14.getDirectoryType();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str18, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Unknown Tag (0x61)" + "'", str19, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getDirectoryType();
        java.lang.String str16 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement20 = tiffField14.new OversizeValueElement((-1), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = tiffField14.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str16, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertNotNull(tagInfo17);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 10, 10, abstractFieldType17, (long) 1, (long) (byte) 100, byteArray31, byteOrder35, 100);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 0, abstractFieldType12, (long) (short) 100, (long) '4', byteArray31, byteOrder38, 0);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) -1, (int) (byte) -1, abstractFieldType7, (long) (short) 100, 0L, byteArray31, byteOrder41, 1);
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 1, (int) ' ', abstractFieldType2, (long) (byte) -1, (long) (short) 10, byteArray31, byteOrder44, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean47 = tiffField46.isLocalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        java.nio.ByteOrder byteOrder19 = tiffField14.getByteOrder();
        int int20 = tiffField14.getDirectoryType();
        java.nio.ByteOrder byteOrder21 = tiffField14.getByteOrder();
        java.lang.String str22 = tiffField14.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            int int23 = tiffField14.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertNull(byteOrder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNull(byteOrder21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str22, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement19 = tiffField14.new OversizeValueElement((int) (short) -1, (int) (short) 10);
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType20 = tiffField14.getFieldType();
        int int21 = tiffField14.getTag();
        java.nio.ByteOrder byteOrder22 = tiffField14.getByteOrder();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = tiffField14.getFieldTypeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNull(byteOrder22);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        int int16 = tiffField14.getDirectoryType();
        int int17 = tiffField14.getDirectoryType();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        int int19 = tiffField14.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = tiffField14.getIntArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getSortHint();
        long long16 = tiffField14.getCount();
        java.nio.ByteOrder byteOrder17 = tiffField14.getByteOrder();
        int int18 = tiffField14.getTag();
        java.lang.String str19 = tiffField14.getTagName();
        java.lang.String str20 = tiffField14.getTagName();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(byteOrder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Unknown Tag (0x61)" + "'", str19, "Unknown Tag (0x61)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Unknown Tag (0x61)" + "'", str20, "Unknown Tag (0x61)");
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo20 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType21 = tiffField14.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = tiffField14.getFieldTypeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertNotNull(tagInfo20);
        org.junit.Assert.assertNull(abstractFieldType21);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1 };
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) '#', abstractFieldType12, (long) (byte) -1, 1L, byteArray19, byteOrder20, (int) (byte) 0);
        java.nio.ByteOrder byteOrder23 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField25 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 1, (int) (short) 100, abstractFieldType7, (long) (short) 100, (long) (short) 0, byteArray19, byteOrder23, (int) (short) -1);
        java.nio.ByteOrder byteOrder26 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField28 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 97, abstractFieldType2, (long) (short) 100, 0L, byteArray19, byteOrder26, (int) (short) 100);
        long long29 = tiffField28.getCount();
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 100L + "'", long29 == 100L);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1 };
        java.nio.ByteOrder byteOrder10 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField12 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) '#', abstractFieldType2, (long) (byte) -1, 1L, byteArray9, byteOrder10, (int) (byte) 0);
        int int13 = tiffField12.getTag();
        long long14 = tiffField12.getCount();
        java.lang.String str15 = tiffField12.getDescriptionWithoutValue();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1 (0xffffffff: Unknown Tag): " + "'", str15, "-1 (0xffffffff: Unknown Tag): ");
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getDirectoryType();
        java.lang.String str16 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement19 = tiffField14.new OversizeValueElement((-1), (int) (byte) 100);
        java.lang.String str20 = tiffField14.getTagName();
        java.lang.String str21 = tiffField14.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement22 = tiffField14.getOversizeValueElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str16, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Unknown Tag (0x61)" + "'", str20, "Unknown Tag (0x61)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str21, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 10 };
        java.nio.ByteOrder byteOrder15 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField17 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, 97, abstractFieldType7, (long) (short) 100, 32L, byteArray14, byteOrder15, (int) (byte) 100);
        java.nio.ByteOrder byteOrder18 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField20 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 100, (int) (short) 100, abstractFieldType2, (long) 1, (long) (short) -1, byteArray14, byteOrder18, 100);
        int int21 = tiffField20.getSortHint();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = tiffField20.getFieldType();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement25 = tiffField20.new OversizeValueElement(35, 97);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNull(abstractFieldType22);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement22 = tiffField14.new OversizeValueElement(32, (int) ' ');
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement25 = tiffField14.new OversizeValueElement((int) (short) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = tiffField14.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType2, (long) (short) 100, (long) 52, byteArray16, byteOrder20, (int) (byte) 100);
        int int23 = tiffField22.getTag();
        long long24 = tiffField22.getCount();
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType19 = tiffField14.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray20 = tiffField14.getDoubleArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertNull(abstractFieldType19);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType19 = tiffField14.getFieldType();
        java.lang.String str20 = tiffField14.getTagName();
        long long21 = tiffField14.getCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = tiffField14.getFieldTypeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertNull(abstractFieldType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Unknown Tag (0x61)" + "'", str20, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType17, (long) (short) -1, (long) (short) -1, byteArray31, byteOrder35, 1);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType12, (long) '4', (long) 1, byteArray31, byteOrder38, (int) (short) 100);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType7, (long) (byte) 100, (long) '#', byteArray31, byteOrder41, (int) (short) 1);
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 1, (-1), abstractFieldType2, (long) 100, 0L, byteArray31, byteOrder44, (int) (short) 0);
        int int47 = tiffField46.getOffset();
        int int48 = tiffField46.getDirectoryType();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement51 = tiffField46.new OversizeValueElement((int) '#', 0);
        int int52 = oversizeValueElement51.length;
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        int int20 = tiffField14.getOffset();
        int int21 = tiffField14.getTag();
        int int22 = tiffField14.getDirectoryType();
        java.lang.String str23 = tiffField14.getTagName();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = tiffField14.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Unknown Tag (0x61)" + "'", str23, "Unknown Tag (0x61)");
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 10, 10, abstractFieldType12, (long) 1, (long) (byte) 100, byteArray26, byteOrder30, 100);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField((-1), (int) (byte) 100, abstractFieldType7, 0L, 10L, byteArray26, byteOrder33, 97);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField((int) ' ', (int) (byte) 100, abstractFieldType2, 0L, (long) (short) 0, byteArray26, byteOrder36, 100);
        long long39 = tiffField38.getCount();
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray40 = tiffField38.getLongArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        java.nio.ByteOrder byteOrder16 = tiffField14.getByteOrder();
        long long17 = tiffField14.getCount();
        int int18 = tiffField14.getDirectoryType();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo19 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement22 = tiffField14.new OversizeValueElement(1, (int) '#');
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement25 = tiffField14.new OversizeValueElement((int) (byte) 100, (int) (short) 10);
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement28 = tiffField14.new OversizeValueElement((-1), (int) (short) 100);
        java.lang.String str29 = tiffField14.getDescriptionWithoutValue();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertNull(byteOrder16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(tagInfo19);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str29, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        java.nio.ByteOrder byteOrder20 = tiffField14.getByteOrder();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement23 = tiffField14.new OversizeValueElement(100, (int) (short) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo24 = tiffField14.getTagInfo();
        java.lang.String str25 = tiffField14.getTagName();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType26 = tiffField14.getFieldType();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNull(byteOrder20);
        org.junit.Assert.assertNotNull(tagInfo24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown Tag (0x61)" + "'", str25, "Unknown Tag (0x61)");
        org.junit.Assert.assertNull(abstractFieldType26);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = tiffField14.getFieldType();
        java.lang.String str18 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType19 = tiffField14.getFieldType();
        int int20 = tiffField14.getDirectoryType();
        java.lang.String str21 = tiffField14.getDescriptionWithoutValue();
        java.lang.String str22 = tiffField14.getTagName();
        long long23 = tiffField14.getCount();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str18, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertNull(abstractFieldType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str21, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Unknown Tag (0x61)" + "'", str22, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField(35, (int) (byte) 1, abstractFieldType12, (long) '#', (long) 1, byteArray26, byteOrder30, 1);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField(35, 52, abstractFieldType7, (long) (byte) 100, (long) 35, byteArray26, byteOrder33, 52);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) 0, 0, abstractFieldType2, (long) 35, 10L, byteArray26, byteOrder36, (int) (short) 1);
        java.lang.String str39 = tiffField38.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo40 = tiffField38.getTagInfo();
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "0 (0x0: Unknown Tag): " + "'", str39, "0 (0x0: Unknown Tag): ");
        org.junit.Assert.assertNotNull(tagInfo40);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 10, 10, abstractFieldType12, (long) 1, (long) (byte) 100, byteArray26, byteOrder30, 100);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 0, abstractFieldType7, (long) (short) 100, (long) '4', byteArray26, byteOrder33, 0);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField(0, (int) (byte) 0, abstractFieldType2, (long) 97, (long) 0, byteArray26, byteOrder36, 10);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo39 = tiffField38.getTagInfo();
        java.io.PrintWriter printWriter40 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField38.dump(printWriter40, "Unknown Tag (0x0)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo39);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) -1, (int) (short) 0, abstractFieldType2, 10L, (long) (byte) 10, byteArray16, byteOrder20, (int) ' ');
        int int23 = tiffField22.getSortHint();
        java.nio.ByteOrder byteOrder24 = tiffField22.getByteOrder();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = tiffField22.getFieldTypeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertNull(byteOrder24);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType17, (long) (short) -1, (long) (short) -1, byteArray31, byteOrder35, 1);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType12, (long) '4', (long) 1, byteArray31, byteOrder38, (int) (short) 100);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 0, 10, abstractFieldType7, (long) 35, (long) ' ', byteArray31, byteOrder41, (-1));
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (-1), abstractFieldType2, (long) 0, (long) (byte) 0, byteArray31, byteOrder44, 0);
        java.lang.Class<?> wildcardClass47 = byteArray31.getClass();
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray5 = null;
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField8 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) 100, 0, abstractFieldType2, 97L, (long) (byte) 0, byteArray5, byteOrder6, (int) (short) 10);
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField8.dump(printWriter9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 10, 10, abstractFieldType17, (long) 1, (long) (byte) 100, byteArray31, byteOrder35, 100);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) -1, (int) (byte) 100, abstractFieldType12, (long) 10, (long) (-1), byteArray31, byteOrder38, 0);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField(10, (-1), abstractFieldType7, (long) (short) 100, (long) (short) 10, byteArray31, byteOrder41, 0);
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField(10, 0, abstractFieldType2, 52L, (long) '4', byteArray31, byteOrder44, 1);
        java.lang.String str47 = tiffField46.getTagName();
        long long48 = tiffField46.getCount();
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Unknown Tag (0xa)" + "'", str47, "Unknown Tag (0xa)");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 52L + "'", long48 == 52L);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = tiffField14.getFieldType();
        java.lang.String str18 = tiffField14.getDescriptionWithoutValue();
        java.lang.String str19 = tiffField14.getTagName();
        int int20 = tiffField14.getOffset();
        java.lang.String str21 = tiffField14.getTagName();
        int int22 = tiffField14.getSortHint();
        long long23 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement26 = tiffField14.new OversizeValueElement((int) (short) 10, 0);
        long long27 = tiffField14.getCount();
        long long28 = tiffField14.getCount();
        java.lang.String str29 = tiffField14.getDescriptionWithoutValue();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str18, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Unknown Tag (0x61)" + "'", str19, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Unknown Tag (0x61)" + "'", str21, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str29, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType27 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType32 = null;
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder42 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField44 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType32, (long) 0, 10L, byteArray41, byteOrder42, (int) (byte) -1);
        java.nio.ByteOrder byteOrder45 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField47 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType27, (long) (short) 100, (long) 52, byteArray41, byteOrder45, (int) (byte) 100);
        java.nio.ByteOrder byteOrder48 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField50 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) (short) 0, abstractFieldType22, (long) (byte) 1, (long) (byte) 0, byteArray41, byteOrder48, (int) '4');
        java.nio.ByteOrder byteOrder51 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField53 = new org.apache.commons.imaging.formats.tiff.TiffField((-1), 32, abstractFieldType17, 0L, (long) (short) 100, byteArray41, byteOrder51, 35);
        java.nio.ByteOrder byteOrder54 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField56 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) 0, 32, abstractFieldType12, 0L, (long) (short) 1, byteArray41, byteOrder54, 100);
        java.nio.ByteOrder byteOrder57 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField59 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 97, abstractFieldType7, (long) 32, 0L, byteArray41, byteOrder57, (int) (byte) 10);
        java.nio.ByteOrder byteOrder60 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField62 = new org.apache.commons.imaging.formats.tiff.TiffField(0, 0, abstractFieldType2, (long) (short) 100, 35L, byteArray41, byteOrder60, 100);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        java.lang.String str20 = tiffField14.getDescriptionWithoutValue();
        int int21 = tiffField14.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = tiffField14.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str20, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        java.lang.String str17 = tiffField14.getDescriptionWithoutValue();
        java.nio.ByteOrder byteOrder18 = tiffField14.getByteOrder();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        int int20 = tiffField14.getTag();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str17, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertNull(byteOrder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        int int17 = tiffField14.getTag();
        int int18 = tiffField14.getOffset();
        int int19 = tiffField14.getTag();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder22 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField24 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType12, (long) 0, 10L, byteArray21, byteOrder22, (int) (byte) -1);
        java.nio.ByteOrder byteOrder25 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField27 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType7, (long) (short) 100, (long) 52, byteArray21, byteOrder25, (int) (byte) 100);
        java.nio.ByteOrder byteOrder28 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField30 = new org.apache.commons.imaging.formats.tiff.TiffField(0, (int) (byte) 1, abstractFieldType2, (long) 35, (long) 1, byteArray21, byteOrder28, 100);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType2, (long) (short) -1, (long) (short) -1, byteArray16, byteOrder20, 1);
        int int23 = tiffField22.getTag();
        java.nio.ByteOrder byteOrder24 = tiffField22.getByteOrder();
        int int25 = tiffField22.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            long long26 = tiffField22.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertNull(byteOrder24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        int int20 = tiffField14.getOffset();
        int int21 = tiffField14.getTag();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement24 = tiffField14.new OversizeValueElement(35, 52);
        long long25 = oversizeValueElement24.offset;
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 35L + "'", long25 == 35L);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder22 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField24 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType12, (long) 0, 10L, byteArray21, byteOrder22, (int) (byte) -1);
        java.nio.ByteOrder byteOrder25 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField27 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType7, (long) (short) -1, (long) (short) -1, byteArray21, byteOrder25, 1);
        java.nio.ByteOrder byteOrder28 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField30 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType2, (long) '4', (long) 1, byteArray21, byteOrder28, (int) (short) 100);
        long long31 = tiffField30.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType32 = tiffField30.getFieldType();
        int int33 = tiffField30.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = tiffField30.getStringValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 52L + "'", long31 == 52L);
        org.junit.Assert.assertNull(abstractFieldType32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) -1, (int) (short) 0, abstractFieldType2, 10L, (long) (byte) 10, byteArray16, byteOrder20, (int) ' ');
        int int23 = tiffField22.getSortHint();
        java.nio.ByteOrder byteOrder24 = tiffField22.getByteOrder();
        int int25 = tiffField22.getTag();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType26 = tiffField22.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = tiffField22.isLocalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertNull(byteOrder24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(abstractFieldType26);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType16 = tiffField14.getFieldType();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertNull(abstractFieldType16);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType12, (long) (short) -1, (long) (short) -1, byteArray26, byteOrder30, 1);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType7, (long) '4', (long) 1, byteArray26, byteOrder33, (int) (short) 100);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType2, (long) (byte) 100, (long) '#', byteArray26, byteOrder36, (int) (short) 1);
        int int39 = tiffField38.getTag();
        java.lang.String str40 = tiffField38.getDescriptionWithoutValue();
        int int41 = tiffField38.getDirectoryType();
        int int42 = tiffField38.getSortHint();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo43 = tiffField38.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            int int44 = tiffField38.getIntValueOrArraySum();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "-1 (0xffffffff: Unknown Tag): " + "'", str40, "-1 (0xffffffff: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(tagInfo43);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = tiffField14.getFieldType();
        java.lang.String str18 = tiffField14.getDescriptionWithoutValue();
        int int19 = tiffField14.getTag();
        int int20 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement23 = tiffField14.new OversizeValueElement((int) (short) 1, (int) (short) 1);
        int int24 = tiffField14.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            int int25 = tiffField14.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str18, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType12, (long) (short) 100, (long) 52, byteArray26, byteOrder30, (int) (byte) 100);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) (short) 0, abstractFieldType7, (long) (byte) 1, (long) (byte) 0, byteArray26, byteOrder33, (int) '4');
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 1, 52, abstractFieldType2, (long) 0, (long) 32, byteArray26, byteOrder36, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement39 = tiffField38.getOversizeValueElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType27 = null;
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder37 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField39 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType27, (long) 0, 10L, byteArray36, byteOrder37, (int) (byte) -1);
        java.nio.ByteOrder byteOrder40 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField42 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType22, (long) (short) -1, (long) (short) -1, byteArray36, byteOrder40, 1);
        java.nio.ByteOrder byteOrder43 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField45 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType17, (long) '4', (long) 1, byteArray36, byteOrder43, (int) (short) 100);
        java.nio.ByteOrder byteOrder46 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField48 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType12, (long) (byte) 100, (long) '#', byteArray36, byteOrder46, (int) (short) 1);
        java.nio.ByteOrder byteOrder49 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField51 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 1, (-1), abstractFieldType7, (long) 100, 0L, byteArray36, byteOrder49, (int) (short) 0);
        java.nio.ByteOrder byteOrder52 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField54 = new org.apache.commons.imaging.formats.tiff.TiffField(97, (int) (byte) 0, abstractFieldType2, (long) (short) 100, 1L, byteArray36, byteOrder52, (int) (short) 100);
        int int55 = tiffField54.getOffset();
        int int56 = tiffField54.getDirectoryType();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType57 = tiffField54.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement58 = tiffField54.getOversizeValueElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNull(abstractFieldType57);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = tiffField14.getFieldType();
        java.lang.String str18 = tiffField14.getTagName();
        java.nio.ByteOrder byteOrder19 = tiffField14.getByteOrder();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = tiffField14.getValueDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertNull(byteOrder19);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        long long16 = tiffField14.getCount();
        int int17 = tiffField14.getTag();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        int int19 = tiffField14.getDirectoryType();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        long long20 = tiffField14.getCount();
        java.lang.String str21 = tiffField14.getDescriptionWithoutValue();
        int int22 = tiffField14.getOffset();
        int int23 = tiffField14.getTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = tiffField14.getFieldTypeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str21, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement19 = tiffField14.new OversizeValueElement((int) (short) -1, (int) (short) 10);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo20 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = tiffField14.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(tagInfo20);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType12, (long) (short) -1, (long) (short) -1, byteArray26, byteOrder30, 1);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField(97, (int) '#', abstractFieldType7, (long) ' ', (long) (byte) 10, byteArray26, byteOrder33, 100);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) -1, 10, abstractFieldType2, (long) (short) 100, (long) (byte) 100, byteArray26, byteOrder36, (int) (byte) 100);
        int int39 = tiffField38.getTag();
        int int40 = tiffField38.getTag();
        int int41 = tiffField38.getDirectoryType();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType42 = tiffField38.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray43 = tiffField38.getIntArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertNull(abstractFieldType42);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 10, 10, abstractFieldType12, (long) 1, (long) (byte) 100, byteArray26, byteOrder30, 100);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) -1, (int) (byte) 100, abstractFieldType7, (long) 10, (long) (-1), byteArray26, byteOrder33, 0);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField(10, (-1), abstractFieldType2, (long) (short) 100, (long) (short) 10, byteArray26, byteOrder36, 0);
        int int39 = tiffField38.getTag();
        int int40 = tiffField38.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            tiffField38.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType12, (long) (short) -1, (long) (short) -1, byteArray26, byteOrder30, 1);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType7, (long) '4', (long) 1, byteArray26, byteOrder33, (int) (short) 100);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType2, (long) (byte) 100, (long) '#', byteArray26, byteOrder36, (int) (short) 1);
        int int39 = tiffField38.getTag();
        java.lang.String str40 = tiffField38.getDescriptionWithoutValue();
        int int41 = tiffField38.getDirectoryType();
        int int42 = tiffField38.getSortHint();
        int int43 = tiffField38.getOffset();
        int int44 = tiffField38.getTag();
        // The following exception was thrown during execution in test generation
        try {
            int int45 = tiffField38.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "-1 (0xffffffff: Unknown Tag): " + "'", str40, "-1 (0xffffffff: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 35 + "'", int43 == 35);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        int int20 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement23 = tiffField14.new OversizeValueElement((int) (short) 0, (int) (byte) 10);
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement26 = tiffField14.new OversizeValueElement((int) (short) -1, (int) 'a');
        long long27 = oversizeValueElement26.offset;
        int int28 = oversizeValueElement26.length;
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        int int17 = tiffField14.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = tiffField14.getIntArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        java.nio.ByteOrder byteOrder19 = tiffField14.getByteOrder();
        long long20 = tiffField14.getCount();
        int int21 = tiffField14.getTag();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo22 = tiffField14.getTagInfo();
        int int23 = tiffField14.getDirectoryType();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertNull(byteOrder19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNotNull(tagInfo22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder22 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField24 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType12, (long) 0, 10L, byteArray21, byteOrder22, (int) (byte) -1);
        java.nio.ByteOrder byteOrder25 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField27 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 10, 10, abstractFieldType7, (long) 1, (long) (byte) 100, byteArray21, byteOrder25, 100);
        java.nio.ByteOrder byteOrder28 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField30 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 0, abstractFieldType2, (long) (short) 100, (long) '4', byteArray21, byteOrder28, 0);
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement33 = tiffField30.new OversizeValueElement((int) (byte) 1, (int) (byte) 10);
        java.lang.String str34 = tiffField30.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            int int35 = tiffField30.getIntValueOrArraySum();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "52 (0x34: Unknown Tag): " + "'", str34, "52 (0x34: Unknown Tag): ");
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType20 = tiffField14.getFieldType();
        long long21 = tiffField14.getCount();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNull(abstractFieldType20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType12, (long) (short) -1, (long) (short) -1, byteArray26, byteOrder30, 1);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType7, (long) '4', (long) 1, byteArray26, byteOrder33, (int) (short) 100);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType2, (long) (byte) 100, (long) '#', byteArray26, byteOrder36, (int) (short) 1);
        long long39 = tiffField38.getCount();
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 100L + "'", long39 == 100L);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType27 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType32 = null;
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder42 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField44 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType32, (long) 0, 10L, byteArray41, byteOrder42, (int) (byte) -1);
        java.nio.ByteOrder byteOrder45 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField47 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType27, (long) (short) -1, (long) (short) -1, byteArray41, byteOrder45, 1);
        java.nio.ByteOrder byteOrder48 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField50 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType22, (long) '4', (long) 1, byteArray41, byteOrder48, (int) (short) 100);
        java.nio.ByteOrder byteOrder51 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField53 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType17, (long) (byte) 100, (long) '#', byteArray41, byteOrder51, (int) (short) 1);
        java.nio.ByteOrder byteOrder54 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField56 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 1, (-1), abstractFieldType12, (long) 100, 0L, byteArray41, byteOrder54, (int) (short) 0);
        java.nio.ByteOrder byteOrder57 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField59 = new org.apache.commons.imaging.formats.tiff.TiffField(97, (int) (byte) 0, abstractFieldType7, (long) (short) 100, 1L, byteArray41, byteOrder57, (int) (short) 100);
        java.nio.ByteOrder byteOrder60 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField62 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) -1, (int) (byte) 0, abstractFieldType2, (long) (-1), (long) '4', byteArray41, byteOrder60, (int) '#');
        java.lang.String str63 = tiffField62.getTagName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str64 = tiffField62.getValueDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Unknown Tag (0xffffffff)" + "'", str63, "Unknown Tag (0xffffffff)");
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        long long19 = tiffField14.getCount();
        long long20 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType21 = tiffField14.getFieldType();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement24 = tiffField14.new OversizeValueElement((int) '#', 97);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = tiffField14.getValueDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNull(abstractFieldType21);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getDirectoryType();
        java.lang.String str16 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement19 = tiffField14.new OversizeValueElement((-1), (int) (byte) 100);
        java.lang.String str20 = tiffField14.getTagName();
        int int21 = tiffField14.getTag();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement24 = tiffField14.new OversizeValueElement((int) (byte) 100, 1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo25 = tiffField14.getTagInfo();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str16, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Unknown Tag (0x61)" + "'", str20, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNotNull(tagInfo25);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder22 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField24 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType12, (long) 0, 10L, byteArray21, byteOrder22, (int) (byte) -1);
        java.nio.ByteOrder byteOrder25 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField27 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType7, (long) (short) 100, (long) 52, byteArray21, byteOrder25, (int) (byte) 100);
        java.nio.ByteOrder byteOrder28 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField30 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) (short) 0, abstractFieldType2, (long) (byte) 1, (long) (byte) 0, byteArray21, byteOrder28, (int) '4');
        java.nio.ByteOrder byteOrder31 = tiffField30.getByteOrder();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray32 = tiffField30.getIntArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNull(byteOrder31);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        long long20 = tiffField14.getCount();
        java.lang.String str21 = tiffField14.getDescriptionWithoutValue();
        int int22 = tiffField14.getSortHint();
        java.lang.String str23 = tiffField14.getTagName();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray24 = tiffField14.getByteArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str21, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Unknown Tag (0x61)" + "'", str23, "Unknown Tag (0x61)");
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement19 = tiffField14.new OversizeValueElement((int) (byte) 10, (-1));
        long long20 = oversizeValueElement19.offset;
        long long21 = oversizeValueElement19.offset;
        int int22 = oversizeValueElement19.length;
        long long23 = oversizeValueElement19.offset;
        int int24 = oversizeValueElement19.length;
        int int25 = oversizeValueElement19.length;
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType17, (long) (short) 100, (long) 52, byteArray31, byteOrder35, (int) (byte) 100);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) 10, 35, abstractFieldType12, (long) (short) 100, (long) (-1), byteArray31, byteOrder38, 32);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField(0, 52, abstractFieldType7, (long) '#', (long) 32, byteArray31, byteOrder41, (int) (byte) 10);
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField((-1), (int) 'a', abstractFieldType2, (long) (byte) 1, 32L, byteArray31, byteOrder44, (int) '#');
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 10, 10, abstractFieldType12, (long) 1, (long) (byte) 100, byteArray26, byteOrder30, 100);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField((-1), (int) (byte) 100, abstractFieldType7, 0L, 10L, byteArray26, byteOrder33, 97);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField((int) ' ', (int) (byte) 100, abstractFieldType2, 0L, (long) (short) 0, byteArray26, byteOrder36, 100);
        long long39 = tiffField38.getCount();
        long long40 = tiffField38.getCount();
        java.io.PrintWriter printWriter41 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField38.dump(printWriter41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType27 = null;
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder37 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField39 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType27, (long) 0, 10L, byteArray36, byteOrder37, (int) (byte) -1);
        java.nio.ByteOrder byteOrder40 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField42 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType22, (long) (short) -1, (long) (short) -1, byteArray36, byteOrder40, 1);
        java.nio.ByteOrder byteOrder43 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField45 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType17, (long) '4', (long) 1, byteArray36, byteOrder43, (int) (short) 100);
        java.nio.ByteOrder byteOrder46 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField48 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType12, (long) (byte) 100, (long) '#', byteArray36, byteOrder46, (int) (short) 1);
        java.nio.ByteOrder byteOrder49 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField51 = new org.apache.commons.imaging.formats.tiff.TiffField(10, 97, abstractFieldType7, (long) '#', 0L, byteArray36, byteOrder49, (int) ' ');
        java.nio.ByteOrder byteOrder52 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField54 = new org.apache.commons.imaging.formats.tiff.TiffField(0, 32, abstractFieldType2, (long) (short) -1, (long) 32, byteArray36, byteOrder52, (int) '#');
        long long55 = tiffField54.getCount();
        java.nio.ByteOrder byteOrder56 = tiffField54.getByteOrder();
        java.lang.String str57 = tiffField54.getTagName();
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
        org.junit.Assert.assertNull(byteOrder56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Unknown Tag (0x0)" + "'", str57, "Unknown Tag (0x0)");
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement22 = tiffField14.new OversizeValueElement((int) (short) 0, (int) (byte) 100);
        java.lang.String str23 = tiffField14.getTagName();
        java.nio.ByteOrder byteOrder24 = tiffField14.getByteOrder();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement27 = tiffField14.new OversizeValueElement((int) '4', 97);
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType28 = tiffField14.getFieldType();
        int int29 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo30 = tiffField14.getTagInfo();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Unknown Tag (0x61)" + "'", str23, "Unknown Tag (0x61)");
        org.junit.Assert.assertNull(byteOrder24);
        org.junit.Assert.assertNull(abstractFieldType28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(tagInfo30);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType20 = tiffField14.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = tiffField14.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertNull(abstractFieldType20);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getSortHint();
        long long16 = tiffField14.getCount();
        long long17 = tiffField14.getCount();
        int int18 = tiffField14.getTag();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }
}

