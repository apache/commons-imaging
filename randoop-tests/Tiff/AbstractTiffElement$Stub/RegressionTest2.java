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
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(35L, (int) (short) 100);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 35, length: 100, last: 135" + "'", str4, "Element, offset: 35, length: 100, last: 135");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 35, (int) (byte) 10);
        int int3 = stub2.length;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 35, length: 10, last: 45" + "'", str5, "Element, offset: 35, length: 10, last: 45");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        int int8 = stub2.length;
        int int9 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        long long6 = stub2.offset;
        int int7 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) -1, (int) (byte) 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str3, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', (int) (short) 10);
        int int3 = stub2.length;
        long long4 = stub2.offset;
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (-1), (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 100, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: -1, last: 99" + "'", str3, "Element, offset: 100, length: -1, last: 99");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 100, length: -1, last: 99" + "'", str4, "Element, offset: 100, length: -1, last: 99");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 97, 32);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 97, length: 32, last: 129" + "'", str3, "Element, offset: 97, length: 32, last: 129");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (-1));
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: -1, last: 0" + "'", str3, "Element, offset: 1, length: -1, last: 0");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        int int3 = stub2.length;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) (byte) 10);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str3, "Element, offset: 1, length: 10, last: 11");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str4, "Element, offset: 1, length: 10, last: 11");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        int int8 = stub2.length;
        java.lang.String str9 = stub2.getElementDescription();
        int int10 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str5, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str9, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(52L, (int) '4');
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 52, length: 52, last: 104" + "'", str3, "Element, offset: 52, length: 52, last: 104");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 0, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), (int) (byte) -1);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        int int9 = stub2.length;
        java.lang.String str10 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str3, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str4, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str5, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str6, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str7, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str10, "Element, offset: 32, length: 100, last: 132");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', 1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 97, length: 1, last: 98" + "'", str4, "Element, offset: 97, length: 1, last: 98");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', 1);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 97, length: 1, last: 98" + "'", str5, "Element, offset: 97, length: 1, last: 98");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 97, length: 1, last: 98" + "'", str6, "Element, offset: 97, length: 1, last: 98");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 97, length: 1, last: 98" + "'", str8, "Element, offset: 97, length: 1, last: 98");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 0, (int) '4');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 52, last: 52" + "'", str3, "Element, offset: 0, length: 52, last: 52");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 52, last: 52" + "'", str4, "Element, offset: 0, length: 52, last: 52");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 52, last: 52" + "'", str5, "Element, offset: 0, length: 52, last: 52");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', (int) (short) 100);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str3, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, (int) (byte) 1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 100, length: 1, last: 101" + "'", str4, "Element, offset: 100, length: 1, last: 101");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        int int8 = stub2.length;
        long long9 = stub2.offset;
        int int10 = stub2.length;
        long long11 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str6, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (-1), (int) (short) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        long long9 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str3, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str4, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str7, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(97L, (int) (short) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        int int6 = stub2.length;
        int int7 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 97, length: -1, last: 96" + "'", str3, "Element, offset: 97, length: -1, last: 96");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 97, length: -1, last: 96" + "'", str4, "Element, offset: 97, length: -1, last: 96");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (-1), (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str3, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', 0);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        int int8 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 0, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str4, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str5, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str6, "Element, offset: 0, length: 0, last: 0");
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 0, 97);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 97, last: 97" + "'", str4, "Element, offset: 0, length: 97, last: 97");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, (int) ' ');
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        int int8 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str4, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str7, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, 10);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 100, length: 10, last: 110" + "'", str4, "Element, offset: 100, length: 10, last: 110");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) '#');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 35, last: 35" + "'", str3, "Element, offset: 0, length: 35, last: 35");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, 32);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str3, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str5, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str6, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str8, "Element, offset: 10, length: 32, last: 42");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, 97);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 97, last: 98" + "'", str3, "Element, offset: 1, length: 97, last: 98");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) '#');
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 35, last: 35" + "'", str3, "Element, offset: 0, length: 35, last: 35");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, 100);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 100, last: 110" + "'", str4, "Element, offset: 10, length: 100, last: 110");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) ' ');
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str5, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(32L, 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 1, last: 33" + "'", str3, "Element, offset: 32, length: 1, last: 33");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 1, last: 33" + "'", str4, "Element, offset: 32, length: 1, last: 33");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 1, last: 33" + "'", str5, "Element, offset: 32, length: 1, last: 33");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 32, length: 1, last: 33" + "'", str6, "Element, offset: 32, length: 1, last: 33");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 32, length: 1, last: 33" + "'", str7, "Element, offset: 32, length: 1, last: 33");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 10, 97);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 100, (int) (byte) 0);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        java.lang.String str11 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass12 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str10, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str11, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 0, (int) (short) 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str4, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str6, "Element, offset: 0, length: 0, last: 0");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 1, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: -1, last: 0" + "'", str3, "Element, offset: 1, length: -1, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: -1, last: 0" + "'", str4, "Element, offset: 1, length: -1, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: -1, last: 0" + "'", str5, "Element, offset: 1, length: -1, last: 0");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(35L, (int) (short) 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 35, length: 100, last: 135" + "'", str3, "Element, offset: 35, length: 100, last: 135");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 35, length: 100, last: 135" + "'", str4, "Element, offset: 35, length: 100, last: 135");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        long long8 = stub2.offset;
        java.lang.String str9 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str5, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str6, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str9, "Element, offset: 0, length: -1, last: -1");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 100, last: 100" + "'", str3, "Element, offset: 0, length: 100, last: 100");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 100, last: 100" + "'", str4, "Element, offset: 0, length: 100, last: 100");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: 100, last: 100" + "'", str7, "Element, offset: 0, length: 100, last: 100");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 10, 0);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, (int) (byte) 1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 1, last: 2" + "'", str4, "Element, offset: 1, length: 1, last: 2");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass8 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str6, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str7, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', (-1));
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: -1, last: 31" + "'", str3, "Element, offset: 32, length: -1, last: 31");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: -1, last: 31" + "'", str4, "Element, offset: 32, length: -1, last: 31");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        int int10 = stub2.length;
        int int11 = stub2.length;
        java.lang.String str12 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str12, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, 52);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str4, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str5, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', (-1));
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: -1, last: 31" + "'", str3, "Element, offset: 32, length: -1, last: 31");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: -1, last: 31" + "'", str4, "Element, offset: 32, length: -1, last: 31");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: -1, last: 31" + "'", str5, "Element, offset: 32, length: -1, last: 31");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) -1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        int int8 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str7, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), (int) (short) 1);
        long long3 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 35);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 35, last: 45" + "'", str3, "Element, offset: 10, length: 35, last: 45");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', (int) 'a');
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 35, length: 97, last: 132" + "'", str3, "Element, offset: 35, length: 97, last: 132");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass9 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        int int8 = stub2.length;
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass10 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str7, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str9, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 100, 100);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 100, last: 200" + "'", str3, "Element, offset: 100, length: 100, last: 200");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 0, (int) '4');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        int int6 = stub2.length;
        long long7 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 52, last: 52" + "'", str3, "Element, offset: 0, length: 52, last: 52");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 52, last: 52" + "'", str4, "Element, offset: 0, length: 52, last: 52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 0, last: 32" + "'", str3, "Element, offset: 32, length: 0, last: 32");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 0, last: 32" + "'", str5, "Element, offset: 32, length: 0, last: 32");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) ' ');
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str6, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 1, (int) ' ');
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        long long6 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 0, last: 32" + "'", str3, "Element, offset: 32, length: 0, last: 32");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', (-1));
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: -1, last: 31" + "'", str4, "Element, offset: 32, length: -1, last: 31");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, 32);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        long long5 = stub2.offset;
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str3, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str7, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 0, (int) (byte) 1);
        int int3 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 1, last: 101" + "'", str3, "Element, offset: 100, length: 1, last: 101");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 100, length: 1, last: 101" + "'", str4, "Element, offset: 100, length: 1, last: 101");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 100, length: 1, last: 101" + "'", str5, "Element, offset: 100, length: 1, last: 101");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 100, length: 1, last: 101" + "'", str6, "Element, offset: 100, length: 1, last: 101");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        int int6 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, 0);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (-1), (int) ' ');
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 32, last: 31" + "'", str3, "Element, offset: -1, length: 32, last: 31");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str4, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str5, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str7, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 10, (int) (short) 100);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 100, last: 110" + "'", str5, "Element, offset: 10, length: 100, last: 110");
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', 1);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 35, length: 1, last: 36" + "'", str3, "Element, offset: 35, length: 1, last: 36");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) 'a');
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 97, last: 97" + "'", str4, "Element, offset: 0, length: 97, last: 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 97, last: 97" + "'", str6, "Element, offset: 0, length: 97, last: 97");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 32, (int) (short) 100);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str5, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', (int) (byte) -1);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', 100);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 97, length: 100, last: 197" + "'", str5, "Element, offset: 97, length: 100, last: 197");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 97, (int) (short) 100);
        long long3 = stub2.offset;
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 35, 97);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 35, length: 97, last: 132" + "'", str3, "Element, offset: 35, length: 97, last: 132");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) 0);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str4, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, (int) (short) 100);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 100, last: 110" + "'", str3, "Element, offset: 10, length: 100, last: 110");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str5, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, 100);
        int int3 = stub2.length;
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, (int) (byte) 1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 1, last: 2" + "'", str4, "Element, offset: 1, length: 1, last: 2");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 1, last: 2" + "'", str5, "Element, offset: 1, length: 1, last: 2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 1, length: 1, last: 2" + "'", str6, "Element, offset: 1, length: 1, last: 2");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', 97);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(52L, (int) (byte) 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 52, length: 0, last: 52" + "'", str3, "Element, offset: 52, length: 0, last: 52");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 52, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) -1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: -1, last: 9" + "'", str4, "Element, offset: 10, length: -1, last: 9");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        int int7 = stub2.length;
        long long8 = stub2.offset;
        long long9 = stub2.offset;
        java.lang.String str10 = stub2.getElementDescription();
        long long11 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str10, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 35, (int) (byte) 10);
        int int3 = stub2.length;
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str3, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str4, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str5, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str6, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str7, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str8, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str9, "Element, offset: 32, length: 100, last: 132");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        long long5 = stub2.offset;
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str7, "Element, offset: -1, length: 1, last: 0");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 10, (int) ' ');
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str5, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (-1), 32);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 32, last: 31" + "'", str3, "Element, offset: -1, length: 32, last: 31");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 52, (int) '#');
        int int3 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', 0);
        int int3 = stub2.length;
        int int4 = stub2.length;
        int int5 = stub2.length;
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass9 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 35, length: 0, last: 35" + "'", str7, "Element, offset: 35, length: 0, last: 35");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 35, length: 0, last: 35" + "'", str8, "Element, offset: 35, length: 0, last: 35");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, (int) ' ');
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass8 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str4, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str7, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, (int) ' ');
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str4, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str7, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str8, "Element, offset: 1, length: 32, last: 33");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', (int) 'a');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 35, length: 97, last: 132" + "'", str3, "Element, offset: 35, length: 97, last: 132");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        long long5 = stub2.offset;
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str7, "Element, offset: 0, length: -1, last: -1");
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(100L, 32);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 32, last: 132" + "'", str3, "Element, offset: 100, length: 32, last: 132");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 100, length: 32, last: 132" + "'", str4, "Element, offset: 100, length: 32, last: 132");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 100, length: 32, last: 132" + "'", str6, "Element, offset: 100, length: 32, last: 132");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str6, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str7, "Element, offset: -1, length: 0, last: -1");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        long long10 = stub2.offset;
        java.lang.String str11 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str11, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 35, length: 0, last: 35" + "'", str4, "Element, offset: 35, length: 0, last: 35");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 35, length: 0, last: 35" + "'", str5, "Element, offset: 35, length: 0, last: 35");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str4, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str5, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, 35);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str7, "Element, offset: -1, length: 0, last: -1");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', (int) '#');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 35, last: 67" + "'", str3, "Element, offset: 32, length: 35, last: 67");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        int int8 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str4, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str5, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str6, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (-1), (int) (short) -1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str3, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str5, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str3, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str7, "Element, offset: -1, length: 0, last: -1");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) -1);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), (int) '#');
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 35, last: 34" + "'", str3, "Element, offset: -1, length: 35, last: 34");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 35, (int) (short) 100);
        long long3 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        int int9 = stub2.length;
        java.lang.String str10 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str10, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 1, (int) (byte) 100);
        long long3 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 100, 52);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        int int8 = stub2.length;
        java.lang.Class<?> wildcardClass9 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 0, (int) 'a');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 97, last: 97" + "'", str3, "Element, offset: 0, length: 97, last: 97");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 97, last: 97" + "'", str4, "Element, offset: 0, length: 97, last: 97");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 97, last: 97" + "'", str5, "Element, offset: 0, length: 97, last: 97");
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(100L, 32);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        long long5 = stub2.offset;
        int int6 = stub2.length;
        long long7 = stub2.offset;
        int int8 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        long long8 = stub2.offset;
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass11 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str3, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str4, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str5, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str6, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str9, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str10, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        java.lang.String str11 = stub2.getElementDescription();
        java.lang.String str12 = stub2.getElementDescription();
        java.lang.String str13 = stub2.getElementDescription();
        int int14 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str10, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str11, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str12, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str13, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        long long7 = stub2.offset;
        int int8 = stub2.length;
        java.lang.Class<?> wildcardClass9 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        java.lang.String str11 = stub2.getElementDescription();
        int int12 = stub2.length;
        int int13 = stub2.length;
        java.lang.String str14 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str10, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str11, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str14, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', (-1));
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: -1, last: 31" + "'", str3, "Element, offset: 32, length: -1, last: 31");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: -1, last: 31" + "'", str4, "Element, offset: 32, length: -1, last: 31");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: -1, last: 31" + "'", str5, "Element, offset: 32, length: -1, last: 31");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        int int9 = stub2.length;
        int int10 = stub2.length;
        java.lang.String str11 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str11, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', (int) (short) 10);
        long long3 = stub2.offset;
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        java.lang.String str8 = stub2.getElementDescription();
        int int9 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 100, (int) '#');
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        int int5 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(35L, 100);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 35, length: 100, last: 135" + "'", str3, "Element, offset: 35, length: 100, last: 135");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', (int) ' ');
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 32, last: 64" + "'", str3, "Element, offset: 32, length: 32, last: 64");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 32, last: 64" + "'", str5, "Element, offset: 32, length: 32, last: 64");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        long long8 = stub2.offset;
        java.lang.Class<?> wildcardClass9 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(97L, 35);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 97, length: 35, last: 132" + "'", str3, "Element, offset: 97, length: 35, last: 132");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        int int9 = stub2.length;
        int int10 = stub2.length;
        int int11 = stub2.length;
        long long12 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str7, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str8, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, (int) ' ');
        int int3 = stub2.length;
        long long4 = stub2.offset;
        int int5 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) '4');
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 52, last: 51" + "'", str4, "Element, offset: -1, length: 52, last: 51");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        java.lang.Class<?> wildcardClass8 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        long long11 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str5, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str7, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str8, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str9, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str10, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str6, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str7, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str8, "Element, offset: 0, length: -1, last: -1");
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 32);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', 100);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str5, "Element, offset: 32, length: 100, last: 132");
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) '#');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 35, last: 35" + "'", str3, "Element, offset: 0, length: 35, last: 35");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 35, last: 35" + "'", str4, "Element, offset: 0, length: 35, last: 35");
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 35, (-1));
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 35, length: -1, last: 34" + "'", str3, "Element, offset: 35, length: -1, last: 34");
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), (int) (byte) 100);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, (int) ' ');
        int int3 = stub2.length;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str5, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str6, "Element, offset: 1, length: 32, last: 33");
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 1, (int) (short) 10);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str3, "Element, offset: 1, length: 10, last: 11");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (short) 10);
        long long3 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        int int9 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str8, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', (int) (short) -1);
        int int3 = stub2.length;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 35, length: -1, last: 34" + "'", str5, "Element, offset: 35, length: -1, last: 34");
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        long long10 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        int int9 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str6, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str7, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str8, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', (int) (byte) 10);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str6, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str8, "Element, offset: 0, length: -1, last: -1");
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        int int9 = stub2.length;
        java.lang.Class<?> wildcardClass10 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str3, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str4, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str5, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str6, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str7, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str8, "Element, offset: 0, length: -1, last: -1");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        long long5 = stub2.offset;
        long long6 = stub2.offset;
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        int int7 = stub2.length;
        int int8 = stub2.length;
        java.lang.String str9 = stub2.getElementDescription();
        long long10 = stub2.offset;
        java.lang.Class<?> wildcardClass11 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str4, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str5, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str9, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str5, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str7, "Element, offset: 0, length: 0, last: 0");
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', 1);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 97, length: 1, last: 98" + "'", str6, "Element, offset: 97, length: 1, last: 98");
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        int int9 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str6, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str7, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str8, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', (int) 'a');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 35, length: 97, last: 132" + "'", str3, "Element, offset: 35, length: 97, last: 132");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 35, length: 97, last: 132" + "'", str4, "Element, offset: 35, length: 97, last: 132");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 35, length: 97, last: 132" + "'", str5, "Element, offset: 35, length: 97, last: 132");
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(52L, 32);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 52, length: 32, last: 84" + "'", str3, "Element, offset: 52, length: 32, last: 84");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 52, length: 32, last: 84" + "'", str5, "Element, offset: 52, length: 32, last: 84");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', 100);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 97, length: 100, last: 197" + "'", str4, "Element, offset: 97, length: 100, last: 197");
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        int int9 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, (int) ' ');
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str4, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str7, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str8, "Element, offset: 1, length: 32, last: 33");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) ' ');
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str5, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str6, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str7, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) (byte) 10);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str5, "Element, offset: 1, length: 10, last: 11");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str6, "Element, offset: 1, length: 10, last: 11");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        int int8 = stub2.length;
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        java.lang.String str11 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass12 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str3, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str7, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str9, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str10, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str11, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, 10);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 10, last: 10" + "'", str3, "Element, offset: 0, length: 10, last: 10");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (-1), (int) (byte) 10);
        long long3 = stub2.offset;
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (-1));
        int int3 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        long long5 = stub2.offset;
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 32, 0);
        int int3 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(97L, (int) (short) -1);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        long long5 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 97, length: -1, last: 96" + "'", str3, "Element, offset: 97, length: -1, last: 96");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, 32);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str3, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str5, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str8, "Element, offset: 10, length: 32, last: 42");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) 'a');
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str5, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str6, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        int int9 = stub2.length;
        int int10 = stub2.length;
        int int11 = stub2.length;
        java.lang.String str12 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str12, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, (int) ' ');
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        int int6 = stub2.length;
        int int7 = stub2.length;
        long long8 = stub2.offset;
        int int9 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str4, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) '#');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 35, last: 45" + "'", str3, "Element, offset: 10, length: 35, last: 45");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 35, last: 45" + "'", str4, "Element, offset: 10, length: 35, last: 45");
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        int int7 = stub2.length;
        long long8 = stub2.offset;
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass10 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        int int6 = stub2.length;
        int int7 = stub2.length;
        int int8 = stub2.length;
        int int9 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(97L, (-1));
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        java.lang.String str11 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass12 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str10, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str11, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, 32);
        long long3 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 10, (int) '#');
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass8 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str7, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        int int8 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str3, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str4, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str5, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str6, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str6, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        int int6 = stub2.length;
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, 32);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        int int8 = stub2.length;
        java.lang.String str9 = stub2.getElementDescription();
        int int10 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str3, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str4, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str5, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str7, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str9, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(100L, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 1, last: 101" + "'", str3, "Element, offset: 100, length: 1, last: 101");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        int int6 = stub2.length;
        long long7 = stub2.offset;
        long long8 = stub2.offset;
        int int9 = stub2.length;
        java.lang.String str10 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str10, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        int int9 = stub2.length;
        java.lang.String str10 = stub2.getElementDescription();
        int int11 = stub2.length;
        java.lang.String str12 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str5, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str7, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str10, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str12, "Element, offset: -1, length: 1, last: 0");
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, 10);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 10, last: 10" + "'", str3, "Element, offset: 0, length: 10, last: 10");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 10, last: 10" + "'", str4, "Element, offset: 0, length: 10, last: 10");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (short) 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 100, last: 100" + "'", str3, "Element, offset: 0, length: 100, last: 100");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 100, last: 100" + "'", str4, "Element, offset: 0, length: 100, last: 100");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, 100);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 100, last: 100" + "'", str4, "Element, offset: 0, length: 100, last: 100");
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 32, (int) 'a');
        long long3 = stub2.offset;
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, (int) ' ');
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str3, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str5, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str6, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str7, "Element, offset: 1, length: 32, last: 33");
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        int int9 = stub2.length;
        java.lang.String str10 = stub2.getElementDescription();
        java.lang.String str11 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str7, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str8, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str10, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str11, "Element, offset: -1, length: 1, last: 0");
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 10, 1);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 1, last: 11" + "'", str3, "Element, offset: 10, length: 1, last: 11");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) ' ');
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str3, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str5, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str7, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str8, "Element, offset: 1, length: 32, last: 33");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass9 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str6, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str8, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', 1);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        long long5 = stub2.offset;
        long long6 = stub2.offset;
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 1, (int) '4');
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 0, (int) (short) 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str4, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str6, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str7, "Element, offset: 0, length: 0, last: 0");
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 52, 35);
        long long3 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 10);
        int int3 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        java.lang.Class<?> wildcardClass9 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 1, (int) (byte) 0);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(32L, 100);
        int int3 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        int int9 = stub2.length;
        java.lang.String str10 = stub2.getElementDescription();
        java.lang.String str11 = stub2.getElementDescription();
        java.lang.String str12 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass13 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str5, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str7, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str10, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str11, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str12, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str3, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str6, "Element, offset: -1, length: 0, last: -1");
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (byte) 1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 100, (int) (short) 1);
        long long3 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str6, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str7, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str8, "Element, offset: 0, length: -1, last: -1");
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', 32);
        int int3 = stub2.length;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 32, last: 64" + "'", str5, "Element, offset: 32, length: 32, last: 64");
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        long long10 = stub2.offset;
        java.lang.String str11 = stub2.getElementDescription();
        java.lang.String str12 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass13 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str11, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str12, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str6, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 32, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', 0);
        int int3 = stub2.length;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 35, length: 0, last: 35" + "'", str5, "Element, offset: 35, length: 0, last: 35");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 35, length: 0, last: 35" + "'", str6, "Element, offset: 35, length: 0, last: 35");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        int int6 = stub2.length;
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        long long9 = stub2.offset;
        long long10 = stub2.offset;
        int int11 = stub2.length;
        int int12 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str8, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (-1), (int) (byte) -1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str4, "Element, offset: -1, length: -1, last: -2");
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', 1);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 97, length: 1, last: 98" + "'", str5, "Element, offset: 97, length: 1, last: 98");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, 0);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 100, length: 0, last: 100" + "'", str4, "Element, offset: 100, length: 0, last: 100");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 100, length: 0, last: 100" + "'", str5, "Element, offset: 100, length: 0, last: 100");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 100, length: 0, last: 100" + "'", str6, "Element, offset: 100, length: 0, last: 100");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        int int8 = stub2.length;
        java.lang.String str9 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, (int) ' ');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str3, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str4, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str5, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 10, (int) (byte) 0);
        int int3 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(100L, 35);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 35, last: 135" + "'", str3, "Element, offset: 100, length: 35, last: 135");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) ' ');
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str3, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str5, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str7, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str8, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str9, "Element, offset: 1, length: 32, last: 33");
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', (int) (short) 10);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        int int7 = stub2.length;
        int int8 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 97, length: 10, last: 107" + "'", str4, "Element, offset: 97, length: 10, last: 107");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 97, length: 10, last: 107" + "'", str5, "Element, offset: 97, length: 10, last: 107");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str6, "Element, offset: 0, length: -1, last: -1");
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 10, 35);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', 0);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        int int5 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) -1);
        int int3 = stub2.length;
        long long4 = stub2.offset;
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 1, (int) (short) -1);
        int int3 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 10, 1);
        int int3 = stub2.length;
        int int4 = stub2.length;
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 1, last: 11" + "'", str6, "Element, offset: 10, length: 1, last: 11");
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, 100);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 100, last: 101" + "'", str3, "Element, offset: 1, length: 100, last: 101");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str3, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str6, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str7, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str8, "Element, offset: -1, length: 0, last: -1");
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 1, 1);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 1, (int) (byte) 1);
        long long3 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (-1), (int) (short) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        int int8 = stub2.length;
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str3, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str4, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str5, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str7, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str9, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str10, "Element, offset: -1, length: -1, last: -2");
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        long long10 = stub2.offset;
        java.lang.String str11 = stub2.getElementDescription();
        java.lang.String str12 = stub2.getElementDescription();
        java.lang.String str13 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str11, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str12, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str13, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, 32);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 32, last: 31" + "'", str4, "Element, offset: -1, length: 32, last: 31");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 0, 35);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 0, (int) (byte) 100);
        int int3 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 0, last: 32" + "'", str3, "Element, offset: 32, length: 0, last: 32");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, (int) ' ');
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str3, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str5, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str6, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        int int7 = stub2.length;
        int int8 = stub2.length;
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str9, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str10, "Element, offset: -1, length: 0, last: -1");
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 10, 10);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        long long9 = stub2.offset;
        long long10 = stub2.offset;
        long long11 = stub2.offset;
        long long12 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str7, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        int int7 = stub2.length;
        int int8 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str3, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) (byte) 10);
        long long3 = stub2.offset;
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str6, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str8, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str9, "Element, offset: 0, length: 0, last: 0");
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 1, (int) (short) 10);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str5, "Element, offset: 1, length: 10, last: 11");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str6, "Element, offset: 1, length: 10, last: 11");
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 1, last: 101" + "'", str3, "Element, offset: 100, length: 1, last: 101");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 100, length: 1, last: 101" + "'", str4, "Element, offset: 100, length: 1, last: 101");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 100, length: 1, last: 101" + "'", str5, "Element, offset: 100, length: 1, last: 101");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 100, length: 1, last: 101" + "'", str6, "Element, offset: 100, length: 1, last: 101");
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) -1, (int) (byte) -1);
        int int3 = stub2.length;
        long long4 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 100);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        int int5 = stub2.length;
        long long6 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 100, last: 110" + "'", str3, "Element, offset: 10, length: 100, last: 110");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        int int5 = stub2.length;
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str7, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        java.lang.Class<?> wildcardClass8 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str6, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) -1);
        int int3 = stub2.length;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str5, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 0, (int) (short) 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str4, "Element, offset: 0, length: 0, last: 0");
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 10, (int) (short) -1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: -1, last: 9" + "'", str4, "Element, offset: 10, length: -1, last: 9");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(100L, (int) (short) 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 0, last: 100" + "'", str3, "Element, offset: 100, length: 0, last: 100");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 100, length: 0, last: 100" + "'", str4, "Element, offset: 100, length: 0, last: 100");
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (-1), (int) (byte) 0);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str3, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(32L, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: -1, last: 31" + "'", str3, "Element, offset: 32, length: -1, last: 31");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: -1, last: 31" + "'", str4, "Element, offset: 32, length: -1, last: 31");
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) (byte) 10);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str6, "Element, offset: 1, length: 10, last: 11");
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) (byte) 10);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        int int8 = stub2.length;
        int int9 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 0, (int) (byte) 1);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 1, last: 1" + "'", str3, "Element, offset: 0, length: 1, last: 1");
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, 32);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str3, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str5, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str6, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str7, "Element, offset: 10, length: 32, last: 42");
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (-1), (int) ' ');
        int int3 = stub2.length;
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 32, last: 31" + "'", str6, "Element, offset: -1, length: 32, last: 31");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 32, last: 31" + "'", str7, "Element, offset: -1, length: 32, last: 31");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 32, last: 31" + "'", str8, "Element, offset: -1, length: 32, last: 31");
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str8, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str9, "Element, offset: 0, length: -1, last: -1");
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        int int8 = stub2.length;
        long long9 = stub2.offset;
        java.lang.Class<?> wildcardClass10 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str6, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str7, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        int int7 = stub2.length;
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str3, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str4, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str5, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str8, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str9, "Element, offset: 32, length: 100, last: 132");
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) -1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: -1, last: 9" + "'", str3, "Element, offset: 10, length: -1, last: 9");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) ' ');
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str3, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 52, 97);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 52, length: 97, last: 149" + "'", str3, "Element, offset: 52, length: 97, last: 149");
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        int int8 = stub2.length;
        java.lang.String str9 = stub2.getElementDescription();
        int int10 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str5, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str9, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str3, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str4, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str5, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str6, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, 100);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 100, last: 100" + "'", str4, "Element, offset: 0, length: 100, last: 100");
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        long long9 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str3, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str8, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 97, 0);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 97, length: 0, last: 97" + "'", str3, "Element, offset: 97, length: 0, last: 97");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str4, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str6, "Element, offset: 0, length: 0, last: 0");
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass9 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str4, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str5, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str6, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str7, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str8, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) -1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str5, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', (int) ' ');
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 97, length: 32, last: 129" + "'", str3, "Element, offset: 97, length: 32, last: 129");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (-1), (int) (short) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str3, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str4, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str5, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str7, "Element, offset: -1, length: -1, last: -2");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, (int) (byte) 0);
        int int3 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) -1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        int int9 = stub2.length;
        java.lang.String str10 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str5, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str6, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str7, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str8, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str10, "Element, offset: 0, length: -1, last: -1");
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', 0);
        int int3 = stub2.length;
        int int4 = stub2.length;
        int int5 = stub2.length;
        long long6 = stub2.offset;
        int int7 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        long long8 = stub2.offset;
        int int9 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(100L, 32);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 32, last: 132" + "'", str3, "Element, offset: 100, length: 32, last: 132");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 100, length: 32, last: 132" + "'", str4, "Element, offset: 100, length: 32, last: 132");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 100, length: 32, last: 132" + "'", str6, "Element, offset: 100, length: 32, last: 132");
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str7, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str8, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str9, "Element, offset: -1, length: 1, last: 0");
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        java.lang.String str9 = stub2.getElementDescription();
        long long10 = stub2.offset;
        java.lang.Class<?> wildcardClass11 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str5, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str7, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str9, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str5, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, (int) (byte) 10);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 100, length: 10, last: 110" + "'", str4, "Element, offset: 100, length: 10, last: 110");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        int int8 = stub2.length;
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        java.lang.String str11 = stub2.getElementDescription();
        java.lang.String str12 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str6, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str9, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str10, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str11, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str12, "Element, offset: -1, length: 0, last: -1");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        long long8 = stub2.offset;
        java.lang.String str9 = stub2.getElementDescription();
        int int10 = stub2.length;
        java.lang.String str11 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str3, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str4, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str5, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str6, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str9, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str11, "Element, offset: 32, length: 100, last: 132");
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 52, 97);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 52, length: 97, last: 149" + "'", str3, "Element, offset: 52, length: 97, last: 149");
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (-1), (int) (byte) 1);
        int int3 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', (int) 'a');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 35, length: 97, last: 132" + "'", str3, "Element, offset: 35, length: 97, last: 132");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 35, length: 97, last: 132" + "'", str4, "Element, offset: 35, length: 97, last: 132");
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 35, (int) (byte) 10);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 35, length: 10, last: 45" + "'", str3, "Element, offset: 35, length: 10, last: 45");
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 0, (int) (byte) 1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 1, last: 1" + "'", str4, "Element, offset: 0, length: 1, last: 1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 1, last: 1" + "'", str6, "Element, offset: 0, length: 1, last: 1");
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        int int9 = stub2.length;
        java.lang.String str10 = stub2.getElementDescription();
        int int11 = stub2.length;
        int int12 = stub2.length;
        java.lang.Class<?> wildcardClass13 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str5, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str7, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str10, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 52);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 52, last: 52" + "'", str3, "Element, offset: 0, length: 52, last: 52");
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '4', 0);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 52, length: 0, last: 52" + "'", str5, "Element, offset: 52, length: 0, last: 52");
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 10, (int) (short) -1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: -1, last: 9" + "'", str4, "Element, offset: 10, length: -1, last: 9");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 97, (int) (short) 10);
        long long3 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 52, (int) (short) -1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 52, length: -1, last: 51" + "'", str3, "Element, offset: 52, length: -1, last: 51");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(52L, (int) (byte) 10);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 32, (int) (short) 100);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        long long5 = stub2.offset;
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str7, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) (short) 100);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 100, last: 101" + "'", str3, "Element, offset: 1, length: 100, last: 101");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 1, length: 100, last: 101" + "'", str6, "Element, offset: 1, length: 100, last: 101");
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 1, 1);
        long long3 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str10, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        long long10 = stub2.offset;
        java.lang.String str11 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str11, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 100, (int) '#');
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', (int) '4');
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 97, length: 52, last: 149" + "'", str4, "Element, offset: 97, length: 52, last: 149");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 97, length: 52, last: 149" + "'", str5, "Element, offset: 97, length: 52, last: 149");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str7, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        int int5 = stub2.length;
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        int int8 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 100, (int) '#');
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 100, length: 35, last: 135" + "'", str4, "Element, offset: 100, length: 35, last: 135");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 100, length: 35, last: 135" + "'", str5, "Element, offset: 100, length: 35, last: 135");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) -1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        int int6 = stub2.length;
        int int7 = stub2.length;
        int int8 = stub2.length;
        java.lang.Class<?> wildcardClass9 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        long long10 = stub2.offset;
        java.lang.String str11 = stub2.getElementDescription();
        java.lang.String str12 = stub2.getElementDescription();
        int int13 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str11, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str12, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(97L, (int) (short) 100);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(35L, (int) (byte) 1);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 0, last: 32" + "'", str3, "Element, offset: 32, length: 0, last: 32");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 0, last: 32" + "'", str5, "Element, offset: 32, length: 0, last: 32");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str6, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str7, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str8, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str9, "Element, offset: -1, length: 0, last: -1");
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 1, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        int int7 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: -1, last: 0" + "'", str3, "Element, offset: 1, length: -1, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: -1, last: 0" + "'", str4, "Element, offset: 1, length: -1, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: -1, last: 0" + "'", str5, "Element, offset: 1, length: -1, last: 0");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 32, (int) (short) 100);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str4, "Element, offset: 32, length: 100, last: 132");
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) ' ');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str3, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str4, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str7, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str8, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str9, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str10, "Element, offset: 1, length: 32, last: 33");
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        long long8 = stub2.offset;
        java.lang.String str9 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str3, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str7, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str8, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str9, "Element, offset: -1, length: 0, last: -1");
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 32, (int) (short) 100);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str5, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str6, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(52L, 35);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        int int6 = stub2.length;
        int int7 = stub2.length;
        int int8 = stub2.length;
        java.lang.Class<?> wildcardClass9 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        java.lang.String str11 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str10, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str11, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 10, 32);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str3, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str5, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 100, (-1));
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 100, length: -1, last: 99" + "'", str4, "Element, offset: 100, length: -1, last: 99");
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        int int8 = stub2.length;
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        long long11 = stub2.offset;
        long long12 = stub2.offset;
        long long13 = stub2.offset;
        java.lang.Class<?> wildcardClass14 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str6, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str9, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str10, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', 1);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 97, length: 1, last: 98" + "'", str7, "Element, offset: 97, length: 1, last: 98");
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) -1, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str3, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str5, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str6, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, (int) '4');
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 1, 10);
        int int3 = stub2.length;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str5, "Element, offset: 1, length: 10, last: 11");
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(32L, (int) (short) 1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 1, last: 33" + "'", str4, "Element, offset: 32, length: 1, last: 33");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 32, length: 1, last: 33" + "'", str7, "Element, offset: 32, length: 1, last: 33");
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str10, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) ' ');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass10 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str3, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str4, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str7, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str8, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str9, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 52, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (-1), (int) (short) -1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str3, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str5, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str6, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        long long8 = stub2.offset;
        long long9 = stub2.offset;
        java.lang.String str10 = stub2.getElementDescription();
        int int11 = stub2.length;
        int int12 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str10, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str5, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 0, (int) (short) 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        int int8 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) -1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str7, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str8, "Element, offset: 0, length: -1, last: -1");
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str6, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str7, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str8, "Element, offset: 0, length: -1, last: -1");
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 35, length: 0, last: 35" + "'", str4, "Element, offset: 35, length: 0, last: 35");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 0, 10);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 10, last: 10" + "'", str3, "Element, offset: 0, length: 10, last: 10");
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 100, 1);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 1, last: 101" + "'", str3, "Element, offset: 100, length: 1, last: 101");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 100, length: 1, last: 101" + "'", str5, "Element, offset: 100, length: 1, last: 101");
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', 0);
        int int3 = stub2.length;
        int int4 = stub2.length;
        int int5 = stub2.length;
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        java.lang.Class<?> wildcardClass8 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 0, 10);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 10, last: 10" + "'", str3, "Element, offset: 0, length: 10, last: 10");
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 100, (int) (short) 1);
        int int3 = stub2.length;
        int int4 = stub2.length;
        int int5 = stub2.length;
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 1, (int) '#');
        long long3 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 100);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        java.lang.Class<?> wildcardClass8 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 100, last: 99" + "'", str4, "Element, offset: -1, length: 100, last: 99");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 100, last: 99" + "'", str6, "Element, offset: -1, length: 100, last: 99");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        java.lang.String str8 = stub2.getElementDescription();
        long long9 = stub2.offset;
        java.lang.Class<?> wildcardClass10 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str6, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str8, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(97L, (int) (byte) 1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 97, length: 1, last: 98" + "'", str4, "Element, offset: 97, length: 1, last: 98");
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 97);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        int int6 = stub2.length;
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        long long9 = stub2.offset;
        long long10 = stub2.offset;
        java.lang.String str11 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str8, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str11, "Element, offset: 0, length: -1, last: -1");
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, 52);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        long long10 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', (int) (short) 1);
        int int3 = stub2.length;
        int int4 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        int int6 = stub2.length;
        long long7 = stub2.offset;
        int int8 = stub2.length;
        long long9 = stub2.offset;
        int int10 = stub2.length;
        java.lang.String str11 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str11, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 100, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 1, last: 101" + "'", str3, "Element, offset: 100, length: 1, last: 101");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 10, (int) (short) 100);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 100, last: 110" + "'", str5, "Element, offset: 10, length: 100, last: 110");
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, 1);
        long long3 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(100L, 32);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 100, length: 32, last: 132" + "'", str6, "Element, offset: 100, length: 32, last: 132");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 100, length: 32, last: 132" + "'", str7, "Element, offset: 100, length: 32, last: 132");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass8 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str7, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', (int) (byte) 100);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        long long8 = stub2.offset;
        int int9 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        java.lang.String str9 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str4, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str5, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str6, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str7, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str9, "Element, offset: 0, length: 0, last: 0");
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, 10);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        int int8 = stub2.length;
        java.lang.Class<?> wildcardClass9 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str3, "Element, offset: 1, length: 10, last: 11");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str7, "Element, offset: 1, length: 10, last: 11");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        long long8 = stub2.offset;
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        long long11 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str10, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 100, 32);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) (byte) 10);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str3, "Element, offset: 1, length: 10, last: 11");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str6, "Element, offset: 1, length: 10, last: 11");
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', 1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 97, length: 1, last: 98" + "'", str3, "Element, offset: 97, length: 1, last: 98");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 97, length: 1, last: 98" + "'", str5, "Element, offset: 97, length: 1, last: 98");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) -1, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str3, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 100, (int) 'a');
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 100, length: 97, last: 197" + "'", str4, "Element, offset: 100, length: 97, last: 197");
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        int int8 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str7, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        int int8 = stub2.length;
        java.lang.String str9 = stub2.getElementDescription();
        int int10 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str3, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str7, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str9, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str6, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str7, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, 100);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        java.lang.Class<?> wildcardClass8 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 100, last: 100" + "'", str3, "Element, offset: 0, length: 100, last: 100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 100, last: 100" + "'", str6, "Element, offset: 0, length: 100, last: 100");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) -1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str7, "Element, offset: 0, length: -1, last: -1");
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, (int) ' ');
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) ' ');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        java.lang.Class<?> wildcardClass9 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str3, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str4, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str7, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 35, 1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 35, length: 1, last: 36" + "'", str3, "Element, offset: 35, length: 1, last: 36");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 35, length: 1, last: 36" + "'", str5, "Element, offset: 35, length: 1, last: 36");
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        int int5 = stub2.length;
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        int int8 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (byte) 1);
        int int3 = stub2.length;
        long long4 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 10, (int) (short) -1);
        int int3 = stub2.length;
        long long4 = stub2.offset;
        int int5 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) -1, (int) (short) 10);
        int int3 = stub2.length;
        int int4 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        int int7 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass9 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str6, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str8, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str6, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str7, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str8, "Element, offset: 0, length: 0, last: 0");
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str5, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str6, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str7, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        int int6 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 100, last: 110" + "'", str3, "Element, offset: 10, length: 100, last: 110");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 100, last: 110" + "'", str4, "Element, offset: 10, length: 100, last: 110");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        java.lang.String str11 = stub2.getElementDescription();
        int int12 = stub2.length;
        int int13 = stub2.length;
        int int14 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str10, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str11, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 52, (int) (short) 10);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        java.lang.Class<?> wildcardClass8 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        long long10 = stub2.offset;
        java.lang.String str11 = stub2.getElementDescription();
        java.lang.String str12 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass13 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str11, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str12, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 97, 1);
        int int3 = stub2.length;
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), (int) (short) 0);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str3, "Element, offset: -1, length: 0, last: -1");
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', (int) ' ');
        int int3 = stub2.length;
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(100L, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) -1, (int) (byte) 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str3, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (-1), (int) (short) -1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        int int8 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str3, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str5, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str6, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str7, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) ' ');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str3, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str4, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 97, 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 97, length: 0, last: 97" + "'", str3, "Element, offset: 97, length: 0, last: 97");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) (byte) 10);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str5, "Element, offset: 1, length: 10, last: 11");
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) (byte) 10);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str3, "Element, offset: 1, length: 10, last: 11");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str4, "Element, offset: 1, length: 10, last: 11");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str6, "Element, offset: 1, length: 10, last: 11");
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 1, (int) (byte) 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 1, last: 2" + "'", str3, "Element, offset: 1, length: 1, last: 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 1, last: 2" + "'", str4, "Element, offset: 1, length: 1, last: 2");
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (-1), (int) '#');
        int int3 = stub2.length;
        long long4 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 32, (int) (short) 100);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str5, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str6, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str7, "Element, offset: 32, length: 100, last: 132");
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str3, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str6, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str7, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str8, "Element, offset: -1, length: 0, last: -1");
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        int int8 = stub2.length;
        long long9 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str4, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str5, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 100, (int) (byte) 100);
        int int3 = stub2.length;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 100, length: 100, last: 200" + "'", str5, "Element, offset: 100, length: 100, last: 200");
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, (int) (byte) 100);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 100, last: 200" + "'", str3, "Element, offset: 100, length: 100, last: 200");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 0, (int) (short) 0);
        int int3 = stub2.length;
        int int4 = stub2.length;
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', 1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 35, length: 1, last: 36" + "'", str3, "Element, offset: 35, length: 1, last: 36");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), (int) (short) 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 100, last: 99" + "'", str3, "Element, offset: -1, length: 100, last: 99");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 100, last: 99" + "'", str4, "Element, offset: -1, length: 100, last: 99");
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', 1);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 97, length: 1, last: 98" + "'", str6, "Element, offset: 97, length: 1, last: 98");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 97, length: 1, last: 98" + "'", str7, "Element, offset: 97, length: 1, last: 98");
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, 10);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str3, "Element, offset: 1, length: 10, last: 11");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str6, "Element, offset: 1, length: 10, last: 11");
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 100, (int) '#');
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, 1);
        int int3 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, 1);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 1, last: 2" + "'", str3, "Element, offset: 1, length: 1, last: 2");
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, (int) (byte) 1);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass9 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str8, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        java.lang.String str9 = stub2.getElementDescription();
        long long10 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(97L, (int) (short) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 97, length: -1, last: 96" + "'", str3, "Element, offset: 97, length: -1, last: 96");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 97, length: -1, last: 96" + "'", str4, "Element, offset: 97, length: -1, last: 96");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 97, length: -1, last: 96" + "'", str6, "Element, offset: 97, length: -1, last: 96");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, (int) (byte) 1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 1, last: 2" + "'", str4, "Element, offset: 1, length: 1, last: 2");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 1, last: 2" + "'", str5, "Element, offset: 1, length: 1, last: 2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 1, length: 1, last: 2" + "'", str6, "Element, offset: 1, length: 1, last: 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 1, length: 1, last: 2" + "'", str7, "Element, offset: 1, length: 1, last: 2");
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(52L, (int) ' ');
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        long long8 = stub2.offset;
        java.lang.String str9 = stub2.getElementDescription();
        int int10 = stub2.length;
        java.lang.Class<?> wildcardClass11 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str3, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str4, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str5, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str6, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str9, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', (int) (short) -1);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        int int9 = stub2.length;
        java.lang.String str10 = stub2.getElementDescription();
        int int11 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str10, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 10, 0);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        long long8 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) ' ');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        int int6 = stub2.length;
        int int7 = stub2.length;
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass9 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str3, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str4, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str8, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (-1), (int) (short) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        int int8 = stub2.length;
        int int9 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str3, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str4, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str5, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str7, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 32, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(100L, 32);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 32, last: 132" + "'", str3, "Element, offset: 100, length: 32, last: 132");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 100, length: 32, last: 132" + "'", str4, "Element, offset: 100, length: 32, last: 132");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 100, length: 32, last: 132" + "'", str5, "Element, offset: 100, length: 32, last: 132");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 100, length: 32, last: 132" + "'", str7, "Element, offset: 100, length: 32, last: 132");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 100, length: 32, last: 132" + "'", str8, "Element, offset: 100, length: 32, last: 132");
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', (int) '#');
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 35, last: 67" + "'", str3, "Element, offset: 32, length: 35, last: 67");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(97L, (int) '4');
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 52, (int) '4');
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 52, length: 52, last: 104" + "'", str3, "Element, offset: 52, length: 52, last: 104");
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str3, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (-1), (int) (short) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str3, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str4, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str6, "Element, offset: -1, length: -1, last: -2");
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, 1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 100, length: 1, last: 101" + "'", str4, "Element, offset: 100, length: 1, last: 101");
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (-1), 97);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) -1, 97);
    }
}

