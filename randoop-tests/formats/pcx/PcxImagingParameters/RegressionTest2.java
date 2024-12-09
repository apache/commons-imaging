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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setCompression((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setCompression((int) (byte) 10);
        int int16 = pcxImagingParameters15.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity17 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters15.setPixelDensity(pixelDensity17);
        org.apache.commons.imaging.PixelDensity pixelDensity19 = pcxImagingParameters18.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertNull(pixelDensity19);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setPlanes((int) (byte) 10);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters3.getPixelDensity();
        boolean boolean7 = pcxImagingParameters3.isStrict();
        boolean boolean8 = pcxImagingParameters3.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters3.setBitDepth((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = pcxImagingParameters10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) ' ');
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = pcxImagingParameters10.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setCompression(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(bufferedImageFactory11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setCompression((int) (short) 100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = pcxImagingParameters6.getBufferedImageFactory();
        org.apache.commons.imaging.PixelDensity pixelDensity10 = pcxImagingParameters6.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters6.setBitDepth((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(bufferedImageFactory9);
        org.junit.Assert.assertNull(pixelDensity10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters0.getBufferedImageFactory();
        int int6 = pcxImagingParameters0.getPlanes();
        java.lang.String str7 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setPixelDensity(pixelDensity8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters4.asThis();
        int int6 = pcxImagingParameters4.getCompression();
        java.lang.String str7 = pcxImagingParameters4.getFileName();
        int int8 = pcxImagingParameters4.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters4.setCompression((-1));
        int int11 = pcxImagingParameters10.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setPixelDensity(pixelDensity6);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setFileName("hi!");
        int int10 = pcxImagingParameters5.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBitDepth(0);
        java.lang.String str5 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setFileName("");
        int int8 = pcxImagingParameters7.getCompression();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.setBufferedImageFactory(bufferedImageFactory9);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = pcxImagingParameters10.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.asThis();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(pixelDensity11);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setStrict(false);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory11);
        int int13 = pcxImagingParameters12.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity14 = pcxImagingParameters12.getPixelDensity();
        int int15 = pcxImagingParameters12.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity16 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters12.setPixelDensity(pixelDensity16);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters12.setCompression((int) '4');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters21 = pcxImagingParameters19.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory22 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters23 = pcxImagingParameters21.setBufferedImageFactory(bufferedImageFactory22);
        boolean boolean24 = pcxImagingParameters23.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNull(pixelDensity14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertNotNull(pcxImagingParameters21);
        org.junit.Assert.assertNotNull(pcxImagingParameters23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPlanes((-1));
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setFileName("hi!");
        int int15 = pcxImagingParameters10.getPlanes();
        int int16 = pcxImagingParameters10.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression(10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters0.setStrict(false);
        boolean boolean11 = pcxImagingParameters0.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNull(bufferedImageFactory8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setCompression(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters10.setCompression((int) (short) 10);
        java.lang.String str18 = pcxImagingParameters17.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory19 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters17.setBufferedImageFactory(bufferedImageFactory19);
        org.apache.commons.imaging.PixelDensity pixelDensity21 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters22 = pcxImagingParameters17.setPixelDensity(pixelDensity21);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory23 = pcxImagingParameters17.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters24 = pcxImagingParameters17.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(pcxImagingParameters20);
        org.junit.Assert.assertNotNull(pcxImagingParameters22);
        org.junit.Assert.assertNull(bufferedImageFactory23);
        org.junit.Assert.assertNotNull(pcxImagingParameters24);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setCompression(1);
        int int5 = pcxImagingParameters4.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBitDepth((int) (byte) 10);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = pcxImagingParameters6.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(bufferedImageFactory9);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setPixelDensity(pixelDensity6);
        int int8 = pcxImagingParameters3.getCompression();
        java.lang.String str9 = pcxImagingParameters3.getFileName();
        java.lang.Class<?> wildcardClass10 = pcxImagingParameters3.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setCompression(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters10.setCompression((int) (short) 10);
        org.apache.commons.imaging.PixelDensity pixelDensity18 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters17.setPixelDensity(pixelDensity18);
        org.apache.commons.imaging.PixelDensity pixelDensity20 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters21 = pcxImagingParameters17.setPixelDensity(pixelDensity20);
        java.lang.Class<?> wildcardClass22 = pcxImagingParameters21.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertNotNull(pcxImagingParameters21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setStrict(true);
        boolean boolean8 = pcxImagingParameters3.isStrict();
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters3.setPixelDensity(pixelDensity9);
        java.lang.Class<?> wildcardClass11 = pcxImagingParameters3.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory6);
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setStrict(false);
        java.lang.String str12 = pcxImagingParameters11.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setPlanes((int) (byte) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters3.getBufferedImageFactory();
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters3.setPixelDensity(pixelDensity9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNull(bufferedImageFactory8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setPixelDensity(pixelDensity8);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setFileName("hi!");
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setPixelDensity(pixelDensity8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters10.setCompression((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters17.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters0.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        int int4 = pcxImagingParameters2.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters2.setCompression((int) (short) 1);
        int int7 = pcxImagingParameters6.getCompression();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setCompression((int) (byte) 0);
        boolean boolean14 = pcxImagingParameters10.isStrict();
        org.apache.commons.imaging.PixelDensity pixelDensity15 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters10.setPixelDensity(pixelDensity15);
        boolean boolean17 = pcxImagingParameters10.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setPixelDensity(pixelDensity5);
        int int7 = pcxImagingParameters6.getCompression();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters6.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 0);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = pcxImagingParameters6.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(bufferedImageFactory8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(bufferedImageFactory11);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters6.getBufferedImageFactory();
        java.lang.String str9 = pcxImagingParameters6.getFileName();
        int int10 = pcxImagingParameters6.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters6.setCompression(0);
        int int13 = pcxImagingParameters6.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity14 = pcxImagingParameters6.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(bufferedImageFactory8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(pixelDensity14);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(false);
        boolean boolean6 = pcxImagingParameters3.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters3.setCompression(32);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory9);
        java.lang.Class<?> wildcardClass11 = pcxImagingParameters3.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setPlanes((int) '4');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setFileName("hi!");
        java.lang.String str12 = pcxImagingParameters11.getFileName();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setPlanes(35);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setBufferedImageFactory(bufferedImageFactory11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setStrict(false);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory11);
        int int13 = pcxImagingParameters12.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity14 = pcxImagingParameters12.getPixelDensity();
        int int15 = pcxImagingParameters12.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters12.setFileName("hi!");
        java.lang.String str18 = pcxImagingParameters12.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters12.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory20 = pcxImagingParameters19.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNull(pixelDensity14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertNull(bufferedImageFactory20);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setCompression(1);
        int int5 = pcxImagingParameters4.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setBitDepth(10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters7.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(bufferedImageFactory10);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        int int9 = pcxImagingParameters6.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters6.setBitDepth((int) (short) 0);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setBufferedImageFactory(bufferedImageFactory12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        int int4 = pcxImagingParameters2.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters2.setCompression((int) (short) 1);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory8);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBitDepth((int) (byte) 0);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory6);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory8);
        int int10 = pcxImagingParameters5.getCompression();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        int int5 = pcxImagingParameters4.getCompression();
        int int6 = pcxImagingParameters4.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters4.setBufferedImageFactory(bufferedImageFactory9);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setCompression((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setFileName("hi!");
        java.lang.Class<?> wildcardClass15 = pcxImagingParameters12.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory6);
        int int8 = pcxImagingParameters5.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters5.setBitDepth(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setPixelDensity(pixelDensity4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters5.asThis();
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters6.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters6.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters5.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters5.getBufferedImageFactory();
        int int9 = pcxImagingParameters5.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters5.asThis();
        int int11 = pcxImagingParameters5.getCompression();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNull(bufferedImageFactory7);
        org.junit.Assert.assertNull(bufferedImageFactory8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getBitDepth();
        int int2 = pcxImagingParameters0.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setStrict(false);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setCompression((int) (short) 100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setBufferedImageFactory(bufferedImageFactory8);
        org.apache.commons.imaging.PixelDensity pixelDensity10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setPixelDensity(pixelDensity10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setCompression((int) ' ');
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters9.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity12 = pcxImagingParameters11.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(bufferedImageFactory10);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(pixelDensity12);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        int int12 = pcxImagingParameters10.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setCompression(1);
        int int11 = pcxImagingParameters8.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters8.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.PixelDensity pixelDensity14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters8.setPixelDensity(pixelDensity14);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters15.setCompression(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setPlanes((int) '4');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters10.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setBufferedImageFactory(bufferedImageFactory12);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters9.asThis();
        java.lang.String str13 = pcxImagingParameters9.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters9.setBitDepth((int) (byte) -1);
        int int16 = pcxImagingParameters9.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setCompression(1);
        int int5 = pcxImagingParameters4.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setCompression((int) '4');
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setCompression(1);
        int int11 = pcxImagingParameters8.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters8.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setFileName("hi!");
        boolean boolean16 = pcxImagingParameters15.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setCompression((int) (byte) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setPixelDensity(pixelDensity14);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters15.setStrict(true);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory18 = pcxImagingParameters17.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNull(bufferedImageFactory18);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = pcxImagingParameters6.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(bufferedImageFactory9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBitDepth(0);
        java.lang.String str5 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setFileName("");
        java.lang.String str8 = pcxImagingParameters0.getFileName();
        boolean boolean9 = pcxImagingParameters0.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters0.setPlanes(100);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters6.setStrict(true);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory12 = pcxImagingParameters11.getBufferedImageFactory();
        int int13 = pcxImagingParameters11.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(bufferedImageFactory12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory9);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = pcxImagingParameters10.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(pixelDensity11);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.asThis();
        boolean boolean7 = pcxImagingParameters4.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters4.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity12 = pcxImagingParameters11.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(pixelDensity12);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getBitDepth();
        int int2 = pcxImagingParameters0.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setCompression((int) '#');
        int int5 = pcxImagingParameters4.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setPixelDensity(pixelDensity4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBitDepth((int) '#');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setFileName("");
        java.lang.String str10 = pcxImagingParameters9.getFileName();
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters9.setPixelDensity(pixelDensity11);
        boolean boolean13 = pcxImagingParameters9.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters9.setCompression((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setCompression(0);
        int int16 = pcxImagingParameters15.getPlanes();
        int int17 = pcxImagingParameters15.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setPlanes((int) (byte) 10);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters3.getPixelDensity();
        java.lang.String str7 = pcxImagingParameters3.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setFileName("hi!");
        int int7 = pcxImagingParameters4.getPlanes();
        int int8 = pcxImagingParameters4.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters4.setBitDepth((int) ' ');
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getBitDepth();
        int int2 = pcxImagingParameters0.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setCompression((int) '#');
        int int5 = pcxImagingParameters0.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPlanes((-1));
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setBufferedImageFactory(bufferedImageFactory13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters12.setPlanes(0);
        boolean boolean17 = pcxImagingParameters12.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        int int3 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setFileName("hi!");
        int int6 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setPixelDensity(pixelDensity8);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBitDepth(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters7.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters7.setStrict(true);
        boolean boolean14 = pcxImagingParameters13.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.asThis();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBitDepth(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setFileName("");
        java.lang.String str8 = pcxImagingParameters2.getFileName();
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters2.setPixelDensity(pixelDensity9);
        boolean boolean11 = pcxImagingParameters2.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters2.asThis();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setCompression(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters10.setCompression((int) (short) 10);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory18 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters17.setBufferedImageFactory(bufferedImageFactory18);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters21 = pcxImagingParameters19.setCompression(100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters23 = pcxImagingParameters19.setBitDepth((int) '4');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters25 = pcxImagingParameters19.setBitDepth((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertNotNull(pcxImagingParameters21);
        org.junit.Assert.assertNotNull(pcxImagingParameters23);
        org.junit.Assert.assertNotNull(pcxImagingParameters25);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        int int7 = pcxImagingParameters4.getCompression();
        java.lang.String str8 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.PixelDensity pixelDensity9 = pcxImagingParameters4.getPixelDensity();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(pixelDensity9);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        int int5 = pcxImagingParameters4.getCompression();
        int int6 = pcxImagingParameters4.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters4.setBufferedImageFactory(bufferedImageFactory9);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setCompression((int) (byte) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = pcxImagingParameters10.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNull(pixelDensity13);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        java.lang.String str3 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setFileName("hi!");
        boolean boolean8 = pcxImagingParameters7.isStrict();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.setBufferedImageFactory(bufferedImageFactory9);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters7.setFileName("");
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setCompression((int) (short) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setPlanes((-1));
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters7.setStrict(false);
        int int12 = pcxImagingParameters7.getBitDepth();
        int int13 = pcxImagingParameters7.getCompression();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setBitDepth((int) '#');
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setPixelDensity(pixelDensity9);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters8.asThis();
        java.lang.String str14 = pcxImagingParameters13.getFileName();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setCompression(1);
        org.apache.commons.imaging.PixelDensity pixelDensity5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setPixelDensity(pixelDensity5);
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory8);
        java.lang.String str10 = pcxImagingParameters6.getFileName();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setFileName("hi!");
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPixelDensity(pixelDensity9);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters6.setCompression((int) ' ');
        org.apache.commons.imaging.PixelDensity pixelDensity13 = pcxImagingParameters6.getPixelDensity();
        org.apache.commons.imaging.PixelDensity pixelDensity14 = pcxImagingParameters6.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters6.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNull(pixelDensity13);
        org.junit.Assert.assertNull(pixelDensity14);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBitDepth(0);
        int int5 = pcxImagingParameters0.getBitDepth();
        int int6 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory9);
        int int11 = pcxImagingParameters10.getCompression();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setPlanes((int) 'a');
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters4.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.PixelDensity pixelDensity10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters4.setPixelDensity(pixelDensity10);
        org.apache.commons.imaging.PixelDensity pixelDensity12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setPixelDensity(pixelDensity12);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters11.setStrict(true);
        int int16 = pcxImagingParameters11.getPlanes();
        int int17 = pcxImagingParameters11.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setPixelDensity(pixelDensity6);
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setStrict(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters8.setFileName("");
        org.apache.commons.imaging.PixelDensity pixelDensity12 = pcxImagingParameters11.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters11.setPlanes((int) (short) 0);
        java.lang.Class<?> wildcardClass15 = pcxImagingParameters11.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(pixelDensity12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setFileName("");
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters5.getPixelDensity();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setCompression((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters6.setBitDepth(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setBitDepth((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setCompression((int) ' ');
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters3.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters3.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters3.setCompression((int) (short) -1);
        org.apache.commons.imaging.PixelDensity pixelDensity14 = pcxImagingParameters13.getPixelDensity();
        boolean boolean15 = pcxImagingParameters13.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters13.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(bufferedImageFactory10);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNull(pixelDensity14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setPixelDensity(pixelDensity4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBitDepth((int) '#');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setFileName("");
        java.lang.String str10 = pcxImagingParameters9.getFileName();
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters9.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters9.setPlanes(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        java.lang.String str7 = pcxImagingParameters5.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setPlanes(100);
        org.apache.commons.imaging.PixelDensity pixelDensity10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters5.setPixelDensity(pixelDensity10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters5.setBitDepth((int) (short) 100);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setCompression(0);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory16 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters10.setBufferedImageFactory(bufferedImageFactory16);
        int int18 = pcxImagingParameters17.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        int int5 = pcxImagingParameters4.getCompression();
        int int6 = pcxImagingParameters4.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters4.setBufferedImageFactory(bufferedImageFactory9);
        java.lang.String str11 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.PixelDensity pixelDensity12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters4.setPixelDensity(pixelDensity12);
        boolean boolean14 = pcxImagingParameters4.isStrict();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory15 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters4.setBufferedImageFactory(bufferedImageFactory15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setFileName("");
        int int16 = pcxImagingParameters10.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters10.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters17.setPlanes((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.PixelDensity pixelDensity3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters2.setPixelDensity(pixelDensity3);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters4.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setStrict(true);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters10.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setBufferedImageFactory(bufferedImageFactory12);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters11.setBufferedImageFactory(bufferedImageFactory14);
        java.lang.Class<?> wildcardClass16 = pcxImagingParameters11.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.asThis();
        int int7 = pcxImagingParameters6.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setCompression((int) ' ');
        int int10 = pcxImagingParameters9.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setCompression(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setCompression((int) (short) -1);
        java.lang.Class<?> wildcardClass13 = pcxImagingParameters8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setCompression(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters10.setCompression((int) (short) 10);
        java.lang.String str18 = pcxImagingParameters17.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory19 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters17.setBufferedImageFactory(bufferedImageFactory19);
        int int21 = pcxImagingParameters17.getCompression();
        java.lang.Class<?> wildcardClass22 = pcxImagingParameters17.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(pcxImagingParameters20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setCompression((int) ' ');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setPlanes((int) 'a');
        boolean boolean12 = pcxImagingParameters11.isStrict();
        java.lang.String str13 = pcxImagingParameters11.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters11.setFileName("hi!");
        java.lang.String str16 = pcxImagingParameters11.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters6.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(bufferedImageFactory10);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPlanes((-1));
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory13 = pcxImagingParameters10.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setCompression((int) '#');
        java.lang.Class<?> wildcardClass16 = pcxImagingParameters15.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNull(bufferedImageFactory13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory6);
        int int8 = pcxImagingParameters5.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters5.setPixelDensity(pixelDensity9);
        int int11 = pcxImagingParameters5.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        int int5 = pcxImagingParameters4.getCompression();
        int int6 = pcxImagingParameters4.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setCompression((int) (short) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters4.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setFileName("");
        int int8 = pcxImagingParameters3.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setCompression(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters10.setCompression((int) (short) 10);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory18 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters17.setBufferedImageFactory(bufferedImageFactory18);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters21 = pcxImagingParameters19.setCompression(100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters23 = pcxImagingParameters19.setBitDepth((int) '4');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters25 = pcxImagingParameters23.setStrict(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertNotNull(pcxImagingParameters21);
        org.junit.Assert.assertNotNull(pcxImagingParameters23);
        org.junit.Assert.assertNotNull(pcxImagingParameters25);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setPixelDensity(pixelDensity6);
        org.apache.commons.imaging.PixelDensity pixelDensity8 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = pcxImagingParameters3.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNull(pixelDensity8);
        org.junit.Assert.assertNull(bufferedImageFactory9);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBitDepth((int) (short) 10);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory9);
        java.lang.String str11 = pcxImagingParameters6.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory12);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory14);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters6.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters17.setFileName("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        int int4 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        java.lang.String str9 = pcxImagingParameters8.getFileName();
        int int10 = pcxImagingParameters8.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setPixelDensity(pixelDensity6);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setBitDepth((int) (short) 0);
        int int10 = pcxImagingParameters7.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPlanes((-1));
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setBufferedImageFactory(bufferedImageFactory13);
        boolean boolean15 = pcxImagingParameters14.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters14.setBitDepth((int) (byte) 10);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory18 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters14.setBufferedImageFactory(bufferedImageFactory18);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        int int4 = pcxImagingParameters0.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters0.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setPlanes(32);
        int int8 = pcxImagingParameters7.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setPixelDensity(pixelDensity6);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setPixelDensity(pixelDensity10);
        int int12 = pcxImagingParameters9.getPlanes();
        int int13 = pcxImagingParameters9.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression(10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters0.setStrict(false);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setBufferedImageFactory(bufferedImageFactory11);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNull(bufferedImageFactory8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setFileName("");
        int int12 = pcxImagingParameters9.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters9.setPlanes(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        java.lang.String str6 = pcxImagingParameters5.getFileName();
        boolean boolean7 = pcxImagingParameters5.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBitDepth((int) 'a');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setCompression((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setCompression(1);
        int int11 = pcxImagingParameters8.getPlanes();
        int int12 = pcxImagingParameters8.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters8.setPlanes((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setPixelDensity(pixelDensity6);
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setPixelDensity(pixelDensity8);
        java.lang.Class<?> wildcardClass10 = pcxImagingParameters0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setFileName("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setCompression(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters10.setCompression((int) (short) 10);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory18 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters17.setBufferedImageFactory(bufferedImageFactory18);
        int int20 = pcxImagingParameters19.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters6.setBitDepth(97);
        boolean boolean13 = pcxImagingParameters6.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters3.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.setBitDepth(0);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters5.getPixelDensity();
        int int7 = pcxImagingParameters5.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setCompression((int) (byte) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setCompression((int) (byte) 10);
        java.lang.Class<?> wildcardClass12 = pcxImagingParameters9.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setCompression((int) ' ');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setPlanes((-1));
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters9.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setStrict(true);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory15 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters14.setBufferedImageFactory(bufferedImageFactory15);
        int int17 = pcxImagingParameters16.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBitDepth((int) (short) 100);
        int int9 = pcxImagingParameters5.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters5.setPixelDensity(pixelDensity10);
        int int12 = pcxImagingParameters5.getCompression();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBitDepth(0);
        java.lang.String str5 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setFileName("");
        java.lang.String str8 = pcxImagingParameters0.getFileName();
        int int9 = pcxImagingParameters0.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPlanes((int) (short) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setFileName("");
        int int13 = pcxImagingParameters12.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        java.lang.String str3 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity10 = pcxImagingParameters7.getPixelDensity();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(pixelDensity10);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory6);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters9.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters9.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters12.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setCompression(52);
        boolean boolean16 = pcxImagingParameters13.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        java.lang.String str7 = pcxImagingParameters5.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setPlanes(100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters9.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters9.setCompression((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters12.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity17 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters16.setPixelDensity(pixelDensity17);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(bufferedImageFactory10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setStrict(false);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory11);
        int int13 = pcxImagingParameters12.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity14 = pcxImagingParameters12.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters12.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters15.setPlanes((int) 'a');
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory18 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters15.setBufferedImageFactory(bufferedImageFactory18);
        int int20 = pcxImagingParameters15.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters22 = pcxImagingParameters15.setCompression((int) (byte) -1);
        java.lang.Class<?> wildcardClass23 = pcxImagingParameters15.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNull(pixelDensity14);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters5.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = pcxImagingParameters5.getPixelDensity();
        java.lang.String str9 = pcxImagingParameters5.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters5.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setPlanes((int) (byte) 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNull(bufferedImageFactory7);
        org.junit.Assert.assertNull(pixelDensity8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setCompression((int) (short) 100);
        java.lang.String str9 = pcxImagingParameters6.getFileName();
        int int10 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory11);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory13 = pcxImagingParameters12.getBufferedImageFactory();
        org.apache.commons.imaging.PixelDensity pixelDensity14 = pcxImagingParameters12.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNull(bufferedImageFactory13);
        org.junit.Assert.assertNull(pixelDensity14);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters3.getPixelDensity();
        int int7 = pcxImagingParameters3.getPlanes();
        boolean boolean8 = pcxImagingParameters3.isStrict();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory9);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = pcxImagingParameters10.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setBitDepth((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(bufferedImageFactory11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setPlanes((int) (byte) 10);
        int int7 = pcxImagingParameters6.getBitDepth();
        int int8 = pcxImagingParameters6.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters5.setPlanes(100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setBufferedImageFactory(bufferedImageFactory11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setPlanes(97);
        boolean boolean15 = pcxImagingParameters12.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters12.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters12.setPlanes(32);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setPlanes((int) (byte) -1);
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.PixelDensity pixelDensity10 = pcxImagingParameters9.getPixelDensity();
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters9.setPixelDensity(pixelDensity11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(pixelDensity10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBitDepth(0);
        int int5 = pcxImagingParameters0.getBitDepth();
        int int6 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = pcxImagingParameters0.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(bufferedImageFactory7);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setFileName("hi!");
        int int12 = pcxImagingParameters11.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters11.setBitDepth((int) (short) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters11.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory17 = pcxImagingParameters16.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNull(bufferedImageFactory17);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setStrict(true);
        int int11 = pcxImagingParameters10.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setCompression((int) 'a');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory16 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters13.setBufferedImageFactory(bufferedImageFactory16);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory18 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters17.setBufferedImageFactory(bufferedImageFactory18);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        int int6 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory7);
        boolean boolean9 = pcxImagingParameters8.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setFileName("hi!");
        java.lang.String str8 = pcxImagingParameters3.getFileName();
        org.apache.commons.imaging.PixelDensity pixelDensity9 = pcxImagingParameters3.getPixelDensity();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = pixelDensity9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(pixelDensity9);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setStrict(true);
        int int11 = pcxImagingParameters10.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setCompression((int) 'a');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory16 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters13.setBufferedImageFactory(bufferedImageFactory16);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters13.setCompression(97);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        int int9 = pcxImagingParameters8.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters8.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters12.asThis();
        int int14 = pcxImagingParameters12.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(bufferedImageFactory10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        boolean boolean3 = pcxImagingParameters2.isStrict();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = pcxImagingParameters2.getBufferedImageFactory();
        int int5 = pcxImagingParameters2.getPlanes();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImageFactory4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        java.lang.String str3 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setFileName("hi!");
        boolean boolean8 = pcxImagingParameters7.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.setBitDepth(35);
        boolean boolean11 = pcxImagingParameters10.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPlanes((-1));
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters10.setCompression((int) (byte) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters10.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters17.setStrict(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setStrict(true);
        boolean boolean8 = pcxImagingParameters3.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setCompression((int) (byte) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setPixelDensity(pixelDensity14);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters15.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters17.setFileName("");
        org.apache.commons.imaging.PixelDensity pixelDensity20 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters21 = pcxImagingParameters19.setPixelDensity(pixelDensity20);
        boolean boolean22 = pcxImagingParameters21.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertNotNull(pcxImagingParameters21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters6.getBufferedImageFactory();
        java.lang.String str9 = pcxImagingParameters6.getFileName();
        int int10 = pcxImagingParameters6.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters6.setCompression(0);
        int int13 = pcxImagingParameters6.getPlanes();
        int int14 = pcxImagingParameters6.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory15 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory15);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters6.setFileName("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(bufferedImageFactory8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setPixelDensity(pixelDensity4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBitDepth((int) '#');
        int int8 = pcxImagingParameters5.getCompression();
        int int9 = pcxImagingParameters5.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setBitDepth((int) '#');
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setPixelDensity(pixelDensity9);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters8.asThis();
        java.lang.Class<?> wildcardClass14 = pcxImagingParameters13.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters0.getBufferedImageFactory();
        int int6 = pcxImagingParameters0.getPlanes();
        java.lang.String str7 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setCompression(0);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(false);
        boolean boolean6 = pcxImagingParameters3.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters3.setCompression(32);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory9);
        java.lang.Class<?> wildcardClass11 = pcxImagingParameters10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        java.lang.String str3 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression(100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setPlanes((int) (short) -1);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        int int9 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters0.setPlanes(32);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters0.setCompression(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setPlanes((-1));
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setCompression(32);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters8.setCompression(1);
        int int15 = pcxImagingParameters14.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        int int9 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters0.setPlanes(32);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setBufferedImageFactory(bufferedImageFactory14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setCompression((int) (short) 100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = pcxImagingParameters6.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters6.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters6.setStrict(false);
        int int13 = pcxImagingParameters12.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(bufferedImageFactory9);
        org.junit.Assert.assertNull(bufferedImageFactory10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        int int6 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = pcxImagingParameters3.getBufferedImageFactory();
        boolean boolean10 = pcxImagingParameters3.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters3.setCompression((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(bufferedImageFactory9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setPlanes((int) 'a');
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters4.setPixelDensity(pixelDensity8);
        int int10 = pcxImagingParameters4.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters4.setBitDepth(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setFileName("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setPixelDensity(pixelDensity6);
        int int8 = pcxImagingParameters7.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.setStrict(false);
        int int11 = pcxImagingParameters10.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = pcxImagingParameters6.getPixelDensity();
        int int8 = pcxImagingParameters6.getBitDepth();
        int int9 = pcxImagingParameters6.getCompression();
        java.lang.Class<?> wildcardClass10 = pcxImagingParameters6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(pixelDensity7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        int int3 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory6);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setBufferedImageFactory(bufferedImageFactory8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setCompression(10);
        java.lang.String str12 = pcxImagingParameters11.getFileName();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setPixelDensity(pixelDensity6);
        int int8 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters3.setPlanes((int) '4');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPlanes((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setStrict(false);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory11);
        int int13 = pcxImagingParameters12.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity14 = pcxImagingParameters12.getPixelDensity();
        int int15 = pcxImagingParameters12.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity16 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters12.setPixelDensity(pixelDensity16);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters12.setFileName("");
        java.lang.String str20 = pcxImagingParameters19.getFileName();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNull(pixelDensity14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory6);
        int int8 = pcxImagingParameters7.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.setBitDepth(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setStrict(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBitDepth(0);
        java.lang.String str5 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setPlanes((int) '4');
        int int10 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters0.setCompression(100);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBitDepth(0);
        java.lang.String str5 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setPlanes((int) '4');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters0.setStrict(true);
        int int12 = pcxImagingParameters11.getCompression();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters4.getBufferedImageFactory();
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setPixelDensity(pixelDensity6);
        org.apache.commons.imaging.PixelDensity pixelDensity8 = pcxImagingParameters7.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.setStrict(false);
        int int11 = pcxImagingParameters10.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNull(pixelDensity8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters14.asThis();
        int int16 = pcxImagingParameters15.getPlanes();
        java.lang.String str17 = pcxImagingParameters15.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters15.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity20 = pcxImagingParameters15.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters22 = pcxImagingParameters15.setStrict(false);
        int int23 = pcxImagingParameters22.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertNull(pixelDensity20);
        org.junit.Assert.assertNotNull(pcxImagingParameters22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setBitDepth((int) '#');
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setPixelDensity(pixelDensity9);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = pcxImagingParameters10.getBufferedImageFactory();
        org.apache.commons.imaging.PixelDensity pixelDensity12 = pcxImagingParameters10.getPixelDensity();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(bufferedImageFactory11);
        org.junit.Assert.assertNull(pixelDensity12);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        java.lang.String str7 = pcxImagingParameters5.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setPlanes(100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters9.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters9.setCompression((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity15 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters12.setPixelDensity(pixelDensity15);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters12.setBitDepth((-1));
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory19 = pcxImagingParameters12.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(bufferedImageFactory10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertNull(bufferedImageFactory19);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setCompression(0);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory9);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters6.setCompression(0);
        java.lang.Class<?> wildcardClass13 = pcxImagingParameters6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        int int4 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setPixelDensity(pixelDensity9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        java.lang.String str7 = pcxImagingParameters5.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setPlanes(100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters9.getBufferedImageFactory();
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters9.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setBitDepth((int) (short) 100);
        int int15 = pcxImagingParameters12.getPlanes();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(bufferedImageFactory10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setCompression(10);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setBitDepth(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters8.setFileName("hi!");
        int int12 = pcxImagingParameters8.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        boolean boolean3 = pcxImagingParameters2.isStrict();
        org.apache.commons.imaging.PixelDensity pixelDensity4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setPixelDensity(pixelDensity4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters5.getPixelDensity();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        int int3 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory6);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setBufferedImageFactory(bufferedImageFactory8);
        java.lang.Class<?> wildcardClass10 = pcxImagingParameters9.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setPixelDensity(pixelDensity6);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setBitDepth((int) (short) 0);
        java.lang.Class<?> wildcardClass10 = pcxImagingParameters9.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters5.getPixelDensity();
        int int7 = pcxImagingParameters5.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setCompression((int) (byte) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setCompression((int) (byte) 10);
        int int12 = pcxImagingParameters11.getPlanes();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setPlanes(1);
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters5.setPixelDensity(pixelDensity9);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setStrict(true);
        boolean boolean15 = pcxImagingParameters14.isStrict();
        org.apache.commons.imaging.PixelDensity pixelDensity16 = pcxImagingParameters14.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(pixelDensity16);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setPixelDensity(pixelDensity5);
        int int7 = pcxImagingParameters6.getCompression();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters6.getBufferedImageFactory();
        int int9 = pcxImagingParameters6.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(bufferedImageFactory8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters14.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity16 = pcxImagingParameters14.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters14.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters14.setFileName("hi!");
        org.apache.commons.imaging.PixelDensity pixelDensity21 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters22 = pcxImagingParameters14.setPixelDensity(pixelDensity21);
        org.apache.commons.imaging.PixelDensity pixelDensity23 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters24 = pcxImagingParameters14.setPixelDensity(pixelDensity23);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNull(pixelDensity16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertNotNull(pcxImagingParameters20);
        org.junit.Assert.assertNotNull(pcxImagingParameters22);
        org.junit.Assert.assertNotNull(pcxImagingParameters24);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBitDepth(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setFileName("");
        java.lang.String str8 = pcxImagingParameters2.getFileName();
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters2.setPixelDensity(pixelDensity9);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setCompression((int) (short) 100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setBufferedImageFactory(bufferedImageFactory13);
        int int15 = pcxImagingParameters12.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression(10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setBitDepth(0);
        int int8 = pcxImagingParameters0.getCompression();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters0.setPixelDensity(pixelDensity9);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters0.setStrict(true);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setBufferedImageFactory(bufferedImageFactory14);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters15.setFileName("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        java.lang.String str13 = pcxImagingParameters12.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = pcxImagingParameters12.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters12.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters12.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters18.setBitDepth(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters22 = pcxImagingParameters20.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory23 = pcxImagingParameters22.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(bufferedImageFactory14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertNotNull(pcxImagingParameters20);
        org.junit.Assert.assertNotNull(pcxImagingParameters22);
        org.junit.Assert.assertNull(bufferedImageFactory23);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setBitDepth((int) '#');
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setPixelDensity(pixelDensity9);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setPlanes((int) (byte) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setFileName("");
        java.lang.String str15 = pcxImagingParameters14.getFileName();
        java.lang.Class<?> wildcardClass16 = pcxImagingParameters14.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters5.getPixelDensity();
        int int7 = pcxImagingParameters5.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setCompression((int) (byte) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setCompression((int) (byte) 10);
        int int12 = pcxImagingParameters11.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        int int6 = pcxImagingParameters3.getBitDepth();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.PixelDensity pixelDensity3 = pcxImagingParameters2.getPixelDensity();
        java.lang.String str4 = pcxImagingParameters2.getFileName();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(pixelDensity3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters5.setPlanes(100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setBufferedImageFactory(bufferedImageFactory11);
        int int13 = pcxImagingParameters10.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setPlanes((int) '4');
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory16 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters15.setBufferedImageFactory(bufferedImageFactory16);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        boolean boolean4 = pcxImagingParameters2.isStrict();
        boolean boolean5 = pcxImagingParameters2.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        int int9 = pcxImagingParameters6.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters6.setBitDepth(1);
        org.apache.commons.imaging.PixelDensity pixelDensity12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setPixelDensity(pixelDensity12);
        java.lang.String str14 = pcxImagingParameters13.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setCompression(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory5);
        int int7 = pcxImagingParameters6.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setPlanes(32);
        java.lang.Class<?> wildcardClass10 = pcxImagingParameters6.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setPixelDensity(pixelDensity4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBitDepth((int) '#');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters5.getBufferedImageFactory();
        int int11 = pcxImagingParameters5.getPlanes();
        boolean boolean12 = pcxImagingParameters5.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(bufferedImageFactory10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        int int11 = pcxImagingParameters10.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity12 = pcxImagingParameters10.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(pixelDensity12);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters4.setBufferedImageFactory(bufferedImageFactory9);
        int int11 = pcxImagingParameters10.getCompression();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setStrict(true);
        java.lang.String str13 = pcxImagingParameters10.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setCompression((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setPixelDensity(pixelDensity9);
        java.lang.Class<?> wildcardClass11 = pcxImagingParameters8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters14.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters14.setFileName("hi!");
        int int18 = pcxImagingParameters14.getPlanes();
        int int19 = pcxImagingParameters14.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters14.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters22 = pcxImagingParameters14.setStrict(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(pcxImagingParameters20);
        org.junit.Assert.assertNotNull(pcxImagingParameters22);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters14.asThis();
        int int16 = pcxImagingParameters15.getPlanes();
        java.lang.String str17 = pcxImagingParameters15.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters15.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity20 = pcxImagingParameters15.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters22 = pcxImagingParameters15.setCompression((int) (byte) 0);
        int int23 = pcxImagingParameters15.getCompression();
        java.lang.String str24 = pcxImagingParameters15.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertNull(pixelDensity20);
        org.junit.Assert.assertNotNull(pcxImagingParameters22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) ' ');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters6.setFileName("");
        java.lang.String str13 = pcxImagingParameters6.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters9.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters9.setPixelDensity(pixelDensity13);
        int int15 = pcxImagingParameters14.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setStrict(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setPlanes((int) '4');
        int int9 = pcxImagingParameters8.getPlanes();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setPixelDensity(pixelDensity5);
        int int7 = pcxImagingParameters6.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters9.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters9.setBufferedImageFactory(bufferedImageFactory11);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setCompression(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters10.setCompression((int) (short) 10);
        org.apache.commons.imaging.PixelDensity pixelDensity18 = pcxImagingParameters17.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters17.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters17.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory21 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters22 = pcxImagingParameters17.setBufferedImageFactory(bufferedImageFactory21);
        java.lang.Class<?> wildcardClass23 = pcxImagingParameters22.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNull(pixelDensity18);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertNotNull(pcxImagingParameters20);
        org.junit.Assert.assertNotNull(pcxImagingParameters22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters0.getBufferedImageFactory();
        int int6 = pcxImagingParameters0.getPlanes();
        java.lang.String str7 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setBitDepth(52);
        int int10 = pcxImagingParameters0.getPlanes();
        boolean boolean11 = pcxImagingParameters0.isStrict();
        int int12 = pcxImagingParameters0.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        int int4 = pcxImagingParameters0.getPlanes();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        boolean boolean9 = pcxImagingParameters6.isStrict();
        java.lang.Class<?> wildcardClass10 = pcxImagingParameters6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setPixelDensity(pixelDensity4);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        java.lang.String str3 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression(100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = pcxImagingParameters5.getBufferedImageFactory();
        boolean boolean8 = pcxImagingParameters5.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNull(bufferedImageFactory7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        int int6 = pcxImagingParameters3.getBitDepth();
        java.lang.String str7 = pcxImagingParameters3.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setStrict(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setCompression(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters10.setCompression((int) (short) 10);
        java.lang.String str18 = pcxImagingParameters17.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory19 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters17.setBufferedImageFactory(bufferedImageFactory19);
        org.apache.commons.imaging.PixelDensity pixelDensity21 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters22 = pcxImagingParameters17.setPixelDensity(pixelDensity21);
        java.lang.String str23 = pcxImagingParameters17.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters25 = pcxImagingParameters17.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters27 = pcxImagingParameters25.setCompression((int) '4');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters29 = pcxImagingParameters27.setStrict(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(pcxImagingParameters20);
        org.junit.Assert.assertNotNull(pcxImagingParameters22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(pcxImagingParameters25);
        org.junit.Assert.assertNotNull(pcxImagingParameters27);
        org.junit.Assert.assertNotNull(pcxImagingParameters29);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setPixelDensity(pixelDensity4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBitDepth((int) '#');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters5.setCompression((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        int int6 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters8.setBitDepth(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        int int3 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory6);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setStrict(true);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setCompression((int) ' ');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setPlanes((int) 'a');
        int int12 = pcxImagingParameters9.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters9.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters14.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters15.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters15.setCompression((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) ' ');
        int int11 = pcxImagingParameters6.getCompression();
        boolean boolean12 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters6.setCompression((int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = pcxImagingParameters6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setStrict(true);
        int int11 = pcxImagingParameters10.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setCompression((int) 'a');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory16 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters13.setBufferedImageFactory(bufferedImageFactory16);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory18 = pcxImagingParameters13.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNull(bufferedImageFactory18);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setStrict(false);
        java.lang.Class<?> wildcardClass10 = pcxImagingParameters9.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        int int4 = pcxImagingParameters3.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.setFileName("hi!");
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setFileName("");
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression(10);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters0.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters0.setCompression(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters0.asThis();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        int int9 = pcxImagingParameters8.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters8.setStrict(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setFileName("");
        org.apache.commons.imaging.PixelDensity pixelDensity10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setPixelDensity(pixelDensity10);
        org.apache.commons.imaging.PixelDensity pixelDensity12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters9.setPixelDensity(pixelDensity12);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters9.setStrict(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setPlanes((int) '4');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters10.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setPlanes((-1));
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = pcxImagingParameters13.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNull(bufferedImageFactory14);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters0.getPixelDensity();
        int int7 = pcxImagingParameters0.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setPixelDensity(pixelDensity8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters8.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters8.setStrict(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setCompression(1);
        org.apache.commons.imaging.PixelDensity pixelDensity5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setPixelDensity(pixelDensity5);
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters6.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes(100);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setPlanes((int) '4');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setBufferedImageFactory(bufferedImageFactory10);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory12 = pcxImagingParameters11.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(bufferedImageFactory12);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setCompression(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters10.setCompression((int) (short) 10);
        org.apache.commons.imaging.PixelDensity pixelDensity18 = pcxImagingParameters17.getPixelDensity();
        boolean boolean19 = pcxImagingParameters17.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNull(pixelDensity18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setCompression((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setCompression((int) (byte) 10);
        int int16 = pcxImagingParameters15.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity17 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters15.setPixelDensity(pixelDensity17);
        java.lang.String str19 = pcxImagingParameters15.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters21 = pcxImagingParameters15.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters22 = pcxImagingParameters15.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory23 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters24 = pcxImagingParameters22.setBufferedImageFactory(bufferedImageFactory23);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters26 = pcxImagingParameters24.setFileName("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters21);
        org.junit.Assert.assertNotNull(pcxImagingParameters22);
        org.junit.Assert.assertNotNull(pcxImagingParameters24);
        org.junit.Assert.assertNotNull(pcxImagingParameters26);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setCompression((int) (byte) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setPixelDensity(pixelDensity14);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters15.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters17.setFileName("");
        int int20 = pcxImagingParameters19.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters5.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory9);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = pcxImagingParameters8.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(bufferedImageFactory11);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters6.getBufferedImageFactory();
        java.lang.String str9 = pcxImagingParameters6.getFileName();
        int int10 = pcxImagingParameters6.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters6.setCompression(0);
        int int13 = pcxImagingParameters6.getPlanes();
        int int14 = pcxImagingParameters6.getPlanes();
        java.lang.String str15 = pcxImagingParameters6.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(bufferedImageFactory8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters14.asThis();
        int int16 = pcxImagingParameters15.getPlanes();
        java.lang.String str17 = pcxImagingParameters15.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters15.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity20 = pcxImagingParameters15.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters22 = pcxImagingParameters15.setCompression((int) (byte) 0);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory23 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters24 = pcxImagingParameters22.setBufferedImageFactory(bufferedImageFactory23);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters25 = pcxImagingParameters24.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertNull(pixelDensity20);
        org.junit.Assert.assertNotNull(pcxImagingParameters22);
        org.junit.Assert.assertNotNull(pcxImagingParameters24);
        org.junit.Assert.assertNotNull(pcxImagingParameters25);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity7 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setBitDepth((int) '#');
        boolean boolean10 = pcxImagingParameters3.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(pixelDensity7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory6);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters9.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters9.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters12.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setCompression(52);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters13.setPlanes(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setCompression((int) (byte) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setPixelDensity(pixelDensity14);
        org.apache.commons.imaging.PixelDensity pixelDensity16 = pcxImagingParameters13.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters13.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters13.setFileName("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNull(pixelDensity16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertNotNull(pcxImagingParameters20);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setPlanes(35);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setBitDepth((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setFileName("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.asThis();
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setBitDepth((int) (byte) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters6.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters6.setStrict(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBitDepth((int) (byte) 100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters5.setBitDepth(52);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters5.asThis();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        int int9 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters0.setPlanes((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression(10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.asThis();
        java.lang.String str8 = pcxImagingParameters0.getFileName();
        int int9 = pcxImagingParameters0.getCompression();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        int int7 = pcxImagingParameters4.getCompression();
        java.lang.String str8 = pcxImagingParameters4.getFileName();
        int int9 = pcxImagingParameters4.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity10 = pcxImagingParameters4.getPixelDensity();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(pixelDensity10);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        int int4 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        java.lang.String str9 = pcxImagingParameters8.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory10);
        org.apache.commons.imaging.PixelDensity pixelDensity12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters8.setPixelDensity(pixelDensity12);
        java.lang.String str14 = pcxImagingParameters13.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPlanes((int) '4');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setStrict(true);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPlanes((-1));
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setBufferedImageFactory(bufferedImageFactory13);
        boolean boolean15 = pcxImagingParameters14.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters14.setBitDepth((int) (byte) 10);
        int int18 = pcxImagingParameters14.getBitDepth();
        int int19 = pcxImagingParameters14.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setPixelDensity(pixelDensity4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBitDepth((int) '#');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters5.getBufferedImageFactory();
        java.lang.String str11 = pcxImagingParameters5.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(bufferedImageFactory10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setCompression(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory5);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setBitDepth(97);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters0.getPixelDensity();
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setPixelDensity(pixelDensity7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBitDepth(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setStrict(true);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setBufferedImageFactory(bufferedImageFactory8);
        int int10 = pcxImagingParameters9.getPlanes();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setStrict(false);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setCompression((int) (short) 100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setBufferedImageFactory(bufferedImageFactory8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters7.setFileName("hi!");
        int int12 = pcxImagingParameters11.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setCompression((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters8.getFileName();
        int int12 = pcxImagingParameters8.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory6);
        int int8 = pcxImagingParameters5.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters5.setPixelDensity(pixelDensity9);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters5.setPlanes((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.asThis();
        int int16 = pcxImagingParameters15.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setPixelDensity(pixelDensity6);
        int int8 = pcxImagingParameters7.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.setBitDepth(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters8.setFileName("");
        org.apache.commons.imaging.PixelDensity pixelDensity12 = pcxImagingParameters11.getPixelDensity();
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters11.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.PixelDensity pixelDensity15 = pcxImagingParameters11.getPixelDensity();
        int int16 = pcxImagingParameters11.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(pixelDensity12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNull(pixelDensity15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setStrict(false);
        int int10 = pcxImagingParameters9.getPlanes();
        int int11 = pcxImagingParameters9.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters9.asThis();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters0.getPixelDensity();
        java.lang.String str7 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setPlanes((int) ' ');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters9.setPlanes((int) 'a');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters13.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setPixelDensity(pixelDensity4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBitDepth((int) '#');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setFileName("");
        java.lang.String str10 = pcxImagingParameters9.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters9.setStrict(false);
        boolean boolean13 = pcxImagingParameters12.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setStrict(true);
        int int11 = pcxImagingParameters10.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setCompression((int) 'a');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory16 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters13.setBufferedImageFactory(bufferedImageFactory16);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory18 = pcxImagingParameters17.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNull(bufferedImageFactory18);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setFileName("hi!");
        int int12 = pcxImagingParameters11.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters11.setBitDepth((int) (short) 1);
        org.apache.commons.imaging.PixelDensity pixelDensity15 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters11.setPixelDensity(pixelDensity15);
        int int17 = pcxImagingParameters16.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setCompression(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setBufferedImageFactory(bufferedImageFactory5);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = pcxImagingParameters6.getPixelDensity();
        int int8 = pcxImagingParameters6.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(pixelDensity7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters4.asThis();
        int int6 = pcxImagingParameters4.getCompression();
        java.lang.String str7 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters4.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.PixelDensity pixelDensity10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters4.setPixelDensity(pixelDensity10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        boolean boolean4 = pcxImagingParameters2.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters2.setStrict(false);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setCompression(1);
        int int5 = pcxImagingParameters4.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters7.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setFileName("");
        boolean boolean12 = pcxImagingParameters9.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNull(bufferedImageFactory8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setCompression((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters8.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters8.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = pcxImagingParameters8.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNull(bufferedImageFactory14);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBitDepth(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters2.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.PixelDensity pixelDensity12 = pcxImagingParameters2.getPixelDensity();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(pixelDensity12);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setPlanes((int) '4');
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters7.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setBitDepth((int) ' ');
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setCompression((-1));
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setBitDepth((int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = pcxImagingParameters14.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setCompression((int) ' ');
        int int10 = pcxImagingParameters9.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        int int9 = pcxImagingParameters6.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters6.setBitDepth(1);
        org.apache.commons.imaging.PixelDensity pixelDensity12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setPixelDensity(pixelDensity12);
        org.apache.commons.imaging.PixelDensity pixelDensity14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters11.setPixelDensity(pixelDensity14);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters15.setCompression((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setStrict(true);
        int int11 = pcxImagingParameters10.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setCompression(1);
        int int14 = pcxImagingParameters13.getPlanes();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setCompression(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setCompression(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory6);
        int int8 = pcxImagingParameters7.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.setPixelDensity(pixelDensity9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        int int7 = pcxImagingParameters4.getCompression();
        java.lang.String str8 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters4.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters10.asThis();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        boolean boolean3 = pcxImagingParameters2.isStrict();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = pcxImagingParameters2.getBufferedImageFactory();
        boolean boolean5 = pcxImagingParameters2.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImageFactory4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        boolean boolean2 = pcxImagingParameters0.isStrict();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        int int4 = pcxImagingParameters0.getBitDepth();
        boolean boolean5 = pcxImagingParameters0.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setCompression(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        int int4 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setFileName("");
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setCompression(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setBitDepth(10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = pcxImagingParameters11.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters11.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters11.setBitDepth((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNull(bufferedImageFactory14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.setCompression((int) (byte) -1);
        int int7 = pcxImagingParameters3.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBitDepth(0);
        boolean boolean6 = pcxImagingParameters5.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setPlanes((int) (byte) 10);
        org.apache.commons.imaging.PixelDensity pixelDensity9 = pcxImagingParameters5.getPixelDensity();
        int int10 = pcxImagingParameters5.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(pixelDensity9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setCompression(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters10.setCompression((int) (short) 10);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory18 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters10.setBufferedImageFactory(bufferedImageFactory18);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters21 = pcxImagingParameters19.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters23 = pcxImagingParameters19.setBitDepth((int) ' ');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters25 = pcxImagingParameters19.setFileName("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertNotNull(pcxImagingParameters21);
        org.junit.Assert.assertNotNull(pcxImagingParameters23);
        org.junit.Assert.assertNotNull(pcxImagingParameters25);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters4.getBufferedImageFactory();
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setPixelDensity(pixelDensity6);
        org.apache.commons.imaging.PixelDensity pixelDensity8 = pcxImagingParameters7.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.setBitDepth((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNull(pixelDensity8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters5.setPlanes(100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setBufferedImageFactory(bufferedImageFactory11);
        int int13 = pcxImagingParameters10.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setPlanes((int) '4');
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory16 = pcxImagingParameters10.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters10.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters18.setFileName("hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNull(bufferedImageFactory16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertNotNull(pcxImagingParameters20);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setPixelDensity(pixelDensity6);
        int int8 = pcxImagingParameters3.getCompression();
        java.lang.String str9 = pcxImagingParameters3.getFileName();
        int int10 = pcxImagingParameters3.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters3.setCompression(100);
        java.lang.String str13 = pcxImagingParameters12.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = pcxImagingParameters12.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(bufferedImageFactory14);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory6);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters9.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters9.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setBufferedImageFactory(bufferedImageFactory13);
        boolean boolean15 = pcxImagingParameters14.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters9.setStrict(false);
        org.apache.commons.imaging.PixelDensity pixelDensity14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setPixelDensity(pixelDensity14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters5.setPlanes(100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setBufferedImageFactory(bufferedImageFactory11);
        int int13 = pcxImagingParameters10.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setPlanes((int) '4');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters15.setStrict(false);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory18 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters15.setBufferedImageFactory(bufferedImageFactory18);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters21 = pcxImagingParameters15.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters23 = pcxImagingParameters21.setFileName("hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertNotNull(pcxImagingParameters21);
        org.junit.Assert.assertNotNull(pcxImagingParameters23);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setStrict(false);
        boolean boolean9 = pcxImagingParameters0.isStrict();
        java.lang.Class<?> wildcardClass10 = pcxImagingParameters0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setCompression(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setBitDepth(10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setPlanes((int) ' ');
        java.lang.String str14 = pcxImagingParameters13.getFileName();
        boolean boolean15 = pcxImagingParameters13.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setCompression((-1));
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.asThis();
        int int14 = pcxImagingParameters13.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity15 = pcxImagingParameters13.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters13.setPlanes(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNull(pixelDensity15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        int int6 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters3.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters3.setPlanes(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setCompression((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setCompression((int) (byte) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters13.setBitDepth((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters13.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters21 = pcxImagingParameters19.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters22 = pcxImagingParameters21.asThis();
        int int23 = pcxImagingParameters21.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertNotNull(pcxImagingParameters21);
        org.junit.Assert.assertNotNull(pcxImagingParameters22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = pcxImagingParameters11.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters11.setFileName("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNull(bufferedImageFactory14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBitDepth(0);
        int int6 = pcxImagingParameters5.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory9);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPlanes((int) (short) 100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setBufferedImageFactory(bufferedImageFactory13);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setPlanes((int) 'a');
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters4.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.PixelDensity pixelDensity10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters4.setPixelDensity(pixelDensity10);
        org.apache.commons.imaging.PixelDensity pixelDensity12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setPixelDensity(pixelDensity12);
        boolean boolean14 = pcxImagingParameters11.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        int int3 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory4);
        int int6 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = pcxImagingParameters8.getBufferedImageFactory();
        int int10 = pcxImagingParameters8.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity11 = pcxImagingParameters8.getPixelDensity();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(bufferedImageFactory9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(pixelDensity11);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPlanes((int) (short) 0);
        int int15 = pcxImagingParameters10.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters10.asThis();
        java.lang.Class<?> wildcardClass17 = pcxImagingParameters10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setCompression((int) (byte) 0);
        boolean boolean14 = pcxImagingParameters10.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters10.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity17 = pcxImagingParameters16.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNull(pixelDensity17);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        java.lang.String str13 = pcxImagingParameters12.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = pcxImagingParameters12.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters12.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters16.setPlanes((int) (byte) 0);
        int int19 = pcxImagingParameters18.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity20 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters21 = pcxImagingParameters18.setPixelDensity(pixelDensity20);
        org.apache.commons.imaging.PixelDensity pixelDensity22 = pcxImagingParameters18.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(bufferedImageFactory14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters21);
        org.junit.Assert.assertNull(pixelDensity22);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory6);
        int int8 = pcxImagingParameters5.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters5.setPlanes((int) (short) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setCompression((int) 'a');
        int int13 = pcxImagingParameters10.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        int int5 = pcxImagingParameters4.getCompression();
        int int6 = pcxImagingParameters4.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters4.setBufferedImageFactory(bufferedImageFactory9);
        java.lang.String str11 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters4.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setBufferedImageFactory(bufferedImageFactory14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters6.getBufferedImageFactory();
        java.lang.String str9 = pcxImagingParameters6.getFileName();
        int int10 = pcxImagingParameters6.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters6.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setBufferedImageFactory(bufferedImageFactory13);
        int int15 = pcxImagingParameters12.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(bufferedImageFactory8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBitDepth(0);
        java.lang.String str5 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setBitDepth((int) (short) 1);
        java.lang.Class<?> wildcardClass8 = pcxImagingParameters0.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setCompression((-1));
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters13.setFileName("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setStrict(true);
        int int15 = pcxImagingParameters14.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory16 = pcxImagingParameters14.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters14.setBitDepth(0);
        org.apache.commons.imaging.PixelDensity pixelDensity19 = pcxImagingParameters18.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(bufferedImageFactory16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertNull(pixelDensity19);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters2.getBufferedImageFactory();
        boolean boolean6 = pcxImagingParameters2.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.asThis();
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setFileName("");
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setPlanes((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = pcxImagingParameters8.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setPlanes((int) (byte) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters3.getBufferedImageFactory();
        java.lang.String str9 = pcxImagingParameters3.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNull(bufferedImageFactory8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        int int2 = pcxImagingParameters0.getCompression();
        boolean boolean3 = pcxImagingParameters0.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters9.asThis();
        java.lang.String str13 = pcxImagingParameters9.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters9.setStrict(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setCompression((-1));
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setBitDepth((int) (byte) 100);
        int int15 = pcxImagingParameters10.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setCompression((int) ' ');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setPlanes((int) 'a');
        int int12 = pcxImagingParameters9.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters9.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters14.asThis();
        java.lang.Class<?> wildcardClass16 = pcxImagingParameters14.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters5.setBitDepth((int) (short) -1);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters5.asThis();
        boolean boolean7 = pcxImagingParameters5.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory9);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters10.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters5.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setCompression((-1));
        boolean boolean10 = pcxImagingParameters9.isStrict();
        int int11 = pcxImagingParameters9.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters9.setPlanes((int) (byte) 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNull(bufferedImageFactory7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        java.lang.String str7 = pcxImagingParameters5.getFileName();
        boolean boolean8 = pcxImagingParameters5.isStrict();
        int int9 = pcxImagingParameters5.getPlanes();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory6);
        java.lang.Class<?> wildcardClass8 = pcxImagingParameters3.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        java.lang.String str3 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setFileName("hi!");
        boolean boolean8 = pcxImagingParameters7.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.setBitDepth(35);
        int int11 = pcxImagingParameters10.getCompression();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        int int9 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        int int7 = pcxImagingParameters4.getCompression();
        java.lang.String str8 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters4.setBitDepth(97);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = pcxImagingParameters10.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setPlanes((int) ' ');
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(pixelDensity11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setStrict(false);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = pcxImagingParameters8.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters8.setPlanes((int) 'a');
        org.apache.commons.imaging.PixelDensity pixelDensity12 = pcxImagingParameters8.getPixelDensity();
        boolean boolean13 = pcxImagingParameters8.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(bufferedImageFactory9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(pixelDensity12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory6);
        int int8 = pcxImagingParameters5.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters5.setPlanes(0);
        int int11 = pcxImagingParameters10.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBitDepth((int) 'a');
        java.lang.Class<?> wildcardClass9 = pcxImagingParameters6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        int int4 = pcxImagingParameters3.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters3.setCompression((int) (byte) 0);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = pcxImagingParameters3.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters3.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(bufferedImageFactory9);
        org.junit.Assert.assertNull(bufferedImageFactory10);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setStrict(false);
        int int9 = pcxImagingParameters8.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setPlanes((-1));
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters4.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters10.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory12 = pcxImagingParameters11.getBufferedImageFactory();
        int int13 = pcxImagingParameters11.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(bufferedImageFactory12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        int int13 = pcxImagingParameters12.getCompression();
        boolean boolean14 = pcxImagingParameters12.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters12.setBitDepth((-1));
        int int17 = pcxImagingParameters16.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setPlanes((int) (short) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters11.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters12.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = pcxImagingParameters12.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory15 = pcxImagingParameters12.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNull(bufferedImageFactory14);
        org.junit.Assert.assertNull(bufferedImageFactory15);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        boolean boolean12 = pcxImagingParameters10.isStrict();
        int int13 = pcxImagingParameters10.getCompression();
        java.lang.String str14 = pcxImagingParameters10.getFileName();
        int int15 = pcxImagingParameters10.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setFileName("");
        org.apache.commons.imaging.PixelDensity pixelDensity10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setPixelDensity(pixelDensity10);
        org.apache.commons.imaging.PixelDensity pixelDensity12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters9.setPixelDensity(pixelDensity12);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters9.setPlanes(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setStrict(true);
        int int6 = pcxImagingParameters5.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBitDepth((int) '4');
        java.lang.String str9 = pcxImagingParameters5.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters5.setBitDepth(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setCompression((-1));
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setStrict(false);
        java.lang.Class<?> wildcardClass16 = pcxImagingParameters13.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters0.getBufferedImageFactory();
        int int6 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setPlanes(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters0.getPixelDensity();
        boolean boolean7 = pcxImagingParameters0.isStrict();
        int int8 = pcxImagingParameters0.getBitDepth();
        int int9 = pcxImagingParameters0.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters0.setCompression((int) '#');
        int int12 = pcxImagingParameters0.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBitDepth((int) (byte) 100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setPlanes(1);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBitDepth(0);
        int int6 = pcxImagingParameters5.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setStrict(true);
        int int9 = pcxImagingParameters5.getPlanes();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        int int3 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory4);
        int int6 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = pcxImagingParameters8.getBufferedImageFactory();
        int int10 = pcxImagingParameters8.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setPlanes((int) ' ');
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(bufferedImageFactory9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setCompression(1);
        org.apache.commons.imaging.PixelDensity pixelDensity5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setPixelDensity(pixelDensity5);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = pcxImagingParameters4.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters4.setBitDepth((int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = pcxImagingParameters9.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(pixelDensity7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBitDepth((int) '#');
        org.apache.commons.imaging.PixelDensity pixelDensity9 = pcxImagingParameters6.getPixelDensity();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(pixelDensity9);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPlanes((-1));
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setBufferedImageFactory(bufferedImageFactory13);
        boolean boolean15 = pcxImagingParameters14.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters14.setBitDepth((int) (byte) 10);
        int int18 = pcxImagingParameters14.getBitDepth();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory19 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters14.setBufferedImageFactory(bufferedImageFactory19);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory21 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters22 = pcxImagingParameters20.setBufferedImageFactory(bufferedImageFactory21);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(pcxImagingParameters20);
        org.junit.Assert.assertNotNull(pcxImagingParameters22);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters0.setPixelDensity(pixelDensity9);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters0.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters0.setCompression(100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters15.setBitDepth((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        int int4 = pcxImagingParameters0.getBitDepth();
        int int5 = pcxImagingParameters0.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        int int9 = pcxImagingParameters6.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters6.setBitDepth(1);
        org.apache.commons.imaging.PixelDensity pixelDensity12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setPixelDensity(pixelDensity12);
        org.apache.commons.imaging.PixelDensity pixelDensity14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters11.setPixelDensity(pixelDensity14);
        java.lang.Class<?> wildcardClass16 = pcxImagingParameters15.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory6);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setBitDepth((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters9.setPixelDensity(pixelDensity12);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setPlanes((-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        int int9 = pcxImagingParameters8.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters8.setCompression(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters11.setBitDepth(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setFileName("hi!");
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setPixelDensity(pixelDensity8);
        int int10 = pcxImagingParameters3.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setStrict(false);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory11);
        int int13 = pcxImagingParameters12.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity14 = pcxImagingParameters12.getPixelDensity();
        int int15 = pcxImagingParameters12.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters12.setFileName("hi!");
        java.lang.Class<?> wildcardClass18 = pcxImagingParameters17.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNull(pixelDensity14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBitDepth(0);
        java.lang.String str5 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters0.getPixelDensity();
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setPixelDensity(pixelDensity7);
        int int9 = pcxImagingParameters8.getPlanes();
        int int10 = pcxImagingParameters8.getPlanes();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setStrict(true);
        int int6 = pcxImagingParameters5.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBitDepth((int) '4');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setPlanes((int) '#');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters8.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = pcxImagingParameters8.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters8.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(bufferedImageFactory9);
        org.junit.Assert.assertNull(bufferedImageFactory10);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        int int9 = pcxImagingParameters8.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters8.setCompression(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setStrict(false);
        int int14 = pcxImagingParameters11.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setPixelDensity(pixelDensity4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters3.setBitDepth((int) (byte) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory10);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters9.asThis();
        java.lang.String str13 = pcxImagingParameters9.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters9.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.PixelDensity pixelDensity16 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters15.setPixelDensity(pixelDensity16);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters17.setFileName("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        int int4 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters0.setBitDepth(32);
        int int11 = pcxImagingParameters10.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters5.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setCompression(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters10.asThis();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters10.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory12 = pcxImagingParameters10.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(bufferedImageFactory12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPlanes((-1));
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setBufferedImageFactory(bufferedImageFactory13);
        boolean boolean15 = pcxImagingParameters14.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters14.setBitDepth((int) (byte) 10);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory18 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters17.setBufferedImageFactory(bufferedImageFactory18);
        int int20 = pcxImagingParameters19.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        java.lang.String str3 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setStrict(true);
        int int10 = pcxImagingParameters9.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity7 = pcxImagingParameters6.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        boolean boolean9 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.asThis();
        java.lang.String str11 = pcxImagingParameters6.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(pixelDensity7);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory6);
        int int8 = pcxImagingParameters5.getCompression();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory9);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters5.setPixelDensity(pixelDensity11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setPixelDensity(pixelDensity6);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters7.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.setBufferedImageFactory(bufferedImageFactory9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNull(bufferedImageFactory8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setBufferedImageFactory(bufferedImageFactory7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setPixelDensity(pixelDensity6);
        int int8 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = pcxImagingParameters3.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters3.setCompression(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(bufferedImageFactory9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters0.getPixelDensity();
        java.lang.String str7 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setPlanes((int) ' ');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters9.setPlanes((int) 'a');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters9.setStrict(true);
        java.lang.String str16 = pcxImagingParameters15.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBitDepth((int) (short) 10);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory9);
        java.lang.String str11 = pcxImagingParameters6.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory12);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters6.setFileName("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setFileName("hi!");
        int int12 = pcxImagingParameters11.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters11.setBitDepth((int) (short) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters11.setFileName("");
        int int17 = pcxImagingParameters11.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity18 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters11.setPixelDensity(pixelDensity18);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBitDepth((int) (byte) 100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters5.setPlanes((int) (byte) -1);
        int int12 = pcxImagingParameters5.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        java.lang.String str13 = pcxImagingParameters12.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters12.setCompression((int) (short) 10);
        java.lang.String str16 = pcxImagingParameters12.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory17 = pcxImagingParameters12.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(bufferedImageFactory17);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setPixelDensity(pixelDensity6);
        int int8 = pcxImagingParameters3.getCompression();
        int int9 = pcxImagingParameters3.getPlanes();
        java.lang.String str10 = pcxImagingParameters3.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory11);
        int int13 = pcxImagingParameters3.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        int int9 = pcxImagingParameters8.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBitDepth(0);
        java.lang.String str5 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters0.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setStrict(false);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters5.getPixelDensity();
        org.apache.commons.imaging.PixelDensity pixelDensity7 = pcxImagingParameters5.getPixelDensity();
        java.lang.Class<?> wildcardClass8 = pcxImagingParameters5.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNull(pixelDensity7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        int int4 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        java.lang.Class<?> wildcardClass9 = pcxImagingParameters8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setBitDepth((int) '#');
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setPixelDensity(pixelDensity9);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters8.asThis();
        int int14 = pcxImagingParameters8.getCompression();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters9.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setBufferedImageFactory(bufferedImageFactory11);
        int int13 = pcxImagingParameters10.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters6.setBitDepth(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        boolean boolean3 = pcxImagingParameters2.isStrict();
        org.apache.commons.imaging.PixelDensity pixelDensity4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setPixelDensity(pixelDensity4);
        boolean boolean6 = pcxImagingParameters2.isStrict();
        int int7 = pcxImagingParameters2.getCompression();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = pcxImagingParameters8.getBufferedImageFactory();
        java.lang.String str10 = pcxImagingParameters8.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(bufferedImageFactory9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory6);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters9.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = pcxImagingParameters10.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(bufferedImageFactory11);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        java.lang.String str3 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setFileName("");
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setFileName("hi!");
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.PixelDensity pixelDensity10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters3.setPixelDensity(pixelDensity10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setFileName("");
        int int14 = pcxImagingParameters11.getPlanes();
        int int15 = pcxImagingParameters11.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setPlanes((int) '4');
        int int8 = pcxImagingParameters2.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters2.setPixelDensity(pixelDensity9);
        int int11 = pcxImagingParameters10.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setCompression(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters10.setCompression((int) (short) 10);
        org.apache.commons.imaging.PixelDensity pixelDensity18 = pcxImagingParameters17.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters17.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters17.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters21 = pcxImagingParameters17.asThis();
        int int22 = pcxImagingParameters17.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNull(pixelDensity18);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertNotNull(pcxImagingParameters20);
        org.junit.Assert.assertNotNull(pcxImagingParameters21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setPixelDensity(pixelDensity6);
        int int8 = pcxImagingParameters3.getCompression();
        java.lang.String str9 = pcxImagingParameters3.getFileName();
        int int10 = pcxImagingParameters3.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters3.setCompression(100);
        java.lang.String str13 = pcxImagingParameters12.getFileName();
        int int14 = pcxImagingParameters12.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters14.asThis();
        int int16 = pcxImagingParameters15.getPlanes();
        java.lang.String str17 = pcxImagingParameters15.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters15.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity20 = pcxImagingParameters15.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters22 = pcxImagingParameters15.setPlanes((int) (short) 1);
        int int23 = pcxImagingParameters22.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters25 = pcxImagingParameters22.setStrict(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertNull(pixelDensity20);
        org.junit.Assert.assertNotNull(pcxImagingParameters22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(pcxImagingParameters25);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBitDepth(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setCompression((int) 'a');
        int int8 = pcxImagingParameters7.getCompression();
        boolean boolean9 = pcxImagingParameters7.isStrict();
        boolean boolean10 = pcxImagingParameters7.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = pcxImagingParameters0.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setBitDepth((int) (short) 0);
        int int11 = pcxImagingParameters10.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNull(pixelDensity4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setFileName("");
        int int8 = pcxImagingParameters7.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.setBitDepth((int) 'a');
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setCompression((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters9.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters9.setFileName("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = pcxImagingParameters0.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setBitDepth(35);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(pixelDensity7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setCompression((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setCompression((int) (byte) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters13.setBitDepth((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters13.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters21 = pcxImagingParameters19.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters22 = pcxImagingParameters21.asThis();
        java.lang.String str23 = pcxImagingParameters21.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertNotNull(pcxImagingParameters21);
        org.junit.Assert.assertNotNull(pcxImagingParameters22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        java.lang.String str7 = pcxImagingParameters5.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setPlanes(100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters9.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters9.setCompression((int) (byte) 0);
        java.lang.String str13 = pcxImagingParameters12.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters12.setFileName("hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(bufferedImageFactory10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPlanes((int) (short) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        int int10 = pcxImagingParameters8.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = pcxImagingParameters8.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory11);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters5.setStrict(true);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setStrict(true);
        int int6 = pcxImagingParameters5.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBitDepth((int) '4');
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters5.setPixelDensity(pixelDensity9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setPixelDensity(pixelDensity6);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setFileName("hi!");
        org.apache.commons.imaging.PixelDensity pixelDensity10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setPixelDensity(pixelDensity10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.PixelDensity pixelDensity3 = pcxImagingParameters2.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setCompression(1);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(pixelDensity3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBitDepth((int) (byte) 0);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters2.getBufferedImageFactory();
        java.lang.Class<?> wildcardClass7 = pcxImagingParameters2.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBitDepth(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setCompression((int) 'a');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters2.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setBitDepth(0);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setCompression((int) ' ');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setPlanes((int) 'a');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setPlanes((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        boolean boolean11 = pcxImagingParameters10.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setBufferedImageFactory(bufferedImageFactory14);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters15.setCompression(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setCompression((int) (short) 100);
        int int9 = pcxImagingParameters6.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters5.getPixelDensity();
        java.lang.String str7 = pcxImagingParameters5.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters5.setCompression(1);
        java.lang.String str12 = pcxImagingParameters5.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters5.setStrict(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPlanes((int) (short) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = pcxImagingParameters6.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters6.setCompression(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(bufferedImageFactory9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setStrict(true);
        java.lang.String str6 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setBitDepth((int) (short) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPlanes((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters0.getPixelDensity();
        java.lang.String str7 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setPlanes((int) ' ');
        boolean boolean10 = pcxImagingParameters9.isStrict();
        int int11 = pcxImagingParameters9.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setStrict(true);
        int int15 = pcxImagingParameters14.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory16 = pcxImagingParameters14.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters14.setCompression(0);
        java.lang.String str19 = pcxImagingParameters14.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(bufferedImageFactory16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setFileName("hi!");
        org.apache.commons.imaging.PixelDensity pixelDensity9 = pcxImagingParameters6.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(pixelDensity9);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        int int13 = pcxImagingParameters12.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters12.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters12.setBitDepth(100);
        int int18 = pcxImagingParameters12.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setPlanes((int) '#');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters4.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = pcxImagingParameters10.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(bufferedImageFactory11);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters5.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setCompression((-1));
        boolean boolean10 = pcxImagingParameters9.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters9.setBitDepth((int) '4');
        java.lang.String str13 = pcxImagingParameters9.getFileName();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNull(bufferedImageFactory7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory6);
        int int8 = pcxImagingParameters7.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity9 = pcxImagingParameters7.getPixelDensity();
        org.apache.commons.imaging.PixelDensity pixelDensity10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters7.setPixelDensity(pixelDensity10);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setBufferedImageFactory(bufferedImageFactory12);
        boolean boolean14 = pcxImagingParameters13.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters13.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters13.setFileName("");
        boolean boolean19 = pcxImagingParameters13.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(pixelDensity9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setFileName("hi!");
        int int12 = pcxImagingParameters11.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters11.setBitDepth((int) (short) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters11.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters11.setCompression((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setBitDepth((int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = pcxImagingParameters7.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        int int9 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters0.setFileName("");
        boolean boolean12 = pcxImagingParameters0.isStrict();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory13 = pcxImagingParameters0.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(bufferedImageFactory13);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.setCompression((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters3.setPlanes(97);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        java.lang.Class<?> wildcardClass10 = pcxImagingParameters8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters5.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setCompression((int) ' ');
        java.lang.Class<?> wildcardClass9 = pcxImagingParameters8.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setPixelDensity(pixelDensity6);
        int int8 = pcxImagingParameters3.getCompression();
        java.lang.String str9 = pcxImagingParameters3.getFileName();
        int int10 = pcxImagingParameters3.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters3.setCompression(100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters12.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setCompression(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters10.setCompression((int) (short) 10);
        org.apache.commons.imaging.PixelDensity pixelDensity18 = pcxImagingParameters17.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters17.setFileName("hi!");
        java.lang.String str21 = pcxImagingParameters17.getFileName();
        org.apache.commons.imaging.PixelDensity pixelDensity22 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters23 = pcxImagingParameters17.setPixelDensity(pixelDensity22);
        boolean boolean24 = pcxImagingParameters23.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNull(pixelDensity18);
        org.junit.Assert.assertNotNull(pcxImagingParameters20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory6);
        int int8 = pcxImagingParameters7.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity9 = pcxImagingParameters7.getPixelDensity();
        org.apache.commons.imaging.PixelDensity pixelDensity10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters7.setPixelDensity(pixelDensity10);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setBufferedImageFactory(bufferedImageFactory12);
        int int14 = pcxImagingParameters11.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(pixelDensity9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setCompression((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setCompression((int) (byte) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters13.setBitDepth((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters13.setStrict(true);
        int int20 = pcxImagingParameters19.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = pcxImagingParameters0.getPixelDensity();
        int int5 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setStrict(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNull(pixelDensity4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory6);
        int int8 = pcxImagingParameters7.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity9 = pcxImagingParameters7.getPixelDensity();
        org.apache.commons.imaging.PixelDensity pixelDensity10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters7.setPixelDensity(pixelDensity10);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters7.setBufferedImageFactory(bufferedImageFactory12);
        int int14 = pcxImagingParameters13.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity15 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters13.setPixelDensity(pixelDensity15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(pixelDensity9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.setCompression((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setFileName("");
        int int9 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity10 = pcxImagingParameters6.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(pixelDensity10);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPixelDensity(pixelDensity13);
        int int15 = pcxImagingParameters10.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters10.setPlanes((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory6);
        int int8 = pcxImagingParameters7.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity9 = pcxImagingParameters7.getPixelDensity();
        org.apache.commons.imaging.PixelDensity pixelDensity10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters7.setPixelDensity(pixelDensity10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters7.setPlanes((int) (byte) -1);
        boolean boolean14 = pcxImagingParameters7.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters7.setStrict(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(pixelDensity9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setFileName("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters10.setBitDepth(100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters10.setPlanes((-1));
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters10.asThis();
        boolean boolean20 = pcxImagingParameters10.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        java.lang.String str7 = pcxImagingParameters5.getFileName();
        int int8 = pcxImagingParameters5.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters9.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters9.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setPlanes(1);
        boolean boolean15 = pcxImagingParameters14.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(bufferedImageFactory10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters6.setCompression((int) (byte) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters6.setBitDepth((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        java.lang.String str13 = pcxImagingParameters12.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = pcxImagingParameters12.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory15 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters12.setBufferedImageFactory(bufferedImageFactory15);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory17 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters16.setBufferedImageFactory(bufferedImageFactory17);
        org.apache.commons.imaging.PixelDensity pixelDensity19 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters18.setPixelDensity(pixelDensity19);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory21 = pcxImagingParameters18.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(bufferedImageFactory14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertNotNull(pcxImagingParameters20);
        org.junit.Assert.assertNull(bufferedImageFactory21);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBitDepth(0);
        java.lang.String str5 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters0.getPixelDensity();
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setPixelDensity(pixelDensity7);
        int int9 = pcxImagingParameters8.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters8.setPixelDensity(pixelDensity10);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression(10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters0.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPlanes(100);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNull(bufferedImageFactory8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        java.lang.String str3 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setFileName("hi!");
        boolean boolean8 = pcxImagingParameters7.isStrict();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.setBufferedImageFactory(bufferedImageFactory9);
        int int11 = pcxImagingParameters10.getPlanes();
        boolean boolean12 = pcxImagingParameters10.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPlanes((-1));
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setCompression((int) (byte) 100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory15 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters10.setBufferedImageFactory(bufferedImageFactory15);
        java.lang.Class<?> wildcardClass17 = pcxImagingParameters10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setPlanes((int) '4');
        int int8 = pcxImagingParameters2.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters2.setPixelDensity(pixelDensity9);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setBufferedImageFactory(bufferedImageFactory11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setBitDepth((int) (short) 10);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        int int9 = pcxImagingParameters6.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.asThis();
        boolean boolean11 = pcxImagingParameters6.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPlanes((-1));
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setCompression((int) (byte) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters15.setBitDepth(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBitDepth((int) (short) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setBitDepth((int) (short) 10);
        int int13 = pcxImagingParameters12.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setCompression(1);
        org.apache.commons.imaging.PixelDensity pixelDensity5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setPixelDensity(pixelDensity5);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setCompression((int) (short) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters4.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters4.setBitDepth(100);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = pcxImagingParameters12.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters12.setPlanes(10);
        org.apache.commons.imaging.PixelDensity pixelDensity16 = pcxImagingParameters12.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory17 = pcxImagingParameters12.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNull(pixelDensity13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNull(pixelDensity16);
        org.junit.Assert.assertNull(bufferedImageFactory17);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBitDepth(0);
        java.lang.String str5 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setPlanes((int) '4');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setPlanes((-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setPlanes((int) 'a');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters7.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = pcxImagingParameters10.getPixelDensity();
        org.apache.commons.imaging.PixelDensity pixelDensity12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setPixelDensity(pixelDensity12);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = pcxImagingParameters13.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory15 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters13.setBufferedImageFactory(bufferedImageFactory15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(pixelDensity11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNull(bufferedImageFactory14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        java.lang.String str7 = pcxImagingParameters5.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setPlanes(100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters9.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters9.setCompression((int) (byte) 0);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setBufferedImageFactory(bufferedImageFactory13);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory15 = pcxImagingParameters12.getBufferedImageFactory();
        int int16 = pcxImagingParameters12.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters12.setCompression((-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(bufferedImageFactory10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNull(bufferedImageFactory15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBitDepth(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setCompression((int) 'a');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setBitDepth((-1));
        java.lang.Class<?> wildcardClass12 = pcxImagingParameters11.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setBitDepth((int) '#');
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setPixelDensity(pixelDensity9);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters8.asThis();
        boolean boolean14 = pcxImagingParameters8.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters8.setFileName("");
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters14.asThis();
        int int16 = pcxImagingParameters15.getPlanes();
        java.lang.String str17 = pcxImagingParameters15.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters15.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters21 = pcxImagingParameters15.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters23 = pcxImagingParameters21.setCompression(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertNotNull(pcxImagingParameters21);
        org.junit.Assert.assertNotNull(pcxImagingParameters23);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        int int9 = pcxImagingParameters6.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters6.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters6.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setCompression(1);
        org.apache.commons.imaging.PixelDensity pixelDensity5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setPixelDensity(pixelDensity5);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = pcxImagingParameters4.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters4.setBitDepth((int) (byte) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setStrict(false);
        int int12 = pcxImagingParameters11.getCompression();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(pixelDensity7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        java.lang.String str13 = pcxImagingParameters12.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = pcxImagingParameters12.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters12.setFileName("hi!");
        int int17 = pcxImagingParameters16.getPlanes();
        int int18 = pcxImagingParameters16.getPlanes();
        int int19 = pcxImagingParameters16.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(bufferedImageFactory14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory16 = pcxImagingParameters10.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNull(bufferedImageFactory16);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = pcxImagingParameters0.getPixelDensity();
        int int5 = pcxImagingParameters0.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNull(pixelDensity4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setPlanes((int) (short) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters11.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory15 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters14.setBufferedImageFactory(bufferedImageFactory15);
        org.apache.commons.imaging.PixelDensity pixelDensity17 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters14.setPixelDensity(pixelDensity17);
        int int19 = pcxImagingParameters18.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        java.lang.String str7 = pcxImagingParameters6.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setBitDepth((-1));
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters6.setStrict(true);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        int int5 = pcxImagingParameters4.getCompression();
        int int6 = pcxImagingParameters4.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setCompression(100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setPlanes(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters5.setPlanes(100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setBufferedImageFactory(bufferedImageFactory11);
        int int13 = pcxImagingParameters10.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setPlanes((int) '4');
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory16 = pcxImagingParameters10.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters10.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters18.setStrict(true);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory21 = pcxImagingParameters18.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNull(bufferedImageFactory16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertNotNull(pcxImagingParameters20);
        org.junit.Assert.assertNull(bufferedImageFactory21);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBitDepth(0);
        java.lang.String str5 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setFileName("");
        java.lang.String str8 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters0.setPixelDensity(pixelDensity9);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setFileName("");
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters0.setPixelDensity(pixelDensity9);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters0.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters13.setCompression((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setStrict(true);
        int int15 = pcxImagingParameters14.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory16 = pcxImagingParameters14.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters14.setCompression(0);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory19 = pcxImagingParameters18.getBufferedImageFactory();
        int int20 = pcxImagingParameters18.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(bufferedImageFactory16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertNull(bufferedImageFactory19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPlanes((-1));
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters10.setBitDepth(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters16.asThis();
        int int18 = pcxImagingParameters17.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        int int6 = pcxImagingParameters5.getPlanes();
        int int7 = pcxImagingParameters5.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters5.getBufferedImageFactory();
        java.lang.String str9 = pcxImagingParameters5.getFileName();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        java.lang.String str13 = pcxImagingParameters12.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = pcxImagingParameters12.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters12.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters16.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters16.setBitDepth(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(bufferedImageFactory14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertNotNull(pcxImagingParameters20);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        java.lang.String str5 = pcxImagingParameters3.getFileName();
        int int6 = pcxImagingParameters3.getBitDepth();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setCompression(32);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setPixelDensity(pixelDensity11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        int int3 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setCompression((int) (short) 100);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        java.lang.String str13 = pcxImagingParameters12.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = pcxImagingParameters12.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters12.setFileName("hi!");
        int int17 = pcxImagingParameters16.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters16.setCompression((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters21 = pcxImagingParameters16.setPlanes(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(bufferedImageFactory14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertNotNull(pcxImagingParameters21);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        int int5 = pcxImagingParameters4.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setPixelDensity(pixelDensity6);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters7.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNull(bufferedImageFactory8);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setStrict(true);
        int int6 = pcxImagingParameters5.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters5.setFileName("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        int int4 = pcxImagingParameters3.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters3.setCompression((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setStrict(false);
        int int11 = pcxImagingParameters10.getPlanes();
        int int12 = pcxImagingParameters10.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters5.setPlanes(100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setBufferedImageFactory(bufferedImageFactory11);
        int int13 = pcxImagingParameters10.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setPlanes((int) '4');
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory16 = pcxImagingParameters10.getBufferedImageFactory();
        int int17 = pcxImagingParameters10.getPlanes();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNull(bufferedImageFactory16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setPlanes((int) (short) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters11.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory15 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters14.setBufferedImageFactory(bufferedImageFactory15);
        org.apache.commons.imaging.PixelDensity pixelDensity17 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters14.setPixelDensity(pixelDensity17);
        int int19 = pcxImagingParameters18.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setPlanes(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setCompression(10);
        int int11 = pcxImagingParameters10.getPlanes();
        int int12 = pcxImagingParameters10.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setStrict(true);
        int int11 = pcxImagingParameters10.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setFileName("hi!");
        boolean boolean14 = pcxImagingParameters13.isStrict();
        int int15 = pcxImagingParameters13.getCompression();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setCompression((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setBitDepth((int) (short) 1);
        java.lang.String str16 = pcxImagingParameters10.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory6);
        int int8 = pcxImagingParameters7.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity9 = pcxImagingParameters7.getPixelDensity();
        org.apache.commons.imaging.PixelDensity pixelDensity10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters7.setPixelDensity(pixelDensity10);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setBufferedImageFactory(bufferedImageFactory12);
        boolean boolean14 = pcxImagingParameters13.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters13.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory17 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters16.setBufferedImageFactory(bufferedImageFactory17);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(pixelDensity9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setPlanes((int) 'a');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters7.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = pcxImagingParameters10.getPixelDensity();
        org.apache.commons.imaging.PixelDensity pixelDensity12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setPixelDensity(pixelDensity12);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = pcxImagingParameters13.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters13.setFileName("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(pixelDensity11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNull(bufferedImageFactory14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setCompression((int) (short) 100);
        java.lang.String str9 = pcxImagingParameters6.getFileName();
        int int10 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters6.setBitDepth(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.PixelDensity pixelDensity3 = pcxImagingParameters2.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters2.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setBitDepth((int) (byte) 100);
        java.lang.String str12 = pcxImagingParameters9.getFileName();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(pixelDensity3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        java.lang.String str13 = pcxImagingParameters12.getFileName();
        int int14 = pcxImagingParameters12.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters12.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity16 = pcxImagingParameters12.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNull(pixelDensity16);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters14.asThis();
        int int16 = pcxImagingParameters15.getPlanes();
        java.lang.String str17 = pcxImagingParameters15.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters15.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity20 = pcxImagingParameters15.getPixelDensity();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = pixelDensity20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertNull(pixelDensity20);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setCompression(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setPlanes((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setFileName("hi!");
        int int12 = pcxImagingParameters11.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters11.setBitDepth((int) (short) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters11.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters16.setCompression((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPlanes((int) (short) 0);
        int int15 = pcxImagingParameters10.getCompression();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory16 = pcxImagingParameters10.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(bufferedImageFactory16);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBitDepth(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setStrict(true);
        boolean boolean8 = pcxImagingParameters7.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.setCompression((int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = pcxImagingParameters10.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        int int3 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        java.lang.String str3 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression(100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setCompression((int) ' ');
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setPixelDensity(pixelDensity4);
        java.lang.String str6 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setCompression(10);
        org.apache.commons.imaging.PixelDensity pixelDensity9 = pcxImagingParameters8.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(pixelDensity9);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        int int5 = pcxImagingParameters4.getCompression();
        int int6 = pcxImagingParameters4.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters4.setBufferedImageFactory(bufferedImageFactory9);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setCompression((int) (byte) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory15 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters14.setBufferedImageFactory(bufferedImageFactory15);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters14.setCompression(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters18.setCompression((int) (byte) -1);
        org.apache.commons.imaging.PixelDensity pixelDensity21 = pcxImagingParameters18.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters23 = pcxImagingParameters18.setStrict(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertNotNull(pcxImagingParameters20);
        org.junit.Assert.assertNull(pixelDensity21);
        org.junit.Assert.assertNotNull(pcxImagingParameters23);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setPixelDensity(pixelDensity4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBitDepth((int) '#');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters5.getBufferedImageFactory();
        int int11 = pcxImagingParameters5.getPlanes();
        int int12 = pcxImagingParameters5.getBitDepth();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory13 = pcxImagingParameters5.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(bufferedImageFactory10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNull(bufferedImageFactory13);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        java.lang.String str13 = pcxImagingParameters12.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = pcxImagingParameters12.getBufferedImageFactory();
        int int15 = pcxImagingParameters12.getPlanes();
        java.lang.String str16 = pcxImagingParameters12.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(bufferedImageFactory14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setPixelDensity(pixelDensity6);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setFileName("hi!");
        java.lang.Class<?> wildcardClass10 = pcxImagingParameters5.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters4.setBufferedImageFactory(bufferedImageFactory9);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setCompression((int) ' ');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setPlanes((int) 'a');
        int int12 = pcxImagingParameters9.getCompression();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory13 = pcxImagingParameters9.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters9.setBitDepth(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNull(bufferedImageFactory13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setPlanes((int) (byte) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBitDepth(1);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters6.setBitDepth(97);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters12.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        boolean boolean11 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters6.setStrict(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setPixelDensity(pixelDensity6);
        int int8 = pcxImagingParameters3.getCompression();
        java.lang.String str9 = pcxImagingParameters3.getFileName();
        int int10 = pcxImagingParameters3.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters3.setCompression(100);
        java.lang.String str13 = pcxImagingParameters12.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters12.setBufferedImageFactory(bufferedImageFactory14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }
}

