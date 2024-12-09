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
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.apache.commons.imaging.ColorTools colorTools0 = new org.apache.commons.imaging.ColorTools();
        java.awt.image.BufferedImage bufferedImage1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage2 = colorTools0.convertTosRgb(bufferedImage1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.imaging.ColorTools colorTools0 = new org.apache.commons.imaging.ColorTools();
        java.awt.image.ColorModel colorModel1 = null;
        java.awt.color.ColorSpace colorSpace2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.ColorModel colorModel4 = colorTools0.deriveColorModel(colorModel1, colorSpace2, false);
            org.junit.Assert.fail("Expected exception of type java.awt.image.ImagingOpException; message: Could not clone unknown ColorModel Type.");
        } catch (java.awt.image.ImagingOpException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.imaging.ColorTools colorTools0 = new org.apache.commons.imaging.ColorTools();
        java.awt.image.BufferedImage bufferedImage1 = null;
        java.awt.image.ColorModel colorModel2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage3 = colorTools0.relabelColorSpace(bufferedImage1, colorModel2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.imaging.ColorTools colorTools0 = new org.apache.commons.imaging.ColorTools();
        java.awt.image.BufferedImage bufferedImage1 = null;
        java.awt.color.ICC_Profile iCC_Profile2 = null;
        java.awt.color.ICC_Profile iCC_Profile3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage4 = colorTools0.convertBetweenIccProfiles(bufferedImage1, iCC_Profile2, iCC_Profile3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.imaging.ColorTools colorTools0 = new org.apache.commons.imaging.ColorTools();
        java.awt.image.BufferedImage bufferedImage1 = null;
        java.awt.color.ColorSpace colorSpace2 = null;
        java.awt.color.ColorSpace colorSpace3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage4 = colorTools0.convertBetweenColorSpacesX2(bufferedImage1, colorSpace2, colorSpace3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.commons.imaging.ColorTools colorTools0 = new org.apache.commons.imaging.ColorTools();
        java.awt.image.BufferedImage bufferedImage1 = null;
        java.awt.color.ColorSpace colorSpace2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.ColorModel colorModel4 = colorTools0.deriveColorModel(bufferedImage1, colorSpace2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.commons.imaging.ColorTools colorTools0 = new org.apache.commons.imaging.ColorTools();
        java.awt.image.BufferedImage bufferedImage1 = null;
        java.awt.color.ColorSpace colorSpace2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage3 = colorTools0.convertToColorSpace(bufferedImage1, colorSpace2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.imaging.ColorTools colorTools0 = new org.apache.commons.imaging.ColorTools();
        java.awt.image.BufferedImage bufferedImage1 = null;
        java.awt.color.ColorSpace colorSpace2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.ColorModel colorModel3 = colorTools0.deriveColorModel(bufferedImage1, colorSpace2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.imaging.ColorTools colorTools0 = new org.apache.commons.imaging.ColorTools();
        java.awt.image.BufferedImage bufferedImage1 = null;
        java.awt.color.ICC_Profile iCC_Profile2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage3 = colorTools0.relabelColorSpace(bufferedImage1, iCC_Profile2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.imaging.ColorTools colorTools0 = new org.apache.commons.imaging.ColorTools();
        java.awt.image.BufferedImage bufferedImage1 = null;
        java.awt.color.ICC_Profile iCC_Profile2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage3 = colorTools0.convertToIccProfile(bufferedImage1, iCC_Profile2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.imaging.ColorTools colorTools0 = new org.apache.commons.imaging.ColorTools();
        java.awt.image.BufferedImage bufferedImage1 = null;
        java.awt.color.ColorSpace colorSpace2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage3 = colorTools0.relabelColorSpace(bufferedImage1, colorSpace2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.imaging.ColorTools colorTools0 = new org.apache.commons.imaging.ColorTools();
        java.lang.Class<?> wildcardClass1 = colorTools0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.imaging.ColorTools colorTools0 = new org.apache.commons.imaging.ColorTools();
        java.awt.image.BufferedImage bufferedImage1 = null;
        java.awt.color.ColorSpace colorSpace2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.ColorModel colorModel4 = colorTools0.deriveColorModel(bufferedImage1, colorSpace2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.imaging.ColorTools colorTools0 = new org.apache.commons.imaging.ColorTools();
        java.awt.image.BufferedImage bufferedImage1 = null;
        java.awt.color.ColorSpace colorSpace2 = null;
        java.awt.color.ColorSpace colorSpace3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage4 = colorTools0.convertBetweenColorSpaces(bufferedImage1, colorSpace2, colorSpace3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: ColorSpaces cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.commons.imaging.ColorTools colorTools0 = new org.apache.commons.imaging.ColorTools();
        java.awt.image.ColorModel colorModel1 = null;
        java.awt.color.ColorSpace colorSpace2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.ColorModel colorModel4 = colorTools0.deriveColorModel(colorModel1, colorSpace2, true);
            org.junit.Assert.fail("Expected exception of type java.awt.image.ImagingOpException; message: Could not clone unknown ColorModel Type.");
        } catch (java.awt.image.ImagingOpException e) {
            // Expected exception.
        }
    }
}

