import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.apache.commons.imaging.formats.tiff.TiffField tiffField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffImageMetadata.TiffMetadataItem tiffMetadataItem1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.TiffMetadataItem(tiffField0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = tiffImageMetadata1.getFieldValue(tagInfo2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray5 = tiffImageMetadata1.getFieldValue(tagInfoSRationals4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes tagInfoSBytes4 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = tiffImageMetadata1.getFieldValue(tagInfoSBytes4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats tagInfoFloats4 = null;
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray5 = tiffImageMetadata1.getFieldValue(tagInfoFloats4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte4 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = tiffImageMetadata1.getFieldValue(tagInfoByte4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = tiffImageMetadata1.getFieldValue(tagInfoXpString4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = tiffImageMetadata1.getFieldValue(tagInfoXpString2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        java.lang.Class<?> wildcardClass4 = tiffImageMetadata1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes tagInfoSBytes8 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = tiffImageMetadata1.getFieldValue(tagInfoSBytes8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats tagInfoFloats5 = null;
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray6 = tiffImageMetadata1.getFieldValue(tagInfoFloats5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts8 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray9 = tiffImageMetadata1.getFieldValue(tagInfoSShorts8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = tiffImageMetadata1.getFieldValue(tagInfoDoubles2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo5 = tiffImageMetadata1.getGpsInfo();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem cannot be cast to class org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory (org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem and org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs tagInfoSLongs2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = tiffImageMetadata1.getFieldValue(tagInfoSLongs2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = tiffImageMetadata1.getFieldValue(tagInfoDoubles5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory5 = tiffImageMetadata1.findDirectory(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray6 = tiffImageMetadata1.getFieldValue(tagInfoSRationals5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts2 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray3 = tiffImageMetadata1.getFieldValue(tagInfoSShorts2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte2 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray3 = tiffImageMetadata1.getFieldValue(tagInfoByte2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte5 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray6 = tiffImageMetadata1.getFieldValue(tagInfoByte5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = tiffImageMetadata1.getFieldValue(tagInfo4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray9 = tiffImageMetadata1.getFieldValue(tagInfoRationals8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = tiffImageMetadata1.getFieldValue(tagInfoXpString8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = tiffImageMetadata1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray5 = tiffImageMetadata1.getFieldValue(tagInfoRationals4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
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
        // The following exception was thrown during execution in test generation
        try {
            double double12 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory9 = tiffImageMetadata1.findDirectory((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem cannot be cast to class org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory (org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem and org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = tiffImageMetadata1.getGpsInfo();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem cannot be cast to class org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory (org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem and org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray6 = tiffImageMetadata1.getFieldValue(tagInfoAscii5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray6 = tiffImageMetadata1.getFieldValue(tagInfoRationals5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
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
        // The following exception was thrown during execution in test generation
        try {
            double double12 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList8 = tiffImageMetadata1.getAllFields();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem cannot be cast to class org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory (org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem and org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = tiffImageMetadata1.getFieldValue(tagInfoLongs8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = rationalNumber10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory9 = tiffImageMetadata1.findDirectory((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem cannot be cast to class org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory (org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem and org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.nio.ByteOrder byteOrder0 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffImageMetadata.Directory directory2 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.Directory(byteOrder0, tiffDirectory1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("\thi!: ", "hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = tiffImageMetadata1.getFieldValue(tagInfoXpString11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray3 = tiffImageMetadata1.getFieldValue(tagInfoAscii2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str3 = tiffImageMetadata1.toString("\thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = tiffImageMetadata1.getFieldValue(tagInfo4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("hi!", "\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffField tiffField3 = tiffImageMetadata1.findField(tagInfo2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("\thi!: ", "hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray12 = tiffImageMetadata1.getFieldValue(tagInfoSRationals11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("hi!", "\thi!: ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = tiffImageMetadata1.toString("\thi!: \thi!: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("hi!", "\thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats tagInfoFloats7 = null;
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray8 = tiffImageMetadata1.getFieldValue(tagInfoFloats7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: ", "\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("hi!", "\thi!: ");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList7 = tiffImageMetadata1.getAllFields();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("hi!", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem5 = null;
        tiffImageMetadata1.add(imageMetadataItem5);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts7 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray8 = tiffImageMetadata1.getFieldValue(tagInfoShorts7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte7 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = tiffImageMetadata1.getFieldValue(tagInfoByte7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
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
        // The following exception was thrown during execution in test generation
        try {
            double double13 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem5 = null;
        tiffImageMetadata1.add(imageMetadataItem5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo7 = tiffImageMetadata1.getGpsInfo();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem cannot be cast to class org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory (org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem and org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.latitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo4 = tiffImageMetadata1.getGpsInfo();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem7 = null;
        tiffImageMetadata1.add(imageMetadataItem7);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = tiffImageMetadata1.getFieldValue(tagInfoXpString9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = rationalNumber13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = tiffImageMetadata1.getFieldValue(tagInfoGpsText2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory9 = tiffImageMetadata1.findDirectory((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem cannot be cast to class org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory (org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem and org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
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
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem5 = null;
        tiffImageMetadata1.add(imageMetadataItem5);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = tiffImageMetadata1.getFieldValue(tagInfoGpsText7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("hi!", "\thi!: ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = tiffImageMetadata1.toString("\thi!: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList5 = tiffImageMetadata1.getAllFields();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem cannot be cast to class org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory (org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem and org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.latitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        java.lang.String str3 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = tiffImageMetadata1.getFieldValue(tagInfoLongs4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
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
        // The following exception was thrown during execution in test generation
        try {
            double double14 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str3 = tiffImageMetadata1.toString("\thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = tiffImageMetadata1.getFieldValue(tagInfoLongs4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffField tiffField6 = tiffImageMetadata1.findField(tagInfo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
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
        java.lang.String str15 = gpsInfo8.longitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = gpsInfo8.getLongitudeAsDegreesEast();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("\thi!: ", "hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray12 = tiffImageMetadata1.getFieldValue(tagInfoRationals11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("\thi!: ", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList11 = tiffImageMetadata1.getAllFields();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem cannot be cast to class org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory (org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem and org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem7 = null;
        tiffImageMetadata1.add(imageMetadataItem7);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = tiffImageMetadata1.getFieldValue(tagInfoLongs9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("\thi!: ", "hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte11 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = tiffImageMetadata1.getFieldValue(tagInfoByte11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
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
        java.lang.Class<?> wildcardClass14 = gpsInfo8.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray3 = tiffImageMetadata1.getFieldValue(tagInfoRationals2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = tiffImageMetadata1.getFieldValue(tagInfoGpsText4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory5 = tiffImageMetadata1.findDirectory(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray4 = tiffImageMetadata1.getFieldValue(tagInfoLongs3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        java.lang.Class<?> wildcardClass10 = gpsInfo8.getClass();
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffField tiffField9 = tiffImageMetadata1.findField(tagInfo7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts2 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray3 = tiffImageMetadata1.getFieldValue(tagInfoShorts2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem5 = null;
        tiffImageMetadata1.add(imageMetadataItem5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList7 = tiffImageMetadata1.getAllFields();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem cannot be cast to class org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory (org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem and org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("", "hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffField tiffField12 = tiffImageMetadata1.findField(tagInfo11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
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
        // The following exception was thrown during execution in test generation
        try {
            double double15 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
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
        // The following exception was thrown during execution in test generation
        try {
            double double14 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
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
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("\thi!: ", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo11 = tiffImageMetadata1.getGpsInfo();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem cannot be cast to class org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory (org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem and org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = tiffImageMetadata1.getFieldValue(tagInfoDoubles4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList7 = tiffImageMetadata1.getAllFields();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem7 = null;
        tiffImageMetadata1.add(imageMetadataItem7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList9 = tiffImageMetadata1.getAllFields();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "\thi!: \thi!: \thi!: \n\t: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem7 = null;
        tiffImageMetadata1.add(imageMetadataItem7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = tiffImageMetadata1.toString("\thi!: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \n\thi!: ", "\thi!: \n\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = gpsInfo8.getLongitudeAsDegreesEast();
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
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem5 = null;
        tiffImageMetadata1.add(imageMetadataItem5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet7 = tiffImageMetadata1.getOutputSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        java.lang.String str8 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray10 = tiffImageMetadata1.getFieldValue(tagInfoSRationals9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\thi!: \n\thi!: " + "'", str8, "\thi!: \n\thi!: ");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        java.lang.String str4 = tiffImageMetadata1.toString("\thi!: \n\thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats tagInfoFloats5 = null;
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray6 = tiffImageMetadata1.getFieldValue(tagInfoFloats5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
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
        // The following exception was thrown during execution in test generation
        try {
            double double12 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        java.lang.String str8 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats tagInfoFloats9 = null;
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray10 = tiffImageMetadata1.getFieldValue(tagInfoFloats9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\thi!: \n\thi!: " + "'", str8, "\thi!: \n\thi!: ");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        java.lang.Class<?> wildcardClass8 = tiffImageMetadata1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("hi!", "\thi!: ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = tiffImageMetadata1.toString("\thi!: \thi!: \thi!: \n\t: hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem4 = null;
        tiffImageMetadata1.add(imageMetadataItem4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = tiffImageMetadata1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo3 = tiffImageMetadata1.getGpsInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts4 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray5 = tiffImageMetadata1.getFieldValue(tagInfoSShorts4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
        org.junit.Assert.assertNull(gpsInfo3);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str3 = tiffImageMetadata1.toString("\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem4 = null;
        tiffImageMetadata1.add(imageMetadataItem4);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffField tiffField7 = tiffImageMetadata1.findField(tagInfo6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = rationalNumber9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = gpsInfo8.getLongitudeAsDegreesEast();
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
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!", "\thi!: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
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
        java.lang.Class<?> wildcardClass14 = gpsInfo8.getClass();
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte3 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray4 = tiffImageMetadata1.getFieldValue(tagInfoByte3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
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
        // The following exception was thrown during execution in test generation
        try {
            double double14 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = gpsInfo8.toString();
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
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes tagInfoSBytes2 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray3 = tiffImageMetadata1.getFieldValue(tagInfoSBytes2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str3 = tiffImageMetadata1.toString("\thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs tagInfoSLongs4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = tiffImageMetadata1.getFieldValue(tagInfoSLongs4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem7 = null;
        tiffImageMetadata1.add(imageMetadataItem7);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffField tiffField10 = tiffImageMetadata1.findField(tagInfo9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory4 = tiffImageMetadata1.findDirectory((int) ' ');
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = tiffImageMetadata1.getFieldValue(tagInfoDoubles5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(tiffDirectory4);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
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
        // The following exception was thrown during execution in test generation
        try {
            double double12 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeMinutes;
        java.lang.String str14 = gpsInfo8.longitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeDegrees;
        java.lang.String str14 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("", "hi!");
        java.lang.String str11 = tiffImageMetadata1.toString();
        java.lang.Class<?> wildcardClass12 = tiffImageMetadata1.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!: \n\thi!: \n\t: hi!" + "'", str11, "\thi!: \n\thi!: \n\t: hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \n\thi!: ", "\thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("", "hi!");
        java.lang.String str11 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs tagInfoSLongs12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = tiffImageMetadata1.getFieldValue(tagInfoSLongs12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!: \n\thi!: \n\t: hi!" + "'", str11, "\thi!: \n\thi!: \n\t: hi!");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.Class<?> wildcardClass9 = gpsInfo8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
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
        // The following exception was thrown during execution in test generation
        try {
            double double18 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
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
        // The following exception was thrown during execution in test generation
        try {
            double double16 = gpsInfo8.getLatitudeAsDegreesNorth();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str3 = tiffImageMetadata1.toString("\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem4 = null;
        tiffImageMetadata1.add(imageMetadataItem4);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffField tiffField8 = tiffImageMetadata1.findField(tagInfo6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
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
        java.lang.String str13 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem7 = null;
        tiffImageMetadata1.add(imageMetadataItem7);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem9 = null;
        tiffImageMetadata1.add(imageMetadataItem9);
        tiffImageMetadata1.add("hi!", "\thi!: hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats tagInfoFloats14 = null;
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray15 = tiffImageMetadata1.getFieldValue(tagInfoFloats14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeDegrees;
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
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!", "\thi!: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("hi!", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo3 = tiffImageMetadata1.getGpsInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet4 = tiffImageMetadata1.getOutputSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
        org.junit.Assert.assertNull(gpsInfo3);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        java.lang.String str3 = tiffImageMetadata1.toString();
        java.lang.String str5 = tiffImageMetadata1.toString("\thi!: \thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray7 = tiffImageMetadata1.getFieldValue(tagInfoSRationals6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem5 = null;
        tiffImageMetadata1.add(imageMetadataItem5);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes tagInfoSBytes7 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = tiffImageMetadata1.getFieldValue(tagInfoSBytes7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        java.lang.String str4 = tiffImageMetadata1.toString("\thi!: \n\thi!: ");
        java.lang.String str6 = tiffImageMetadata1.toString("hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = tiffImageMetadata1.getFieldValue(tagInfo7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
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
        // The following exception was thrown during execution in test generation
        try {
            double double12 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeDegrees;
        java.lang.String str14 = gpsInfo8.longitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet4 = tiffImageMetadata1.getOutputSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem5 = null;
        tiffImageMetadata1.add(imageMetadataItem5);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = tiffImageMetadata1.getFieldValue(tagInfoXpString7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory4 = tiffImageMetadata1.findDirectory((int) ' ');
        tiffImageMetadata1.add("\thi!: ", "\thi!: \thi!: \thi!: ");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory9 = tiffImageMetadata1.findDirectory((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem cannot be cast to class org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory (org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem and org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(tiffDirectory4);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        java.lang.String str8 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffField tiffField10 = tiffImageMetadata1.findField(tagInfo9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\thi!: \n\thi!: " + "'", str8, "\thi!: \n\thi!: ");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = tiffImageMetadata1.getFieldValue(tagInfoXpString7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
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
        // The following exception was thrown during execution in test generation
        try {
            double double16 = gpsInfo8.getLatitudeAsDegreesNorth();
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
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem7 = null;
        tiffImageMetadata1.add(imageMetadataItem7);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem9 = null;
        tiffImageMetadata1.add(imageMetadataItem9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = tiffImageMetadata1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
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
        java.lang.Class<?> wildcardClass14 = gpsInfo8.getClass();
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        java.lang.String str3 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts4 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray5 = tiffImageMetadata1.getFieldValue(tagInfoShorts4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory4 = tiffImageMetadata1.findDirectory((int) ' ');
        tiffImageMetadata1.add("\thi!: ", "\thi!: \thi!: \thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray9 = tiffImageMetadata1.getFieldValue(tagInfoRationals8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(tiffDirectory4);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
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
        java.lang.Class<?> wildcardClass16 = gpsInfo8.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "\thi!: \n\thi!: \n\t: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeMinutes;
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
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = tiffImageMetadata1.getFieldValue(tagInfoAscii7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("hi!", "\thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray8 = tiffImageMetadata1.getFieldValue(tagInfoRationals7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem5 = null;
        tiffImageMetadata1.add(imageMetadataItem5);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = tiffImageMetadata1.getFieldValue(tagInfoLongs7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = gpsInfo8.toString();
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
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = rationalNumber17.getClass();
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
        org.junit.Assert.assertNull(rationalNumber17);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("hi!\thi!: hi!", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory4 = tiffImageMetadata1.findDirectory((int) ' ');
        tiffImageMetadata1.add("\thi!: ", "\thi!: \thi!: \thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = tiffImageMetadata1.getFieldValue(tagInfoDoubles8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(tiffDirectory4);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = gpsInfo8.getLongitudeAsDegreesEast();
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
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("", "hi!");
        java.lang.String str11 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = tiffImageMetadata1.findField(tagInfo12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!: \n\thi!: \n\t: hi!" + "'", str11, "\thi!: \n\thi!: \n\t: hi!");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("", "hi!");
        java.lang.String str11 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = tiffImageMetadata1.getFieldValue(tagInfoXpString12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!: \n\thi!: \n\t: hi!" + "'", str11, "\thi!: \n\thi!: \n\t: hi!");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.Class<?> wildcardClass9 = gpsInfo8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem7 = null;
        tiffImageMetadata1.add(imageMetadataItem7);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem9 = null;
        tiffImageMetadata1.add(imageMetadataItem9);
        tiffImageMetadata1.add("hi!", "\thi!: hi!");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem14 = null;
        tiffImageMetadata1.add(imageMetadataItem14);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = tiffImageMetadata1.getFieldValue(tagInfo16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeDegrees;
        java.lang.String str14 = gpsInfo8.longitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
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
        java.lang.Class<?> wildcardClass16 = gpsInfo8.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = rationalNumber14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        java.lang.String str3 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = tiffImageMetadata1.getFieldValue(tagInfoXpString4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes tagInfoSBytes3 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray4 = tiffImageMetadata1.getFieldValue(tagInfoSBytes3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.longitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = gpsInfo8.getLatitudeAsDegreesNorth();
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
        org.junit.Assert.assertNull(rationalNumber17);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("hi!", "\thi!: ");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory8 = tiffImageMetadata1.findDirectory((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        java.lang.String str4 = tiffImageMetadata1.toString("\thi!: \n\thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes tagInfoSBytes5 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray6 = tiffImageMetadata1.getFieldValue(tagInfoSBytes5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str3 = tiffImageMetadata1.toString("\thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray5 = tiffImageMetadata1.getFieldValue(tagInfoRationals4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \n\thi!: ", "\thi!: \n\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
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
        java.lang.Class<?> wildcardClass13 = gpsInfo8.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem7 = null;
        tiffImageMetadata1.add(imageMetadataItem7);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem9 = null;
        tiffImageMetadata1.add(imageMetadataItem9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet11 = tiffImageMetadata1.getOutputSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = gpsInfo8.toString();
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
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
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
        // The following exception was thrown during execution in test generation
        try {
            double double15 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        java.lang.String str8 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = tiffImageMetadata1.getFieldValue(tagInfoXpString9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\thi!: \n\thi!: " + "'", str8, "\thi!: \n\thi!: ");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
        java.lang.String str15 = gpsInfo8.latitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = gpsInfo8.toString();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!", "\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = rationalNumber10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeSeconds;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        java.lang.String str3 = tiffImageMetadata1.toString();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList4 = tiffImageMetadata1.getAllFields();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet5 = tiffImageMetadata1.getOutputSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(tiffFieldList4);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("", "\thi!: \n\thi!: ");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet5 = tiffImageMetadata1.getOutputSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
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
        // The following exception was thrown during execution in test generation
        try {
            double double12 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \n\thi!: \n\t: hi!", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!", "\thi!: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        java.lang.String str8 = tiffImageMetadata1.toString();
        java.lang.String str10 = tiffImageMetadata1.toString("hi!\thi!: hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts11 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray12 = tiffImageMetadata1.getFieldValue(tagInfoSShorts11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\thi!: \n\thi!: " + "'", str8, "\thi!: \n\thi!: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: " + "'", str10, "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = rationalNumber12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem7 = null;
        tiffImageMetadata1.add(imageMetadataItem7);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem9 = null;
        tiffImageMetadata1.add(imageMetadataItem9);
        tiffImageMetadata1.add("hi!", "\thi!: hi!");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem14 = null;
        tiffImageMetadata1.add(imageMetadataItem14);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffField tiffField18 = tiffImageMetadata1.findField(tagInfo16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        java.lang.String str4 = tiffImageMetadata1.toString("\thi!: \n\thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray6 = tiffImageMetadata1.getFieldValue(tagInfoSRationals5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = tiffImageMetadata1.getFieldValue(tagInfo7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents5 = tiffImageMetadata1.contents;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray7 = tiffImageMetadata1.getFieldValue(tagInfoSRationals6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tiffContents5);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents5 = tiffImageMetadata1.contents;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes tagInfoSBytes6 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = tiffImageMetadata1.getFieldValue(tagInfoSBytes6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tiffContents5);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem7 = null;
        tiffImageMetadata1.add(imageMetadataItem7);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = tiffImageMetadata1.getFieldValue(tagInfo9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
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
        // The following exception was thrown during execution in test generation
        try {
            double double18 = gpsInfo8.getLatitudeAsDegreesNorth();
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
        org.junit.Assert.assertNull(rationalNumber17);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem7 = null;
        tiffImageMetadata1.add(imageMetadataItem7);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem9 = null;
        tiffImageMetadata1.add(imageMetadataItem9);
        tiffImageMetadata1.add("hi!", "\thi!: hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = tiffImageMetadata1.toString("hi!\thi!: hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str3 = tiffImageMetadata1.toString("\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem4 = null;
        tiffImageMetadata1.add(imageMetadataItem4);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes tagInfoSBytes6 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = tiffImageMetadata1.getFieldValue(tagInfoSBytes6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        tiffImageMetadata1.add("\thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: ", "\thi!: \thi!: \thi!: hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffField tiffField7 = tiffImageMetadata1.findField(tagInfo6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        java.lang.Class<?> wildcardClass7 = tiffImageMetadata1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        java.lang.String str3 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = tiffImageMetadata1.getFieldValue(tagInfoDoubles4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        java.lang.String str15 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem4 = null;
        tiffImageMetadata1.add(imageMetadataItem4);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats tagInfoFloats6 = null;
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray7 = tiffImageMetadata1.getFieldValue(tagInfoFloats6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeSeconds;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
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
            java.lang.String str13 = gpsInfo8.toString();
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
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("\thi!: ", "hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffField tiffField13 = tiffImageMetadata1.findField(tagInfo11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.latitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str3 = tiffImageMetadata1.toString("\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem4 = null;
        tiffImageMetadata1.add(imageMetadataItem4);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray7 = tiffImageMetadata1.getFieldValue(tagInfoAscii6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: ", "\thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats tagInfoFloats3 = null;
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray4 = tiffImageMetadata1.getFieldValue(tagInfoFloats3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        java.lang.String str4 = tiffImageMetadata1.toString("\thi!: \n\thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray6 = tiffImageMetadata1.getFieldValue(tagInfoAscii5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("", "\thi!: \n\thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts5 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray6 = tiffImageMetadata1.getFieldValue(tagInfoSShorts5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem7 = null;
        tiffImageMetadata1.add(imageMetadataItem7);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem9 = null;
        tiffImageMetadata1.add(imageMetadataItem9);
        tiffImageMetadata1.add("hi!", "\thi!: hi!");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem14 = null;
        tiffImageMetadata1.add(imageMetadataItem14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = tiffImageMetadata1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
        org.junit.Assert.assertNull(rationalNumber18);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("", "hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes tagInfoSBytes11 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = tiffImageMetadata1.getFieldValue(tagInfoSBytes11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory4 = tiffImageMetadata1.findDirectory((int) ' ');
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = tiffImageMetadata1.getFieldValue(tagInfoGpsText5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(tiffDirectory4);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str3 = tiffImageMetadata1.toString("\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem4 = null;
        tiffImageMetadata1.add(imageMetadataItem4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = tiffImageMetadata1.findDirectory((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
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
        java.lang.String str15 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = gpsInfo8.toString();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(rationalNumber16);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        java.lang.String str3 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats tagInfoFloats4 = null;
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray5 = tiffImageMetadata1.getFieldValue(tagInfoFloats4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeMinutes;
        java.lang.Class<?> wildcardClass15 = gpsInfo8.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \n\thi!: ", "\thi!: \n\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = rationalNumber11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: hi!", "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\thi!: \thi!: \thi!: hi!" + "'", str9, "\thi!: \thi!: \thi!: hi!");
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem4 = null;
        tiffImageMetadata1.add(imageMetadataItem4);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = tiffImageMetadata1.getFieldValue(tagInfoXpString6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem7 = null;
        tiffImageMetadata1.add(imageMetadataItem7);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem9 = null;
        tiffImageMetadata1.add(imageMetadataItem9);
        tiffImageMetadata1.add("hi!", "\thi!: hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffField tiffField15 = tiffImageMetadata1.findField(tagInfo14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
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
        // The following exception was thrown during execution in test generation
        try {
            double double16 = gpsInfo8.getLongitudeAsDegreesEast();
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
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        java.lang.String str4 = tiffImageMetadata1.toString("\thi!: \n\thi!: ");
        java.lang.String str6 = tiffImageMetadata1.toString("hi!");
        tiffImageMetadata1.add("\thi!: \thi!: ", "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: ");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet10 = tiffImageMetadata1.getOutputSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem7 = null;
        tiffImageMetadata1.add(imageMetadataItem7);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem9 = null;
        tiffImageMetadata1.add(imageMetadataItem9);
        tiffImageMetadata1.add("hi!", "\thi!: hi!");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem14 = null;
        tiffImageMetadata1.add(imageMetadataItem14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory17 = tiffImageMetadata1.findDirectory((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeMinutes;
        java.lang.String str14 = gpsInfo8.longitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo3 = tiffImageMetadata1.getGpsInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray5 = tiffImageMetadata1.getFieldValue(tagInfoSRationals4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
        org.junit.Assert.assertNull(gpsInfo3);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = rationalNumber11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
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
        // The following exception was thrown during execution in test generation
        try {
            double double13 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem5 = null;
        tiffImageMetadata1.add(imageMetadataItem5);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray8 = tiffImageMetadata1.getFieldValue(tagInfoSRationals7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        java.lang.String str8 = tiffImageMetadata1.toString();
        java.lang.String str9 = tiffImageMetadata1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo10 = tiffImageMetadata1.getGpsInfo();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem cannot be cast to class org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory (org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem and org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\thi!: \n\thi!: " + "'", str8, "\thi!: \n\thi!: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\thi!: \n\thi!: " + "'", str9, "\thi!: \n\thi!: ");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        java.lang.String str4 = tiffImageMetadata1.toString("\thi!: \n\thi!: ");
        java.lang.String str6 = tiffImageMetadata1.toString("hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = tiffImageMetadata1.getFieldValue(tagInfoLongs7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem4 = null;
        tiffImageMetadata1.add(imageMetadataItem4);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = tiffImageMetadata1.getFieldValue(tagInfoGpsText6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        java.lang.String str3 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs tagInfoSLongs4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = tiffImageMetadata1.getFieldValue(tagInfoSLongs4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeDegrees;
        java.lang.String str16 = gpsInfo8.latitudeRef;
        java.lang.String str17 = gpsInfo8.longitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = gpsInfo8.toString();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(rationalNumber17);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("", "hi!");
        java.lang.String str11 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts12 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray13 = tiffImageMetadata1.getFieldValue(tagInfoSShorts12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!: \n\thi!: \n\t: hi!" + "'", str11, "\thi!: \n\thi!: \n\t: hi!");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: hi!", "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: " + "'", str11, "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.longitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem4 = null;
        tiffImageMetadata1.add(imageMetadataItem4);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray7 = tiffImageMetadata1.getFieldValue(tagInfoRationals6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
        java.lang.String str15 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("", "hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts11 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray12 = tiffImageMetadata1.getFieldValue(tagInfoSShorts11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("", "\thi!: \n\thi!: ");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList5 = tiffImageMetadata1.getAllFields();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem cannot be cast to class org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory (org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem and org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
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
        java.lang.Class<?> wildcardClass15 = gpsInfo8.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
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
        // The following exception was thrown during execution in test generation
        try {
            double double17 = gpsInfo8.getLatitudeAsDegreesNorth();
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
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeDegrees;
        java.lang.String str17 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!", "\thi!: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: ", "hi!\thi!: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: \n\t: hi!", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
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
        java.lang.String str15 = gpsInfo8.longitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        tiffImageMetadata1.add("\thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: ", "\thi!: \thi!: \thi!: hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = tiffImageMetadata1.findDirectory((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem cannot be cast to class org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory (org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem and org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory4 = tiffImageMetadata1.findDirectory((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet5 = tiffImageMetadata1.getOutputSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(tiffDirectory4);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: hi!", "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeDegrees;
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
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
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
            double double16 = gpsInfo8.getLatitudeAsDegreesNorth();
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
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        java.lang.String str11 = gpsInfo8.latitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        java.lang.String str4 = tiffImageMetadata1.toString("\thi!: \n\thi!: ");
        java.lang.String str6 = tiffImageMetadata1.toString("hi!");
        tiffImageMetadata1.add("\thi!: ", "\thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffField tiffField11 = tiffImageMetadata1.findField(tagInfo10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("hi!", "\thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = tiffImageMetadata1.getFieldValue(tagInfoDoubles7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: ", "hi!\thi!: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.Class<?> wildcardClass9 = gpsInfo8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        java.lang.String str8 = tiffImageMetadata1.toString();
        java.lang.String str10 = tiffImageMetadata1.toString("hi!\thi!: hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray12 = tiffImageMetadata1.getFieldValue(tagInfoSRationals11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\thi!: \n\thi!: " + "'", str8, "\thi!: \n\thi!: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: " + "'", str10, "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeMinutes;
        java.lang.String str17 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeDegrees;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        java.lang.String str11 = gpsInfo8.latitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo3 = tiffImageMetadata1.getGpsInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes tagInfoSBytes4 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = tiffImageMetadata1.getFieldValue(tagInfoSBytes4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
        org.junit.Assert.assertNull(gpsInfo3);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        java.lang.String str3 = tiffImageMetadata1.toString();
        java.lang.String str5 = tiffImageMetadata1.toString("\thi!: \thi!: ");
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo6 = tiffImageMetadata1.getGpsInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = tiffImageMetadata1.getFieldValue(tagInfoAscii7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(gpsInfo6);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: ", "\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeSeconds;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\thi!: " + "'", str10, "\thi!: ");
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeSeconds;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem5 = null;
        tiffImageMetadata1.add(imageMetadataItem5);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs tagInfoSLongs7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = tiffImageMetadata1.getFieldValue(tagInfoSLongs7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.latitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
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
        // The following exception was thrown during execution in test generation
        try {
            double double13 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = gpsInfo8.toString();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(rationalNumber16);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \n\thi!: ", "\thi!: \n\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \n\thi!: ", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
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
        // The following exception was thrown during execution in test generation
        try {
            double double12 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("\thi!: ", "hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes tagInfoSBytes11 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = tiffImageMetadata1.getFieldValue(tagInfoSBytes11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("hi!", "\thi!: \n\thi!: \n\t: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory4 = tiffImageMetadata1.findDirectory((int) ' ');
        tiffImageMetadata1.add("\thi!: ", "\thi!: \thi!: \thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffField tiffField9 = tiffImageMetadata1.findField(tagInfo8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(tiffDirectory4);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
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
            double double13 = gpsInfo8.getLongitudeAsDegreesEast();
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
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \n\thi!: ", "\thi!: \n\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeSeconds;
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
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("hi!", "\thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts7 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray8 = tiffImageMetadata1.getFieldValue(tagInfoSShorts7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        tiffImageMetadata1.add("\thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: ", "\thi!: \thi!: \thi!: hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = tiffImageMetadata1.getFieldValue(tagInfoDoubles6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeDegrees;
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
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
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
        // The following exception was thrown during execution in test generation
        try {
            double double18 = gpsInfo8.getLongitudeAsDegreesEast();
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
        org.junit.Assert.assertNull(rationalNumber17);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = rationalNumber12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        java.lang.String str4 = tiffImageMetadata1.toString("\thi!: \n\thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = tiffImageMetadata1.getFieldValue(tagInfoGpsText5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
        java.lang.Class<?> wildcardClass13 = gpsInfo8.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        java.lang.String str15 = gpsInfo8.latitudeRef;
        java.lang.String str16 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeSeconds;
        java.lang.String str11 = gpsInfo8.latitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!", "\thi!: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem7 = null;
        tiffImageMetadata1.add(imageMetadataItem7);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem9 = null;
        tiffImageMetadata1.add(imageMetadataItem9);
        tiffImageMetadata1.add("hi!", "\thi!: hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList14 = tiffImageMetadata1.getAllFields();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
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
        java.lang.String str14 = gpsInfo8.longitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: ", "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        java.lang.String str3 = tiffImageMetadata1.toString();
        java.lang.String str5 = tiffImageMetadata1.toString("\thi!: \thi!: ");
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo6 = tiffImageMetadata1.getGpsInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffField tiffField8 = tiffImageMetadata1.findField(tagInfo7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(gpsInfo6);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        tiffImageMetadata1.add("\thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: ", "\thi!: \thi!: \thi!: hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts6 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray7 = tiffImageMetadata1.getFieldValue(tagInfoSShorts6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet8 = tiffImageMetadata1.getOutputSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        java.lang.String str13 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray4 = tiffImageMetadata1.getFieldValue(tagInfoLongs3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: hi!", "\thi!: \n\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
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
        java.lang.String str16 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
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
        java.lang.String str15 = gpsInfo8.latitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        java.lang.String str10 = gpsInfo8.longitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!", "\thi!: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: hi!", "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: \t\thi!: \n\thi!: : \thi!: \n\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: hi!", "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: " + "'", str11, "hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
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
        // The following exception was thrown during execution in test generation
        try {
            double double13 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        java.lang.String str8 = tiffImageMetadata1.toString();
        java.lang.String str9 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = tiffImageMetadata1.getFieldValue(tagInfoGpsText10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\thi!: \n\thi!: " + "'", str8, "\thi!: \n\thi!: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\thi!: \n\thi!: " + "'", str9, "\thi!: \n\thi!: ");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        java.lang.String str15 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(rationalNumber16);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts8 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray9 = tiffImageMetadata1.getFieldValue(tagInfoShorts8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts3 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray4 = tiffImageMetadata1.getFieldValue(tagInfoSShorts3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = tiffImageMetadata1.getFieldValue(tagInfoDoubles8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = tiffImageMetadata1.getFieldValue(tagInfoXpString3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        java.lang.String str12 = gpsInfo8.latitudeRef;
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents5 = tiffImageMetadata1.contents;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs tagInfoSLongs6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = tiffImageMetadata1.getFieldValue(tagInfoSLongs6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tiffContents5);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!\thi!: \n\thi!: hi!\thi!: hi!\t\thi!: \thi!: \thi!: hi!: \thi!: \thi!: \thi!: \n\t: hi!\t\thi!: \thi!: : \thi!: \thi!: ", "\thi!: \thi!: \thi!: \n\t: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: ", "hi!\thi!: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
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
        java.lang.String str12 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeMinutes;
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        java.lang.String str3 = tiffImageMetadata1.toString();
        java.lang.String str5 = tiffImageMetadata1.toString("\thi!: \thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats tagInfoFloats6 = null;
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray7 = tiffImageMetadata1.getFieldValue(tagInfoFloats6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
        java.lang.String str18 = gpsInfo8.longitudeRef;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
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
        java.lang.Class<?> wildcardClass19 = gpsInfo8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory4 = tiffImageMetadata1.findDirectory((int) ' ');
        tiffImageMetadata1.add("\thi!: ", "\thi!: \thi!: \thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes tagInfoSBytes8 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = tiffImageMetadata1.getFieldValue(tagInfoSBytes8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(tiffDirectory4);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("\thi!: ", "hi!");
        tiffImageMetadata1.add("\t\thi!: \n\thi!: : \thi!: \n\thi!: ", "\thi!: \thi!: \thi!: ");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList14 = tiffImageMetadata1.getAllFields();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem cannot be cast to class org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory (org.apache.commons.imaging.common.GenericImageMetadata$GenericImageMetadataItem and org.apache.commons.imaging.formats.tiff.TiffImageMetadata$Directory are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
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
        // The following exception was thrown during execution in test generation
        try {
            double double15 = gpsInfo8.getLatitudeAsDegreesNorth();
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
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        java.lang.String str3 = tiffImageMetadata1.toString();
        java.lang.String str5 = tiffImageMetadata1.toString("\thi!: \thi!: ");
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo6 = tiffImageMetadata1.getGpsInfo();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList7 = tiffImageMetadata1.getAllFields();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffField tiffField10 = tiffImageMetadata1.findField(tagInfo8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(gpsInfo6);
        org.junit.Assert.assertNotNull(tiffFieldList7);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        java.lang.String str4 = tiffImageMetadata1.toString("\thi!: \n\thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffField tiffField7 = tiffImageMetadata1.findField(tagInfo5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("", "hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffField tiffField13 = tiffImageMetadata1.findField(tagInfo11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem7 = null;
        tiffImageMetadata1.add(imageMetadataItem7);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem9 = null;
        tiffImageMetadata1.add(imageMetadataItem9);
        tiffImageMetadata1.add("hi!", "\thi!: hi!");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem14 = null;
        tiffImageMetadata1.add(imageMetadataItem14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = tiffImageMetadata1.toString("hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        java.lang.String str8 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents9 = tiffImageMetadata1.contents;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = tiffImageMetadata1.getFieldValue(tagInfo10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\thi!: \n\thi!: " + "'", str8, "\thi!: \n\thi!: ");
        org.junit.Assert.assertNull(tiffContents9);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents5 = tiffImageMetadata1.contents;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = tiffImageMetadata1.getFieldValue(tagInfoLongs6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tiffContents5);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
        java.lang.String str12 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("hi!", "\thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = tiffImageMetadata1.getFieldValue(tagInfo7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeSeconds;
        java.lang.Class<?> wildcardClass12 = gpsInfo8.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: ", "hi!\thi!: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!\thi!: hi!" + "'", str11, "hi!\thi!: hi!");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str3 = tiffImageMetadata1.toString("\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem4 = null;
        tiffImageMetadata1.add(imageMetadataItem4);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte6 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = tiffImageMetadata1.getFieldValue(tagInfoByte6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = rationalNumber12.getClass();
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
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: ", "\thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffField tiffField7 = tiffImageMetadata1.findField(tagInfo5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: ", "\thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
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
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray14 = tiffImageMetadata1.getFieldValue(tagInfoAscii13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!", "\thi!: hi!\thi!: \n\thi!: hi!\thi!: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("hi!", "\thi!: ");
        tiffImageMetadata1.add("\thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: ", "\thi!: \n\thi!: hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffField tiffField12 = tiffImageMetadata1.findField(tagInfo10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
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
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber19 = gpsInfo8.latitudeMinutes;
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
        org.junit.Assert.assertNull(rationalNumber19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        java.lang.String str11 = gpsInfo8.longitudeRef;
        java.lang.Class<?> wildcardClass12 = gpsInfo8.getClass();
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        java.lang.String str15 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber17 = gpsInfo8.latitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = gpsInfo8.getLongitudeAsDegreesEast();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertNull(rationalNumber17);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: ", "\thi!: \n\thi!: \n\t: hi!\t\thi!: \thi!: : \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.latitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\thi!: " + "'", str9, "\thi!: ");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        java.lang.String str3 = tiffImageMetadata1.toString();
        java.lang.String str5 = tiffImageMetadata1.toString("\thi!: \thi!: ");
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo6 = tiffImageMetadata1.getGpsInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = tiffImageMetadata1.getFieldValue(tagInfoXpString7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(gpsInfo6);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        tiffImageMetadata1.add("\thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: ", "\thi!: \thi!: \thi!: hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats tagInfoFloats6 = null;
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray7 = tiffImageMetadata1.getFieldValue(tagInfoFloats6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: \n\t: hi!\t\thi!: \thi!: : \thi!: \thi!: ", "\thi!: \thi!: \thi!: \n\t: hi!\t\thi!: \thi!: : \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!", "\thi!: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeSeconds;
        java.lang.String str10 = gpsInfo8.latitudeRef;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\thi!: hi!" + "'", str10, "\thi!: hi!");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!\thi!: \n\thi!: hi!\thi!: hi!", "\thi!: \n\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str3 = tiffImageMetadata1.toString("\thi!: ");
        tiffImageMetadata1.add("\thi!: \n\thi!: ", "\thi!: \thi!: ");
        java.lang.String str8 = tiffImageMetadata1.toString("\thi!: \n\thi!: hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte9 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = tiffImageMetadata1.getFieldValue(tagInfoByte9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\thi!: \n\thi!: hi!\t\thi!: \n\thi!: : \thi!: \thi!: " + "'", str8, "\thi!: \n\thi!: hi!\t\thi!: \n\thi!: : \thi!: \thi!: ");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("", "hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffField tiffField13 = tiffImageMetadata1.findField(tagInfo11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \n\thi!: ", "\thi!: \n\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeSeconds;
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
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: \thi!: \n\t: hi!\t\thi!: \thi!: : \thi!: \thi!: ", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(rationalNumber18);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber20 = gpsInfo8.longitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            double double21 = gpsInfo8.getLongitudeAsDegreesEast();
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
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = rationalNumber11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = rationalNumber11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        java.lang.String str3 = tiffImageMetadata1.toString();
        java.lang.String str5 = tiffImageMetadata1.toString("\thi!: \thi!: ");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet6 = tiffImageMetadata1.getOutputSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        java.lang.String str3 = tiffImageMetadata1.toString();
        java.lang.String str5 = tiffImageMetadata1.toString("\thi!: \thi!: ");
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo6 = tiffImageMetadata1.getGpsInfo();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList7 = tiffImageMetadata1.getAllFields();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray9 = tiffImageMetadata1.getFieldValue(tagInfoSRationals8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(gpsInfo6);
        org.junit.Assert.assertNotNull(tiffFieldList7);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str3 = tiffImageMetadata1.toString("\thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = tiffImageMetadata1.getFieldValue(tagInfoGpsText4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: ", "\thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents4 = tiffImageMetadata1.contents;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = tiffImageMetadata1.toString("\thi!: \thi!: \thi!: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tiffContents4);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        java.lang.String str9 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!\thi!: \n\thi!: hi!\thi!: hi!", "\thi!: \n\thi!: \n\t: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.longitudeSeconds;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = tiffImageMetadata1.getAllFields();
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo3 = tiffImageMetadata1.getGpsInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray5 = tiffImageMetadata1.getFieldValue(tagInfoRationals4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldList2);
        org.junit.Assert.assertNull(gpsInfo3);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("hi!\thi!: hi!\thi!: \nhi!\thi!: hi!\thi!: ", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!", "\thi!: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
        java.lang.String str17 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.latitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(rationalNumber16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(rationalNumber18);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory4 = tiffImageMetadata1.findDirectory((int) ' ');
        tiffImageMetadata1.add("\thi!: ", "\thi!: \thi!: \thi!: ");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents8 = tiffImageMetadata1.contents;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts9 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray10 = tiffImageMetadata1.getFieldValue(tagInfoShorts9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(tiffDirectory4);
        org.junit.Assert.assertNull(tiffContents8);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \thi!: ", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \n\thi!: ", "\thi!: \n\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeSeconds;
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
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory4 = tiffImageMetadata1.findDirectory((int) ' ');
        tiffImageMetadata1.add("\thi!: ", "\thi!: \thi!: \thi!: ");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents8 = tiffImageMetadata1.contents;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = tiffImageMetadata1.getFieldValue(tagInfoDoubles9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(tiffDirectory4);
        org.junit.Assert.assertNull(tiffContents8);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeMinutes;
        java.lang.Class<?> wildcardClass11 = gpsInfo8.getClass();
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeDegrees;
        java.lang.String str16 = gpsInfo8.latitudeRef;
        java.lang.String str17 = gpsInfo8.longitudeRef;
        java.lang.Class<?> wildcardClass18 = gpsInfo8.getClass();
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.longitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        java.lang.String str3 = tiffImageMetadata1.toString();
        java.lang.String str5 = tiffImageMetadata1.toString("\thi!: \thi!: ");
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo6 = tiffImageMetadata1.getGpsInfo();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList7 = tiffImageMetadata1.getAllFields();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = tiffImageMetadata1.getFieldValue(tagInfo8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(gpsInfo6);
        org.junit.Assert.assertNotNull(tiffFieldList7);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber18 = gpsInfo8.latitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory4 = tiffImageMetadata1.findDirectory((int) ' ');
        tiffImageMetadata1.add("\thi!: ", "\thi!: \thi!: \thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = tiffImageMetadata1.getFieldValue(tagInfoXpString8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(tiffDirectory4);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem5 = null;
        tiffImageMetadata1.add(imageMetadataItem5);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte7 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = tiffImageMetadata1.getFieldValue(tagInfoByte7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("hi!", "\thi!: ");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte7 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = tiffImageMetadata1.getFieldValue(tagInfoByte7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!", "\t\thi!: \thi!: : \thi!: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = gpsInfo8.getLatitudeAsDegreesNorth();
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
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: \n\thi!: ", "\thi!: \n\thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.longitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = gpsInfo8.getLongitudeAsDegreesEast();
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
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory4 = tiffImageMetadata1.findDirectory((int) ' ');
        java.lang.String str5 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = tiffImageMetadata1.getFieldValue(tagInfoXpString6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(tiffDirectory4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
        java.lang.String str14 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = gpsInfo8.getLatitudeAsDegreesNorth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(rationalNumber15);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeSeconds;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents4 = tiffImageMetadata1.contents;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts5 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray6 = tiffImageMetadata1.getFieldValue(tagInfoShorts5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tiffContents4);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!\n\t\thi!: \n\thi!: : ", "\thi!: \n\thi!: \n\t: hi!\thi!: \n\thi!: \n\thi!: \n\t: hi!\t: \thi!: \thi!: \thi!: hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        java.lang.String str12 = gpsInfo8.longitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber13 = gpsInfo8.latitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(rationalNumber13);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("hi!", "");
        tiffImageMetadata1.add("", "hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats tagInfoFloats11 = null;
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray12 = tiffImageMetadata1.getFieldValue(tagInfoFloats11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: ", "", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber12 = gpsInfo8.latitudeDegrees;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
        org.junit.Assert.assertNull(rationalNumber12);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!", "\thi!: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber11 = gpsInfo8.latitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertNull(rationalNumber11);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeMinutes;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = gpsInfo8.getLongitudeAsDegreesEast();
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
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.latitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeMinutes;
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem2 = null;
        tiffImageMetadata1.add(imageMetadataItem2);
        tiffImageMetadata1.add("\thi!: ", "\thi!: ");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem7 = null;
        tiffImageMetadata1.add(imageMetadataItem7);
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem9 = null;
        tiffImageMetadata1.add(imageMetadataItem9);
        tiffImageMetadata1.add("hi!", "\thi!: hi!");
        org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem imageMetadataItem14 = null;
        tiffImageMetadata1.add(imageMetadataItem14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo16 = tiffImageMetadata1.getGpsInfo();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("\thi!: hi!", "\thi!: \thi!: \thi!: ", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.latitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeMinutes;
        java.lang.String str11 = gpsInfo8.latitudeRef;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = gpsInfo8.getLongitudeAsDegreesEast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!: hi!" + "'", str11, "\thi!: hi!");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents0 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents0);
        java.lang.String str2 = tiffImageMetadata1.toString();
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory4 = tiffImageMetadata1.findDirectory((int) ' ');
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs tagInfoSLongs5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = tiffImageMetadata1.getFieldValue(tagInfoSLongs5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(tiffDirectory4);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
        org.apache.commons.imaging.common.RationalNumber rationalNumber14 = gpsInfo8.latitudeSeconds;
        org.apache.commons.imaging.common.RationalNumber rationalNumber15 = gpsInfo8.longitudeDegrees;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.latitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = gpsInfo8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(rationalNumber13);
        org.junit.Assert.assertNull(rationalNumber14);
        org.junit.Assert.assertNull(rationalNumber15);
        org.junit.Assert.assertNull(rationalNumber16);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
        java.lang.String str15 = gpsInfo8.latitudeRef;
        org.apache.commons.imaging.common.RationalNumber rationalNumber16 = gpsInfo8.longitudeSeconds;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = gpsInfo8.toString();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(rationalNumber16);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber5 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber6 = null;
        org.apache.commons.imaging.common.RationalNumber rationalNumber7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo gpsInfo8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.GpsInfo("", "hi!", rationalNumber2, rationalNumber3, rationalNumber4, rationalNumber5, rationalNumber6, rationalNumber7);
        org.apache.commons.imaging.common.RationalNumber rationalNumber9 = gpsInfo8.longitudeMinutes;
        org.apache.commons.imaging.common.RationalNumber rationalNumber10 = gpsInfo8.longitudeDegrees;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = rationalNumber10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(rationalNumber9);
        org.junit.Assert.assertNull(rationalNumber10);
    }
}

