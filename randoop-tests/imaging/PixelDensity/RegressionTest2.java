/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.0d, 3937.0078740157483d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityInches();
        boolean boolean5 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(100000.0d, 3818.8976377952754d);
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.horizontalDensityInches();
        double double8 = pixelDensity2.verticalDensityMetres();
        double double9 = pixelDensity2.verticalDensityCentimetres();
        double double10 = pixelDensity2.getRawVerticalDensity();
        double double11 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(16.387064d, (double) (byte) 10);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.006451600000000001d, 0.06102374409473228d);
        double double3 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.016387064000000003d + "'", double3 == 0.016387064000000003d);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(25.4d, (-100.0d));
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.64516d + "'", double4 == 0.64516d);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.0d, (-0.3937007874015748d));
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.15500031000062d) + "'", double4 == (-0.15500031000062d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((-0.15500031000062d), 393700.78740157484d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 393700.78740157484d + "'", double4 == 393700.78740157484d);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (byte) 100, (-1.0d));
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.horizontalDensityMetres();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.horizontalDensityMetres();
        double double8 = pixelDensity2.verticalDensityMetres();
        double double9 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.NEGATIVE_INFINITY + "'", double8 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.NEGATIVE_INFINITY + "'", double9 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) ' ', 10000.0d);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.horizontalDensityMetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (byte) 10, (-0.3937007874015748d));
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-39.37007874015748d) + "'", double3 == (-39.37007874015748d));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 'a', 393700.7874015748d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.horizontalDensityInches();
        boolean boolean5 = pixelDensity2.isUnitless();
        boolean boolean6 = pixelDensity2.isUnitless();
        java.lang.Class<?> wildcardClass7 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 393700.7874015748d + "'", double3 == 393700.7874015748d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(100000.0d, Double.NaN);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (byte) 100, (double) (short) -1);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 39.37007874015748d + "'", double4 == 39.37007874015748d);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (short) 0, (-1.0d));
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 1, 0.01d);
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) 0, (double) (short) 1);
        double double3 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 100L, 2.54d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.verticalDensityInches();
        double double6 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.4516d + "'", double5 == 6.4516d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 254.0d + "'", double6 == 254.0d);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 100.0f, (double) (short) -1);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0L, (double) 1);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.getRawVerticalDensity();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3937007874015748d + "'", double4 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3937007874015748d + "'", double5 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3937007874015748d + "'", double7 == 0.3937007874015748d);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.97d, 0.15500031000062d);
        double double3 = pixelDensity2.horizontalDensityInches();
        boolean boolean4 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.verticalDensityMetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isInMetres();
        double double8 = pixelDensity2.horizontalDensityInches();
        double double9 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 39.37007874015748d + "'", double5 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3937007874015748d + "'", double6 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(393700.7874015748d, 0.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((-39.37007874015748d), (double) '#');
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 10, 0.38188976377952755d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isInInches();
        boolean boolean5 = pixelDensity2.isInInches();
        double double6 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(100.0d, 100.0d);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.verticalDensityMetres();
        boolean boolean5 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((-0.01d), (-39.37007874015748d));
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(100000.0d, 2.54d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 0, (double) (byte) 100);
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (short) 0, 1000.0d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-1.0d), 645.16d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (byte) 100, (-1.0d));
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        java.lang.Class<?> wildcardClass4 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (-1), (double) (-1.0f));
        double double3 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0254d) + "'", double3 == (-0.0254d));
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (byte) 100, (double) 'a');
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        boolean boolean5 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3818.8976377952754d + "'", double3 == 3818.8976377952754d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (byte) 0, 1.0d);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.verticalDensityMetres();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.verticalDensityMetres();
        java.lang.Class<?> wildcardClass8 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean6 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.3937007874015748d) + "'", double4 == (-0.3937007874015748d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3937007874015748d + "'", double5 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.254d, (double) 100);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean5 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.254d + "'", double4 == 0.254d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (byte) 100, (double) (short) -1);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.3937007874015748d) + "'", double3 == (-0.3937007874015748d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.3937007874015748d) + "'", double4 == (-0.3937007874015748d));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) ' ', (double) (-1.0f));
        double double3 = pixelDensity2.verticalDensityInches();
        boolean boolean4 = pixelDensity2.isInInches();
        double double5 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.54d) + "'", double3 == (-2.54d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 1, (double) 10L);
        double double3 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 39.37007874015748d + "'", double3 == 39.37007874015748d);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(10.0d, 1.0d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInInches();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(254.0d, (double) 10);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.3937007874015748d, (-0.0254d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(35.0d, (-1.0d));
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.NEGATIVE_INFINITY + "'", double5 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-0.01d), 0.32d);
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.horizontalDensityInches();
        double double8 = pixelDensity2.getRawVerticalDensity();
        double double9 = pixelDensity2.verticalDensityCentimetres();
        double double10 = pixelDensity2.horizontalDensityCentimetres();
        double double11 = pixelDensity2.horizontalDensityInches();
        double double12 = pixelDensity2.verticalDensityInches();
        double double13 = pixelDensity2.horizontalDensityMetres();
        double double14 = pixelDensity2.verticalDensityMetres();
        double double15 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.POSITIVE_INFINITY + "'", double15 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (short) -1);
        double double3 = pixelDensity2.verticalDensityInches();
        double double4 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-39.37007874015748d) + "'", double4 == (-39.37007874015748d));
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.horizontalDensityMetres();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 0, (double) (short) 1);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.horizontalDensityInches();
        double double5 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 39.37007874015748d + "'", double5 == 39.37007874015748d);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        double double6 = pixelDensity2.getRawVerticalDensity();
        double double7 = pixelDensity2.verticalDensityMetres();
        double double8 = pixelDensity2.horizontalDensityMetres();
        boolean boolean9 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.01d) + "'", double5 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(Double.NaN, (double) 100.0f);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((-3937.0078740157483d), (double) (short) -1);
        double double3 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(25400.0d, 0.97d);
        double double3 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(81.28d, 8128.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 0, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(35.0d, (-1.0d));
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (byte) 100, 0.0d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0L, (double) 1);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3937007874015748d + "'", double5 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isInInches();
        double double6 = pixelDensity2.getRawVerticalDensity();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean8 = pixelDensity2.isInInches();
        double double9 = pixelDensity2.verticalDensityCentimetres();
        double double10 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.54d + "'", double10 == 2.54d);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) 1L);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isInInches();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        double double7 = pixelDensity2.horizontalDensityMetres();
        double double8 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 10.0f, (double) (-1.0f));
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.horizontalDensityInches();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.01d) + "'", double4 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.0254d) + "'", double5 == (-0.0254d));
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.54d + "'", double7 == 2.54d);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0L, (double) 1);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.verticalDensityMetres();
        boolean boolean7 = pixelDensity2.isUnitless();
        java.lang.Class<?> wildcardClass8 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3937007874015748d + "'", double5 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 39.37007874015748d + "'", double6 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((-15.500031000062002d), 0.06102374409473228d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.horizontalDensityMetres();
        double double8 = pixelDensity2.verticalDensityInches();
        double double9 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 10, (double) 10);
        boolean boolean3 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10L, 1.0d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.0038188976377952757d, 2047.244094488189d);
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 204724.4094488189d + "'", double3 == 204724.4094488189d);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((-3937.0078740157483d), (double) 'a');
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.0d, (double) 100);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isInInches();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        boolean boolean7 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.01d, (-0.01d));
        double double3 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0E-4d) + "'", double3 == (-1.0E-4d));
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 1, (double) '#');
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 100, (double) 10.0f);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.getRawVerticalDensity();
        double double5 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(39.37007874015748d, (double) 0L);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.500031000062002d + "'", double3 == 15.500031000062002d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 39.37007874015748d + "'", double4 == 39.37007874015748d);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 0, 100000.0d);
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(32.0d, 0.15500031000062d);
        double double3 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((-155000.31000062003d), 16.387064d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (short) 10, 1.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(8890.0d, 32.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 1.0f, 3500.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(5200.0d, 0.06102374409473228d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.0d, 0.0d);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 1, 0.3937007874015748d);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (short) 100, 393700.78740157484d);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (short) 0, (-6.4516E-4d));
        double double3 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.0d, 2047.244094488189d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        double double6 = pixelDensity2.verticalDensityMetres();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        double double8 = pixelDensity2.horizontalDensityMetres();
        double double9 = pixelDensity2.verticalDensityMetres();
        java.lang.Class<?> wildcardClass10 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.01d) + "'", double5 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 1.0f, 0.8128d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1550.0031000062002d, 97.0d);
        double double3 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(254.0d, 2.54d);
        double double3 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.54d + "'", double3 == 2.54d);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(1259.8425196850394d, 0.016387064000000003d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(100.0d, (double) (short) -1);
        boolean boolean3 = pixelDensity2.isInInches();
        boolean boolean4 = pixelDensity2.isInInches();
        boolean boolean5 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        double double6 = pixelDensity2.verticalDensityMetres();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean8 = pixelDensity2.isInCentimetres();
        boolean boolean9 = pixelDensity2.isUnitless();
        double double10 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.01d) + "'", double5 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 100L, (double) (byte) 1);
        double double3 = pixelDensity2.verticalDensityMetres();
        boolean boolean4 = pixelDensity2.isInInches();
        double double5 = pixelDensity2.horizontalDensityMetres();
        java.lang.Class<?> wildcardClass6 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 10L, 0.3937007874015748d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(204724.4094488189d, 0.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (byte) -1, (double) (byte) 10);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.8128d, (double) (short) 0);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 100L, (double) (short) 1);
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 254.0d + "'", double3 == 254.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10000.0d + "'", double4 == 10000.0d);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.verticalDensityMetres();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 39.37007874015748d + "'", double5 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        double double5 = pixelDensity2.verticalDensityMetres();
        boolean boolean6 = pixelDensity2.isInInches();
        double double7 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 39.37007874015748d + "'", double3 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 39.37007874015748d + "'", double5 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1000.0d, (double) 10);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1000.0d + "'", double3 == 1000.0d);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) ' ', 10000.0d);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.horizontalDensityMetres();
        double double5 = pixelDensity2.verticalDensityMetres();
        boolean boolean6 = pixelDensity2.isInInches();
        java.lang.Class<?> wildcardClass7 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(32.0d, 320000.0d);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 320000.0d + "'", double4 == 320000.0d);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.3937007874015748d, (double) '#');
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1377.9527559055118d + "'", double3 == 1377.9527559055118d);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(100000.0d, (-0.15500031000062d));
        double double3 = pixelDensity2.verticalDensityInches();
        double double4 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.getRawVerticalDensity();
        boolean boolean8 = pixelDensity2.isInInches();
        boolean boolean9 = pixelDensity2.isUnitless();
        java.lang.Class<?> wildcardClass10 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        double double8 = pixelDensity2.getRawVerticalDensity();
        double double9 = pixelDensity2.verticalDensityMetres();
        double double10 = pixelDensity2.horizontalDensityCentimetres();
        double double11 = pixelDensity2.getRawVerticalDensity();
        double double12 = pixelDensity2.verticalDensityInches();
        double double13 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(25400.0d, 0.8128d);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 100, Double.POSITIVE_INFINITY);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 39.37007874015748d + "'", double5 == 39.37007874015748d);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(97.0d, (double) 10);
        double double3 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 0L, (double) 100.0f);
        double double3 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(206.4512d, 2047.244094488189d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        double double6 = pixelDensity2.getRawVerticalDensity();
        double double7 = pixelDensity2.verticalDensityMetres();
        double double8 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.01d) + "'", double5 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(81.28d, 0.01d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) '#', 254.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.15500031000062d, 81.28d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0L, (double) 1);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        boolean boolean5 = pixelDensity2.isInInches();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.verticalDensityInches();
        double double8 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean9 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(10000.0d, 0.97d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.97d + "'", double3 == 0.97d);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (byte) 0, 1.0d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        double double5 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(97.0d, 52.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        java.lang.Class<?> wildcardClass7 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.3937007874015748d) + "'", double4 == (-0.3937007874015748d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3937007874015748d + "'", double5 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        boolean boolean5 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isInInches();
        boolean boolean5 = pixelDensity2.isInInches();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        double double8 = pixelDensity2.horizontalDensityInches();
        double double9 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(393700.7874015748d, 0.254d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(3937.0078740157483d, (double) 1);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 100L, (double) (short) 1);
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.horizontalDensityInches();
        double double5 = pixelDensity2.horizontalDensityMetres();
        boolean boolean6 = pixelDensity2.isInInches();
        boolean boolean7 = pixelDensity2.isInInches();
        double double8 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 254.0d + "'", double3 == 254.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 254.0d + "'", double4 == 254.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10000.0d + "'", double5 == 10000.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        double double8 = pixelDensity2.getRawVerticalDensity();
        double double9 = pixelDensity2.verticalDensityMetres();
        double double10 = pixelDensity2.horizontalDensityCentimetres();
        double double11 = pixelDensity2.getRawVerticalDensity();
        double double12 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.15500031000062d, 0.97d);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 38.188976377952756d + "'", double4 == 38.188976377952756d);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) '#', 0.0d);
        boolean boolean3 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) 10, (-0.003937007874015748d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(393.7007874015748d, 0.0d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.016387064000000003d, 0.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(6.4516d, Double.NEGATIVE_INFINITY);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.4516d + "'", double3 == 6.4516d);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        java.lang.Class<?> wildcardClass7 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isInInches();
        boolean boolean5 = pixelDensity2.isInInches();
        double double6 = pixelDensity2.verticalDensityInches();
        double double7 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 1, 0.3937007874015748d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((-1.0d), (double) (short) -1);
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.32d, 35.0d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.97d, (double) '4');
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityInches();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean6 = pixelDensity2.isUnitless();
        boolean boolean7 = pixelDensity2.isInCentimetres();
        java.lang.Class<?> wildcardClass8 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.54d + "'", double3 == 2.54d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.01d) + "'", double4 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 100L, (double) (byte) 1);
        double double3 = pixelDensity2.verticalDensityMetres();
        boolean boolean4 = pixelDensity2.isInInches();
        double double5 = pixelDensity2.horizontalDensityMetres();
        double double6 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.3937007874015748d, (-15.500031000062002d));
        double double3 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.3937007874015748d) + "'", double3 == (-0.3937007874015748d));
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (byte) 100, 0.0d);
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.64516d, Double.NaN);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        double double7 = pixelDensity2.verticalDensityMetres();
        double double8 = pixelDensity2.verticalDensityMetres();
        boolean boolean9 = pixelDensity2.isInCentimetres();
        double double10 = pixelDensity2.verticalDensityCentimetres();
        java.lang.Class<?> wildcardClass11 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(1000.0d, 254.0d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        java.lang.Class<?> wildcardClass4 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1000.0d + "'", double3 == 1000.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(520000.0d, 0.1d);
        boolean boolean3 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(393700.78740157484d, 0.0d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 393700.78740157484d + "'", double3 == 393700.78740157484d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(155000.31000062003d, (double) (byte) 100);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(1000000.0d, 2.54d);
        double double3 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1000000.0d + "'", double3 == 1000000.0d);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        java.lang.Class<?> wildcardClass4 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(254.0d, (double) (-1));
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 0, (double) (short) 1);
        double double3 = pixelDensity2.horizontalDensityMetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 39.37007874015748d + "'", double4 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3937007874015748d + "'", double5 == 0.3937007874015748d);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 100L, (double) (short) 1);
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.horizontalDensityInches();
        double double5 = pixelDensity2.getRawVerticalDensity();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 254.0d + "'", double3 == 254.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 254.0d + "'", double4 == 254.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.3937007874015748d, (double) 1);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityInches();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean6 = pixelDensity2.isUnitless();
        double double7 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3937007874015748d + "'", double5 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        double double8 = pixelDensity2.getRawVerticalDensity();
        double double9 = pixelDensity2.getRawVerticalDensity();
        double double10 = pixelDensity2.verticalDensityInches();
        double double11 = pixelDensity2.verticalDensityMetres();
        double double12 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        double double7 = pixelDensity2.verticalDensityMetres();
        double double8 = pixelDensity2.verticalDensityMetres();
        double double9 = pixelDensity2.getRawHorizontalDensity();
        double double10 = pixelDensity2.verticalDensityCentimetres();
        double double11 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 100L, 3200.0d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-15.500031000062002d), 100.0d);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 1, (double) 0);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.003937007874015748d, (-0.01d));
        double double3 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(25400.0d, Double.NaN);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 254.0d + "'", double4 == 254.0d);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) 1, (double) 1L);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.01d + "'", double3 == 0.01d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.01d + "'", double4 == 0.01d);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.0d, 1000.0d);
        double double3 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10L, 1.0d);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.4d + "'", double4 == 25.4d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) 1L);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isInInches();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isInCentimetres();
        double double8 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0, (double) (-1.0f));
        double double3 = pixelDensity2.horizontalDensityInches();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 'a', (double) 10L);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.97d + "'", double4 == 0.97d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-0.3937007874015748d), (double) 100);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, 100.0d);
        double double3 = pixelDensity2.verticalDensityInches();
        double double4 = pixelDensity2.horizontalDensityInches();
        double double5 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1.0d, 5200.0d);
        double double3 = pixelDensity2.horizontalDensityMetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.01d, 0.0025399999999999997d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(3937.0078740157483d, (-0.0254d));
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.54d) + "'", double3 == (-2.54d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3937.0078740157483d + "'", double4 == 3937.0078740157483d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3937.0078740157483d + "'", double5 == 3937.0078740157483d);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInMetres();
        double double6 = pixelDensity2.horizontalDensityInches();
        boolean boolean7 = pixelDensity2.isInInches();
        double double8 = pixelDensity2.verticalDensityInches();
        double double9 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.0254d) + "'", double6 == (-0.0254d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.54d + "'", double8 == 2.54d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(10.0d, 393700.78740157484d);
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (-1), 81.28d);
        boolean boolean3 = pixelDensity2.isUnitless();
        java.lang.Class<?> wildcardClass4 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (short) 10, 100.0d);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(2.54E-4d, 206.4512d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        boolean boolean5 = pixelDensity2.isInMetres();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.verticalDensityInches();
        double double8 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.06451599999999999d, (double) 10L);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) (byte) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityInches();
        java.lang.Class<?> wildcardClass6 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0L, (double) 1);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.verticalDensityMetres();
        double double7 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3937007874015748d + "'", double5 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 39.37007874015748d + "'", double6 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) (byte) 10);
        double double3 = pixelDensity2.verticalDensityInches();
        double double4 = pixelDensity2.horizontalDensityMetres();
        boolean boolean5 = pixelDensity2.isUnitless();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.01d, 16.387064d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(1259.8425196850394d, Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) ' ', (double) (-1.0f));
        double double3 = pixelDensity2.verticalDensityInches();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.54d) + "'", double3 == (-2.54d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-2.54d) + "'", double5 == (-2.54d));
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        java.lang.Class<?> wildcardClass7 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) 1, (double) 1L);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.01d + "'", double3 == 0.01d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.01d + "'", double5 == 0.01d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.01d + "'", double6 == 0.01d);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0L, (double) 1);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.horizontalDensityInches();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        java.lang.Class<?> wildcardClass7 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInInches();
        double double6 = pixelDensity2.horizontalDensityInches();
        java.lang.Class<?> wildcardClass7 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.0254d) + "'", double6 == (-0.0254d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.254d, 97.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.getRawVerticalDensity();
        boolean boolean5 = pixelDensity2.isInMetres();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.horizontalDensityCentimetres();
        double double8 = pixelDensity2.horizontalDensityInches();
        double double9 = pixelDensity2.verticalDensityInches();
        java.lang.Class<?> wildcardClass10 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 39.37007874015748d + "'", double7 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(1.5500031000062002E7d, 0.38188976377952755d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(1000.0d, (-1.0d));
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (-1.0f), 0.32d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(10000.0d, 6.102374409473229d);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(35.0d, (-0.3937007874015748d));
        double double3 = pixelDensity2.horizontalDensityInches();
        boolean boolean4 = pixelDensity2.isInInches();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.NEGATIVE_INFINITY + "'", double5 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.0d, (double) (byte) -1);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(254.0d, (double) 100L);
        boolean boolean3 = pixelDensity2.isInInches();
        boolean boolean4 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((-3937.0078740157483d), (double) (short) -1);
        double double3 = pixelDensity2.horizontalDensityMetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3937.0078740157483d) + "'", double4 == (-3937.0078740157483d));
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1.0f), 3937.0078740157483d);
        double double3 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.0d, (-0.01d));
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(25400.0d, 10000.0d);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1000000.0d + "'", double3 == 1000000.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10000.0d + "'", double4 == 10000.0d);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.0d, Double.NaN);
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((-155000.31000062003d), 610.237440947323d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-100.0d), (double) (short) 10);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1000.0d + "'", double4 == 1000.0d);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        double double7 = pixelDensity2.verticalDensityInches();
        double double8 = pixelDensity2.horizontalDensityInches();
        boolean boolean9 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.3937007874015748d) + "'", double4 == (-0.3937007874015748d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3937007874015748d + "'", double5 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(254.0d, 520000.0d);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) '#', (double) 1);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.horizontalDensityMetres();
        double double5 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3500.0d + "'", double4 == 3500.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 88.9d + "'", double5 == 88.9d);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(Double.NEGATIVE_INFINITY, 0.006451600000000001d);
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) (byte) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        double double6 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (-1), (double) (-1.0f));
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.01d) + "'", double3 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.01d) + "'", double5 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.0038188976377952757d, 320000.0d);
        double double3 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8128.0d + "'", double3 == 8128.0d);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(3200.0d, 100.0d);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 39.37007874015748d + "'", double4 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(3500.0d, 5200.0d);
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3500.0d + "'", double4 == 3500.0d);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.0d, 3937.0078740157483d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityInches();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        double double7 = pixelDensity2.verticalDensityMetres();
        double double8 = pixelDensity2.verticalDensityMetres();
        double double9 = pixelDensity2.getRawHorizontalDensity();
        double double10 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean11 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.getRawVerticalDensity();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isInInches();
        double double8 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.01d) + "'", double6 == (-0.01d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(25.4d, (double) 100L);
        boolean boolean3 = pixelDensity2.isInMetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.verticalDensityMetres();
        double double6 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (byte) 1, (double) '#');
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.254d, 0.0025399999999999997d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(10000.0d, (double) 10);
        double double3 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 25400.0d + "'", double3 == 25400.0d);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (short) 0, (double) 'a');
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(393700.7874015748d, 16.387064d);
        double double3 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1000000.0d + "'", double3 == 1000000.0d);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) 1, 0.0d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(610.2374409473229d, (-1.0E-4d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(254.0d, 520000.0d);
        boolean boolean3 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-39.37007874015748d), 0.64516d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(100.0d, 100.0d);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.horizontalDensityMetres();
        boolean boolean6 = pixelDensity2.isUnitless();
        double double7 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.54d + "'", double7 == 2.54d);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (short) 0, (double) 10.0f);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInMetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isUnitless();
        boolean boolean8 = pixelDensity2.isInMetres();
        double double9 = pixelDensity2.horizontalDensityMetres();
        boolean boolean10 = pixelDensity2.isInCentimetres();
        double double11 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        double double7 = pixelDensity2.verticalDensityMetres();
        boolean boolean8 = pixelDensity2.isInCentimetres();
        boolean boolean9 = pixelDensity2.isInCentimetres();
        double double10 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(3200.0d, (-100.0d));
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean6 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3200.0d + "'", double5 == 3200.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (byte) 1, 0.0d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        double double6 = pixelDensity2.horizontalDensityInches();
        double double7 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityInches();
        double double5 = pixelDensity2.getRawVerticalDensity();
        double double6 = pixelDensity2.verticalDensityMetres();
        double double7 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(10.0d, 35.0d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (-1.0f), (double) '#');
        double double3 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.0038188976377952757d, 81.28d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(10000.0d, (double) (-1.0f));
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.getRawVerticalDensity();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 25400.0d + "'", double3 == 25400.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) ' ', 10000.0d);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.horizontalDensityMetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.verticalDensityMetres();
        double double7 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(35.0d, (double) (byte) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 1.0f, 0.003937007874015748d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        boolean boolean5 = pixelDensity2.isUnitless();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.horizontalDensityCentimetres();
        double double8 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.01d) + "'", double7 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (short) 1, (double) (byte) 10);
        boolean boolean3 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityInches();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.getRawVerticalDensity();
        double double7 = pixelDensity2.verticalDensityInches();
        double double8 = pixelDensity2.horizontalDensityMetres();
        double double9 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.54d + "'", double3 == 2.54d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.01d) + "'", double4 == (-0.01d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.54d + "'", double7 == 2.54d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.verticalDensityMetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isInMetres();
        double double8 = pixelDensity2.getRawHorizontalDensity();
        double double9 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean10 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 39.37007874015748d + "'", double5 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3937007874015748d + "'", double6 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.0d, 0.06102374409473228d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        double double6 = pixelDensity2.verticalDensityInches();
        double double7 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) 0L);
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(100000.0d, (double) 1.0f);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100000.0d + "'", double3 == 100000.0d);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.0d, (-0.3937007874015748d));
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        boolean boolean5 = pixelDensity2.isInInches();
        boolean boolean6 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-15.500031000062002d) + "'", double3 == (-15.500031000062002d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-15.500031000062002d) + "'", double4 == (-15.500031000062002d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0, (double) (-1.0f));
        double double3 = pixelDensity2.horizontalDensityInches();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        boolean boolean5 = pixelDensity2.isInInches();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.3937007874015748d) + "'", double6 == (-0.3937007874015748d));
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (byte) 1, 0.0d);
        boolean boolean3 = pixelDensity2.isInMetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.horizontalDensityInches();
        double double8 = pixelDensity2.getRawVerticalDensity();
        double double9 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((-1.0d), 100000.0d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10L, 1.0d);
        boolean boolean3 = pixelDensity2.isInMetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInInches();
        boolean boolean6 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(1.0d, 0.3937007874015748d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(25400.0d, 0.8128d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) ' ', 10000.0d);
        double double3 = pixelDensity2.verticalDensityInches();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.verticalDensityInches();
        boolean boolean5 = pixelDensity2.isInInches();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isInInches();
        double double8 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.3937007874015748d) + "'", double6 == (-0.3937007874015748d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.3937007874015748d) + "'", double8 == (-0.3937007874015748d));
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        boolean boolean3 = pixelDensity2.isInInches();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.horizontalDensityMetres();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        double double7 = pixelDensity2.getRawVerticalDensity();
        double double8 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean9 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.0d, (double) (-1.0f));
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        double double7 = pixelDensity2.verticalDensityMetres();
        double double8 = pixelDensity2.verticalDensityMetres();
        boolean boolean9 = pixelDensity2.isInCentimetres();
        double double10 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        double double6 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.01d) + "'", double5 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.0254d) + "'", double6 == (-0.0254d));
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) '#', (double) (byte) 100);
        double double3 = pixelDensity2.verticalDensityMetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10000.0d + "'", double3 == 10000.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 88.9d + "'", double6 == 88.9d);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 1L, 0.0d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.06451599999999999d, 0.97d);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1.0d, 0.8128d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 10, (double) ' ');
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.32d + "'", double3 == 0.32d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(155000.31000062003d, 155000.31000062003d);
        boolean boolean3 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(393700.7874015748d, (double) 100.0f);
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1000000.0d + "'", double3 == 1000000.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10000.0d + "'", double4 == 10000.0d);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 1.0f, (double) '4');
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) 100, (double) 10.0f);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(100000.0d, (-0.15500031000062d));
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.15500031000062d) + "'", double3 == (-0.15500031000062d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (short) 0, (-6.4516E-4d));
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.3937007874015748d, 3200.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(35.0d, (double) (-1L));
        double double3 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) '4', 8890.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 0, (double) (short) 1);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.horizontalDensityMetres();
        java.lang.Class<?> wildcardClass5 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) (byte) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isUnitless();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isInCentimetres();
        java.lang.Class<?> wildcardClass8 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 0, 100.0d);
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10000.0d + "'", double3 == 10000.0d);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 100L, (double) (short) 1);
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10000.0d + "'", double4 == 10000.0d);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(25400.0d, 0.01d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.01d + "'", double3 == 0.01d);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 100L, (double) (short) 100);
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.verticalDensityMetres();
        boolean boolean5 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.54d + "'", double3 == 2.54d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean5 = pixelDensity2.isUnitless();
        boolean boolean6 = pixelDensity2.isUnitless();
        boolean boolean7 = pixelDensity2.isInMetres();
        double double8 = pixelDensity2.getRawHorizontalDensity();
        java.lang.Class<?> wildcardClass9 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.32d, 100000.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.97d, 25400.0d);
        double double3 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.97d + "'", double3 == 0.97d);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(155000.31000062003d, 81.28d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(97.0d, (double) '#');
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0L, (double) 1);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.verticalDensityMetres();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean7 = pixelDensity2.isUnitless();
        double double8 = pixelDensity2.horizontalDensityInches();
        boolean boolean9 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 39.37007874015748d + "'", double5 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) 1L);
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isInMetres();
        boolean boolean5 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.006451600000000001d, 1259.8425196850394d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(100.0d, 39.37007874015748d);
        double double3 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 254.0d + "'", double3 == 254.0d);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(38.188976377952756d, 35.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityInches();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        java.lang.Class<?> wildcardClass6 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.54d + "'", double3 == 2.54d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.01d) + "'", double4 == (-0.01d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1.0d, (double) 0L);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        boolean boolean6 = pixelDensity2.isInInches();
        boolean boolean7 = pixelDensity2.isInCentimetres();
        double double8 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (-0.0254d));
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.getRawVerticalDensity();
        boolean boolean5 = pixelDensity2.isInMetres();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean8 = pixelDensity2.isInInches();
        double double9 = pixelDensity2.verticalDensityMetres();
        double double10 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 39.37007874015748d + "'", double9 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3937.0078740157483d + "'", double10 == 3937.0078740157483d);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) 1, (double) 1L);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.horizontalDensityInches();
        double double5 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0254d + "'", double4 == 0.0254d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0254d + "'", double5 == 0.0254d);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 100L, (double) (byte) 1);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        double double6 = pixelDensity2.verticalDensityMetres();
        boolean boolean7 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(35.0d, 0.1d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(6.102374409473229d, 3500.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.0d, 0.006451600000000001d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (short) 0, (-1.0d));
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        double double5 = pixelDensity2.getRawVerticalDensity();
        boolean boolean6 = pixelDensity2.isInInches();
        boolean boolean7 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.0d, (double) 0.0f);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.horizontalDensityInches();
        double double5 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 1L, 1.5500031000062002E7d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.verticalDensityInches();
        double double5 = pixelDensity2.verticalDensityInches();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean8 = pixelDensity2.isInMetres();
        boolean boolean9 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.3937007874015748d) + "'", double7 == (-0.3937007874015748d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) (byte) 10);
        double double3 = pixelDensity2.horizontalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityMetres();
        java.lang.Class<?> wildcardClass5 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10L, 1.0d);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.horizontalDensityMetres();
        boolean boolean5 = pixelDensity2.isInInches();
        double double6 = pixelDensity2.verticalDensityMetres();
        double double7 = pixelDensity2.verticalDensityMetres();
        double double8 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1000.0d + "'", double4 == 1000.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 25.4d + "'", double8 == 25.4d);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(2.54d, (double) (-1.0f));
        double double3 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.3937007874015748d) + "'", double3 == (-0.3937007874015748d));
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(610.237440947323d, 3937.0078740157483d);
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (byte) 0, 10000.0d);
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isInInches();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(5200.0d, 204724.4094488189d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        boolean boolean5 = pixelDensity2.isUnitless();
        boolean boolean6 = pixelDensity2.isInInches();
        double double7 = pixelDensity2.verticalDensityMetres();
        boolean boolean8 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 39.37007874015748d + "'", double3 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 39.37007874015748d + "'", double7 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(206.4512d, (double) '4');
        double double3 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(1000000.0d, Double.NEGATIVE_INFINITY);
        boolean boolean3 = pixelDensity2.isInMetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 0L, 2047.244094488189d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(10000.0d, 6.4516d);
        double double3 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 254.0d + "'", double3 == 254.0d);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) (byte) 10);
        double double3 = pixelDensity2.horizontalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityMetres();
        boolean boolean5 = pixelDensity2.isInMetres();
        boolean boolean6 = pixelDensity2.isInInches();
        boolean boolean7 = pixelDensity2.isUnitless();
        double double8 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) (byte) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityInches();
        boolean boolean6 = pixelDensity2.isInInches();
        double double7 = pixelDensity2.getRawVerticalDensity();
        double double8 = pixelDensity2.horizontalDensityInches();
        boolean boolean9 = pixelDensity2.isInInches();
        boolean boolean10 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(81.28d, (double) 0.0f);
        double double3 = pixelDensity2.horizontalDensityMetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(3500.0d, 25400.0d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 254.0d + "'", double3 == 254.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 88.9d + "'", double4 == 88.9d);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (-1.0f), 610.237440947323d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 610.237440947323d + "'", double3 == 610.237440947323d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 61023.74409473229d + "'", double4 == 61023.74409473229d);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(6.4516d, Double.NEGATIVE_INFINITY);
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        boolean boolean3 = pixelDensity2.isInInches();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.horizontalDensityMetres();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean7 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (-1L), 1000000.0d);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 100.0f, 0.0d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (byte) -1, 0.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.06451599999999999d, 393700.7874015748d);
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.0254d, 0.06451599999999999d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) '#', (-0.0254d));
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) (byte) 10);
        double double3 = pixelDensity2.horizontalDensityMetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        double double5 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (short) 100, 393700.78740157484d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 393700.78740157484d + "'", double3 == 393700.78740157484d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.0d, 0.016387064000000003d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1550.0031000062002d, (double) 100);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(3818.8976377952754d, 39.37007874015748d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((-1.0d), 35.0d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        java.lang.Class<?> wildcardClass5 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.09999999999999999d, (-0.0254d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(3200.0d, (double) (byte) 100);
        double double3 = pixelDensity2.getRawVerticalDensity();
        java.lang.Class<?> wildcardClass4 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) '#', 1000000.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-1.0d), 0.01d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(Double.POSITIVE_INFINITY, 0.0d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (-1.0f), (double) '#');
        boolean boolean3 = pixelDensity2.isInCentimetres();
        java.lang.Class<?> wildcardClass4 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.15500031000062d, (double) 100.0f);
        boolean boolean3 = pixelDensity2.isInInches();
        boolean boolean4 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        double double6 = pixelDensity2.getRawVerticalDensity();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean8 = pixelDensity2.isInInches();
        double double9 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.01d) + "'", double5 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.54d + "'", double9 == 2.54d);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.38188976377952755d, 1.0d);
        boolean boolean3 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (short) 0, (double) 'a');
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(155000.31000062003d, (double) ' ');
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.254d, 35.0d);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.889d + "'", double4 == 0.889d);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.32d, 52.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(1000000.0d, 1550.0031000062002d);
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1550.0031000062002d + "'", double3 == 1550.0031000062002d);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(6.102374409473229d, 1259.8425196850394d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.102374409473229d + "'", double3 == 6.102374409473229d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 100L, (double) (short) 100);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInMetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        double double8 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean9 = pixelDensity2.isInMetres();
        boolean boolean10 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.01d) + "'", double8 == (-0.01d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (byte) 100, (-1.0d));
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) (byte) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean6 = pixelDensity2.isUnitless();
        boolean boolean7 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3937.0078740157483d + "'", double4 == 3937.0078740157483d);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((-0.01d), (-39.37007874015748d));
        double double3 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInInches();
        boolean boolean6 = pixelDensity2.isInInches();
        double double7 = pixelDensity2.getRawVerticalDensity();
        boolean boolean8 = pixelDensity2.isInInches();
        boolean boolean9 = pixelDensity2.isInMetres();
        double double10 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.01d) + "'", double10 == (-0.01d));
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(1.0d, 0.01d);
        double double3 = pixelDensity2.horizontalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        double double5 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 39.37007874015748d + "'", double3 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 39.37007874015748d + "'", double5 == 39.37007874015748d);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) (byte) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        double double7 = pixelDensity2.verticalDensityMetres();
        boolean boolean8 = pixelDensity2.isInCentimetres();
        double double9 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.0d, 20.47244094488189d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.horizontalDensityMetres();
        double double8 = pixelDensity2.getRawVerticalDensity();
        double double9 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(32.0d, (-15.500031000062002d));
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(204724.4094488189d, 3200.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(52.0d, 0.1d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 10L, (double) (short) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.254d, (double) 1L);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        double double7 = pixelDensity2.verticalDensityInches();
        double double8 = pixelDensity2.horizontalDensityInches();
        double double9 = pixelDensity2.horizontalDensityMetres();
        boolean boolean10 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.54d + "'", double7 == 2.54d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.0254d) + "'", double8 == (-0.0254d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((-0.01d), (-39.37007874015748d));
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.3937007874015748d) + "'", double3 == (-0.3937007874015748d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0E-4d) + "'", double4 == (-1.0E-4d));
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 1L, Double.POSITIVE_INFINITY);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.verticalDensityInches();
        boolean boolean5 = pixelDensity2.isInInches();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 100L, (double) (short) 1);
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 254.0d + "'", double3 == 254.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((-0.3937007874015748d), (-0.0254d));
        double double3 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.4516E-4d) + "'", double3 == (-6.4516E-4d));
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean6 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) (short) 1);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 100, (double) 0.0f);
        double double3 = pixelDensity2.horizontalDensityMetres();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(320000.0d, (double) 100);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.97d, (double) 10);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.38188976377952755d + "'", double3 == 0.38188976377952755d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 393.7007874015748d + "'", double4 == 393.7007874015748d);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0L, 3818.8976377952754d);
        double double3 = pixelDensity2.horizontalDensityInches();
        java.lang.Class<?> wildcardClass4 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((-3937.0078740157483d), 0.8128d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(3500.0d, 0.52d);
        double double3 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 350000.0d + "'", double3 == 350000.0d);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInInches();
        boolean boolean6 = pixelDensity2.isInInches();
        double double7 = pixelDensity2.getRawVerticalDensity();
        double double8 = pixelDensity2.verticalDensityInches();
        boolean boolean9 = pixelDensity2.isInCentimetres();
        boolean boolean10 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.54d + "'", double8 == 2.54d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 100.0f, 0.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(3937.007874015748d, 88.9d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((-0.3937007874015748d), 10.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10.0f, 2.54d);
        double double3 = pixelDensity2.verticalDensityMetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 254.0d + "'", double3 == 254.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 10, 0.64516d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) '#', (double) (byte) 100);
        double double3 = pixelDensity2.horizontalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        boolean boolean5 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3500.0d + "'", double3 == 3500.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 88.9d + "'", double4 == 88.9d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.verticalDensityMetres();
        boolean boolean6 = pixelDensity2.isUnitless();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0L, (double) 1);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3937007874015748d + "'", double4 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3937007874015748d + "'", double5 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3937007874015748d + "'", double6 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityInches();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        double double7 = pixelDensity2.verticalDensityInches();
        double double8 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.38188976377952755d, 25400.0d);
        double double3 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 64516.0d + "'", double3 == 64516.0d);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(393700.7874015748d, 0.0038188976377952757d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0L, (double) 1);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3937007874015748d + "'", double5 == 0.3937007874015748d);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(32.0d, 393700.78740157484d);
        double double3 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1259.8425196850394d + "'", double3 == 1259.8425196850394d);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.0d, (double) 0.0f);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(393.7007874015748d, 3937.007874015748d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 100.0f, 0.0d);
        boolean boolean3 = pixelDensity2.isInInches();
        boolean boolean4 = pixelDensity2.isInInches();
        boolean boolean5 = pixelDensity2.isUnitless();
        double double6 = pixelDensity2.horizontalDensityMetres();
        boolean boolean7 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3937.0078740157483d + "'", double6 == 3937.0078740157483d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) '#', (-0.0254d));
        boolean boolean3 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.97d, 10000.0d);
        double double3 = pixelDensity2.verticalDensityInches();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 25400.0d + "'", double3 == 25400.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.97d + "'", double4 == 0.97d);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.verticalDensityMetres();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.0d, 3937.0078740157483d);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(1259.8425196850394d, (double) (byte) 0);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3937.0078740157483d + "'", double4 == 3937.0078740157483d);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.32d, (-0.0254d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 1.0f, 0.0d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.verticalDensityMetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isInMetres();
        double double8 = pixelDensity2.getRawHorizontalDensity();
        double double9 = pixelDensity2.getRawHorizontalDensity();
        double double10 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 39.37007874015748d + "'", double5 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3937007874015748d + "'", double6 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.3937007874015748d) + "'", double10 == (-0.3937007874015748d));
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInInches();
        boolean boolean6 = pixelDensity2.isInInches();
        double double7 = pixelDensity2.getRawVerticalDensity();
        boolean boolean8 = pixelDensity2.isInInches();
        double double9 = pixelDensity2.horizontalDensityInches();
        double double10 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.0254d) + "'", double9 == (-0.0254d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.01d) + "'", double10 == (-0.01d));
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10L, 1.0d);
        boolean boolean3 = pixelDensity2.isInInches();
        boolean boolean4 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 'a', (-1.0d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInInches();
        double double6 = pixelDensity2.verticalDensityMetres();
        double double7 = pixelDensity2.getRawVerticalDensity();
        boolean boolean8 = pixelDensity2.isUnitless();
        double double9 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean10 = pixelDensity2.isUnitless();
        double double11 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.3937007874015748d) + "'", double4 == (-0.3937007874015748d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(10.0d, (double) 10);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(2.54d, 10.0d);
        double double3 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) (byte) 10);
        double double3 = pixelDensity2.horizontalDensityMetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        java.lang.Class<?> wildcardClass5 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 100L, 2.54d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.54d + "'", double3 == 2.54d);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.getRawVerticalDensity();
        boolean boolean5 = pixelDensity2.isInMetres();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean8 = pixelDensity2.isInInches();
        boolean boolean9 = pixelDensity2.isUnitless();
        double double10 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(6.4516d, 6.4516d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(35.0d, 39.37007874015748d);
        double double3 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((-0.3937007874015748d), 1000.0d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.15500031000062d) + "'", double3 == (-0.15500031000062d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.38188976377952755d, 1259.8425196850394d);
        boolean boolean3 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (short) 0, (-1.0d));
        boolean boolean3 = pixelDensity2.isInMetres();
        boolean boolean4 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(81.28d, (-0.0254d));
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0254d) + "'", double4 == (-0.0254d));
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.0d, 1550.0031000062002d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInMetres();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        double double7 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.getRawVerticalDensity();
        boolean boolean5 = pixelDensity2.isInMetres();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean8 = pixelDensity2.isInInches();
        double double9 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean10 = pixelDensity2.isUnitless();
        boolean boolean11 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 39.37007874015748d + "'", double9 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.verticalDensityInches();
        double double5 = pixelDensity2.verticalDensityInches();
        double double6 = pixelDensity2.getRawVerticalDensity();
        double double7 = pixelDensity2.verticalDensityInches();
        double double8 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.254d, 35.0d);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (short) 10, 3200.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 100L, (double) (short) 100);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(52.0d, 0.889d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInMetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isInInches();
        double double8 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(3200.0d, 39.37007874015748d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 0, (double) (short) 100);
        double double3 = pixelDensity2.horizontalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((-0.01d), (double) (byte) -1);
        boolean boolean3 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 10, (double) ' ');
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.1d + "'", double3 == 0.1d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8128d + "'", double4 == 0.8128d);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 1, 0.3937007874015748d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityInches();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0L, (double) 1);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        boolean boolean5 = pixelDensity2.isUnitless();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(15.500031000062002d, 610.237440947323d);
        boolean boolean3 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((-3937.0078740157483d), (double) 'a');
        double double3 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.4638d + "'", double3 == 2.4638d);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.horizontalDensityInches();
        java.lang.Class<?> wildcardClass6 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.0254d) + "'", double5 == (-0.0254d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(3937.0078740157483d, (double) 10.0f);
        boolean boolean3 = pixelDensity2.isInMetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(97.0d, (double) 10);
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(610.2374409473229d, (double) (short) -1);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (byte) 1, 1000.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(155000.31000062003d, (double) (byte) -1);
        boolean boolean3 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1.0d, 0.0d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.verticalDensityInches();
        double double5 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.15500031000062d, (double) 0L);
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.horizontalDensityInches();
        double double8 = pixelDensity2.verticalDensityMetres();
        double double9 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean10 = pixelDensity2.isInInches();
        double double11 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 100, 393700.78740157484d);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 'a', 10000.0d);
        double double3 = pixelDensity2.horizontalDensityMetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        double double5 = pixelDensity2.horizontalDensityMetres();
        boolean boolean6 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3818.8976377952754d + "'", double3 == 3818.8976377952754d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10000.0d + "'", double4 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3818.8976377952754d + "'", double5 == 3818.8976377952754d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.025399999999999995d, 1.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 10.0f, (double) (-1.0f));
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.horizontalDensityInches();
        boolean boolean5 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.254d + "'", double3 == 0.254d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.254d + "'", double4 == 0.254d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 100.0f, (double) (byte) 0);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        double double6 = pixelDensity2.verticalDensityMetres();
        double double7 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.01d) + "'", double5 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (byte) 0, 3937.0078740157483d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (short) 1, (-1.0d));
        double double3 = pixelDensity2.verticalDensityInches();
        boolean boolean4 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(Double.POSITIVE_INFINITY, (double) 0.0f);
        boolean boolean3 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(1000000.0d, (double) 100.0f);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(100000.0d, 5200.0d);
        boolean boolean3 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1.0d, 0.0d);
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(155000.31000062003d, 0.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(1377.9527559055118d, (-6.4516E-4d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1, 0.0025399999999999997d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(155000.31000062003d, (double) 10L);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isInInches();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.horizontalDensityMetres();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-39.37007874015748d) + "'", double6 == (-39.37007874015748d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3937007874015748d + "'", double7 == 0.3937007874015748d);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 1.0f, (double) 10.0f);
        boolean boolean3 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 100L, (double) (byte) 1);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        double double6 = pixelDensity2.horizontalDensityInches();
        boolean boolean7 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.0d, (double) 1L);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        double double8 = pixelDensity2.getRawVerticalDensity();
        double double9 = pixelDensity2.verticalDensityMetres();
        double double10 = pixelDensity2.horizontalDensityCentimetres();
        double double11 = pixelDensity2.getRawVerticalDensity();
        double double12 = pixelDensity2.verticalDensityInches();
        double double13 = pixelDensity2.verticalDensityInches();
        double double14 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10L, (double) '4');
        double double3 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(25.4d, 520000.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(2047.244094488189d, (double) ' ');
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.15500031000062d, 16.387064d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        boolean boolean3 = pixelDensity2.isInInches();
        boolean boolean4 = pixelDensity2.isInMetres();
        boolean boolean5 = pixelDensity2.isInInches();
        double double6 = pixelDensity2.verticalDensityMetres();
        double double7 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 39.37007874015748d + "'", double6 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3937.0078740157483d + "'", double7 == 3937.0078740157483d);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(10.0d, (double) (short) 100);
        double double3 = pixelDensity2.horizontalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(254.0d, (double) (-1));
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (short) 1, 10.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.3937007874015748d, 2.4638d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.getRawVerticalDensity();
        double double6 = pixelDensity2.verticalDensityInches();
        double double7 = pixelDensity2.horizontalDensityMetres();
        double double8 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.54d + "'", double6 == 2.54d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10L, 1.0d);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(2.54d, (double) (-1.0f));
        double double3 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.54d + "'", double3 == 2.54d);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(10000.0d, 39.37007874015748d);
        double double3 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, 10000.0d);
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(Double.NEGATIVE_INFINITY, (double) 'a');
        boolean boolean3 = pixelDensity2.isInCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(Double.NEGATIVE_INFINITY, 0.006451600000000001d);
        boolean boolean3 = pixelDensity2.isInMetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 100.0f, 10.0d);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.horizontalDensityMetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(610.237440947323d, 3937.0078740157483d);
        double double3 = pixelDensity2.verticalDensityMetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3937.0078740157483d + "'", double3 == 3937.0078740157483d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 610.237440947323d + "'", double5 == 610.237440947323d);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10L, (double) (byte) 10);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        java.lang.Class<?> wildcardClass6 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }
}

