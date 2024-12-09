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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression(10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters0.setStrict(false);
        java.lang.Class<?> wildcardClass11 = pcxImagingParameters10.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNull(bufferedImageFactory8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        int int6 = pcxImagingParameters3.getCompression();
        int int7 = pcxImagingParameters3.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setFileName("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression(10);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters0.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory9);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = pcxImagingParameters10.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(bufferedImageFactory11);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setPixelDensity(pixelDensity6);
        int int8 = pcxImagingParameters3.getCompression();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        int int4 = pcxImagingParameters3.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters3.setCompression((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters3.setPlanes(1);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
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
        boolean boolean20 = pcxImagingParameters19.isStrict();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.PixelDensity pixelDensity9 = pcxImagingParameters6.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(pixelDensity9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setPlanes((int) '4');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setFileName("hi!");
        int int12 = pcxImagingParameters11.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
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
        java.lang.Class<?> wildcardClass13 = pcxImagingParameters12.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBitDepth(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setStrict(false);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        int int9 = pcxImagingParameters6.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setPlanes((int) (byte) 10);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
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
        int int15 = pcxImagingParameters14.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity16 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters14.setPixelDensity(pixelDensity16);
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
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setBitDepth((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters7.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setBitDepth((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setCompression((int) (short) 10);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters8.setPixelDensity(pixelDensity13);
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
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        int int6 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters3.setStrict(true);
        java.lang.String str9 = pcxImagingParameters8.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters8.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters8.setFileName("hi!");
        java.lang.String str14 = pcxImagingParameters13.getFileName();
        int int15 = pcxImagingParameters13.getPlanes();
        int int16 = pcxImagingParameters13.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setBufferedImageFactory(bufferedImageFactory12);
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
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setFileName("hi!");
        java.lang.String str8 = pcxImagingParameters3.getFileName();
        org.apache.commons.imaging.PixelDensity pixelDensity9 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters3.setBitDepth(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(pixelDensity9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setPixelDensity(pixelDensity4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory7);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setFileName("hi!");
        int int8 = pcxImagingParameters7.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters5.setPlanes((int) (short) 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNull(bufferedImageFactory7);
        org.junit.Assert.assertNull(bufferedImageFactory8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters4.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory6);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters5.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNull(bufferedImageFactory8);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
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
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory15 = pcxImagingParameters10.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNull(bufferedImageFactory15);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters18.asThis();
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
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setBitDepth((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory12 = pcxImagingParameters10.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(bufferedImageFactory12);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.PixelDensity pixelDensity4 = pcxImagingParameters2.getPixelDensity();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNull(pixelDensity4);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.asThis();
        boolean boolean7 = pcxImagingParameters4.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters4.setFileName("");
        java.lang.Class<?> wildcardClass10 = pcxImagingParameters9.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters0.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory7);
        java.lang.Class<?> wildcardClass9 = pcxImagingParameters8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
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
        java.lang.String str19 = pcxImagingParameters18.getFileName();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setBitDepth((int) '#');
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setPixelDensity(pixelDensity9);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = pcxImagingParameters10.getBufferedImageFactory();
        java.lang.String str12 = pcxImagingParameters10.getFileName();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(bufferedImageFactory11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
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
        int int15 = pcxImagingParameters9.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.asThis();
        int int15 = pcxImagingParameters14.getPlanes();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        int int4 = pcxImagingParameters3.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setCompression(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters22 = pcxImagingParameters20.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory23 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters24 = pcxImagingParameters20.setBufferedImageFactory(bufferedImageFactory23);
        org.apache.commons.imaging.PixelDensity pixelDensity25 = pcxImagingParameters20.getPixelDensity();
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
        org.junit.Assert.assertNotNull(pcxImagingParameters24);
        org.junit.Assert.assertNull(pixelDensity25);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setPixelDensity(pixelDensity4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters3.setBitDepth((int) (byte) 100);
        boolean boolean9 = pcxImagingParameters3.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.asThis();
        int int6 = pcxImagingParameters2.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setCompression((int) (short) 0);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory11);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory13 = pcxImagingParameters12.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNull(bufferedImageFactory13);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setCompression((-1));
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
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters15.setBitDepth(10);
        int int19 = pcxImagingParameters15.getBitDepth();
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
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
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
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory17 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory17);
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
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters3.getPixelDensity();
        int int7 = pcxImagingParameters3.getPlanes();
        int int8 = pcxImagingParameters3.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity9 = pcxImagingParameters3.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(pixelDensity9);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        int int7 = pcxImagingParameters4.getCompression();
        java.lang.String str8 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters4.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setBitDepth((int) ' ');
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters5.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setCompression((-1));
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters5.setCompression(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters5.setFileName("");
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNull(bufferedImageFactory7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
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
        java.lang.Class<?> wildcardClass17 = pcxImagingParameters10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setPixelDensity(pixelDensity6);
        int int8 = pcxImagingParameters3.getCompression();
        java.lang.String str9 = pcxImagingParameters3.getFileName();
        int int10 = pcxImagingParameters3.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setBitDepth((int) '#');
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setPixelDensity(pixelDensity9);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = pcxImagingParameters8.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters8.setBitDepth((int) ' ');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory15 = pcxImagingParameters14.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(pixelDensity11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNull(bufferedImageFactory15);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setPixelDensity(pixelDensity6);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setStrict(true);
        java.lang.String str10 = pcxImagingParameters9.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
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
        int int11 = pcxImagingParameters3.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        int int3 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory6);
        java.lang.String str8 = pcxImagingParameters7.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.setBitDepth((-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
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
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory16 = pcxImagingParameters15.getBufferedImageFactory();
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
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters13.setCompression((-1));
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters17.setPlanes((int) (byte) 10);
        int int20 = pcxImagingParameters17.getCompression();
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
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        int int11 = pcxImagingParameters10.getBitDepth();
        java.lang.String str12 = pcxImagingParameters10.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity15 = pcxImagingParameters14.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNull(pixelDensity15);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
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
        org.apache.commons.imaging.PixelDensity pixelDensity15 = pcxImagingParameters12.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNull(pixelDensity15);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        boolean boolean2 = pcxImagingParameters0.isStrict();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        int int4 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setPixelDensity(pixelDensity5);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = pcxImagingParameters6.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(pixelDensity7);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        int int5 = pcxImagingParameters4.getCompression();
        int int6 = pcxImagingParameters4.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setPixelDensity(pixelDensity7);
        int int9 = pcxImagingParameters4.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        int int8 = pcxImagingParameters6.getCompression();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory9);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters0.setCompression((int) (byte) -1);
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
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
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
        int int16 = pcxImagingParameters12.getBitDepth();
        int int17 = pcxImagingParameters12.getBitDepth();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        java.lang.Class<?> wildcardClass4 = pcxImagingParameters3.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
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
        int int18 = pcxImagingParameters15.getBitDepth();
        int int19 = pcxImagingParameters15.getCompression();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        int int7 = pcxImagingParameters4.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = pcxImagingParameters4.getPixelDensity();
        org.apache.commons.imaging.PixelDensity pixelDensity9 = pcxImagingParameters4.getPixelDensity();
        int int10 = pcxImagingParameters4.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(pixelDensity8);
        org.junit.Assert.assertNull(pixelDensity9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setStrict(false);
        int int12 = pcxImagingParameters9.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
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
        java.lang.Class<?> wildcardClass14 = pcxImagingParameters13.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setCompression((int) (byte) 0);
        int int10 = pcxImagingParameters9.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters4.setCompression(0);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = pcxImagingParameters13.getBufferedImageFactory();
        org.apache.commons.imaging.PixelDensity pixelDensity15 = pcxImagingParameters13.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNull(bufferedImageFactory14);
        org.junit.Assert.assertNull(pixelDensity15);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters4.getBufferedImageFactory();
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setPixelDensity(pixelDensity6);
        int int8 = pcxImagingParameters4.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters4.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        java.lang.String str7 = pcxImagingParameters5.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setPlanes(100);
        org.apache.commons.imaging.PixelDensity pixelDensity10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters5.setPixelDensity(pixelDensity10);
        org.apache.commons.imaging.PixelDensity pixelDensity12 = pcxImagingParameters11.getPixelDensity();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(pixelDensity12);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters0.getPixelDensity();
        java.lang.String str7 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setPlanes((int) ' ');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setBitDepth((int) (short) 100);
        int int12 = pcxImagingParameters11.getCompression();
        boolean boolean13 = pcxImagingParameters11.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setPlanes((int) (byte) -1);
        java.lang.String str6 = pcxImagingParameters3.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
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
        org.apache.commons.imaging.PixelDensity pixelDensity15 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters10.setPixelDensity(pixelDensity15);
        java.lang.Class<?> wildcardClass17 = pcxImagingParameters16.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters5.setBitDepth(100);
        int int11 = pcxImagingParameters10.getPlanes();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
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
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory15 = pcxImagingParameters14.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNull(bufferedImageFactory15);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setCompression((int) (short) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setPlanes((-1));
        boolean boolean10 = pcxImagingParameters7.isStrict();
        org.apache.commons.imaging.PixelDensity pixelDensity11 = pcxImagingParameters7.getPixelDensity();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(pixelDensity11);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters0.setPixelDensity(pixelDensity9);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPlanes((int) '4');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPlanes((int) (short) 100);
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
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setStrict(false);
        int int5 = pcxImagingParameters4.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setCompression((int) ' ');
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters9.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.asThis();
        java.lang.Class<?> wildcardClass12 = pcxImagingParameters9.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(bufferedImageFactory10);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        java.lang.String str3 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setFileName("hi!");
        boolean boolean8 = pcxImagingParameters7.isStrict();
        int int9 = pcxImagingParameters7.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = pcxImagingParameters6.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory12 = pcxImagingParameters6.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters6.setBitDepth((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters6.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters16.setFileName("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(pixelDensity11);
        org.junit.Assert.assertNull(bufferedImageFactory12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setStrict(false);
        int int12 = pcxImagingParameters9.getCompression();
        boolean boolean13 = pcxImagingParameters9.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters9.setFileName("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setPixelDensity(pixelDensity4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBitDepth((int) '#');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setFileName("");
        java.lang.String str10 = pcxImagingParameters9.getFileName();
        org.apache.commons.imaging.PixelDensity pixelDensity11 = pcxImagingParameters9.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(pixelDensity11);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
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
        int int16 = pcxImagingParameters10.getBitDepth();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory17 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters10.setBufferedImageFactory(bufferedImageFactory17);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters18.setCompression(100);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertNotNull(pcxImagingParameters20);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBitDepth(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setStrict(true);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setBufferedImageFactory(bufferedImageFactory8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters7.setPlanes(100);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        java.lang.String str9 = pcxImagingParameters6.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters6.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters6.setBitDepth((int) '4');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setPlanes(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(bufferedImageFactory10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setCompression((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity10 = pcxImagingParameters9.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = pcxImagingParameters9.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters9.setBitDepth((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(pixelDensity10);
        org.junit.Assert.assertNull(bufferedImageFactory11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setCompression((int) (short) 100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = pcxImagingParameters6.getBufferedImageFactory();
        org.apache.commons.imaging.PixelDensity pixelDensity10 = pcxImagingParameters6.getPixelDensity();
        int int11 = pcxImagingParameters6.getBitDepth();
        int int12 = pcxImagingParameters6.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(bufferedImageFactory9);
        org.junit.Assert.assertNull(pixelDensity10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters8.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setPlanes((int) '#');
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
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setCompression(1);
        int int5 = pcxImagingParameters4.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setCompression((int) ' ');
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        int int10 = pcxImagingParameters8.getPlanes();
        int int11 = pcxImagingParameters8.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setPlanes(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBitDepth(0);
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setPixelDensity(pixelDensity8);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
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
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory20 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters21 = pcxImagingParameters19.setBufferedImageFactory(bufferedImageFactory20);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters22 = pcxImagingParameters21.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory23 = pcxImagingParameters22.getBufferedImageFactory();
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
        org.junit.Assert.assertNotNull(pcxImagingParameters22);
        org.junit.Assert.assertNull(bufferedImageFactory23);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters18.setCompression((int) (short) 100);
        java.lang.Class<?> wildcardClass21 = pcxImagingParameters20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
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
        java.lang.String str16 = pcxImagingParameters10.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters10.setCompression((int) 'a');
        java.lang.String str19 = pcxImagingParameters18.getFileName();
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
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setPlanes((-1));
        int int9 = pcxImagingParameters4.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters16.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.PixelDensity pixelDensity20 = pcxImagingParameters19.getPixelDensity();
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
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertNull(pixelDensity20);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPlanes((int) (short) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        int int10 = pcxImagingParameters8.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters8.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBitDepth((-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setStrict(false);
        int int12 = pcxImagingParameters11.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.asThis();
        int int14 = pcxImagingParameters13.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory15 = pcxImagingParameters13.getBufferedImageFactory();
        int int16 = pcxImagingParameters13.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(bufferedImageFactory15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        int int6 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setPixelDensity(pixelDensity9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        int int9 = pcxImagingParameters8.getBitDepth();
        java.lang.String str10 = pcxImagingParameters8.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters0.getPixelDensity();
        java.lang.String str7 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setPlanes((int) ' ');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters9.setPlanes((int) 'a');
        int int14 = pcxImagingParameters13.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        java.lang.String str3 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setPlanes(35);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters14.setPlanes((int) (short) 1);
        int int17 = pcxImagingParameters14.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        java.lang.String str4 = pcxImagingParameters0.getFileName();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
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
        int int13 = pcxImagingParameters12.getPlanes();
        java.lang.Class<?> wildcardClass14 = pcxImagingParameters12.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        boolean boolean2 = pcxImagingParameters0.isStrict();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        int int4 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setPixelDensity(pixelDensity5);
        boolean boolean7 = pcxImagingParameters0.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters10.setBitDepth((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBitDepth(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setCompression((int) 'a');
        int int8 = pcxImagingParameters2.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters2.setCompression((int) (byte) 10);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setPixelDensity(pixelDensity7);
        java.lang.Class<?> wildcardClass9 = pcxImagingParameters5.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) ' ');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters6.setBitDepth((int) (byte) 100);
        int int13 = pcxImagingParameters6.getPlanes();
        int int14 = pcxImagingParameters6.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters6.setCompression((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters16.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters18.setPlanes((-1));
        org.apache.commons.imaging.PixelDensity pixelDensity21 = pcxImagingParameters20.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertNotNull(pcxImagingParameters20);
        org.junit.Assert.assertNull(pixelDensity21);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
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
        boolean boolean14 = pcxImagingParameters13.isStrict();
        int int15 = pcxImagingParameters13.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        java.lang.String str7 = pcxImagingParameters6.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setBitDepth((-1));
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters9.asThis();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBitDepth(0);
        java.lang.String str5 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setFileName("");
        int int8 = pcxImagingParameters7.getCompression();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.setBufferedImageFactory(bufferedImageFactory9);
        int int11 = pcxImagingParameters10.getCompression();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setCompression((int) (short) 10);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory13 = pcxImagingParameters8.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNull(bufferedImageFactory13);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
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
        int int16 = pcxImagingParameters10.getPlanes();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.setCompression((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = pcxImagingParameters6.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(bufferedImageFactory7);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        int int9 = pcxImagingParameters6.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters6.setBitDepth(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory12 = pcxImagingParameters11.getBufferedImageFactory();
        java.lang.Class<?> wildcardClass13 = pcxImagingParameters11.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(bufferedImageFactory12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
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
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory16 = pcxImagingParameters15.getBufferedImageFactory();
        int int17 = pcxImagingParameters15.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters15.setFileName("");
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
        org.junit.Assert.assertNull(bufferedImageFactory16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        boolean boolean3 = pcxImagingParameters2.isStrict();
        org.apache.commons.imaging.PixelDensity pixelDensity4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setPixelDensity(pixelDensity4);
        int int6 = pcxImagingParameters5.getCompression();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) ' ');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters6.setBitDepth((int) (byte) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters6.setCompression((int) (byte) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters6.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setBitDepth((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
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
        org.apache.commons.imaging.PixelDensity pixelDensity18 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters16.setPixelDensity(pixelDensity18);
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
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setPlanes((int) '4');
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters7.setBitDepth((int) (byte) 1);
        int int12 = pcxImagingParameters7.getPlanes();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setPlanes((int) '4');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity11 = pcxImagingParameters7.getPixelDensity();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(pixelDensity11);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setStrict(true);
        int int15 = pcxImagingParameters12.getPlanes();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
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
        boolean boolean16 = pcxImagingParameters13.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters12.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters16.setBitDepth(10);
        org.apache.commons.imaging.PixelDensity pixelDensity19 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters16.setPixelDensity(pixelDensity19);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertNotNull(pcxImagingParameters20);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
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
        int int15 = pcxImagingParameters12.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters5.asThis();
        java.lang.String str7 = pcxImagingParameters6.getFileName();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBitDepth((int) (short) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setCompression(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression(10);
        java.lang.Class<?> wildcardClass6 = pcxImagingParameters5.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = pcxImagingParameters0.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setStrict(true);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = pcxImagingParameters6.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setCompression(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNull(pixelDensity4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(bufferedImageFactory7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters14.setFileName("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(pixelDensity12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setStrict(false);
        int int13 = pcxImagingParameters12.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
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
        org.apache.commons.imaging.PixelDensity pixelDensity20 = pcxImagingParameters19.getPixelDensity();
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
        org.junit.Assert.assertNull(pixelDensity20);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
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
        int int13 = pcxImagingParameters12.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters12.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters15.setBitDepth(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setStrict(false);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setStrict(false);
        int int15 = pcxImagingParameters12.getBitDepth();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory16 = pcxImagingParameters12.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNull(bufferedImageFactory16);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters13.setBitDepth((int) (short) 0);
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
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        int int4 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters0.setCompression((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setCompression(1);
        int int5 = pcxImagingParameters4.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setCompression(0);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters4.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNull(bufferedImageFactory8);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        int int4 = pcxImagingParameters3.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.setPlanes((int) (short) 1);
        int int7 = pcxImagingParameters6.getPlanes();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
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
        org.apache.commons.imaging.PixelDensity pixelDensity16 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters10.setPixelDensity(pixelDensity16);
        int int18 = pcxImagingParameters17.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters17.asThis();
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
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setPixelDensity(pixelDensity5);
        int int7 = pcxImagingParameters6.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters9.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPlanes(35);
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
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setCompression((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters9.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters9.setBufferedImageFactory(bufferedImageFactory11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters9.setBitDepth((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) ' ');
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = pcxImagingParameters10.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setBitDepth((int) (short) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setPlanes(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(bufferedImageFactory11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        java.lang.String str3 = pcxImagingParameters0.getFileName();
        int int4 = pcxImagingParameters0.getPlanes();
        int int5 = pcxImagingParameters0.getCompression();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters5.getPixelDensity();
        java.lang.String str7 = pcxImagingParameters5.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setBitDepth(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setCompression((-1));
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory13 = pcxImagingParameters10.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setBitDepth((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNull(bufferedImageFactory13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = pcxImagingParameters3.getBufferedImageFactory();
        java.lang.String str5 = pcxImagingParameters3.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setBitDepth(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNull(bufferedImageFactory4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
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
        boolean boolean11 = pcxImagingParameters10.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNull(bufferedImageFactory7);
        org.junit.Assert.assertNull(bufferedImageFactory8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        boolean boolean8 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.PixelDensity pixelDensity9 = pcxImagingParameters6.getPixelDensity();
        boolean boolean10 = pcxImagingParameters6.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(pixelDensity9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        int int6 = pcxImagingParameters3.getCompression();
        int int7 = pcxImagingParameters3.getBitDepth();
        java.lang.Class<?> wildcardClass8 = pcxImagingParameters3.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters3.getPixelDensity();
        int int7 = pcxImagingParameters3.getPlanes();
        int int8 = pcxImagingParameters3.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters3.setStrict(true);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
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
        org.apache.commons.imaging.PixelDensity pixelDensity14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setPixelDensity(pixelDensity14);
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
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters17.setFileName("hi!");
        java.lang.String str20 = pcxImagingParameters17.getFileName();
        int int21 = pcxImagingParameters17.getPlanes();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        int int6 = pcxImagingParameters0.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setBitDepth((int) (byte) 0);
        int int8 = pcxImagingParameters7.getPlanes();
        java.lang.Class<?> wildcardClass9 = pcxImagingParameters7.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        java.lang.Class<?> wildcardClass6 = pcxImagingParameters3.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters16.setFileName("");
        java.lang.String str19 = pcxImagingParameters16.getFileName();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.PixelDensity pixelDensity7 = pcxImagingParameters5.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNull(pixelDensity7);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
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
        org.apache.commons.imaging.PixelDensity pixelDensity21 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters22 = pcxImagingParameters17.setPixelDensity(pixelDensity21);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters24 = pcxImagingParameters22.setPlanes((int) (byte) 0);
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
        org.junit.Assert.assertNotNull(pcxImagingParameters22);
        org.junit.Assert.assertNotNull(pcxImagingParameters24);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.asThis();
        int int7 = pcxImagingParameters6.getBitDepth();
        boolean boolean8 = pcxImagingParameters6.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setCompression((int) (short) 100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = pcxImagingParameters6.getBufferedImageFactory();
        org.apache.commons.imaging.PixelDensity pixelDensity10 = pcxImagingParameters6.getPixelDensity();
        boolean boolean11 = pcxImagingParameters6.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(bufferedImageFactory9);
        org.junit.Assert.assertNull(pixelDensity10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters4.setPixelDensity(pixelDensity8);
        boolean boolean10 = pcxImagingParameters9.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setFileName("hi!");
        int int7 = pcxImagingParameters4.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters4.setPixelDensity(pixelDensity8);
        java.lang.String str10 = pcxImagingParameters4.getFileName();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
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
        int int23 = pcxImagingParameters14.getCompression();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters23 = pcxImagingParameters19.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters25 = pcxImagingParameters23.setBitDepth((int) (byte) 10);
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
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) ' ');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters6.setBitDepth((int) (byte) 100);
        int int13 = pcxImagingParameters6.getPlanes();
        int int14 = pcxImagingParameters6.getCompression();
        java.lang.String str15 = pcxImagingParameters6.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setBitDepth((int) ' ');
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBitDepth((int) (short) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setStrict(true);
        int int11 = pcxImagingParameters10.getCompression();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory12 = pcxImagingParameters10.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(bufferedImageFactory12);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setPlanes((int) '4');
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
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory6);
        int int8 = pcxImagingParameters7.getBitDepth();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = pcxImagingParameters7.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory9);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = pcxImagingParameters0.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory5);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setFileName("hi!");
        int int9 = pcxImagingParameters6.getCompression();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNull(pixelDensity4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression(10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setPlanes(97);
        org.apache.commons.imaging.PixelDensity pixelDensity10 = pcxImagingParameters9.getPixelDensity();
        org.apache.commons.imaging.PixelDensity pixelDensity11 = pcxImagingParameters9.getPixelDensity();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(pixelDensity10);
        org.junit.Assert.assertNull(pixelDensity11);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory10);
        java.lang.String str12 = pcxImagingParameters6.getFileName();
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters6.setPixelDensity(pixelDensity13);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setPixelDensity(pixelDensity6);
        int int8 = pcxImagingParameters7.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        int int9 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.PixelDensity pixelDensity12 = pcxImagingParameters0.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(pixelDensity12);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBitDepth(0);
        int int5 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setPixelDensity(pixelDensity6);
        boolean boolean8 = pcxImagingParameters7.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
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
        int int13 = pcxImagingParameters12.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        java.lang.Class<?> wildcardClass6 = pcxImagingParameters5.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory6);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters3.getBufferedImageFactory();
        int int9 = pcxImagingParameters3.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNull(bufferedImageFactory8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        int int4 = pcxImagingParameters3.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters3.setFileName("");
        org.apache.commons.imaging.PixelDensity pixelDensity9 = pcxImagingParameters8.getPixelDensity();
        int int10 = pcxImagingParameters8.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(pixelDensity9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters23 = pcxImagingParameters19.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters25 = pcxImagingParameters23.setBitDepth(97);
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
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setPlanes((int) '4');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters7.setPlanes(52);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPlanes((-1));
        java.lang.Class<?> wildcardClass13 = pcxImagingParameters10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
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
        java.lang.Class<?> wildcardClass12 = pcxImagingParameters9.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setFileName("hi!");
        int int7 = pcxImagingParameters4.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters4.setPixelDensity(pixelDensity8);
        int int10 = pcxImagingParameters9.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        int int3 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
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
        java.lang.String str17 = pcxImagingParameters14.getFileName();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setPlanes((int) (byte) 10);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters3.getPixelDensity();
        boolean boolean7 = pcxImagingParameters3.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setCompression((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) ' ');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters6.setBitDepth((int) (byte) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters6.setCompression((int) (byte) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters14.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setBitDepth((int) (byte) 0);
        int int8 = pcxImagingParameters7.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.setBitDepth(100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = pcxImagingParameters7.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(bufferedImageFactory11);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setPlanes((int) '#');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters4.setFileName("hi!");
        boolean boolean11 = pcxImagingParameters10.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters0.getPixelDensity();
        java.lang.String str7 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setPlanes((int) ' ');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setBitDepth((int) (short) 100);
        java.lang.Class<?> wildcardClass12 = pcxImagingParameters11.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        int int11 = pcxImagingParameters10.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        int int3 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setPixelDensity(pixelDensity6);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory8);
        org.apache.commons.imaging.PixelDensity pixelDensity10 = pcxImagingParameters9.getPixelDensity();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(pixelDensity10);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setCompression((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters9.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters9.setBufferedImageFactory(bufferedImageFactory11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters12.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPlanes((int) (short) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = pcxImagingParameters6.getBufferedImageFactory();
        java.lang.String str10 = pcxImagingParameters6.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(bufferedImageFactory9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters0.getPixelDensity();
        java.lang.String str7 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setPlanes((int) ' ');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters9.setPlanes((int) 'a');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setCompression(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters5.getPixelDensity();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters15.setFileName("");
        int int18 = pcxImagingParameters17.getCompression();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters12.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory17 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters16.setBufferedImageFactory(bufferedImageFactory17);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setPixelDensity(pixelDensity6);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setBitDepth((int) (short) 0);
        int int10 = pcxImagingParameters7.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters0.setPixelDensity(pixelDensity9);
        int int11 = pcxImagingParameters0.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters0.setPlanes(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
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
        int int18 = pcxImagingParameters16.getPlanes();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        boolean boolean2 = pcxImagingParameters0.isStrict();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        int int4 = pcxImagingParameters0.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBitDepth(0);
        int int6 = pcxImagingParameters5.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory9);
        int int11 = pcxImagingParameters5.getCompression();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
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
        int int13 = pcxImagingParameters11.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression(10);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters0.getPixelDensity();
        int int7 = pcxImagingParameters0.getCompression();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        boolean boolean11 = pcxImagingParameters10.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setPlanes((int) '#');
        org.apache.commons.imaging.PixelDensity pixelDensity14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setPixelDensity(pixelDensity14);
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
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setPlanes((-1));
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setFileName("hi!");
        int int11 = pcxImagingParameters10.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setPlanes((int) '4');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.asThis();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
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
        int int20 = pcxImagingParameters19.getPlanes();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.asThis();
        java.lang.Class<?> wildcardClass4 = pcxImagingParameters3.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setCompression(1);
        int int8 = pcxImagingParameters7.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory9);
        int int11 = pcxImagingParameters10.getBitDepth();
        java.lang.Class<?> wildcardClass12 = pcxImagingParameters10.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters21 = pcxImagingParameters10.setCompression(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters23 = pcxImagingParameters21.setPlanes(0);
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
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        int int6 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity9 = pcxImagingParameters8.getPixelDensity();
        java.lang.String str10 = pcxImagingParameters8.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(pixelDensity9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
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
        int int13 = pcxImagingParameters11.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(pixelDensity12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setBitDepth(1);
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
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setPixelDensity(pixelDensity5);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setCompression(32);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory6);
        int int8 = pcxImagingParameters5.getCompression();
        java.lang.String str9 = pcxImagingParameters5.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBitDepth((int) (byte) 100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters9.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setCompression(0);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setCompression(1);
        int int5 = pcxImagingParameters4.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters4.getPixelDensity();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(pixelDensity6);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = pcxImagingParameters0.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters0.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(pixelDensity7);
        org.junit.Assert.assertNull(bufferedImageFactory8);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        int int4 = pcxImagingParameters3.getBitDepth();
        boolean boolean5 = pcxImagingParameters3.isStrict();
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setPixelDensity(pixelDensity6);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setPixelDensity(pixelDensity4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBitDepth((int) '#');
        int int8 = pcxImagingParameters5.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters5.setFileName("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
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
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory20 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters21 = pcxImagingParameters19.setBufferedImageFactory(bufferedImageFactory20);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters22 = pcxImagingParameters21.asThis();
        int int23 = pcxImagingParameters22.getCompression();
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
        org.junit.Assert.assertNotNull(pcxImagingParameters22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setCompression((int) (short) 0);
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
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters14.asThis();
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
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
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
        java.lang.String str17 = pcxImagingParameters16.getFileName();
        org.apache.commons.imaging.PixelDensity pixelDensity18 = pcxImagingParameters16.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(pixelDensity18);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setPlanes((int) (byte) -1);
        int int8 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = pcxImagingParameters3.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(bufferedImageFactory9);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setFileName("hi!");
        int int7 = pcxImagingParameters4.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression(10);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters0.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory9);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setPixelDensity(pixelDensity11);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters25 = pcxImagingParameters15.setCompression((-1));
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
        org.junit.Assert.assertNotNull(pcxImagingParameters25);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        int int4 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setBitDepth((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setBufferedImageFactory(bufferedImageFactory14);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters13.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getBitDepth();
        java.lang.String str2 = pcxImagingParameters0.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
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
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters4.setBufferedImageFactory(bufferedImageFactory11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setFileName("hi!");
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
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters0.getPixelDensity();
        boolean boolean7 = pcxImagingParameters0.isStrict();
        int int8 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters0.setBitDepth((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        int int9 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters0.setPlanes((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
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
        java.lang.Class<?> wildcardClass13 = pcxImagingParameters12.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBitDepth((int) (byte) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setFileName("");
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory6);
        org.apache.commons.imaging.PixelDensity pixelDensity8 = pcxImagingParameters2.getPixelDensity();
        int int9 = pcxImagingParameters2.getBitDepth();
        java.lang.String str10 = pcxImagingParameters2.getFileName();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNull(pixelDensity8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setPlanes((int) (byte) 10);
        int int6 = pcxImagingParameters5.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        boolean boolean5 = pcxImagingParameters4.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBitDepth(10);
        java.lang.String str6 = pcxImagingParameters3.getFileName();
        int int7 = pcxImagingParameters3.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
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
        org.apache.commons.imaging.PixelDensity pixelDensity14 = pcxImagingParameters7.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(pixelDensity9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNull(pixelDensity14);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
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
        boolean boolean20 = pcxImagingParameters17.isStrict();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory21 = pcxImagingParameters17.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters23 = pcxImagingParameters17.setCompression((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(bufferedImageFactory21);
        org.junit.Assert.assertNotNull(pcxImagingParameters23);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        int int9 = pcxImagingParameters6.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) ' ');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters6.setBitDepth((int) (byte) 100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory13 = pcxImagingParameters12.getBufferedImageFactory();
        org.apache.commons.imaging.PixelDensity pixelDensity14 = pcxImagingParameters12.getPixelDensity();
        boolean boolean15 = pcxImagingParameters12.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNull(bufferedImageFactory13);
        org.junit.Assert.assertNull(pixelDensity14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setCompression((int) (short) 100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = pcxImagingParameters6.getBufferedImageFactory();
        org.apache.commons.imaging.PixelDensity pixelDensity10 = pcxImagingParameters6.getPixelDensity();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = pixelDensity10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(bufferedImageFactory9);
        org.junit.Assert.assertNull(pixelDensity10);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
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
        java.lang.String str15 = pcxImagingParameters10.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setPlanes((int) '4');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters7.setFileName("hi!");
        org.apache.commons.imaging.PixelDensity pixelDensity13 = pcxImagingParameters7.getPixelDensity();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNull(pixelDensity13);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        int int6 = pcxImagingParameters5.getPlanes();
        int int7 = pcxImagingParameters5.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setPixelDensity(pixelDensity4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters3.setBitDepth((int) (byte) 100);
        int int9 = pcxImagingParameters3.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPlanes((int) (short) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = pcxImagingParameters6.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(bufferedImageFactory9);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setPlanes((int) 'a');
        boolean boolean8 = pcxImagingParameters4.isStrict();
        boolean boolean9 = pcxImagingParameters4.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
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
        boolean boolean16 = pcxImagingParameters14.isStrict();
        int int17 = pcxImagingParameters14.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters14.setStrict(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters3.getPixelDensity();
        int int7 = pcxImagingParameters3.getPlanes();
        java.lang.String str8 = pcxImagingParameters3.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = pcxImagingParameters3.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters3.setBitDepth(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(bufferedImageFactory9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        java.lang.String str7 = pcxImagingParameters6.getFileName();
        int int8 = pcxImagingParameters6.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setStrict(false);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setCompression((int) (short) 100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setBufferedImageFactory(bufferedImageFactory8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters7.setFileName("hi!");
        java.lang.String str12 = pcxImagingParameters11.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters0.getPixelDensity();
        java.lang.String str7 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setPlanes((int) ' ');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters9.setPlanes((int) 'a');
        java.lang.String str14 = pcxImagingParameters13.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters4.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setPixelDensity(pixelDensity6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters5.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setCompression((int) ' ');
        java.lang.Class<?> wildcardClass9 = pcxImagingParameters5.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        int int3 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBitDepth((int) (byte) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters7.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(bufferedImageFactory10);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters0.setPixelDensity(pixelDensity9);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPlanes((int) '4');
        org.apache.commons.imaging.PixelDensity pixelDensity13 = pcxImagingParameters10.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setCompression((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters10.setCompression((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNull(pixelDensity13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setCompression((int) (short) 10);
        int int11 = pcxImagingParameters10.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        int int4 = pcxImagingParameters2.getCompression();
        int int5 = pcxImagingParameters2.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        boolean boolean6 = pcxImagingParameters5.isStrict();
        int int7 = pcxImagingParameters5.getCompression();
        int int8 = pcxImagingParameters5.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters5.setFileName("hi!");
        java.lang.String str11 = pcxImagingParameters5.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
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
        java.lang.Class<?> wildcardClass17 = pcxImagingParameters16.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters0.getBufferedImageFactory();
        int int6 = pcxImagingParameters0.getPlanes();
        java.lang.String str7 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setBitDepth(52);
        int int10 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters0.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
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
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory20 = pcxImagingParameters19.getBufferedImageFactory();
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
        org.junit.Assert.assertNull(bufferedImageFactory20);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters10.setStrict(true);
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
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.PixelDensity pixelDensity3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPixelDensity(pixelDensity3);
        java.lang.String str5 = pcxImagingParameters0.getFileName();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
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
        int int18 = pcxImagingParameters17.getCompression();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters15.setFileName("");
        java.lang.Class<?> wildcardClass18 = pcxImagingParameters17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters21 = pcxImagingParameters17.setCompression((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(pcxImagingParameters21);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        java.lang.String str9 = pcxImagingParameters6.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters6.setBitDepth(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
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
        int int16 = pcxImagingParameters10.getBitDepth();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory17 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters10.setBufferedImageFactory(bufferedImageFactory17);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters10.setFileName("hi!");
        int int21 = pcxImagingParameters10.getBitDepth();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertNotNull(pcxImagingParameters20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
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
        boolean boolean17 = pcxImagingParameters16.isStrict();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = pcxImagingParameters0.getPixelDensity();
        int int5 = pcxImagingParameters0.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNull(pixelDensity4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters3.getPixelDensity();
        int int7 = pcxImagingParameters3.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(pixelDensity8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
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
        org.apache.commons.imaging.PixelDensity pixelDensity15 = pcxImagingParameters12.getPixelDensity();
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
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        java.lang.String str3 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory4);
        int int6 = pcxImagingParameters5.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.asThis();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters21 = pcxImagingParameters19.setCompression((int) (short) 0);
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
        org.junit.Assert.assertNotNull(pcxImagingParameters21);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
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
        int int14 = pcxImagingParameters13.getCompression();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNull(bufferedImageFactory7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters12.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters17.setPlanes((int) (short) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters21 = pcxImagingParameters17.setPlanes(0);
        boolean boolean22 = pcxImagingParameters21.isStrict();
        int int23 = pcxImagingParameters21.getPlanes();
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
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertNotNull(pcxImagingParameters21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBitDepth(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setCompression((int) 'a');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setStrict(true);
        int int10 = pcxImagingParameters7.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters7.setPixelDensity(pixelDensity11);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        int int11 = pcxImagingParameters10.getBitDepth();
        int int12 = pcxImagingParameters10.getCompression();
        int int13 = pcxImagingParameters10.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBitDepth(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setStrict(true);
        boolean boolean8 = pcxImagingParameters7.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.setCompression((int) (byte) 0);
        int int11 = pcxImagingParameters7.getCompression();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
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
        java.lang.String str15 = pcxImagingParameters14.getFileName();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(bufferedImageFactory10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
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
        int int17 = pcxImagingParameters15.getBitDepth();
        int int18 = pcxImagingParameters15.getBitDepth();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
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
        int int13 = pcxImagingParameters9.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory6);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setPlanes((int) 'a');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setBitDepth((int) (byte) 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBitDepth((int) (short) 10);
        int int9 = pcxImagingParameters6.getCompression();
        int int10 = pcxImagingParameters6.getCompression();
        boolean boolean11 = pcxImagingParameters6.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters6.getBufferedImageFactory();
        java.lang.String str9 = pcxImagingParameters6.getFileName();
        java.lang.Class<?> wildcardClass10 = pcxImagingParameters6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(bufferedImageFactory8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
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
        int int16 = pcxImagingParameters13.getBitDepth();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
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
        java.lang.String str15 = pcxImagingParameters13.getFileName();
        int int16 = pcxImagingParameters13.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
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
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory15 = pcxImagingParameters14.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNull(bufferedImageFactory15);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setPixelDensity(pixelDensity5);
        int int7 = pcxImagingParameters6.getCompression();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters6.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 0);
        boolean boolean11 = pcxImagingParameters10.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(bufferedImageFactory8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.asThis();
        int int10 = pcxImagingParameters6.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setPlanes((int) 'a');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters7.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = pcxImagingParameters7.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(pixelDensity11);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.asThis();
        boolean boolean6 = pcxImagingParameters2.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory9);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters9.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        int int4 = pcxImagingParameters3.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters3.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = pcxImagingParameters8.getBufferedImageFactory();
        int int10 = pcxImagingParameters8.getPlanes();
        boolean boolean11 = pcxImagingParameters8.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(bufferedImageFactory9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBitDepth(0);
        int int6 = pcxImagingParameters5.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory9);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setCompression((int) (byte) -1);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getBitDepth();
        int int2 = pcxImagingParameters0.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setBitDepth((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBitDepth((int) (byte) 1);
        java.lang.String str7 = pcxImagingParameters6.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setPlanes(32);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setCompression((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        java.lang.String str3 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression(100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.asThis();
        java.lang.String str9 = pcxImagingParameters0.getFileName();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters5.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = pcxImagingParameters5.getBufferedImageFactory();
        int int8 = pcxImagingParameters5.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters5.setBitDepth(10);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNull(bufferedImageFactory7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
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
        java.lang.String str16 = pcxImagingParameters14.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters14.setPlanes((int) (short) -1);
        int int19 = pcxImagingParameters18.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters5.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters5.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNull(bufferedImageFactory7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(bufferedImageFactory10);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setCompression(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory5);
        int int7 = pcxImagingParameters6.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setPlanes(32);
        java.lang.Class<?> wildcardClass10 = pcxImagingParameters9.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        int int4 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory8);
        org.apache.commons.imaging.PixelDensity pixelDensity10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters0.setPixelDensity(pixelDensity10);
        int int12 = pcxImagingParameters0.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBitDepth((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setPixelDensity(pixelDensity6);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters7.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.asThis();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setPlanes((int) '4');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setFileName("");
        org.apache.commons.imaging.PixelDensity pixelDensity10 = pcxImagingParameters7.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters7.setCompression((int) (byte) -1);
        java.lang.String str13 = pcxImagingParameters7.getFileName();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(pixelDensity10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBitDepth(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setCompression((int) 'a');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setPixelDensity(pixelDensity10);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setCompression((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setStrict(false);
        java.lang.String str12 = pcxImagingParameters11.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters11.setCompression(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory15 = pcxImagingParameters14.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNull(bufferedImageFactory15);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
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
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory12 = pcxImagingParameters11.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(bufferedImageFactory8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(bufferedImageFactory12);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
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
        java.lang.String str14 = pcxImagingParameters9.getFileName();
        int int15 = pcxImagingParameters9.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters9.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
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
        int int14 = pcxImagingParameters10.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setStrict(false);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory5);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        java.lang.String str9 = pcxImagingParameters8.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters11.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters0.getPixelDensity();
        java.lang.String str7 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setPlanes(10);
        java.lang.Class<?> wildcardClass10 = pcxImagingParameters9.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
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
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = pcxImagingParameters10.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters10.setBitDepth((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNull(bufferedImageFactory13);
        org.junit.Assert.assertNull(bufferedImageFactory14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
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
        java.lang.String str20 = pcxImagingParameters17.getFileName();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
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
        java.lang.String str13 = pcxImagingParameters12.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
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
        int int13 = pcxImagingParameters12.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters12.setStrict(false);
        int int16 = pcxImagingParameters12.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory17 = pcxImagingParameters12.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(bufferedImageFactory17);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        int int4 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setFileName("");
        org.apache.commons.imaging.PixelDensity pixelDensity11 = pcxImagingParameters8.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(pixelDensity11);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters12.setCompression((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNull(bufferedImageFactory13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters22 = pcxImagingParameters20.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory23 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters24 = pcxImagingParameters20.setBufferedImageFactory(bufferedImageFactory23);
        org.apache.commons.imaging.PixelDensity pixelDensity25 = pcxImagingParameters24.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters27 = pcxImagingParameters24.setStrict(true);
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
        org.junit.Assert.assertNotNull(pcxImagingParameters24);
        org.junit.Assert.assertNull(pixelDensity25);
        org.junit.Assert.assertNotNull(pcxImagingParameters27);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBitDepth((int) (byte) 0);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory6);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setStrict(true);
        boolean boolean10 = pcxImagingParameters9.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setStrict(true);
        int int6 = pcxImagingParameters0.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setStrict(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters5.setPlanes(100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setBufferedImageFactory(bufferedImageFactory11);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory13 = pcxImagingParameters10.getBufferedImageFactory();
        boolean boolean14 = pcxImagingParameters10.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNull(bufferedImageFactory13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.PixelDensity pixelDensity3 = pcxImagingParameters2.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters2.setBitDepth(0);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(pixelDensity3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
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
        java.lang.Class<?> wildcardClass16 = pcxImagingParameters15.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
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
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPixelDensity(pixelDensity13);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        int int4 = pcxImagingParameters3.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters3.setFileName("");
        org.apache.commons.imaging.PixelDensity pixelDensity9 = pcxImagingParameters8.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters8.setStrict(false);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(pixelDensity9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBitDepth((int) (byte) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.PixelDensity pixelDensity10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters5.setPixelDensity(pixelDensity10);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        boolean boolean9 = pcxImagingParameters8.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBitDepth(0);
        int int6 = pcxImagingParameters2.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity7 = pcxImagingParameters2.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters2.setFileName("");
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(pixelDensity7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
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
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory18 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters14.setBufferedImageFactory(bufferedImageFactory18);
        boolean boolean20 = pcxImagingParameters19.isStrict();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
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
        int int12 = pcxImagingParameters8.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters14.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters16.setCompression(100);
        java.lang.String str19 = pcxImagingParameters16.getFileName();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters0.getBufferedImageFactory();
        int int6 = pcxImagingParameters0.getPlanes();
        java.lang.String str7 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setCompression(0);
        int int10 = pcxImagingParameters9.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
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
        int int15 = pcxImagingParameters14.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        java.lang.String str9 = pcxImagingParameters6.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters6.setCompression((int) '4');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters6.setCompression(35);
        org.apache.commons.imaging.PixelDensity pixelDensity14 = pcxImagingParameters13.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory15 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters13.setBufferedImageFactory(bufferedImageFactory15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNull(pixelDensity14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters5.setPlanes(100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setBufferedImageFactory(bufferedImageFactory11);
        int int13 = pcxImagingParameters12.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = pcxImagingParameters12.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters12.asThis();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNull(bufferedImageFactory14);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        int int3 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory6);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = pcxImagingParameters8.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters8.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(bufferedImageFactory9);
        org.junit.Assert.assertNull(bufferedImageFactory10);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters6.getBufferedImageFactory();
        java.lang.String str9 = pcxImagingParameters6.getFileName();
        int int10 = pcxImagingParameters6.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters6.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters6.setFileName("");
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
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters12.setCompression((int) (byte) 0);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory16 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters15.setBufferedImageFactory(bufferedImageFactory16);
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
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBitDepth(0);
        java.lang.String str5 = pcxImagingParameters0.getFileName();
        int int6 = pcxImagingParameters0.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setCompression(1);
        int int11 = pcxImagingParameters8.getPlanes();
        int int12 = pcxImagingParameters8.getBitDepth();
        int int13 = pcxImagingParameters8.getPlanes();
        int int14 = pcxImagingParameters8.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBitDepth(0);
        int int6 = pcxImagingParameters5.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setCompression((int) (byte) 10);
        org.apache.commons.imaging.PixelDensity pixelDensity9 = pcxImagingParameters5.getPixelDensity();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(pixelDensity9);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.asThis();
        boolean boolean7 = pcxImagingParameters4.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters4.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters4.setStrict(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters8.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters8.setFileName("hi!");
        java.lang.Class<?> wildcardClass14 = pcxImagingParameters13.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setBitDepth((int) (short) 1);
        int int10 = pcxImagingParameters6.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters5.setPlanes(100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setBufferedImageFactory(bufferedImageFactory11);
        java.lang.String str13 = pcxImagingParameters12.getFileName();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setPlanes((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBitDepth(0);
        int int5 = pcxImagingParameters0.getBitDepth();
        int int6 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory7);
        java.lang.String str9 = pcxImagingParameters0.getFileName();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setFileName("");
        java.lang.Class<?> wildcardClass6 = pcxImagingParameters5.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
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
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = pcxImagingParameters13.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNull(bufferedImageFactory14);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setStrict(true);
        java.lang.String str6 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setBitDepth((int) (short) -1);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setPixelDensity(pixelDensity11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setStrict(false);
        int int12 = pcxImagingParameters11.getPlanes();
        java.lang.String str13 = pcxImagingParameters11.getFileName();
        org.apache.commons.imaging.PixelDensity pixelDensity14 = pcxImagingParameters11.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters11.setBitDepth((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(pixelDensity14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters12.setBitDepth(0);
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
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
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
        org.apache.commons.imaging.PixelDensity pixelDensity20 = pcxImagingParameters17.getPixelDensity();
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
        org.junit.Assert.assertNull(pixelDensity20);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBitDepth(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setFileName("");
        int int8 = pcxImagingParameters2.getPlanes();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters7.setBitDepth(32);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters7.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        java.lang.String str7 = pcxImagingParameters5.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setPlanes(100);
        int int10 = pcxImagingParameters9.getPlanes();
        java.lang.Class<?> wildcardClass11 = pcxImagingParameters9.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters13.setPlanes(35);
        java.lang.String str18 = pcxImagingParameters13.getFileName();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters5.getPixelDensity();
        int int7 = pcxImagingParameters5.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setCompression((int) (byte) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setCompression((int) (byte) 10);
        boolean boolean12 = pcxImagingParameters9.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
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
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory23 = pcxImagingParameters22.getBufferedImageFactory();
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
        org.junit.Assert.assertNull(bufferedImageFactory23);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setCompression(1);
        boolean boolean5 = pcxImagingParameters0.isStrict();
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setPixelDensity(pixelDensity6);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory6);
        int int8 = pcxImagingParameters7.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.setBitDepth(1);
        int int11 = pcxImagingParameters7.getCompression();
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
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBitDepth((int) (short) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setStrict(true);
        int int11 = pcxImagingParameters10.getCompression();
        boolean boolean12 = pcxImagingParameters10.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters21 = pcxImagingParameters19.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity22 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters23 = pcxImagingParameters19.setPixelDensity(pixelDensity22);
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
        org.junit.Assert.assertNotNull(pcxImagingParameters23);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
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
        int int19 = pcxImagingParameters18.getPlanes();
        boolean boolean20 = pcxImagingParameters18.isStrict();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setCompression((-1));
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setFileName("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setPlanes((int) (byte) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setPixelDensity(pixelDensity6);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters3.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNull(bufferedImageFactory8);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters0.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory6);
        int int8 = pcxImagingParameters0.getBitDepth();
        int int9 = pcxImagingParameters0.getBitDepth();
        boolean boolean10 = pcxImagingParameters0.isStrict();
        int int11 = pcxImagingParameters0.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters15.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory17 = pcxImagingParameters15.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters15.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters18.setCompression((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNull(bufferedImageFactory17);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertNotNull(pcxImagingParameters20);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setFileName("hi!");
        boolean boolean9 = pcxImagingParameters8.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters8.setBitDepth(1);
        java.lang.String str12 = pcxImagingParameters11.getFileName();
        boolean boolean13 = pcxImagingParameters11.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.asThis();
        boolean boolean7 = pcxImagingParameters0.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        int int4 = pcxImagingParameters3.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setCompression(0);
        boolean boolean11 = pcxImagingParameters6.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters17.setPlanes(35);
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
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setBitDepth((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.asThis();
        int int11 = pcxImagingParameters6.getCompression();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters10.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        java.lang.String str7 = pcxImagingParameters5.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setPlanes(100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters9.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters9.setCompression((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters9.setCompression((int) (byte) 100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory15 = pcxImagingParameters14.getBufferedImageFactory();
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
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
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
        int int14 = pcxImagingParameters13.getPlanes();
        boolean boolean15 = pcxImagingParameters13.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBitDepth((int) (short) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters12.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setStrict(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        int int3 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setPixelDensity(pixelDensity6);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory8);
        java.lang.String str10 = pcxImagingParameters0.getFileName();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setCompression(97);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setStrict(true);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setCompression((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters8.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters8.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setCompression((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setBitDepth((int) '#');
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setPixelDensity(pixelDensity9);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory11);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters8.asThis();
        boolean boolean16 = pcxImagingParameters8.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setPlanes((int) '4');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setFileName("");
        org.apache.commons.imaging.PixelDensity pixelDensity10 = pcxImagingParameters7.getPixelDensity();
        int int11 = pcxImagingParameters7.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(pixelDensity10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        int int7 = pcxImagingParameters0.getBitDepth();
        java.lang.Class<?> wildcardClass8 = pcxImagingParameters0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setBitDepth((int) '#');
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setPixelDensity(pixelDensity9);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters8.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters14.setPlanes((int) 'a');
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        int int3 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory4);
        int int6 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setCompression((int) (short) 0);
        java.lang.String str9 = pcxImagingParameters8.getFileName();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        int int3 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setFileName("hi!");
        int int6 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setStrict(true);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        int int3 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory6);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setBitDepth((int) ' ');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.asThis();
        int int11 = pcxImagingParameters7.getPlanes();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setCompression(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setBitDepth((int) ' ');
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setBufferedImageFactory(bufferedImageFactory10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setStrict(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.asThis();
        int int9 = pcxImagingParameters5.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters0.getBufferedImageFactory();
        int int6 = pcxImagingParameters0.getPlanes();
        java.lang.String str7 = pcxImagingParameters0.getFileName();
        int int8 = pcxImagingParameters0.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
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
        java.lang.String str14 = pcxImagingParameters12.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters12.setCompression((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setCompression(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory5);
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = pcxImagingParameters6.getPixelDensity();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(pixelDensity8);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setStrict(false);
        int int11 = pcxImagingParameters8.getPlanes();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBitDepth(0);
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setPixelDensity(pixelDensity8);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
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
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory12 = pcxImagingParameters10.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(pixelDensity7);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(bufferedImageFactory12);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters12.setBitDepth(97);
        boolean boolean19 = pcxImagingParameters18.isStrict();
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
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
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
        java.lang.String str14 = pcxImagingParameters9.getFileName();
        int int15 = pcxImagingParameters9.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity8 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters3.setCompression(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNull(pixelDensity8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setPixelDensity(pixelDensity6);
        int int8 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters3.setPlanes((int) (byte) -1);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = pcxImagingParameters10.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setStrict(true);
        java.lang.String str14 = pcxImagingParameters10.getFileName();
        java.lang.Class<?> wildcardClass15 = pcxImagingParameters10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(pixelDensity11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setBitDepth(10);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
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
        int int14 = pcxImagingParameters10.getPlanes();
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
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.asThis();
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setBitDepth((int) (byte) 10);
        int int10 = pcxImagingParameters6.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters15.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory17 = pcxImagingParameters15.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNull(bufferedImageFactory17);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        java.lang.String str9 = pcxImagingParameters6.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters6.setCompression((int) '4');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters6.setCompression(35);
        org.apache.commons.imaging.PixelDensity pixelDensity14 = pcxImagingParameters13.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters13.setStrict(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNull(pixelDensity14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
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
        int int12 = pcxImagingParameters11.getPlanes();
        int int13 = pcxImagingParameters11.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        boolean boolean2 = pcxImagingParameters0.isStrict();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        int int4 = pcxImagingParameters0.getBitDepth();
        int int5 = pcxImagingParameters0.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        java.lang.String str3 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression(100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setFileName("hi!");
        java.lang.String str8 = pcxImagingParameters0.getFileName();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        boolean boolean9 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.PixelDensity pixelDensity10 = pcxImagingParameters6.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(pixelDensity10);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
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
        org.apache.commons.imaging.PixelDensity pixelDensity14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters9.setPixelDensity(pixelDensity14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
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
        java.lang.String str17 = pcxImagingParameters16.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters16.setPlanes(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters3.getPixelDensity();
        int int7 = pcxImagingParameters3.getPlanes();
        java.lang.String str8 = pcxImagingParameters3.getFileName();
        int int9 = pcxImagingParameters3.getCompression();
        int int10 = pcxImagingParameters3.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        int int9 = pcxImagingParameters6.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters6.setBitDepth(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setCompression((int) (byte) 100);
        java.lang.Class<?> wildcardClass14 = pcxImagingParameters11.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
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
        java.lang.String str17 = pcxImagingParameters16.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory18 = pcxImagingParameters16.getBufferedImageFactory();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(bufferedImageFactory18);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
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
        java.lang.String str16 = pcxImagingParameters12.getFileName();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setBitDepth((int) '#');
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setPixelDensity(pixelDensity9);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory11);
        java.lang.String str13 = pcxImagingParameters12.getFileName();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setCompression(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setBitDepth(10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setPlanes((int) ' ');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters11.setBitDepth(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setCompression((int) (short) 100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = pcxImagingParameters6.getBufferedImageFactory();
        org.apache.commons.imaging.PixelDensity pixelDensity10 = pcxImagingParameters6.getPixelDensity();
        int int11 = pcxImagingParameters6.getPlanes();
        int int12 = pcxImagingParameters6.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(bufferedImageFactory9);
        org.junit.Assert.assertNull(pixelDensity10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
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
        org.apache.commons.imaging.PixelDensity pixelDensity23 = pcxImagingParameters22.getPixelDensity();
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
        org.junit.Assert.assertNull(pixelDensity23);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setFileName("hi!");
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters6.setPixelDensity(pixelDensity11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setCompression(1);
        int int5 = pcxImagingParameters4.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters6.setFileName("hi!");
        org.apache.commons.imaging.PixelDensity pixelDensity12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters6.setPixelDensity(pixelDensity12);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters5.getPixelDensity();
        int int7 = pcxImagingParameters5.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setCompression((int) (byte) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setCompression((int) (byte) 10);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory12 = pcxImagingParameters9.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(bufferedImageFactory12);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setFileName("hi!");
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
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        int int3 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory6);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.asThis();
        java.lang.String str9 = pcxImagingParameters0.getFileName();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = pcxImagingParameters0.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory5);
        boolean boolean7 = pcxImagingParameters0.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNull(pixelDensity4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters11.setBitDepth(10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters14.setFileName("");
        java.lang.String str17 = pcxImagingParameters16.getFileName();
        int int18 = pcxImagingParameters16.getBitDepth();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPlanes(0);
        boolean boolean15 = pcxImagingParameters14.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setStrict(true);
        int int6 = pcxImagingParameters5.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBitDepth((int) '4');
        java.lang.String str9 = pcxImagingParameters5.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters5.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setBufferedImageFactory(bufferedImageFactory11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
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
        org.apache.commons.imaging.PixelDensity pixelDensity17 = pcxImagingParameters12.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters12.setBitDepth((int) (byte) 1);
        int int20 = pcxImagingParameters19.getBitDepth();
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
        org.junit.Assert.assertNull(pixelDensity17);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters6.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity12 = pcxImagingParameters11.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(pixelDensity12);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters10.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters10.setCompression((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(pcxImagingParameters20);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBitDepth(0);
        int int5 = pcxImagingParameters0.getBitDepth();
        int int6 = pcxImagingParameters0.getBitDepth();
        boolean boolean7 = pcxImagingParameters0.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters11.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters14.setCompression((int) (byte) 10);
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
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters11.setBitDepth(97);
        boolean boolean17 = pcxImagingParameters16.isStrict();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
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
        java.lang.String str14 = pcxImagingParameters10.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters10.setFileName("");
        java.lang.Class<?> wildcardClass17 = pcxImagingParameters10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setPlanes((int) (byte) 10);
        int int6 = pcxImagingParameters5.getCompression();
        int int7 = pcxImagingParameters5.getBitDepth();
        int int8 = pcxImagingParameters5.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
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
        org.apache.commons.imaging.PixelDensity pixelDensity17 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters16.setPixelDensity(pixelDensity17);
        int int19 = pcxImagingParameters18.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters21 = pcxImagingParameters18.setBitDepth((int) 'a');
        org.apache.commons.imaging.PixelDensity pixelDensity22 = pcxImagingParameters21.getPixelDensity();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(pcxImagingParameters21);
        org.junit.Assert.assertNull(pixelDensity22);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        int int6 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters10.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setCompression((int) (short) 100);
        int int14 = pcxImagingParameters10.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity15 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters10.setPixelDensity(pixelDensity15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        int int3 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory6);
        int int8 = pcxImagingParameters7.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters11.setPlanes((int) (short) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters11.setBitDepth((int) (short) 1);
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
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters11.setBitDepth(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
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
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory19 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters18.setBufferedImageFactory(bufferedImageFactory19);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory21 = pcxImagingParameters18.getBufferedImageFactory();
        int int22 = pcxImagingParameters18.getPlanes();
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
        org.junit.Assert.assertNull(bufferedImageFactory21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setPlanes((int) (short) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters9.setPlanes((int) (byte) 1);
        int int14 = pcxImagingParameters9.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setStrict(false);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory5);
        java.lang.String str7 = pcxImagingParameters0.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        int int4 = pcxImagingParameters3.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters3.setFileName("");
        org.apache.commons.imaging.PixelDensity pixelDensity9 = pcxImagingParameters8.getPixelDensity();
        java.lang.String str10 = pcxImagingParameters8.getFileName();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(pixelDensity9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters10.setPlanes((int) (byte) 100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory18 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters17.setBufferedImageFactory(bufferedImageFactory18);
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
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setStrict(false);
        java.lang.String str12 = pcxImagingParameters11.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setPixelDensity(pixelDensity6);
        int int8 = pcxImagingParameters7.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.setStrict(false);
        int int11 = pcxImagingParameters7.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setCompression((int) (short) 0);
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
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
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
        java.lang.String str15 = pcxImagingParameters13.getFileName();
        org.apache.commons.imaging.PixelDensity pixelDensity16 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters13.setPixelDensity(pixelDensity16);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
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
        org.apache.commons.imaging.PixelDensity pixelDensity15 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters14.setPixelDensity(pixelDensity15);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory17 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters14.setBufferedImageFactory(bufferedImageFactory17);
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
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters4.asThis();
        int int6 = pcxImagingParameters4.getCompression();
        java.lang.String str7 = pcxImagingParameters4.getFileName();
        int int8 = pcxImagingParameters4.getPlanes();
        int int9 = pcxImagingParameters4.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters12.setBitDepth((int) (byte) 10);
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
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters14.setPlanes((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters22 = pcxImagingParameters20.setBitDepth((int) (byte) -1);
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
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setFileName("hi!");
        boolean boolean9 = pcxImagingParameters8.isStrict();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters8.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(bufferedImageFactory10);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory6);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setBitDepth((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setBitDepth((int) (short) 10);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters13.setCompression((-1));
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters17.setPlanes((int) (byte) 10);
        int int20 = pcxImagingParameters19.getBitDepth();
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
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters0.getPixelDensity();
        java.lang.String str7 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setPlanes((int) ' ');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setBitDepth((int) (short) 100);
        int int12 = pcxImagingParameters11.getCompression();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory13 = pcxImagingParameters11.getBufferedImageFactory();
        int int14 = pcxImagingParameters11.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(bufferedImageFactory13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory5);
        java.lang.String str7 = pcxImagingParameters6.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
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
        int int14 = pcxImagingParameters13.getPlanes();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setBitDepth((int) '#');
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setPixelDensity(pixelDensity9);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = pcxImagingParameters8.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters8.setBitDepth((int) ' ');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setFileName("");
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(pixelDensity11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters0.getPixelDensity();
        boolean boolean7 = pcxImagingParameters0.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setFileName("hi!");
        java.lang.Class<?> wildcardClass10 = pcxImagingParameters0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
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
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = pcxImagingParameters13.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNull(bufferedImageFactory14);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        int int9 = pcxImagingParameters6.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters6.setBitDepth((int) '4');
        org.apache.commons.imaging.PixelDensity pixelDensity12 = pcxImagingParameters6.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(pixelDensity12);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
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
        org.apache.commons.imaging.PixelDensity pixelDensity15 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters10.setPixelDensity(pixelDensity15);
        int int17 = pcxImagingParameters10.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters10.setFileName("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.asThis();
        boolean boolean6 = pcxImagingParameters2.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters2.setFileName("hi!");
        java.lang.Class<?> wildcardClass9 = pcxImagingParameters8.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters21 = pcxImagingParameters10.setCompression(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters22 = pcxImagingParameters21.asThis();
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
        org.junit.Assert.assertNotNull(pcxImagingParameters22);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setBitDepth((int) '#');
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setPixelDensity(pixelDensity9);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory11);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters14.setCompression((int) (short) 0);
        boolean boolean17 = pcxImagingParameters14.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters15.setBitDepth(1);
        java.lang.String str18 = pcxImagingParameters17.getFileName();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
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
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory12 = pcxImagingParameters10.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(pixelDensity11);
        org.junit.Assert.assertNull(bufferedImageFactory12);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        boolean boolean2 = pcxImagingParameters0.isStrict();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        int int4 = pcxImagingParameters0.getBitDepth();
        boolean boolean5 = pcxImagingParameters0.isStrict();
        int int6 = pcxImagingParameters0.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPlanes((int) (short) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setStrict(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        int int6 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.PixelDensity pixelDensity9 = pcxImagingParameters8.getPixelDensity();
        java.lang.Class<?> wildcardClass10 = pcxImagingParameters8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(pixelDensity9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
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
        int int24 = pcxImagingParameters21.getPlanes();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
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
        int int16 = pcxImagingParameters12.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters12.setStrict(false);
        java.lang.String str19 = pcxImagingParameters18.getFileName();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters2.setPixelDensity(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setCompression(1);
        org.apache.commons.imaging.PixelDensity pixelDensity5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setPixelDensity(pixelDensity5);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setStrict(true);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression(10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setPlanes(97);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters9.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(bufferedImageFactory10);
    }
}

