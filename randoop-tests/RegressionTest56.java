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
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        java.awt.image.BufferedImage bufferedImage12 = tiffDirectory7.getTiffImage();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii13 = null;
        java.lang.String[] strArray15 = tiffDirectory7.getFieldValue(tagInfoAscii13, false);
        int int16 = tiffDirectory7.type;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = tiffDirectory7.findField(tagInfo17, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts20 = null;
        short[] shortArray22 = tiffDirectory7.getFieldValue(tagInfoShorts20, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo23 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField24 = tiffDirectory7.findField(tagInfo23);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImage12);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(tiffField19);
        org.junit.Assert.assertNull(shortArray22);
        org.junit.Assert.assertNull(tiffField24);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts8 = null;
        short[] shortArray10 = tiffDirectory7.getFieldValue(tagInfoSShorts8, false);
        int int11 = tiffDirectory7.size();
        boolean boolean12 = tiffDirectory7.hasTiffFloatingPointRasterData();
        int int13 = tiffDirectory7.length;
        long long14 = tiffDirectory7.offset;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = tiffDirectory7.getSingleFieldValue(tagInfoAscii15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(shortArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts10 = null;
        short[] shortArray12 = tiffDirectory7.getFieldValue(tagInfoSShorts10, false);
        java.lang.String str13 = tiffDirectory7.description();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList14 = tiffDirectory7.getDirectoryEntries();
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData15 = null;
        tiffDirectory7.setJpegImageData(jpegImageData15);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText17 = null;
        java.lang.String str19 = tiffDirectory7.getFieldValue(tagInfoGpsText17, false);
        java.nio.ByteOrder byteOrder20 = tiffDirectory7.getByteOrder();
        java.util.Spliterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldSpliterator21 = tiffDirectory7.spliterator();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte tagInfoSByte22 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte byte23 = tiffDirectory7.getFieldValue(tagInfoSByte22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(shortArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Sub" + "'", str13, "Sub");
        org.junit.Assert.assertNotNull(tiffFieldList14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(byteOrder20);
        org.junit.Assert.assertNotNull(tiffFieldSpliterator21);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        java.awt.image.BufferedImage bufferedImage12 = tiffDirectory7.getTiffImage();
        java.lang.String str13 = tiffDirectory7.getElementDescription();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo14 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField16 = tiffDirectory7.findField(tagInfo14, false);
        boolean boolean17 = tiffDirectory7.hasTiffImageData();
        boolean boolean18 = tiffDirectory7.hasTiffRasterData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloat tagInfoFloat19 = null;
        // The following exception was thrown during execution in test generation
        try {
            float float20 = tiffDirectory7.getFieldValue(tagInfoFloat19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(tiffField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts8 = null;
        short[] shortArray10 = tiffDirectory7.getFieldValue(tagInfoSShorts8, false);
        int int11 = tiffDirectory7.size();
        long long12 = tiffDirectory7.getNextDirectoryOffset();
        int int13 = tiffDirectory7.type;
        java.nio.ByteOrder byteOrder14 = null;
        java.awt.image.BufferedImage bufferedImage15 = tiffDirectory7.getTiffImage(byteOrder14);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(shortArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(bufferedImage15);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = tiffDirectory7.getTiffImageData();
        java.nio.ByteOrder byteOrder11 = null;
        java.awt.image.BufferedImage bufferedImage12 = tiffDirectory7.getTiffImage(byteOrder11);
        java.util.Spliterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldSpliterator13 = tiffDirectory7.spliterator();
        int int14 = tiffDirectory7.length;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational tagInfoSRational15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber rationalNumber16 = tiffDirectory7.getFieldValue(tagInfoSRational15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(abstractTiffImageData10);
        org.junit.Assert.assertNull(bufferedImage12);
        org.junit.Assert.assertNotNull(tiffFieldSpliterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts10 = null;
        short[] shortArray12 = tiffDirectory7.getFieldValue(tagInfoSShorts10, false);
        java.lang.String str13 = tiffDirectory7.description();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList14 = tiffDirectory7.getDirectoryEntries();
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData15 = null;
        tiffDirectory7.setJpegImageData(jpegImageData15);
        int int17 = tiffDirectory7.type;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii18 = null;
        java.lang.String[] strArray20 = tiffDirectory7.getFieldValue(tagInfoAscii18, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloat tagInfoFloat21 = null;
        // The following exception was thrown during execution in test generation
        try {
            float float22 = tiffDirectory7.getFieldValue(tagInfoFloat21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(shortArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Sub" + "'", str13, "Sub");
        org.junit.Assert.assertNotNull(tiffFieldList14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(strArray20);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts10 = null;
        short[] shortArray12 = tiffDirectory7.getFieldValue(tagInfoSShorts10, false);
        java.lang.String str13 = tiffDirectory7.description();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList14 = tiffDirectory7.getDirectoryEntries();
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData15 = null;
        tiffDirectory7.setJpegImageData(jpegImageData15);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList17 = tiffDirectory7.getDirectoryEntries();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes18 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray20 = tiffDirectory7.getFieldValue(tagInfoBytes18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(shortArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Sub" + "'", str13, "Sub");
        org.junit.Assert.assertNotNull(tiffFieldList14);
        org.junit.Assert.assertNotNull(tiffFieldList17);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        boolean boolean12 = tiffDirectory7.hasJpegImageData();
        java.nio.ByteOrder byteOrder13 = null;
        java.awt.image.BufferedImage bufferedImage14 = tiffDirectory7.getTiffImage(byteOrder13);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong15 = null;
        int[] intArray17 = tiffDirectory7.getFieldValue(tagInfoShortOrLong15, false);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(bufferedImage14);
        org.junit.Assert.assertNull(intArray17);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldItor10 = tiffDirectory7.iterator();
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldItor11 = tiffDirectory7.iterator();
        boolean boolean12 = tiffDirectory7.hasJpegImageData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs tagInfoSLongs13 = null;
        int[] intArray15 = tiffDirectory7.getFieldValue(tagInfoSLongs13, false);
        boolean boolean16 = tiffDirectory7.hasTiffImageData();
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData17 = null;
        tiffDirectory7.setJpegImageData(jpegImageData17);
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters19 = null;
        java.awt.image.BufferedImage bufferedImage20 = tiffDirectory7.getTiffImage(tiffImagingParameters19);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tiffFieldItor10);
        org.junit.Assert.assertNotNull(tiffFieldItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(bufferedImage20);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        boolean boolean10 = tiffDirectory7.hasJpegImageData();
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldItor11 = tiffDirectory7.iterator();
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldItor12 = tiffDirectory7.iterator();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes tagInfoSBytes13 = null;
        byte[] byteArray15 = tiffDirectory7.getFieldValue(tagInfoSBytes13, false);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tiffFieldItor11);
        org.junit.Assert.assertNotNull(tiffFieldItor12);
        org.junit.Assert.assertNull(byteArray15);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = tiffDirectory7.getTiffImageData();
        java.nio.ByteOrder byteOrder11 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters12 = null;
        java.awt.image.BufferedImage bufferedImage13 = tiffDirectory7.getTiffImage(byteOrder11, tiffImagingParameters12);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo14 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField15 = tiffDirectory7.findField(tagInfo14);
        int int16 = tiffDirectory7.length;
        java.lang.String str17 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = tiffDirectory7.findField(tagInfo18);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles20 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray22 = tiffDirectory7.getFieldValue(tagInfoDoubles20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(abstractTiffImageData10);
        org.junit.Assert.assertNull(bufferedImage13);
        org.junit.Assert.assertNull(tiffField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Sub" + "'", str17, "Sub");
        org.junit.Assert.assertNull(tiffField19);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts10 = null;
        short[] shortArray12 = tiffDirectory7.getFieldValue(tagInfoSShorts10, false);
        java.lang.String str13 = tiffDirectory7.description();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList14 = tiffDirectory7.getDirectoryEntries();
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData15 = null;
        tiffDirectory7.setJpegImageData(jpegImageData15);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText17 = null;
        java.lang.String str19 = tiffDirectory7.getFieldValue(tagInfoGpsText17, false);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList20 = tiffDirectory7.getDirectoryEntries();
        int int21 = tiffDirectory7.size();
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData22 = tiffDirectory7.getJpegImageData();
        boolean boolean23 = tiffDirectory7.hasTiffFloatingPointRasterData();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(shortArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Sub" + "'", str13, "Sub");
        org.junit.Assert.assertNotNull(tiffFieldList14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(tiffFieldList20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(jpegImageData22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList10 = tiffDirectory7.getDirectoryEntries();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList11 = tiffDirectory7.getDirectoryEntries();
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldItor12 = tiffDirectory7.iterator();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString13 = null;
        java.lang.String str15 = tiffDirectory7.getFieldValue(tagInfoXpString13, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii16 = null;
        java.lang.String[] strArray18 = tiffDirectory7.getFieldValue(tagInfoAscii16, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = tiffDirectory7.getFieldValue(tagInfoGpsText19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tiffFieldList10);
        org.junit.Assert.assertNotNull(tiffFieldList11);
        org.junit.Assert.assertNotNull(tiffFieldItor12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strArray18);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList10 = tiffDirectory7.getDirectoryEntries();
        long long11 = tiffDirectory7.offset;
        java.nio.ByteOrder byteOrder12 = null;
        java.awt.image.BufferedImage bufferedImage13 = tiffDirectory7.getTiffImage(byteOrder12);
        int int14 = tiffDirectory7.length;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField16 = tiffDirectory7.findField(tagInfo15);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = tiffDirectory7.getFieldValue(tagInfoShortOrLong17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tiffFieldList10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(bufferedImage13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNull(tiffField16);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.apache.commons.imaging.formats.tiff.TiffDirectory.ImageDataElement imageDataElement2 = new org.apache.commons.imaging.formats.tiff.TiffDirectory.ImageDataElement((long) (byte) -1, 0);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList10 = tiffDirectory7.getDirectoryEntries();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii11 = null;
        java.lang.String[] strArray13 = tiffDirectory7.getFieldValue(tagInfoAscii11, false);
        java.lang.String str14 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString15 = null;
        java.lang.String str17 = tiffDirectory7.getFieldValue(tagInfoXpString15, false);
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters18 = null;
        java.awt.image.BufferedImage bufferedImage19 = tiffDirectory7.getTiffImage(tiffImagingParameters18);
        long long20 = tiffDirectory7.getNextDirectoryOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs21 = null;
        int[] intArray23 = tiffDirectory7.getFieldValue(tagInfoLongs21, false);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tiffFieldList10);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Sub" + "'", str14, "Sub");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(bufferedImage19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertNull(intArray23);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts10 = null;
        short[] shortArray12 = tiffDirectory7.getFieldValue(tagInfoSShorts10, false);
        java.lang.String str13 = tiffDirectory7.description();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList14 = tiffDirectory7.getDirectoryEntries();
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData15 = null;
        tiffDirectory7.setJpegImageData(jpegImageData15);
        int int17 = tiffDirectory7.type;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii18 = null;
        java.lang.String[] strArray20 = tiffDirectory7.getFieldValue(tagInfoAscii18, false);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData21 = tiffDirectory7.getTiffImageData();
        java.awt.image.BufferedImage bufferedImage22 = tiffDirectory7.getTiffImage();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong23 = null;
        int[] intArray25 = tiffDirectory7.getFieldValue(tagInfoShortOrLong23, false);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(shortArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Sub" + "'", str13, "Sub");
        org.junit.Assert.assertNotNull(tiffFieldList14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNull(abstractTiffImageData21);
        org.junit.Assert.assertNull(bufferedImage22);
        org.junit.Assert.assertNull(intArray25);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        tiffDirectory7.dump();
        java.lang.String str9 = tiffDirectory7.description();
        tiffDirectory7.dump();
        boolean boolean11 = tiffDirectory7.hasTiffRasterData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo12 = null;
        java.lang.Object obj13 = tiffDirectory7.getFieldValue(tagInfo12);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo14 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField15 = tiffDirectory7.findField(tagInfo14);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts16 = null;
        short[] shortArray18 = tiffDirectory7.getFieldValue(tagInfoSShorts16, false);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Sub" + "'", str9, "Sub");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(tiffField15);
        org.junit.Assert.assertNull(shortArray18);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        boolean boolean10 = tiffDirectory7.hasJpegImageData();
        java.lang.String str11 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData12 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData12);
        long long14 = tiffDirectory7.offset;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals15 = null;
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray17 = tiffDirectory7.getFieldValue(tagInfoRationals15, false);
        java.util.Spliterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldSpliterator18 = tiffDirectory7.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = tiffDirectory7.imageDataInStrips();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.imaging.ImagingException; message: Couldn't find image data.");
        } catch (org.apache.commons.imaging.ImagingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Sub" + "'", str11, "Sub");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(rationalNumberArray17);
        org.junit.Assert.assertNotNull(tiffFieldSpliterator18);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        boolean boolean10 = tiffDirectory7.hasJpegImageData();
        java.lang.String str11 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData12 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData12);
        long long14 = tiffDirectory7.offset;
        java.nio.ByteOrder byteOrder15 = tiffDirectory7.getByteOrder();
        long long16 = tiffDirectory7.getNextDirectoryOffset();
        java.lang.String str17 = tiffDirectory7.description();
        boolean boolean18 = tiffDirectory7.hasTiffRasterData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii19 = null;
        java.lang.String[] strArray21 = tiffDirectory7.getFieldValue(tagInfoAscii19, false);
        java.nio.ByteOrder byteOrder22 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters23 = null;
        java.awt.image.BufferedImage bufferedImage24 = tiffDirectory7.getTiffImage(byteOrder22, tiffImagingParameters23);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = tiffDirectory7.getFieldValue(tagInfoLong25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Sub" + "'", str11, "Sub");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(byteOrder15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Sub" + "'", str17, "Sub");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNull(bufferedImage24);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray2 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList3 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList3, tiffFieldArray2);
        java.nio.ByteOrder byteOrder7 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory8 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList3, (long) 0, (long) ' ', byteOrder7);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData9 = null;
        tiffDirectory8.setTiffImageData(abstractTiffImageData9);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData11 = tiffDirectory8.getTiffImageData();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList12 = tiffDirectory8.getDirectoryEntries();
        java.nio.ByteOrder byteOrder15 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory16 = new org.apache.commons.imaging.formats.tiff.TiffDirectory((int) (byte) -1, tiffFieldList12, (long) 10, (long) 10, byteOrder15);
        java.util.Spliterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldSpliterator17 = tiffDirectory16.spliterator();
        java.nio.ByteOrder byteOrder18 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters19 = null;
        java.awt.image.BufferedImage bufferedImage20 = tiffDirectory16.getTiffImage(byteOrder18, tiffImagingParameters19);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles21 = null;
        double[] doubleArray23 = tiffDirectory16.getFieldValue(tagInfoDoubles21, false);
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters24 = null;
        java.awt.image.BufferedImage bufferedImage25 = tiffDirectory16.getTiffImage(tiffImagingParameters24);
        org.junit.Assert.assertNotNull(tiffFieldArray2);
        org.junit.Assert.assertArrayEquals(tiffFieldArray2, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(abstractTiffImageData11);
        org.junit.Assert.assertNotNull(tiffFieldList12);
        org.junit.Assert.assertNotNull(tiffFieldSpliterator17);
        org.junit.Assert.assertNull(bufferedImage20);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(bufferedImage25);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts8 = null;
        short[] shortArray10 = tiffDirectory7.getFieldValue(tagInfoSShorts8, false);
        int int11 = tiffDirectory7.size();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList12 = tiffDirectory7.getDirectoryEntries();
        int int13 = tiffDirectory7.size();
        java.lang.String str14 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShort tagInfoSShort15 = null;
        // The following exception was thrown during execution in test generation
        try {
            short short16 = tiffDirectory7.getFieldValue(tagInfoSShort15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(shortArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(tiffFieldList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Sub" + "'", str14, "Sub");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        java.awt.image.BufferedImage bufferedImage12 = tiffDirectory7.getTiffImage();
        java.lang.String str13 = tiffDirectory7.getElementDescription();
        java.nio.ByteOrder byteOrder14 = null;
        java.awt.image.BufferedImage bufferedImage15 = tiffDirectory7.getTiffImage(byteOrder14);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats tagInfoFloats16 = null;
        float[] floatArray18 = tiffDirectory7.getFieldValue(tagInfoFloats16, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString19 = null;
        java.lang.String str21 = tiffDirectory7.getFieldValue(tagInfoXpString19, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii22 = null;
        java.lang.String[] strArray24 = tiffDirectory7.getFieldValue(tagInfoAscii22, false);
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData25 = tiffDirectory7.getJpegImageData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = tiffDirectory7.getSingleFieldValue(tagInfoAscii26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(bufferedImage15);
        org.junit.Assert.assertNull(floatArray18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNull(jpegImageData25);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        java.awt.image.BufferedImage bufferedImage12 = tiffDirectory7.getTiffImage();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii13 = null;
        java.lang.String[] strArray15 = tiffDirectory7.getFieldValue(tagInfoAscii13, false);
        int int16 = tiffDirectory7.type;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = tiffDirectory7.findField(tagInfo17, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals20 = null;
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray22 = tiffDirectory7.getFieldValue(tagInfoRationals20, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs23 = null;
        int[] intArray25 = tiffDirectory7.getFieldValue(tagInfoLongs23, false);
        int int26 = tiffDirectory7.size();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData27 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData27);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData29 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData29);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImage12);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(tiffField19);
        org.junit.Assert.assertNull(rationalNumberArray22);
        org.junit.Assert.assertNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        boolean boolean10 = tiffDirectory7.hasJpegImageData();
        java.lang.String str11 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData12 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData12);
        long long14 = tiffDirectory7.offset;
        java.nio.ByteOrder byteOrder15 = tiffDirectory7.getByteOrder();
        long long16 = tiffDirectory7.getNextDirectoryOffset();
        java.lang.String str17 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText18 = null;
        java.lang.String str20 = tiffDirectory7.getFieldValue(tagInfoGpsText18, false);
        long long21 = tiffDirectory7.offset;
        boolean boolean22 = tiffDirectory7.hasJpegImageData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational tagInfoSRational23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber rationalNumber24 = tiffDirectory7.getFieldValue(tagInfoSRational23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Sub" + "'", str11, "Sub");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(byteOrder15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Sub" + "'", str17, "Sub");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts10 = null;
        short[] shortArray12 = tiffDirectory7.getFieldValue(tagInfoSShorts10, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo13 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = tiffDirectory7.findField(tagInfo13);
        int int15 = tiffDirectory7.type;
        java.nio.ByteOrder byteOrder16 = tiffDirectory7.getByteOrder();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField18 = tiffDirectory7.findField(tagInfo17);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(shortArray12);
        org.junit.Assert.assertNull(tiffField14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(byteOrder16);
        org.junit.Assert.assertNull(tiffField18);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList10 = tiffDirectory7.getDirectoryEntries();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii11 = null;
        java.lang.String[] strArray13 = tiffDirectory7.getFieldValue(tagInfoAscii11, false);
        java.lang.String str14 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals15 = null;
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray17 = tiffDirectory7.getFieldValue(tagInfoRationals15, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = null;
        java.lang.Object obj19 = tiffDirectory7.getFieldValue(tagInfo18);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData20 = tiffDirectory7.getTiffImageData();
        long long21 = tiffDirectory7.getNextDirectoryOffset();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData22 = tiffDirectory7.getTiffImageData();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tiffFieldList10);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Sub" + "'", str14, "Sub");
        org.junit.Assert.assertNull(rationalNumberArray17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(abstractTiffImageData20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertNull(abstractTiffImageData22);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts8 = null;
        short[] shortArray10 = tiffDirectory7.getFieldValue(tagInfoSShorts8, false);
        int int11 = tiffDirectory7.size();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList12 = tiffDirectory7.getDirectoryEntries();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText13 = null;
        java.lang.String str15 = tiffDirectory7.getFieldValue(tagInfoGpsText13, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals16 = null;
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray18 = tiffDirectory7.getFieldValue(tagInfoSRationals16, false);
        long long19 = tiffDirectory7.getNextDirectoryOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte20 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte byte21 = tiffDirectory7.getFieldValue(tagInfoByte20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(shortArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(tiffFieldList12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(rationalNumberArray18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = tiffDirectory7.getTiffImageData();
        java.nio.ByteOrder byteOrder11 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters12 = null;
        java.awt.image.BufferedImage bufferedImage13 = tiffDirectory7.getTiffImage(byteOrder11, tiffImagingParameters12);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo14 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField15 = tiffDirectory7.findField(tagInfo14);
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData16 = null;
        tiffDirectory7.setJpegImageData(jpegImageData16);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes tagInfoSBytes18 = null;
        byte[] byteArray20 = tiffDirectory7.getFieldValue(tagInfoSBytes18, false);
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData21 = null;
        tiffDirectory7.setJpegImageData(jpegImageData21);
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldItor23 = tiffDirectory7.iterator();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts24 = null;
        short[] shortArray26 = tiffDirectory7.getFieldValue(tagInfoSShorts24, false);
        tiffDirectory7.dump();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = tiffDirectory7.getSingleFieldValue(tagInfoAscii28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(abstractTiffImageData10);
        org.junit.Assert.assertNull(bufferedImage13);
        org.junit.Assert.assertNull(tiffField15);
        org.junit.Assert.assertNull(byteArray20);
        org.junit.Assert.assertNotNull(tiffFieldItor23);
        org.junit.Assert.assertNull(shortArray26);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        tiffDirectory7.dump();
        java.lang.String str9 = tiffDirectory7.description();
        long long10 = tiffDirectory7.offset;
        boolean boolean11 = tiffDirectory7.hasTiffImageData();
        java.util.Spliterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldSpliterator12 = tiffDirectory7.spliterator();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes13 = null;
        byte[] byteArray15 = tiffDirectory7.getFieldValue(tagInfoBytes13, false);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Sub" + "'", str9, "Sub");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tiffFieldSpliterator12);
        org.junit.Assert.assertNull(byteArray15);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts10 = null;
        short[] shortArray12 = tiffDirectory7.getFieldValue(tagInfoSShorts10, false);
        java.lang.String str13 = tiffDirectory7.description();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList14 = tiffDirectory7.getDirectoryEntries();
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData15 = null;
        tiffDirectory7.setJpegImageData(jpegImageData15);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText17 = null;
        java.lang.String str19 = tiffDirectory7.getFieldValue(tagInfoGpsText17, false);
        int int20 = tiffDirectory7.type;
        java.nio.ByteOrder byteOrder21 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters22 = null;
        java.awt.image.BufferedImage bufferedImage23 = tiffDirectory7.getTiffImage(byteOrder21, tiffImagingParameters22);
        java.util.Spliterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldSpliterator24 = tiffDirectory7.spliterator();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes tagInfoSBytes25 = null;
        byte[] byteArray27 = tiffDirectory7.getFieldValue(tagInfoSBytes25, false);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData28 = tiffDirectory7.getTiffImageData();
        tiffDirectory7.dump();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii30 = null;
        java.lang.String[] strArray32 = tiffDirectory7.getFieldValue(tagInfoAscii30, false);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList33 = tiffDirectory7.getDirectoryEntries();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(shortArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Sub" + "'", str13, "Sub");
        org.junit.Assert.assertNotNull(tiffFieldList14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(bufferedImage23);
        org.junit.Assert.assertNotNull(tiffFieldSpliterator24);
        org.junit.Assert.assertNull(byteArray27);
        org.junit.Assert.assertNull(abstractTiffImageData28);
        org.junit.Assert.assertNull(strArray32);
        org.junit.Assert.assertNotNull(tiffFieldList33);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        int int10 = tiffDirectory7.length;
        java.lang.String str11 = tiffDirectory7.getElementDescription();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText12 = null;
        java.lang.String str14 = tiffDirectory7.getFieldValue(tagInfoGpsText12, false);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData15 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData15);
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldItor17 = tiffDirectory7.iterator();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs tagInfoSLongs18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = tiffDirectory7.getFieldValue(tagInfoSLongs18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(tiffFieldItor17);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = tiffDirectory7.getTiffImageData();
        java.nio.ByteOrder byteOrder11 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters12 = null;
        java.awt.image.BufferedImage bufferedImage13 = tiffDirectory7.getTiffImage(byteOrder11, tiffImagingParameters12);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo14 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField15 = tiffDirectory7.findField(tagInfo14);
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData16 = null;
        tiffDirectory7.setJpegImageData(jpegImageData16);
        java.nio.ByteOrder byteOrder18 = tiffDirectory7.getByteOrder();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii19 = null;
        java.lang.String[] strArray21 = tiffDirectory7.getFieldValue(tagInfoAscii19, false);
        java.awt.image.BufferedImage bufferedImage22 = tiffDirectory7.getTiffImage();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(abstractTiffImageData10);
        org.junit.Assert.assertNull(bufferedImage13);
        org.junit.Assert.assertNull(tiffField15);
        org.junit.Assert.assertNull(byteOrder18);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNull(bufferedImage22);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        boolean boolean10 = tiffDirectory7.hasJpegImageData();
        java.lang.String str11 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData12 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData12);
        long long14 = tiffDirectory7.offset;
        java.nio.ByteOrder byteOrder15 = tiffDirectory7.getByteOrder();
        long long16 = tiffDirectory7.getNextDirectoryOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs17 = null;
        int[] intArray19 = tiffDirectory7.getFieldValue(tagInfoLongs17, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs20 = null;
        int[] intArray22 = tiffDirectory7.getFieldValue(tagInfoLongs20, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo23 = null;
        java.lang.Object obj24 = tiffDirectory7.getFieldValue(tagInfo23);
        java.nio.ByteOrder byteOrder25 = tiffDirectory7.getByteOrder();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloat tagInfoFloat26 = null;
        // The following exception was thrown during execution in test generation
        try {
            float float27 = tiffDirectory7.getFieldValue(tagInfoFloat26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Sub" + "'", str11, "Sub");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(byteOrder15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertNull(intArray22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(byteOrder25);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList10 = tiffDirectory7.getDirectoryEntries();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList11 = tiffDirectory7.getDirectoryEntries();
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldItor12 = tiffDirectory7.iterator();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString13 = null;
        java.lang.String str15 = tiffDirectory7.getFieldValue(tagInfoXpString13, false);
        tiffDirectory7.dump();
        java.nio.ByteOrder byteOrder17 = tiffDirectory7.getByteOrder();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes18 = null;
        byte[] byteArray20 = tiffDirectory7.getFieldValue(tagInfoBytes18, false);
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData21 = tiffDirectory7.getJpegImageData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts22 = null;
        short[] shortArray24 = tiffDirectory7.getFieldValue(tagInfoSShorts22, false);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tiffFieldList10);
        org.junit.Assert.assertNotNull(tiffFieldList11);
        org.junit.Assert.assertNotNull(tiffFieldItor12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(byteOrder17);
        org.junit.Assert.assertNull(byteArray20);
        org.junit.Assert.assertNull(jpegImageData21);
        org.junit.Assert.assertNull(shortArray24);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = tiffDirectory7.getTiffImageData();
        java.nio.ByteOrder byteOrder11 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters12 = null;
        java.awt.image.BufferedImage bufferedImage13 = tiffDirectory7.getTiffImage(byteOrder11, tiffImagingParameters12);
        java.nio.ByteOrder byteOrder14 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters15 = null;
        java.awt.image.BufferedImage bufferedImage16 = tiffDirectory7.getTiffImage(byteOrder14, tiffImagingParameters15);
        boolean boolean17 = tiffDirectory7.hasTiffRasterData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = tiffDirectory7.findField(tagInfo18);
        java.lang.String str20 = tiffDirectory7.getElementDescription();
        boolean boolean21 = tiffDirectory7.hasJpegImageData();
        boolean boolean22 = tiffDirectory7.hasJpegImageData();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList23 = tiffDirectory7.getDirectoryEntries();
        java.lang.String str24 = tiffDirectory7.getElementDescription();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts25 = null;
        short[] shortArray27 = tiffDirectory7.getFieldValue(tagInfoShorts25, false);
        int int28 = tiffDirectory7.size();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(abstractTiffImageData10);
        org.junit.Assert.assertNull(bufferedImage13);
        org.junit.Assert.assertNull(bufferedImage16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(tiffField19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(tiffFieldList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(shortArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        tiffDirectory7.dump();
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters9 = null;
        java.awt.image.BufferedImage bufferedImage10 = tiffDirectory7.getTiffImage(tiffImagingParameters9);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImage10);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        java.awt.image.BufferedImage bufferedImage12 = tiffDirectory7.getTiffImage();
        int int13 = tiffDirectory7.length;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo14 = null;
        java.lang.Object obj15 = tiffDirectory7.getFieldValue(tagInfo14);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImage12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        boolean boolean10 = tiffDirectory7.hasJpegImageData();
        java.lang.String str11 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData12 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData12);
        long long14 = tiffDirectory7.offset;
        java.nio.ByteOrder byteOrder15 = tiffDirectory7.getByteOrder();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong16 = null;
        int[] intArray18 = tiffDirectory7.getFieldValue(tagInfoShortOrLong16, false);
        boolean boolean19 = tiffDirectory7.hasJpegImageData();
        boolean boolean20 = tiffDirectory7.hasTiffImageData();
        java.util.Spliterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldSpliterator21 = tiffDirectory7.spliterator();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong22 = null;
        int[] intArray24 = tiffDirectory7.getFieldValue(tagInfoShortOrLong22, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes tagInfoSBytes25 = null;
        byte[] byteArray27 = tiffDirectory7.getFieldValue(tagInfoSBytes25, false);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Sub" + "'", str11, "Sub");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(byteOrder15);
        org.junit.Assert.assertNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(tiffFieldSpliterator21);
        org.junit.Assert.assertNull(intArray24);
        org.junit.Assert.assertNull(byteArray27);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = tiffDirectory7.getTiffImageData();
        java.nio.ByteOrder byteOrder11 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters12 = null;
        java.awt.image.BufferedImage bufferedImage13 = tiffDirectory7.getTiffImage(byteOrder11, tiffImagingParameters12);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo14 = null;
        java.lang.Object obj15 = tiffDirectory7.getFieldValue(tagInfo14);
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters16 = null;
        java.awt.image.BufferedImage bufferedImage17 = tiffDirectory7.getTiffImage(tiffImagingParameters16);
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData18 = tiffDirectory7.getJpegImageData();
        java.lang.String str19 = tiffDirectory7.description();
        boolean boolean20 = tiffDirectory7.hasTiffFloatingPointRasterData();
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData21 = null;
        tiffDirectory7.setJpegImageData(jpegImageData21);
        java.lang.String str23 = tiffDirectory7.getElementDescription();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(abstractTiffImageData10);
        org.junit.Assert.assertNull(bufferedImage13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(bufferedImage17);
        org.junit.Assert.assertNull(jpegImageData18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Sub" + "'", str19, "Sub");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        boolean boolean10 = tiffDirectory7.hasJpegImageData();
        java.lang.String str11 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData12 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData12);
        long long14 = tiffDirectory7.offset;
        java.nio.ByteOrder byteOrder15 = tiffDirectory7.getByteOrder();
        long long16 = tiffDirectory7.getNextDirectoryOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs17 = null;
        int[] intArray19 = tiffDirectory7.getFieldValue(tagInfoLongs17, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals20 = null;
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray22 = tiffDirectory7.getFieldValue(tagInfoRationals20, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes tagInfoSBytes23 = null;
        byte[] byteArray25 = tiffDirectory7.getFieldValue(tagInfoSBytes23, false);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Sub" + "'", str11, "Sub");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(byteOrder15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertNull(rationalNumberArray22);
        org.junit.Assert.assertNull(byteArray25);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts10 = null;
        short[] shortArray12 = tiffDirectory7.getFieldValue(tagInfoSShorts10, false);
        java.lang.String str13 = tiffDirectory7.description();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList14 = tiffDirectory7.getDirectoryEntries();
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData15 = null;
        tiffDirectory7.setJpegImageData(jpegImageData15);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText17 = null;
        java.lang.String str19 = tiffDirectory7.getFieldValue(tagInfoGpsText17, false);
        int int20 = tiffDirectory7.type;
        java.nio.ByteOrder byteOrder21 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters22 = null;
        java.awt.image.BufferedImage bufferedImage23 = tiffDirectory7.getTiffImage(byteOrder21, tiffImagingParameters22);
        java.util.Spliterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldSpliterator24 = tiffDirectory7.spliterator();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo25 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField26 = tiffDirectory7.findField(tagInfo25);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText27 = null;
        java.lang.String str29 = tiffDirectory7.getFieldValue(tagInfoGpsText27, false);
        boolean boolean30 = tiffDirectory7.hasTiffFloatingPointRasterData();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(shortArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Sub" + "'", str13, "Sub");
        org.junit.Assert.assertNotNull(tiffFieldList14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(bufferedImage23);
        org.junit.Assert.assertNotNull(tiffFieldSpliterator24);
        org.junit.Assert.assertNull(tiffField26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        boolean boolean10 = tiffDirectory7.hasJpegImageData();
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldItor11 = tiffDirectory7.iterator();
        tiffDirectory7.dump();
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldItor13 = tiffDirectory7.iterator();
        java.lang.String str14 = tiffDirectory7.description();
        int int15 = tiffDirectory7.size();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tiffFieldItor11);
        org.junit.Assert.assertNotNull(tiffFieldItor13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Sub" + "'", str14, "Sub");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        tiffDirectory7.dump();
        java.lang.String str9 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        long long12 = tiffDirectory7.getNextDirectoryOffset();
        java.lang.String str13 = tiffDirectory7.getElementDescription();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts14 = null;
        short[] shortArray16 = tiffDirectory7.getFieldValue(tagInfoSShorts14, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = tiffDirectory7.imageDataInStrips();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.imaging.ImagingException; message: Couldn't find image data.");
        } catch (org.apache.commons.imaging.ImagingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Sub" + "'", str9, "Sub");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(shortArray16);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        boolean boolean10 = tiffDirectory7.hasJpegImageData();
        java.lang.String str11 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData12 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData12);
        long long14 = tiffDirectory7.offset;
        java.nio.ByteOrder byteOrder15 = tiffDirectory7.getByteOrder();
        long long16 = tiffDirectory7.getNextDirectoryOffset();
        java.lang.String str17 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText18 = null;
        java.lang.String str20 = tiffDirectory7.getFieldValue(tagInfoGpsText18, false);
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData21 = null;
        tiffDirectory7.setJpegImageData(jpegImageData21);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Sub" + "'", str11, "Sub");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(byteOrder15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Sub" + "'", str17, "Sub");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        java.awt.image.BufferedImage bufferedImage12 = tiffDirectory7.getTiffImage();
        long long13 = tiffDirectory7.offset;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats tagInfoFloats14 = null;
        float[] floatArray16 = tiffDirectory7.getFieldValue(tagInfoFloats14, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = null;
        java.lang.Object obj18 = tiffDirectory7.getFieldValue(tagInfo17);
        long long19 = tiffDirectory7.getNextDirectoryOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = tiffDirectory7.findField(tagInfo20, false);
        java.nio.ByteOrder byteOrder23 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters24 = null;
        java.awt.image.BufferedImage bufferedImage25 = tiffDirectory7.getTiffImage(byteOrder23, tiffImagingParameters24);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImage12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(floatArray16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNull(tiffField22);
        org.junit.Assert.assertNull(bufferedImage25);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        tiffDirectory7.dump();
        boolean boolean11 = tiffDirectory7.hasTiffRasterData();
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData12 = tiffDirectory7.getJpegImageData();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jpegImageData12);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        int int10 = tiffDirectory7.length;
        int int11 = tiffDirectory7.type;
        boolean boolean12 = tiffDirectory7.hasTiffFloatingPointRasterData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffField tiffField15 = tiffDirectory7.findField(tagInfo13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        boolean boolean10 = tiffDirectory7.hasJpegImageData();
        java.lang.String str11 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData12 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData12);
        long long14 = tiffDirectory7.offset;
        java.lang.String str15 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes16 = null;
        byte[] byteArray18 = tiffDirectory7.getFieldValue(tagInfoBytes16, false);
        boolean boolean19 = tiffDirectory7.hasTiffRasterData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong20 = null;
        int[] intArray22 = tiffDirectory7.getFieldValue(tagInfoShortOrLong20, false);
        int int23 = tiffDirectory7.length;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts24 = null;
        short[] shortArray26 = tiffDirectory7.getFieldValue(tagInfoSShorts24, false);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Sub" + "'", str11, "Sub");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Sub" + "'", str15, "Sub");
        org.junit.Assert.assertNull(byteArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertNull(shortArray26);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList10 = tiffDirectory7.getDirectoryEntries();
        java.nio.ByteOrder byteOrder11 = null;
        java.awt.image.BufferedImage bufferedImage12 = tiffDirectory7.getTiffImage(byteOrder11);
        boolean boolean13 = tiffDirectory7.hasTiffImageData();
        boolean boolean14 = tiffDirectory7.hasTiffImageData();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tiffFieldList10);
        org.junit.Assert.assertNull(bufferedImage12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = tiffDirectory7.getTiffImageData();
        java.nio.ByteOrder byteOrder11 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters12 = null;
        java.awt.image.BufferedImage bufferedImage13 = tiffDirectory7.getTiffImage(byteOrder11, tiffImagingParameters12);
        java.nio.ByteOrder byteOrder14 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters15 = null;
        java.awt.image.BufferedImage bufferedImage16 = tiffDirectory7.getTiffImage(byteOrder14, tiffImagingParameters15);
        boolean boolean17 = tiffDirectory7.hasTiffRasterData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = tiffDirectory7.findField(tagInfo18);
        java.lang.String str20 = tiffDirectory7.getElementDescription();
        boolean boolean21 = tiffDirectory7.hasJpegImageData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString22 = null;
        java.lang.String str24 = tiffDirectory7.getFieldValue(tagInfoXpString22, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo25 = null;
        java.lang.Object obj26 = tiffDirectory7.getFieldValue(tagInfo25);
        java.lang.String str27 = tiffDirectory7.getElementDescription();
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldItor28 = tiffDirectory7.iterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffDirectory.ImageDataElement imageDataElement29 = tiffDirectory7.getJpegRawImageDataElement();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.imaging.ImagingException; message: Couldn't find image data.");
        } catch (org.apache.commons.imaging.ImagingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(abstractTiffImageData10);
        org.junit.Assert.assertNull(bufferedImage13);
        org.junit.Assert.assertNull(bufferedImage16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(tiffField19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(tiffFieldItor28);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        java.awt.image.BufferedImage bufferedImage12 = tiffDirectory7.getTiffImage();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii13 = null;
        java.lang.String[] strArray15 = tiffDirectory7.getFieldValue(tagInfoAscii13, false);
        java.util.Spliterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldSpliterator16 = tiffDirectory7.spliterator();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloat tagInfoFloat17 = null;
        // The following exception was thrown during execution in test generation
        try {
            float float18 = tiffDirectory7.getFieldValue(tagInfoFloat17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImage12);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(tiffFieldSpliterator16);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        boolean boolean10 = tiffDirectory7.hasJpegImageData();
        java.lang.String str11 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData12 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData12);
        long long14 = tiffDirectory7.offset;
        java.lang.String str15 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters16 = null;
        java.awt.image.BufferedImage bufferedImage17 = tiffDirectory7.getTiffImage(tiffImagingParameters16);
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters18 = null;
        java.awt.image.BufferedImage bufferedImage19 = tiffDirectory7.getTiffImage(tiffImagingParameters18);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList20 = tiffDirectory7.getDirectoryEntries();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText21 = null;
        java.lang.String str23 = tiffDirectory7.getFieldValue(tagInfoGpsText21, false);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Sub" + "'", str11, "Sub");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Sub" + "'", str15, "Sub");
        org.junit.Assert.assertNull(bufferedImage17);
        org.junit.Assert.assertNull(bufferedImage19);
        org.junit.Assert.assertNotNull(tiffFieldList20);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        boolean boolean10 = tiffDirectory7.hasJpegImageData();
        java.lang.String str11 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData12 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData12);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes14 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = tiffDirectory7.getFieldValue(tagInfoBytes14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Sub" + "'", str11, "Sub");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.apache.commons.imaging.formats.tiff.TiffDirectory.ImageDataElement imageDataElement2 = new org.apache.commons.imaging.formats.tiff.TiffDirectory.ImageDataElement((long) '#', (int) '#');
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        java.awt.image.BufferedImage bufferedImage12 = tiffDirectory7.getTiffImage();
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters13 = null;
        java.awt.image.BufferedImage bufferedImage14 = tiffDirectory7.getTiffImage(tiffImagingParameters13);
        java.util.Spliterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldSpliterator15 = tiffDirectory7.spliterator();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText16 = null;
        java.lang.String str18 = tiffDirectory7.getFieldValue(tagInfoGpsText16, false);
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldItor19 = tiffDirectory7.iterator();
        java.lang.String str20 = tiffDirectory7.getElementDescription();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii21 = null;
        java.lang.String[] strArray23 = tiffDirectory7.getFieldValue(tagInfoAscii21, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles24 = null;
        double[] doubleArray26 = tiffDirectory7.getFieldValue(tagInfoDoubles24, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs27 = null;
        int[] intArray29 = tiffDirectory7.getFieldValue(tagInfoLongs27, false);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImage12);
        org.junit.Assert.assertNull(bufferedImage14);
        org.junit.Assert.assertNotNull(tiffFieldSpliterator15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(tiffFieldItor19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertNull(intArray29);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList10 = tiffDirectory7.getDirectoryEntries();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii11 = null;
        java.lang.String[] strArray13 = tiffDirectory7.getFieldValue(tagInfoAscii11, false);
        java.lang.String str14 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals15 = null;
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray17 = tiffDirectory7.getFieldValue(tagInfoRationals15, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = null;
        java.lang.Object obj19 = tiffDirectory7.getFieldValue(tagInfo18);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.imaging.formats.tiff.TiffDirectory.ImageDataElement> imageDataElementList20 = tiffDirectory7.getTiffRawImageDataElements();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.imaging.ImagingException; message: Couldn't find image data.");
        } catch (org.apache.commons.imaging.ImagingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tiffFieldList10);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Sub" + "'", str14, "Sub");
        org.junit.Assert.assertNull(rationalNumberArray17);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        tiffDirectory7.dump();
        java.lang.String str9 = tiffDirectory7.description();
        java.lang.String str10 = tiffDirectory7.description();
        java.lang.String str11 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData12 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData12);
        boolean boolean14 = tiffDirectory7.hasTiffFloatingPointRasterData();
        boolean boolean15 = tiffDirectory7.hasTiffFloatingPointRasterData();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Sub" + "'", str9, "Sub");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Sub" + "'", str10, "Sub");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Sub" + "'", str11, "Sub");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray3 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList4 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList4, tiffFieldArray3);
        java.nio.ByteOrder byteOrder8 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory9 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList4, (long) 0, (long) ' ', byteOrder8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory9.setTiffImageData(abstractTiffImageData10);
        int int12 = tiffDirectory9.length;
        boolean boolean13 = tiffDirectory9.hasTiffRasterData();
        long long14 = tiffDirectory9.getNextDirectoryOffset();
        java.awt.image.BufferedImage bufferedImage15 = tiffDirectory9.getTiffImage();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList16 = tiffDirectory9.getDirectoryEntries();
        java.nio.ByteOrder byteOrder19 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory20 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, tiffFieldList16, 0L, (long) (short) 100, byteOrder19);
        java.nio.ByteOrder byteOrder23 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory24 = new org.apache.commons.imaging.formats.tiff.TiffDirectory((int) 'a', tiffFieldList16, (long) 100, (long) (byte) -1, byteOrder23);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort25 = null;
        // The following exception was thrown during execution in test generation
        try {
            short short26 = tiffDirectory24.getFieldValue(tagInfoShort25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray3);
        org.junit.Assert.assertArrayEquals(tiffFieldArray3, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertNull(bufferedImage15);
        org.junit.Assert.assertNotNull(tiffFieldList16);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData10 = tiffDirectory7.getJpegImageData();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList11 = tiffDirectory7.getDirectoryEntries();
        boolean boolean12 = tiffDirectory7.hasJpegImageData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShort tagInfoSShort13 = null;
        // The following exception was thrown during execution in test generation
        try {
            short short14 = tiffDirectory7.getFieldValue(tagInfoSShort13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jpegImageData10);
        org.junit.Assert.assertNotNull(tiffFieldList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        int int10 = tiffDirectory7.length;
        java.lang.String str11 = tiffDirectory7.getElementDescription();
        boolean boolean12 = tiffDirectory7.hasJpegImageData();
        java.awt.image.BufferedImage bufferedImage13 = tiffDirectory7.getTiffImage();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList14 = tiffDirectory7.getDirectoryEntries();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(bufferedImage13);
        org.junit.Assert.assertNotNull(tiffFieldList14);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = tiffDirectory7.getTiffImageData();
        java.nio.ByteOrder byteOrder11 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters12 = null;
        java.awt.image.BufferedImage bufferedImage13 = tiffDirectory7.getTiffImage(byteOrder11, tiffImagingParameters12);
        java.nio.ByteOrder byteOrder14 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters15 = null;
        java.awt.image.BufferedImage bufferedImage16 = tiffDirectory7.getTiffImage(byteOrder14, tiffImagingParameters15);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong17 = null;
        int[] intArray19 = tiffDirectory7.getFieldValue(tagInfoShortOrLong17, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo20 = null;
        java.lang.Object obj21 = tiffDirectory7.getFieldValue(tagInfo20);
        long long22 = tiffDirectory7.offset;
        long long23 = tiffDirectory7.getNextDirectoryOffset();
        long long24 = tiffDirectory7.getNextDirectoryOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo25 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField27 = tiffDirectory7.findField(tagInfo25, false);
        java.awt.image.BufferedImage bufferedImage28 = tiffDirectory7.getTiffImage();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(abstractTiffImageData10);
        org.junit.Assert.assertNull(bufferedImage13);
        org.junit.Assert.assertNull(bufferedImage16);
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
        org.junit.Assert.assertNull(tiffField27);
        org.junit.Assert.assertNull(bufferedImage28);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        java.awt.image.BufferedImage bufferedImage12 = tiffDirectory7.getTiffImage();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii13 = null;
        java.lang.String[] strArray15 = tiffDirectory7.getFieldValue(tagInfoAscii13, false);
        int int16 = tiffDirectory7.type;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = tiffDirectory7.findField(tagInfo17, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals20 = null;
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray22 = tiffDirectory7.getFieldValue(tagInfoRationals20, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs23 = null;
        int[] intArray25 = tiffDirectory7.getFieldValue(tagInfoLongs23, false);
        int int26 = tiffDirectory7.size();
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldItor27 = tiffDirectory7.iterator();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImage12);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(tiffField19);
        org.junit.Assert.assertNull(rationalNumberArray22);
        org.junit.Assert.assertNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(tiffFieldItor27);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        java.awt.image.BufferedImage bufferedImage12 = tiffDirectory7.getTiffImage();
        java.lang.String str13 = tiffDirectory7.getElementDescription();
        java.nio.ByteOrder byteOrder14 = null;
        java.awt.image.BufferedImage bufferedImage15 = tiffDirectory7.getTiffImage(byteOrder14);
        java.util.Spliterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldSpliterator16 = tiffDirectory7.spliterator();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText17 = null;
        java.lang.String str19 = tiffDirectory7.getFieldValue(tagInfoGpsText17, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts20 = null;
        short[] shortArray22 = tiffDirectory7.getFieldValue(tagInfoShorts20, false);
        java.nio.ByteOrder byteOrder23 = tiffDirectory7.getByteOrder();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles24 = null;
        double[] doubleArray26 = tiffDirectory7.getFieldValue(tagInfoDoubles24, false);
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffRasterData tiffRasterData28 = tiffDirectory7.getRasterData(tiffImagingParameters27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.imaging.ImagingException; message: Required field \"SampleFormat\" is missing");
        } catch (org.apache.commons.imaging.ImagingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(bufferedImage15);
        org.junit.Assert.assertNotNull(tiffFieldSpliterator16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(shortArray22);
        org.junit.Assert.assertNull(byteOrder23);
        org.junit.Assert.assertNull(doubleArray26);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        java.awt.image.BufferedImage bufferedImage12 = tiffDirectory7.getTiffImage();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii13 = null;
        java.lang.String[] strArray15 = tiffDirectory7.getFieldValue(tagInfoAscii13, false);
        java.util.Spliterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldSpliterator16 = tiffDirectory7.spliterator();
        boolean boolean17 = tiffDirectory7.hasTiffFloatingPointRasterData();
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData18 = null;
        tiffDirectory7.setJpegImageData(jpegImageData18);
        java.nio.ByteOrder byteOrder20 = null;
        java.awt.image.BufferedImage bufferedImage21 = tiffDirectory7.getTiffImage(byteOrder20);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffField tiffField24 = tiffDirectory7.findField(tagInfo22, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImage12);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(tiffFieldSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(bufferedImage21);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        tiffDirectory7.dump();
        java.lang.String str9 = tiffDirectory7.description();
        tiffDirectory7.dump();
        boolean boolean11 = tiffDirectory7.hasTiffRasterData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo12 = null;
        java.lang.Object obj13 = tiffDirectory7.getFieldValue(tagInfo12);
        java.nio.ByteOrder byteOrder14 = null;
        java.awt.image.BufferedImage bufferedImage15 = tiffDirectory7.getTiffImage(byteOrder14);
        int int16 = tiffDirectory7.type;
        boolean boolean17 = tiffDirectory7.hasJpegImageData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte tagInfoSByte18 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte byte19 = tiffDirectory7.getFieldValue(tagInfoSByte18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Sub" + "'", str9, "Sub");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(bufferedImage15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList10 = tiffDirectory7.getDirectoryEntries();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii11 = null;
        java.lang.String[] strArray13 = tiffDirectory7.getFieldValue(tagInfoAscii11, false);
        java.lang.String str14 = tiffDirectory7.description();
        boolean boolean15 = tiffDirectory7.hasTiffImageData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes16 = null;
        byte[] byteArray18 = tiffDirectory7.getFieldValue(tagInfoBytes16, false);
        java.awt.image.BufferedImage bufferedImage19 = tiffDirectory7.getTiffImage();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs tagInfoSLongs20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = tiffDirectory7.getFieldValue(tagInfoSLongs20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tiffFieldList10);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Sub" + "'", str14, "Sub");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(byteArray18);
        org.junit.Assert.assertNull(bufferedImage19);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        java.awt.image.BufferedImage bufferedImage12 = tiffDirectory7.getTiffImage();
        java.lang.String str13 = tiffDirectory7.getElementDescription();
        boolean boolean14 = tiffDirectory7.hasJpegImageData();
        java.nio.ByteOrder byteOrder15 = null;
        java.awt.image.BufferedImage bufferedImage16 = tiffDirectory7.getTiffImage(byteOrder15);
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldItor17 = tiffDirectory7.iterator();
        int int18 = tiffDirectory7.type;
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(bufferedImage16);
        org.junit.Assert.assertNotNull(tiffFieldItor17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts8 = null;
        short[] shortArray10 = tiffDirectory7.getFieldValue(tagInfoSShorts8, false);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData11 = tiffDirectory7.getTiffImageData();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList12 = tiffDirectory7.getDirectoryEntries();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(shortArray10);
        org.junit.Assert.assertNull(abstractTiffImageData11);
        org.junit.Assert.assertNotNull(tiffFieldList12);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        boolean boolean10 = tiffDirectory7.hasJpegImageData();
        java.lang.String str11 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData12 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData12);
        long long14 = tiffDirectory7.offset;
        java.nio.ByteOrder byteOrder15 = tiffDirectory7.getByteOrder();
        long long16 = tiffDirectory7.getNextDirectoryOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs17 = null;
        int[] intArray19 = tiffDirectory7.getFieldValue(tagInfoLongs17, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs20 = null;
        int[] intArray22 = tiffDirectory7.getFieldValue(tagInfoLongs20, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo23 = null;
        java.lang.Object obj24 = tiffDirectory7.getFieldValue(tagInfo23);
        java.nio.ByteOrder byteOrder25 = tiffDirectory7.getByteOrder();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles26 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray28 = tiffDirectory7.getFieldValue(tagInfoDoubles26, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Sub" + "'", str11, "Sub");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(byteOrder15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertNull(intArray22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(byteOrder25);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray3 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList4 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList4, tiffFieldArray3);
        java.nio.ByteOrder byteOrder8 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory9 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList4, (long) 0, (long) ' ', byteOrder8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory9.setTiffImageData(abstractTiffImageData10);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts12 = null;
        short[] shortArray14 = tiffDirectory9.getFieldValue(tagInfoSShorts12, false);
        java.lang.String str15 = tiffDirectory9.description();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList16 = tiffDirectory9.getDirectoryEntries();
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData17 = null;
        tiffDirectory9.setJpegImageData(jpegImageData17);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText19 = null;
        java.lang.String str21 = tiffDirectory9.getFieldValue(tagInfoGpsText19, false);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList22 = tiffDirectory9.getDirectoryEntries();
        java.nio.ByteOrder byteOrder25 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory26 = new org.apache.commons.imaging.formats.tiff.TiffDirectory((int) '4', tiffFieldList22, (long) '4', (long) (short) 100, byteOrder25);
        java.nio.ByteOrder byteOrder29 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory30 = new org.apache.commons.imaging.formats.tiff.TiffDirectory((int) '#', tiffFieldList22, 0L, (long) 'a', byteOrder29);
        boolean boolean31 = tiffDirectory30.hasTiffImageData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals32 = null;
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray34 = tiffDirectory30.getFieldValue(tagInfoRationals32, false);
        java.nio.ByteOrder byteOrder35 = null;
        java.awt.image.BufferedImage bufferedImage36 = tiffDirectory30.getTiffImage(byteOrder35);
        java.lang.String str37 = tiffDirectory30.getElementDescription();
        boolean boolean38 = tiffDirectory30.hasTiffImageData();
        org.junit.Assert.assertNotNull(tiffFieldArray3);
        org.junit.Assert.assertArrayEquals(tiffFieldArray3, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(shortArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Sub" + "'", str15, "Sub");
        org.junit.Assert.assertNotNull(tiffFieldList16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(tiffFieldList22);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(rationalNumberArray34);
        org.junit.Assert.assertNull(bufferedImage36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        boolean boolean10 = tiffDirectory7.hasJpegImageData();
        java.lang.String str11 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData12 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData12);
        long long14 = tiffDirectory7.offset;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong15 = null;
        int[] intArray17 = tiffDirectory7.getFieldValue(tagInfoShortOrLong15, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals18 = null;
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray20 = tiffDirectory7.getFieldValue(tagInfoSRationals18, false);
        java.nio.ByteOrder byteOrder21 = null;
        java.awt.image.BufferedImage bufferedImage22 = tiffDirectory7.getTiffImage(byteOrder21);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData23 = tiffDirectory7.getTiffImageData();
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters24 = null;
        java.awt.image.BufferedImage bufferedImage25 = tiffDirectory7.getTiffImage(tiffImagingParameters24);
        java.nio.ByteOrder byteOrder26 = null;
        java.awt.image.BufferedImage bufferedImage27 = tiffDirectory7.getTiffImage(byteOrder26);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Sub" + "'", str11, "Sub");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(intArray17);
        org.junit.Assert.assertNull(rationalNumberArray20);
        org.junit.Assert.assertNull(bufferedImage22);
        org.junit.Assert.assertNull(abstractTiffImageData23);
        org.junit.Assert.assertNull(bufferedImage25);
        org.junit.Assert.assertNull(bufferedImage27);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong12 = null;
        int[] intArray14 = tiffDirectory7.getFieldValue(tagInfoShortOrLong12, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = null;
        java.lang.Object obj16 = tiffDirectory7.getFieldValue(tagInfo15);
        int int17 = tiffDirectory7.length;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts18 = null;
        short[] shortArray20 = tiffDirectory7.getFieldValue(tagInfoShorts18, false);
        int int21 = tiffDirectory7.type;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText22 = null;
        java.lang.String str24 = tiffDirectory7.getFieldValue(tagInfoGpsText22, false);
        java.lang.Class<?> wildcardClass25 = tiffDirectory7.getClass();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNull(shortArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = tiffDirectory7.getTiffImageData();
        java.nio.ByteOrder byteOrder11 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters12 = null;
        java.awt.image.BufferedImage bufferedImage13 = tiffDirectory7.getTiffImage(byteOrder11, tiffImagingParameters12);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo14 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField15 = tiffDirectory7.findField(tagInfo14);
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData16 = null;
        tiffDirectory7.setJpegImageData(jpegImageData16);
        java.nio.ByteOrder byteOrder18 = tiffDirectory7.getByteOrder();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles19 = null;
        double[] doubleArray21 = tiffDirectory7.getFieldValue(tagInfoDoubles19, false);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(abstractTiffImageData10);
        org.junit.Assert.assertNull(bufferedImage13);
        org.junit.Assert.assertNull(tiffField15);
        org.junit.Assert.assertNull(byteOrder18);
        org.junit.Assert.assertNull(doubleArray21);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        java.awt.image.BufferedImage bufferedImage12 = tiffDirectory7.getTiffImage();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString13 = null;
        java.lang.String str15 = tiffDirectory7.getFieldValue(tagInfoXpString13, false);
        java.util.Spliterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldSpliterator16 = tiffDirectory7.spliterator();
        long long17 = tiffDirectory7.getNextDirectoryOffset();
        long long18 = tiffDirectory7.getNextDirectoryOffset();
        long long19 = tiffDirectory7.offset;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii20 = null;
        java.lang.String[] strArray22 = tiffDirectory7.getFieldValue(tagInfoAscii20, false);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImage12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(tiffFieldSpliterator16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNull(strArray22);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong12 = null;
        int[] intArray14 = tiffDirectory7.getFieldValue(tagInfoShortOrLong12, false);
        java.nio.ByteOrder byteOrder15 = tiffDirectory7.getByteOrder();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs tagInfoSLongs16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = tiffDirectory7.getFieldValue(tagInfoSLongs16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNull(byteOrder15);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        java.awt.image.BufferedImage bufferedImage12 = tiffDirectory7.getTiffImage();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii13 = null;
        java.lang.String[] strArray15 = tiffDirectory7.getFieldValue(tagInfoAscii13, false);
        int int16 = tiffDirectory7.type;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = tiffDirectory7.findField(tagInfo17, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals20 = null;
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray22 = tiffDirectory7.getFieldValue(tagInfoSRationals20, false);
        java.nio.ByteOrder byteOrder23 = tiffDirectory7.getByteOrder();
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffRasterData tiffRasterData25 = tiffDirectory7.getRasterData(tiffImagingParameters24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.imaging.ImagingException; message: Required field \"SampleFormat\" is missing");
        } catch (org.apache.commons.imaging.ImagingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImage12);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(tiffField19);
        org.junit.Assert.assertNull(rationalNumberArray22);
        org.junit.Assert.assertNull(byteOrder23);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = tiffDirectory7.getTiffImageData();
        java.nio.ByteOrder byteOrder11 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters12 = null;
        java.awt.image.BufferedImage bufferedImage13 = tiffDirectory7.getTiffImage(byteOrder11, tiffImagingParameters12);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo14 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField15 = tiffDirectory7.findField(tagInfo14);
        int int16 = tiffDirectory7.length;
        int int17 = tiffDirectory7.size();
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters18 = null;
        java.awt.image.BufferedImage bufferedImage19 = tiffDirectory7.getTiffImage(tiffImagingParameters18);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters21 = null;
        java.awt.image.BufferedImage bufferedImage22 = tiffDirectory7.getTiffImage(byteOrder20, tiffImagingParameters21);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(abstractTiffImageData10);
        org.junit.Assert.assertNull(bufferedImage13);
        org.junit.Assert.assertNull(tiffField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(bufferedImage19);
        org.junit.Assert.assertNull(bufferedImage22);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray3 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList4 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList4, tiffFieldArray3);
        java.nio.ByteOrder byteOrder8 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory9 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList4, (long) 0, (long) ' ', byteOrder8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory9.setTiffImageData(abstractTiffImageData10);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData12 = null;
        tiffDirectory9.setTiffImageData(abstractTiffImageData12);
        java.awt.image.BufferedImage bufferedImage14 = tiffDirectory9.getTiffImage();
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters15 = null;
        java.awt.image.BufferedImage bufferedImage16 = tiffDirectory9.getTiffImage(tiffImagingParameters15);
        java.util.Spliterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldSpliterator17 = tiffDirectory9.spliterator();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText18 = null;
        java.lang.String str20 = tiffDirectory9.getFieldValue(tagInfoGpsText18, false);
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldItor21 = tiffDirectory9.iterator();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList22 = tiffDirectory9.getDirectoryEntries();
        java.nio.ByteOrder byteOrder25 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory26 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, tiffFieldList22, (long) 6, 0L, byteOrder25);
        java.nio.ByteOrder byteOrder29 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory30 = new org.apache.commons.imaging.formats.tiff.TiffDirectory((int) (short) 1, tiffFieldList22, (long) 6, (long) 0, byteOrder29);
        org.junit.Assert.assertNotNull(tiffFieldArray3);
        org.junit.Assert.assertArrayEquals(tiffFieldArray3, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bufferedImage14);
        org.junit.Assert.assertNull(bufferedImage16);
        org.junit.Assert.assertNotNull(tiffFieldSpliterator17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(tiffFieldItor21);
        org.junit.Assert.assertNotNull(tiffFieldList22);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        java.awt.image.BufferedImage bufferedImage12 = tiffDirectory7.getTiffImage();
        java.lang.String str13 = tiffDirectory7.getElementDescription();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo14 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField16 = tiffDirectory7.findField(tagInfo14, false);
        boolean boolean17 = tiffDirectory7.hasTiffImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData18 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData18);
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData20 = tiffDirectory7.getJpegImageData();
        java.nio.ByteOrder byteOrder21 = tiffDirectory7.getByteOrder();
        int int22 = tiffDirectory7.size();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(tiffField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(jpegImageData20);
        org.junit.Assert.assertNull(byteOrder21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        java.awt.image.BufferedImage bufferedImage12 = tiffDirectory7.getTiffImage();
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters13 = null;
        java.awt.image.BufferedImage bufferedImage14 = tiffDirectory7.getTiffImage(tiffImagingParameters13);
        java.util.Spliterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldSpliterator15 = tiffDirectory7.spliterator();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText16 = null;
        java.lang.String str18 = tiffDirectory7.getFieldValue(tagInfoGpsText16, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles19 = null;
        double[] doubleArray21 = tiffDirectory7.getFieldValue(tagInfoDoubles19, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts22 = null;
        short[] shortArray24 = tiffDirectory7.getFieldValue(tagInfoShorts22, false);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImage12);
        org.junit.Assert.assertNull(bufferedImage14);
        org.junit.Assert.assertNotNull(tiffFieldSpliterator15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(shortArray24);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        java.awt.image.BufferedImage bufferedImage12 = tiffDirectory7.getTiffImage();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii13 = null;
        java.lang.String[] strArray15 = tiffDirectory7.getFieldValue(tagInfoAscii13, false);
        int int16 = tiffDirectory7.type;
        boolean boolean17 = tiffDirectory7.hasJpegImageData();
        java.nio.ByteOrder byteOrder18 = null;
        java.awt.image.BufferedImage bufferedImage19 = tiffDirectory7.getTiffImage(byteOrder18);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData20 = tiffDirectory7.getTiffImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData21 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData21);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImage12);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(bufferedImage19);
        org.junit.Assert.assertNull(abstractTiffImageData20);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray3 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList4 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList4, tiffFieldArray3);
        java.nio.ByteOrder byteOrder8 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory9 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList4, (long) 0, (long) ' ', byteOrder8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory9.setTiffImageData(abstractTiffImageData10);
        boolean boolean12 = tiffDirectory9.hasJpegImageData();
        java.lang.String str13 = tiffDirectory9.description();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData14 = null;
        tiffDirectory9.setTiffImageData(abstractTiffImageData14);
        long long16 = tiffDirectory9.offset;
        java.nio.ByteOrder byteOrder17 = tiffDirectory9.getByteOrder();
        long long18 = tiffDirectory9.getNextDirectoryOffset();
        java.lang.String str19 = tiffDirectory9.description();
        boolean boolean20 = tiffDirectory9.hasTiffRasterData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii21 = null;
        java.lang.String[] strArray23 = tiffDirectory9.getFieldValue(tagInfoAscii21, false);
        java.lang.String str24 = tiffDirectory9.description();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList25 = tiffDirectory9.getDirectoryEntries();
        java.nio.ByteOrder byteOrder28 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory29 = new org.apache.commons.imaging.formats.tiff.TiffDirectory((int) (byte) -1, tiffFieldList25, (long) 1, 100L, byteOrder28);
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory33 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, tiffFieldList25, (long) 0, (long) (byte) 100, byteOrder32);
        org.junit.Assert.assertNotNull(tiffFieldArray3);
        org.junit.Assert.assertArrayEquals(tiffFieldArray3, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Sub" + "'", str13, "Sub");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(byteOrder17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Sub" + "'", str19, "Sub");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Sub" + "'", str24, "Sub");
        org.junit.Assert.assertNotNull(tiffFieldList25);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        java.awt.image.BufferedImage bufferedImage12 = tiffDirectory7.getTiffImage();
        java.lang.String str13 = tiffDirectory7.getElementDescription();
        boolean boolean14 = tiffDirectory7.hasJpegImageData();
        java.nio.ByteOrder byteOrder15 = null;
        java.awt.image.BufferedImage bufferedImage16 = tiffDirectory7.getTiffImage(byteOrder15);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs tagInfoSLongs17 = null;
        int[] intArray19 = tiffDirectory7.getFieldValue(tagInfoSLongs17, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes20 = null;
        byte[] byteArray22 = tiffDirectory7.getFieldValue(tagInfoBytes20, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte23 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte byte24 = tiffDirectory7.getFieldValue(tagInfoByte23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(bufferedImage16);
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertNull(byteArray22);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray3 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList4 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList4, tiffFieldArray3);
        java.nio.ByteOrder byteOrder8 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory9 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList4, (long) 0, (long) ' ', byteOrder8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory9.setTiffImageData(abstractTiffImageData10);
        int int12 = tiffDirectory9.length;
        boolean boolean13 = tiffDirectory9.hasTiffRasterData();
        long long14 = tiffDirectory9.getNextDirectoryOffset();
        java.awt.image.BufferedImage bufferedImage15 = tiffDirectory9.getTiffImage();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList16 = tiffDirectory9.getDirectoryEntries();
        java.nio.ByteOrder byteOrder19 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory20 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, tiffFieldList16, 0L, (long) (short) 100, byteOrder19);
        java.nio.ByteOrder byteOrder23 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory24 = new org.apache.commons.imaging.formats.tiff.TiffDirectory((int) 'a', tiffFieldList16, (long) 100, (long) (byte) -1, byteOrder23);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational tagInfoSRational25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber rationalNumber26 = tiffDirectory24.getFieldValue(tagInfoSRational25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray3);
        org.junit.Assert.assertArrayEquals(tiffFieldArray3, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertNull(bufferedImage15);
        org.junit.Assert.assertNotNull(tiffFieldList16);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = tiffDirectory7.getTiffImageData();
        java.nio.ByteOrder byteOrder11 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters12 = null;
        java.awt.image.BufferedImage bufferedImage13 = tiffDirectory7.getTiffImage(byteOrder11, tiffImagingParameters12);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo14 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField15 = tiffDirectory7.findField(tagInfo14);
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData16 = null;
        tiffDirectory7.setJpegImageData(jpegImageData16);
        java.nio.ByteOrder byteOrder18 = tiffDirectory7.getByteOrder();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii19 = null;
        java.lang.String[] strArray21 = tiffDirectory7.getFieldValue(tagInfoAscii19, false);
        long long22 = tiffDirectory7.getNextDirectoryOffset();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(abstractTiffImageData10);
        org.junit.Assert.assertNull(bufferedImage13);
        org.junit.Assert.assertNull(tiffField15);
        org.junit.Assert.assertNull(byteOrder18);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList10 = tiffDirectory7.getDirectoryEntries();
        boolean boolean11 = tiffDirectory7.hasTiffImageData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals12 = null;
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray14 = tiffDirectory7.getFieldValue(tagInfoRationals12, false);
        int int15 = tiffDirectory7.length;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii16 = null;
        java.lang.String[] strArray18 = tiffDirectory7.getFieldValue(tagInfoAscii16, false);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tiffFieldList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(rationalNumberArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNull(strArray18);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        boolean boolean10 = tiffDirectory7.hasJpegImageData();
        java.lang.String str11 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData12 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData12);
        long long14 = tiffDirectory7.offset;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals15 = null;
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray17 = tiffDirectory7.getFieldValue(tagInfoRationals15, false);
        java.util.Spliterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldSpliterator18 = tiffDirectory7.spliterator();
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffRasterData tiffRasterData20 = tiffDirectory7.getRasterData(tiffImagingParameters19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.imaging.ImagingException; message: Required field \"SampleFormat\" is missing");
        } catch (org.apache.commons.imaging.ImagingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Sub" + "'", str11, "Sub");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(rationalNumberArray17);
        org.junit.Assert.assertNotNull(tiffFieldSpliterator18);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        java.awt.image.BufferedImage bufferedImage12 = tiffDirectory7.getTiffImage();
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters13 = null;
        java.awt.image.BufferedImage bufferedImage14 = tiffDirectory7.getTiffImage(tiffImagingParameters13);
        java.util.Spliterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldSpliterator15 = tiffDirectory7.spliterator();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText16 = null;
        java.lang.String str18 = tiffDirectory7.getFieldValue(tagInfoGpsText16, false);
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldItor19 = tiffDirectory7.iterator();
        java.lang.String str20 = tiffDirectory7.getElementDescription();
        boolean boolean21 = tiffDirectory7.hasTiffRasterData();
        long long22 = tiffDirectory7.offset;
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImage12);
        org.junit.Assert.assertNull(bufferedImage14);
        org.junit.Assert.assertNotNull(tiffFieldSpliterator15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(tiffFieldItor19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        long long10 = tiffDirectory7.offset;
        boolean boolean11 = tiffDirectory7.hasTiffRasterData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo12 = null;
        java.lang.Object obj13 = tiffDirectory7.getFieldValue(tagInfo12);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational tagInfoSRational14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber rationalNumber15 = tiffDirectory7.getFieldValue(tagInfoSRational14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        java.awt.image.BufferedImage bufferedImage12 = tiffDirectory7.getTiffImage();
        java.lang.String str13 = tiffDirectory7.getElementDescription();
        java.nio.ByteOrder byteOrder14 = null;
        java.awt.image.BufferedImage bufferedImage15 = tiffDirectory7.getTiffImage(byteOrder14);
        java.nio.ByteOrder byteOrder16 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters17 = null;
        java.awt.image.BufferedImage bufferedImage18 = tiffDirectory7.getTiffImage(byteOrder16, tiffImagingParameters17);
        int int19 = tiffDirectory7.type;
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData20 = null;
        tiffDirectory7.setJpegImageData(jpegImageData20);
        boolean boolean22 = tiffDirectory7.hasJpegImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData23 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData23);
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData25 = tiffDirectory7.getJpegImageData();
        java.awt.image.BufferedImage bufferedImage26 = tiffDirectory7.getTiffImage();
        boolean boolean27 = tiffDirectory7.hasJpegImageData();
        tiffDirectory7.dump();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(bufferedImage15);
        org.junit.Assert.assertNull(bufferedImage18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jpegImageData25);
        org.junit.Assert.assertNull(bufferedImage26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        tiffDirectory7.dump();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo11 = null;
        java.lang.Object obj12 = tiffDirectory7.getFieldValue(tagInfo11);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo13 = null;
        java.lang.Object obj14 = tiffDirectory7.getFieldValue(tagInfo13);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong15 = null;
        int[] intArray17 = tiffDirectory7.getFieldValue(tagInfoShortOrLong15, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats tagInfoFloats18 = null;
        float[] floatArray20 = tiffDirectory7.getFieldValue(tagInfoFloats18, false);
        java.lang.String str21 = tiffDirectory7.getElementDescription();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(intArray17);
        org.junit.Assert.assertNull(floatArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        boolean boolean10 = tiffDirectory7.hasJpegImageData();
        java.lang.String str11 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData12 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData12);
        long long14 = tiffDirectory7.offset;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong15 = null;
        int[] intArray17 = tiffDirectory7.getFieldValue(tagInfoShortOrLong15, false);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData18 = tiffDirectory7.getTiffImageData();
        long long19 = tiffDirectory7.getNextDirectoryOffset();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Sub" + "'", str11, "Sub");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(intArray17);
        org.junit.Assert.assertNull(abstractTiffImageData18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts10 = null;
        short[] shortArray12 = tiffDirectory7.getFieldValue(tagInfoSShorts10, false);
        java.lang.String str13 = tiffDirectory7.description();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList14 = tiffDirectory7.getDirectoryEntries();
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData15 = null;
        tiffDirectory7.setJpegImageData(jpegImageData15);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText17 = null;
        java.lang.String str19 = tiffDirectory7.getFieldValue(tagInfoGpsText17, false);
        int int20 = tiffDirectory7.type;
        java.awt.image.BufferedImage bufferedImage21 = tiffDirectory7.getTiffImage();
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData22 = null;
        tiffDirectory7.setJpegImageData(jpegImageData22);
        java.lang.String str24 = tiffDirectory7.description();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(shortArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Sub" + "'", str13, "Sub");
        org.junit.Assert.assertNotNull(tiffFieldList14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(bufferedImage21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Sub" + "'", str24, "Sub");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        java.awt.image.BufferedImage bufferedImage12 = tiffDirectory7.getTiffImage();
        java.lang.String str13 = tiffDirectory7.getElementDescription();
        java.nio.ByteOrder byteOrder14 = null;
        java.awt.image.BufferedImage bufferedImage15 = tiffDirectory7.getTiffImage(byteOrder14);
        java.nio.ByteOrder byteOrder16 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters17 = null;
        java.awt.image.BufferedImage bufferedImage18 = tiffDirectory7.getTiffImage(byteOrder16, tiffImagingParameters17);
        int int19 = tiffDirectory7.type;
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData20 = null;
        tiffDirectory7.setJpegImageData(jpegImageData20);
        long long22 = tiffDirectory7.offset;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray25 = tiffDirectory7.getFieldValue(tagInfoAscii23, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(bufferedImage15);
        org.junit.Assert.assertNull(bufferedImage18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = tiffDirectory7.getTiffImageData();
        java.nio.ByteOrder byteOrder11 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters12 = null;
        java.awt.image.BufferedImage bufferedImage13 = tiffDirectory7.getTiffImage(byteOrder11, tiffImagingParameters12);
        java.nio.ByteOrder byteOrder14 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters15 = null;
        java.awt.image.BufferedImage bufferedImage16 = tiffDirectory7.getTiffImage(byteOrder14, tiffImagingParameters15);
        boolean boolean17 = tiffDirectory7.hasTiffRasterData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = tiffDirectory7.findField(tagInfo18);
        java.lang.String str20 = tiffDirectory7.getElementDescription();
        boolean boolean21 = tiffDirectory7.hasJpegImageData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString22 = null;
        java.lang.String str24 = tiffDirectory7.getFieldValue(tagInfoXpString22, false);
        boolean boolean25 = tiffDirectory7.hasJpegImageData();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList26 = tiffDirectory7.getDirectoryEntries();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(abstractTiffImageData10);
        org.junit.Assert.assertNull(bufferedImage13);
        org.junit.Assert.assertNull(bufferedImage16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(tiffField19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(tiffFieldList26);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        tiffDirectory7.dump();
        java.lang.String str9 = tiffDirectory7.description();
        tiffDirectory7.dump();
        boolean boolean11 = tiffDirectory7.hasTiffRasterData();
        boolean boolean12 = tiffDirectory7.hasTiffImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData13 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData13);
        boolean boolean15 = tiffDirectory7.hasTiffImageData();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Sub" + "'", str9, "Sub");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        boolean boolean10 = tiffDirectory7.hasJpegImageData();
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldItor11 = tiffDirectory7.iterator();
        int int12 = tiffDirectory7.length;
        long long13 = tiffDirectory7.getNextDirectoryOffset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffDirectory.ImageDataElement imageDataElement14 = tiffDirectory7.getJpegRawImageDataElement();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.imaging.ImagingException; message: Couldn't find image data.");
        } catch (org.apache.commons.imaging.ImagingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tiffFieldItor11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        int int10 = tiffDirectory7.length;
        java.util.Spliterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldSpliterator11 = tiffDirectory7.spliterator();
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData12 = null;
        tiffDirectory7.setJpegImageData(jpegImageData12);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertNotNull(tiffFieldSpliterator11);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = tiffDirectory7.getTiffImageData();
        java.nio.ByteOrder byteOrder11 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters12 = null;
        java.awt.image.BufferedImage bufferedImage13 = tiffDirectory7.getTiffImage(byteOrder11, tiffImagingParameters12);
        java.nio.ByteOrder byteOrder14 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters15 = null;
        java.awt.image.BufferedImage bufferedImage16 = tiffDirectory7.getTiffImage(byteOrder14, tiffImagingParameters15);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong17 = null;
        int[] intArray19 = tiffDirectory7.getFieldValue(tagInfoShortOrLong17, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo20 = null;
        java.lang.Object obj21 = tiffDirectory7.getFieldValue(tagInfo20);
        long long22 = tiffDirectory7.offset;
        long long23 = tiffDirectory7.getNextDirectoryOffset();
        long long24 = tiffDirectory7.getNextDirectoryOffset();
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData25 = tiffDirectory7.getJpegImageData();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(abstractTiffImageData10);
        org.junit.Assert.assertNull(bufferedImage13);
        org.junit.Assert.assertNull(bufferedImage16);
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
        org.junit.Assert.assertNull(jpegImageData25);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        boolean boolean10 = tiffDirectory7.hasJpegImageData();
        java.lang.String str11 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData12 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData12);
        long long14 = tiffDirectory7.offset;
        java.nio.ByteOrder byteOrder15 = tiffDirectory7.getByteOrder();
        long long16 = tiffDirectory7.getNextDirectoryOffset();
        java.lang.String str17 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts18 = null;
        short[] shortArray20 = tiffDirectory7.getFieldValue(tagInfoSShorts18, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals21 = null;
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray23 = tiffDirectory7.getFieldValue(tagInfoRationals21, false);
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData24 = null;
        tiffDirectory7.setJpegImageData(jpegImageData24);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Sub" + "'", str11, "Sub");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(byteOrder15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Sub" + "'", str17, "Sub");
        org.junit.Assert.assertNull(shortArray20);
        org.junit.Assert.assertNull(rationalNumberArray23);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        boolean boolean10 = tiffDirectory7.hasJpegImageData();
        java.lang.String str11 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData12 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData12);
        long long14 = tiffDirectory7.offset;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals15 = null;
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray17 = tiffDirectory7.getFieldValue(tagInfoRationals15, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs18 = null;
        int[] intArray20 = tiffDirectory7.getFieldValue(tagInfoLongs18, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = tiffDirectory7.getFieldValue(tagInfoLong21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Sub" + "'", str11, "Sub");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(rationalNumberArray17);
        org.junit.Assert.assertNull(intArray20);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = tiffDirectory7.getTiffImageData();
        java.nio.ByteOrder byteOrder11 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters12 = null;
        java.awt.image.BufferedImage bufferedImage13 = tiffDirectory7.getTiffImage(byteOrder11, tiffImagingParameters12);
        java.nio.ByteOrder byteOrder14 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters15 = null;
        java.awt.image.BufferedImage bufferedImage16 = tiffDirectory7.getTiffImage(byteOrder14, tiffImagingParameters15);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong17 = null;
        int[] intArray19 = tiffDirectory7.getFieldValue(tagInfoShortOrLong17, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo20 = null;
        java.lang.Object obj21 = tiffDirectory7.getFieldValue(tagInfo20);
        long long22 = tiffDirectory7.offset;
        long long23 = tiffDirectory7.getNextDirectoryOffset();
        long long24 = tiffDirectory7.getNextDirectoryOffset();
        int int25 = tiffDirectory7.length;
        boolean boolean26 = tiffDirectory7.hasTiffFloatingPointRasterData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts27 = null;
        short[] shortArray29 = tiffDirectory7.getFieldValue(tagInfoSShorts27, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShort tagInfoSShort30 = null;
        // The following exception was thrown during execution in test generation
        try {
            short short31 = tiffDirectory7.getFieldValue(tagInfoSShort30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(abstractTiffImageData10);
        org.junit.Assert.assertNull(bufferedImage13);
        org.junit.Assert.assertNull(bufferedImage16);
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(shortArray29);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        java.awt.image.BufferedImage bufferedImage12 = tiffDirectory7.getTiffImage();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii13 = null;
        java.lang.String[] strArray15 = tiffDirectory7.getFieldValue(tagInfoAscii13, false);
        int int16 = tiffDirectory7.type;
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters18 = null;
        java.awt.image.BufferedImage bufferedImage19 = tiffDirectory7.getTiffImage(byteOrder17, tiffImagingParameters18);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = tiffDirectory7.getFieldValue(tagInfoGpsText20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImage12);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(bufferedImage19);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        java.awt.image.BufferedImage bufferedImage12 = tiffDirectory7.getTiffImage();
        java.lang.String str13 = tiffDirectory7.getElementDescription();
        java.nio.ByteOrder byteOrder14 = null;
        java.awt.image.BufferedImage bufferedImage15 = tiffDirectory7.getTiffImage(byteOrder14);
        java.nio.ByteOrder byteOrder16 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters17 = null;
        java.awt.image.BufferedImage bufferedImage18 = tiffDirectory7.getTiffImage(byteOrder16, tiffImagingParameters17);
        boolean boolean19 = tiffDirectory7.hasTiffRasterData();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(bufferedImage15);
        org.junit.Assert.assertNull(bufferedImage18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        tiffDirectory7.dump();
        java.lang.String str9 = tiffDirectory7.description();
        long long10 = tiffDirectory7.offset;
        boolean boolean11 = tiffDirectory7.hasTiffImageData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = tiffDirectory7.findField(tagInfo12, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray17 = tiffDirectory7.getFieldValue(tagInfoAscii15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Sub" + "'", str9, "Sub");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(tiffField14);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        java.awt.image.BufferedImage bufferedImage12 = tiffDirectory7.getTiffImage();
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters13 = null;
        java.awt.image.BufferedImage bufferedImage14 = tiffDirectory7.getTiffImage(tiffImagingParameters13);
        java.util.Spliterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldSpliterator15 = tiffDirectory7.spliterator();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText16 = null;
        java.lang.String str18 = tiffDirectory7.getFieldValue(tagInfoGpsText16, false);
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldItor19 = tiffDirectory7.iterator();
        java.nio.ByteOrder byteOrder20 = tiffDirectory7.getByteOrder();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData21 = tiffDirectory7.getTiffImageData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts22 = null;
        short[] shortArray24 = tiffDirectory7.getFieldValue(tagInfoSShorts22, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs25 = null;
        int[] intArray27 = tiffDirectory7.getFieldValue(tagInfoLongs25, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs28 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = tiffDirectory7.getFieldValue(tagInfoLongs28, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImage12);
        org.junit.Assert.assertNull(bufferedImage14);
        org.junit.Assert.assertNotNull(tiffFieldSpliterator15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(tiffFieldItor19);
        org.junit.Assert.assertNull(byteOrder20);
        org.junit.Assert.assertNull(abstractTiffImageData21);
        org.junit.Assert.assertNull(shortArray24);
        org.junit.Assert.assertNull(intArray27);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts8 = null;
        short[] shortArray10 = tiffDirectory7.getFieldValue(tagInfoSShorts8, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals11 = null;
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray13 = tiffDirectory7.getFieldValue(tagInfoRationals11, false);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(shortArray10);
        org.junit.Assert.assertNull(rationalNumberArray13);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        boolean boolean10 = tiffDirectory7.hasJpegImageData();
        java.lang.String str11 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData12 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData12);
        long long14 = tiffDirectory7.offset;
        java.nio.ByteOrder byteOrder15 = tiffDirectory7.getByteOrder();
        long long16 = tiffDirectory7.getNextDirectoryOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs17 = null;
        int[] intArray19 = tiffDirectory7.getFieldValue(tagInfoLongs17, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals20 = null;
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray22 = tiffDirectory7.getFieldValue(tagInfoRationals20, false);
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldItor23 = tiffDirectory7.iterator();
        int int24 = tiffDirectory7.size();
        boolean boolean25 = tiffDirectory7.hasTiffImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData26 = tiffDirectory7.getTiffImageData();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Sub" + "'", str11, "Sub");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(byteOrder15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertNull(rationalNumberArray22);
        org.junit.Assert.assertNotNull(tiffFieldItor23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(abstractTiffImageData26);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray3 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList4 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList4, tiffFieldArray3);
        java.nio.ByteOrder byteOrder8 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory9 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList4, (long) 0, (long) ' ', byteOrder8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory9.setTiffImageData(abstractTiffImageData10);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts12 = null;
        short[] shortArray14 = tiffDirectory9.getFieldValue(tagInfoSShorts12, false);
        java.lang.String str15 = tiffDirectory9.description();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList16 = tiffDirectory9.getDirectoryEntries();
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData17 = null;
        tiffDirectory9.setJpegImageData(jpegImageData17);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText19 = null;
        java.lang.String str21 = tiffDirectory9.getFieldValue(tagInfoGpsText19, false);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList22 = tiffDirectory9.getDirectoryEntries();
        java.nio.ByteOrder byteOrder25 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory26 = new org.apache.commons.imaging.formats.tiff.TiffDirectory((int) '4', tiffFieldList22, (long) '4', (long) (short) 100, byteOrder25);
        java.nio.ByteOrder byteOrder29 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory30 = new org.apache.commons.imaging.formats.tiff.TiffDirectory((int) '#', tiffFieldList22, 0L, (long) 'a', byteOrder29);
        boolean boolean31 = tiffDirectory30.hasTiffImageData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals32 = null;
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray34 = tiffDirectory30.getFieldValue(tagInfoRationals32, false);
        java.nio.ByteOrder byteOrder35 = null;
        java.awt.image.BufferedImage bufferedImage36 = tiffDirectory30.getTiffImage(byteOrder35);
        boolean boolean37 = tiffDirectory30.hasTiffImageData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte38 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte byte39 = tiffDirectory30.getFieldValue(tagInfoByte38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray3);
        org.junit.Assert.assertArrayEquals(tiffFieldArray3, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(shortArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Sub" + "'", str15, "Sub");
        org.junit.Assert.assertNotNull(tiffFieldList16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(tiffFieldList22);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(rationalNumberArray34);
        org.junit.Assert.assertNull(bufferedImage36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        boolean boolean10 = tiffDirectory7.hasJpegImageData();
        java.lang.String str11 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData12 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData12);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals14 = null;
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray16 = tiffDirectory7.getFieldValue(tagInfoRationals14, false);
        boolean boolean17 = tiffDirectory7.hasTiffImageData();
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldItor18 = tiffDirectory7.iterator();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble tagInfoDouble19 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double20 = tiffDirectory7.getFieldValue(tagInfoDouble19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Sub" + "'", str11, "Sub");
        org.junit.Assert.assertNull(rationalNumberArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tiffFieldItor18);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        java.awt.image.BufferedImage bufferedImage12 = tiffDirectory7.getTiffImage();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii13 = null;
        java.lang.String[] strArray15 = tiffDirectory7.getFieldValue(tagInfoAscii13, false);
        int int16 = tiffDirectory7.type;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = tiffDirectory7.findField(tagInfo17, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals20 = null;
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray22 = tiffDirectory7.getFieldValue(tagInfoRationals20, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs23 = null;
        int[] intArray25 = tiffDirectory7.getFieldValue(tagInfoLongs23, false);
        int int26 = tiffDirectory7.size();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles27 = null;
        double[] doubleArray29 = tiffDirectory7.getFieldValue(tagInfoDoubles27, false);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImage12);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(tiffField19);
        org.junit.Assert.assertNull(rationalNumberArray22);
        org.junit.Assert.assertNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(doubleArray29);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        boolean boolean10 = tiffDirectory7.hasJpegImageData();
        java.lang.String str11 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData12 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData12);
        int int14 = tiffDirectory7.type;
        int int15 = tiffDirectory7.type;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo16 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField17 = tiffDirectory7.findField(tagInfo16);
        java.awt.image.BufferedImage bufferedImage18 = tiffDirectory7.getTiffImage();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Sub" + "'", str11, "Sub");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(tiffField17);
        org.junit.Assert.assertNull(bufferedImage18);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        boolean boolean10 = tiffDirectory7.hasJpegImageData();
        java.lang.String str11 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData12 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData12);
        long long14 = tiffDirectory7.offset;
        java.nio.ByteOrder byteOrder15 = tiffDirectory7.getByteOrder();
        long long16 = tiffDirectory7.getNextDirectoryOffset();
        java.lang.String str17 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData18 = null;
        tiffDirectory7.setJpegImageData(jpegImageData18);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters21 = null;
        java.awt.image.BufferedImage bufferedImage22 = tiffDirectory7.getTiffImage(byteOrder20, tiffImagingParameters21);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Sub" + "'", str11, "Sub");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(byteOrder15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Sub" + "'", str17, "Sub");
        org.junit.Assert.assertNull(bufferedImage22);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        java.awt.image.BufferedImage bufferedImage12 = tiffDirectory7.getTiffImage();
        java.lang.String str13 = tiffDirectory7.getElementDescription();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo14 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField16 = tiffDirectory7.findField(tagInfo14, false);
        boolean boolean17 = tiffDirectory7.hasTiffImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData18 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData18);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText20 = null;
        java.lang.String str22 = tiffDirectory7.getFieldValue(tagInfoGpsText20, false);
        tiffDirectory7.dump();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(tiffField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = tiffDirectory7.getTiffImageData();
        java.nio.ByteOrder byteOrder11 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters12 = null;
        java.awt.image.BufferedImage bufferedImage13 = tiffDirectory7.getTiffImage(byteOrder11, tiffImagingParameters12);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble tagInfoDouble14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = tiffDirectory7.getFieldValue(tagInfoDouble14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(abstractTiffImageData10);
        org.junit.Assert.assertNull(bufferedImage13);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts10 = null;
        short[] shortArray12 = tiffDirectory7.getFieldValue(tagInfoSShorts10, false);
        java.lang.String str13 = tiffDirectory7.description();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList14 = tiffDirectory7.getDirectoryEntries();
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData15 = null;
        tiffDirectory7.setJpegImageData(jpegImageData15);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText17 = null;
        java.lang.String str19 = tiffDirectory7.getFieldValue(tagInfoGpsText17, false);
        int int20 = tiffDirectory7.type;
        java.nio.ByteOrder byteOrder21 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters22 = null;
        java.awt.image.BufferedImage bufferedImage23 = tiffDirectory7.getTiffImage(byteOrder21, tiffImagingParameters22);
        java.util.Spliterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldSpliterator24 = tiffDirectory7.spliterator();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes tagInfoSBytes25 = null;
        byte[] byteArray27 = tiffDirectory7.getFieldValue(tagInfoSBytes25, false);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData28 = tiffDirectory7.getTiffImageData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii29 = null;
        java.lang.String[] strArray31 = tiffDirectory7.getFieldValue(tagInfoAscii29, false);
        int int32 = tiffDirectory7.size();
        boolean boolean33 = tiffDirectory7.hasTiffRasterData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles34 = null;
        double[] doubleArray36 = tiffDirectory7.getFieldValue(tagInfoDoubles34, false);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(shortArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Sub" + "'", str13, "Sub");
        org.junit.Assert.assertNotNull(tiffFieldList14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(bufferedImage23);
        org.junit.Assert.assertNotNull(tiffFieldSpliterator24);
        org.junit.Assert.assertNull(byteArray27);
        org.junit.Assert.assertNull(abstractTiffImageData28);
        org.junit.Assert.assertNull(strArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(doubleArray36);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList10 = tiffDirectory7.getDirectoryEntries();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii11 = null;
        java.lang.String[] strArray13 = tiffDirectory7.getFieldValue(tagInfoAscii11, false);
        java.lang.String str14 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals15 = null;
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray17 = tiffDirectory7.getFieldValue(tagInfoRationals15, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = null;
        java.lang.Object obj19 = tiffDirectory7.getFieldValue(tagInfo18);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort20 = null;
        // The following exception was thrown during execution in test generation
        try {
            short short21 = tiffDirectory7.getFieldValue(tagInfoShort20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tiffFieldList10);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Sub" + "'", str14, "Sub");
        org.junit.Assert.assertNull(rationalNumberArray17);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        boolean boolean10 = tiffDirectory7.hasJpegImageData();
        java.lang.String str11 = tiffDirectory7.description();
        int int12 = tiffDirectory7.type;
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Sub" + "'", str11, "Sub");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong12 = null;
        int[] intArray14 = tiffDirectory7.getFieldValue(tagInfoShortOrLong12, false);
        int int15 = tiffDirectory7.type;
        java.nio.ByteOrder byteOrder16 = tiffDirectory7.getByteOrder();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData17 = tiffDirectory7.getTiffImageData();
        long long18 = tiffDirectory7.getNextDirectoryOffset();
        boolean boolean19 = tiffDirectory7.hasTiffImageData();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(byteOrder16);
        org.junit.Assert.assertNull(abstractTiffImageData17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts10 = null;
        short[] shortArray12 = tiffDirectory7.getFieldValue(tagInfoSShorts10, false);
        java.lang.String str13 = tiffDirectory7.description();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList14 = tiffDirectory7.getDirectoryEntries();
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData15 = null;
        tiffDirectory7.setJpegImageData(jpegImageData15);
        int int17 = tiffDirectory7.type;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii18 = null;
        java.lang.String[] strArray20 = tiffDirectory7.getFieldValue(tagInfoAscii18, false);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData21 = tiffDirectory7.getTiffImageData();
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldItor22 = tiffDirectory7.iterator();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData23 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData23);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs tagInfoSLongs25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = tiffDirectory7.getFieldValue(tagInfoSLongs25, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(shortArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Sub" + "'", str13, "Sub");
        org.junit.Assert.assertNotNull(tiffFieldList14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNull(abstractTiffImageData21);
        org.junit.Assert.assertNotNull(tiffFieldItor22);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList10 = tiffDirectory7.getDirectoryEntries();
        boolean boolean11 = tiffDirectory7.hasTiffImageData();
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData12 = null;
        tiffDirectory7.setJpegImageData(jpegImageData12);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData14 = tiffDirectory7.getTiffImageData();
        java.lang.String str15 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo16 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField18 = tiffDirectory7.findField(tagInfo16, false);
        java.nio.ByteOrder byteOrder19 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters20 = null;
        java.awt.image.BufferedImage bufferedImage21 = tiffDirectory7.getTiffImage(byteOrder19, tiffImagingParameters20);
        boolean boolean22 = tiffDirectory7.hasJpegImageData();
        boolean boolean23 = tiffDirectory7.hasTiffImageData();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tiffFieldList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(abstractTiffImageData14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Sub" + "'", str15, "Sub");
        org.junit.Assert.assertNull(tiffField18);
        org.junit.Assert.assertNull(bufferedImage21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        boolean boolean10 = tiffDirectory7.hasJpegImageData();
        java.lang.String str11 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData12 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData12);
        long long14 = tiffDirectory7.offset;
        java.nio.ByteOrder byteOrder15 = tiffDirectory7.getByteOrder();
        java.util.Spliterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldSpliterator16 = tiffDirectory7.spliterator();
        int int17 = tiffDirectory7.type;
        java.lang.Class<?> wildcardClass18 = tiffDirectory7.getClass();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Sub" + "'", str11, "Sub");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(byteOrder15);
        org.junit.Assert.assertNotNull(tiffFieldSpliterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        boolean boolean10 = tiffDirectory7.hasJpegImageData();
        java.lang.String str11 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData12 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData12);
        long long14 = tiffDirectory7.offset;
        java.nio.ByteOrder byteOrder15 = tiffDirectory7.getByteOrder();
        long long16 = tiffDirectory7.getNextDirectoryOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs17 = null;
        int[] intArray19 = tiffDirectory7.getFieldValue(tagInfoLongs17, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs20 = null;
        int[] intArray22 = tiffDirectory7.getFieldValue(tagInfoLongs20, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo23 = null;
        java.lang.Object obj24 = tiffDirectory7.getFieldValue(tagInfo23);
        int int25 = tiffDirectory7.length;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs26 = null;
        int[] intArray28 = tiffDirectory7.getFieldValue(tagInfoLongs26, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = tiffDirectory7.getFieldValue(tagInfoXpString29, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Sub" + "'", str11, "Sub");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(byteOrder15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertNull(intArray22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
        org.junit.Assert.assertNull(intArray28);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        boolean boolean10 = tiffDirectory7.hasJpegImageData();
        java.lang.String str11 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData12 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData12);
        long long14 = tiffDirectory7.offset;
        java.nio.ByteOrder byteOrder15 = tiffDirectory7.getByteOrder();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong16 = null;
        int[] intArray18 = tiffDirectory7.getFieldValue(tagInfoShortOrLong16, false);
        boolean boolean19 = tiffDirectory7.hasJpegImageData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes tagInfoSBytes20 = null;
        byte[] byteArray22 = tiffDirectory7.getFieldValue(tagInfoSBytes20, false);
        java.nio.ByteOrder byteOrder23 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters24 = null;
        java.awt.image.BufferedImage bufferedImage25 = tiffDirectory7.getTiffImage(byteOrder23, tiffImagingParameters24);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData26 = tiffDirectory7.getTiffImageData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals27 = null;
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray29 = tiffDirectory7.getFieldValue(tagInfoSRationals27, false);
        java.lang.String str30 = tiffDirectory7.getElementDescription();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Sub" + "'", str11, "Sub");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(byteOrder15);
        org.junit.Assert.assertNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(byteArray22);
        org.junit.Assert.assertNull(bufferedImage25);
        org.junit.Assert.assertNull(abstractTiffImageData26);
        org.junit.Assert.assertNull(rationalNumberArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        java.awt.image.BufferedImage bufferedImage12 = tiffDirectory7.getTiffImage();
        java.lang.String str13 = tiffDirectory7.getElementDescription();
        java.nio.ByteOrder byteOrder14 = null;
        java.awt.image.BufferedImage bufferedImage15 = tiffDirectory7.getTiffImage(byteOrder14);
        java.nio.ByteOrder byteOrder16 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters17 = null;
        java.awt.image.BufferedImage bufferedImage18 = tiffDirectory7.getTiffImage(byteOrder16, tiffImagingParameters17);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString19 = null;
        java.lang.String str21 = tiffDirectory7.getFieldValue(tagInfoXpString19, false);
        java.lang.String str22 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational tagInfoSRational23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber rationalNumber24 = tiffDirectory7.getFieldValue(tagInfoSRational23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(bufferedImage15);
        org.junit.Assert.assertNull(bufferedImage18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Sub" + "'", str22, "Sub");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        tiffDirectory7.dump();
        boolean boolean11 = tiffDirectory7.hasTiffRasterData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData12 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData12);
        long long14 = tiffDirectory7.getNextDirectoryOffset();
        int int15 = tiffDirectory7.type;
        long long16 = tiffDirectory7.getNextDirectoryOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString17 = null;
        java.lang.String str19 = tiffDirectory7.getFieldValue(tagInfoXpString17, false);
        long long20 = tiffDirectory7.getNextDirectoryOffset();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        boolean boolean10 = tiffDirectory7.hasJpegImageData();
        java.lang.String str11 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData12 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData12);
        long long14 = tiffDirectory7.offset;
        java.nio.ByteOrder byteOrder15 = tiffDirectory7.getByteOrder();
        long long16 = tiffDirectory7.getNextDirectoryOffset();
        java.lang.String str17 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText18 = null;
        java.lang.String str20 = tiffDirectory7.getFieldValue(tagInfoGpsText18, false);
        long long21 = tiffDirectory7.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData22 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData22);
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData24 = tiffDirectory7.getJpegImageData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble tagInfoDouble25 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double26 = tiffDirectory7.getFieldValue(tagInfoDouble25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Sub" + "'", str11, "Sub");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(byteOrder15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Sub" + "'", str17, "Sub");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNull(jpegImageData24);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = tiffDirectory7.getTiffImageData();
        java.nio.ByteOrder byteOrder11 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters12 = null;
        java.awt.image.BufferedImage bufferedImage13 = tiffDirectory7.getTiffImage(byteOrder11, tiffImagingParameters12);
        java.nio.ByteOrder byteOrder14 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters15 = null;
        java.awt.image.BufferedImage bufferedImage16 = tiffDirectory7.getTiffImage(byteOrder14, tiffImagingParameters15);
        boolean boolean17 = tiffDirectory7.hasTiffRasterData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = tiffDirectory7.findField(tagInfo18);
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldItor20 = tiffDirectory7.iterator();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte21 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte byte22 = tiffDirectory7.getFieldValue(tagInfoByte21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(abstractTiffImageData10);
        org.junit.Assert.assertNull(bufferedImage13);
        org.junit.Assert.assertNull(bufferedImage16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(tiffField19);
        org.junit.Assert.assertNotNull(tiffFieldItor20);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        boolean boolean10 = tiffDirectory7.hasJpegImageData();
        java.lang.String str11 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData12 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData12);
        int int14 = tiffDirectory7.type;
        int int15 = tiffDirectory7.type;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo16 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField17 = tiffDirectory7.findField(tagInfo16);
        long long18 = tiffDirectory7.offset;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo19 = null;
        java.lang.Object obj20 = tiffDirectory7.getFieldValue(tagInfo19);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Sub" + "'", str11, "Sub");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(tiffField17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        java.awt.image.BufferedImage bufferedImage12 = tiffDirectory7.getTiffImage();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii13 = null;
        java.lang.String[] strArray15 = tiffDirectory7.getFieldValue(tagInfoAscii13, false);
        java.util.Spliterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldSpliterator16 = tiffDirectory7.spliterator();
        boolean boolean17 = tiffDirectory7.hasTiffFloatingPointRasterData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData18 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData18);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImage12);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(tiffFieldSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray2 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList3 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList3, tiffFieldArray2);
        java.nio.ByteOrder byteOrder7 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory8 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList3, (long) 0, (long) ' ', byteOrder7);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts9 = null;
        short[] shortArray11 = tiffDirectory8.getFieldValue(tagInfoSShorts9, false);
        int int12 = tiffDirectory8.size();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList13 = tiffDirectory8.getDirectoryEntries();
        java.nio.ByteOrder byteOrder16 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory17 = new org.apache.commons.imaging.formats.tiff.TiffDirectory((int) (byte) 0, tiffFieldList13, (long) (-1), (long) ' ', byteOrder16);
        org.junit.Assert.assertNotNull(tiffFieldArray2);
        org.junit.Assert.assertArrayEquals(tiffFieldArray2, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(shortArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(tiffFieldList13);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = tiffDirectory7.getTiffImageData();
        java.nio.ByteOrder byteOrder11 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters12 = null;
        java.awt.image.BufferedImage bufferedImage13 = tiffDirectory7.getTiffImage(byteOrder11, tiffImagingParameters12);
        java.nio.ByteOrder byteOrder14 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters15 = null;
        java.awt.image.BufferedImage bufferedImage16 = tiffDirectory7.getTiffImage(byteOrder14, tiffImagingParameters15);
        boolean boolean17 = tiffDirectory7.hasTiffRasterData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = tiffDirectory7.findField(tagInfo18);
        java.lang.String str20 = tiffDirectory7.getElementDescription();
        int int21 = tiffDirectory7.size();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.imaging.formats.tiff.TiffDirectory.ImageDataElement> imageDataElementList22 = tiffDirectory7.getTiffRawImageDataElements();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.imaging.ImagingException; message: Couldn't find image data.");
        } catch (org.apache.commons.imaging.ImagingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(abstractTiffImageData10);
        org.junit.Assert.assertNull(bufferedImage13);
        org.junit.Assert.assertNull(bufferedImage16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(tiffField19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        boolean boolean10 = tiffDirectory7.hasJpegImageData();
        java.lang.String str11 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData12 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData12);
        long long14 = tiffDirectory7.offset;
        java.nio.ByteOrder byteOrder15 = tiffDirectory7.getByteOrder();
        long long16 = tiffDirectory7.getNextDirectoryOffset();
        java.lang.String str17 = tiffDirectory7.description();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList18 = tiffDirectory7.getDirectoryEntries();
        long long19 = tiffDirectory7.getNextDirectoryOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort20 = null;
        // The following exception was thrown during execution in test generation
        try {
            short short21 = tiffDirectory7.getFieldValue(tagInfoShort20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Sub" + "'", str11, "Sub");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(byteOrder15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Sub" + "'", str17, "Sub");
        org.junit.Assert.assertNotNull(tiffFieldList18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        tiffDirectory7.dump();
        java.lang.String str9 = tiffDirectory7.description();
        long long10 = tiffDirectory7.offset;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo11 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField13 = tiffDirectory7.findField(tagInfo11, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo14 = null;
        java.lang.Object obj15 = tiffDirectory7.getFieldValue(tagInfo14);
        boolean boolean16 = tiffDirectory7.hasTiffFloatingPointRasterData();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Sub" + "'", str9, "Sub");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(tiffField13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        java.awt.image.BufferedImage bufferedImage12 = tiffDirectory7.getTiffImage();
        java.lang.String str13 = tiffDirectory7.getElementDescription();
        java.nio.ByteOrder byteOrder14 = null;
        java.awt.image.BufferedImage bufferedImage15 = tiffDirectory7.getTiffImage(byteOrder14);
        java.util.Spliterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldSpliterator16 = tiffDirectory7.spliterator();
        tiffDirectory7.dump();
        java.lang.String str18 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo19 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField20 = tiffDirectory7.findField(tagInfo19);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong21 = null;
        int[] intArray23 = tiffDirectory7.getFieldValue(tagInfoShortOrLong21, false);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(bufferedImage15);
        org.junit.Assert.assertNotNull(tiffFieldSpliterator16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Sub" + "'", str18, "Sub");
        org.junit.Assert.assertNull(tiffField20);
        org.junit.Assert.assertNull(intArray23);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts8 = null;
        short[] shortArray10 = tiffDirectory7.getFieldValue(tagInfoSShorts8, false);
        int int11 = tiffDirectory7.size();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList12 = tiffDirectory7.getDirectoryEntries();
        int int13 = tiffDirectory7.size();
        java.lang.String str14 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes tagInfoSBytes15 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = tiffDirectory7.getFieldValue(tagInfoSBytes15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(shortArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(tiffFieldList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Sub" + "'", str14, "Sub");
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.apache.commons.imaging.formats.tiff.TiffDirectory.ImageDataElement imageDataElement2 = new org.apache.commons.imaging.formats.tiff.TiffDirectory.ImageDataElement((long) (short) 100, (int) (byte) 0);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        java.awt.image.BufferedImage bufferedImage12 = tiffDirectory7.getTiffImage();
        java.lang.String str13 = tiffDirectory7.getElementDescription();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo14 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField16 = tiffDirectory7.findField(tagInfo14, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts17 = null;
        short[] shortArray19 = tiffDirectory7.getFieldValue(tagInfoSShorts17, false);
        boolean boolean20 = tiffDirectory7.hasTiffImageData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo21 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField23 = tiffDirectory7.findField(tagInfo21, false);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(tiffField16);
        org.junit.Assert.assertNull(shortArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(tiffField23);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        java.awt.image.BufferedImage bufferedImage12 = tiffDirectory7.getTiffImage();
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters13 = null;
        java.awt.image.BufferedImage bufferedImage14 = tiffDirectory7.getTiffImage(tiffImagingParameters13);
        java.util.Spliterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldSpliterator15 = tiffDirectory7.spliterator();
        boolean boolean16 = tiffDirectory7.hasJpegImageData();
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData17 = null;
        tiffDirectory7.setJpegImageData(jpegImageData17);
        boolean boolean19 = tiffDirectory7.hasJpegImageData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray22 = tiffDirectory7.getFieldValue(tagInfoAscii20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImage12);
        org.junit.Assert.assertNull(bufferedImage14);
        org.junit.Assert.assertNotNull(tiffFieldSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        boolean boolean10 = tiffDirectory7.hasJpegImageData();
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData11 = tiffDirectory7.getJpegImageData();
        long long12 = tiffDirectory7.getNextDirectoryOffset();
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData13 = tiffDirectory7.getJpegImageData();
        java.awt.image.BufferedImage bufferedImage14 = tiffDirectory7.getTiffImage();
        java.awt.image.BufferedImage bufferedImage15 = tiffDirectory7.getTiffImage();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles16 = null;
        double[] doubleArray18 = tiffDirectory7.getFieldValue(tagInfoDoubles16, false);
        long long19 = tiffDirectory7.offset;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs tagInfoSLongs20 = null;
        int[] intArray22 = tiffDirectory7.getFieldValue(tagInfoSLongs20, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLong tagInfoSLong23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = tiffDirectory7.getFieldValue(tagInfoSLong23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jpegImageData11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(jpegImageData13);
        org.junit.Assert.assertNull(bufferedImage14);
        org.junit.Assert.assertNull(bufferedImage15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNull(intArray22);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData10 = tiffDirectory7.getJpegImageData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles11 = null;
        double[] doubleArray13 = tiffDirectory7.getFieldValue(tagInfoDoubles11, false);
        java.lang.String str14 = tiffDirectory7.getElementDescription();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jpegImageData10);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts8 = null;
        short[] shortArray10 = tiffDirectory7.getFieldValue(tagInfoSShorts8, false);
        int int11 = tiffDirectory7.size();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList12 = tiffDirectory7.getDirectoryEntries();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText13 = null;
        java.lang.String str15 = tiffDirectory7.getFieldValue(tagInfoGpsText13, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals16 = null;
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray18 = tiffDirectory7.getFieldValue(tagInfoSRationals16, false);
        long long19 = tiffDirectory7.offset;
        int int20 = tiffDirectory7.size();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii21 = null;
        java.lang.String[] strArray23 = tiffDirectory7.getFieldValue(tagInfoAscii21, false);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(shortArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(tiffFieldList12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(rationalNumberArray18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(strArray23);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        tiffDirectory7.dump();
        java.lang.String str9 = tiffDirectory7.description();
        long long10 = tiffDirectory7.offset;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo11 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField13 = tiffDirectory7.findField(tagInfo11, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo14 = null;
        java.lang.Object obj15 = tiffDirectory7.getFieldValue(tagInfo14);
        java.lang.String str16 = tiffDirectory7.getElementDescription();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Sub" + "'", str9, "Sub");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(tiffField13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters10 = null;
        java.awt.image.BufferedImage bufferedImage11 = tiffDirectory7.getTiffImage(tiffImagingParameters10);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte tagInfoSByte12 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte byte13 = tiffDirectory7.getFieldValue(tagInfoSByte12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImage11);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts10 = null;
        short[] shortArray12 = tiffDirectory7.getFieldValue(tagInfoSShorts10, false);
        java.lang.String str13 = tiffDirectory7.description();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList14 = tiffDirectory7.getDirectoryEntries();
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData15 = null;
        tiffDirectory7.setJpegImageData(jpegImageData15);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText17 = null;
        java.lang.String str19 = tiffDirectory7.getFieldValue(tagInfoGpsText17, false);
        int int20 = tiffDirectory7.type;
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldItor21 = tiffDirectory7.iterator();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo22 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField24 = tiffDirectory7.findField(tagInfo22, false);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(shortArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Sub" + "'", str13, "Sub");
        org.junit.Assert.assertNotNull(tiffFieldList14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(tiffFieldItor21);
        org.junit.Assert.assertNull(tiffField24);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        tiffDirectory7.dump();
        boolean boolean11 = tiffDirectory7.hasTiffRasterData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData12 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData12);
        long long14 = tiffDirectory7.getNextDirectoryOffset();
        int int15 = tiffDirectory7.size();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList10 = tiffDirectory7.getDirectoryEntries();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii11 = null;
        java.lang.String[] strArray13 = tiffDirectory7.getFieldValue(tagInfoAscii11, false);
        java.lang.String str14 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString15 = null;
        java.lang.String str17 = tiffDirectory7.getFieldValue(tagInfoXpString15, false);
        int int18 = tiffDirectory7.size();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs19 = null;
        int[] intArray21 = tiffDirectory7.getFieldValue(tagInfoLongs19, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray24 = tiffDirectory7.getFieldValue(tagInfoAscii22, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tiffFieldList10);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Sub" + "'", str14, "Sub");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(intArray21);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray3 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList4 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList4, tiffFieldArray3);
        java.nio.ByteOrder byteOrder8 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory9 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList4, (long) 0, (long) ' ', byteOrder8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory9.setTiffImageData(abstractTiffImageData10);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList12 = tiffDirectory9.getDirectoryEntries();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList13 = tiffDirectory9.getDirectoryEntries();
        java.nio.ByteOrder byteOrder16 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory17 = new org.apache.commons.imaging.formats.tiff.TiffDirectory((int) (byte) 1, tiffFieldList13, (long) 10, (long) 1, byteOrder16);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory21 = new org.apache.commons.imaging.formats.tiff.TiffDirectory((int) (byte) 1, tiffFieldList13, (long) (short) 10, (long) (byte) 0, byteOrder20);
        org.junit.Assert.assertNotNull(tiffFieldArray3);
        org.junit.Assert.assertArrayEquals(tiffFieldArray3, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tiffFieldList12);
        org.junit.Assert.assertNotNull(tiffFieldList13);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        boolean boolean10 = tiffDirectory7.hasJpegImageData();
        java.lang.String str11 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData12 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData12);
        long long14 = tiffDirectory7.offset;
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldItor15 = tiffDirectory7.iterator();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray18 = tiffDirectory7.getFieldValue(tagInfoSRationals16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Sub" + "'", str11, "Sub");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(tiffFieldItor15);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.apache.commons.imaging.formats.tiff.TiffDirectory.ImageDataElement imageDataElement2 = new org.apache.commons.imaging.formats.tiff.TiffDirectory.ImageDataElement((long) (byte) 0, 6);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts10 = null;
        short[] shortArray12 = tiffDirectory7.getFieldValue(tagInfoSShorts10, false);
        java.lang.String str13 = tiffDirectory7.description();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList14 = tiffDirectory7.getDirectoryEntries();
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData15 = null;
        tiffDirectory7.setJpegImageData(jpegImageData15);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText17 = null;
        java.lang.String str19 = tiffDirectory7.getFieldValue(tagInfoGpsText17, false);
        long long20 = tiffDirectory7.getNextDirectoryOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts21 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray23 = tiffDirectory7.getFieldValue(tagInfoSShorts21, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(shortArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Sub" + "'", str13, "Sub");
        org.junit.Assert.assertNotNull(tiffFieldList14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = tiffDirectory7.getTiffImageData();
        java.nio.ByteOrder byteOrder11 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters12 = null;
        java.awt.image.BufferedImage bufferedImage13 = tiffDirectory7.getTiffImage(byteOrder11, tiffImagingParameters12);
        java.nio.ByteOrder byteOrder14 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters15 = null;
        java.awt.image.BufferedImage bufferedImage16 = tiffDirectory7.getTiffImage(byteOrder14, tiffImagingParameters15);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong17 = null;
        int[] intArray19 = tiffDirectory7.getFieldValue(tagInfoShortOrLong17, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo20 = null;
        java.lang.Object obj21 = tiffDirectory7.getFieldValue(tagInfo20);
        java.lang.String str22 = tiffDirectory7.getElementDescription();
        java.lang.String str23 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText24 = null;
        java.lang.String str26 = tiffDirectory7.getFieldValue(tagInfoGpsText24, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs tagInfoSLongs27 = null;
        int[] intArray29 = tiffDirectory7.getFieldValue(tagInfoSLongs27, false);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(abstractTiffImageData10);
        org.junit.Assert.assertNull(bufferedImage13);
        org.junit.Assert.assertNull(bufferedImage16);
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Sub" + "'", str23, "Sub");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(intArray29);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = tiffDirectory7.getTiffImageData();
        java.nio.ByteOrder byteOrder11 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters12 = null;
        java.awt.image.BufferedImage bufferedImage13 = tiffDirectory7.getTiffImage(byteOrder11, tiffImagingParameters12);
        java.nio.ByteOrder byteOrder14 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters15 = null;
        java.awt.image.BufferedImage bufferedImage16 = tiffDirectory7.getTiffImage(byteOrder14, tiffImagingParameters15);
        boolean boolean17 = tiffDirectory7.hasTiffRasterData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = tiffDirectory7.findField(tagInfo18);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList20 = tiffDirectory7.getDirectoryEntries();
        java.nio.ByteOrder byteOrder21 = null;
        java.awt.image.BufferedImage bufferedImage22 = tiffDirectory7.getTiffImage(byteOrder21);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(abstractTiffImageData10);
        org.junit.Assert.assertNull(bufferedImage13);
        org.junit.Assert.assertNull(bufferedImage16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(tiffField19);
        org.junit.Assert.assertNotNull(tiffFieldList20);
        org.junit.Assert.assertNull(bufferedImage22);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        java.awt.image.BufferedImage bufferedImage12 = tiffDirectory7.getTiffImage();
        long long13 = tiffDirectory7.offset;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats tagInfoFloats14 = null;
        float[] floatArray16 = tiffDirectory7.getFieldValue(tagInfoFloats14, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = null;
        java.lang.Object obj18 = tiffDirectory7.getFieldValue(tagInfo17);
        long long19 = tiffDirectory7.getNextDirectoryOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.imaging.formats.tiff.TiffDirectory.ImageDataElement> imageDataElementList20 = tiffDirectory7.getTiffRawImageDataElements();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.imaging.ImagingException; message: Couldn't find image data.");
        } catch (org.apache.commons.imaging.ImagingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImage12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(floatArray16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        boolean boolean10 = tiffDirectory7.hasJpegImageData();
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldItor11 = tiffDirectory7.iterator();
        int int12 = tiffDirectory7.type;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational tagInfoRational13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber rationalNumber14 = tiffDirectory7.getFieldValue(tagInfoRational13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tiffFieldItor11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        tiffDirectory7.dump();
        java.lang.String str9 = tiffDirectory7.description();
        long long10 = tiffDirectory7.offset;
        boolean boolean11 = tiffDirectory7.hasTiffRasterData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShort tagInfoSShort12 = null;
        // The following exception was thrown during execution in test generation
        try {
            short short13 = tiffDirectory7.getFieldValue(tagInfoSShort12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Sub" + "'", str9, "Sub");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        java.awt.image.BufferedImage bufferedImage12 = tiffDirectory7.getTiffImage();
        java.lang.String str13 = tiffDirectory7.getElementDescription();
        java.nio.ByteOrder byteOrder14 = null;
        java.awt.image.BufferedImage bufferedImage15 = tiffDirectory7.getTiffImage(byteOrder14);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats tagInfoFloats16 = null;
        float[] floatArray18 = tiffDirectory7.getFieldValue(tagInfoFloats16, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational tagInfoSRational19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber rationalNumber20 = tiffDirectory7.getFieldValue(tagInfoSRational19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(bufferedImage15);
        org.junit.Assert.assertNull(floatArray18);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts8 = null;
        short[] shortArray10 = tiffDirectory7.getFieldValue(tagInfoSShorts8, false);
        int int11 = tiffDirectory7.size();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList12 = tiffDirectory7.getDirectoryEntries();
        int int13 = tiffDirectory7.size();
        long long14 = tiffDirectory7.getNextDirectoryOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField16 = tiffDirectory7.findField(tagInfo15);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShort tagInfoSShort17 = null;
        // The following exception was thrown during execution in test generation
        try {
            short short18 = tiffDirectory7.getFieldValue(tagInfoSShort17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(shortArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(tiffFieldList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertNull(tiffField16);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        java.awt.image.BufferedImage bufferedImage12 = tiffDirectory7.getTiffImage();
        java.lang.String str13 = tiffDirectory7.getElementDescription();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo14 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField16 = tiffDirectory7.findField(tagInfo14, false);
        boolean boolean17 = tiffDirectory7.hasTiffImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData18 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData18);
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldItor20 = tiffDirectory7.iterator();
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData21 = null;
        tiffDirectory7.setJpegImageData(jpegImageData21);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(tiffField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tiffFieldItor20);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        boolean boolean10 = tiffDirectory7.hasJpegImageData();
        java.lang.String str11 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData12 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData12);
        long long14 = tiffDirectory7.offset;
        java.nio.ByteOrder byteOrder15 = tiffDirectory7.getByteOrder();
        long long16 = tiffDirectory7.getNextDirectoryOffset();
        java.lang.String str17 = tiffDirectory7.description();
        boolean boolean18 = tiffDirectory7.hasJpegImageData();
        boolean boolean19 = tiffDirectory7.hasTiffRasterData();
        boolean boolean20 = tiffDirectory7.hasTiffFloatingPointRasterData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData21 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData21);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats tagInfoFloats23 = null;
        float[] floatArray25 = tiffDirectory7.getFieldValue(tagInfoFloats23, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble tagInfoDouble26 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double27 = tiffDirectory7.getFieldValue(tagInfoDouble26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Sub" + "'", str11, "Sub");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(byteOrder15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Sub" + "'", str17, "Sub");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(floatArray25);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        boolean boolean10 = tiffDirectory7.hasJpegImageData();
        java.lang.String str11 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData12 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData12);
        long long14 = tiffDirectory7.offset;
        java.nio.ByteOrder byteOrder15 = tiffDirectory7.getByteOrder();
        long long16 = tiffDirectory7.getNextDirectoryOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs17 = null;
        int[] intArray19 = tiffDirectory7.getFieldValue(tagInfoLongs17, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals20 = null;
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray22 = tiffDirectory7.getFieldValue(tagInfoRationals20, false);
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldItor23 = tiffDirectory7.iterator();
        int int24 = tiffDirectory7.size();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData25 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData25);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString27 = null;
        java.lang.String str29 = tiffDirectory7.getFieldValue(tagInfoXpString27, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts30 = null;
        short[] shortArray32 = tiffDirectory7.getFieldValue(tagInfoShorts30, false);
        int int33 = tiffDirectory7.length;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloat tagInfoFloat34 = null;
        // The following exception was thrown during execution in test generation
        try {
            float float35 = tiffDirectory7.getFieldValue(tagInfoFloat34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Sub" + "'", str11, "Sub");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(byteOrder15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertNull(rationalNumberArray22);
        org.junit.Assert.assertNotNull(tiffFieldItor23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(shortArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6 + "'", int33 == 6);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        boolean boolean10 = tiffDirectory7.hasJpegImageData();
        java.lang.String str11 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData12 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData12);
        long long14 = tiffDirectory7.offset;
        java.nio.ByteOrder byteOrder15 = tiffDirectory7.getByteOrder();
        long long16 = tiffDirectory7.getNextDirectoryOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs17 = null;
        int[] intArray19 = tiffDirectory7.getFieldValue(tagInfoLongs17, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs20 = null;
        int[] intArray22 = tiffDirectory7.getFieldValue(tagInfoLongs20, false);
        java.awt.image.BufferedImage bufferedImage23 = tiffDirectory7.getTiffImage();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData24 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData24);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Sub" + "'", str11, "Sub");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(byteOrder15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertNull(intArray22);
        org.junit.Assert.assertNull(bufferedImage23);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        tiffDirectory7.dump();
        java.lang.String str9 = tiffDirectory7.description();
        long long10 = tiffDirectory7.offset;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffRasterData tiffRasterData12 = tiffDirectory7.getRasterData(tiffImagingParameters11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.imaging.ImagingException; message: Required field \"SampleFormat\" is missing");
        } catch (org.apache.commons.imaging.ImagingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Sub" + "'", str9, "Sub");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        java.awt.image.BufferedImage bufferedImage12 = tiffDirectory7.getTiffImage();
        java.lang.String str13 = tiffDirectory7.getElementDescription();
        boolean boolean14 = tiffDirectory7.hasJpegImageData();
        java.nio.ByteOrder byteOrder15 = null;
        java.awt.image.BufferedImage bufferedImage16 = tiffDirectory7.getTiffImage(byteOrder15);
        boolean boolean17 = tiffDirectory7.hasJpegImageData();
        boolean boolean18 = tiffDirectory7.hasJpegImageData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes tagInfoSBytes19 = null;
        byte[] byteArray21 = tiffDirectory7.getFieldValue(tagInfoSBytes19, false);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(bufferedImage16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(byteArray21);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = tiffDirectory7.getTiffImageData();
        java.nio.ByteOrder byteOrder11 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters12 = null;
        java.awt.image.BufferedImage bufferedImage13 = tiffDirectory7.getTiffImage(byteOrder11, tiffImagingParameters12);
        java.nio.ByteOrder byteOrder14 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters15 = null;
        java.awt.image.BufferedImage bufferedImage16 = tiffDirectory7.getTiffImage(byteOrder14, tiffImagingParameters15);
        boolean boolean17 = tiffDirectory7.hasTiffRasterData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats tagInfoFloats18 = null;
        float[] floatArray20 = tiffDirectory7.getFieldValue(tagInfoFloats18, false);
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldItor21 = tiffDirectory7.iterator();
        boolean boolean22 = tiffDirectory7.hasTiffRasterData();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(abstractTiffImageData10);
        org.junit.Assert.assertNull(bufferedImage13);
        org.junit.Assert.assertNull(bufferedImage16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(floatArray20);
        org.junit.Assert.assertNotNull(tiffFieldItor21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts10 = null;
        short[] shortArray12 = tiffDirectory7.getFieldValue(tagInfoSShorts10, false);
        java.lang.String str13 = tiffDirectory7.description();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList14 = tiffDirectory7.getDirectoryEntries();
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData15 = null;
        tiffDirectory7.setJpegImageData(jpegImageData15);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText17 = null;
        java.lang.String str19 = tiffDirectory7.getFieldValue(tagInfoGpsText17, false);
        java.nio.ByteOrder byteOrder20 = tiffDirectory7.getByteOrder();
        java.util.Spliterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldSpliterator21 = tiffDirectory7.spliterator();
        java.awt.image.BufferedImage bufferedImage22 = tiffDirectory7.getTiffImage();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational tagInfoRational23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber rationalNumber24 = tiffDirectory7.getFieldValue(tagInfoRational23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(shortArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Sub" + "'", str13, "Sub");
        org.junit.Assert.assertNotNull(tiffFieldList14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(byteOrder20);
        org.junit.Assert.assertNotNull(tiffFieldSpliterator21);
        org.junit.Assert.assertNull(bufferedImage22);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        tiffDirectory7.dump();
        java.lang.String str9 = tiffDirectory7.description();
        tiffDirectory7.dump();
        boolean boolean11 = tiffDirectory7.hasTiffRasterData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo12 = null;
        java.lang.Object obj13 = tiffDirectory7.getFieldValue(tagInfo12);
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData14 = tiffDirectory7.getJpegImageData();
        java.util.Spliterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldSpliterator15 = tiffDirectory7.spliterator();
        java.lang.String str16 = tiffDirectory7.getElementDescription();
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData17 = null;
        tiffDirectory7.setJpegImageData(jpegImageData17);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Sub" + "'", str9, "Sub");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(jpegImageData14);
        org.junit.Assert.assertNotNull(tiffFieldSpliterator15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData10 = tiffDirectory7.getJpegImageData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString11 = null;
        java.lang.String str13 = tiffDirectory7.getFieldValue(tagInfoXpString11, false);
        int int14 = tiffDirectory7.type;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = tiffDirectory7.getSingleFieldValue(tagInfoAscii15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jpegImageData10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldItor8 = tiffDirectory7.iterator();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats tagInfoFloats9 = null;
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray11 = tiffDirectory7.getFieldValue(tagInfoFloats9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tiffFieldItor8);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts10 = null;
        short[] shortArray12 = tiffDirectory7.getFieldValue(tagInfoSShorts10, false);
        java.lang.String str13 = tiffDirectory7.description();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList14 = tiffDirectory7.getDirectoryEntries();
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData15 = null;
        tiffDirectory7.setJpegImageData(jpegImageData15);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText17 = null;
        java.lang.String str19 = tiffDirectory7.getFieldValue(tagInfoGpsText17, false);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList20 = tiffDirectory7.getDirectoryEntries();
        int int21 = tiffDirectory7.size();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals22 = null;
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray24 = tiffDirectory7.getFieldValue(tagInfoRationals22, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo25 = null;
        java.lang.Object obj26 = tiffDirectory7.getFieldValue(tagInfo25);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational tagInfoRational27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber rationalNumber28 = tiffDirectory7.getFieldValue(tagInfoRational27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(shortArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Sub" + "'", str13, "Sub");
        org.junit.Assert.assertNotNull(tiffFieldList14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(tiffFieldList20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(rationalNumberArray24);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = tiffDirectory7.getTiffImageData();
        java.nio.ByteOrder byteOrder11 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters12 = null;
        java.awt.image.BufferedImage bufferedImage13 = tiffDirectory7.getTiffImage(byteOrder11, tiffImagingParameters12);
        java.nio.ByteOrder byteOrder14 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters15 = null;
        java.awt.image.BufferedImage bufferedImage16 = tiffDirectory7.getTiffImage(byteOrder14, tiffImagingParameters15);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs17 = null;
        int[] intArray19 = tiffDirectory7.getFieldValue(tagInfoLongs17, false);
        java.lang.String str20 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals21 = null;
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray23 = tiffDirectory7.getFieldValue(tagInfoRationals21, false);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(abstractTiffImageData10);
        org.junit.Assert.assertNull(bufferedImage13);
        org.junit.Assert.assertNull(bufferedImage16);
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Sub" + "'", str20, "Sub");
        org.junit.Assert.assertNull(rationalNumberArray23);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        boolean boolean10 = tiffDirectory7.hasJpegImageData();
        java.lang.String str11 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData12 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData12);
        long long14 = tiffDirectory7.offset;
        java.lang.String str15 = tiffDirectory7.description();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes16 = null;
        byte[] byteArray18 = tiffDirectory7.getFieldValue(tagInfoBytes16, false);
        boolean boolean19 = tiffDirectory7.hasTiffRasterData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong20 = null;
        int[] intArray22 = tiffDirectory7.getFieldValue(tagInfoShortOrLong20, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText23 = null;
        java.lang.String str25 = tiffDirectory7.getFieldValue(tagInfoGpsText23, false);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Sub" + "'", str11, "Sub");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Sub" + "'", str15, "Sub");
        org.junit.Assert.assertNull(byteArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(intArray22);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.apache.commons.imaging.formats.tiff.TiffDirectory.ImageDataElement imageDataElement2 = new org.apache.commons.imaging.formats.tiff.TiffDirectory.ImageDataElement(100L, 10);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.apache.commons.imaging.formats.tiff.TiffDirectory.ImageDataElement imageDataElement2 = new org.apache.commons.imaging.formats.tiff.TiffDirectory.ImageDataElement(10L, (int) (byte) 10);
        java.lang.String str3 = imageDataElement2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ImageDataElement" + "'", str3, "ImageDataElement");
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList10 = tiffDirectory7.getDirectoryEntries();
        boolean boolean11 = tiffDirectory7.hasTiffImageData();
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData12 = null;
        tiffDirectory7.setJpegImageData(jpegImageData12);
        boolean boolean14 = tiffDirectory7.hasJpegImageData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText15 = null;
        java.lang.String str17 = tiffDirectory7.getFieldValue(tagInfoGpsText15, false);
        java.lang.String str18 = tiffDirectory7.description();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tiffFieldList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Sub" + "'", str18, "Sub");
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        java.awt.image.BufferedImage bufferedImage12 = tiffDirectory7.getTiffImage();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii13 = null;
        java.lang.String[] strArray15 = tiffDirectory7.getFieldValue(tagInfoAscii13, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs16 = null;
        int[] intArray18 = tiffDirectory7.getFieldValue(tagInfoLongs16, false);
        java.nio.ByteOrder byteOrder19 = null;
        java.awt.image.BufferedImage bufferedImage20 = tiffDirectory7.getTiffImage(byteOrder19);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImage12);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(intArray18);
        org.junit.Assert.assertNull(bufferedImage20);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts10 = null;
        short[] shortArray12 = tiffDirectory7.getFieldValue(tagInfoSShorts10, false);
        java.lang.String str13 = tiffDirectory7.description();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList14 = tiffDirectory7.getDirectoryEntries();
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData15 = null;
        tiffDirectory7.setJpegImageData(jpegImageData15);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText17 = null;
        java.lang.String str19 = tiffDirectory7.getFieldValue(tagInfoGpsText17, false);
        int int20 = tiffDirectory7.type;
        java.nio.ByteOrder byteOrder21 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters22 = null;
        java.awt.image.BufferedImage bufferedImage23 = tiffDirectory7.getTiffImage(byteOrder21, tiffImagingParameters22);
        java.util.Spliterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldSpliterator24 = tiffDirectory7.spliterator();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes tagInfoSBytes25 = null;
        byte[] byteArray27 = tiffDirectory7.getFieldValue(tagInfoSBytes25, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts28 = null;
        short[] shortArray30 = tiffDirectory7.getFieldValue(tagInfoSShorts28, false);
        long long31 = tiffDirectory7.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData32 = tiffDirectory7.getTiffImageData();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(shortArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Sub" + "'", str13, "Sub");
        org.junit.Assert.assertNotNull(tiffFieldList14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(bufferedImage23);
        org.junit.Assert.assertNotNull(tiffFieldSpliterator24);
        org.junit.Assert.assertNull(byteArray27);
        org.junit.Assert.assertNull(shortArray30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNull(abstractTiffImageData32);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts10 = null;
        short[] shortArray12 = tiffDirectory7.getFieldValue(tagInfoSShorts10, false);
        java.lang.String str13 = tiffDirectory7.description();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList14 = tiffDirectory7.getDirectoryEntries();
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData15 = null;
        tiffDirectory7.setJpegImageData(jpegImageData15);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText17 = null;
        java.lang.String str19 = tiffDirectory7.getFieldValue(tagInfoGpsText17, false);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList20 = tiffDirectory7.getDirectoryEntries();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes21 = null;
        byte[] byteArray23 = tiffDirectory7.getFieldValue(tagInfoBytes21, false);
        java.nio.ByteOrder byteOrder24 = null;
        java.awt.image.BufferedImage bufferedImage25 = tiffDirectory7.getTiffImage(byteOrder24);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo26 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField27 = tiffDirectory7.findField(tagInfo26);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs tagInfoSLongs28 = null;
        int[] intArray30 = tiffDirectory7.getFieldValue(tagInfoSLongs28, false);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(shortArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Sub" + "'", str13, "Sub");
        org.junit.Assert.assertNotNull(tiffFieldList14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(tiffFieldList20);
        org.junit.Assert.assertNull(byteArray23);
        org.junit.Assert.assertNull(bufferedImage25);
        org.junit.Assert.assertNull(tiffField27);
        org.junit.Assert.assertNull(intArray30);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        java.awt.image.BufferedImage bufferedImage12 = tiffDirectory7.getTiffImage();
        java.lang.String str13 = tiffDirectory7.getElementDescription();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo14 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField16 = tiffDirectory7.findField(tagInfo14, false);
        boolean boolean17 = tiffDirectory7.hasTiffImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData18 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData18);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs tagInfoSLongs20 = null;
        int[] intArray22 = tiffDirectory7.getFieldValue(tagInfoSLongs20, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo23 = null;
        java.lang.Object obj24 = tiffDirectory7.getFieldValue(tagInfo23);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferedImage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(tiffField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(intArray22);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts10 = null;
        short[] shortArray12 = tiffDirectory7.getFieldValue(tagInfoSShorts10, false);
        java.lang.String str13 = tiffDirectory7.description();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList14 = tiffDirectory7.getDirectoryEntries();
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData15 = null;
        tiffDirectory7.setJpegImageData(jpegImageData15);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText17 = null;
        java.lang.String str19 = tiffDirectory7.getFieldValue(tagInfoGpsText17, false);
        int int20 = tiffDirectory7.type;
        java.nio.ByteOrder byteOrder21 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters22 = null;
        java.awt.image.BufferedImage bufferedImage23 = tiffDirectory7.getTiffImage(byteOrder21, tiffImagingParameters22);
        java.util.Spliterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldSpliterator24 = tiffDirectory7.spliterator();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes tagInfoSBytes25 = null;
        byte[] byteArray27 = tiffDirectory7.getFieldValue(tagInfoSBytes25, false);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData28 = tiffDirectory7.getTiffImageData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii29 = null;
        java.lang.String[] strArray31 = tiffDirectory7.getFieldValue(tagInfoAscii29, false);
        int int32 = tiffDirectory7.size();
        java.util.Spliterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldSpliterator33 = tiffDirectory7.spliterator();
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(shortArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Sub" + "'", str13, "Sub");
        org.junit.Assert.assertNotNull(tiffFieldList14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(bufferedImage23);
        org.junit.Assert.assertNotNull(tiffFieldSpliterator24);
        org.junit.Assert.assertNull(byteArray27);
        org.junit.Assert.assertNull(abstractTiffImageData28);
        org.junit.Assert.assertNull(strArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(tiffFieldSpliterator33);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData10 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData10);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong12 = null;
        int[] intArray14 = tiffDirectory7.getFieldValue(tagInfoShortOrLong12, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = null;
        java.lang.Object obj16 = tiffDirectory7.getFieldValue(tagInfo15);
        long long17 = tiffDirectory7.offset;
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray1 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, tiffFieldArray1);
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory7 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList2, (long) 0, (long) ' ', byteOrder6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData8 = null;
        tiffDirectory7.setTiffImageData(abstractTiffImageData8);
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData10 = tiffDirectory7.getJpegImageData();
        java.util.Spliterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldSpliterator11 = tiffDirectory7.spliterator();
        boolean boolean12 = tiffDirectory7.hasJpegImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData13 = tiffDirectory7.getTiffImageData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles14 = null;
        double[] doubleArray16 = tiffDirectory7.getFieldValue(tagInfoDoubles14, false);
        org.junit.Assert.assertNotNull(tiffFieldArray1);
        org.junit.Assert.assertArrayEquals(tiffFieldArray1, new org.apache.commons.imaging.formats.tiff.TiffField[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jpegImageData10);
        org.junit.Assert.assertNotNull(tiffFieldSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(abstractTiffImageData13);
        org.junit.Assert.assertNull(doubleArray16);
    }
}

