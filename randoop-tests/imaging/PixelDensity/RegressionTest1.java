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
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 1.0f, (double) (byte) 1);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(3937.0078740157483d, (double) 1L);
        double double3 = pixelDensity2.verticalDensityMetres();
        java.lang.Class<?> wildcardClass4 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(100000.0d, 206.4512d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 'a', 10000.0d);
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.verticalDensityInches();
        double double6 = pixelDensity2.horizontalDensityMetres();
        boolean boolean7 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10000.0d + "'", double5 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3818.8976377952754d + "'", double6 == 3818.8976377952754d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        double double6 = pixelDensity2.verticalDensityMetres();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        double double8 = pixelDensity2.horizontalDensityMetres();
        boolean boolean9 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.01d) + "'", double5 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInInches();
        double double6 = pixelDensity2.verticalDensityMetres();
        double double7 = pixelDensity2.verticalDensityMetres();
        boolean boolean8 = pixelDensity2.isInCentimetres();
        double double9 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(1000.0d, 3200.0d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1000.0d + "'", double3 == 1000.0d);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(1000000.0d, (double) (short) 10);
        boolean boolean3 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.getRawVerticalDensity();
        double double8 = pixelDensity2.verticalDensityMetres();
        boolean boolean9 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(32.0d, 393700.78740157484d);
        double double3 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInMetres();
        double double6 = pixelDensity2.horizontalDensityInches();
        boolean boolean7 = pixelDensity2.isInInches();
        double double8 = pixelDensity2.verticalDensityInches();
        double double9 = pixelDensity2.horizontalDensityMetres();
        double double10 = pixelDensity2.verticalDensityMetres();
        boolean boolean11 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.0254d) + "'", double6 == (-0.0254d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.54d + "'", double8 == 2.54d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 0L, (double) (short) 100);
        double double3 = pixelDensity2.horizontalDensityMetres();
        java.lang.Class<?> wildcardClass4 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isUnitless();
        boolean boolean8 = pixelDensity2.isUnitless();
        double double9 = pixelDensity2.getRawHorizontalDensity();
        double double10 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.0d, (-0.3937007874015748d));
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isUnitless();
        boolean boolean8 = pixelDensity2.isUnitless();
        boolean boolean9 = pixelDensity2.isInMetres();
        double double10 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) (byte) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isUnitless();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        double double7 = pixelDensity2.verticalDensityMetres();
        java.lang.Class<?> wildcardClass8 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.15500031000062d, 25.4d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(35.0d, (-0.3937007874015748d));
        double double3 = pixelDensity2.horizontalDensityInches();
        boolean boolean4 = pixelDensity2.isInInches();
        java.lang.Class<?> wildcardClass5 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((-0.0254d), Double.POSITIVE_INFINITY);
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 100.0f, 0.0d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInMetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        double double8 = pixelDensity2.horizontalDensityMetres();
        java.lang.Class<?> wildcardClass9 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(39.37007874015748d, (double) (-1L));
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean6 = pixelDensity2.isUnitless();
        double double7 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 39.37007874015748d + "'", double4 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 39.37007874015748d + "'", double5 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean5 = pixelDensity2.isUnitless();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        double double8 = pixelDensity2.verticalDensityInches();
        double double9 = pixelDensity2.verticalDensityMetres();
        boolean boolean10 = pixelDensity2.isInInches();
        double double11 = pixelDensity2.getRawHorizontalDensity();
        double double12 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(254.0d, (double) (-1));
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        java.lang.Class<?> wildcardClass5 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (byte) 0, 1.0d);
        double double3 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.54d + "'", double3 == 2.54d);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.verticalDensityMetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        java.lang.Class<?> wildcardClass6 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        double double7 = pixelDensity2.horizontalDensityMetres();
        double double8 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean9 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.01d) + "'", double6 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(15.500031000062002d, Double.NaN);
        double double3 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        double double7 = pixelDensity2.verticalDensityInches();
        double double8 = pixelDensity2.horizontalDensityCentimetres();
        double double9 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.3937007874015748d) + "'", double4 == (-0.3937007874015748d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3937007874015748d + "'", double5 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.3937007874015748d) + "'", double8 == (-0.3937007874015748d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 39.37007874015748d + "'", double9 == 39.37007874015748d);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.15500031000062d, 0.0d);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 1, (double) (byte) 10);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityMetres();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        double double6 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInInches();
        double double6 = pixelDensity2.verticalDensityMetres();
        double double7 = pixelDensity2.getRawVerticalDensity();
        boolean boolean8 = pixelDensity2.isUnitless();
        double double9 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 1, (double) '#');
        boolean boolean3 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(1.0d, 393700.7874015748d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 100.0f, (double) (byte) 0);
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(32.0d, 0.15500031000062d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.06102374409473228d + "'", double3 == 0.06102374409473228d);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(8128.0d, (-100.0d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (short) -1, (double) 0L);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 0L, (double) (short) -1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.horizontalDensityInches();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        double double7 = pixelDensity2.verticalDensityInches();
        boolean boolean8 = pixelDensity2.isUnitless();
        double double9 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.01d) + "'", double5 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.01d) + "'", double6 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.0254d) + "'", double7 == (-0.0254d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (short) 100, 97.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (byte) 10, (-100.0d));
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-100.0d) + "'", double4 == (-100.0d));
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 1L, 520000.0d);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) '#', (double) 1);
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (short) 0, (-1.0d));
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.NEGATIVE_INFINITY + "'", double5 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.0d, 0.0d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 0, (double) (short) 100);
        boolean boolean3 = pixelDensity2.isInMetres();
        boolean boolean4 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 10, (double) ' ');
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8128d + "'", double4 == 0.8128d);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(393700.78740157484d, (double) 10);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1.0d, (double) 0L);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) '#', 0.06451599999999999d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-15.500031000062002d), 0.003937007874015748d);
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((-0.3937007874015748d), (double) (short) 100);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (short) 10, (-0.0254d));
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1d + "'", double4 == 0.1d);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (short) -1, 393700.7874015748d);
        double double3 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (byte) 10, (-100.0d));
        double double3 = pixelDensity2.verticalDensityMetres();
        boolean boolean4 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3937.0078740157483d) + "'", double3 == (-3937.0078740157483d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10L, (double) (byte) 10);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.4d + "'", double6 == 25.4d);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityMetres();
        boolean boolean4 = pixelDensity2.isInInches();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        double double6 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 'a', 393700.7874015748d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.horizontalDensityInches();
        boolean boolean5 = pixelDensity2.isUnitless();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 393700.7874015748d + "'", double3 == 393700.7874015748d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.0d, 3937.0078740157483d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityInches();
        java.lang.Class<?> wildcardClass5 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(320000.0d, (double) (byte) -1);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 10, (double) ' ');
        boolean boolean3 = pixelDensity2.isInMetres();
        boolean boolean4 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean5 = pixelDensity2.isUnitless();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        double double8 = pixelDensity2.verticalDensityInches();
        boolean boolean9 = pixelDensity2.isUnitless();
        boolean boolean10 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.38188976377952755d, 100.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) ' ', (-39.37007874015748d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityInches();
        boolean boolean6 = pixelDensity2.isUnitless();
        double double7 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.0d, (double) 10.0f);
        double double3 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (byte) 1, (double) '#');
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (short) 10, 0.15500031000062d);
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.15500031000062d + "'", double4 == 0.15500031000062d);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isInInches();
        boolean boolean6 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(254.0d, 520000.0d);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 520000.0d + "'", double4 == 520000.0d);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInInches();
        boolean boolean6 = pixelDensity2.isInInches();
        double double7 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean8 = pixelDensity2.isUnitless();
        double double9 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean10 = pixelDensity2.isInMetres();
        double double11 = pixelDensity2.verticalDensityInches();
        boolean boolean12 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.01d) + "'", double7 == (-0.01d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.54d + "'", double11 == 2.54d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(10.0d, 1.5500031000062002E7d);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 100.0f, 0.97d);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0L, (double) 1);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3937007874015748d + "'", double4 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 39.37007874015748d + "'", double5 == 39.37007874015748d);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isInInches();
        double double5 = pixelDensity2.horizontalDensityMetres();
        boolean boolean6 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-39.37007874015748d) + "'", double5 == (-39.37007874015748d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        boolean boolean3 = pixelDensity2.isInInches();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.horizontalDensityMetres();
        boolean boolean6 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) (byte) 10);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) (byte) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isUnitless();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInInches();
        boolean boolean6 = pixelDensity2.isInInches();
        double double7 = pixelDensity2.getRawVerticalDensity();
        boolean boolean8 = pixelDensity2.isInInches();
        double double9 = pixelDensity2.getRawVerticalDensity();
        boolean boolean10 = pixelDensity2.isUnitless();
        boolean boolean11 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.0d, (double) (-1.0f));
        double double3 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0254d) + "'", double3 == (-0.0254d));
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(6.102374409473229d, 1259.8425196850394d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (byte) 10, 0.0d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.97d, 10000.0d);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 0, (double) (short) 100);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.verticalDensityMetres();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 39.37007874015748d + "'", double5 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 39.37007874015748d + "'", double6 == 39.37007874015748d);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(25400.0d, (-0.01d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (-1L), (double) 1.0f);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10.0f, (double) (byte) 100);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.0d, 3937.0078740157483d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.0d, (-0.3937007874015748d));
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.horizontalDensityMetres();
        java.lang.Class<?> wildcardClass5 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(3937.0078740157483d, (double) (byte) 100);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 10.0f, (double) (-1.0f));
        double double3 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 0L, (double) (short) 100);
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.verticalDensityMetres();
        double double6 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, 10000.0d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityMetres();
        boolean boolean5 = pixelDensity2.isInInches();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isInMetres();
        double double8 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(10.0d, 1.0d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInInches();
        boolean boolean5 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.getRawVerticalDensity();
        boolean boolean5 = pixelDensity2.isInMetres();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean8 = pixelDensity2.isInMetres();
        java.lang.Class<?> wildcardClass9 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 39.37007874015748d + "'", double7 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(254.0d, Double.NEGATIVE_INFINITY);
        boolean boolean3 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.getRawVerticalDensity();
        boolean boolean5 = pixelDensity2.isInMetres();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.horizontalDensityCentimetres();
        double double8 = pixelDensity2.horizontalDensityCentimetres();
        double double9 = pixelDensity2.horizontalDensityMetres();
        double double10 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 39.37007874015748d + "'", double7 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 39.37007874015748d + "'", double8 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3937.0078740157483d + "'", double9 == 3937.0078740157483d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 39.37007874015748d + "'", double10 == 39.37007874015748d);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(32.0d, 35.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1.5500031000062002E7d, 100000.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        double double7 = pixelDensity2.horizontalDensityInches();
        boolean boolean8 = pixelDensity2.isUnitless();
        double double9 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.0d, 1000000.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((-100.0d), (double) (short) -1);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        java.lang.Class<?> wildcardClass4 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-39.37007874015748d) + "'", double3 == (-39.37007874015748d));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(15.500031000062002d, (-39.37007874015748d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(25400.0d, 0.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(6.4516d, Double.NEGATIVE_INFINITY);
        double double3 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 16.387064d + "'", double3 == 16.387064d);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.horizontalDensityInches();
        double double8 = pixelDensity2.getRawVerticalDensity();
        double double9 = pixelDensity2.verticalDensityCentimetres();
        double double10 = pixelDensity2.horizontalDensityCentimetres();
        double double11 = pixelDensity2.getRawVerticalDensity();
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
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(35.0d, (double) 1);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) 100, (double) 10.0f);
        boolean boolean3 = pixelDensity2.isInMetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (byte) 100, (double) (short) -1);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.horizontalDensityInches();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInInches();
        boolean boolean6 = pixelDensity2.isInInches();
        double double7 = pixelDensity2.horizontalDensityCentimetres();
        double double8 = pixelDensity2.getRawVerticalDensity();
        double double9 = pixelDensity2.verticalDensityInches();
        double double10 = pixelDensity2.verticalDensityCentimetres();
        double double11 = pixelDensity2.verticalDensityInches();
        double double12 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.01d) + "'", double7 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.54d + "'", double9 == 2.54d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.54d + "'", double11 == 2.54d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (byte) 10, (double) 100L);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.3937007874015748d, (double) 0.0f);
        double double3 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(10.0d, 1.5500031000062002E7d);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (byte) 100, (-1.0d));
        boolean boolean3 = pixelDensity2.isInMetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.verticalDensityInches();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.NEGATIVE_INFINITY + "'", double5 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.97d, (double) (byte) 0);
        double double3 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (byte) 10, 6.4516d);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-15.500031000062002d), 97.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 0L, (double) (short) -1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.horizontalDensityInches();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.verticalDensityMetres();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.01d) + "'", double5 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        double double7 = pixelDensity2.verticalDensityInches();
        double double8 = pixelDensity2.horizontalDensityInches();
        double double9 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.54d + "'", double7 == 2.54d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.0254d) + "'", double8 == (-0.0254d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((-155000.31000062003d), (-2.54d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(25400.0d, 52.0d);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityInches();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.verticalDensityMetres();
        double double7 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.54d + "'", double3 == 2.54d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.01d) + "'", double4 == (-0.01d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.0254d) + "'", double7 == (-0.0254d));
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isUnitless();
        boolean boolean8 = pixelDensity2.isUnitless();
        double double9 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean10 = pixelDensity2.isInMetres();
        double double11 = pixelDensity2.horizontalDensityMetres();
        double double12 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(2047.244094488189d, 10000.0d);
        boolean boolean3 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((-0.0254d), 39.37007874015748d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(39.37007874015748d, (double) (-1L));
        double double3 = pixelDensity2.verticalDensityMetres();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3 == (-100.0d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (short) -1, 2.54d);
        double double3 = pixelDensity2.verticalDensityMetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.54d + "'", double3 == 2.54d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 0.0f, 2.54d);
        double double3 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.06451599999999999d + "'", double3 == 0.06451599999999999d);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(15.500031000062002d, 393700.78740157484d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.500031000062002d + "'", double3 == 15.500031000062002d);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.32d, 39.37007874015748d);
        double double3 = pixelDensity2.verticalDensityInches();
        double double4 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        double double7 = pixelDensity2.horizontalDensityMetres();
        double double8 = pixelDensity2.getRawHorizontalDensity();
        double double9 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.01d) + "'", double6 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.01d) + "'", double9 == (-0.01d));
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.getRawVerticalDensity();
        double double5 = pixelDensity2.verticalDensityInches();
        double double6 = pixelDensity2.horizontalDensityMetres();
        double double7 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3937.0078740157483d + "'", double6 == 3937.0078740157483d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-1.0d), 81.28d);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        boolean boolean3 = pixelDensity2.isInInches();
        boolean boolean4 = pixelDensity2.isInMetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (byte) 100, (double) 'a');
        double double3 = pixelDensity2.verticalDensityMetres();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3818.8976377952754d + "'", double3 == 3818.8976377952754d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((-0.0254d), 0.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) (byte) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        double double6 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(1000000.0d, 0.15500031000062d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1.0d, (double) 0L);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (-1L), 0.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.verticalDensityInches();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        double double7 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.3937007874015748d) + "'", double6 == (-0.3937007874015748d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isInInches();
        boolean boolean5 = pixelDensity2.isInInches();
        boolean boolean6 = pixelDensity2.isInMetres();
        java.lang.Class<?> wildcardClass7 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.horizontalDensityInches();
        double double8 = pixelDensity2.getRawVerticalDensity();
        double double9 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean10 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 0L, (double) (short) 100);
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        java.lang.Class<?> wildcardClass5 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(3818.8976377952754d, (-0.15500031000062d));
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isUnitless();
        boolean boolean8 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(3937.0078740157483d, (double) (short) 1);
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3937.0078740157483d + "'", double4 == 3937.0078740157483d);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 0L, (double) (short) 100);
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.verticalDensityInches();
        double double6 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.54d + "'", double5 == 2.54d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInInches();
        double double5 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0L, (double) 1);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.verticalDensityMetres();
        double double6 = pixelDensity2.verticalDensityMetres();
        java.lang.Class<?> wildcardClass7 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 39.37007874015748d + "'", double5 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 39.37007874015748d + "'", double6 == 39.37007874015748d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (byte) 10, (double) (byte) 1);
        double double3 = pixelDensity2.getRawVerticalDensity();
        java.lang.Class<?> wildcardClass4 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
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
        double double12 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean13 = pixelDensity2.isUnitless();
        double double14 = pixelDensity2.horizontalDensityMetres();
        boolean boolean15 = pixelDensity2.isInMetres();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.0d, 3818.8976377952754d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 100, 97.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        double double7 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (byte) 100, (-1.0d));
        boolean boolean3 = pixelDensity2.isInMetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.verticalDensityInches();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.NEGATIVE_INFINITY + "'", double5 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) 1L);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInMetres();
        boolean boolean5 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(3200.0d, (-100.0d));
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 'a', 10000.0d);
        boolean boolean3 = pixelDensity2.isUnitless();
        java.lang.Class<?> wildcardClass4 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        double double7 = pixelDensity2.verticalDensityInches();
        double double8 = pixelDensity2.horizontalDensityCentimetres();
        double double9 = pixelDensity2.horizontalDensityInches();
        double double10 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.3937007874015748d) + "'", double4 == (-0.3937007874015748d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3937007874015748d + "'", double5 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.3937007874015748d) + "'", double8 == (-0.3937007874015748d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 100.0f, 10.0d);
        double double3 = pixelDensity2.verticalDensityMetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(393700.7874015748d, 1550.0031000062002d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) (byte) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        double double6 = pixelDensity2.getRawVerticalDensity();
        boolean boolean7 = pixelDensity2.isUnitless();
        double double8 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
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
        boolean boolean13 = pixelDensity2.isUnitless();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.38188976377952755d, 97.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(2.54d, 10.0d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.54d + "'", double3 == 2.54d);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        boolean boolean5 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        double double6 = pixelDensity2.verticalDensityMetres();
        double double7 = pixelDensity2.horizontalDensityInches();
        boolean boolean8 = pixelDensity2.isInCentimetres();
        boolean boolean9 = pixelDensity2.isInMetres();
        double double10 = pixelDensity2.horizontalDensityMetres();
        boolean boolean11 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.01d) + "'", double5 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.0254d) + "'", double7 == (-0.0254d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        double double8 = pixelDensity2.getRawVerticalDensity();
        double double9 = pixelDensity2.getRawVerticalDensity();
        double double10 = pixelDensity2.verticalDensityInches();
        double double11 = pixelDensity2.getRawVerticalDensity();
        double double12 = pixelDensity2.getRawVerticalDensity();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(100000.0d, 0.006451600000000001d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0L, (double) 1);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.verticalDensityMetres();
        double double6 = pixelDensity2.getRawVerticalDensity();
        boolean boolean7 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 39.37007874015748d + "'", double5 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-15.500031000062002d), 0.003937007874015748d);
        boolean boolean3 = pixelDensity2.isInMetres();
        java.lang.Class<?> wildcardClass4 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInInches();
        double double6 = pixelDensity2.verticalDensityMetres();
        double double7 = pixelDensity2.getRawVerticalDensity();
        boolean boolean8 = pixelDensity2.isUnitless();
        boolean boolean9 = pixelDensity2.isInMetres();
        double double10 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isInCentimetres();
        double double8 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(35.0d, 52.0d);
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5200.0d + "'", double3 == 5200.0d);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (byte) 100, 0.06451599999999999d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isUnitless();
        boolean boolean8 = pixelDensity2.isUnitless();
        double double9 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean10 = pixelDensity2.isInMetres();
        double double11 = pixelDensity2.horizontalDensityMetres();
        double double12 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(10.0d, 25.4d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.horizontalDensityInches();
        double double5 = pixelDensity2.verticalDensityMetres();
        java.lang.Class<?> wildcardClass6 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(254.0d, 35.0d);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) (byte) 10);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) (byte) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 100L, (double) (byte) 1);
        double double3 = pixelDensity2.verticalDensityInches();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (short) -1, 2.54d);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityMetres();
        boolean boolean6 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.54d + "'", double3 == 2.54d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.01d) + "'", double4 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.54d + "'", double5 == 2.54d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.254d, 10.0d);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (-1L), 1000000.0d);
        double double3 = pixelDensity2.verticalDensityInches();
        double double4 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.3937007874015748d, 8128.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        java.lang.Class<?> wildcardClass5 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(25.4d, (double) 100L);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.getRawVerticalDensity();
        boolean boolean5 = pixelDensity2.isInMetres();
        boolean boolean6 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0, (double) (-1.0f));
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        double double6 = pixelDensity2.getRawVerticalDensity();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        double double8 = pixelDensity2.getRawVerticalDensity();
        double double9 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.01d) + "'", double5 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 10.0f, (double) 100.0f);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 10.0f, (double) (-1.0f));
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1d + "'", double4 == 0.1d);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 100L, (double) (short) 1);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        java.lang.Class<?> wildcardClass4 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) '4', 0.97d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.97d + "'", double3 == 0.97d);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(32.0d, 0.15500031000062d);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) (byte) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        double double7 = pixelDensity2.verticalDensityMetres();
        boolean boolean8 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.15500031000062d, 1.5500031000062002E7d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.15500031000062d + "'", double3 == 0.15500031000062d);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10L, (double) (byte) 10);
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(393700.7874015748d, (double) 0.0f);
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10L, 1.0d);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        boolean boolean5 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.4d + "'", double4 == 25.4d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(254.0d, (-0.01d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, 10000.0d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityMetres();
        double double5 = pixelDensity2.horizontalDensityInches();
        double double6 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 100.0f, 0.0d);
        boolean boolean3 = pixelDensity2.isInInches();
        boolean boolean4 = pixelDensity2.isInInches();
        double double5 = pixelDensity2.verticalDensityInches();
        java.lang.Class<?> wildcardClass6 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInInches();
        double double6 = pixelDensity2.verticalDensityMetres();
        double double7 = pixelDensity2.verticalDensityMetres();
        boolean boolean8 = pixelDensity2.isInCentimetres();
        double double9 = pixelDensity2.horizontalDensityInches();
        double double10 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.0254d) + "'", double9 == (-0.0254d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.0254d) + "'", double10 == (-0.0254d));
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(1000000.0d, (double) (short) 10);
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 393.7007874015748d + "'", double3 == 393.7007874015748d);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.3937007874015748d, (double) '#');
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3937007874015748d + "'", double4 == 0.3937007874015748d);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (short) -1, (double) 100L);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        java.lang.Class<?> wildcardClass4 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        java.lang.Class<?> wildcardClass4 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(320000.0d, 3200.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 100L, (double) (short) 100);
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.verticalDensityMetres();
        boolean boolean5 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.54d + "'", double3 == 2.54d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 100, (double) 1L);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.horizontalDensityMetres();
        double double5 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.54d + "'", double5 == 2.54d);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        boolean boolean5 = pixelDensity2.isUnitless();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.verticalDensityInches();
        boolean boolean8 = pixelDensity2.isInCentimetres();
        double double9 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.54d + "'", double7 == 2.54d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isInInches();
        double double6 = pixelDensity2.getRawVerticalDensity();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean8 = pixelDensity2.isInInches();
        double double9 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 0L, (double) (short) 100);
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.verticalDensityInches();
        double double6 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.54d + "'", double5 == 2.54d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.54d + "'", double6 == 2.54d);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1.0d, 35.0d);
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 0L, (double) (short) -1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.horizontalDensityInches();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.horizontalDensityInches();
        double double7 = pixelDensity2.verticalDensityInches();
        boolean boolean8 = pixelDensity2.isInCentimetres();
        double double9 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.01d) + "'", double5 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.0254d) + "'", double7 == (-0.0254d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.01d) + "'", double9 == (-0.01d));
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        double double6 = pixelDensity2.getRawVerticalDensity();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.01d) + "'", double5 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(39.37007874015748d, (double) (-1L));
        double double3 = pixelDensity2.verticalDensityMetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3 == (-100.0d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(25400.0d, Double.NaN);
        double double3 = pixelDensity2.horizontalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 25400.0d + "'", double3 == 25400.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 254.0d + "'", double4 == 254.0d);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) 100, (double) 0.0f);
        double double3 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(10.0d, 1.5500031000062002E7d);
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        boolean boolean5 = pixelDensity2.isUnitless();
        double double6 = pixelDensity2.verticalDensityMetres();
        double double7 = pixelDensity2.verticalDensityMetres();
        double double8 = pixelDensity2.verticalDensityCentimetres();
        double double9 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 39.37007874015748d + "'", double3 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 39.37007874015748d + "'", double6 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 39.37007874015748d + "'", double7 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3937007874015748d + "'", double8 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3937.0078740157483d + "'", double9 == 3937.0078740157483d);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((-1.0d), 0.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
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
        boolean boolean12 = pixelDensity2.isUnitless();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.3937007874015748d, 254.0d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInMetres();
        boolean boolean5 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 254.0d + "'", double3 == 254.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        double double7 = pixelDensity2.verticalDensityInches();
        double double8 = pixelDensity2.horizontalDensityInches();
        boolean boolean9 = pixelDensity2.isInCentimetres();
        double double10 = pixelDensity2.horizontalDensityMetres();
        double double11 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.3937007874015748d) + "'", double4 == (-0.3937007874015748d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3937007874015748d + "'", double5 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-39.37007874015748d) + "'", double10 == (-39.37007874015748d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.3937007874015748d + "'", double11 == 0.3937007874015748d);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0L, (double) 1);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.verticalDensityMetres();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean7 = pixelDensity2.isUnitless();
        boolean boolean8 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 39.37007874015748d + "'", double5 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInInches();
        double double6 = pixelDensity2.verticalDensityMetres();
        double double7 = pixelDensity2.verticalDensityMetres();
        boolean boolean8 = pixelDensity2.isInCentimetres();
        double double9 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(15.500031000062002d, 610.237440947323d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 39.37007874015748d + "'", double3 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.0d, (-0.01d));
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(610.237440947323d, 0.32d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean8 = pixelDensity2.isInInches();
        double double9 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0, (double) (-1.0f));
        boolean boolean3 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1000.0d, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.getRawVerticalDensity();
        boolean boolean5 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.0d, (-0.3937007874015748d));
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.horizontalDensityMetres();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.0025399999999999997d, 15.500031000062002d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0025399999999999997d + "'", double3 == 0.0025399999999999997d);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.006451600000000001d, 0.0025399999999999997d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(393.7007874015748d, (-0.3937007874015748d));
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.0d, 39.37007874015748d);
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean5 = pixelDensity2.isUnitless();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.verticalDensityInches();
        double double8 = pixelDensity2.verticalDensityCentimetres();
        double double9 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(52.0d, 0.97d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        boolean boolean6 = pixelDensity2.isInMetres();
        boolean boolean7 = pixelDensity2.isInInches();
        java.lang.Class<?> wildcardClass8 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (-1), 1000.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityMetres();
        double double6 = pixelDensity2.verticalDensityMetres();
        double double7 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isInInches();
        double double6 = pixelDensity2.getRawVerticalDensity();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean8 = pixelDensity2.isInInches();
        double double9 = pixelDensity2.verticalDensityCentimetres();
        double double10 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.0d, (-0.01d));
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isUnitless();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.verticalDensityInches();
        double double5 = pixelDensity2.verticalDensityInches();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.verticalDensityMetres();
        double double8 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 39.37007874015748d + "'", double7 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(25.4d, 35.0d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean4 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 25.4d + "'", double3 == 25.4d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(2.54d, (double) 0.0f);
        boolean boolean3 = pixelDensity2.isInInches();
        boolean boolean4 = pixelDensity2.isInMetres();
        java.lang.Class<?> wildcardClass5 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 100L, (double) (short) 1);
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.horizontalDensityInches();
        double double5 = pixelDensity2.horizontalDensityMetres();
        double double6 = pixelDensity2.verticalDensityMetres();
        java.lang.Class<?> wildcardClass7 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 254.0d + "'", double3 == 254.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 254.0d + "'", double4 == 254.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10000.0d + "'", double5 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.0d, 0.32d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(2047.244094488189d, 0.1d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((-15.500031000062002d), 0.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (short) 10, 81.28d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInInches();
        boolean boolean6 = pixelDensity2.isInInches();
        boolean boolean7 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.horizontalDensityMetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 100, 393700.78740157484d);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 393700.78740157484d + "'", double4 == 393700.78740157484d);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (-39.37007874015748d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(3500.0d, 0.38188976377952755d);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) ' ', 0.15500031000062d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((-0.003937007874015748d), 0.06102374409473228d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(25.4d, 0.0d);
        boolean boolean3 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 1.0f, 0.0d);
        double double3 = pixelDensity2.horizontalDensityMetres();
        boolean boolean4 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 39.37007874015748d + "'", double3 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.38188976377952755d, 0.0d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0038188976377952757d + "'", double3 == 0.0038188976377952757d);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.06102374409473228d, 0.254d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.1d, (double) (-1L));
        double double3 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0254d) + "'", double3 == (-0.0254d));
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(155000.31000062003d, 1259.8425196850394d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(1.0d, 3200.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.verticalDensityMetres();
        java.lang.Class<?> wildcardClass6 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        double double8 = pixelDensity2.verticalDensityCentimetres();
        java.lang.Class<?> wildcardClass9 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.3937007874015748d) + "'", double4 == (-0.3937007874015748d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3937007874015748d + "'", double5 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3937007874015748d + "'", double7 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3937007874015748d + "'", double8 == 0.3937007874015748d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0L, (double) 1);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.verticalDensityMetres();
        double double7 = pixelDensity2.horizontalDensityMetres();
        double double8 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3937007874015748d + "'", double5 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 39.37007874015748d + "'", double6 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityInches();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean6 = pixelDensity2.isInMetres();
        boolean boolean7 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.54d + "'", double3 == 2.54d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.01d) + "'", double4 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.01d) + "'", double5 == (-0.01d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.0d, (-0.3937007874015748d));
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (short) 10, 0.15500031000062d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.15500031000062d + "'", double3 == 0.15500031000062d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.4d + "'", double4 == 25.4d);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (byte) 100, (-1.0d));
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.38188976377952755d, (-3937.0078740157483d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.0d, 3937.0078740157483d);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(3937.0078740157483d, (-0.0254d));
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10000.0d + "'", double3 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3937.0078740157483d + "'", double4 == 3937.0078740157483d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (byte) 100, (-1.0d));
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.NEGATIVE_INFINITY + "'", double5 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 100L, (double) (byte) 1);
        double double3 = pixelDensity2.verticalDensityMetres();
        boolean boolean4 = pixelDensity2.isInInches();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean6 = pixelDensity2.isInInches();
        boolean boolean7 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(3200.0d, (-100.0d));
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3200.0d + "'", double4 == 3200.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-100.0d) + "'", double5 == (-100.0d));
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(39.37007874015748d, (double) (-1L));
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean6 = pixelDensity2.isUnitless();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        double double8 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean9 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 39.37007874015748d + "'", double4 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 39.37007874015748d + "'", double5 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 39.37007874015748d + "'", double7 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(25400.0d, Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (byte) -1, 2.54E-4d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.0d, 0.1d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(100000.0d, 100.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(3818.8976377952754d, 0.01d);
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(3500.0d, 5200.0d);
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8890.0d + "'", double4 == 8890.0d);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        boolean boolean5 = pixelDensity2.isUnitless();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        boolean boolean7 = pixelDensity2.isInMetres();
        boolean boolean8 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.getRawVerticalDensity();
        boolean boolean8 = pixelDensity2.isInInches();
        boolean boolean9 = pixelDensity2.isUnitless();
        boolean boolean10 = pixelDensity2.isInMetres();
        double double11 = pixelDensity2.horizontalDensityCentimetres();
        double double12 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) 100, (double) (short) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean8 = pixelDensity2.isInInches();
        boolean boolean9 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityMetres();
        boolean boolean4 = pixelDensity2.isInInches();
        double double5 = pixelDensity2.horizontalDensityMetres();
        java.lang.Class<?> wildcardClass6 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.06451599999999999d, 0.1d);
        boolean boolean3 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10L, 0.15500031000062d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(3200.0d, (-100.0d));
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean6 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3200.0d + "'", double5 == 3200.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (-1L), 0.0025399999999999997d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (byte) 10, (-100.0d));
        double double3 = pixelDensity2.verticalDensityMetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3937.0078740157483d) + "'", double3 == (-3937.0078740157483d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (short) 1, 0.15500031000062d);
        boolean boolean3 = pixelDensity2.isInMetres();
        boolean boolean4 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.3937007874015748d, (double) 1);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean4 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (-1.0f), (double) 1L);
        boolean boolean3 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(1550.0031000062002d, 2047.244094488189d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.0d, (-0.3937007874015748d));
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.horizontalDensityMetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        java.lang.Class<?> wildcardClass6 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0L, (double) 1);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(1.0d, (double) 100.0f);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.01d + "'", double3 == 0.01d);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        double double8 = pixelDensity2.getRawVerticalDensity();
        double double9 = pixelDensity2.horizontalDensityMetres();
        boolean boolean10 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(Double.NEGATIVE_INFINITY, 1000000.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 1L, 0.0d);
        double double3 = pixelDensity2.horizontalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 39.37007874015748d + "'", double3 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 0, (double) (short) 1);
        double double3 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInMetres();
        double double6 = pixelDensity2.getRawVerticalDensity();
        boolean boolean7 = pixelDensity2.isInCentimetres();
        double double8 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.01d) + "'", double8 == (-0.01d));
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.0d, 10.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((-1.0d), (double) (short) -1);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 1, (double) (short) 0);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.getRawVerticalDensity();
        boolean boolean7 = pixelDensity2.isInInches();
        double double8 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0L, (double) 1);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.horizontalDensityInches();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3937007874015748d + "'", double7 == 0.3937007874015748d);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(25.4d, 35.0d);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean5 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.4d + "'", double4 == 25.4d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.verticalDensityInches();
        boolean boolean5 = pixelDensity2.isInInches();
        double double6 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) ' ', 1.5500031000062002E7d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1), 20.47244094488189d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 'a', (double) 10L);
        boolean boolean3 = pixelDensity2.isInInches();
        boolean boolean4 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0L, (double) 0L);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-15.500031000062002d), 100.0d);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(35.0d, (-0.3937007874015748d));
        double double3 = pixelDensity2.horizontalDensityInches();
        boolean boolean4 = pixelDensity2.isInInches();
        double double5 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.3937007874015748d) + "'", double5 == (-0.3937007874015748d));
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(Double.NaN, 0.3937007874015748d);
        double double3 = pixelDensity2.verticalDensityMetres();
        boolean boolean4 = pixelDensity2.isInInches();
        boolean boolean5 = pixelDensity2.isInMetres();
        double double6 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.01d + "'", double6 == 0.01d);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(88.9d, 100000.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.getRawVerticalDensity();
        boolean boolean5 = pixelDensity2.isInMetres();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        double double8 = pixelDensity2.verticalDensityMetres();
        double double9 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean10 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 39.37007874015748d + "'", double8 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 39.37007874015748d + "'", double9 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, 10000.0d);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) (byte) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.horizontalDensityMetres();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(97.0d, 0.01d);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.verticalDensityInches();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.horizontalDensityCentimetres();
        java.lang.Class<?> wildcardClass8 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.3937007874015748d) + "'", double7 == (-0.3937007874015748d));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 100, Double.POSITIVE_INFINITY);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        java.lang.Class<?> wildcardClass5 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0L, (double) 1);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.horizontalDensityInches();
        double double6 = pixelDensity2.horizontalDensityMetres();
        double double7 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.0254d, 0.97d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(100.0d, (double) (short) -1);
        boolean boolean3 = pixelDensity2.isInInches();
        java.lang.Class<?> wildcardClass4 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.0d, 6.4516d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.verticalDensityMetres();
        java.lang.Class<?> wildcardClass5 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 645.16d + "'", double4 == 645.16d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.verticalDensityMetres();
        boolean boolean7 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0L, (double) 1);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3937007874015748d + "'", double4 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 'a', (double) 10L);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean4 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((-0.0254d), 100000.0d);
        double double3 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.4516E-4d) + "'", double3 == (-6.4516E-4d));
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(Double.NaN, (double) '4');
        boolean boolean3 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.0d, (double) 0.0f);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityMetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(393700.78740157484d, 0.0d);
        boolean boolean3 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        boolean boolean3 = pixelDensity2.isInInches();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.horizontalDensityMetres();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        double double7 = pixelDensity2.getRawVerticalDensity();
        double double8 = pixelDensity2.getRawHorizontalDensity();
        java.lang.Class<?> wildcardClass9 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(25.4d, (double) (byte) 10);
        double double3 = pixelDensity2.verticalDensityInches();
        java.lang.Class<?> wildcardClass4 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.32d, (double) 10);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInMetres();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.0254d) + "'", double7 == (-0.0254d));
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.0d, (double) 100L);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10000.0d + "'", double3 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10000.0d + "'", double4 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        boolean boolean5 = pixelDensity2.isInMetres();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (byte) 1, (-2.54d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(Double.POSITIVE_INFINITY, (double) ' ');
        double double3 = pixelDensity2.verticalDensityInches();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 81.28d + "'", double3 == 81.28d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.0d, (double) 0.0f);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityMetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.horizontalDensityInches();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        boolean boolean7 = pixelDensity2.isUnitless();
        double double8 = pixelDensity2.verticalDensityInches();
        double double9 = pixelDensity2.horizontalDensityMetres();
        java.lang.Class<?> wildcardClass10 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) (byte) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        double double6 = pixelDensity2.getRawVerticalDensity();
        boolean boolean7 = pixelDensity2.isUnitless();
        java.lang.Class<?> wildcardClass8 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.254d, 10.0d);
        double double3 = pixelDensity2.verticalDensityMetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        java.lang.Class<?> wildcardClass5 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isInInches();
        double double6 = pixelDensity2.getRawVerticalDensity();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean8 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(3500.0d, (-0.0254d));
        double double3 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0254d) + "'", double3 == (-0.0254d));
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(3937.0078740157483d, (double) 1);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 39.37007874015748d + "'", double3 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3937.0078740157483d + "'", double4 == 3937.0078740157483d);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (short) 100, 393700.78740157484d);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.verticalDensityInches();
        boolean boolean5 = pixelDensity2.isInInches();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        double double7 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.3937007874015748d) + "'", double6 == (-0.3937007874015748d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) (byte) 10);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1.0d, 0.0d);
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(320000.0d, 320000.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 0.0f, 0.254d);
        boolean boolean3 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 10L, 2047.244094488189d);
        double double3 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.0d, (double) (short) -1);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((-0.3937007874015748d), (double) 10);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 0, (double) 100L);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.0d, 5200.0d);
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) 10, (double) 1L);
        double double3 = pixelDensity2.horizontalDensityMetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.97d, 39.37007874015748d);
        boolean boolean3 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.38188976377952755d, 1259.8425196850394d);
        double double3 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) '#', (double) 1);
        boolean boolean3 = pixelDensity2.isInInches();
        java.lang.Class<?> wildcardClass4 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(10.0d, 25.4d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(645.16d, 15.500031000062002d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) (byte) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        boolean boolean7 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(Double.NaN, 0.15500031000062d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.01d) + "'", double4 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.getRawVerticalDensity();
        boolean boolean5 = pixelDensity2.isInMetres();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean8 = pixelDensity2.isInInches();
        boolean boolean9 = pixelDensity2.isInCentimetres();
        java.lang.Class<?> wildcardClass10 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        double double6 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3937007874015748d + "'", double4 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3937.0078740157483d + "'", double6 == 3937.0078740157483d);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0L, (double) 1);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.horizontalDensityInches();
        double double6 = pixelDensity2.horizontalDensityMetres();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3937007874015748d + "'", double7 == 0.3937007874015748d);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(645.16d, 39.37007874015748d);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.verticalDensityMetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (short) -1, 0.32d);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(3818.8976377952754d, (double) '#');
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3818.8976377952754d + "'", double4 == 3818.8976377952754d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3818.8976377952754d + "'", double5 == 3818.8976377952754d);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        boolean boolean5 = pixelDensity2.isUnitless();
        boolean boolean6 = pixelDensity2.isInInches();
        double double7 = pixelDensity2.verticalDensityMetres();
        double double8 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean9 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 39.37007874015748d + "'", double3 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 39.37007874015748d + "'", double7 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10L, 1.0d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean4 = pixelDensity2.isInMetres();
        boolean boolean5 = pixelDensity2.isInInches();
        double double6 = pixelDensity2.verticalDensityMetres();
        double double7 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.06451599999999999d, Double.NEGATIVE_INFINITY);
        boolean boolean3 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (byte) 1, 0.0d);
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10L, (double) 100);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.97d, (double) (byte) 0);
        double double3 = pixelDensity2.horizontalDensityMetres();
        java.lang.Class<?> wildcardClass4 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.97d + "'", double3 == 0.97d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.0025399999999999997d, 15.500031000062002d);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1550.0031000062002d + "'", double3 == 1550.0031000062002d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0025399999999999997d + "'", double4 == 0.0025399999999999997d);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-100.0d), 3200.0d);
        double double3 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8128.0d + "'", double3 == 8128.0d);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(15.500031000062002d, Double.NaN);
        double double3 = pixelDensity2.verticalDensityInches();
        boolean boolean4 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (-1), (double) (-1.0f));
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityInches();
        boolean boolean5 = pixelDensity2.isInMetres();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.01d) + "'", double3 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0254d) + "'", double4 == (-0.0254d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.01d) + "'", double6 == (-0.01d));
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-15.500031000062002d), 35.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        boolean boolean5 = pixelDensity2.isUnitless();
        double double6 = pixelDensity2.verticalDensityMetres();
        double double7 = pixelDensity2.verticalDensityMetres();
        double double8 = pixelDensity2.verticalDensityCentimetres();
        double double9 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 39.37007874015748d + "'", double3 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 39.37007874015748d + "'", double6 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 39.37007874015748d + "'", double7 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3937007874015748d + "'", double8 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 39.37007874015748d + "'", double9 == 39.37007874015748d);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (short) -1, (double) 0L);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.38188976377952755d, 15.500031000062002d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (byte) -1, (-15.500031000062002d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(610.237440947323d, (double) (byte) 10);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((-155000.31000062003d), (double) 0);
        boolean boolean3 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        boolean boolean5 = pixelDensity2.isUnitless();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.verticalDensityInches();
        double double8 = pixelDensity2.horizontalDensityMetres();
        double double9 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.54d + "'", double7 == 2.54d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(52.0d, 393.7007874015748d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.horizontalDensityMetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((-39.37007874015748d), 3200.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(Double.NaN, (double) '4');
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((-0.15500031000062d), 6.4516d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 0L, (double) 100.0f);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
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
        boolean boolean13 = pixelDensity2.isInMetres();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.3937007874015748d) + "'", double4 == (-0.3937007874015748d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3937007874015748d + "'", double5 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3937007874015748d + "'", double7 == 0.3937007874015748d);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 'a', 10000.0d);
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.verticalDensityInches();
        double double6 = pixelDensity2.horizontalDensityMetres();
        double double7 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10000.0d + "'", double5 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3818.8976377952754d + "'", double6 == 3818.8976377952754d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3818.8976377952754d + "'", double7 == 3818.8976377952754d);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.0d, 3937.0078740157483d);
        boolean boolean3 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 10L, 0.15500031000062d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) '#', (double) (short) 1);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1.0d, 0.3937007874015748d);
        boolean boolean3 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(393700.78740157484d, 100000.0d);
        double double3 = pixelDensity2.horizontalDensityMetres();
        java.lang.Class<?> wildcardClass4 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.5500031000062002E7d + "'", double3 == 1.5500031000062002E7d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(393700.7874015748d, (double) (-1.0f));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.3937007874015748d, 15.500031000062002d);
        double double3 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (short) -1, (double) 100L);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((-0.0254d), 0.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 'a', (double) 10L);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(25.4d, (double) (byte) 10);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 25.4d + "'", double3 == 25.4d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        double double8 = pixelDensity2.getRawVerticalDensity();
        double double9 = pixelDensity2.verticalDensityMetres();
        double double10 = pixelDensity2.horizontalDensityCentimetres();
        double double11 = pixelDensity2.horizontalDensityMetres();
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
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.06451599999999999d, 0.52d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((-0.01d), (-39.37007874015748d));
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10L, 1.0d);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.horizontalDensityMetres();
        boolean boolean5 = pixelDensity2.isInInches();
        java.lang.Class<?> wildcardClass6 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1000.0d + "'", double4 == 1000.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.verticalDensityMetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isInCentimetres();
        double double8 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 39.37007874015748d + "'", double5 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3937007874015748d + "'", double6 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-39.37007874015748d) + "'", double8 == (-39.37007874015748d));
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.horizontalDensityMetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 10, 0.1d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.32d, 25.4d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(15.500031000062002d, 0.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 100, (double) 10.0f);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.getRawVerticalDensity();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInInches();
        double double6 = pixelDensity2.verticalDensityMetres();
        double double7 = pixelDensity2.verticalDensityMetres();
        boolean boolean8 = pixelDensity2.isInMetres();
        double double9 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) 0, (-39.37007874015748d));
        boolean boolean3 = pixelDensity2.isInMetres();
        java.lang.Class<?> wildcardClass4 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(320000.0d, 0.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isUnitless();
        double double6 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(3937.0078740157483d, (-0.0254d));
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.54d) + "'", double3 == (-2.54d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3937.0078740157483d + "'", double4 == 3937.0078740157483d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 100L, (double) (byte) 1);
        double double3 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean7 = pixelDensity2.isInMetres();
        boolean boolean8 = pixelDensity2.isInCentimetres();
        double double9 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.3937007874015748d) + "'", double4 == (-0.3937007874015748d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3937007874015748d + "'", double5 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((-6.4516E-4d), (-15.500031000062002d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.254d, (double) 0.0f);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean5 = pixelDensity2.isUnitless();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        double double8 = pixelDensity2.verticalDensityInches();
        double double9 = pixelDensity2.verticalDensityMetres();
        boolean boolean10 = pixelDensity2.isInInches();
        double double11 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(81.28d, 393700.78740157484d);
        boolean boolean3 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.003937007874015748d, (double) (-1L));
        boolean boolean3 = pixelDensity2.isInMetres();
        java.lang.Class<?> wildcardClass4 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(15.500031000062002d, (double) ' ');
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(Double.POSITIVE_INFINITY, (double) ' ');
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        double double6 = pixelDensity2.verticalDensityInches();
        double double7 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3200.0d + "'", double4 == 3200.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 81.28d + "'", double6 == 81.28d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 81.28d + "'", double7 == 81.28d);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.0d, (-0.3937007874015748d));
        double double3 = pixelDensity2.horizontalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityMetres();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, 0.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((-0.15500031000062d), 393700.78740157484d);
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.38188976377952755d, (double) 100);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((-1.0d), (double) 10);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 100L, (double) (byte) 1);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityInches();
        double double6 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.3937007874015748d, (-0.15500031000062d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(320000.0d, (-155000.31000062003d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1.0d, 35.0d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(Double.NEGATIVE_INFINITY, (double) 'a');
        double double3 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(3500.0d, 0.32d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(20.47244094488189d, (double) (short) 100);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(32.0d, 0.15500031000062d);
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.0d, (-0.01d));
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(39.37007874015748d, (double) (-1L));
        double double3 = pixelDensity2.verticalDensityMetres();
        boolean boolean4 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3 == (-100.0d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (byte) 100, (double) (short) 0);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (short) -1, (double) (short) 1);
        double double3 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInMetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        double double8 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean9 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.01d) + "'", double8 == (-0.01d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(3200.0d, 0.06102374409473228d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) '#', 88.9d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.verticalDensityMetres();
        boolean boolean6 = pixelDensity2.isUnitless();
        boolean boolean7 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.horizontalDensityInches();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        double double8 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.3937007874015748d) + "'", double4 == (-0.3937007874015748d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3937007874015748d + "'", double5 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.verticalDensityMetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.horizontalDensityInches();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        boolean boolean7 = pixelDensity2.isUnitless();
        double double8 = pixelDensity2.verticalDensityInches();
        double double9 = pixelDensity2.horizontalDensityMetres();
        double double10 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (byte) 100, 35.0d);
        double double3 = pixelDensity2.horizontalDensityMetres();
        boolean boolean4 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10000.0d + "'", double3 == 10000.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean5 = pixelDensity2.isInInches();
        double double6 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.1d, 393.7007874015748d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 393.7007874015748d + "'", double3 == 393.7007874015748d);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.0038188976377952757d, (double) 1.0f);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.003937007874015748d, (double) 1L);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(Double.NaN, 0.3937007874015748d);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((-3937.0078740157483d), 1000000.0d);
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.0d, (double) 10.0f);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(35.0d, (-1.0d));
        boolean boolean3 = pixelDensity2.isInCentimetres();
        boolean boolean4 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (-1), (double) (-1.0f));
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        double double5 = pixelDensity2.verticalDensityInches();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.01d) + "'", double3 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.0254d) + "'", double5 == (-0.0254d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.01d) + "'", double6 == (-0.01d));
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
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
        boolean boolean12 = pixelDensity2.isInInches();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(3200.0d, 100.0d);
        boolean boolean3 = pixelDensity2.isInInches();
        java.lang.Class<?> wildcardClass4 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(6.4516d, (double) (byte) 0);
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(206.4512d, (double) 1L);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) '#', (double) (byte) 100);
        double double3 = pixelDensity2.verticalDensityMetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        java.lang.Class<?> wildcardClass5 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10000.0d + "'", double3 == 10000.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((-1.0d), (double) (short) -1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.verticalDensityInches();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0254d) + "'", double4 == (-0.0254d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.01d) + "'", double5 == (-0.01d));
    }
}

