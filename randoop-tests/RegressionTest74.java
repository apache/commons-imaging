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
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        java.lang.String str4 = tiffImageMetadata1.toString("\thi!: \n\thi!: ");
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList5 = tiffImageMetadata1.getAllFields();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList6 = tiffImageMetadata1.getAllFields();
        org.junit.Assert.assertNotNull(tiffFieldList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tiffFieldList5);
        org.junit.Assert.assertNotNull(tiffFieldList6);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!", "\thi!: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        java.lang.Class<?> wildcardClass10 = gpsInfo8.getClass();
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        java.lang.String str15 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.longitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
        org.junit.Assert.assertNull(rationalNumber18);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        java.lang.String str4 = tiffImageMetadata1.toString("\thi!: \n\thi!: ");
        java.lang.String str6 = tiffImageMetadata1.toString("hi!");
        tiffImageMetadata1.add("\thi!: \thi!: ", "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: ");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents10 = tiffImageMetadata1.contents;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList11 = tiffImageMetadata1.getAllFields();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem cannot be cast to class org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory (org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem and org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(tiffContents10);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.latitudeDegrees;
        java.lang.String str19 = gpsInfo8.latitudeRef;
        java.lang.String str20 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
        org.junit.Assert.assertNull(rationalNumber18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("hi!", "\thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \n\thi!: hi!", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeMinutes;
        java.lang.String str14 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.latitudeDegrees;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeDegrees;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        java.lang.String str15 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber19 = gpsInfo8.latitudeDegrees;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
        org.junit.Assert.assertNull(rationalNumber18);
        org.junit.Assert.assertNull(rationalNumber19);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.latitudeDegrees;
        java.lang.String str19 = gpsInfo8.latitudeRef;
        java.lang.String str20 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
        org.junit.Assert.assertNull(rationalNumber18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ", "\thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        java.lang.String str16 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.longitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(rationalNumber17);
        org.junit.Assert.assertNull(rationalNumber18);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeMinutes;
        java.lang.String str17 = gpsInfo8.latitudeRef;
        java.lang.String str18 = gpsInfo8.latitudeRef;
        java.lang.String str19 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber20 = gpsInfo8.longitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(rationalNumber20);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
        org.junit.Assert.assertNull(rationalNumber18);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.longitudeRef;
        java.lang.String str14 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        java.lang.String str13 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeSeconds;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\t: \thi!: hi!", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeSeconds;
        java.lang.String str17 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        java.lang.String str11 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.longitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeDegrees;
        java.lang.String str14 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.latitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        java.lang.String str11 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeDegrees;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        java.lang.String str10 = gpsInfo8.latitudeRef;
        java.lang.Class<?> wildcardClass11 = gpsInfo8.getClass();
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        java.lang.String str15 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        java.lang.String str8 = tiffImageMetadata1.toString();
        java.lang.String str9 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray11 = tiffImageMetadata1.getFieldValue(tagInfoAscii10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\thi!: \n\thi!: " + "'", str8, "\thi!: \n\thi!: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\thi!: \n\thi!: " + "'", str9, "\thi!: \n\thi!: ");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        java.lang.String str15 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber19 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber20 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber21 = gpsInfo8.latitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
        org.junit.Assert.assertNull(rationalNumber18);
        org.junit.Assert.assertNull(rationalNumber19);
        org.junit.Assert.assertNull(rationalNumber20);
        org.junit.Assert.assertNull(rationalNumber21);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeDegrees;
        java.lang.String str13 = gpsInfo8.longitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        java.lang.String str3 = tiffImageMetadata1.toString();
        java.lang.String str5 = tiffImageMetadata1.toString("\thi!: \thi!: ");
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo6 = tiffImageMetadata1.getGpsInfo();
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents7 = tiffImageMetadata1.contents;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(gpsInfo6);
        org.junit.Assert.assertNull(tiffContents7);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: \thi!: ", "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \thi!: \nhi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        java.lang.String str4 = tiffImageMetadata1.toString("\thi!: \n\thi!: ");
        java.lang.String str6 = tiffImageMetadata1.toString("hi!");
        tiffImageMetadata1.add("\thi!: hi!\n\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ", "\thi!: hi!\n\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ");
        java.lang.String str10 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray12 = tiffImageMetadata1.getFieldValue(tagInfoRationals11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\t\thi!: hi!\n\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: : \thi!: hi!\n\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: " + "'", str10, "\t\thi!: hi!\n\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: : \thi!: hi!\n\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!", "\thi!: \thi!: \thi!: \n\t: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeMinutes;
        java.lang.String str17 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.longitudeDegrees;
        java.lang.String str19 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber20 = gpsInfo8.longitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            double double21 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(rationalNumber18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(rationalNumber20);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: ", "\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents8 = tiffImageMetadata1.contents;
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem9 = null;
        tiffImageMetadata1.add(imageMetadataItem9);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = tiffImageMetadata1.getFieldValue(tagInfoLongs11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tiffContents8);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: ", "\thi!: \thi!: \thi!: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeSeconds;
        java.lang.String str16 = gpsInfo8.longitudeRef;
        java.lang.String str17 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.longitudeDegrees;
        java.lang.String str19 = gpsInfo8.longitudeRef;
        java.lang.String str20 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(rationalNumber18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: ", "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        java.lang.String str13 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeMinutes;
        java.lang.String str17 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(rationalNumber18);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeDegrees;
        java.lang.String str17 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.latitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(rationalNumber18);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \thi!: \nhi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \thi!: ", "\thi!: \thi!: \thi!: \n\t: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        java.lang.String str3 = tiffImageMetadata1.toString();
        tiffImageMetadata1.add("\thi!: ", "\t\thi!: \thi!: : \thi!: \thi!: \thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts7 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray8 = tiffImageMetadata1.getFieldValue(tagInfoShorts7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!\n\t\thi!: \n\thi!: : ", "\thi!: hi!\n\t\thi!: \n\thi!: : ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: ", "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        java.lang.String str15 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(rationalNumber16);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        java.lang.String str11 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \n\thi!: \n\t: hi!\t\thi!: \thi!: : \thi!: \thi!: ", "\t\thi!: \thi!: : \thi!: \thi!: \n\thi!\thi!: hi!: \thi!: \thi!: \thi!: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeMinutes;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!\n\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ", "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \thi!: \nhi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \thi!: \t\thi!: : \thi!: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: ", "\thi!: \thi!: \thi!: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeDegrees;
        java.lang.String str17 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber19 = gpsInfo8.longitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(rationalNumber18);
        org.junit.Assert.assertNull(rationalNumber19);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: ", "\thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem7 = null;
        tiffImageMetadata1.add(imageMetadataItem7);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem9 = null;
        tiffImageMetadata1.add(imageMetadataItem9);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem11 = null;
        tiffImageMetadata1.add(imageMetadataItem11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = tiffImageMetadata1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeSeconds;
        java.lang.String str14 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeSeconds;
        java.lang.String str16 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        tiffImageMetadata1.add("\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: \thi!: \n\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: \thi!: hi!\n\t\thi!: \thi!: : hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: \t: ", "\thi!: \thi!: \t: \thi!: \thi!: ");
        org.junit.Assert.assertNotNull(tiffFieldList2);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeMinutes;
        java.lang.String str12 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.latitudeRef;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeSeconds;
        java.lang.String str16 = gpsInfo8.longitudeRef;
        java.lang.String str17 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(rationalNumber18);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str3 = tiffImageMetadata1.toString("\thi!: ");
        tiffImageMetadata1.add("\thi!: \n\thi!: ", "\thi!: \thi!: ");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents7 = tiffImageMetadata1.contents;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = tiffImageMetadata1.getFieldValue(tagInfoXpString8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(tiffContents7);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: ", "\thi!: \thi!: \thi!: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        java.lang.String str13 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeDegrees;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: ", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        java.lang.String str11 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = rationalNumber12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeMinutes;
        java.lang.String str13 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeMinutes;
        java.lang.String str14 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: \n\t: hi!", "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \thi!: \nhi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \thi!: \t\thi!: : \thi!: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "\thi!: \n\thi!: hi!\n\t\thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: \thi!: hi!: \thi!: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
    }
}

