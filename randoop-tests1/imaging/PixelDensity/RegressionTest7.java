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
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(1.0d, 0.3937007874015748d);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((-1.0d), 204724.4094488189d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (short) 0, (double) (-1L));
        double double3 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (-1.0f), (-155000.31000062003d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(10000.000000000002d, 3.937007874015748E-5d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.verticalDensityMetres();
        boolean boolean6 = pixelDensity2.isUnitless();
        double double7 = pixelDensity2.horizontalDensityInches();
        boolean boolean8 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0L, (double) 1);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean6 = pixelDensity2.isUnitless();
        double double7 = pixelDensity2.verticalDensityMetres();
        double double8 = pixelDensity2.horizontalDensityMetres();
        double double9 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3937007874015748d + "'", double5 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 39.37007874015748d + "'", double7 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        double double8 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean9 = pixelDensity2.isInCentimetres();
        java.lang.Class<?> wildcardClass10 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.3937007874015748d) + "'", double4 == (-0.3937007874015748d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3937007874015748d + "'", double5 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3937007874015748d + "'", double7 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3937007874015748d + "'", double8 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((-6.4516E-6d), 0.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        double double6 = pixelDensity2.verticalDensityMetres();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        double double8 = pixelDensity2.horizontalDensityMetres();
        double double9 = pixelDensity2.verticalDensityMetres();
        boolean boolean10 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.01d) + "'", double5 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        boolean boolean3 = pixelDensity2.isInInches();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.horizontalDensityMetres();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        double double7 = pixelDensity2.horizontalDensityCentimetres();
        double double8 = pixelDensity2.getRawHorizontalDensity();
        double double9 = pixelDensity2.verticalDensityMetres();
        double double10 = pixelDensity2.verticalDensityCentimetres();
        double double11 = pixelDensity2.getRawHorizontalDensity();
        double double12 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) '#', (double) (byte) 100);
        double double3 = pixelDensity2.verticalDensityMetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        boolean boolean5 = pixelDensity2.isUnitless();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10000.0d + "'", double3 == 10000.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) ' ', 0.15500031000062d);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.15500031000062d + "'", double4 == 0.15500031000062d);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0L, (double) 1);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        boolean boolean5 = pixelDensity2.isInInches();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.verticalDensityInches();
        double double8 = pixelDensity2.horizontalDensityCentimetres();
        double double9 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(Double.NaN, 155000.31000062d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.verticalDensityMetres();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        double double7 = pixelDensity2.verticalDensityInches();
        double double8 = pixelDensity2.horizontalDensityMetres();
        boolean boolean9 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.verticalDensityMetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isInMetres();
        double double8 = pixelDensity2.getRawHorizontalDensity();
        double double9 = pixelDensity2.verticalDensityCentimetres();
        double double10 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 39.37007874015748d + "'", double5 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3937007874015748d + "'", double6 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.3937007874015748d + "'", double9 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-39.37007874015748d) + "'", double10 == (-39.37007874015748d));
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean5 = pixelDensity2.isUnitless();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        double double8 = pixelDensity2.getRawHorizontalDensity();
        double double9 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.3937007874015748d, 15.500031000062002d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.horizontalDensityInches();
        boolean boolean6 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.102374409473229d + "'", double3 == 6.102374409473229d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.15500031000062d + "'", double4 == 0.15500031000062d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3937007874015748d + "'", double5 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(35.0d, (-1.0d));
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((-2.54d), (double) '4');
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(39.37007874015748d, (double) 0L);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((-100.0d), 2.54E-5d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.0254d, 2.5399999999999994E-5d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.verticalDensityInches();
        double double5 = pixelDensity2.verticalDensityInches();
        double double6 = pixelDensity2.getRawVerticalDensity();
        double double7 = pixelDensity2.verticalDensityInches();
        double double8 = pixelDensity2.horizontalDensityMetres();
        boolean boolean9 = pixelDensity2.isUnitless();
        double double10 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-39.37007874015748d) + "'", double8 == (-39.37007874015748d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.horizontalDensityMetres();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.01d) + "'", double6 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) '#', 35.0d);
        boolean boolean3 = pixelDensity2.isInInches();
        boolean boolean4 = pixelDensity2.isInInches();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        double double6 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 88.9d + "'", double6 == 88.9d);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.verticalDensityInches();
        boolean boolean5 = pixelDensity2.isInInches();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isInCentimetres();
        double double8 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.3937007874015748d) + "'", double6 == (-0.3937007874015748d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0, (double) (-1.0f));
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.horizontalDensityMetres();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(88.9d, 206.4512d);
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) (byte) 10);
        double double3 = pixelDensity2.verticalDensityInches();
        double double4 = pixelDensity2.horizontalDensityMetres();
        double double5 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) 100, (-0.15500031000062d));
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.15500031000062d) + "'", double3 == (-0.15500031000062d));
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(3500.0d, 0.15500031000062d);
        boolean boolean3 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((-1.0d), (double) (short) -1);
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.horizontalDensityInches();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean7 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.0254d) + "'", double5 == (-0.0254d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.06102374409473228d, (double) (byte) 100);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInInches();
        boolean boolean6 = pixelDensity2.isInInches();
        double double7 = pixelDensity2.getRawVerticalDensity();
        boolean boolean8 = pixelDensity2.isInInches();
        double double9 = pixelDensity2.horizontalDensityInches();
        boolean boolean10 = pixelDensity2.isUnitless();
        double double11 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.0254d) + "'", double9 == (-0.0254d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.54d + "'", double11 == 2.54d);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.0d, (double) 0.0f);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityMetres();
        double double5 = pixelDensity2.horizontalDensityInches();
        double double6 = pixelDensity2.verticalDensityInches();
        double double7 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(393.7007874015748d, (double) (byte) 100);
        double double3 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 39370.07874015748d + "'", double3 == 39370.07874015748d);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(3500.0d, (double) (byte) 0);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.0d, 3.937007874015748d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        double double6 = pixelDensity2.horizontalDensityMetres();
        boolean boolean7 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.01d) + "'", double5 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(25.4d, 3937.0078740157487d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3937.0078740157487d + "'", double3 == 3937.0078740157487d);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-1550.0031000062002d), 3937.0078740157487d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(1000.0d, (-1.0d));
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1000.0d + "'", double3 == 1000.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100000.0d + "'", double4 == 100000.0d);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1259.8425196850394d, 1550.0031000062002d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 1.0f, (-2.54d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.verticalDensityMetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isInMetres();
        double double8 = pixelDensity2.getRawHorizontalDensity();
        double double9 = pixelDensity2.getRawVerticalDensity();
        double double10 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 39.37007874015748d + "'", double5 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3937007874015748d + "'", double6 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(100.0d, (double) (short) -1);
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        java.lang.Class<?> wildcardClass6 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1.0f), 3937.0078740157483d);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.horizontalDensityMetres();
        boolean boolean5 = pixelDensity2.isUnitless();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-39.37007874015748d) + "'", double4 == (-39.37007874015748d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 0.0f, 3937.0078740157487d);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10L, 1.0d);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        boolean boolean5 = pixelDensity2.isInMetres();
        boolean boolean6 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.4d + "'", double4 == 25.4d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(520000.0d, (-39.37007874015748d));
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        double double5 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-39.37007874015748d) + "'", double3 == (-39.37007874015748d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1320800.0d + "'", double4 == 1320800.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-3937.0078740157483d) + "'", double5 == (-3937.0078740157483d));
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1.0d, 5200.0d);
        double double3 = pixelDensity2.horizontalDensityMetres();
        boolean boolean4 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.horizontalDensityInches();
        java.lang.Class<?> wildcardClass5 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1259.8425196850394d, 6102374.409473228d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (-1L), (double) '#');
        double double3 = pixelDensity2.horizontalDensityMetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.3937007874015748d, 496.00099200198406d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.horizontalDensityInches();
        double double8 = pixelDensity2.verticalDensityCentimetres();
        double double9 = pixelDensity2.horizontalDensityCentimetres();
        double double10 = pixelDensity2.horizontalDensityMetres();
        java.lang.Class<?> wildcardClass11 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(5200.0d, 0.003937007874015748d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.003937007874015748d + "'", double3 == 0.003937007874015748d);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        double double7 = pixelDensity2.horizontalDensityMetres();
        double double8 = pixelDensity2.verticalDensityCentimetres();
        double double9 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.01d) + "'", double6 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.54d + "'", double9 == 2.54d);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean5 = pixelDensity2.isUnitless();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.verticalDensityInches();
        double double8 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean9 = pixelDensity2.isInCentimetres();
        double double10 = pixelDensity2.getRawHorizontalDensity();
        double double11 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) 1, 0.0d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.verticalDensityInches();
        double double6 = pixelDensity2.horizontalDensityInches();
        double double7 = pixelDensity2.verticalDensityMetres();
        double double8 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0254d + "'", double6 == 0.0254d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(1550.0031000062002d, 0.38188976377952755d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(3818.8976377952754d, 0.01d);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(25400.0d, 0.8128d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25400.0d + "'", double4 == 25400.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8128d + "'", double5 == 0.8128d);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 0.0f, 0.0254d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        double double6 = pixelDensity2.verticalDensityMetres();
        double double7 = pixelDensity2.horizontalDensityInches();
        boolean boolean8 = pixelDensity2.isInCentimetres();
        boolean boolean9 = pixelDensity2.isInMetres();
        boolean boolean10 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.01d) + "'", double5 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.0254d) + "'", double7 == (-0.0254d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(32.0d, (-3937.0078740157483d));
        boolean boolean3 = pixelDensity2.isInCentimetres();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.0d, 0.003937007874015748d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.003937007874015748d + "'", double3 == 0.003937007874015748d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003937007874015748d + "'", double4 == 0.003937007874015748d);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(155000.31000062003d, 0.008128d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.0d, 2047.244094488189d);
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(2.4025096100288303d, (-2.54d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) (byte) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityInches();
        boolean boolean6 = pixelDensity2.isUnitless();
        double double7 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10L, (double) (byte) 10);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isInCentimetres();
        double double8 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1000.0d + "'", double3 == 1000.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1000.0d + "'", double4 == 1000.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1000.0d + "'", double8 == 1000.0d);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(3.937007874015748d, 0.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (-1), (double) (-1.0f));
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityInches();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.getRawVerticalDensity();
        boolean boolean7 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.01d) + "'", double3 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0254d) + "'", double4 == (-0.0254d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.01d) + "'", double5 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-0.0015500031000062d), 2.5399999999999994E-5d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0015500031000062d) + "'", double3 == (-0.0015500031000062d));
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(6.4516d, 393700.7874015748d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.4516d + "'", double3 == 6.4516d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 645.16d + "'", double4 == 645.16d);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.008128d, 0.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(1377.9527559055118d, (-155000.31000062003d));
        double double3 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-155000.31000062003d) + "'", double3 == (-155000.31000062003d));
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 100L, 2.54d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.verticalDensityInches();
        double double6 = pixelDensity2.horizontalDensityMetres();
        boolean boolean7 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.4516d + "'", double5 == 6.4516d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10000.0d + "'", double6 == 10000.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(1.5500031000062002E7d, 61023.74409473229d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.0d, 1000.0d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (short) 0, (double) 'a');
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        double double5 = pixelDensity2.horizontalDensityInches();
        double double6 = pixelDensity2.getRawVerticalDensity();
        boolean boolean7 = pixelDensity2.isInInches();
        boolean boolean8 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 'a', 3200.0d);
        double double3 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3818.8976377952754d + "'", double3 == 3818.8976377952754d);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (short) -1, 2.54d);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.verticalDensityInches();
        double double5 = pixelDensity2.horizontalDensityMetres();
        double double6 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.54d + "'", double3 == 2.54d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.06451599999999999d + "'", double4 == 0.06451599999999999d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.06451599999999999d + "'", double6 == 0.06451599999999999d);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.verticalDensityInches();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.0d, 81.28d);
        double double3 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(1.0d, 2.54d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0L, (double) 1);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.horizontalDensityInches();
        double double5 = pixelDensity2.horizontalDensityInches();
        double double6 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) '#', (double) 1);
        boolean boolean3 = pixelDensity2.isInInches();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.0d, 2.54d);
        boolean boolean3 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((-0.0254d), 2540.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        boolean boolean5 = pixelDensity2.isInMetres();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.verticalDensityInches();
        double double8 = pixelDensity2.verticalDensityInches();
        double double9 = pixelDensity2.verticalDensityMetres();
        double double10 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.016387064000000003d, (double) '#');
        boolean boolean3 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 'a', 10000.0d);
        double double3 = pixelDensity2.horizontalDensityMetres();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3818.8976377952754d + "'", double3 == 3818.8976377952754d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        double double6 = pixelDensity2.getRawVerticalDensity();
        double double7 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 39.37007874015748d + "'", double5 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.35d, (double) (short) 10);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(25400.0d, 52.0d);
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.52d + "'", double4 == 0.52d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(Double.NEGATIVE_INFINITY, 393700.78740157484d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityInches();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        double double6 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3937.0078740157487d + "'", double3 == 3937.0078740157487d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10000.000000000002d + "'", double4 == 10000.000000000002d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.NEGATIVE_INFINITY + "'", double5 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 393700.78740157484d + "'", double6 == 393700.78740157484d);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) (byte) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((-3937.0078740157483d), (double) 'a');
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.horizontalDensityInches();
        double double6 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-100.0d) + "'", double5 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3937.0078740157483d) + "'", double6 == (-3937.0078740157483d));
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(25.4d, (double) 100L);
        boolean boolean3 = pixelDensity2.isInMetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.verticalDensityMetres();
        double double6 = pixelDensity2.getRawVerticalDensity();
        double double7 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInMetres();
        double double6 = pixelDensity2.getRawVerticalDensity();
        boolean boolean7 = pixelDensity2.isInCentimetres();
        double double8 = pixelDensity2.getRawVerticalDensity();
        double double9 = pixelDensity2.verticalDensityInches();
        double double10 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.54d + "'", double9 == 2.54d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 0L, 64516.0d);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(2.54d, 35.0d);
        boolean boolean3 = pixelDensity2.isUnitless();
        java.lang.Class<?> wildcardClass4 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((-155000.31000062003d), 3937.0078740157487d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 'a', 10000.0d);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.verticalDensityInches();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        double double7 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10000.0d + "'", double4 == 10000.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3937.0078740157483d + "'", double6 == 3937.0078740157483d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 393700.7874015748d + "'", double7 == 393700.7874015748d);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 100L, (double) (short) 1);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 254.0d + "'", double5 == 254.0d);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        double double5 = pixelDensity2.verticalDensityMetres();
        boolean boolean6 = pixelDensity2.isInInches();
        boolean boolean7 = pixelDensity2.isInMetres();
        double double8 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 39.37007874015748d + "'", double3 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 39.37007874015748d + "'", double5 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3937.0078740157483d + "'", double8 == 3937.0078740157483d);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 1, 0.3937007874015748d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.0038188976377952757d, 2047.244094488189d);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.38188976377952755d + "'", double4 == 0.38188976377952755d);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(320000.0d, (double) 1L);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(3937.0078740157483d, (-0.0254d));
        double double3 = pixelDensity2.horizontalDensityInches();
        boolean boolean4 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10000.0d + "'", double3 == 10000.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, 0.003937007874015748d);
        double double3 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 0, (-1.0d));
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1.0d, (double) 0L);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.horizontalDensityMetres();
        double double7 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean8 = pixelDensity2.isInCentimetres();
        boolean boolean9 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(254.0d, (double) (short) -1);
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (short) -1, (double) 100L);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(Double.POSITIVE_INFINITY, (-39.37007874015748d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 'a', 10000.0d);
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 38.188976377952756d + "'", double5 == 38.188976377952756d);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, 0.0d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.06451599999999999d, 1.5500031000062E7d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(100.0d, (double) (short) -1);
        boolean boolean3 = pixelDensity2.isInInches();
        boolean boolean4 = pixelDensity2.isInInches();
        double double5 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.0254d, 0.52d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0L, (double) 1);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.verticalDensityInches();
        double double6 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.97d, 10000.0d);
        double double3 = pixelDensity2.verticalDensityInches();
        double double4 = pixelDensity2.horizontalDensityMetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 25400.0d + "'", double3 == 25400.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10000.0d + "'", double5 == 10000.0d);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 0, (double) (short) 1);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.horizontalDensityMetres();
        double double5 = pixelDensity2.horizontalDensityInches();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.32d, (-0.15500031000062d));
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0015500031000062d) + "'", double3 == (-0.0015500031000062d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.32d + "'", double5 == 0.32d);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (short) 0, 0.64516d);
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.003937007874015748d, 20.47244094488189d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (byte) -1, 10.0d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.937007874015748d + "'", double3 == 3.937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(99.99999999999999d, (-0.06102374409473228d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (byte) 10, (double) (short) 10);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 100L, (double) (byte) 1);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        double double6 = pixelDensity2.getRawVerticalDensity();
        double double7 = pixelDensity2.verticalDensityInches();
        double double8 = pixelDensity2.getRawVerticalDensity();
        boolean boolean9 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 100L, (double) (byte) 1);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        double double6 = pixelDensity2.horizontalDensityInches();
        boolean boolean7 = pixelDensity2.isInCentimetres();
        boolean boolean8 = pixelDensity2.isUnitless();
        boolean boolean9 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(10000.000000000002d, (double) 0L);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10000.000000000002d + "'", double3 == 10000.000000000002d);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 100, (double) 10.0f);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(3937.0078740157487d, Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(39.37007874015748d, (double) ' ');
        double double3 = pixelDensity2.getRawHorizontalDensity();
        java.lang.Class<?> wildcardClass4 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 39.37007874015748d + "'", double3 == 39.37007874015748d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0L, (double) 1);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.verticalDensityMetres();
        boolean boolean7 = pixelDensity2.isUnitless();
        double double8 = pixelDensity2.getRawVerticalDensity();
        boolean boolean9 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3937007874015748d + "'", double5 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 39.37007874015748d + "'", double6 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean5 = pixelDensity2.isUnitless();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.verticalDensityInches();
        double double8 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean9 = pixelDensity2.isInCentimetres();
        boolean boolean10 = pixelDensity2.isInInches();
        double double11 = pixelDensity2.verticalDensityInches();
        boolean boolean12 = pixelDensity2.isInCentimetres();
        double double13 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (short) 100, 393700.78740157484d);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.verticalDensityInches();
        boolean boolean5 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.0d, (-0.3937007874015748d));
        double double3 = pixelDensity2.horizontalDensityMetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        java.lang.Class<?> wildcardClass6 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-15.500031000062002d) + "'", double4 == (-15.500031000062002d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(254.0d, 0.01d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.01d + "'", double3 == 0.01d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10000.0d + "'", double4 == 10000.0d);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (byte) 10, (double) 100L);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(Double.NaN, 3937.0078740157483d);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10000.0d + "'", double4 == 10000.0d);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.0d, 150350.3007006014d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.getRawVerticalDensity();
        boolean boolean5 = pixelDensity2.isInMetres();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.horizontalDensityCentimetres();
        double double8 = pixelDensity2.horizontalDensityCentimetres();
        double double9 = pixelDensity2.getRawVerticalDensity();
        double double10 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 39.37007874015748d + "'", double7 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 39.37007874015748d + "'", double8 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(1.0d, (double) 100L);
        double double3 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(99.99999999999999d, 0.006451600000000001d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.0d, (-0.064516d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.0d, 0.09999999999999999d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((-2.54E-4d), 0.32d);
        double double3 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.4516E-6d) + "'", double3 == (-6.4516E-6d));
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (byte) 100, 5200.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) 100, (double) (-1));
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.01d) + "'", double3 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityInches();
        double double6 = pixelDensity2.getRawVerticalDensity();
        double double7 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 100.0f, 0.0d);
        boolean boolean3 = pixelDensity2.isInInches();
        boolean boolean4 = pixelDensity2.isInInches();
        boolean boolean5 = pixelDensity2.isUnitless();
        double double6 = pixelDensity2.horizontalDensityMetres();
        double double7 = pixelDensity2.horizontalDensityMetres();
        double double8 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean9 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3937.0078740157483d + "'", double6 == 3937.0078740157483d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3937.0078740157483d + "'", double7 == 3937.0078740157483d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        boolean boolean3 = pixelDensity2.isInInches();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.horizontalDensityMetres();
        boolean boolean6 = pixelDensity2.isUnitless();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(3818.8976377952754d, (double) 1L);
        double double3 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.0d, (double) (-1.0f));
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityMetres();
        double double5 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10L, (double) 100);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10L, (-6.102374409473229d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((-0.3937007874015748d), 10000.0d);
        double double3 = pixelDensity2.horizontalDensityMetres();
        boolean boolean4 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-6.4516E-4d), (double) 100L);
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0016387064d) + "'", double3 == (-0.0016387064d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 254.0d + "'", double4 == 254.0d);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(3937.0078740157487d, 520000.0d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 520000.0d + "'", double3 == 520000.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3937.0078740157487d + "'", double5 == 3937.0078740157487d);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.254d, (double) 1L);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.horizontalDensityInches();
        java.lang.Class<?> wildcardClass5 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.006451600000000001d + "'", double4 == 0.006451600000000001d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.0025399999999999997d, 0.025399999999999995d);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9999999999999998d + "'", double3 == 0.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.009999999999999998d + "'", double4 == 0.009999999999999998d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(Double.POSITIVE_INFINITY, (double) ' ');
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        double double6 = pixelDensity2.verticalDensityInches();
        boolean boolean7 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3200.0d + "'", double4 == 3200.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 81.28d + "'", double6 == 81.28d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((-39.37007874015748d), 0.0038188976377952757d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (-0.0254d));
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        double double5 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.3937007874015748d, 520000.0d);
        double double3 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        double double7 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.3937007874015748d) + "'", double4 == (-0.3937007874015748d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3937007874015748d + "'", double5 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
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
        boolean boolean12 = pixelDensity2.isInInches();
        double double13 = pixelDensity2.verticalDensityCentimetres();
        double double14 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean15 = pixelDensity2.isInCentimetres();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10L, 1.0d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean4 = pixelDensity2.isInMetres();
        boolean boolean5 = pixelDensity2.isInMetres();
        boolean boolean6 = pixelDensity2.isUnitless();
        java.lang.Class<?> wildcardClass7 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((-39.37007874015748d), 0.0d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.horizontalDensityInches();
        double double5 = pixelDensity2.verticalDensityInches();
        java.lang.Class<?> wildcardClass6 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 100L);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1.0d, 35.0d);
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.verticalDensityInches();
        double double6 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.3937007874015748d, (double) '#');
        double double3 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.025399999999999995d, (double) '#');
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.5399999999999994E-4d + "'", double3 == 2.5399999999999994E-4d);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10L, (double) (byte) 10);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.getRawVerticalDensity();
        boolean boolean5 = pixelDensity2.isInMetres();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean8 = pixelDensity2.isInInches();
        double double9 = pixelDensity2.verticalDensityMetres();
        boolean boolean10 = pixelDensity2.isInInches();
        boolean boolean11 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 39.37007874015748d + "'", double9 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) ' ', (double) (-1.0f));
        double double3 = pixelDensity2.horizontalDensityMetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.horizontalDensityInches();
        double double6 = pixelDensity2.horizontalDensityMetres();
        double double7 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3200.0d + "'", double3 == 3200.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 81.28d + "'", double5 == 81.28d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3200.0d + "'", double6 == 3200.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (byte) 100, (-1.0d));
        boolean boolean3 = pixelDensity2.isInMetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.horizontalDensityMetres();
        boolean boolean6 = pixelDensity2.isInInches();
        boolean boolean7 = pixelDensity2.isInInches();
        double double8 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(3500.0d, 0.0d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(100000.0d, 0.01d);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0254d + "'", double4 == 0.0254d);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(2.54d, 20.47244094488189d);
        boolean boolean3 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(61023.74409473229d, 0.15500031000062d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.06102374409473228d + "'", double3 == 0.06102374409473228d);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(15.500031000062002d, Double.NaN);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.102374409473229d + "'", double3 == 6.102374409473229d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((-0.3937007874015748d), 0.009999999999999998d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.horizontalDensityInches();
        double double6 = pixelDensity2.verticalDensityInches();
        boolean boolean7 = pixelDensity2.isInMetres();
        boolean boolean8 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (byte) -1, 5200.0d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        double double6 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-2.54d) + "'", double4 == (-2.54d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-100.0d) + "'", double6 == (-100.0d));
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, 10000.0d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityMetres();
        double double5 = pixelDensity2.horizontalDensityInches();
        boolean boolean6 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((-0.0016387064d), 3937.0078740157483d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInInches();
        boolean boolean6 = pixelDensity2.isInInches();
        double double7 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean8 = pixelDensity2.isUnitless();
        double double9 = pixelDensity2.verticalDensityCentimetres();
        double double10 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.01d) + "'", double7 == (-0.01d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) '#', 0.0d);
        boolean boolean3 = pixelDensity2.isInInches();
        boolean boolean4 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.3937007874015748d, 254.0d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.verticalDensityInches();
        double double5 = pixelDensity2.getRawVerticalDensity();
        boolean boolean6 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 254.0d + "'", double3 == 254.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 254.0d + "'", double4 == 254.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 254.0d + "'", double5 == 254.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(3937.0078740157487d, 6.4516d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(32.0d, (double) 0L);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.0d, (double) 100L);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.horizontalDensityMetres();
        double double6 = pixelDensity2.verticalDensityInches();
        boolean boolean7 = pixelDensity2.isUnitless();
        java.lang.Class<?> wildcardClass8 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10000.0d + "'", double3 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10000.0d + "'", double4 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 254.0d + "'", double6 == 254.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(3937.0078740157483d, (-0.0254d));
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isInMetres();
        boolean boolean5 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((-0.0015500031000062d), 97.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(35.0d, 0.3937007874015748d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(254.0d, (double) 0);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 254.0d + "'", double3 == 254.0d);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.32d, 0.1d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.32d + "'", double3 == 0.32d);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.0d, 0.03937007874015748d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(2047.244094488189d, (double) (short) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 1L, Double.POSITIVE_INFINITY);
        double double3 = pixelDensity2.verticalDensityInches();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.54d + "'", double5 == 2.54d);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(Double.NEGATIVE_INFINITY, 254.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(3937.0078740157487d, 520000.0d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 520000.0d + "'", double3 == 520000.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10000.000000000002d + "'", double4 == 10000.000000000002d);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 0L, (double) (short) -1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.horizontalDensityInches();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        double double7 = pixelDensity2.verticalDensityInches();
        boolean boolean8 = pixelDensity2.isUnitless();
        double double9 = pixelDensity2.horizontalDensityInches();
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
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.3937007874015748d, (-15.500031000062002d));
        boolean boolean3 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(38.188976377952756d, 52.0d);
        double double3 = pixelDensity2.verticalDensityInches();
        double double4 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (byte) 0, 1.0d);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean5 = pixelDensity2.isUnitless();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 0, (double) (short) 100);
        double double3 = pixelDensity2.horizontalDensityMetres();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.getRawVerticalDensity();
        boolean boolean5 = pixelDensity2.isInMetres();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.horizontalDensityCentimetres();
        double double8 = pixelDensity2.horizontalDensityCentimetres();
        double double9 = pixelDensity2.getRawVerticalDensity();
        boolean boolean10 = pixelDensity2.isInMetres();
        double double11 = pixelDensity2.horizontalDensityMetres();
        double double12 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 39.37007874015748d + "'", double7 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 39.37007874015748d + "'", double8 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3937.0078740157483d + "'", double11 == 3937.0078740157483d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.0d, (-0.3937007874015748d));
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.horizontalDensityMetres();
        double double5 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-15.500031000062002d) + "'", double5 == (-15.500031000062002d));
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.3937007874015748d, 254.0d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.verticalDensityInches();
        double double5 = pixelDensity2.getRawVerticalDensity();
        double double6 = pixelDensity2.verticalDensityMetres();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 254.0d + "'", double3 == 254.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 254.0d + "'", double4 == 254.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 254.0d + "'", double5 == 254.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10000.0d + "'", double6 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(99.99999999999999d, 0.52d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (byte) 10, (double) (byte) 1);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(39.37007874015748d, (double) (-1L));
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean6 = pixelDensity2.isUnitless();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        double double8 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 39.37007874015748d + "'", double4 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 39.37007874015748d + "'", double5 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 39.37007874015748d + "'", double7 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-2.54d) + "'", double8 == (-2.54d));
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(8890.0d, 39.37007874015748d);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(3.937007874015748E-5d, 2.54d);
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.97d, 25.4d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(206.4512d, (-15.500031000062002d));
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 81.28d + "'", double3 == 81.28d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
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
        boolean boolean12 = pixelDensity2.isInInches();
        double double13 = pixelDensity2.verticalDensityCentimetres();
        double double14 = pixelDensity2.verticalDensityMetres();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (byte) 10, (double) (byte) -1);
        boolean boolean3 = pixelDensity2.isInInches();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.verticalDensityInches();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        double double7 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-2.54d) + "'", double5 == (-2.54d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(32.0d, 0.15500031000062d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1.0f), 3937.0078740157483d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        double double6 = pixelDensity2.verticalDensityInches();
        boolean boolean7 = pixelDensity2.isInMetres();
        boolean boolean8 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3937.0078740157483d + "'", double3 == 3937.0078740157483d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1550.0031000062002d + "'", double4 == 1550.0031000062002d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3937.0078740157483d + "'", double6 == 3937.0078740157483d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        double double6 = pixelDensity2.getRawVerticalDensity();
        double double7 = pixelDensity2.verticalDensityInches();
        double double8 = pixelDensity2.verticalDensityCentimetres();
        double double9 = pixelDensity2.horizontalDensityCentimetres();
        double double10 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.01d) + "'", double5 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.54d + "'", double7 == 2.54d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.01d) + "'", double9 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(25400.0d, 52.0d);
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.52d + "'", double4 == 0.52d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 254.0d + "'", double5 == 254.0d);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(6.4516d, (double) (byte) 0);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        java.lang.Class<?> wildcardClass4 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.15500031000062d, 0.97d);
        boolean boolean3 = pixelDensity2.isInInches();
        boolean boolean4 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean5 = pixelDensity2.isUnitless();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.verticalDensityInches();
        double double8 = pixelDensity2.getRawHorizontalDensity();
        double double9 = pixelDensity2.getRawVerticalDensity();
        double double10 = pixelDensity2.horizontalDensityMetres();
        double double11 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 1, (double) '#');
        double double3 = pixelDensity2.verticalDensityInches();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 13.779527559055119d + "'", double4 == 13.779527559055119d);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isInInches();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        double double7 = pixelDensity2.horizontalDensityCentimetres();
        double double8 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(393700.78740157484d, 2.54d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
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
        double double12 = pixelDensity2.verticalDensityInches();
        double double13 = pixelDensity2.horizontalDensityInches();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.54d + "'", double12 == 2.54d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-0.0254d) + "'", double13 == (-0.0254d));
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.horizontalDensityInches();
        double double8 = pixelDensity2.verticalDensityMetres();
        double double9 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean10 = pixelDensity2.isInInches();
        boolean boolean11 = pixelDensity2.isInMetres();
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
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        double double7 = pixelDensity2.verticalDensityMetres();
        double double8 = pixelDensity2.getRawVerticalDensity();
        boolean boolean9 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(3.937007874015748E-5d, (-15.500031000062002d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityInches();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        double double6 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.54d + "'", double3 == 2.54d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.01d) + "'", double4 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.01d) + "'", double5 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 39.37007874015748d + "'", double4 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-39.37007874015748d) + "'", double5 == (-39.37007874015748d));
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10L, 1.0d);
        boolean boolean3 = pixelDensity2.isInMetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        java.lang.Class<?> wildcardClass5 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.0d, 100.0d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(25.4d, 0.0d);
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (-1.0f), 0.06102374409473228d);
        double double3 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        double double7 = pixelDensity2.verticalDensityInches();
        double double8 = pixelDensity2.horizontalDensityCentimetres();
        double double9 = pixelDensity2.horizontalDensityInches();
        boolean boolean10 = pixelDensity2.isUnitless();
        double double11 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.3937007874015748d) + "'", double4 == (-0.3937007874015748d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3937007874015748d + "'", double5 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.3937007874015748d) + "'", double8 == (-0.3937007874015748d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.3937007874015748d + "'", double11 == 0.3937007874015748d);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(16.387064d, 610.237440947323d);
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean5 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(97.0d, Double.NEGATIVE_INFINITY);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.verticalDensityMetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isInMetres();
        double double8 = pixelDensity2.horizontalDensityInches();
        boolean boolean9 = pixelDensity2.isInInches();
        double double10 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 39.37007874015748d + "'", double5 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3937007874015748d + "'", double6 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((-0.01d), (-39.37007874015748d));
        double double3 = pixelDensity2.horizontalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityMetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        double double6 = pixelDensity2.horizontalDensityMetres();
        double double7 = pixelDensity2.horizontalDensityInches();
        boolean boolean8 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.NEGATIVE_INFINITY + "'", double5 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.NEGATIVE_INFINITY + "'", double7 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(3937.0078740157483d, (-0.0254d));
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10000.0d + "'", double3 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0254d) + "'", double4 == (-0.0254d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-2.54d) + "'", double5 == (-2.54d));
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(393700.78740157484d, 393700.7874015748d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.97d, 25400.0d);
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1000000.0d + "'", double3 == 1000000.0d);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.0d, 25.4d);
        double double3 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 100L, (double) (byte) 1);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(520000.0d, 0.1d);
        double double3 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.00254d + "'", double3 == 0.00254d);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean5 = pixelDensity2.isUnitless();
        boolean boolean6 = pixelDensity2.isUnitless();
        boolean boolean7 = pixelDensity2.isInMetres();
        double double8 = pixelDensity2.getRawHorizontalDensity();
        double double9 = pixelDensity2.horizontalDensityCentimetres();
        double double10 = pixelDensity2.verticalDensityMetres();
        double double11 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(1.0d, (double) 100L);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) 1L);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityMetres();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean7 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(155000.31000062d, 6.10237440947323E8d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (-1.0f), 3818.8976377952754d);
        boolean boolean3 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10L, 1.0d);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        double double5 = pixelDensity2.verticalDensityMetres();
        boolean boolean6 = pixelDensity2.isUnitless();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.4d + "'", double4 == 25.4d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(2.54E-4d, (double) 100L);
        double double3 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 254.0d + "'", double3 == 254.0d);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 0.0f, (-1.0E-4d));
        double double3 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) -1, 10000.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInMetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        double double8 = pixelDensity2.horizontalDensityCentimetres();
        double double9 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.01d) + "'", double8 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.0254d) + "'", double9 == (-0.0254d));
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(520000.0d, 2047.244094488189d);
        boolean boolean3 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(610.237440947323d, 3937.0078740157483d);
        double double3 = pixelDensity2.verticalDensityMetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.horizontalDensityInches();
        double double6 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3937.0078740157483d + "'", double3 == 3937.0078740157483d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.500031000062002d + "'", double5 == 15.500031000062002d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        boolean boolean3 = pixelDensity2.isInInches();
        java.lang.Class<?> wildcardClass4 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(3818.8976377952754d, 0.0d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(393.7007874015748d, 1.5500031000062002E7d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.0254d, 6.102374409473229d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0254d + "'", double3 == 0.0254d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0254d + "'", double4 == 0.0254d);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(39.37007874015748d, (double) ' ');
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.500031000062002d + "'", double3 == 15.500031000062002d);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) 10, 100000.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.getRawVerticalDensity();
        boolean boolean8 = pixelDensity2.isInInches();
        boolean boolean9 = pixelDensity2.isUnitless();
        boolean boolean10 = pixelDensity2.isUnitless();
        double double11 = pixelDensity2.verticalDensityCentimetres();
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
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1.0d, 0.3937007874015748d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) ' ', (double) (-1.0f));
        double double3 = pixelDensity2.horizontalDensityMetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        double double5 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3200.0d + "'", double3 == 3200.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3200.0d + "'", double5 == 3200.0d);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(13.779527559055119d, 3200.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) '#', 0.06451599999999999d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.horizontalDensityInches();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.horizontalDensityMetres();
        boolean boolean5 = pixelDensity2.isInMetres();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.0d, (double) (short) -1);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.verticalDensityMetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        double double7 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(25.4d, (double) (byte) 10);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 25.4d + "'", double3 == 25.4d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        boolean boolean5 = pixelDensity2.isUnitless();
        double double6 = pixelDensity2.verticalDensityInches();
        boolean boolean7 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 39.37007874015748d + "'", double3 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) (byte) 10);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) '#', 35.0d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 100, (double) 0.0f);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10L, (double) (byte) 10);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        boolean boolean5 = pixelDensity2.isInMetres();
        double double6 = pixelDensity2.getRawVerticalDensity();
        boolean boolean7 = pixelDensity2.isInInches();
        boolean boolean8 = pixelDensity2.isInMetres();
        boolean boolean9 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1000.0d + "'", double3 == 1000.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1000.0d + "'", double4 == 1000.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(88.9d, 3818.8976377952754d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 10, (-0.3937007874015748d));
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 100, 6.451599999999999d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (short) 1, 1320800.0d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(254.0d, (double) (short) -1);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean4 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 254.0d + "'", double3 == 254.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(Double.NaN, 1000.0d);
        double double3 = pixelDensity2.horizontalDensityInches();
        boolean boolean4 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(2.4025096100288303d, 20.47244094488189d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.254d, 35.0d);
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.horizontalDensityInches();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.006451600000000001d + "'", double3 == 0.006451600000000001d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.006451600000000001d + "'", double4 == 0.006451600000000001d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.254d + "'", double5 == 0.254d);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 100L, (double) (byte) 1);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 100L, (double) (short) 100);
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean5 = pixelDensity2.isUnitless();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.54d + "'", double3 == 2.54d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.9999999999999998d, (double) 100);
        double double3 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) ' ', (-610.237440947323d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0L, (double) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3937007874015748d + "'", double4 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(393.7007874015748d, 10.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(1000.0d, (double) (short) -1);
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 0, 100000.0d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100000.0d + "'", double3 == 100000.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (-1.0f), 393.7007874015748d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(Double.NEGATIVE_INFINITY, 0.06102374409473228d);
        boolean boolean3 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 10L, 0.0d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        boolean boolean5 = pixelDensity2.isUnitless();
        boolean boolean6 = pixelDensity2.isInMetres();
        boolean boolean7 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(10.0d, 1.0d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (short) -1, (double) '#');
        boolean boolean3 = pixelDensity2.isInInches();
        boolean boolean4 = pixelDensity2.isInMetres();
        java.lang.Class<?> wildcardClass5 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-39.37007874015748d), 3937.0078740157487d);
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(35.0d, (-1.0d));
        double double3 = pixelDensity2.horizontalDensityInches();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1.5500031000062002E7d, 0.0d);
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.06451599999999999d, 3500.0d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3500.0d + "'", double3 == 3500.0d);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1377.9527559055118d, 0.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.008128d, (-3937.0078740157483d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 100L, (double) (short) 100);
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.verticalDensityInches();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.54d + "'", double3 == 2.54d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.54d + "'", double5 == 2.54d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(88.9d, 0.1d);
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.03937007874015748d, 97.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(2.54d, (double) 0.0f);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.horizontalDensityMetres();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.54d + "'", double4 == 2.54d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        boolean boolean5 = pixelDensity2.isUnitless();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 39.37007874015748d + "'", double3 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(Double.POSITIVE_INFINITY, (double) (byte) -1);
        boolean boolean3 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean5 = pixelDensity2.isUnitless();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        double double8 = pixelDensity2.getRawVerticalDensity();
        double double9 = pixelDensity2.getRawVerticalDensity();
        double double10 = pixelDensity2.horizontalDensityMetres();
        double double11 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean12 = pixelDensity2.isInCentimetres();
        double double13 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean14 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(3818.8976377952754d, 0.01d);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean6 = pixelDensity2.isInInches();
        double double7 = pixelDensity2.getRawVerticalDensity();
        java.lang.Class<?> wildcardClass8 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.01d + "'", double7 == 0.01d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) 100, (double) 10.0f);
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        java.lang.Class<?> wildcardClass5 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(100.0d, (double) (short) -1);
        boolean boolean3 = pixelDensity2.isInMetres();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        double double6 = pixelDensity2.verticalDensityMetres();
        java.lang.Class<?> wildcardClass7 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.01d) + "'", double5 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(393.7007874015748d, (double) (byte) 100);
        boolean boolean3 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.15500031000062d, (-2.54d));
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(520000.0d, 3200.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityInches();
        boolean boolean6 = pixelDensity2.isUnitless();
        double double7 = pixelDensity2.verticalDensityInches();
        boolean boolean8 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.003937007874015748d, 520000.0d);
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(150350.3007006014d, 0.254d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.0d, Double.NaN);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.verticalDensityInches();
        double double5 = pixelDensity2.getRawVerticalDensity();
        double double6 = pixelDensity2.getRawVerticalDensity();
        double double7 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(3937.0078740157483d, 2.5399999999999994E-4d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.verticalDensityMetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isInMetres();
        double double8 = pixelDensity2.getRawHorizontalDensity();
        double double9 = pixelDensity2.horizontalDensityInches();
        double double10 = pixelDensity2.verticalDensityMetres();
        boolean boolean11 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 39.37007874015748d + "'", double5 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3937007874015748d + "'", double6 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 39.37007874015748d + "'", double10 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.0d, 0.003937007874015748d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.003937007874015748d + "'", double3 == 0.003937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(25.4d, (-2.54d));
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityInches();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        java.lang.Class<?> wildcardClass7 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.54d + "'", double3 == 2.54d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.01d) + "'", double4 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.01d) + "'", double5 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 0.0f, 393.7007874015748d);
        boolean boolean3 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(206.4512d, (double) 1L);
        boolean boolean3 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-0.064516d), 320000.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((-0.01d), (double) (short) -1);
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0L, (double) 1);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        boolean boolean5 = pixelDensity2.isUnitless();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        double double7 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3937007874015748d + "'", double6 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) (byte) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((-1.0d), 38.188976377952756d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 0.0f, 0.016387064000000003d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.getRawVerticalDensity();
        boolean boolean5 = pixelDensity2.isInMetres();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.horizontalDensityCentimetres();
        double double8 = pixelDensity2.horizontalDensityCentimetres();
        double double9 = pixelDensity2.getRawVerticalDensity();
        boolean boolean10 = pixelDensity2.isInMetres();
        double double11 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 39.37007874015748d + "'", double7 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 39.37007874015748d + "'", double8 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(25400.0d, 0.8128d);
        boolean boolean3 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(1.0d, 0.3937007874015748d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.getRawVerticalDensity();
        double double5 = pixelDensity2.horizontalDensityInches();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3937007874015748d + "'", double4 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.54d + "'", double5 == 2.54d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3937007874015748d + "'", double6 == 0.3937007874015748d);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(6.10237440947323E8d, 6102374.409473228d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(39.37007874015748d, (double) (-1L));
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.getRawVerticalDensity();
        boolean boolean5 = pixelDensity2.isInMetres();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean8 = pixelDensity2.isInInches();
        double double9 = pixelDensity2.horizontalDensityCentimetres();
        double double10 = pixelDensity2.verticalDensityInches();
        boolean boolean11 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 39.37007874015748d + "'", double9 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((-0.15500031000062d), 2.54d);
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 0, 32.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((-0.3937007874015748d), (-3937.0078740157483d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 100L, (double) (short) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 0.0f, 3.937007874015748E-5d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0, (double) (-1.0f));
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((-610.237440947323d), 0.03937007874015748d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.horizontalDensityInches();
        double double6 = pixelDensity2.verticalDensityMetres();
        double double7 = pixelDensity2.verticalDensityMetres();
        double double8 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.0254d) + "'", double5 == (-0.0254d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.54d + "'", double8 == 2.54d);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (byte) 10, 320000.0d);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.verticalDensityMetres();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        double double7 = pixelDensity2.verticalDensityInches();
        double double8 = pixelDensity2.horizontalDensityMetres();
        double double9 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(97.0d, (double) (-1));
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 1.0f, (-0.3937007874015748d));
        double double3 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.54d + "'", double3 == 2.54d);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(12.598425196850394d, (-100.0d));
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        double double8 = pixelDensity2.getRawVerticalDensity();
        double double9 = pixelDensity2.getRawHorizontalDensity();
        double double10 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean11 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(61023.74409473229d, 1320800.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        double double6 = pixelDensity2.getRawVerticalDensity();
        double double7 = pixelDensity2.horizontalDensityMetres();
        boolean boolean8 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.06102374409473228d, 0.09999999999999999d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) (byte) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.horizontalDensityMetres();
        boolean boolean6 = pixelDensity2.isInInches();
        boolean boolean7 = pixelDensity2.isInCentimetres();
        boolean boolean8 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((-6.4516E-4d), (-155000.31000062003d));
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.4516E-6d) + "'", double3 == (-6.4516E-6d));
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(610.237440947323d, 3937.0078740157483d);
        double double3 = pixelDensity2.verticalDensityMetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3937.0078740157483d + "'", double3 == 3937.0078740157483d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(5200.0d, 61023.74409473229d);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.3937007874015748d, (double) 10);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3937007874015748d + "'", double5 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3937007874015748d + "'", double6 == 0.3937007874015748d);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-100.0d), (double) (-1L));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 1L, Double.POSITIVE_INFINITY);
        double double3 = pixelDensity2.horizontalDensityInches();
        boolean boolean4 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.54d + "'", double3 == 2.54d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.0015500031000062d, 32.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(3818.8976377952754d, 1259.8425196850394d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1259.8425196850394d + "'", double3 == 1259.8425196850394d);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(3818.8976377952754d, 1000000.0d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1000000.0d + "'", double3 == 1000000.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1000000.0d + "'", double4 == 1000000.0d);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 0, (double) 100.0f);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (byte) 100, (-1.0d));
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((-610.237440947323d), 6.4516E-5d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (byte) 10, (double) (byte) -1);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.verticalDensityInches();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-2.54d) + "'", double4 == (-2.54d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.4d + "'", double6 == 25.4d);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 10.0f, 0.3937007874015748d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(320000.0d, (-0.15500031000062d));
        boolean boolean3 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (-1L), 0.008128d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10.0f, 2.54d);
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 25.4d + "'", double3 == 25.4d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.4d + "'", double4 == 25.4d);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(2.54d, (double) 0.0f);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.getRawVerticalDensity();
        double double5 = pixelDensity2.verticalDensityInches();
        double double6 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(38.188976377952756d, (double) (short) 10);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 0, 393700.7874015748d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((-1.0E-4d), 2.5399999999999994E-4d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(3818.8976377952754d, (-0.15500031000062d));
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 150350.3007006014d + "'", double4 == 150350.3007006014d);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.006451600000000001d, 0.016387064000000003d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) 1L);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean5 = pixelDensity2.isInInches();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        double double7 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean8 = pixelDensity2.isInInches();
        boolean boolean9 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(3200.0d, (double) (byte) 100);
        double double3 = pixelDensity2.verticalDensityInches();
        double double4 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.54d + "'", double3 == 2.54d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10L, (double) (byte) 10);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        double double5 = pixelDensity2.getRawVerticalDensity();
        double double6 = pixelDensity2.horizontalDensityInches();
        double double7 = pixelDensity2.horizontalDensityInches();
        boolean boolean8 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1000.0d + "'", double3 == 1000.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.4d + "'", double6 == 25.4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 25.4d + "'", double7 == 25.4d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(38.188976377952756d, 100000.0d);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1503.503007006014d + "'", double4 == 1503.503007006014d);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(1000000.0000000001d, 100000.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInInches();
        boolean boolean6 = pixelDensity2.isInInches();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) '4', 12.598425196850394d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) 1L);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        double double5 = pixelDensity2.horizontalDensityInches();
        boolean boolean6 = pixelDensity2.isInMetres();
        boolean boolean7 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(35.0d, (-0.3937007874015748d));
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(2047.244094488189d, (-1.0E-4d));
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(15.500031000062002d, Double.NaN);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.102374409473229d + "'", double3 == 6.102374409473229d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 610.237440947323d + "'", double4 == 610.237440947323d);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) 1.0f);
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
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
        boolean boolean12 = pixelDensity2.isInInches();
        double double13 = pixelDensity2.verticalDensityCentimetres();
        double double14 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean15 = pixelDensity2.isUnitless();
        double double16 = pixelDensity2.verticalDensityMetres();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + Double.POSITIVE_INFINITY + "'", double16 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(35.0d, 2540.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10, (-2.54d));
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-254.0d) + "'", double3 == (-254.0d));
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 100.0f, 0.0d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.horizontalDensityInches();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        double double7 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 39.37007874015748d + "'", double3 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.15500031000062d, (double) (-1L));
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(2.54d, 99.99999999999999d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(32.0d, 0.15500031000062d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 12.598425196850394d + "'", double3 == 12.598425196850394d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.15500031000062d + "'", double4 == 0.15500031000062d);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-2.54E-4d), Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(25400.0d, (-15.500031000062002d));
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-15.500031000062002d) + "'", double4 == (-15.500031000062002d));
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(3937.0078740157483d, (-0.064516d));
        double double3 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.4516E-4d) + "'", double3 == (-6.4516E-4d));
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 39.37007874015748d + "'", double5 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.254d, 35.0d);
        boolean boolean3 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((-1.0E-4d), 100.0d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) '#', (double) (short) 0);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.horizontalDensityMetres();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1377.9527559055118d + "'", double5 == 1377.9527559055118d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.0038188976377952757d, (double) 0L);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.32d, 0.35d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10L, (double) (byte) 10);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        double double6 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1000.0d + "'", double6 == 1000.0d);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (byte) 0, 10000.0d);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.horizontalDensityMetres();
        double double6 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10000.0d + "'", double4 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(16.387064d, 610.237440947323d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.0254d, 0.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityInches();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        double double7 = pixelDensity2.verticalDensityInches();
        double double8 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean9 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(25400.0d, 0.97d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.006451600000000001d, 0.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-0.0254d), (-0.003937007874015748d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 1.0f, (double) 10.0f);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(610.237440947323d, 97.0d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.getRawVerticalDensity();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        java.lang.Class<?> wildcardClass7 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.01d) + "'", double6 == (-0.01d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (byte) 1, 0.0d);
        boolean boolean3 = pixelDensity2.isInMetres();
        boolean boolean4 = pixelDensity2.isInInches();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }
}

