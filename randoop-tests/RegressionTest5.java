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
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(6.4516d, 0.32d);
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isInInches();
        double double5 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.008128d + "'", double5 == 0.008128d);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(52.0d, 0.09999999999999999d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInMetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        double double8 = pixelDensity2.verticalDensityMetres();
        double double9 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.horizontalDensityInches();
        double double8 = pixelDensity2.verticalDensityCentimetres();
        double double9 = pixelDensity2.horizontalDensityCentimetres();
        double double10 = pixelDensity2.horizontalDensityMetres();
        boolean boolean11 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((-0.01d), (-39.37007874015748d));
        boolean boolean3 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (short) 0, 0.35d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(1.0d, (double) 100.0f);
        double double3 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0254d + "'", double3 == 0.0254d);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (byte) 10, (double) (short) 10);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.006451600000000001d, 0.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInMetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        double double8 = pixelDensity2.horizontalDensityCentimetres();
        double double9 = pixelDensity2.horizontalDensityMetres();
        boolean boolean10 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.01d) + "'", double8 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.889d, Double.NaN);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 0L, (double) 1);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean6 = pixelDensity2.isUnitless();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3937007874015748d + "'", double3 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3937007874015748d + "'", double5 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(6.102374409473229d, 0.1d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((-39.37007874015748d), 0.0025399999999999997d);
        double double3 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((-2.54d), 39.37007874015748d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 'a', (double) '#');
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.verticalDensityMetres();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.verticalDensityMetres();
        double double8 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10.0f, (double) (byte) 100);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.verticalDensityInches();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        boolean boolean6 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10, (double) (short) -1);
        double double3 = pixelDensity2.verticalDensityInches();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        java.lang.Class<?> wildcardClass6 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.54d) + "'", double3 == (-2.54d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(320000.0d, (double) (short) 0);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInInches();
        double double6 = pixelDensity2.verticalDensityMetres();
        double double7 = pixelDensity2.getRawVerticalDensity();
        boolean boolean8 = pixelDensity2.isUnitless();
        boolean boolean9 = pixelDensity2.isInMetres();
        boolean boolean10 = pixelDensity2.isInCentimetres();
        boolean boolean11 = pixelDensity2.isUnitless();
        double double12 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        double double7 = pixelDensity2.getRawVerticalDensity();
        double double8 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(254.0d, 520000.0d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 520000.0d + "'", double3 == 520000.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 520000.0d + "'", double4 == 520000.0d);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(6.102374409473229d, 610.2374409473229d);
        double double3 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 100L, (double) (short) 1);
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.horizontalDensityInches();
        boolean boolean5 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 254.0d + "'", double3 == 254.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 254.0d + "'", double4 == 254.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.254d, 5200.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(520000.0d, 6.4516d);
        boolean boolean3 = pixelDensity2.isInMetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(25400.0d, 10000.0d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10000.0d + "'", double3 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25400.0d + "'", double4 == 25400.0d);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.verticalDensityCentimetres();
        double double8 = pixelDensity2.getRawVerticalDensity();
        double double9 = pixelDensity2.getRawVerticalDensity();
        double double10 = pixelDensity2.horizontalDensityInches();
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
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.0254d, 25400.0d);
        double double3 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.0025399999999999997d, 0.025399999999999995d);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9999999999999998d + "'", double3 == 0.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.009999999999999998d + "'", double4 == 0.009999999999999998d);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 100L, (double) (byte) 1);
        double double3 = pixelDensity2.verticalDensityMetres();
        boolean boolean4 = pixelDensity2.isInInches();
        double double5 = pixelDensity2.horizontalDensityMetres();
        boolean boolean6 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(1.0d, 0.3937007874015748d);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        double double6 = pixelDensity2.horizontalDensityMetres();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean8 = pixelDensity2.isInMetres();
        java.lang.Class<?> wildcardClass9 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (short) -1, (double) 0L);
        boolean boolean3 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((-100.0d), Double.NaN);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((-100.0d), (double) (short) -1);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-39.37007874015748d) + "'", double3 == (-39.37007874015748d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.0025399999999999997d, (-100.0d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInMetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        double double7 = pixelDensity2.getRawHorizontalDensity();
        double double8 = pixelDensity2.horizontalDensityCentimetres();
        double double9 = pixelDensity2.horizontalDensityMetres();
        boolean boolean10 = pixelDensity2.isInInches();
        double double11 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.01d) + "'", double8 == (-0.01d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        double double7 = pixelDensity2.verticalDensityMetres();
        double double8 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 39.37007874015748d + "'", double5 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3937007874015748d + "'", double6 == 0.3937007874015748d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 39.37007874015748d + "'", double7 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.06102374409473228d, 0.35d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.verticalDensityInches();
        double double5 = pixelDensity2.getRawVerticalDensity();
        double double6 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-39.37007874015748d) + "'", double6 == (-39.37007874015748d));
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 100L, 39.37007874015748d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(88.9d, 0.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 100, (double) 1);
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isInMetres();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        double double6 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 39.37007874015748d + "'", double5 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(1000000.0d, (double) ' ');
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10L, 1.0d);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        double double5 = pixelDensity2.horizontalDensityMetres();
        boolean boolean6 = pixelDensity2.isInInches();
        double double7 = pixelDensity2.verticalDensityMetres();
        boolean boolean8 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.4d + "'", double4 == 25.4d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1000.0d + "'", double5 == 1000.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.01d, (-39.37007874015748d));
        double double3 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.01d + "'", double3 == 0.01d);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(1.5500031000062002E7d, (-1.0d));
        double double3 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.5500031000062002E7d + "'", double3 == 1.5500031000062002E7d);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
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
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.9999999999999998d, 2.4638d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (short) 0, (double) (-1L));
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-2.54d) + "'", double4 == (-2.54d));
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (-0.0254d));
        boolean boolean3 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        double double5 = pixelDensity2.verticalDensityInches();
        boolean boolean6 = pixelDensity2.isInMetres();
        boolean boolean7 = pixelDensity2.isInMetres();
        double double8 = pixelDensity2.horizontalDensityCentimetres();
        double double9 = pixelDensity2.horizontalDensityMetres();
        boolean boolean10 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.POSITIVE_INFINITY + "'", double8 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((-0.3937007874015748d), 1000.0d);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1000.0d + "'", double4 == 1000.0d);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
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
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.52d, (-0.0016387064d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
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
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.0038188976377952757d, 2047.244094488189d);
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.09999999999999999d, 0.0d);
        double double3 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
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
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(1000000.0d, 97.0d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 38.188976377952756d + "'", double3 == 38.188976377952756d);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
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
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.0d, (double) 100L);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.horizontalDensityMetres();
        double double6 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10000.0d + "'", double3 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10000.0d + "'", double4 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 254.0d + "'", double6 == 254.0d);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (byte) 100, (double) (short) -1);
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
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
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(520000.0d, (double) (-1L));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
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
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(645.16d, 2.54E-4d);
        double double3 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
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
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(3500.0d, 25400.0d);
        double double3 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3500.0d + "'", double3 == 3500.0d);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(254.0d, 2.54d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(3818.8976377952754d, 0.0d);
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(25.4d, (double) 'a');
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.9999999999999998d, (double) 100);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        double double7 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
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
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.0025399999999999997d, Double.NEGATIVE_INFINITY);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (short) -1, (double) 0L);
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
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
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
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
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean5 = pixelDensity2.isUnitless();
        boolean boolean6 = pixelDensity2.isInMetres();
        double double7 = pixelDensity2.verticalDensityInches();
        double double8 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean9 = pixelDensity2.isInCentimetres();
        boolean boolean10 = pixelDensity2.isInInches();
        double double11 = pixelDensity2.verticalDensityMetres();
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
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
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
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
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
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
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
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
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
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (-1L), (double) (byte) 1);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-39.37007874015748d) + "'", double4 == (-39.37007874015748d));
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1.0d, 0.3937007874015748d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-15.500031000062002d), 100.0d);
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10000.0d + "'", double4 == 10000.0d);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
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
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((-3937.0078740157483d), (double) '#');
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
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
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
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
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
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
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
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
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 100L, (double) (short) 1);
        double double3 = pixelDensity2.horizontalDensityInches();
        double double4 = pixelDensity2.verticalDensityInches();
        double double5 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 254.0d + "'", double3 == 254.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.54d + "'", double4 == 2.54d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (byte) 0, 3818.8976377952754d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3818.8976377952754d + "'", double3 == 3818.8976377952754d);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 100L, (double) (byte) 1);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(1377.9527559055118d, 0.003937007874015748d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean5 = pixelDensity2.isUnitless();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        double double7 = pixelDensity2.getRawVerticalDensity();
        double double8 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
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
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-100.0d), 52.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((-15.500031000062002d), 81.28d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.15500031000062d, 0.97d);
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-0.0016387064d), 100.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-610.237440947323d), 25.4d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 1.0f, (-0.0015500031000061998d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.15500031000062d, 1.5500031000062002E7d);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.15500031000062d + "'", double4 == 0.15500031000062d);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(38.188976377952756d, 0.9999999999999998d);
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 99.99999999999999d + "'", double3 == 99.99999999999999d);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(10.0d, (double) (short) 100);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 10, (-0.3937007874015748d));
        double double3 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.15500031000062d) + "'", double3 == (-0.15500031000062d));
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1.0d, 350000.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
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
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(520000.0d, Double.NaN);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1.5500031000062002E7d, 3500.0d);
        double double3 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (byte) -1, 10.0d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.937007874015748d + "'", double3 == 3.937007874015748d);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
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
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (byte) 100, (double) 'a');
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3818.8976377952754d + "'", double3 == 3818.8976377952754d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 39.37007874015748d + "'", double4 == 39.37007874015748d);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.06102374409473228d, 204724.4094488189d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
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
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
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
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(25.4d, (-2.54d));
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-2.54d) + "'", double4 == (-2.54d));
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
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
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(3818.8976377952754d, (double) '#');
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3818.8976377952754d + "'", double3 == 3818.8976377952754d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1.0d, 35.0d);
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.verticalDensityInches();
        boolean boolean6 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 0L, (double) (short) -1);
        boolean boolean3 = pixelDensity2.isUnitless();
        boolean boolean4 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.3937007874015748d, 0.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(2.54d, 0.0d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean4 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.54d + "'", double3 == 2.54d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.016387064000000003d, 10000.000000000002d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 0L, (double) (-1.0f));
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
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
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
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
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 'a', 10000.0d);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.verticalDensityInches();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10000.0d + "'", double4 == 10000.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3937.0078740157483d + "'", double6 == 3937.0078740157483d);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) 1, (-100.0d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
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
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
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
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.0d, (double) (-1));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.3937007874015748d, 1.0d);
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((-0.0016387064d), 10000.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(25400.0d, 0.97d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
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
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
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
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.09999999999999999d, 25.4d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
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
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(3500.0d, 0.52d);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.52d + "'", double3 == 0.52d);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) '#', (double) (short) 0);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.horizontalDensityInches();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        boolean boolean6 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.38188976377952755d, 0.0d);
        boolean boolean3 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
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
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
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
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
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
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(3200.0d, 0.01d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.35d, 0.97d);
        double double3 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
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
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(38.188976377952756d, 100000.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.0d, 0.32d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(393700.7874015748d, (double) (short) -1);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3937.007874015748d + "'", double3 == 3937.007874015748d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10000.0d + "'", double4 == 10000.0d);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
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
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
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
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 100.0f, 0.008128d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
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
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 100.0f, 320000.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((-100.0d), Double.NaN);
        double double3 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(3937.0078740157483d, (double) (short) 1);
        double double3 = pixelDensity2.horizontalDensityMetres();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 155000.31000062003d + "'", double3 == 155000.31000062003d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1550.0031000062002d + "'", double4 == 1550.0031000062002d);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
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
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
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
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
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
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (byte) 1, 8128.0d);
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 320000.0d + "'", double3 == 320000.0d);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.003937007874015748d, 520000.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
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
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((-0.01d), (double) 0);
        double double3 = pixelDensity2.verticalDensityInches();
        double double4 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-2.54E-4d) + "'", double4 == (-2.54E-4d));
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1.0d, 0.0d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
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
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
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
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
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
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
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
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
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
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
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
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
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
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.06451599999999999d, 0.06102374409473228d);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.0d, 2.54d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(15.500031000062002d, 610.237440947323d);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        double double5 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.500031000062002d + "'", double4 == 15.500031000062002d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 61023.74409473229d + "'", double5 == 61023.74409473229d);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(97.0d, 320000.0d);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        boolean boolean3 = pixelDensity2.isInInches();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        boolean boolean5 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.0025399999999999997d, 0.254d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.0015500031000062d, 393700.78740157484d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(3200.0d, 1.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
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
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
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
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(3937.007874015748d, (-0.0015500031000061998d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(Double.POSITIVE_INFINITY, 0.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(206.4512d, 64516.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(1000.0d, (-0.0015500031000061998d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
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
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.003937007874015748d, 610.237440947323d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.06102374409473228d, (-0.15500031000062d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
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
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
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
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
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
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((-61023.74409473229d), (double) 10.0f);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.0d, 610.237440947323d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
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
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.32d, 204724.4094488189d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.016387064000000003d, (double) '#');
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) 10, (double) 10);
        double double3 = pixelDensity2.horizontalDensityMetres();
        double double4 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.254d + "'", double4 == 0.254d);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10L, (double) (byte) 10);
        double double3 = pixelDensity2.verticalDensityMetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        double double5 = pixelDensity2.getRawVerticalDensity();
        double double6 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1000.0d + "'", double3 == 1000.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.4d + "'", double6 == 25.4d);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(3937.0078740157483d, (-0.0254d));
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3937.0078740157483d + "'", double4 == 3937.0078740157483d);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(1.5500031000062002E7d, 155000.31000062003d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(81.28d, (double) 1);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(10.0d, 1.0d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1000.0d + "'", double4 == 1000.0d);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
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
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
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
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(6.4516d, 0.32d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.06451599999999999d + "'", double3 == 0.06451599999999999d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.889d, (double) '#');
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
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
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-0.01d), 64516.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, 610.237440947323d);
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
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
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
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
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
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
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
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
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.01d, 0.003937007874015748d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
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
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(6.4516d, 393700.7874015748d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isInInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.4516d + "'", double3 == 6.4516d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1.0f, (double) '#');
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(100.0d, 6.102374409473229d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
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
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.32d, (double) 0.0f);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(0.025399999999999995d, 0.1d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (byte) 1, (double) '#');
        double double3 = pixelDensity2.horizontalDensityMetres();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.0d, (-0.0016387064d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean5 = pixelDensity2.isUnitless();
        boolean boolean6 = pixelDensity2.isUnitless();
        boolean boolean7 = pixelDensity2.isInMetres();
        double double8 = pixelDensity2.getRawHorizontalDensity();
        double double9 = pixelDensity2.horizontalDensityCentimetres();
        double double10 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(10000.0d, 0.64516d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(97.0d, Double.POSITIVE_INFINITY);
        double double3 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 0, 64516.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 10, (double) 10);
        double double3 = pixelDensity2.getRawVerticalDensity();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.getRawVerticalDensity();
        double double6 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean7 = pixelDensity2.isUnitless();
        boolean boolean8 = pixelDensity2.isUnitless();
        double double9 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
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
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
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
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (short) 0, (-1.0d));
        double double3 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((-15.500031000062002d), Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(0.38188976377952755d, 25400.0d);
        java.lang.Class<?> wildcardClass3 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (byte) 1, 0.0d);
        double double3 = pixelDensity2.verticalDensityInches();
        double double4 = pixelDensity2.horizontalDensityInches();
        double double5 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((-100.0d), 0.52d);
        boolean boolean3 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(97.0d, 520000.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
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
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
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
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 0, (double) (short) 100);
        double double3 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(610.2374409473229d, (double) 100.0f);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
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
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
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
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(100.0d, (double) (short) -1);
        boolean boolean3 = pixelDensity2.isInInches();
        double double4 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.01d) + "'", double4 == (-0.01d));
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
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
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
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
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
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
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) (byte) -1, 320000.0d);
        double double3 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-39.37007874015748d) + "'", double3 == (-39.37007874015748d));
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(100000.0d, 0.97d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.97d + "'", double3 == 0.97d);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(0.01d, (double) '4');
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(1.0d, 0.3937007874015748d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        double double4 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3937007874015748d + "'", double4 == 0.3937007874015748d);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
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
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 0L, 64516.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
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
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
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
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
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
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (byte) 10, (double) (byte) 1);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
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
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
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
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(10.0d, 393700.78740157484d);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.937007874015748d + "'", double3 == 3.937007874015748d);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        boolean boolean3 = pixelDensity2.isInCentimetres();
        double double4 = pixelDensity2.verticalDensityMetres();
        boolean boolean5 = pixelDensity2.isUnitless();
        boolean boolean6 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((-6.4516E-4d), 0.64516d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 0L, (-0.064516d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(393700.78740157484d, 0.016387064000000003d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) '4', (-0.15500031000062d));
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1.0d, 0.0d);
        boolean boolean3 = pixelDensity2.isInInches();
        boolean boolean4 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(2.54d, 35.0d);
        boolean boolean3 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (byte) 10, (double) (byte) -1);
        boolean boolean3 = pixelDensity2.isInInches();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        double double5 = pixelDensity2.verticalDensityInches();
        double double6 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-2.54d) + "'", double5 == (-2.54d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
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
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((-39.37007874015748d), 254.0d);
        double double3 = pixelDensity2.verticalDensityMetres();
        boolean boolean4 = pixelDensity2.isInCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 25400.0d + "'", double3 == 25400.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(393700.7874015748d, (double) (byte) -1);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.3937007874015748d) + "'", double3 == (-0.3937007874015748d));
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(6.4516d, 52.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 0.0f, 393.7007874015748d);
        double double3 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 393.7007874015748d + "'", double3 == 393.7007874015748d);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(1000000.0d, Double.NEGATIVE_INFINITY);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10000.0d + "'", double3 == 10000.0d);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 'a', 10000.0d);
        boolean boolean3 = pixelDensity2.isInMetres();
        double double4 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10000.0d + "'", double4 == 10000.0d);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
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
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
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
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) ' ', (double) (-1.0f));
        double double3 = pixelDensity2.horizontalDensityMetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        double double5 = pixelDensity2.horizontalDensityInches();
        double double6 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3200.0d + "'", double3 == 3200.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 81.28d + "'", double5 == 81.28d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3200.0d + "'", double6 == 3200.0d);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
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
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (byte) 10, (-0.3937007874015748d));
        boolean boolean3 = pixelDensity2.isInMetres();
        java.lang.Class<?> wildcardClass4 = pixelDensity2.getClass();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
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
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(0.3937007874015748d, 15.500031000062002d);
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 610.237440947323d + "'", double3 == 610.237440947323d);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
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
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((-0.3937007874015748d), (-155000.31000062003d));
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-61023.74409473229d) + "'", double3 == (-61023.74409473229d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (short) -1, 393700.7874015748d);
        boolean boolean3 = pixelDensity2.isUnitless();
        double double4 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 393700.7874015748d + "'", double4 == 393700.7874015748d);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre(206.4512d, 254.0d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
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
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch(3500.0d, (-0.0254d));
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1377.9527559055118d + "'", double3 == 1377.9527559055118d);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
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
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 1L, Double.POSITIVE_INFINITY);
        double double3 = pixelDensity2.verticalDensityInches();
        double double4 = pixelDensity2.getRawHorizontalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre(64516.0d, 0.003937007874015748d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
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
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) 100, (double) 10.0f);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) 10L, 1.0d);
        double double3 = pixelDensity2.getRawHorizontalDensity();
        boolean boolean4 = pixelDensity2.isInMetres();
        boolean boolean5 = pixelDensity2.isInInches();
        double double6 = pixelDensity2.horizontalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.4d + "'", double6 == 25.4d);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((-0.0015500031000061998d), (double) ' ');
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((-15.500031000062002d), 0.0d);
        double double3 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerMetre((double) (byte) -1, (double) 100.0f);
        double double3 = pixelDensity2.verticalDensityCentimetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        boolean boolean5 = pixelDensity2.isInInches();
        boolean boolean6 = pixelDensity2.isInInches();
        double double7 = pixelDensity2.getRawVerticalDensity();
        boolean boolean8 = pixelDensity2.isInInches();
        double double9 = pixelDensity2.horizontalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
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
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
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
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) (-1), (double) 1.0f);
        double double3 = pixelDensity2.verticalDensityMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerInch((double) 10L, (double) (short) 1);
        double double3 = pixelDensity2.getRawVerticalDensity();
        double double4 = pixelDensity2.verticalDensityMetres();
        double double5 = pixelDensity2.verticalDensityInches();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 39.37007874015748d + "'", double4 == 39.37007874015748d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
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
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((-0.0015500031000061998d), 206.4512d);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(1.0d, (double) 0L);
        double double3 = pixelDensity2.horizontalDensityCentimetres();
        double double4 = pixelDensity2.getRawVerticalDensity();
        boolean boolean5 = pixelDensity2.isInCentimetres();
        double double6 = pixelDensity2.horizontalDensityMetres();
        boolean boolean7 = pixelDensity2.isInMetres();
        boolean boolean8 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
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
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless((double) 1L, (double) 10.0f);
        org.junit.Assert.assertNotNull(pixelDensity2);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
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
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createFromPixelsPerCentimetre((double) (short) -1, (double) 0L);
        boolean boolean3 = pixelDensity2.isInMetres();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        org.apache.commons.imaging.PixelDensity pixelDensity2 = org.apache.commons.imaging.PixelDensity.createUnitless(81.28d, (double) 0.0f);
        double double3 = pixelDensity2.horizontalDensityMetres();
        boolean boolean4 = pixelDensity2.isUnitless();
        org.junit.Assert.assertNotNull(pixelDensity2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }
}

