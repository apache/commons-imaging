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
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
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
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory15 = pcxImagingParameters13.getBufferedImageFactory();
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
        org.junit.Assert.assertNull(bufferedImageFactory15);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setBitDepth((int) '#');
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setPixelDensity(pixelDensity9);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setPlanes((int) (byte) 100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setBufferedImageFactory(bufferedImageFactory13);
        org.apache.commons.imaging.PixelDensity pixelDensity15 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters14.setPixelDensity(pixelDensity15);
        int int17 = pcxImagingParameters14.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters0.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory6);
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        int int12 = pcxImagingParameters11.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters5.setFileName("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(bufferedImageFactory11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setBitDepth((int) (short) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setBitDepth(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.PixelDensity pixelDensity3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters2.setPixelDensity(pixelDensity3);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters4.getBufferedImageFactory();
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setPixelDensity(pixelDensity6);
        int int8 = pcxImagingParameters4.getPlanes();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters15.setBitDepth((int) (short) 1);
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
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        int int5 = pcxImagingParameters4.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setPixelDensity(pixelDensity6);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters7.asThis();
        int int9 = pcxImagingParameters7.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity10 = pcxImagingParameters7.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(pixelDensity10);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        int int4 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setCompression(0);
        org.apache.commons.imaging.PixelDensity pixelDensity9 = pcxImagingParameters8.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(pixelDensity9);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters12.setBitDepth((int) (short) 100);
        java.lang.Class<?> wildcardClass16 = pcxImagingParameters15.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setFileName("hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNull(bufferedImageFactory7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters3.setBitDepth(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setCompression(1);
        int int5 = pcxImagingParameters4.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setCompression(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters7.asThis();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters0.setPlanes((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setFileName("hi!");
        boolean boolean5 = pcxImagingParameters0.isStrict();
        int int6 = pcxImagingParameters0.getPlanes();
        boolean boolean7 = pcxImagingParameters0.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters5.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory9);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setPixelDensity(pixelDensity6);
        int int8 = pcxImagingParameters7.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPlanes(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setCompression(1);
        int int5 = pcxImagingParameters4.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setCompression(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setBitDepth((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setStrict(false);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setPlanes((int) (short) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters9.setBitDepth(0);
        org.apache.commons.imaging.PixelDensity pixelDensity14 = pcxImagingParameters9.getPixelDensity();
        org.apache.commons.imaging.PixelDensity pixelDensity15 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters9.setPixelDensity(pixelDensity15);
        java.lang.Class<?> wildcardClass17 = pcxImagingParameters16.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNull(pixelDensity14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
        int int17 = pcxImagingParameters16.getBitDepth();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory18 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters16.setBufferedImageFactory(bufferedImageFactory18);
        int int20 = pcxImagingParameters16.getCompression();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        int int3 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory6);
        org.apache.commons.imaging.PixelDensity pixelDensity8 = pcxImagingParameters7.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = pcxImagingParameters7.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNull(pixelDensity8);
        org.junit.Assert.assertNull(bufferedImageFactory9);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters5.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setCompression((-1));
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setCompression((int) (short) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setPlanes(32);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setPlanes((int) '#');
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNull(bufferedImageFactory7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setStrict(false);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setCompression((int) (short) 100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setBufferedImageFactory(bufferedImageFactory8);
        org.apache.commons.imaging.PixelDensity pixelDensity10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters7.setPixelDensity(pixelDensity10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setPixelDensity(pixelDensity6);
        int int8 = pcxImagingParameters7.getBitDepth();
        boolean boolean9 = pcxImagingParameters7.isStrict();
        int int10 = pcxImagingParameters7.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
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
        int int20 = pcxImagingParameters17.getCompression();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory21 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters22 = pcxImagingParameters17.setBufferedImageFactory(bufferedImageFactory21);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(pcxImagingParameters22);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory9);
        int int11 = pcxImagingParameters8.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters8.setCompression(0);
        org.apache.commons.imaging.PixelDensity pixelDensity14 = pcxImagingParameters8.getPixelDensity();
        org.apache.commons.imaging.PixelDensity pixelDensity15 = pcxImagingParameters8.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNull(pixelDensity14);
        org.junit.Assert.assertNull(pixelDensity15);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        int int4 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPlanes((int) (byte) 1);
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
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
        int int15 = pcxImagingParameters11.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters11.setCompression((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPlanes((int) (short) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = pcxImagingParameters6.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setPlanes((int) 'a');
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
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setCompression(1);
        int int11 = pcxImagingParameters8.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters8.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters8.setFileName("");
        int int16 = pcxImagingParameters15.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
        int int15 = pcxImagingParameters14.getCompression();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        int int7 = pcxImagingParameters4.getCompression();
        java.lang.String str8 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters4.setFileName("hi!");
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters4.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters4.asThis();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setPlanes((int) (byte) -1);
        int int6 = pcxImagingParameters3.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
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
        java.lang.String str14 = pcxImagingParameters13.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
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
        int int14 = pcxImagingParameters13.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity15 = pcxImagingParameters13.getPixelDensity();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(pixelDensity15);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        int int4 = pcxImagingParameters3.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters3.setCompression((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setStrict(false);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = pcxImagingParameters12.getPixelDensity();
        int int14 = pcxImagingParameters12.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNull(pixelDensity13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setCompression(1);
        org.apache.commons.imaging.PixelDensity pixelDensity5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setPixelDensity(pixelDensity5);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = pcxImagingParameters4.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters4.setCompression((int) ' ');
        boolean boolean10 = pcxImagingParameters4.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(pixelDensity7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory13 = pcxImagingParameters12.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(bufferedImageFactory10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNull(bufferedImageFactory13);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory9);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = pcxImagingParameters10.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNull(bufferedImageFactory8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(bufferedImageFactory11);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
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
        int int15 = pcxImagingParameters6.getPlanes();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.PixelDensity pixelDensity3 = pcxImagingParameters2.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters2.setFileName("hi!");
        int int7 = pcxImagingParameters2.getPlanes();
        int int8 = pcxImagingParameters2.getPlanes();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(pixelDensity3);
        org.junit.Assert.assertNull(bufferedImageFactory4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters3.asThis();
        int int5 = pcxImagingParameters3.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setPlanes((int) (byte) 10);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters3.setPlanes(35);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setPixelDensity(pixelDensity4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setPixelDensity(pixelDensity6);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters7.asThis();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
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
        boolean boolean17 = pcxImagingParameters12.isStrict();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        int int17 = pcxImagingParameters12.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters12.setStrict(false);
        int int20 = pcxImagingParameters12.getCompression();
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
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters9.asThis();
        int int11 = pcxImagingParameters9.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters9.setBufferedImageFactory(bufferedImageFactory12);
        org.apache.commons.imaging.PixelDensity pixelDensity14 = pcxImagingParameters9.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNull(pixelDensity14);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBitDepth(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setStrict(false);
        int int10 = pcxImagingParameters7.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters7.setFileName("hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setCompression((int) ' ');
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters3.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters3.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters3.setBitDepth((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(bufferedImageFactory10);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setBitDepth((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters6.setPlanes(10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = pcxImagingParameters13.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNull(bufferedImageFactory14);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setPlanes((int) '4');
        java.lang.String str8 = pcxImagingParameters7.getFileName();
        int int9 = pcxImagingParameters7.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
        java.lang.String str14 = pcxImagingParameters13.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters0.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setFileName("");
        int int8 = pcxImagingParameters7.getCompression();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = pcxImagingParameters7.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters7.setFileName("hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(bufferedImageFactory9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setPixelDensity(pixelDensity5);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = pcxImagingParameters4.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters4.setStrict(true);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(bufferedImageFactory7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setPlanes((int) 'a');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters4.setFileName("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setCompression(1);
        int int5 = pcxImagingParameters4.getBitDepth();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters4.getBufferedImageFactory();
        int int7 = pcxImagingParameters4.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        int int3 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory6);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setBitDepth((int) (byte) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setCompression((int) (short) 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setStrict(false);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory5);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        java.lang.String str9 = pcxImagingParameters8.getFileName();
        int int10 = pcxImagingParameters8.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setBitDepth(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setFileName("");
        int int15 = pcxImagingParameters12.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = pcxImagingParameters0.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNull(bufferedImageFactory4);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setPlanes((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(bufferedImageFactory9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(pixelDensity12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setPixelDensity(pixelDensity4);
        int int6 = pcxImagingParameters3.getBitDepth();
        java.lang.String str7 = pcxImagingParameters3.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.asThis();
        int int7 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.PixelDensity pixelDensity10 = pcxImagingParameters0.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(pixelDensity10);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters15.setPlanes((-1));
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
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setCompression(0);
        java.lang.Class<?> wildcardClass9 = pcxImagingParameters6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters6.getBufferedImageFactory();
        java.lang.String str9 = pcxImagingParameters6.getFileName();
        org.apache.commons.imaging.PixelDensity pixelDensity10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters6.setPixelDensity(pixelDensity10);
        int int12 = pcxImagingParameters11.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(bufferedImageFactory8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        int int11 = pcxImagingParameters10.getBitDepth();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory12 = pcxImagingParameters10.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.asThis();
        int int14 = pcxImagingParameters10.getCompression();
        boolean boolean15 = pcxImagingParameters10.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters10.setStrict(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setCompression((int) 'a');
        int int10 = pcxImagingParameters7.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters7.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters7.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters7.setFileName("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.setCompression((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters3.setFileName("");
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters3.setPixelDensity(pixelDensity9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) ' ');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters6.setBitDepth((int) (byte) 100);
        int int13 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters6.setPixelDensity(pixelDensity14);
        org.apache.commons.imaging.PixelDensity pixelDensity16 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters6.setPixelDensity(pixelDensity16);
        org.apache.commons.imaging.PixelDensity pixelDensity18 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters17.setPixelDensity(pixelDensity18);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
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
        int int25 = pcxImagingParameters22.getBitDepth();
        int int26 = pcxImagingParameters22.getCompression();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBitDepth((int) (short) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setFileName("hi!");
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters14.setBitDepth(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
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
        int int16 = pcxImagingParameters10.getCompression();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory17 = pcxImagingParameters10.getBufferedImageFactory();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNull(bufferedImageFactory17);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        int int4 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setCompression((int) (short) 1);
        int int13 = pcxImagingParameters12.getBitDepth();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters12.setBufferedImageFactory(bufferedImageFactory14);
        int int16 = pcxImagingParameters15.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
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
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory15 = pcxImagingParameters14.getBufferedImageFactory();
        org.apache.commons.imaging.PixelDensity pixelDensity16 = pcxImagingParameters14.getPixelDensity();
        org.apache.commons.imaging.PixelDensity pixelDensity17 = pcxImagingParameters14.getPixelDensity();
        java.lang.String str18 = pcxImagingParameters14.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNull(bufferedImageFactory15);
        org.junit.Assert.assertNull(pixelDensity16);
        org.junit.Assert.assertNull(pixelDensity17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setCompression(1);
        org.apache.commons.imaging.PixelDensity pixelDensity5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setPixelDensity(pixelDensity5);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = pcxImagingParameters4.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters4.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters4.setFileName("");
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(pixelDensity7);
        org.junit.Assert.assertNull(bufferedImageFactory8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters14.setCompression((int) (byte) 0);
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
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity7 = pcxImagingParameters6.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setCompression((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters10.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setPixelDensity(pixelDensity12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(pixelDensity7);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        int int9 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters0.setFileName("");
        int int12 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters0.setBitDepth(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        int int5 = pcxImagingParameters4.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setPixelDensity(pixelDensity6);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters7.asThis();
        int int9 = pcxImagingParameters7.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters7.setBufferedImageFactory(bufferedImageFactory10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setPixelDensity(pixelDensity6);
        int int8 = pcxImagingParameters7.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setStrict(false);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setPixelDensity(pixelDensity11);
        int int13 = pcxImagingParameters8.getPlanes();
        int int14 = pcxImagingParameters8.getPlanes();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setPixelDensity(pixelDensity6);
        org.apache.commons.imaging.PixelDensity pixelDensity8 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters3.setStrict(false);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters3.setFileName("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNull(pixelDensity8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters12.setPlanes(52);
        int int21 = pcxImagingParameters12.getPlanes();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters14.setCompression((int) (short) -1);
        org.apache.commons.imaging.PixelDensity pixelDensity17 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters14.setPixelDensity(pixelDensity17);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters18.setPlanes((int) (byte) 10);
        java.lang.String str21 = pcxImagingParameters18.getFileName();
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
        org.junit.Assert.assertNotNull(pcxImagingParameters20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters0.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        int int6 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters3.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters3.setPlanes((int) (short) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = pcxImagingParameters3.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters3.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setBitDepth((int) (short) -1);
        int int16 = pcxImagingParameters15.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(bufferedImageFactory11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setPixelDensity(pixelDensity5);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = pcxImagingParameters4.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters4.setCompression((int) ' ');
        java.lang.String str10 = pcxImagingParameters9.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters9.setBufferedImageFactory(bufferedImageFactory11);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(bufferedImageFactory7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        int int6 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters3.setBitDepth((int) (byte) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setCompression(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters24 = pcxImagingParameters22.setStrict(false);
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
        org.junit.Assert.assertNotNull(pcxImagingParameters24);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.asThis();
        int int11 = pcxImagingParameters6.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters6.setStrict(false);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setCompression((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters10.setCompression((int) (byte) 0);
        int int17 = pcxImagingParameters10.getCompression();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPlanes((int) (short) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setCompression(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory6);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setBitDepth(10);
        boolean boolean10 = pcxImagingParameters7.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
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
        int int18 = pcxImagingParameters17.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity19 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters17.setPixelDensity(pixelDensity19);
        int int21 = pcxImagingParameters17.getPlanes();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        boolean boolean3 = pcxImagingParameters2.isStrict();
        org.apache.commons.imaging.PixelDensity pixelDensity4 = pcxImagingParameters2.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.asThis();
        java.lang.String str6 = pcxImagingParameters5.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory9);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(pixelDensity4);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setCompression((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters8.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters8.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory16 = pcxImagingParameters15.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNull(bufferedImageFactory16);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setStrict(false);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = pcxImagingParameters8.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters8.setPlanes((int) 'a');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters8.setPlanes((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(bufferedImageFactory9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
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
        int int18 = pcxImagingParameters17.getPlanes();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setPlanes((int) '4');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters7.setBufferedImageFactory(bufferedImageFactory11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setFileName("");
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setPlanes((int) (byte) 10);
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
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.PixelDensity pixelDensity3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPixelDensity(pixelDensity3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setPlanes(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters4.setCompression((int) (short) 10);
        org.apache.commons.imaging.PixelDensity pixelDensity10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setPixelDensity(pixelDensity10);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setPixelDensity(pixelDensity4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBitDepth((int) '#');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.PixelDensity pixelDensity11 = pcxImagingParameters5.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(bufferedImageFactory10);
        org.junit.Assert.assertNull(pixelDensity11);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters15.setFileName("hi!");
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
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
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
        org.apache.commons.imaging.PixelDensity pixelDensity14 = pcxImagingParameters10.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters10.setFileName("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNull(pixelDensity14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
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
        org.apache.commons.imaging.PixelDensity pixelDensity15 = pcxImagingParameters10.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory16 = pcxImagingParameters10.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNull(pixelDensity15);
        org.junit.Assert.assertNull(bufferedImageFactory16);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        int int4 = pcxImagingParameters3.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setCompression(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters6.setPlanes((int) (byte) -1);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
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
        org.apache.commons.imaging.PixelDensity pixelDensity17 = pcxImagingParameters12.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters12.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters21 = pcxImagingParameters12.setPlanes((int) (byte) 10);
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
        org.junit.Assert.assertNull(pixelDensity17);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertNotNull(pcxImagingParameters21);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = pcxImagingParameters6.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setStrict(true);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setBufferedImageFactory(bufferedImageFactory11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setCompression((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters12.setFileName("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(pixelDensity8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
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
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setBufferedImageFactory(bufferedImageFactory13);
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
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setCompression((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters4.setStrict(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters0.getBufferedImageFactory();
        int int6 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = pcxImagingParameters0.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(bufferedImageFactory7);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity7 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setBitDepth((int) '#');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters9.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = pcxImagingParameters9.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(pixelDensity7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(bufferedImageFactory11);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters21 = pcxImagingParameters19.setBitDepth((int) (short) 0);
        java.lang.Class<?> wildcardClass22 = pcxImagingParameters21.getClass();
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
        org.junit.Assert.assertNotNull(pcxImagingParameters21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
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
        org.apache.commons.imaging.PixelDensity pixelDensity16 = pcxImagingParameters15.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters15.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory19 = pcxImagingParameters18.getBufferedImageFactory();
        java.lang.String str20 = pcxImagingParameters18.getFileName();
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
        org.junit.Assert.assertNull(bufferedImageFactory19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters17.setPlanes((int) 'a');
        java.lang.Class<?> wildcardClass20 = pcxImagingParameters19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setPixelDensity(pixelDensity6);
        int int8 = pcxImagingParameters5.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        int int6 = pcxImagingParameters3.getCompression();
        int int7 = pcxImagingParameters3.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters4.asThis();
        int int6 = pcxImagingParameters4.getCompression();
        java.lang.String str7 = pcxImagingParameters4.getFileName();
        int int8 = pcxImagingParameters4.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters4.setCompression((-1));
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters4.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity12 = pcxImagingParameters4.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(pixelDensity12);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = pcxImagingParameters0.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters0.setPlanes(97);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters0.setFileName("hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(pixelDensity7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters0.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory6);
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        int int12 = pcxImagingParameters0.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters0.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory6);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setBitDepth((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setBitDepth((int) (byte) 100);
        int int13 = pcxImagingParameters10.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setStrict(false);
        org.apache.commons.imaging.PixelDensity pixelDensity16 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters10.setPixelDensity(pixelDensity16);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        int int9 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory10);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory12);
        int int14 = pcxImagingParameters0.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters14.setPlanes((int) ' ');
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory17 = pcxImagingParameters16.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory18 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters16.setBufferedImageFactory(bufferedImageFactory18);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNull(bufferedImageFactory17);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setPlanes((int) '4');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters9.asThis();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
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
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory17 = pcxImagingParameters10.getBufferedImageFactory();
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
        org.junit.Assert.assertNull(bufferedImageFactory17);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) ' ');
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setBufferedImageFactory(bufferedImageFactory11);
        boolean boolean13 = pcxImagingParameters12.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters12.setFileName("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        java.lang.String str3 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setFileName("hi!");
        boolean boolean8 = pcxImagingParameters7.isStrict();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.setBufferedImageFactory(bufferedImageFactory9);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        java.lang.String str7 = pcxImagingParameters5.getFileName();
        int int8 = pcxImagingParameters5.getPlanes();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setPlanes((int) 'a');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters7.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setBitDepth((int) '#');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setFileName("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
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
        org.apache.commons.imaging.PixelDensity pixelDensity16 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters10.setPixelDensity(pixelDensity16);
        org.apache.commons.imaging.PixelDensity pixelDensity18 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters10.setPixelDensity(pixelDensity18);
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
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory7);
        boolean boolean9 = pcxImagingParameters8.isStrict();
        boolean boolean10 = pcxImagingParameters8.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters10.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory17 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters16.setBufferedImageFactory(bufferedImageFactory17);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters18.setBitDepth((int) ' ');
        int int21 = pcxImagingParameters20.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity22 = pcxImagingParameters20.getPixelDensity();
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
        org.junit.Assert.assertNotNull(pcxImagingParameters20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNull(pixelDensity22);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory9);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters8.setStrict(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory6);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters3.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters3.setPlanes((int) '4');
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNull(bufferedImageFactory8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setPlanes((-1));
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters4.setBitDepth(100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setCompression(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setCompression((int) (byte) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity15 = pcxImagingParameters14.getPixelDensity();
        org.apache.commons.imaging.PixelDensity pixelDensity16 = pcxImagingParameters14.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNull(pixelDensity15);
        org.junit.Assert.assertNull(pixelDensity16);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters4.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory6);
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setPixelDensity(pixelDensity8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters4.getBufferedImageFactory();
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setPixelDensity(pixelDensity6);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters4.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNull(bufferedImageFactory8);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters17.setPlanes((int) 'a');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters19.asThis();
        java.lang.Class<?> wildcardClass21 = pcxImagingParameters19.getClass();
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
        org.junit.Assert.assertNotNull(pcxImagingParameters20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setBitDepth((int) '4');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters15.setStrict(false);
        int int18 = pcxImagingParameters15.getBitDepth();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters4.setPlanes((int) '4');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters14.setPlanes(35);
        boolean boolean17 = pcxImagingParameters14.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setPixelDensity(pixelDensity14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(bufferedImageFactory9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(pixelDensity12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.asThis();
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setBitDepth((int) (byte) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters6.setFileName("hi!");
        org.apache.commons.imaging.PixelDensity pixelDensity12 = pcxImagingParameters6.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(pixelDensity12);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity7 = pcxImagingParameters6.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setCompression((int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = pcxImagingParameters8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(pixelDensity7);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters0.getPixelDensity();
        java.lang.String str7 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setPlanes((int) ' ');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setBitDepth((int) (short) 100);
        int int12 = pcxImagingParameters11.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters11.setBitDepth(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters14.setFileName("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setCompression((int) (short) -1);
        int int8 = pcxImagingParameters7.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setCompression(1);
        int int5 = pcxImagingParameters4.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = pcxImagingParameters6.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setCompression(97);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setFileName("hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(bufferedImageFactory7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setPixelDensity(pixelDensity6);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setBitDepth((int) (short) 0);
        java.lang.String str10 = pcxImagingParameters7.getFileName();
        int int11 = pcxImagingParameters7.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setCompression(1);
        int int5 = pcxImagingParameters4.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = pcxImagingParameters6.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setCompression(97);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters6.setPlanes(0);
        int int12 = pcxImagingParameters6.getBitDepth();
        boolean boolean13 = pcxImagingParameters6.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(bufferedImageFactory7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        int int7 = pcxImagingParameters4.getCompression();
        java.lang.String str8 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters4.setFileName("hi!");
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters4.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters4.setBitDepth((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters14.setPlanes((int) '#');
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory17 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters16.setBufferedImageFactory(bufferedImageFactory17);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setBitDepth((int) (byte) 0);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters9.setPlanes((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity15 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters12.setPixelDensity(pixelDensity15);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory17 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters12.setBufferedImageFactory(bufferedImageFactory17);
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
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        int int3 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setStrict(true);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setBitDepth((int) (short) 100);
        int int15 = pcxImagingParameters14.getPlanes();
        java.lang.String str16 = pcxImagingParameters14.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setPixelDensity(pixelDensity4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBitDepth((int) '#');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setFileName("");
        int int10 = pcxImagingParameters9.getBitDepth();
        boolean boolean11 = pcxImagingParameters9.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        java.lang.String str7 = pcxImagingParameters5.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setPlanes(100);
        java.lang.String str10 = pcxImagingParameters5.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters5.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setBufferedImageFactory(bufferedImageFactory13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters12.setPlanes(1);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setPixelDensity(pixelDensity6);
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setPixelDensity(pixelDensity8);
        boolean boolean10 = pcxImagingParameters0.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters0.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setStrict(false);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = pcxImagingParameters8.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters8.setPlanes((int) 'a');
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setBufferedImageFactory(bufferedImageFactory12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(bufferedImageFactory9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
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
        int int17 = pcxImagingParameters16.getBitDepth();
        java.lang.Class<?> wildcardClass18 = pcxImagingParameters16.getClass();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters21 = pcxImagingParameters19.setPlanes((int) (short) 0);
        int int22 = pcxImagingParameters19.getCompression();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters6.setBitDepth(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters6.setFileName("hi!");
        int int17 = pcxImagingParameters6.getBitDepth();
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
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        int int5 = pcxImagingParameters4.getCompression();
        int int6 = pcxImagingParameters4.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setPixelDensity(pixelDensity7);
        int int9 = pcxImagingParameters4.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters4.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters4.setStrict(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setFileName("hi!");
        int int10 = pcxImagingParameters9.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters16.setPlanes(35);
        java.lang.String str19 = pcxImagingParameters18.getFileName();
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
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters5.getPixelDensity();
        int int7 = pcxImagingParameters5.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setCompression((int) (byte) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setCompression((int) (byte) 10);
        org.apache.commons.imaging.PixelDensity pixelDensity12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setPixelDensity(pixelDensity12);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
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
        java.lang.String str12 = pcxImagingParameters9.getFileName();
        org.apache.commons.imaging.PixelDensity pixelDensity13 = pcxImagingParameters9.getPixelDensity();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(pixelDensity13);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters12.setCompression((int) (byte) 100);
        boolean boolean16 = pcxImagingParameters12.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters12.setBitDepth(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory9);
        int int11 = pcxImagingParameters8.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters8.setCompression(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters8.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters8.setPlanes((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setPixelDensity(pixelDensity4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBitDepth((int) '#');
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters7.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.setBufferedImageFactory(bufferedImageFactory9);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters7.setBitDepth(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNull(bufferedImageFactory8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters10.setPlanes((int) ' ');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters22 = pcxImagingParameters10.setPlanes(32);
        org.apache.commons.imaging.PixelDensity pixelDensity23 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters24 = pcxImagingParameters22.setPixelDensity(pixelDensity23);
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
        org.junit.Assert.assertNotNull(pcxImagingParameters20);
        org.junit.Assert.assertNotNull(pcxImagingParameters22);
        org.junit.Assert.assertNotNull(pcxImagingParameters24);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBitDepth((int) (short) 100);
        int int9 = pcxImagingParameters5.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters5.setPixelDensity(pixelDensity10);
        java.lang.String str12 = pcxImagingParameters11.getFileName();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setBitDepth((int) '4');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters15.setStrict(false);
        int int18 = pcxImagingParameters15.getCompression();
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
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setCompression((int) (short) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters7.asThis();
        int int9 = pcxImagingParameters8.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters8.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory10);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters17.setCompression(97);
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
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters5.getPixelDensity();
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setPixelDensity(pixelDensity7);
        int int9 = pcxImagingParameters5.getPlanes();
        int int10 = pcxImagingParameters5.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setPlanes((int) (byte) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setCompression((int) (short) 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        java.lang.String str7 = pcxImagingParameters5.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setPlanes(100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters9.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters9.setCompression((int) (byte) 0);
        int int13 = pcxImagingParameters12.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters12.setFileName("");
        org.apache.commons.imaging.PixelDensity pixelDensity16 = pcxImagingParameters12.getPixelDensity();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(bufferedImageFactory10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNull(pixelDensity16);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setStrict(false);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory16 = pcxImagingParameters10.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory17 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters10.setBufferedImageFactory(bufferedImageFactory17);
        java.lang.String str19 = pcxImagingParameters10.getFileName();
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
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setCompression(1);
        int int5 = pcxImagingParameters4.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = pcxImagingParameters6.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setCompression(97);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters6.setPlanes(0);
        int int12 = pcxImagingParameters6.getCompression();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(bufferedImageFactory7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        boolean boolean6 = pcxImagingParameters5.isStrict();
        int int7 = pcxImagingParameters5.getCompression();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory8);
        org.apache.commons.imaging.PixelDensity pixelDensity10 = pcxImagingParameters5.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(pixelDensity10);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
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
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory20 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters21 = pcxImagingParameters10.setBufferedImageFactory(bufferedImageFactory20);
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
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity7 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setBitDepth((int) '#');
        int int10 = pcxImagingParameters3.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(pixelDensity7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        int int6 = pcxImagingParameters5.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setFileName("");
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.PixelDensity pixelDensity3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters2.setPixelDensity(pixelDensity3);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters4.getBufferedImageFactory();
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setPixelDensity(pixelDensity6);
        java.lang.Class<?> wildcardClass8 = pcxImagingParameters4.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        java.lang.String str3 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters5.asThis();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters23 = pcxImagingParameters19.setBitDepth((int) (short) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters25 = pcxImagingParameters23.setFileName("");
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
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBitDepth(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setStrict(false);
        java.lang.String str10 = pcxImagingParameters9.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters9.setBitDepth(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters9.asThis();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters5.asThis();
        int int7 = pcxImagingParameters6.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = pcxImagingParameters6.getPixelDensity();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(pixelDensity8);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory6);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setPlanes((int) 'a');
        org.apache.commons.imaging.PixelDensity pixelDensity10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setPixelDensity(pixelDensity10);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.asThis();
        int int8 = pcxImagingParameters7.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.setBitDepth((int) ' ');
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setBufferedImageFactory(bufferedImageFactory11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory9);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters8.setPlanes(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        int int7 = pcxImagingParameters4.getBitDepth();
        int int8 = pcxImagingParameters4.getPlanes();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
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
        int int17 = pcxImagingParameters12.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters12.setStrict(false);
        org.apache.commons.imaging.PixelDensity pixelDensity20 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters21 = pcxImagingParameters19.setPixelDensity(pixelDensity20);
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
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertNotNull(pcxImagingParameters21);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters10.asThis();
        java.lang.String str12 = pcxImagingParameters10.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBitDepth(0);
        int int5 = pcxImagingParameters0.getBitDepth();
        int int6 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setPlanes(32);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters19.asThis();
        int int21 = pcxImagingParameters19.getCompression();
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
        org.junit.Assert.assertNotNull(pcxImagingParameters20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
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
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory20 = pcxImagingParameters19.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters22 = pcxImagingParameters19.setBitDepth(10);
        java.lang.String str23 = pcxImagingParameters19.getFileName();
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
        org.junit.Assert.assertNull(bufferedImageFactory20);
        org.junit.Assert.assertNotNull(pcxImagingParameters22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters8.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setBitDepth((int) 'a');
        java.lang.String str13 = pcxImagingParameters12.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(bufferedImageFactory10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        int int6 = pcxImagingParameters5.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters5.setStrict(true);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setPixelDensity(pixelDensity6);
        int int8 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters3.setPlanes((int) '4');
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = pcxImagingParameters10.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory12 = pcxImagingParameters10.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(bufferedImageFactory11);
        org.junit.Assert.assertNull(bufferedImageFactory12);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        boolean boolean9 = pcxImagingParameters8.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters0.setPixelDensity(pixelDensity9);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPlanes((int) '4');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory15 = pcxImagingParameters12.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNull(bufferedImageFactory15);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters10.setBitDepth(10);
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
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setStrict(true);
        int int15 = pcxImagingParameters12.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters12.setPlanes(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setPixelDensity(pixelDensity6);
        int int8 = pcxImagingParameters7.getCompression();
        java.lang.Class<?> wildcardClass9 = pcxImagingParameters7.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
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
        java.lang.Class<?> wildcardClass13 = pcxImagingParameters10.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
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
        org.apache.commons.imaging.PixelDensity pixelDensity16 = pcxImagingParameters15.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters15.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters15.asThis();
        int int20 = pcxImagingParameters15.getPlanes();
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
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters18.setFileName("");
        int int21 = pcxImagingParameters18.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters23 = pcxImagingParameters18.setBitDepth((-1));
        org.apache.commons.imaging.PixelDensity pixelDensity24 = pcxImagingParameters18.getPixelDensity();
        boolean boolean25 = pcxImagingParameters18.isStrict();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters23);
        org.junit.Assert.assertNull(pixelDensity24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters14.setFileName("");
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
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = pcxImagingParameters0.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory5);
        int int7 = pcxImagingParameters0.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNull(pixelDensity4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory6);
        int int8 = pcxImagingParameters5.getCompression();
        int int9 = pcxImagingParameters5.getCompression();
        int int10 = pcxImagingParameters5.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters5.setFileName("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setPlanes((int) '4');
        int int6 = pcxImagingParameters0.getPlanes();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.asThis();
        int int7 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setBufferedImageFactory(bufferedImageFactory10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters0.setPixelDensity(pixelDensity9);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPlanes((int) '4');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters14.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters14.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory5);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setPixelDensity(pixelDensity7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        int int4 = pcxImagingParameters3.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setFileName("hi!");
        int int9 = pcxImagingParameters6.getPlanes();
        int int10 = pcxImagingParameters6.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }
}

