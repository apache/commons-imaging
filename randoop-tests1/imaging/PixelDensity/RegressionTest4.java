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
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.01d, (-39.37007874015748d));
        double double3 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.01d + "'", double3 == 0.01d);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(1.5500031000062002E7d, (-1.0d));
        double double3 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.5500031000062002E7d + "'", double3 == 1.5500031000062002E7d);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isUnitless();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        double double7 = pixelDensity2.verticalDensityInches();
        double double8 = pixelDensity2.verticalDensityMetres();
        double double9 = pixelDensity2.verticalDensityMetres();
        double double10 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.9999999999999998d, 2.4638d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (short) 0, (double) (-1L));
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-2.54d) + "'", double4 == (-2.54d));
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1.0d, 35.0d);
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.verticalDensityInches();
        double double6 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.52d, (-0.0016387064d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (byte) 10, 6.4516d);
        double double3 = pixelDensity2.verticalDensityInches();
        double double4 = pixelDensity2.horizontalDensityInches();
        double double5 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.4516d + "'", double3 == 6.4516d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.4516d + "'", double5 == 6.4516d);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.09999999999999999d, 0.0d);
        double double3 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) 100, (double) 10.0f);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        java.lang.Class<?> wildcardClass5 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.54d + "'", double4 == 2.54d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(1000000.0d, 97.0d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 38.188976377952756d + "'", double3 == 38.188976377952756d);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean6 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.01d) + "'", double5 == (-0.01d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (byte) 100, (double) (short) -1);
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 100.0f, (double) (byte) 0);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean4 = pixelDensity2.isInInches();
        double double5 = pixelDensity2.horizontalDensityMetres();
        boolean boolean6 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3937.0078740157483d + "'", double5 == 3937.0078740157483d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.0254d) + "'", double7 == (-0.0254d));
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(645.16d, 2.54E-4d);
        double double3 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.horizontalDensityMetres();
        double double6 = pixelDensity2.getRawVerticalDensity();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(3500.0d, 25400.0d);
        double double3 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3500.0d + "'", double3 == 3500.0d);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(254.0d, 2.54d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(3818.8976377952754d, 0.0d);
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(25.4d, (double) 'a');
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10L, 1.0d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean5 = pixelDensity2.isInMetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        double double7 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.54d + "'", double7 == 2.54d);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.0025399999999999997d, Double.NEGATIVE_INFINITY);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (short) -1, (double) 0L);
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.97d, (double) 10);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.38188976377952755d + "'", double3 == 0.38188976377952755d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.937007874015748d + "'", double6 == 3.937007874015748d);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.getRawVerticalDensity();
        double double6 = pixelDensity2.verticalDensityInches();
        boolean boolean7 = pixelDensity2.isInMetres();
        double double8 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.54d + "'", double6 == 2.54d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isUnitless();
        boolean boolean8 = pixelDensity2.isUnitless();
        double double9 = pixelDensity2.verticalDensityMetres();
        double double10 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean11 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.getRawVerticalDensity();
        boolean boolean5 = pixelDensity2.isInMetres();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean8 = pixelDensity2.isInInches();
        double double9 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean10 = pixelDensity2.isUnitless();
        boolean boolean11 = pixelDensity2.isInCentimetres();
        double double12 = pixelDensity2.horizontalDensityMetres();
        double double13 = pixelDensity2.verticalDensityMetres();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3937.0078740157483d + "'", double12 == 3937.0078740157483d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 39.37007874015748d + "'", double13 == 39.37007874015748d);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((-0.01d), (-39.37007874015748d));
        double double3 = pixelDensity2.horizontalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityMetres();
        double double5 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.NEGATIVE_INFINITY + "'", double5 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isInInches();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        double double8 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-39.37007874015748d) + "'", double4 == (-39.37007874015748d));
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-15.500031000062002d), 100.0d);
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10000.0d + "'", double4 == 10000.0d);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isUnitless();
        boolean boolean8 = pixelDensity2.isUnitless();
        double double9 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean10 = pixelDensity2.isInCentimetres();
        double double11 = pixelDensity2.getRawHorizontalDensity();
        double double12 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((-3937.0078740157483d), (double) '#');
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) (byte) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityInches();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.horizontalDensityMetres();
        double double8 = pixelDensity2.horizontalDensityMetres();
        java.lang.Class<?> wildcardClass9 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 'a', 10000.0d);
        double double3 = pixelDensity2.horizontalDensityMetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        double double5 = pixelDensity2.horizontalDensityMetres();
        boolean boolean6 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3818.8976377952754d + "'", double3 == 3818.8976377952754d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10000.0d + "'", double4 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3818.8976377952754d + "'", double5 == 3818.8976377952754d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 100L, (double) (short) 1);
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.verticalDensityInches();
        double double5 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 254.0d + "'", double3 == 254.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.54d + "'", double4 == 2.54d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.01d) + "'", double7 == (-0.01d));
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (byte) 0, 3818.8976377952754d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3818.8976377952754d + "'", double3 == 3818.8976377952754d);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 100L, (double) (byte) 1);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(10000.0d, 10000.0d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3937.0078740157483d + "'", double3 == 3937.0078740157483d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 393700.7874015748d + "'", double5 == 393700.7874015748d);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-100.0d), 52.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((-15.500031000062002d), 81.28d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.15500031000062d, 0.97d);
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-0.0016387064d), 100.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-610.237440947323d), 25.4d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 1.0f, (-0.0015500031000061998d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.15500031000062d, 1.5500031000062002E7d);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.15500031000062d + "'", double4 == 0.15500031000062d);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(38.188976377952756d, 0.9999999999999998d);
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 99.99999999999999d + "'", double3 == 99.99999999999999d);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(10.0d, (double) (short) 100);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1.0d, 350000.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(Double.NEGATIVE_INFINITY, (double) 'a');
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        boolean boolean5 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3818.8976377952754d + "'", double3 == 3818.8976377952754d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1.5500031000062002E7d, 3500.0d);
        double double3 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(3500.0d, 25400.0d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 88.9d + "'", double5 == 88.9d);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (byte) 100, (double) 'a');
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3818.8976377952754d + "'", double3 == 3818.8976377952754d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 39.37007874015748d + "'", double4 == 39.37007874015748d);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.06102374409473228d, 204724.4094488189d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        double double7 = pixelDensity2.horizontalDensityInches();
        double double8 = pixelDensity2.horizontalDensityCentimetres();
        double double9 = pixelDensity2.getRawHorizontalDensity();
        double double10 = pixelDensity2.verticalDensityCentimetres();
        double double11 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInMetres();
        double double6 = pixelDensity2.getRawVerticalDensity();
        boolean boolean7 = pixelDensity2.isInCentimetres();
        double double8 = pixelDensity2.getRawVerticalDensity();
        double double9 = pixelDensity2.horizontalDensityMetres();
        double double10 = pixelDensity2.horizontalDensityMetres();
        boolean boolean11 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(25.4d, (-2.54d));
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-2.54d) + "'", double4 == (-2.54d));
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1.0f), 3937.0078740157483d);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.horizontalDensityMetres();
        boolean boolean5 = pixelDensity2.isUnitless();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-39.37007874015748d) + "'", double4 == (-39.37007874015748d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1550.0031000062002d + "'", double6 == 1550.0031000062002d);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(3818.8976377952754d, (double) '#');
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3818.8976377952754d + "'", double3 == 3818.8976377952754d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 0L, (double) (short) -1);
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.3937007874015748d, 0.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(2.54d, 0.0d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean4 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.54d + "'", double3 == 2.54d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.016387064000000003d, 10000.000000000002d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 0L, (double) (-1.0f));
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) 100, (double) 0.0f);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        boolean boolean6 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.horizontalDensityInches();
        double double8 = pixelDensity2.verticalDensityMetres();
        double double9 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean10 = pixelDensity2.isInInches();
        boolean boolean11 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) 1, (-100.0d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, 10000.0d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityMetres();
        double double5 = pixelDensity2.horizontalDensityInches();
        double double6 = pixelDensity2.verticalDensityInches();
        java.lang.Class<?> wildcardClass7 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(Double.NEGATIVE_INFINITY, 393700.78740157484d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityInches();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3937.0078740157487d + "'", double3 == 3937.0078740157487d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10000.000000000002d + "'", double4 == 10000.000000000002d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.NEGATIVE_INFINITY + "'", double5 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3937.0078740157487d + "'", double6 == 3937.0078740157487d);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.0d, (double) (-1));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.3937007874015748d, 1.0d);
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((-0.0016387064d), 10000.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(97.0d, 1.0d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        java.lang.Class<?> wildcardClass5 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 38.188976377952756d + "'", double4 == 38.188976377952756d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityInches();
        boolean boolean6 = pixelDensity2.isInMetres();
        boolean boolean7 = pixelDensity2.isInMetres();
        double double8 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean9 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.09999999999999999d, 25.4d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(3818.8976377952754d, 0.01d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.horizontalDensityMetres();
        boolean boolean5 = pixelDensity2.isInMetres();
        boolean boolean6 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3818.8976377952754d + "'", double3 == 3818.8976377952754d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.38188976377952755d, 0.0d);
        boolean boolean3 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
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
        double double13 = pixelDensity2.getRawVerticalDensity();
        double double14 = pixelDensity2.getRawHorizontalDensity();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        boolean boolean3 = pixelDensity2.isInInches();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.horizontalDensityMetres();
        boolean boolean6 = pixelDensity2.isUnitless();
        boolean boolean7 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(3200.0d, 0.01d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.35d, 0.97d);
        double double3 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        double double8 = pixelDensity2.getRawVerticalDensity();
        double double9 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.3937007874015748d) + "'", double4 == (-0.3937007874015748d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3937007874015748d + "'", double5 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3937007874015748d + "'", double7 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.0d, 0.32d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        boolean boolean3 = pixelDensity2.isInInches();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.horizontalDensityMetres();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean8 = pixelDensity2.isUnitless();
        boolean boolean9 = pixelDensity2.isInInches();
        double double10 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1.0f), 3937.0078740157483d);
        boolean boolean3 = pixelDensity2.isInInches();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.horizontalDensityMetres();
        boolean boolean6 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-39.37007874015748d) + "'", double5 == (-39.37007874015748d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 100.0f, 0.008128d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 0L, (double) (short) 100);
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((-100.0d), Double.NaN);
        double double3 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1.0d, (double) 0L);
        boolean boolean3 = pixelDensity2.isInInches();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (short) -1, 2.54d);
        double double3 = pixelDensity2.verticalDensityMetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.54d + "'", double3 == 2.54d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.01d) + "'", double5 == (-0.01d));
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) '4', (-0.3937007874015748d));
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.horizontalDensityMetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        double double6 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2047.244094488189d + "'", double4 == 2047.244094488189d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.3937007874015748d) + "'", double5 == (-0.3937007874015748d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.3937007874015748d) + "'", double6 == (-0.3937007874015748d));
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (byte) 1, 8128.0d);
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 320000.0d + "'", double3 == 320000.0d);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) 1L);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isInInches();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isInCentimetres();
        double double8 = pixelDensity2.horizontalDensityInches();
        double double9 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((-0.01d), (double) 0);
        double double3 = pixelDensity2.verticalDensityInches();
        double double4 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-2.54E-4d) + "'", double4 == (-2.54E-4d));
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1.0d, 0.0d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        double double8 = pixelDensity2.getRawVerticalDensity();
        double double9 = pixelDensity2.getRawVerticalDensity();
        double double10 = pixelDensity2.horizontalDensityInches();
        double double11 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 100L, (double) (short) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean6 = pixelDensity2.isInInches();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        double double8 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10000.0d + "'", double8 == 10000.0d);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 10L, (double) (short) 1);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.verticalDensityMetres();
        boolean boolean5 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 39.37007874015748d + "'", double4 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (short) -1, 2.54d);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.54d + "'", double3 == 2.54d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.01d) + "'", double4 == (-0.01d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(39.37007874015748d, (double) ' ');
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.horizontalDensityMetres();
        boolean boolean6 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 39.37007874015748d + "'", double3 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 39.37007874015748d + "'", double4 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1550.0031000062002d + "'", double5 == 1550.0031000062002d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityInches();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.54d + "'", double3 == 2.54d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.01d) + "'", double4 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isUnitless();
        boolean boolean8 = pixelDensity2.isUnitless();
        double double9 = pixelDensity2.verticalDensityMetres();
        double double10 = pixelDensity2.verticalDensityInches();
        double double11 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.06451599999999999d, 0.06102374409473228d);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(97.0d, 320000.0d);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.0025399999999999997d, 0.254d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.0015500031000062d, 393700.78740157484d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(3200.0d, 1.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0L, (double) 1);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.horizontalDensityInches();
        double double6 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 39.37007874015748d + "'", double6 == 39.37007874015748d);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (byte) 1, 0.0d);
        double double3 = pixelDensity2.verticalDensityInches();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isUnitless();
        double double6 = pixelDensity2.verticalDensityInches();
        double double7 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(3937.007874015748d, (-0.0015500031000061998d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(Double.POSITIVE_INFINITY, 0.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(1000.0d, (-0.0015500031000061998d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (byte) 0, 1.0d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.003937007874015748d, 610.237440947323d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean5 = pixelDensity2.isUnitless();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean8 = pixelDensity2.isInMetres();
        boolean boolean9 = pixelDensity2.isUnitless();
        boolean boolean10 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.verticalDensityInches();
        double double5 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.0d, Double.NaN);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.horizontalDensityMetres();
        java.lang.Class<?> wildcardClass5 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((-61023.74409473229d), (double) 10.0f);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean5 = pixelDensity2.isUnitless();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        java.lang.Class<?> wildcardClass8 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.32d, 204724.4094488189d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 10, (double) 10);
        double double3 = pixelDensity2.horizontalDensityMetres();
        double double4 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.254d + "'", double4 == 0.254d);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(3937.0078740157483d, (-0.0254d));
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3937.0078740157483d + "'", double4 == 3937.0078740157483d);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(1.5500031000062002E7d, 155000.31000062003d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(81.28d, (double) 1);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(10.0d, 1.0d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1000.0d + "'", double4 == 1000.0d);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.horizontalDensityInches();
        boolean boolean6 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.0254d) + "'", double5 == (-0.0254d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10L, 1.0d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean5 = pixelDensity2.isInMetres();
        double double6 = pixelDensity2.verticalDensityInches();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.54d + "'", double6 == 2.54d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(6.4516d, 0.32d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.06451599999999999d + "'", double3 == 0.06451599999999999d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) (byte) 10);
        double double3 = pixelDensity2.verticalDensityInches();
        double double4 = pixelDensity2.horizontalDensityMetres();
        double double5 = pixelDensity2.verticalDensityInches();
        double double6 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-0.01d), 64516.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10L, (double) (byte) 10);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isInCentimetres();
        double double8 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1000.0d + "'", double3 == 1000.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1000.0d + "'", double4 == 1000.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.15500031000062d, (double) 0L);
        double double3 = pixelDensity2.verticalDensityInches();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean6 = pixelDensity2.isInInches();
        boolean boolean7 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.15500031000062d + "'", double5 == 0.15500031000062d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(Double.POSITIVE_INFINITY, (double) ' ');
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.horizontalDensityMetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3200.0d + "'", double4 == 3200.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1.0d, (double) 0L);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.horizontalDensityMetres();
        double double7 = pixelDensity2.horizontalDensityCentimetres();
        double double8 = pixelDensity2.getRawVerticalDensity();
        boolean boolean9 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.01d, 0.003937007874015748d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0L, (double) 1);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.verticalDensityMetres();
        double double7 = pixelDensity2.horizontalDensityMetres();
        double double8 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3937007874015748d + "'", double5 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 39.37007874015748d + "'", double6 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3937007874015748d + "'", double8 == 0.3937007874015748d);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(6.4516d, 393700.7874015748d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.4516d + "'", double3 == 6.4516d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(100.0d, 6.102374409473229d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 100.0f, 0.0d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        double double6 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 39.37007874015748d + "'", double3 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 39.37007874015748d + "'", double5 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.32d, (double) 0.0f);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.025399999999999995d, 0.1d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (byte) 1, (double) '#');
        double double3 = pixelDensity2.horizontalDensityMetres();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.0d, (-0.0016387064d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(10000.0d, 0.64516d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(97.0d, Double.POSITIVE_INFINITY);
        double double3 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 0, 64516.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.0d, 25.4d);
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        double double5 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.4d + "'", double4 == 25.4d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1000.0d + "'", double5 == 1000.0d);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((-15.500031000062002d), Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.38188976377952755d, 25400.0d);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((-100.0d), 0.52d);
        boolean boolean3 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(97.0d, 520000.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (short) -1, 2.54d);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isUnitless();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.54d + "'", double3 == 2.54d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.01d) + "'", double4 == (-0.01d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0254d + "'", double6 == 0.0254d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        java.lang.Class<?> wildcardClass5 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 0, (double) (short) 100);
        double double3 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInInches();
        boolean boolean6 = pixelDensity2.isInInches();
        double double7 = pixelDensity2.horizontalDensityCentimetres();
        double double8 = pixelDensity2.getRawVerticalDensity();
        double double9 = pixelDensity2.verticalDensityInches();
        double double10 = pixelDensity2.verticalDensityCentimetres();
        double double11 = pixelDensity2.horizontalDensityInches();
        double double12 = pixelDensity2.verticalDensityMetres();
        boolean boolean13 = pixelDensity2.isInInches();
        double double14 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.01d) + "'", double7 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.54d + "'", double9 == 2.54d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.0254d) + "'", double11 == (-0.0254d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.01d) + "'", double14 == (-0.01d));
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (short) -1, 2.54d);
        double double3 = pixelDensity2.verticalDensityMetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.54d + "'", double3 == 2.54d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(100.0d, (double) (short) -1);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.01d) + "'", double4 == (-0.01d));
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        double double7 = pixelDensity2.horizontalDensityInches();
        double double8 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (short) -1, (double) 100L);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-2.54d) + "'", double5 == (-2.54d));
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 0L, (double) (short) -1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.horizontalDensityInches();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        double double7 = pixelDensity2.verticalDensityMetres();
        double double8 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.01d) + "'", double5 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.01d) + "'", double6 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (byte) -1, 320000.0d);
        double double3 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-39.37007874015748d) + "'", double3 == (-39.37007874015748d));
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(100000.0d, 0.97d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.97d + "'", double3 == 0.97d);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.01d, (double) '4');
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isInMetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) (byte) 10);
        double double3 = pixelDensity2.horizontalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityMetres();
        double double5 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) (byte) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        double double7 = pixelDensity2.verticalDensityMetres();
        boolean boolean8 = pixelDensity2.isInCentimetres();
        double double9 = pixelDensity2.verticalDensityInches();
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
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(1.0d, 2.54d);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        double double6 = pixelDensity2.verticalDensityInches();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        double double8 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0L, (double) 1);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        boolean boolean5 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(10.0d, 393700.78740157484d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.937007874015748d + "'", double3 == 3.937007874015748d);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 0L, (-0.064516d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(393700.78740157484d, 0.016387064000000003d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) '4', (-0.15500031000062d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1.0d, 0.0d);
        boolean boolean3 = pixelDensity2.isInInches();
        boolean boolean4 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInInches();
        boolean boolean6 = pixelDensity2.isInInches();
        double double7 = pixelDensity2.horizontalDensityCentimetres();
        double double8 = pixelDensity2.getRawVerticalDensity();
        double double9 = pixelDensity2.horizontalDensityMetres();
        double double10 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.01d) + "'", double7 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.01d) + "'", double10 == (-0.01d));
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-39.37007874015748d), 254.0d);
        double double3 = pixelDensity2.verticalDensityMetres();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 25400.0d + "'", double3 == 25400.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(393700.7874015748d, (double) (byte) -1);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.3937007874015748d) + "'", double3 == (-0.3937007874015748d));
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(6.4516d, 52.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 0.0f, 393.7007874015748d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 393.7007874015748d + "'", double3 == 393.7007874015748d);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(1000000.0d, Double.NEGATIVE_INFINITY);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10000.0d + "'", double3 == 10000.0d);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 'a', 10000.0d);
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10000.0d + "'", double4 == 10000.0d);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        double double7 = pixelDensity2.verticalDensityMetres();
        double double8 = pixelDensity2.verticalDensityMetres();
        double double9 = pixelDensity2.getRawHorizontalDensity();
        double double10 = pixelDensity2.verticalDensityCentimetres();
        double double11 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.97d, 10000.0d);
        double double3 = pixelDensity2.verticalDensityInches();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 25400.0d + "'", double3 == 25400.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.4638d + "'", double5 == 2.4638d);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        double double7 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.3937007874015748d) + "'", double4 == (-0.3937007874015748d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3937007874015748d + "'", double5 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 39.37007874015748d + "'", double7 == 39.37007874015748d);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (byte) 10, (-0.3937007874015748d));
        boolean boolean3 = pixelDensity2.isInMetres();
        java.lang.Class<?> wildcardClass4 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.3937007874015748d) + "'", double4 == (-0.3937007874015748d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3937007874015748d + "'", double5 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.3937007874015748d, 15.500031000062002d);
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 610.237440947323d + "'", double3 == 610.237440947323d);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0L, (double) 1);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isInInches();
        double double6 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3937007874015748d + "'", double4 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 39.37007874015748d + "'", double6 == 39.37007874015748d);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (short) -1, 393700.7874015748d);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 393700.7874015748d + "'", double4 == 393700.7874015748d);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(206.4512d, 254.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(97.0d, 1.0d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 38.188976377952756d + "'", double4 == 38.188976377952756d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3818.8976377952754d + "'", double5 == 3818.8976377952754d);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(3500.0d, (-0.0254d));
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1377.9527559055118d + "'", double3 == 1377.9527559055118d);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) '#', (double) (byte) 100);
        double double3 = pixelDensity2.horizontalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3500.0d + "'", double3 == 3500.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 88.9d + "'", double4 == 88.9d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 'a', (double) 10L);
        double double3 = pixelDensity2.verticalDensityMetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.254d + "'", double5 == 0.254d);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) 100, (double) 10.0f);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((-0.0015500031000061998d), (double) ' ');
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((-15.500031000062002d), 0.0d);
        double double3 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.verticalDensityInches();
        boolean boolean5 = pixelDensity2.isInInches();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isInCentimetres();
        double double8 = pixelDensity2.getRawHorizontalDensity();
        double double9 = pixelDensity2.getRawVerticalDensity();
        double double10 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.3937007874015748d) + "'", double6 == (-0.3937007874015748d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (-1), (double) 1.0f);
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityMetres();
        boolean boolean4 = pixelDensity2.isInInches();
        double double5 = pixelDensity2.horizontalDensityMetres();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 0L, (double) (short) -1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.horizontalDensityInches();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        double double7 = pixelDensity2.verticalDensityMetres();
        boolean boolean8 = pixelDensity2.isInCentimetres();
        java.lang.Class<?> wildcardClass9 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.01d) + "'", double5 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.01d) + "'", double6 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        double double7 = pixelDensity2.verticalDensityInches();
        double double8 = pixelDensity2.horizontalDensityInches();
        boolean boolean9 = pixelDensity2.isInCentimetres();
        double double10 = pixelDensity2.horizontalDensityMetres();
        double double11 = pixelDensity2.horizontalDensityInches();
        double double12 = pixelDensity2.getRawVerticalDensity();
        double double13 = pixelDensity2.verticalDensityInches();
        java.lang.Class<?> wildcardClass14 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.3937007874015748d) + "'", double4 == (-0.3937007874015748d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3937007874015748d + "'", double5 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-39.37007874015748d) + "'", double10 == (-39.37007874015748d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (short) -1, (double) 0L);
        boolean boolean3 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityInches();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.horizontalDensityInches();
        double double6 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.54d + "'", double3 == 2.54d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.01d) + "'", double4 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.0254d) + "'", double5 == (-0.0254d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.0254d) + "'", double6 == (-0.0254d));
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(3200.0d, 1259.8425196850394d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        double double6 = pixelDensity2.verticalDensityMetres();
        double double7 = pixelDensity2.horizontalDensityInches();
        boolean boolean8 = pixelDensity2.isInCentimetres();
        double double9 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.01d) + "'", double5 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.0254d) + "'", double7 == (-0.0254d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.54d + "'", double9 == 2.54d);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 100.0f, 0.0d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        double double5 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 39.37007874015748d + "'", double3 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.8128d, (double) 0.0f);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (short) -1, 2.54d);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.verticalDensityInches();
        boolean boolean5 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.54d + "'", double3 == 2.54d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.06451599999999999d + "'", double4 == 0.06451599999999999d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, 0.0254d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) 100, (double) 10.0f);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.54d + "'", double4 == 2.54d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        double double7 = pixelDensity2.verticalDensityInches();
        double double8 = pixelDensity2.horizontalDensityInches();
        boolean boolean9 = pixelDensity2.isInCentimetres();
        double double10 = pixelDensity2.horizontalDensityMetres();
        double double11 = pixelDensity2.horizontalDensityInches();
        boolean boolean12 = pixelDensity2.isInCentimetres();
        boolean boolean13 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.3937007874015748d) + "'", double4 == (-0.3937007874015748d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3937007874015748d + "'", double5 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-39.37007874015748d) + "'", double10 == (-39.37007874015748d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(15.500031000062002d, (-0.15500031000062d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 100L);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(16.387064d, 0.15500031000062d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.451599999999999d + "'", double3 == 6.451599999999999d);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.006451600000000001d, (-0.3937007874015748d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 0, (double) (byte) 1);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        java.lang.Class<?> wildcardClass4 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(393700.7874015748d, (double) (byte) -1);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.5500031000062E7d + "'", double4 == 1.5500031000062E7d);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(100000.0d, 1259.8425196850394d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100000.0d + "'", double3 == 100000.0d);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(Double.NaN, 100000.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.0025399999999999997d, (double) '#');
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.5399999999999994E-5d + "'", double3 == 2.5399999999999994E-5d);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.009999999999999998d, (double) ' ');
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-0.0254d), (-0.15500031000062d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.verticalDensityMetres();
        double double6 = pixelDensity2.getRawVerticalDensity();
        boolean boolean7 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.35d, (double) 0L);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1.0d, 100.0d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 10L, 2047.244094488189d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityInches();
        double double5 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.1d + "'", double3 == 0.1d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.254d + "'", double5 == 0.254d);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 100L, (double) (short) 100);
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.verticalDensityMetres();
        boolean boolean5 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.54d + "'", double3 == 2.54d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10L, (-100.0d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(97.0d, 0.06102374409473228d);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(Double.POSITIVE_INFINITY, 393700.7874015748d);
        double double3 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(35.0d, (-1.0d));
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        double double5 = pixelDensity2.horizontalDensityInches();
        double double6 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(254.0d, (double) 100L);
        boolean boolean3 = pixelDensity2.isInInches();
        java.lang.Class<?> wildcardClass4 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (byte) 0, 1.0d);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.15500031000062d, (-3937.0078740157483d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 100, 393700.78740157484d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 393700.78740157484d + "'", double3 == 393700.78740157484d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0, 1.0d);
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 39.37007874015748d + "'", double3 == 39.37007874015748d);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(12.598425196850394d, 25.4d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean6 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.0d, 25.4d);
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.4d + "'", double4 == 25.4d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(393700.7874015748d, (double) (short) -1);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3937.007874015748d + "'", double3 == 3937.007874015748d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10000.0d + "'", double4 == 10000.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-1.0E-4d), 0.3937007874015748d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.getRawVerticalDensity();
        boolean boolean5 = pixelDensity2.isInMetres();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.horizontalDensityCentimetres();
        double double8 = pixelDensity2.horizontalDensityCentimetres();
        double double9 = pixelDensity2.getRawVerticalDensity();
        double double10 = pixelDensity2.horizontalDensityMetres();
        double double11 = pixelDensity2.verticalDensityInches();
        double double12 = pixelDensity2.getRawVerticalDensity();
        double double13 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 39.37007874015748d + "'", double7 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 39.37007874015748d + "'", double8 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3937.0078740157483d + "'", double10 == 3937.0078740157483d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(52.0d, 0.0d);
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) '4', (double) (byte) 10);
        double double3 = pixelDensity2.horizontalDensityMetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        double double6 = pixelDensity2.verticalDensityInches();
        double double7 = pixelDensity2.horizontalDensityMetres();
        double double8 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5200.0d + "'", double3 == 5200.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.4d + "'", double6 == 25.4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5200.0d + "'", double7 == 5200.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10L, (double) (byte) 10);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        boolean boolean6 = pixelDensity2.isUnitless();
        boolean boolean7 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(6.4516d, 0.32d);
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.32d + "'", double3 == 0.32d);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(15.500031000062002d, 610.237440947323d);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.verticalDensityMetres();
        double double6 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.500031000062002d + "'", double4 == 15.500031000062002d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 61023.74409473229d + "'", double5 == 61023.74409473229d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1550.0031000062002d + "'", double6 == 1550.0031000062002d);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) 100, (double) (short) 10);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) 0, (-39.37007874015748d));
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isInMetres();
        java.lang.Class<?> wildcardClass5 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(100.0d, Double.NaN);
        double double3 = pixelDensity2.verticalDensityInches();
        boolean boolean4 = pixelDensity2.isInInches();
        double double5 = pixelDensity2.verticalDensityInches();
        double double6 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1259.8425196850394d, 39.37007874015748d);
        double double3 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.15500031000062d, (double) 0L);
        double double3 = pixelDensity2.verticalDensityInches();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.15500031000062d + "'", double4 == 0.15500031000062d);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 'a', 10000.0d);
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.verticalDensityInches();
        double double6 = pixelDensity2.horizontalDensityMetres();
        double double7 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10000.0d + "'", double5 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3818.8976377952754d + "'", double6 == 3818.8976377952754d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10000.0d + "'", double7 == 10000.0d);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        java.lang.Class<?> wildcardClass7 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        double double7 = pixelDensity2.verticalDensityMetres();
        double double8 = pixelDensity2.verticalDensityMetres();
        boolean boolean9 = pixelDensity2.isInCentimetres();
        double double10 = pixelDensity2.verticalDensityCentimetres();
        double double11 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.3937007874015748d, 254.0d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        java.lang.Class<?> wildcardClass4 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.15500031000062d + "'", double3 == 0.15500031000062d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(97.0d, Double.POSITIVE_INFINITY);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 'a', 393700.7874015748d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.horizontalDensityInches();
        double double5 = pixelDensity2.verticalDensityInches();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 393700.7874015748d + "'", double3 == 393700.7874015748d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10L, 1.0d);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        boolean boolean5 = pixelDensity2.isInMetres();
        boolean boolean6 = pixelDensity2.isInInches();
        boolean boolean7 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.4d + "'", double4 == 25.4d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 0, (double) (byte) 10);
        boolean boolean3 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (short) -1, 393700.7874015748d);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.getRawVerticalDensity();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 393700.7874015748d + "'", double4 == 393700.7874015748d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3937.007874015748d + "'", double5 == 3937.007874015748d);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.06451599999999999d, 0.06102374409473228d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.06451599999999999d + "'", double3 == 0.06451599999999999d);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(2047.244094488189d, 393.7007874015748d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        java.lang.Class<?> wildcardClass4 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 393.7007874015748d + "'", double3 == 393.7007874015748d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(3937.0078740157483d, (double) (short) 1);
        double double3 = pixelDensity2.horizontalDensityInches();
        boolean boolean4 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3937.0078740157483d + "'", double3 == 3937.0078740157483d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(100.0d, (double) 100.0f);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.06451599999999999d, 0.97d);
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 38.188976377952756d + "'", double3 == 38.188976377952756d);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.003937007874015748d, (double) (-1L));
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (byte) 100, 0.0d);
        boolean boolean3 = pixelDensity2.isInInches();
        boolean boolean4 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(Double.POSITIVE_INFINITY, 10.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean8 = pixelDensity2.isUnitless();
        boolean boolean9 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.3937007874015748d) + "'", double4 == (-0.3937007874015748d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3937007874015748d + "'", double5 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3937007874015748d + "'", double7 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInInches();
        boolean boolean5 = pixelDensity2.isUnitless();
        double double6 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 39.37007874015748d + "'", double6 == 39.37007874015748d);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0L, (double) 1);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.verticalDensityMetres();
        boolean boolean7 = pixelDensity2.isUnitless();
        double double8 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3937007874015748d + "'", double5 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 39.37007874015748d + "'", double6 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean8 = pixelDensity2.isUnitless();
        double double9 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isInInches();
        boolean boolean5 = pixelDensity2.isInInches();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        double double8 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 1, 10000.0d);
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) '#', 35.0d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((-15.500031000062002d), 610.2374409473229d);
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-15.500031000062002d) + "'", double3 == (-15.500031000062002d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 610.2374409473229d + "'", double4 == 610.2374409473229d);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.0d, Double.NaN);
        boolean boolean3 = pixelDensity2.isInInches();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInMetres();
        boolean boolean6 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 'a', 10000.0d);
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.verticalDensityMetres();
        boolean boolean6 = pixelDensity2.isInInches();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 393700.7874015748d + "'", double5 == 393700.7874015748d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3937.0078740157483d + "'", double7 == 3937.0078740157483d);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 100.0f, 10.0d);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        boolean boolean5 = pixelDensity2.isInInches();
        double double6 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.54d + "'", double4 == 2.54d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(1000000.0d, Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.0038188976377952757d, 2047.244094488189d);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5200.0d + "'", double4 == 5200.0d);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((-0.003937007874015748d), 3200.0d);
        double double3 = pixelDensity2.horizontalDensityInches();
        java.lang.Class<?> wildcardClass4 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(1000000.0d, 610.237440947323d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        boolean boolean3 = pixelDensity2.isInInches();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.horizontalDensityMetres();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        double double7 = pixelDensity2.horizontalDensityCentimetres();
        double double8 = pixelDensity2.getRawHorizontalDensity();
        double double9 = pixelDensity2.verticalDensityMetres();
        java.lang.Class<?> wildcardClass10 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(5200.0d, 3937.007874015748d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(10.0d, 5200.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10L, 39.37007874015748d);
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3937.0078740157483d + "'", double3 == 3937.0078740157483d);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10L, (-61023.74409473229d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10L, 1.0d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) 1L);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityMetres();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(15.500031000062002d, (double) (byte) 100);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 1L, 520000.0d);
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.0d, 1000.0d);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(1550.0031000062002d, (-2.54E-4d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 1.0f, (double) 10.0f);
        double double3 = pixelDensity2.verticalDensityInches();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.254d + "'", double3 == 0.254d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.3937007874015748d, 350000.0d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 350000.0d + "'", double3 == 350000.0d);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.15500031000062d, 350000.0d);
        boolean boolean3 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((-1.0d), 0.0025399999999999997d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(3937.0078740157487d, 393700.78740157484d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 393700.78740157484d + "'", double3 == 393700.78740157484d);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
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
        java.lang.Class<?> wildcardClass15 = pixelDensity2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0L, (double) 1);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInInches();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(52.0d, 0.0d);
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((-2.54E-4d), 0.64516d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean5 = pixelDensity2.isUnitless();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        double double8 = pixelDensity2.getRawVerticalDensity();
        double double9 = pixelDensity2.getRawVerticalDensity();
        boolean boolean10 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.getRawVerticalDensity();
        boolean boolean5 = pixelDensity2.isInMetres();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.horizontalDensityCentimetres();
        double double8 = pixelDensity2.horizontalDensityCentimetres();
        double double9 = pixelDensity2.getRawVerticalDensity();
        double double10 = pixelDensity2.horizontalDensityMetres();
        double double11 = pixelDensity2.verticalDensityInches();
        double double12 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 39.37007874015748d + "'", double7 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 39.37007874015748d + "'", double8 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3937.0078740157483d + "'", double10 == 3937.0078740157483d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3937.0078740157483d + "'", double12 == 3937.0078740157483d);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 10, (double) ' ');
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.1d + "'", double5 == 0.1d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.3937007874015748d, (-61023.74409473229d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((-6.4516E-4d), 1259.8425196850394d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInMetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        double double7 = pixelDensity2.horizontalDensityMetres();
        double double8 = pixelDensity2.horizontalDensityMetres();
        double double9 = pixelDensity2.verticalDensityMetres();
        double double10 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isInInches();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 100.0f, 100.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(Double.POSITIVE_INFINITY, 0.0d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        java.lang.Class<?> wildcardClass4 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-0.0015500031000061998d), (double) '4');
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) '4', (-0.3937007874015748d));
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.horizontalDensityMetres();
        double double5 = pixelDensity2.verticalDensityMetres();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2047.244094488189d + "'", double4 == 2047.244094488189d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-15.500031000062002d) + "'", double5 == (-15.500031000062002d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(6.451599999999999d, 1377.9527559055118d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(100000.0d, 0.01d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.01d + "'", double3 == 0.01d);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.verticalDensityInches();
        boolean boolean5 = pixelDensity2.isInInches();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isInCentimetres();
        double double8 = pixelDensity2.getRawHorizontalDensity();
        double double9 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.3937007874015748d) + "'", double6 == (-0.3937007874015748d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) '#', (-0.0254d));
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0254d) + "'", double3 == (-0.0254d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.verticalDensityMetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isInMetres();
        double double8 = pixelDensity2.horizontalDensityInches();
        double double9 = pixelDensity2.verticalDensityCentimetres();
        double double10 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 39.37007874015748d + "'", double5 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3937007874015748d + "'", double6 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.3937007874015748d + "'", double9 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, 10000.0d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityMetres();
        boolean boolean5 = pixelDensity2.isInInches();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(1377.9527559055118d, 0.254d);
        double double3 = pixelDensity2.horizontalDensityInches();
        java.lang.Class<?> wildcardClass4 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3500.0d + "'", double3 == 3500.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(6.4516d, Double.NEGATIVE_INFINITY);
        double double3 = pixelDensity2.horizontalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        java.lang.Class<?> wildcardClass5 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 645.16d + "'", double3 == 645.16d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 16.387064d + "'", double4 == 16.387064d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 100L, (double) (byte) 1);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1259.8425196850394d, 393700.78740157484d);
        boolean boolean3 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(39.37007874015748d, (-39.37007874015748d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 100, (double) 1L);
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        boolean boolean5 = pixelDensity2.isInMetres();
        double double6 = pixelDensity2.horizontalDensityMetres();
        double double7 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0254d + "'", double7 == 0.0254d);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(1000.0d, 254.0d);
        boolean boolean3 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-15.500031000062002d), 1.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) (-1.0f));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-155000.31000062003d), 3937.0078740157487d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0.0f, 25400.0d);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1000000.0d + "'", double3 == 1000000.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10000.0d + "'", double4 == 10000.0d);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) '#', (double) 10L);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.35d + "'", double3 == 0.35d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.35d + "'", double4 == 0.35d);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isUnitless();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isInCentimetres();
        double double8 = pixelDensity2.horizontalDensityMetres();
        java.lang.Class<?> wildcardClass9 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.0d, 0.006451600000000001d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.4516E-5d + "'", double3 == 6.4516E-5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, 0.003937007874015748d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityInches();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.54d + "'", double3 == 2.54d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.01d) + "'", double4 == (-0.01d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.54d + "'", double6 == 2.54d);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10L, (double) (byte) 10);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        double double5 = pixelDensity2.getRawVerticalDensity();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        double double7 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1000.0d + "'", double3 == 1000.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1000.0d + "'", double7 == 1000.0d);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.verticalDensityInches();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((-6.4516E-4d), 0.64516d);
        double double3 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.4516E-4d) + "'", double3 == (-6.4516E-4d));
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(610.2374409473229d, (double) 100.0f);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(100.0d, Double.NaN);
        double double3 = pixelDensity2.verticalDensityInches();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean6 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(35.0d, (-0.15500031000062d));
        double double3 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.15500031000062d) + "'", double3 == (-0.15500031000062d));
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isUnitless();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        double double7 = pixelDensity2.verticalDensityInches();
        double double8 = pixelDensity2.verticalDensityMetres();
        double double9 = pixelDensity2.verticalDensityMetres();
        double double10 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-39.37007874015748d), 254.0d);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        boolean boolean5 = pixelDensity2.isUnitless();
        java.lang.Class<?> wildcardClass6 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 25400.0d + "'", double3 == 25400.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 254.0d + "'", double4 == 254.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1.0d, (double) 0L);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.horizontalDensityMetres();
        double double7 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean8 = pixelDensity2.isInCentimetres();
        double double9 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
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
        double double14 = pixelDensity2.getRawVerticalDensity();
        double double15 = pixelDensity2.verticalDensityCentimetres();
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.POSITIVE_INFINITY + "'", double15 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 1, 0.3937007874015748d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityInches();
        boolean boolean5 = pixelDensity2.isInInches();
        boolean boolean6 = pixelDensity2.isInMetres();
        boolean boolean7 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (byte) 1, 0.0d);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.verticalDensityMetres();
        java.lang.Class<?> wildcardClass5 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(1000000.0d, (double) 100.0f);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        boolean boolean3 = pixelDensity2.isInInches();
        boolean boolean4 = pixelDensity2.isInMetres();
        boolean boolean5 = pixelDensity2.isUnitless();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        double double7 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 39.37007874015748d + "'", double6 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(6102374.409473228d, 3.937007874015748d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.15500031000062d, (-0.3937007874015748d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 100L, (double) (short) 1);
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.horizontalDensityInches();
        double double5 = pixelDensity2.getRawVerticalDensity();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 254.0d + "'", double3 == 254.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 254.0d + "'", double4 == 254.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.getRawVerticalDensity();
        boolean boolean5 = pixelDensity2.isInMetres();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean8 = pixelDensity2.isInInches();
        double double9 = pixelDensity2.getRawHorizontalDensity();
        double double10 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3937.0078740157483d + "'", double10 == 3937.0078740157483d);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(393700.78740157484d, 0.0d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 393700.78740157484d + "'", double3 == 393700.78740157484d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (byte) 100, (double) (short) -1);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityInches();
        double double5 = pixelDensity2.verticalDensityMetres();
        double double6 = pixelDensity2.getRawVerticalDensity();
        double double7 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.3937007874015748d) + "'", double3 == (-0.3937007874015748d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-39.37007874015748d) + "'", double5 == (-39.37007874015748d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3937.0078740157483d + "'", double7 == 3937.0078740157483d);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(2.54E-4d, 0.0d);
        double double3 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.0025399999999999997d, 64516.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.getRawVerticalDensity();
        boolean boolean8 = pixelDensity2.isInInches();
        boolean boolean9 = pixelDensity2.isUnitless();
        boolean boolean10 = pixelDensity2.isUnitless();
        double double11 = pixelDensity2.horizontalDensityMetres();
        double double12 = pixelDensity2.horizontalDensityInches();
        double double13 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.38188976377952755d, 610.2374409473229d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 610.2374409473229d + "'", double3 == 610.2374409473229d);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((-155000.31000062003d), 61023.74409473229d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(1.5500031000062002E7d, 32.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.254d, 10000.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(645.16d, (-0.15500031000062d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((-61023.74409473229d), 10000.000000000002d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (byte) -1, (double) (short) 100);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (byte) 10, (-0.3937007874015748d));
        double double3 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.3937007874015748d) + "'", double3 == (-0.3937007874015748d));
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.016387064000000003d, 610.237440947323d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean5 = pixelDensity2.isUnitless();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        double double7 = pixelDensity2.getRawVerticalDensity();
        double double8 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean9 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, 610.237440947323d);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInMetres();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        double double7 = pixelDensity2.getRawVerticalDensity();
        double double8 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean6 = pixelDensity2.isInInches();
        double double7 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3937007874015748d + "'", double4 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        double double7 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((-39.37007874015748d), 0.0025399999999999997d);
        double double3 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 100, 2.54d);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0254d + "'", double4 == 0.0254d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(100.0d, 6.102374409473229d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInMetres();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.01d) + "'", double7 == (-0.01d));
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(2047.244094488189d, (double) (short) 10);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        double double6 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-15.500031000062002d), 0.003937007874015748d);
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-15.500031000062002d) + "'", double4 == (-15.500031000062002d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.003937007874015748d + "'", double5 == 0.003937007874015748d);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityInches();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.01d) + "'", double4 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.54d + "'", double5 == 2.54d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        boolean boolean3 = pixelDensity2.isInMetres();
        java.lang.Class<?> wildcardClass4 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.horizontalDensityInches();
        double double8 = pixelDensity2.getRawVerticalDensity();
        double double9 = pixelDensity2.verticalDensityCentimetres();
        double double10 = pixelDensity2.horizontalDensityMetres();
        double double11 = pixelDensity2.horizontalDensityCentimetres();
        double double12 = pixelDensity2.getRawHorizontalDensity();
        double double13 = pixelDensity2.horizontalDensityCentimetres();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityInches();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        double double7 = pixelDensity2.horizontalDensityMetres();
        double double8 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean9 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(99.99999999999999d, (double) (short) 1);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.97d, 3937.0078740157483d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        double double3 = pixelDensity2.verticalDensityMetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        boolean boolean5 = pixelDensity2.isInMetres();
        double double6 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 39.37007874015748d + "'", double3 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 39.37007874015748d + "'", double6 == 39.37007874015748d);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean5 = pixelDensity2.isUnitless();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        double double7 = pixelDensity2.getRawVerticalDensity();
        boolean boolean8 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-39.37007874015748d), 2.54d);
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.0d, (-0.3937007874015748d));
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.horizontalDensityMetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        boolean boolean6 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.3937007874015748d) + "'", double5 == (-0.3937007874015748d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (short) 100, 3500.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        boolean boolean5 = pixelDensity2.isUnitless();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 39.37007874015748d + "'", double3 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1, 0.06102374409473228d);
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0.0f, 25400.0d);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        double double5 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1000000.0d + "'", double3 == 1000000.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 100.0f, 320000.0d);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(1259.8425196850394d, 100.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((-0.003937007874015748d), 32.0d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.003937007874015748d) + "'", double3 == (-0.003937007874015748d));
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean5 = pixelDensity2.isUnitless();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean8 = pixelDensity2.isUnitless();
        double double9 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 100L, (double) (byte) 1);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(35.0d, 0.8128d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 0L, 0.016387064000000003d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((-1.0d), 0.8128d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(3500.0d, 8128.0d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8128.0d + "'", double3 == 8128.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1.0f), 3937.0078740157483d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        double double6 = pixelDensity2.verticalDensityInches();
        boolean boolean7 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3937.0078740157483d + "'", double3 == 3937.0078740157483d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1550.0031000062002d + "'", double4 == 1550.0031000062002d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3937.0078740157483d + "'", double6 == 3937.0078740157483d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) '#', (double) (byte) 100);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 88.9d + "'", double4 == 88.9d);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.0d, (double) 0.0f);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityMetres();
        double double5 = pixelDensity2.horizontalDensityInches();
        double double6 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(2.4638d, (double) 0L);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-0.003937007874015748d), (double) (short) -1);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 0, Double.NEGATIVE_INFINITY);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(100.0d, 100.0d);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.horizontalDensityMetres();
        boolean boolean6 = pixelDensity2.isUnitless();
        double double7 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(Double.POSITIVE_INFINITY, 3818.8976377952754d);
        double double3 = pixelDensity2.verticalDensityInches();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(320000.0d, 0.06451599999999999d);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean5 = pixelDensity2.isUnitless();
        boolean boolean6 = pixelDensity2.isUnitless();
        java.lang.Class<?> wildcardClass7 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        double double3 = pixelDensity2.verticalDensityMetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        boolean boolean5 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 39.37007874015748d + "'", double3 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(15.500031000062002d, (double) 100.0f);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((-0.3937007874015748d), (-155000.31000062003d));
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-61023.74409473229d) + "'", double3 == (-61023.74409473229d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-15.500031000062002d) + "'", double5 == (-15.500031000062002d));
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(39.37007874015748d, 6.102374409473229d);
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (byte) 100, 35.0d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) (byte) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.horizontalDensityMetres();
        boolean boolean6 = pixelDensity2.isInInches();
        boolean boolean7 = pixelDensity2.isInCentimetres();
        double double8 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(1000.0d, 3200.0d);
        double double3 = pixelDensity2.verticalDensityInches();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8128.0d + "'", double3 == 8128.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        double double7 = pixelDensity2.verticalDensityInches();
        double double8 = pixelDensity2.horizontalDensityInches();
        boolean boolean9 = pixelDensity2.isInCentimetres();
        double double10 = pixelDensity2.verticalDensityMetres();
        double double11 = pixelDensity2.getRawVerticalDensity();
        boolean boolean12 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.3937007874015748d) + "'", double4 == (-0.3937007874015748d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3937007874015748d + "'", double5 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 39.37007874015748d + "'", double10 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInInches();
        boolean boolean6 = pixelDensity2.isInInches();
        double double7 = pixelDensity2.getRawVerticalDensity();
        boolean boolean8 = pixelDensity2.isInInches();
        double double9 = pixelDensity2.horizontalDensityMetres();
        double double10 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.54d + "'", double10 == 2.54d);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.0d, (double) 100L);
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(1000.0d, 3200.0d);
        boolean boolean3 = pixelDensity2.isInMetres();
        boolean boolean4 = pixelDensity2.isInInches();
        boolean boolean5 = pixelDensity2.isUnitless();
        double double6 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3200.0d + "'", double6 == 3200.0d);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (short) 10, 0.15500031000062d);
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3937007874015748d + "'", double4 == 0.3937007874015748d);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.0025399999999999997d, 0.025399999999999995d);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9999999999999998d + "'", double3 == 0.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0025399999999999997d + "'", double4 == 0.0025399999999999997d);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.254d, (double) 1L);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.254d + "'", double4 == 0.254d);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) ' ', (double) (-1.0f));
        double double3 = pixelDensity2.verticalDensityInches();
        double double4 = pixelDensity2.getRawVerticalDensity();
        double double5 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.54d) + "'", double3 == (-2.54d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3200.0d + "'", double5 == 3200.0d);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (byte) 10, 254.0d);
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(393700.78740157484d, 32.0d);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.5500031000062002E7d + "'", double4 == 1.5500031000062002E7d);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 1L, Double.POSITIVE_INFINITY);
        double double3 = pixelDensity2.verticalDensityInches();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((-1.0E-4d), Double.POSITIVE_INFINITY);
        boolean boolean3 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (short) 0, (-6.4516E-4d));
        boolean boolean3 = pixelDensity2.isInMetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-6.4516E-6d) + "'", double5 == (-6.4516E-6d));
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 'a', 350000.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 100, (double) 1L);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(3937.0078740157487d, (double) 10.0f);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.8128d, 0.1d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(2.54E-4d, 3937.007874015748d);
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 100, 393700.78740157484d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 393700.78740157484d + "'", double3 == 393700.78740157484d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(35.0d, (double) '4');
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityMetres();
        double double5 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(10000.0d, (double) 10);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.verticalDensityMetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isInMetres();
        double double8 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 39.37007874015748d + "'", double5 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3937007874015748d + "'", double6 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        double double6 = pixelDensity2.getRawVerticalDensity();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        double double8 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.01d) + "'", double5 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10L, (double) (byte) 10);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isInCentimetres();
        java.lang.Class<?> wildcardClass8 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1000.0d + "'", double3 == 1000.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1000.0d + "'", double4 == 1000.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) '#', 0.0d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.38188976377952755d, 0.06451599999999999d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (short) -1, (double) 0L);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.getRawVerticalDensity();
        java.lang.Class<?> wildcardClass5 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.verticalDensityInches();
        double double5 = pixelDensity2.verticalDensityInches();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.horizontalDensityCentimetres();
        double double8 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.3937007874015748d) + "'", double7 == (-0.3937007874015748d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isInInches();
        double double5 = pixelDensity2.horizontalDensityMetres();
        boolean boolean6 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-39.37007874015748d) + "'", double5 == (-39.37007874015748d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.01d, (-0.01d));
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.01d) + "'", double3 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0E-4d) + "'", double4 == (-1.0E-4d));
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(1.5500031000062002E7d, 81.28d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 81.28d + "'", double3 == 81.28d);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(8128.0d, (double) (byte) 100);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0L, (double) 1);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((-2.54E-4d), 155000.31000062003d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (short) 100, (-0.003937007874015748d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 10, (double) 100L);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.0038188976377952757d, 0.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 1.0f, 3818.8976377952754d);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 150350.3007006014d + "'", double3 == 150350.3007006014d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 150350.3007006014d + "'", double4 == 150350.3007006014d);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((-0.0016387064d), 3937.0078740157487d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) 0L);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) ' ', (double) (-1.0f));
        double double3 = pixelDensity2.horizontalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3200.0d + "'", double3 == 3200.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3200.0d + "'", double4 == 3200.0d);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 0, (double) (byte) 1);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3937007874015748d + "'", double5 == 0.3937007874015748d);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        double double7 = pixelDensity2.verticalDensityMetres();
        double double8 = pixelDensity2.verticalDensityMetres();
        double double9 = pixelDensity2.getRawHorizontalDensity();
        double double10 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1.0d, 35.0d);
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.verticalDensityInches();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        boolean boolean7 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(3500.0d, (-0.0254d));
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.getRawVerticalDensity();
        boolean boolean5 = pixelDensity2.isInMetres();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean8 = pixelDensity2.isInInches();
        double double9 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean10 = pixelDensity2.isUnitless();
        double double11 = pixelDensity2.getRawVerticalDensity();
        double double12 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 39.37007874015748d + "'", double9 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(10.0d, (double) 1);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(3937.0078740157483d, (double) 100L);
        boolean boolean3 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1.0d, 35.0d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 0.0f, 204724.4094488189d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(10000.0d, (double) 10.0f);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(64516.0d, 645.16d);
        boolean boolean3 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(204724.4094488189d, (-39.37007874015748d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0L, (double) 1);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean6 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3937007874015748d + "'", double5 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.15500031000062d, (double) 100.0f);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.06102374409473228d + "'", double4 == 0.06102374409473228d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.15500031000062d + "'", double5 == 0.15500031000062d);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(3818.8976377952754d, (-0.003937007874015748d));
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        double double6 = pixelDensity2.horizontalDensityInches();
        double double7 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isUnitless();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isInCentimetres();
        double double8 = pixelDensity2.horizontalDensityMetres();
        double double9 = pixelDensity2.verticalDensityCentimetres();
        java.lang.Class<?> wildcardClass10 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(25.4d, (-2.54d));
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) 100, (-0.15500031000062d));
        double double3 = pixelDensity2.horizontalDensityMetres();
        double double4 = pixelDensity2.verticalDensityInches();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean6 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.003937007874015748d) + "'", double4 == (-0.003937007874015748d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.0015500031000062d) + "'", double5 == (-0.0015500031000062d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 'a', 10000.0d);
        boolean boolean3 = pixelDensity2.isInMetres();
        boolean boolean4 = pixelDensity2.isInInches();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        double double6 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3818.8976377952754d + "'", double6 == 3818.8976377952754d);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.0d, 25.4d);
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10L, 1.0d);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.horizontalDensityMetres();
        boolean boolean5 = pixelDensity2.isInInches();
        double double6 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1000.0d + "'", double4 == 1000.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1000.0d + "'", double6 == 1000.0d);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.3937007874015748d, 15.500031000062002d);
        double double3 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.500031000062002d + "'", double3 == 15.500031000062002d);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 100L, (double) (byte) 1);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        double double6 = pixelDensity2.horizontalDensityInches();
        boolean boolean7 = pixelDensity2.isInCentimetres();
        double double8 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(3937.0078740157483d, (-0.0254d));
        double double3 = pixelDensity2.horizontalDensityInches();
        boolean boolean4 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10000.0d + "'", double3 == 10000.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.0d, 0.3937007874015748d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.003937007874015748d + "'", double3 == 0.003937007874015748d);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) -1, 6.102374409473229d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(16.387064d, (-0.15500031000062d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(6.451599999999999d, (double) 10L);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 100, 2.54d);
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.54d + "'", double4 == 2.54d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }
}

