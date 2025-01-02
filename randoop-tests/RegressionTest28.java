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
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser0 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder1 = pcxImageParser0.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource2 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance3 = pcxImageParser0.getFormatCompliance(byteSource2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImageParser0.getDefaultParameters();
        java.lang.String str5 = pcxImageParser0.getDefaultExtension();
        org.apache.commons.imaging.bytesource.ByteSource byteSource6 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata7 = pcxImageParser0.getMetadata(byteSource6);
        boolean boolean9 = pcxImageParser0.canAcceptExtension("");
        boolean boolean11 = pcxImageParser0.canAcceptExtension("hi!");
        java.nio.ByteOrder byteOrder12 = pcxImageParser0.getByteOrder();
        java.lang.String str13 = pcxImageParser0.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser15 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource16 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = null;
        byte[] byteArray18 = pcxImageParser15.getIccProfileBytes(byteSource16, pcxImagingParameters17);
        java.lang.String str19 = pcxImageParser15.getName();
        java.lang.String str20 = pcxImageParser15.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource21 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance22 = pcxImageParser15.getFormatCompliance(byteSource21);
        org.apache.commons.imaging.bytesource.ByteSource byteSource23 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser24 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder25 = pcxImageParser24.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource26 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance27 = pcxImageParser24.getFormatCompliance(byteSource26);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters28 = pcxImageParser24.getDefaultParameters();
        org.apache.commons.imaging.ImageFormat imageFormat29 = null;
        boolean boolean30 = pcxImageParser24.canAcceptType(imageFormat29);
        java.lang.String str31 = pcxImageParser24.getDefaultExtension();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters32 = pcxImageParser24.getDefaultParameters();
        byte[] byteArray33 = pcxImageParser15.getIccProfileBytes(byteSource23, pcxImagingParameters32);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters34 = pcxImageParser15.getDefaultParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Dimension dimension35 = pcxImageParser0.getImageSize(byteSource14, pcxImagingParameters34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder1);
        org.junit.Assert.assertNull(formatCompliance3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "pcx" + "'", str5, "pcx");
        org.junit.Assert.assertNull(imageMetadata7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pcx-Custom" + "'", str13, "Pcx-Custom");
        org.junit.Assert.assertNull(byteArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Pcx-Custom" + "'", str19, "Pcx-Custom");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Pcx-Custom" + "'", str20, "Pcx-Custom");
        org.junit.Assert.assertNull(formatCompliance22);
        org.junit.Assert.assertNotNull(byteOrder25);
        org.junit.Assert.assertNull(formatCompliance27);
        org.junit.Assert.assertNotNull(pcxImagingParameters28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "pcx" + "'", str31, "pcx");
        org.junit.Assert.assertNotNull(pcxImagingParameters32);
        org.junit.Assert.assertNull(byteArray33);
        org.junit.Assert.assertNotNull(pcxImagingParameters34);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser0 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.lang.String str1 = pcxImageParser0.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource2 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance3 = pcxImageParser0.getFormatCompliance(byteSource2);
        java.lang.String str4 = pcxImageParser0.getName();
        boolean boolean6 = pcxImageParser0.canAcceptExtension("hi!");
        org.apache.commons.imaging.bytesource.ByteSource byteSource7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser8 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder9 = pcxImageParser8.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource10 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance11 = pcxImageParser8.getFormatCompliance(byteSource10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImageParser8.getDefaultParameters();
        java.lang.String str13 = pcxImageParser8.getDefaultExtension();
        org.apache.commons.imaging.bytesource.ByteSource byteSource14 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata15 = pcxImageParser8.getMetadata(byteSource14);
        boolean boolean17 = pcxImageParser8.canAcceptExtension("");
        boolean boolean19 = pcxImageParser8.canAcceptExtension("hi!");
        org.apache.commons.imaging.bytesource.ByteSource byteSource20 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser21 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource22 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters23 = null;
        byte[] byteArray24 = pcxImageParser21.getIccProfileBytes(byteSource22, pcxImagingParameters23);
        java.lang.String str25 = pcxImageParser21.getName();
        java.lang.String str26 = pcxImageParser21.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource27 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser28 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder29 = pcxImageParser28.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource30 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance31 = pcxImageParser28.getFormatCompliance(byteSource30);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters32 = pcxImageParser28.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata33 = pcxImageParser21.getMetadata(byteSource27, pcxImagingParameters32);
        org.apache.commons.imaging.bytesource.ByteSource byteSource34 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser35 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource36 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata37 = pcxImageParser35.getMetadata(byteSource36);
        org.apache.commons.imaging.bytesource.ByteSource byteSource38 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser39 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder40 = pcxImageParser39.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource41 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance42 = pcxImageParser39.getFormatCompliance(byteSource41);
        org.apache.commons.imaging.bytesource.ByteSource byteSource43 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata44 = pcxImageParser39.getMetadata(byteSource43);
        boolean boolean46 = pcxImageParser39.canAcceptExtension("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters47 = pcxImageParser39.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata48 = pcxImageParser35.getMetadata(byteSource38, pcxImagingParameters47);
        byte[] byteArray49 = pcxImageParser21.getIccProfileBytes(byteSource34, pcxImagingParameters47);
        org.apache.commons.imaging.bytesource.ByteSource byteSource50 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance51 = pcxImageParser21.getFormatCompliance(byteSource50);
        java.nio.ByteOrder byteOrder52 = pcxImageParser21.getByteOrder();
        java.nio.ByteOrder byteOrder53 = pcxImageParser21.getByteOrder();
        java.lang.String str54 = pcxImageParser21.getName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters55 = pcxImageParser21.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata56 = pcxImageParser8.getMetadata(byteSource20, pcxImagingParameters55);
        org.apache.commons.imaging.common.ImageMetadata imageMetadata57 = pcxImageParser0.getMetadata(byteSource7, pcxImagingParameters55);
        java.lang.String str58 = pcxImageParser0.getDefaultExtension();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Pcx-Custom" + "'", str1, "Pcx-Custom");
        org.junit.Assert.assertNull(formatCompliance3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Pcx-Custom" + "'", str4, "Pcx-Custom");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNull(formatCompliance11);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "pcx" + "'", str13, "pcx");
        org.junit.Assert.assertNull(imageMetadata15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(byteArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Pcx-Custom" + "'", str25, "Pcx-Custom");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Pcx-Custom" + "'", str26, "Pcx-Custom");
        org.junit.Assert.assertNotNull(byteOrder29);
        org.junit.Assert.assertNull(formatCompliance31);
        org.junit.Assert.assertNotNull(pcxImagingParameters32);
        org.junit.Assert.assertNull(imageMetadata33);
        org.junit.Assert.assertNull(imageMetadata37);
        org.junit.Assert.assertNotNull(byteOrder40);
        org.junit.Assert.assertNull(formatCompliance42);
        org.junit.Assert.assertNull(imageMetadata44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters47);
        org.junit.Assert.assertNull(imageMetadata48);
        org.junit.Assert.assertNull(byteArray49);
        org.junit.Assert.assertNull(formatCompliance51);
        org.junit.Assert.assertNotNull(byteOrder52);
        org.junit.Assert.assertNotNull(byteOrder53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Pcx-Custom" + "'", str54, "Pcx-Custom");
        org.junit.Assert.assertNotNull(pcxImagingParameters55);
        org.junit.Assert.assertNull(imageMetadata56);
        org.junit.Assert.assertNull(imageMetadata57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "pcx" + "'", str58, "pcx");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser0 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.lang.String str1 = pcxImageParser0.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource2 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance3 = pcxImageParser0.getFormatCompliance(byteSource2);
        java.lang.String str4 = pcxImageParser0.getDefaultExtension();
        org.apache.commons.imaging.bytesource.ByteSource byteSource5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser6 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = null;
        byte[] byteArray9 = pcxImageParser6.getIccProfileBytes(byteSource7, pcxImagingParameters8);
        java.lang.String str10 = pcxImageParser6.getName();
        java.lang.String str11 = pcxImageParser6.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource12 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance13 = pcxImageParser6.getFormatCompliance(byteSource12);
        org.apache.commons.imaging.bytesource.ByteSource byteSource14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser15 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder16 = pcxImageParser15.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource17 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance18 = pcxImageParser15.getFormatCompliance(byteSource17);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImageParser15.getDefaultParameters();
        org.apache.commons.imaging.ImageFormat imageFormat20 = null;
        boolean boolean21 = pcxImageParser15.canAcceptType(imageFormat20);
        java.lang.String str22 = pcxImageParser15.getDefaultExtension();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters23 = pcxImageParser15.getDefaultParameters();
        byte[] byteArray24 = pcxImageParser6.getIccProfileBytes(byteSource14, pcxImagingParameters23);
        org.apache.commons.imaging.bytesource.ByteSource byteSource25 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser26 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder27 = pcxImageParser26.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource28 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance29 = pcxImageParser26.getFormatCompliance(byteSource28);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters30 = pcxImageParser26.getDefaultParameters();
        org.apache.commons.imaging.ImageFormat imageFormat31 = null;
        boolean boolean32 = pcxImageParser26.canAcceptType(imageFormat31);
        java.lang.String str33 = pcxImageParser26.getDefaultExtension();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters34 = pcxImageParser26.getDefaultParameters();
        byte[] byteArray35 = pcxImageParser6.getIccProfileBytes(byteSource25, pcxImagingParameters34);
        org.apache.commons.imaging.common.ImageMetadata imageMetadata36 = pcxImageParser0.getMetadata(byteSource5, pcxImagingParameters34);
        java.io.PrintWriter printWriter37 = null;
        org.apache.commons.imaging.bytesource.ByteSource byteSource38 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = pcxImageParser0.dumpImageFile(printWriter37, byteSource38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Pcx-Custom" + "'", str1, "Pcx-Custom");
        org.junit.Assert.assertNull(formatCompliance3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "pcx" + "'", str4, "pcx");
        org.junit.Assert.assertNull(byteArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Pcx-Custom" + "'", str10, "Pcx-Custom");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Pcx-Custom" + "'", str11, "Pcx-Custom");
        org.junit.Assert.assertNull(formatCompliance13);
        org.junit.Assert.assertNotNull(byteOrder16);
        org.junit.Assert.assertNull(formatCompliance18);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "pcx" + "'", str22, "pcx");
        org.junit.Assert.assertNotNull(pcxImagingParameters23);
        org.junit.Assert.assertNull(byteArray24);
        org.junit.Assert.assertNotNull(byteOrder27);
        org.junit.Assert.assertNull(formatCompliance29);
        org.junit.Assert.assertNotNull(pcxImagingParameters30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "pcx" + "'", str33, "pcx");
        org.junit.Assert.assertNotNull(pcxImagingParameters34);
        org.junit.Assert.assertNull(byteArray35);
        org.junit.Assert.assertNull(imageMetadata36);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser0 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder1 = pcxImageParser0.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource2 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance3 = pcxImageParser0.getFormatCompliance(byteSource2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImageParser0.getDefaultParameters();
        org.apache.commons.imaging.ImageFormat imageFormat5 = null;
        boolean boolean6 = pcxImageParser0.canAcceptType(imageFormat5);
        java.lang.String str7 = pcxImageParser0.getDefaultExtension();
        org.apache.commons.imaging.bytesource.ByteSource byteSource8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser9 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder10 = pcxImageParser9.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource11 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance12 = pcxImageParser9.getFormatCompliance(byteSource11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImageParser9.getDefaultParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImageParser9.getDefaultParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImageParser9.getDefaultParameters();
        org.apache.commons.imaging.bytesource.ByteSource byteSource16 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser17 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource18 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = null;
        byte[] byteArray20 = pcxImageParser17.getIccProfileBytes(byteSource18, pcxImagingParameters19);
        java.lang.String str21 = pcxImageParser17.getName();
        java.lang.String str22 = pcxImageParser17.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource23 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser24 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder25 = pcxImageParser24.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource26 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance27 = pcxImageParser24.getFormatCompliance(byteSource26);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters28 = pcxImageParser24.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata29 = pcxImageParser17.getMetadata(byteSource23, pcxImagingParameters28);
        java.lang.String str30 = pcxImageParser17.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource31 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata32 = pcxImageParser17.getMetadata(byteSource31);
        org.apache.commons.imaging.bytesource.ByteSource byteSource33 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser34 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource35 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters36 = null;
        byte[] byteArray37 = pcxImageParser34.getIccProfileBytes(byteSource35, pcxImagingParameters36);
        java.lang.String str38 = pcxImageParser34.getName();
        java.lang.String str39 = pcxImageParser34.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource40 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser41 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder42 = pcxImageParser41.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource43 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance44 = pcxImageParser41.getFormatCompliance(byteSource43);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters45 = pcxImageParser41.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata46 = pcxImageParser34.getMetadata(byteSource40, pcxImagingParameters45);
        org.apache.commons.imaging.bytesource.ByteSource byteSource47 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser48 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource49 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters50 = null;
        byte[] byteArray51 = pcxImageParser48.getIccProfileBytes(byteSource49, pcxImagingParameters50);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters52 = pcxImageParser48.getDefaultParameters();
        byte[] byteArray53 = pcxImageParser34.getIccProfileBytes(byteSource47, pcxImagingParameters52);
        byte[] byteArray54 = pcxImageParser17.getIccProfileBytes(byteSource33, pcxImagingParameters52);
        byte[] byteArray55 = pcxImageParser9.getIccProfileBytes(byteSource16, pcxImagingParameters52);
        byte[] byteArray56 = pcxImageParser0.getIccProfileBytes(byteSource8, pcxImagingParameters52);
        org.apache.commons.imaging.bytesource.ByteSource byteSource57 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance58 = pcxImageParser0.getFormatCompliance(byteSource57);
        java.lang.String str59 = pcxImageParser0.getDefaultExtension();
        org.junit.Assert.assertNotNull(byteOrder1);
        org.junit.Assert.assertNull(formatCompliance3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "pcx" + "'", str7, "pcx");
        org.junit.Assert.assertNotNull(byteOrder10);
        org.junit.Assert.assertNull(formatCompliance12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNull(byteArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Pcx-Custom" + "'", str21, "Pcx-Custom");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Pcx-Custom" + "'", str22, "Pcx-Custom");
        org.junit.Assert.assertNotNull(byteOrder25);
        org.junit.Assert.assertNull(formatCompliance27);
        org.junit.Assert.assertNotNull(pcxImagingParameters28);
        org.junit.Assert.assertNull(imageMetadata29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Pcx-Custom" + "'", str30, "Pcx-Custom");
        org.junit.Assert.assertNull(imageMetadata32);
        org.junit.Assert.assertNull(byteArray37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Pcx-Custom" + "'", str38, "Pcx-Custom");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Pcx-Custom" + "'", str39, "Pcx-Custom");
        org.junit.Assert.assertNotNull(byteOrder42);
        org.junit.Assert.assertNull(formatCompliance44);
        org.junit.Assert.assertNotNull(pcxImagingParameters45);
        org.junit.Assert.assertNull(imageMetadata46);
        org.junit.Assert.assertNull(byteArray51);
        org.junit.Assert.assertNotNull(pcxImagingParameters52);
        org.junit.Assert.assertNull(byteArray53);
        org.junit.Assert.assertNull(byteArray54);
        org.junit.Assert.assertNull(byteArray55);
        org.junit.Assert.assertNull(byteArray56);
        org.junit.Assert.assertNull(formatCompliance58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "pcx" + "'", str59, "pcx");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser0 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder1 = pcxImageParser0.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource2 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance3 = pcxImageParser0.getFormatCompliance(byteSource2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImageParser0.getDefaultParameters();
        org.apache.commons.imaging.bytesource.ByteSource byteSource5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser6 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource7 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata8 = pcxImageParser6.getMetadata(byteSource7);
        org.apache.commons.imaging.bytesource.ByteSource byteSource9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser10 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder11 = pcxImageParser10.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource12 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance13 = pcxImageParser10.getFormatCompliance(byteSource12);
        org.apache.commons.imaging.bytesource.ByteSource byteSource14 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata15 = pcxImageParser10.getMetadata(byteSource14);
        boolean boolean17 = pcxImageParser10.canAcceptExtension("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImageParser10.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata19 = pcxImageParser6.getMetadata(byteSource9, pcxImagingParameters18);
        byte[] byteArray20 = pcxImageParser0.getIccProfileBytes(byteSource5, pcxImagingParameters18);
        org.apache.commons.imaging.bytesource.ByteSource byteSource21 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters22 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata23 = pcxImageParser0.getMetadata(byteSource21, pcxImagingParameters22);
        java.lang.String str24 = pcxImageParser0.getDefaultExtension();
        boolean boolean26 = pcxImageParser0.canAcceptExtension("");
        java.lang.String str27 = pcxImageParser0.getName();
        java.nio.ByteOrder byteOrder28 = pcxImageParser0.getByteOrder();
        java.lang.String str29 = pcxImageParser0.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.awt.image.BufferedImage> bufferedImageList31 = pcxImageParser0.getAllBufferedImages(byteSource30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder1);
        org.junit.Assert.assertNull(formatCompliance3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(imageMetadata8);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertNull(formatCompliance13);
        org.junit.Assert.assertNull(imageMetadata15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertNull(imageMetadata19);
        org.junit.Assert.assertNull(byteArray20);
        org.junit.Assert.assertNull(imageMetadata23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "pcx" + "'", str24, "pcx");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Pcx-Custom" + "'", str27, "Pcx-Custom");
        org.junit.Assert.assertNotNull(byteOrder28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Pcx-Custom" + "'", str29, "Pcx-Custom");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser0 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource1 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata2 = pcxImageParser0.getMetadata(byteSource1);
        org.apache.commons.imaging.bytesource.ByteSource byteSource3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser4 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder5 = pcxImageParser4.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource6 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance7 = pcxImageParser4.getFormatCompliance(byteSource6);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImageParser4.getDefaultParameters();
        org.apache.commons.imaging.bytesource.ByteSource byteSource9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser10 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource11 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata12 = pcxImageParser10.getMetadata(byteSource11);
        org.apache.commons.imaging.bytesource.ByteSource byteSource13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser14 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder15 = pcxImageParser14.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource16 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance17 = pcxImageParser14.getFormatCompliance(byteSource16);
        org.apache.commons.imaging.bytesource.ByteSource byteSource18 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata19 = pcxImageParser14.getMetadata(byteSource18);
        boolean boolean21 = pcxImageParser14.canAcceptExtension("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters22 = pcxImageParser14.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata23 = pcxImageParser10.getMetadata(byteSource13, pcxImagingParameters22);
        byte[] byteArray24 = pcxImageParser4.getIccProfileBytes(byteSource9, pcxImagingParameters22);
        java.lang.String str25 = pcxImageParser4.getName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters26 = pcxImageParser4.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata27 = pcxImageParser0.getMetadata(byteSource3, pcxImagingParameters26);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters28 = pcxImageParser0.getDefaultParameters();
        org.apache.commons.imaging.bytesource.ByteSource byteSource29 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser30 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource31 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters32 = null;
        byte[] byteArray33 = pcxImageParser30.getIccProfileBytes(byteSource31, pcxImagingParameters32);
        java.lang.String str34 = pcxImageParser30.getDefaultExtension();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters35 = pcxImageParser30.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata36 = pcxImageParser0.getMetadata(byteSource29, pcxImagingParameters35);
        org.apache.commons.imaging.bytesource.ByteSource byteSource37 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata38 = pcxImageParser0.getMetadata(byteSource37);
        org.apache.commons.imaging.bytesource.ByteSource byteSource39 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser40 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource41 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata42 = pcxImageParser40.getMetadata(byteSource41);
        org.apache.commons.imaging.bytesource.ByteSource byteSource43 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata44 = pcxImageParser40.getMetadata(byteSource43);
        java.lang.String str45 = pcxImageParser40.getDefaultExtension();
        java.lang.String str46 = pcxImageParser40.getDefaultExtension();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters47 = pcxImageParser40.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata48 = pcxImageParser0.getMetadata(byteSource39, pcxImagingParameters47);
        java.lang.String str49 = pcxImageParser0.getDefaultExtension();
        org.junit.Assert.assertNull(imageMetadata2);
        org.junit.Assert.assertNotNull(byteOrder5);
        org.junit.Assert.assertNull(formatCompliance7);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(imageMetadata12);
        org.junit.Assert.assertNotNull(byteOrder15);
        org.junit.Assert.assertNull(formatCompliance17);
        org.junit.Assert.assertNull(imageMetadata19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters22);
        org.junit.Assert.assertNull(imageMetadata23);
        org.junit.Assert.assertNull(byteArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Pcx-Custom" + "'", str25, "Pcx-Custom");
        org.junit.Assert.assertNotNull(pcxImagingParameters26);
        org.junit.Assert.assertNull(imageMetadata27);
        org.junit.Assert.assertNotNull(pcxImagingParameters28);
        org.junit.Assert.assertNull(byteArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "pcx" + "'", str34, "pcx");
        org.junit.Assert.assertNotNull(pcxImagingParameters35);
        org.junit.Assert.assertNull(imageMetadata36);
        org.junit.Assert.assertNull(imageMetadata38);
        org.junit.Assert.assertNull(imageMetadata42);
        org.junit.Assert.assertNull(imageMetadata44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "pcx" + "'", str45, "pcx");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "pcx" + "'", str46, "pcx");
        org.junit.Assert.assertNotNull(pcxImagingParameters47);
        org.junit.Assert.assertNull(imageMetadata48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "pcx" + "'", str49, "pcx");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser0 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.lang.String str1 = pcxImageParser0.getName();
        org.apache.commons.imaging.ImageFormat imageFormat2 = null;
        boolean boolean3 = pcxImageParser0.canAcceptType(imageFormat2);
        org.apache.commons.imaging.ImageFormat imageFormat4 = null;
        boolean boolean5 = pcxImageParser0.canAcceptType(imageFormat4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImageParser0.getDefaultParameters();
        org.apache.commons.imaging.bytesource.ByteSource byteSource7 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance8 = pcxImageParser0.getFormatCompliance(byteSource7);
        java.lang.String str9 = pcxImageParser0.getDefaultExtension();
        java.nio.ByteOrder byteOrder10 = pcxImageParser0.getByteOrder();
        java.nio.ByteOrder byteOrder11 = pcxImageParser0.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser13 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = null;
        byte[] byteArray16 = pcxImageParser13.getIccProfileBytes(byteSource14, pcxImagingParameters15);
        java.lang.String str17 = pcxImageParser13.getName();
        boolean boolean19 = pcxImageParser13.canAcceptExtension("hi!");
        org.apache.commons.imaging.bytesource.ByteSource byteSource20 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser21 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder22 = pcxImageParser21.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource23 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance24 = pcxImageParser21.getFormatCompliance(byteSource23);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters25 = pcxImageParser21.getDefaultParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters26 = pcxImageParser21.getDefaultParameters();
        byte[] byteArray27 = pcxImageParser13.getIccProfileBytes(byteSource20, pcxImagingParameters26);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters28 = pcxImageParser13.getDefaultParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Dimension dimension29 = pcxImageParser0.getImageSize(byteSource12, pcxImagingParameters28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Pcx-Custom" + "'", str1, "Pcx-Custom");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(formatCompliance8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "pcx" + "'", str9, "pcx");
        org.junit.Assert.assertNotNull(byteOrder10);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertNull(byteArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Pcx-Custom" + "'", str17, "Pcx-Custom");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteOrder22);
        org.junit.Assert.assertNull(formatCompliance24);
        org.junit.Assert.assertNotNull(pcxImagingParameters25);
        org.junit.Assert.assertNotNull(pcxImagingParameters26);
        org.junit.Assert.assertNull(byteArray27);
        org.junit.Assert.assertNotNull(pcxImagingParameters28);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser0 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder1 = pcxImageParser0.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource2 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance3 = pcxImageParser0.getFormatCompliance(byteSource2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImageParser0.getDefaultParameters();
        java.lang.String str5 = pcxImageParser0.getDefaultExtension();
        org.apache.commons.imaging.bytesource.ByteSource byteSource6 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata7 = pcxImageParser0.getMetadata(byteSource6);
        boolean boolean9 = pcxImageParser0.canAcceptExtension("");
        org.apache.commons.imaging.ImageFormat imageFormat10 = null;
        boolean boolean11 = pcxImageParser0.canAcceptType(imageFormat10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImageParser0.getDefaultParameters();
        java.nio.ByteOrder byteOrder13 = pcxImageParser0.getByteOrder();
        java.io.File file14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.ImageMetadata imageMetadata15 = pcxImageParser0.getMetadata(file14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder1);
        org.junit.Assert.assertNull(formatCompliance3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "pcx" + "'", str5, "pcx");
        org.junit.Assert.assertNull(imageMetadata7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(byteOrder13);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser0 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder1 = pcxImageParser0.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource2 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance3 = pcxImageParser0.getFormatCompliance(byteSource2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImageParser0.getDefaultParameters();
        java.lang.String str5 = pcxImageParser0.getName();
        java.lang.String str6 = pcxImageParser0.getDefaultExtension();
        org.apache.commons.imaging.bytesource.ByteSource byteSource7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser8 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = null;
        byte[] byteArray11 = pcxImageParser8.getIccProfileBytes(byteSource9, pcxImagingParameters10);
        java.lang.String str12 = pcxImageParser8.getName();
        java.lang.String str13 = pcxImageParser8.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser15 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder16 = pcxImageParser15.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource17 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance18 = pcxImageParser15.getFormatCompliance(byteSource17);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImageParser15.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata20 = pcxImageParser8.getMetadata(byteSource14, pcxImagingParameters19);
        org.apache.commons.imaging.bytesource.ByteSource byteSource21 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser22 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource23 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata24 = pcxImageParser22.getMetadata(byteSource23);
        org.apache.commons.imaging.bytesource.ByteSource byteSource25 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser26 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder27 = pcxImageParser26.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource28 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance29 = pcxImageParser26.getFormatCompliance(byteSource28);
        org.apache.commons.imaging.bytesource.ByteSource byteSource30 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata31 = pcxImageParser26.getMetadata(byteSource30);
        boolean boolean33 = pcxImageParser26.canAcceptExtension("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters34 = pcxImageParser26.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata35 = pcxImageParser22.getMetadata(byteSource25, pcxImagingParameters34);
        byte[] byteArray36 = pcxImageParser8.getIccProfileBytes(byteSource21, pcxImagingParameters34);
        org.apache.commons.imaging.bytesource.ByteSource byteSource37 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance38 = pcxImageParser8.getFormatCompliance(byteSource37);
        java.nio.ByteOrder byteOrder39 = pcxImageParser8.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource40 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata41 = pcxImageParser8.getMetadata(byteSource40);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters42 = pcxImageParser8.getDefaultParameters();
        byte[] byteArray43 = pcxImageParser0.getIccProfileBytes(byteSource7, pcxImagingParameters42);
        java.io.File file44 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.awt.image.BufferedImage> bufferedImageList45 = pcxImageParser0.getAllBufferedImages(file44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder1);
        org.junit.Assert.assertNull(formatCompliance3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pcx-Custom" + "'", str5, "Pcx-Custom");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "pcx" + "'", str6, "pcx");
        org.junit.Assert.assertNull(byteArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pcx-Custom" + "'", str12, "Pcx-Custom");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pcx-Custom" + "'", str13, "Pcx-Custom");
        org.junit.Assert.assertNotNull(byteOrder16);
        org.junit.Assert.assertNull(formatCompliance18);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertNull(imageMetadata20);
        org.junit.Assert.assertNull(imageMetadata24);
        org.junit.Assert.assertNotNull(byteOrder27);
        org.junit.Assert.assertNull(formatCompliance29);
        org.junit.Assert.assertNull(imageMetadata31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters34);
        org.junit.Assert.assertNull(imageMetadata35);
        org.junit.Assert.assertNull(byteArray36);
        org.junit.Assert.assertNull(formatCompliance38);
        org.junit.Assert.assertNotNull(byteOrder39);
        org.junit.Assert.assertNull(imageMetadata41);
        org.junit.Assert.assertNotNull(pcxImagingParameters42);
        org.junit.Assert.assertNull(byteArray43);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser0 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.lang.String str1 = pcxImageParser0.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource2 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance3 = pcxImageParser0.getFormatCompliance(byteSource2);
        java.lang.String str4 = pcxImageParser0.getName();
        java.lang.String str5 = pcxImageParser0.getName();
        org.apache.commons.imaging.ImageFormat imageFormat6 = null;
        boolean boolean7 = pcxImageParser0.canAcceptType(imageFormat6);
        boolean boolean9 = pcxImageParser0.canAcceptExtension("hi!");
        org.apache.commons.imaging.bytesource.ByteSource byteSource10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser11 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = null;
        byte[] byteArray14 = pcxImageParser11.getIccProfileBytes(byteSource12, pcxImagingParameters13);
        java.lang.String str15 = pcxImageParser11.getName();
        java.lang.String str16 = pcxImageParser11.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource17 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser18 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder19 = pcxImageParser18.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource20 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance21 = pcxImageParser18.getFormatCompliance(byteSource20);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters22 = pcxImageParser18.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata23 = pcxImageParser11.getMetadata(byteSource17, pcxImagingParameters22);
        org.apache.commons.imaging.bytesource.ByteSource byteSource24 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser25 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource26 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters27 = null;
        byte[] byteArray28 = pcxImageParser25.getIccProfileBytes(byteSource26, pcxImagingParameters27);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters29 = pcxImageParser25.getDefaultParameters();
        byte[] byteArray30 = pcxImageParser11.getIccProfileBytes(byteSource24, pcxImagingParameters29);
        byte[] byteArray31 = pcxImageParser0.getIccProfileBytes(byteSource10, pcxImagingParameters29);
        org.apache.commons.imaging.bytesource.ByteSource byteSource32 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser33 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder34 = pcxImageParser33.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource35 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance36 = pcxImageParser33.getFormatCompliance(byteSource35);
        org.apache.commons.imaging.bytesource.ByteSource byteSource37 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata38 = pcxImageParser33.getMetadata(byteSource37);
        boolean boolean40 = pcxImageParser33.canAcceptExtension("hi!");
        org.apache.commons.imaging.ImageFormat imageFormat41 = null;
        boolean boolean42 = pcxImageParser33.canAcceptType(imageFormat41);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters43 = pcxImageParser33.getDefaultParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Dimension dimension44 = pcxImageParser0.getImageSize(byteSource32, pcxImagingParameters43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Pcx-Custom" + "'", str1, "Pcx-Custom");
        org.junit.Assert.assertNull(formatCompliance3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Pcx-Custom" + "'", str4, "Pcx-Custom");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pcx-Custom" + "'", str5, "Pcx-Custom");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(byteArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Pcx-Custom" + "'", str15, "Pcx-Custom");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pcx-Custom" + "'", str16, "Pcx-Custom");
        org.junit.Assert.assertNotNull(byteOrder19);
        org.junit.Assert.assertNull(formatCompliance21);
        org.junit.Assert.assertNotNull(pcxImagingParameters22);
        org.junit.Assert.assertNull(imageMetadata23);
        org.junit.Assert.assertNull(byteArray28);
        org.junit.Assert.assertNotNull(pcxImagingParameters29);
        org.junit.Assert.assertNull(byteArray30);
        org.junit.Assert.assertNull(byteArray31);
        org.junit.Assert.assertNotNull(byteOrder34);
        org.junit.Assert.assertNull(formatCompliance36);
        org.junit.Assert.assertNull(imageMetadata38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters43);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser0 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder1 = pcxImageParser0.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource2 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance3 = pcxImageParser0.getFormatCompliance(byteSource2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImageParser0.getDefaultParameters();
        java.lang.String str5 = pcxImageParser0.getDefaultExtension();
        org.apache.commons.imaging.bytesource.ByteSource byteSource6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata8 = pcxImageParser0.getMetadata(byteSource6, pcxImagingParameters7);
        java.lang.String str9 = pcxImageParser0.getDefaultExtension();
        boolean boolean11 = pcxImageParser0.canAcceptExtension("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImageParser0.getDefaultParameters();
        java.lang.String str13 = pcxImageParser0.getDefaultExtension();
        org.apache.commons.imaging.bytesource.ByteSource byteSource14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser15 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource16 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = null;
        byte[] byteArray18 = pcxImageParser15.getIccProfileBytes(byteSource16, pcxImagingParameters17);
        java.lang.String str19 = pcxImageParser15.getDefaultExtension();
        java.lang.String str20 = pcxImageParser15.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource21 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser22 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource23 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters24 = null;
        byte[] byteArray25 = pcxImageParser22.getIccProfileBytes(byteSource23, pcxImagingParameters24);
        java.lang.String str26 = pcxImageParser22.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource27 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata28 = pcxImageParser22.getMetadata(byteSource27);
        org.apache.commons.imaging.bytesource.ByteSource byteSource29 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance30 = pcxImageParser22.getFormatCompliance(byteSource29);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters31 = pcxImageParser22.getDefaultParameters();
        org.apache.commons.imaging.ImageFormat imageFormat32 = null;
        boolean boolean33 = pcxImageParser22.canAcceptType(imageFormat32);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters34 = pcxImageParser22.getDefaultParameters();
        byte[] byteArray35 = pcxImageParser15.getIccProfileBytes(byteSource21, pcxImagingParameters34);
        byte[] byteArray36 = pcxImageParser0.getIccProfileBytes(byteSource14, pcxImagingParameters34);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters37 = pcxImageParser0.getDefaultParameters();
        java.io.File file38 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Dimension dimension39 = pcxImageParser0.getImageSize(file38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder1);
        org.junit.Assert.assertNull(formatCompliance3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "pcx" + "'", str5, "pcx");
        org.junit.Assert.assertNull(imageMetadata8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "pcx" + "'", str9, "pcx");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "pcx" + "'", str13, "pcx");
        org.junit.Assert.assertNull(byteArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "pcx" + "'", str19, "pcx");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Pcx-Custom" + "'", str20, "Pcx-Custom");
        org.junit.Assert.assertNull(byteArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Pcx-Custom" + "'", str26, "Pcx-Custom");
        org.junit.Assert.assertNull(imageMetadata28);
        org.junit.Assert.assertNull(formatCompliance30);
        org.junit.Assert.assertNotNull(pcxImagingParameters31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters34);
        org.junit.Assert.assertNull(byteArray35);
        org.junit.Assert.assertNull(byteArray36);
        org.junit.Assert.assertNotNull(pcxImagingParameters37);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser0 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource1 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = null;
        byte[] byteArray3 = pcxImageParser0.getIccProfileBytes(byteSource1, pcxImagingParameters2);
        java.lang.String str4 = pcxImageParser0.getName();
        java.lang.String str5 = pcxImageParser0.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource6 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance7 = pcxImageParser0.getFormatCompliance(byteSource6);
        java.lang.String str8 = pcxImageParser0.getDefaultExtension();
        java.nio.ByteOrder byteOrder9 = pcxImageParser0.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser11 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = null;
        byte[] byteArray14 = pcxImageParser11.getIccProfileBytes(byteSource12, pcxImagingParameters13);
        java.lang.String str15 = pcxImageParser11.getName();
        java.lang.String str16 = pcxImageParser11.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource17 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser18 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder19 = pcxImageParser18.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource20 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance21 = pcxImageParser18.getFormatCompliance(byteSource20);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters22 = pcxImageParser18.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata23 = pcxImageParser11.getMetadata(byteSource17, pcxImagingParameters22);
        org.apache.commons.imaging.bytesource.ByteSource byteSource24 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser25 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource26 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata27 = pcxImageParser25.getMetadata(byteSource26);
        org.apache.commons.imaging.bytesource.ByteSource byteSource28 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser29 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder30 = pcxImageParser29.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource31 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance32 = pcxImageParser29.getFormatCompliance(byteSource31);
        org.apache.commons.imaging.bytesource.ByteSource byteSource33 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata34 = pcxImageParser29.getMetadata(byteSource33);
        boolean boolean36 = pcxImageParser29.canAcceptExtension("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters37 = pcxImageParser29.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata38 = pcxImageParser25.getMetadata(byteSource28, pcxImagingParameters37);
        byte[] byteArray39 = pcxImageParser11.getIccProfileBytes(byteSource24, pcxImagingParameters37);
        org.apache.commons.imaging.ImageFormat imageFormat40 = null;
        boolean boolean41 = pcxImageParser11.canAcceptType(imageFormat40);
        org.apache.commons.imaging.bytesource.ByteSource byteSource42 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser43 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder44 = pcxImageParser43.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource45 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance46 = pcxImageParser43.getFormatCompliance(byteSource45);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters47 = pcxImageParser43.getDefaultParameters();
        org.apache.commons.imaging.ImageFormat imageFormat48 = null;
        boolean boolean49 = pcxImageParser43.canAcceptType(imageFormat48);
        java.lang.String str50 = pcxImageParser43.getDefaultExtension();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters51 = pcxImageParser43.getDefaultParameters();
        byte[] byteArray52 = pcxImageParser11.getIccProfileBytes(byteSource42, pcxImagingParameters51);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters53 = pcxImageParser11.getDefaultParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage54 = pcxImageParser0.getBufferedImage(byteSource10, pcxImagingParameters53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Pcx-Custom" + "'", str4, "Pcx-Custom");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pcx-Custom" + "'", str5, "Pcx-Custom");
        org.junit.Assert.assertNull(formatCompliance7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "pcx" + "'", str8, "pcx");
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNull(byteArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Pcx-Custom" + "'", str15, "Pcx-Custom");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pcx-Custom" + "'", str16, "Pcx-Custom");
        org.junit.Assert.assertNotNull(byteOrder19);
        org.junit.Assert.assertNull(formatCompliance21);
        org.junit.Assert.assertNotNull(pcxImagingParameters22);
        org.junit.Assert.assertNull(imageMetadata23);
        org.junit.Assert.assertNull(imageMetadata27);
        org.junit.Assert.assertNotNull(byteOrder30);
        org.junit.Assert.assertNull(formatCompliance32);
        org.junit.Assert.assertNull(imageMetadata34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters37);
        org.junit.Assert.assertNull(imageMetadata38);
        org.junit.Assert.assertNull(byteArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteOrder44);
        org.junit.Assert.assertNull(formatCompliance46);
        org.junit.Assert.assertNotNull(pcxImagingParameters47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "pcx" + "'", str50, "pcx");
        org.junit.Assert.assertNotNull(pcxImagingParameters51);
        org.junit.Assert.assertNull(byteArray52);
        org.junit.Assert.assertNotNull(pcxImagingParameters53);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser0 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource1 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata2 = pcxImageParser0.getMetadata(byteSource1);
        org.apache.commons.imaging.bytesource.ByteSource byteSource3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser4 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder5 = pcxImageParser4.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource6 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance7 = pcxImageParser4.getFormatCompliance(byteSource6);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImageParser4.getDefaultParameters();
        org.apache.commons.imaging.bytesource.ByteSource byteSource9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser10 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource11 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata12 = pcxImageParser10.getMetadata(byteSource11);
        org.apache.commons.imaging.bytesource.ByteSource byteSource13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser14 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder15 = pcxImageParser14.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource16 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance17 = pcxImageParser14.getFormatCompliance(byteSource16);
        org.apache.commons.imaging.bytesource.ByteSource byteSource18 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata19 = pcxImageParser14.getMetadata(byteSource18);
        boolean boolean21 = pcxImageParser14.canAcceptExtension("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters22 = pcxImageParser14.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata23 = pcxImageParser10.getMetadata(byteSource13, pcxImagingParameters22);
        byte[] byteArray24 = pcxImageParser4.getIccProfileBytes(byteSource9, pcxImagingParameters22);
        java.lang.String str25 = pcxImageParser4.getName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters26 = pcxImageParser4.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata27 = pcxImageParser0.getMetadata(byteSource3, pcxImagingParameters26);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters28 = pcxImageParser0.getDefaultParameters();
        org.apache.commons.imaging.bytesource.ByteSource byteSource29 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance30 = pcxImageParser0.getFormatCompliance(byteSource29);
        java.io.File file31 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser32 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource33 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters34 = null;
        byte[] byteArray35 = pcxImageParser32.getIccProfileBytes(byteSource33, pcxImagingParameters34);
        java.lang.String str36 = pcxImageParser32.getName();
        java.lang.String str37 = pcxImageParser32.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource38 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser39 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder40 = pcxImageParser39.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource41 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance42 = pcxImageParser39.getFormatCompliance(byteSource41);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters43 = pcxImageParser39.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata44 = pcxImageParser32.getMetadata(byteSource38, pcxImagingParameters43);
        org.apache.commons.imaging.bytesource.ByteSource byteSource45 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser46 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource47 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata48 = pcxImageParser46.getMetadata(byteSource47);
        org.apache.commons.imaging.bytesource.ByteSource byteSource49 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser50 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder51 = pcxImageParser50.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource52 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance53 = pcxImageParser50.getFormatCompliance(byteSource52);
        org.apache.commons.imaging.bytesource.ByteSource byteSource54 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata55 = pcxImageParser50.getMetadata(byteSource54);
        boolean boolean57 = pcxImageParser50.canAcceptExtension("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters58 = pcxImageParser50.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata59 = pcxImageParser46.getMetadata(byteSource49, pcxImagingParameters58);
        byte[] byteArray60 = pcxImageParser32.getIccProfileBytes(byteSource45, pcxImagingParameters58);
        org.apache.commons.imaging.bytesource.ByteSource byteSource61 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance62 = pcxImageParser32.getFormatCompliance(byteSource61);
        java.nio.ByteOrder byteOrder63 = pcxImageParser32.getByteOrder();
        java.nio.ByteOrder byteOrder64 = pcxImageParser32.getByteOrder();
        org.apache.commons.imaging.ImageFormat imageFormat65 = null;
        boolean boolean66 = pcxImageParser32.canAcceptType(imageFormat65);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters67 = pcxImageParser32.getDefaultParameters();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray68 = pcxImageParser0.getIccProfileBytes(file31, pcxImagingParameters67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(imageMetadata2);
        org.junit.Assert.assertNotNull(byteOrder5);
        org.junit.Assert.assertNull(formatCompliance7);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(imageMetadata12);
        org.junit.Assert.assertNotNull(byteOrder15);
        org.junit.Assert.assertNull(formatCompliance17);
        org.junit.Assert.assertNull(imageMetadata19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters22);
        org.junit.Assert.assertNull(imageMetadata23);
        org.junit.Assert.assertNull(byteArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Pcx-Custom" + "'", str25, "Pcx-Custom");
        org.junit.Assert.assertNotNull(pcxImagingParameters26);
        org.junit.Assert.assertNull(imageMetadata27);
        org.junit.Assert.assertNotNull(pcxImagingParameters28);
        org.junit.Assert.assertNull(formatCompliance30);
        org.junit.Assert.assertNull(byteArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Pcx-Custom" + "'", str36, "Pcx-Custom");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Pcx-Custom" + "'", str37, "Pcx-Custom");
        org.junit.Assert.assertNotNull(byteOrder40);
        org.junit.Assert.assertNull(formatCompliance42);
        org.junit.Assert.assertNotNull(pcxImagingParameters43);
        org.junit.Assert.assertNull(imageMetadata44);
        org.junit.Assert.assertNull(imageMetadata48);
        org.junit.Assert.assertNotNull(byteOrder51);
        org.junit.Assert.assertNull(formatCompliance53);
        org.junit.Assert.assertNull(imageMetadata55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters58);
        org.junit.Assert.assertNull(imageMetadata59);
        org.junit.Assert.assertNull(byteArray60);
        org.junit.Assert.assertNull(formatCompliance62);
        org.junit.Assert.assertNotNull(byteOrder63);
        org.junit.Assert.assertNotNull(byteOrder64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters67);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser0 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource1 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = null;
        byte[] byteArray3 = pcxImageParser0.getIccProfileBytes(byteSource1, pcxImagingParameters2);
        java.lang.String str4 = pcxImageParser0.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource5 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata6 = pcxImageParser0.getMetadata(byteSource5);
        org.apache.commons.imaging.bytesource.ByteSource byteSource7 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance8 = pcxImageParser0.getFormatCompliance(byteSource7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImageParser0.getDefaultParameters();
        org.apache.commons.imaging.bytesource.ByteSource byteSource10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser11 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = null;
        byte[] byteArray14 = pcxImageParser11.getIccProfileBytes(byteSource12, pcxImagingParameters13);
        java.lang.String str15 = pcxImageParser11.getName();
        java.lang.String str16 = pcxImageParser11.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource17 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser18 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder19 = pcxImageParser18.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource20 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance21 = pcxImageParser18.getFormatCompliance(byteSource20);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters22 = pcxImageParser18.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata23 = pcxImageParser11.getMetadata(byteSource17, pcxImagingParameters22);
        org.apache.commons.imaging.bytesource.ByteSource byteSource24 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser25 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource26 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata27 = pcxImageParser25.getMetadata(byteSource26);
        org.apache.commons.imaging.bytesource.ByteSource byteSource28 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser29 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder30 = pcxImageParser29.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource31 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance32 = pcxImageParser29.getFormatCompliance(byteSource31);
        org.apache.commons.imaging.bytesource.ByteSource byteSource33 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata34 = pcxImageParser29.getMetadata(byteSource33);
        boolean boolean36 = pcxImageParser29.canAcceptExtension("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters37 = pcxImageParser29.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata38 = pcxImageParser25.getMetadata(byteSource28, pcxImagingParameters37);
        byte[] byteArray39 = pcxImageParser11.getIccProfileBytes(byteSource24, pcxImagingParameters37);
        org.apache.commons.imaging.bytesource.ByteSource byteSource40 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance41 = pcxImageParser11.getFormatCompliance(byteSource40);
        org.apache.commons.imaging.bytesource.ByteSource byteSource42 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser43 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource44 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters45 = null;
        byte[] byteArray46 = pcxImageParser43.getIccProfileBytes(byteSource44, pcxImagingParameters45);
        java.nio.ByteOrder byteOrder47 = pcxImageParser43.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource48 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser49 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder50 = pcxImageParser49.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource51 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance52 = pcxImageParser49.getFormatCompliance(byteSource51);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters53 = pcxImageParser49.getDefaultParameters();
        org.apache.commons.imaging.ImageFormat imageFormat54 = null;
        boolean boolean55 = pcxImageParser49.canAcceptType(imageFormat54);
        java.lang.String str56 = pcxImageParser49.getDefaultExtension();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters57 = pcxImageParser49.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata58 = pcxImageParser43.getMetadata(byteSource48, pcxImagingParameters57);
        byte[] byteArray59 = pcxImageParser11.getIccProfileBytes(byteSource42, pcxImagingParameters57);
        org.apache.commons.imaging.common.ImageMetadata imageMetadata60 = pcxImageParser0.getMetadata(byteSource10, pcxImagingParameters57);
        org.apache.commons.imaging.ImageFormat imageFormat61 = null;
        boolean boolean62 = pcxImageParser0.canAcceptType(imageFormat61);
        org.apache.commons.imaging.bytesource.ByteSource byteSource63 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser64 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.lang.String str65 = pcxImageParser64.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource66 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance67 = pcxImageParser64.getFormatCompliance(byteSource66);
        boolean boolean69 = pcxImageParser64.canAcceptExtension("");
        org.apache.commons.imaging.bytesource.ByteSource byteSource70 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance71 = pcxImageParser64.getFormatCompliance(byteSource70);
        org.apache.commons.imaging.bytesource.ByteSource byteSource72 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser73 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource74 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata75 = pcxImageParser73.getMetadata(byteSource74);
        org.apache.commons.imaging.bytesource.ByteSource byteSource76 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser77 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder78 = pcxImageParser77.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource79 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance80 = pcxImageParser77.getFormatCompliance(byteSource79);
        org.apache.commons.imaging.bytesource.ByteSource byteSource81 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata82 = pcxImageParser77.getMetadata(byteSource81);
        boolean boolean84 = pcxImageParser77.canAcceptExtension("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters85 = pcxImageParser77.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata86 = pcxImageParser73.getMetadata(byteSource76, pcxImagingParameters85);
        byte[] byteArray87 = pcxImageParser64.getIccProfileBytes(byteSource72, pcxImagingParameters85);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters88 = pcxImageParser64.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata89 = pcxImageParser0.getMetadata(byteSource63, pcxImagingParameters88);
        org.apache.commons.imaging.bytesource.ByteSource byteSource90 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance91 = pcxImageParser0.getFormatCompliance(byteSource90);
        org.apache.commons.imaging.bytesource.ByteSource byteSource92 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.awt.image.BufferedImage> bufferedImageList93 = pcxImageParser0.getAllBufferedImages(byteSource92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Pcx-Custom" + "'", str4, "Pcx-Custom");
        org.junit.Assert.assertNull(imageMetadata6);
        org.junit.Assert.assertNull(formatCompliance8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(byteArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Pcx-Custom" + "'", str15, "Pcx-Custom");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pcx-Custom" + "'", str16, "Pcx-Custom");
        org.junit.Assert.assertNotNull(byteOrder19);
        org.junit.Assert.assertNull(formatCompliance21);
        org.junit.Assert.assertNotNull(pcxImagingParameters22);
        org.junit.Assert.assertNull(imageMetadata23);
        org.junit.Assert.assertNull(imageMetadata27);
        org.junit.Assert.assertNotNull(byteOrder30);
        org.junit.Assert.assertNull(formatCompliance32);
        org.junit.Assert.assertNull(imageMetadata34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters37);
        org.junit.Assert.assertNull(imageMetadata38);
        org.junit.Assert.assertNull(byteArray39);
        org.junit.Assert.assertNull(formatCompliance41);
        org.junit.Assert.assertNull(byteArray46);
        org.junit.Assert.assertNotNull(byteOrder47);
        org.junit.Assert.assertNotNull(byteOrder50);
        org.junit.Assert.assertNull(formatCompliance52);
        org.junit.Assert.assertNotNull(pcxImagingParameters53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "pcx" + "'", str56, "pcx");
        org.junit.Assert.assertNotNull(pcxImagingParameters57);
        org.junit.Assert.assertNull(imageMetadata58);
        org.junit.Assert.assertNull(byteArray59);
        org.junit.Assert.assertNull(imageMetadata60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Pcx-Custom" + "'", str65, "Pcx-Custom");
        org.junit.Assert.assertNull(formatCompliance67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(formatCompliance71);
        org.junit.Assert.assertNull(imageMetadata75);
        org.junit.Assert.assertNotNull(byteOrder78);
        org.junit.Assert.assertNull(formatCompliance80);
        org.junit.Assert.assertNull(imageMetadata82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters85);
        org.junit.Assert.assertNull(imageMetadata86);
        org.junit.Assert.assertNull(byteArray87);
        org.junit.Assert.assertNotNull(pcxImagingParameters88);
        org.junit.Assert.assertNull(imageMetadata89);
        org.junit.Assert.assertNull(formatCompliance91);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser0 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.lang.String str1 = pcxImageParser0.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource2 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance3 = pcxImageParser0.getFormatCompliance(byteSource2);
        org.apache.commons.imaging.bytesource.ByteSource byteSource4 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata5 = pcxImageParser0.getMetadata(byteSource4);
        java.nio.ByteOrder byteOrder6 = pcxImageParser0.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = null;
        byte[] byteArray9 = pcxImageParser0.getIccProfileBytes(byteSource7, pcxImagingParameters8);
        org.apache.commons.imaging.bytesource.ByteSource byteSource10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser11 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = null;
        byte[] byteArray14 = pcxImageParser11.getIccProfileBytes(byteSource12, pcxImagingParameters13);
        java.lang.String str15 = pcxImageParser11.getName();
        java.lang.String str16 = pcxImageParser11.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource17 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser18 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder19 = pcxImageParser18.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource20 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance21 = pcxImageParser18.getFormatCompliance(byteSource20);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters22 = pcxImageParser18.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata23 = pcxImageParser11.getMetadata(byteSource17, pcxImagingParameters22);
        org.apache.commons.imaging.bytesource.ByteSource byteSource24 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser25 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource26 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters27 = null;
        byte[] byteArray28 = pcxImageParser25.getIccProfileBytes(byteSource26, pcxImagingParameters27);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters29 = pcxImageParser25.getDefaultParameters();
        byte[] byteArray30 = pcxImageParser11.getIccProfileBytes(byteSource24, pcxImagingParameters29);
        org.apache.commons.imaging.bytesource.ByteSource byteSource31 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser32 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder33 = pcxImageParser32.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource34 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance35 = pcxImageParser32.getFormatCompliance(byteSource34);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters36 = pcxImageParser32.getDefaultParameters();
        org.apache.commons.imaging.ImageFormat imageFormat37 = null;
        boolean boolean38 = pcxImageParser32.canAcceptType(imageFormat37);
        java.lang.String str39 = pcxImageParser32.getDefaultExtension();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters40 = pcxImageParser32.getDefaultParameters();
        java.lang.String str41 = pcxImageParser32.getName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters42 = pcxImageParser32.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata43 = pcxImageParser11.getMetadata(byteSource31, pcxImagingParameters42);
        byte[] byteArray44 = pcxImageParser0.getIccProfileBytes(byteSource10, pcxImagingParameters42);
        java.nio.ByteOrder byteOrder45 = pcxImageParser0.getByteOrder();
        java.io.File file46 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.awt.image.BufferedImage> bufferedImageList47 = pcxImageParser0.getAllBufferedImages(file46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Pcx-Custom" + "'", str1, "Pcx-Custom");
        org.junit.Assert.assertNull(formatCompliance3);
        org.junit.Assert.assertNull(imageMetadata5);
        org.junit.Assert.assertNotNull(byteOrder6);
        org.junit.Assert.assertNull(byteArray9);
        org.junit.Assert.assertNull(byteArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Pcx-Custom" + "'", str15, "Pcx-Custom");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pcx-Custom" + "'", str16, "Pcx-Custom");
        org.junit.Assert.assertNotNull(byteOrder19);
        org.junit.Assert.assertNull(formatCompliance21);
        org.junit.Assert.assertNotNull(pcxImagingParameters22);
        org.junit.Assert.assertNull(imageMetadata23);
        org.junit.Assert.assertNull(byteArray28);
        org.junit.Assert.assertNotNull(pcxImagingParameters29);
        org.junit.Assert.assertNull(byteArray30);
        org.junit.Assert.assertNotNull(byteOrder33);
        org.junit.Assert.assertNull(formatCompliance35);
        org.junit.Assert.assertNotNull(pcxImagingParameters36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "pcx" + "'", str39, "pcx");
        org.junit.Assert.assertNotNull(pcxImagingParameters40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Pcx-Custom" + "'", str41, "Pcx-Custom");
        org.junit.Assert.assertNotNull(pcxImagingParameters42);
        org.junit.Assert.assertNull(imageMetadata43);
        org.junit.Assert.assertNull(byteArray44);
        org.junit.Assert.assertNotNull(byteOrder45);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser0 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.lang.String str1 = pcxImageParser0.getName();
        org.apache.commons.imaging.ImageFormat imageFormat2 = null;
        boolean boolean3 = pcxImageParser0.canAcceptType(imageFormat2);
        org.apache.commons.imaging.ImageFormat imageFormat4 = null;
        boolean boolean5 = pcxImageParser0.canAcceptType(imageFormat4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImageParser0.getDefaultParameters();
        org.apache.commons.imaging.bytesource.ByteSource byteSource7 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance8 = pcxImageParser0.getFormatCompliance(byteSource7);
        java.io.File file9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser10 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = null;
        byte[] byteArray13 = pcxImageParser10.getIccProfileBytes(byteSource11, pcxImagingParameters12);
        java.nio.ByteOrder byteOrder14 = pcxImageParser10.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource15 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance16 = pcxImageParser10.getFormatCompliance(byteSource15);
        org.apache.commons.imaging.bytesource.ByteSource byteSource17 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser18 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource19 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = null;
        byte[] byteArray21 = pcxImageParser18.getIccProfileBytes(byteSource19, pcxImagingParameters20);
        java.lang.String str22 = pcxImageParser18.getName();
        java.lang.String str23 = pcxImageParser18.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource24 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser25 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder26 = pcxImageParser25.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource27 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance28 = pcxImageParser25.getFormatCompliance(byteSource27);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters29 = pcxImageParser25.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata30 = pcxImageParser18.getMetadata(byteSource24, pcxImagingParameters29);
        org.apache.commons.imaging.bytesource.ByteSource byteSource31 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser32 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource33 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata34 = pcxImageParser32.getMetadata(byteSource33);
        org.apache.commons.imaging.bytesource.ByteSource byteSource35 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser36 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder37 = pcxImageParser36.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource38 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance39 = pcxImageParser36.getFormatCompliance(byteSource38);
        org.apache.commons.imaging.bytesource.ByteSource byteSource40 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata41 = pcxImageParser36.getMetadata(byteSource40);
        boolean boolean43 = pcxImageParser36.canAcceptExtension("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters44 = pcxImageParser36.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata45 = pcxImageParser32.getMetadata(byteSource35, pcxImagingParameters44);
        byte[] byteArray46 = pcxImageParser18.getIccProfileBytes(byteSource31, pcxImagingParameters44);
        org.apache.commons.imaging.ImageFormat imageFormat47 = null;
        boolean boolean48 = pcxImageParser18.canAcceptType(imageFormat47);
        org.apache.commons.imaging.bytesource.ByteSource byteSource49 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance50 = pcxImageParser18.getFormatCompliance(byteSource49);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters51 = pcxImageParser18.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata52 = pcxImageParser10.getMetadata(byteSource17, pcxImagingParameters51);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.ImageMetadata imageMetadata53 = pcxImageParser0.getMetadata(file9, pcxImagingParameters51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Pcx-Custom" + "'", str1, "Pcx-Custom");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(formatCompliance8);
        org.junit.Assert.assertNull(byteArray13);
        org.junit.Assert.assertNotNull(byteOrder14);
        org.junit.Assert.assertNull(formatCompliance16);
        org.junit.Assert.assertNull(byteArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Pcx-Custom" + "'", str22, "Pcx-Custom");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Pcx-Custom" + "'", str23, "Pcx-Custom");
        org.junit.Assert.assertNotNull(byteOrder26);
        org.junit.Assert.assertNull(formatCompliance28);
        org.junit.Assert.assertNotNull(pcxImagingParameters29);
        org.junit.Assert.assertNull(imageMetadata30);
        org.junit.Assert.assertNull(imageMetadata34);
        org.junit.Assert.assertNotNull(byteOrder37);
        org.junit.Assert.assertNull(formatCompliance39);
        org.junit.Assert.assertNull(imageMetadata41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters44);
        org.junit.Assert.assertNull(imageMetadata45);
        org.junit.Assert.assertNull(byteArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(formatCompliance50);
        org.junit.Assert.assertNotNull(pcxImagingParameters51);
        org.junit.Assert.assertNull(imageMetadata52);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser0 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder1 = pcxImageParser0.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource2 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance3 = pcxImageParser0.getFormatCompliance(byteSource2);
        org.apache.commons.imaging.bytesource.ByteSource byteSource4 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata5 = pcxImageParser0.getMetadata(byteSource4);
        java.nio.ByteOrder byteOrder6 = pcxImageParser0.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser8 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder9 = pcxImageParser8.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource10 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance11 = pcxImageParser8.getFormatCompliance(byteSource10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImageParser8.getDefaultParameters();
        java.lang.String str13 = pcxImageParser8.getDefaultExtension();
        org.apache.commons.imaging.bytesource.ByteSource byteSource14 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata15 = pcxImageParser8.getMetadata(byteSource14);
        boolean boolean17 = pcxImageParser8.canAcceptExtension("");
        boolean boolean19 = pcxImageParser8.canAcceptExtension("hi!");
        org.apache.commons.imaging.bytesource.ByteSource byteSource20 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser21 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource22 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters23 = null;
        byte[] byteArray24 = pcxImageParser21.getIccProfileBytes(byteSource22, pcxImagingParameters23);
        java.lang.String str25 = pcxImageParser21.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource26 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata27 = pcxImageParser21.getMetadata(byteSource26);
        org.apache.commons.imaging.bytesource.ByteSource byteSource28 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance29 = pcxImageParser21.getFormatCompliance(byteSource28);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters30 = pcxImageParser21.getDefaultParameters();
        org.apache.commons.imaging.bytesource.ByteSource byteSource31 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser32 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource33 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters34 = null;
        byte[] byteArray35 = pcxImageParser32.getIccProfileBytes(byteSource33, pcxImagingParameters34);
        java.lang.String str36 = pcxImageParser32.getName();
        java.lang.String str37 = pcxImageParser32.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource38 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser39 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder40 = pcxImageParser39.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource41 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance42 = pcxImageParser39.getFormatCompliance(byteSource41);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters43 = pcxImageParser39.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata44 = pcxImageParser32.getMetadata(byteSource38, pcxImagingParameters43);
        org.apache.commons.imaging.bytesource.ByteSource byteSource45 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser46 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource47 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata48 = pcxImageParser46.getMetadata(byteSource47);
        org.apache.commons.imaging.bytesource.ByteSource byteSource49 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser50 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder51 = pcxImageParser50.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource52 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance53 = pcxImageParser50.getFormatCompliance(byteSource52);
        org.apache.commons.imaging.bytesource.ByteSource byteSource54 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata55 = pcxImageParser50.getMetadata(byteSource54);
        boolean boolean57 = pcxImageParser50.canAcceptExtension("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters58 = pcxImageParser50.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata59 = pcxImageParser46.getMetadata(byteSource49, pcxImagingParameters58);
        byte[] byteArray60 = pcxImageParser32.getIccProfileBytes(byteSource45, pcxImagingParameters58);
        org.apache.commons.imaging.bytesource.ByteSource byteSource61 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance62 = pcxImageParser32.getFormatCompliance(byteSource61);
        org.apache.commons.imaging.bytesource.ByteSource byteSource63 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser64 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource65 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters66 = null;
        byte[] byteArray67 = pcxImageParser64.getIccProfileBytes(byteSource65, pcxImagingParameters66);
        java.nio.ByteOrder byteOrder68 = pcxImageParser64.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource69 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser70 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder71 = pcxImageParser70.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource72 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance73 = pcxImageParser70.getFormatCompliance(byteSource72);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters74 = pcxImageParser70.getDefaultParameters();
        org.apache.commons.imaging.ImageFormat imageFormat75 = null;
        boolean boolean76 = pcxImageParser70.canAcceptType(imageFormat75);
        java.lang.String str77 = pcxImageParser70.getDefaultExtension();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters78 = pcxImageParser70.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata79 = pcxImageParser64.getMetadata(byteSource69, pcxImagingParameters78);
        byte[] byteArray80 = pcxImageParser32.getIccProfileBytes(byteSource63, pcxImagingParameters78);
        org.apache.commons.imaging.common.ImageMetadata imageMetadata81 = pcxImageParser21.getMetadata(byteSource31, pcxImagingParameters78);
        byte[] byteArray82 = pcxImageParser8.getIccProfileBytes(byteSource20, pcxImagingParameters78);
        byte[] byteArray83 = pcxImageParser0.getIccProfileBytes(byteSource7, pcxImagingParameters78);
        org.apache.commons.imaging.bytesource.ByteSource byteSource84 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance85 = pcxImageParser0.getFormatCompliance(byteSource84);
        org.apache.commons.imaging.ImageFormat imageFormat86 = null;
        boolean boolean87 = pcxImageParser0.canAcceptType(imageFormat86);
        org.apache.commons.imaging.bytesource.ByteSource byteSource88 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata89 = pcxImageParser0.getMetadata(byteSource88);
        java.io.PrintWriter printWriter90 = null;
        org.apache.commons.imaging.bytesource.ByteSource byteSource91 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean92 = pcxImageParser0.dumpImageFile(printWriter90, byteSource91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder1);
        org.junit.Assert.assertNull(formatCompliance3);
        org.junit.Assert.assertNull(imageMetadata5);
        org.junit.Assert.assertNotNull(byteOrder6);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNull(formatCompliance11);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "pcx" + "'", str13, "pcx");
        org.junit.Assert.assertNull(imageMetadata15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(byteArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Pcx-Custom" + "'", str25, "Pcx-Custom");
        org.junit.Assert.assertNull(imageMetadata27);
        org.junit.Assert.assertNull(formatCompliance29);
        org.junit.Assert.assertNotNull(pcxImagingParameters30);
        org.junit.Assert.assertNull(byteArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Pcx-Custom" + "'", str36, "Pcx-Custom");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Pcx-Custom" + "'", str37, "Pcx-Custom");
        org.junit.Assert.assertNotNull(byteOrder40);
        org.junit.Assert.assertNull(formatCompliance42);
        org.junit.Assert.assertNotNull(pcxImagingParameters43);
        org.junit.Assert.assertNull(imageMetadata44);
        org.junit.Assert.assertNull(imageMetadata48);
        org.junit.Assert.assertNotNull(byteOrder51);
        org.junit.Assert.assertNull(formatCompliance53);
        org.junit.Assert.assertNull(imageMetadata55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters58);
        org.junit.Assert.assertNull(imageMetadata59);
        org.junit.Assert.assertNull(byteArray60);
        org.junit.Assert.assertNull(formatCompliance62);
        org.junit.Assert.assertNull(byteArray67);
        org.junit.Assert.assertNotNull(byteOrder68);
        org.junit.Assert.assertNotNull(byteOrder71);
        org.junit.Assert.assertNull(formatCompliance73);
        org.junit.Assert.assertNotNull(pcxImagingParameters74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "pcx" + "'", str77, "pcx");
        org.junit.Assert.assertNotNull(pcxImagingParameters78);
        org.junit.Assert.assertNull(imageMetadata79);
        org.junit.Assert.assertNull(byteArray80);
        org.junit.Assert.assertNull(imageMetadata81);
        org.junit.Assert.assertNull(byteArray82);
        org.junit.Assert.assertNull(byteArray83);
        org.junit.Assert.assertNull(formatCompliance85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNull(imageMetadata89);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser0 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.lang.String str1 = pcxImageParser0.getName();
        java.io.File file2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.awt.image.BufferedImage> bufferedImageList3 = pcxImageParser0.getAllBufferedImages(file2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Pcx-Custom" + "'", str1, "Pcx-Custom");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser0 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder1 = pcxImageParser0.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource2 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance3 = pcxImageParser0.getFormatCompliance(byteSource2);
        org.apache.commons.imaging.bytesource.ByteSource byteSource4 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata5 = pcxImageParser0.getMetadata(byteSource4);
        boolean boolean7 = pcxImageParser0.canAcceptExtension("hi!");
        org.apache.commons.imaging.ImageFormat imageFormat8 = null;
        boolean boolean9 = pcxImageParser0.canAcceptType(imageFormat8);
        org.apache.commons.imaging.bytesource.ByteSource byteSource10 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance11 = pcxImageParser0.getFormatCompliance(byteSource10);
        java.lang.String str12 = pcxImageParser0.getDefaultExtension();
        java.lang.String str13 = pcxImageParser0.getName();
        org.junit.Assert.assertNotNull(byteOrder1);
        org.junit.Assert.assertNull(formatCompliance3);
        org.junit.Assert.assertNull(imageMetadata5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(formatCompliance11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "pcx" + "'", str12, "pcx");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pcx-Custom" + "'", str13, "Pcx-Custom");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser0 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource1 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = null;
        byte[] byteArray3 = pcxImageParser0.getIccProfileBytes(byteSource1, pcxImagingParameters2);
        java.lang.String str4 = pcxImageParser0.getName();
        java.lang.String str5 = pcxImageParser0.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser7 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder8 = pcxImageParser7.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource9 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance10 = pcxImageParser7.getFormatCompliance(byteSource9);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImageParser7.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata12 = pcxImageParser0.getMetadata(byteSource6, pcxImagingParameters11);
        org.apache.commons.imaging.bytesource.ByteSource byteSource13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser14 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource15 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata16 = pcxImageParser14.getMetadata(byteSource15);
        org.apache.commons.imaging.bytesource.ByteSource byteSource17 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser18 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder19 = pcxImageParser18.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource20 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance21 = pcxImageParser18.getFormatCompliance(byteSource20);
        org.apache.commons.imaging.bytesource.ByteSource byteSource22 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata23 = pcxImageParser18.getMetadata(byteSource22);
        boolean boolean25 = pcxImageParser18.canAcceptExtension("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters26 = pcxImageParser18.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata27 = pcxImageParser14.getMetadata(byteSource17, pcxImagingParameters26);
        byte[] byteArray28 = pcxImageParser0.getIccProfileBytes(byteSource13, pcxImagingParameters26);
        java.nio.ByteOrder byteOrder29 = pcxImageParser0.getByteOrder();
        java.lang.String str30 = pcxImageParser0.getName();
        org.apache.commons.imaging.ImageFormat imageFormat31 = null;
        boolean boolean32 = pcxImageParser0.canAcceptType(imageFormat31);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Pcx-Custom" + "'", str4, "Pcx-Custom");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pcx-Custom" + "'", str5, "Pcx-Custom");
        org.junit.Assert.assertNotNull(byteOrder8);
        org.junit.Assert.assertNull(formatCompliance10);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(imageMetadata12);
        org.junit.Assert.assertNull(imageMetadata16);
        org.junit.Assert.assertNotNull(byteOrder19);
        org.junit.Assert.assertNull(formatCompliance21);
        org.junit.Assert.assertNull(imageMetadata23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters26);
        org.junit.Assert.assertNull(imageMetadata27);
        org.junit.Assert.assertNull(byteArray28);
        org.junit.Assert.assertNotNull(byteOrder29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Pcx-Custom" + "'", str30, "Pcx-Custom");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser0 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource1 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = null;
        byte[] byteArray3 = pcxImageParser0.getIccProfileBytes(byteSource1, pcxImagingParameters2);
        java.lang.String str4 = pcxImageParser0.getName();
        java.lang.String str5 = pcxImageParser0.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser7 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder8 = pcxImageParser7.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource9 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance10 = pcxImageParser7.getFormatCompliance(byteSource9);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImageParser7.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata12 = pcxImageParser0.getMetadata(byteSource6, pcxImagingParameters11);
        boolean boolean14 = pcxImageParser0.canAcceptExtension("hi!");
        org.apache.commons.imaging.bytesource.ByteSource byteSource15 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance16 = pcxImageParser0.getFormatCompliance(byteSource15);
        org.apache.commons.imaging.bytesource.ByteSource byteSource17 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance18 = pcxImageParser0.getFormatCompliance(byteSource17);
        org.apache.commons.imaging.ImageFormat imageFormat19 = null;
        boolean boolean20 = pcxImageParser0.canAcceptType(imageFormat19);
        org.apache.commons.imaging.bytesource.ByteSource byteSource21 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser22 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder23 = pcxImageParser22.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource24 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance25 = pcxImageParser22.getFormatCompliance(byteSource24);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters26 = pcxImageParser22.getDefaultParameters();
        java.lang.String str27 = pcxImageParser22.getDefaultExtension();
        org.apache.commons.imaging.bytesource.ByteSource byteSource28 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata29 = pcxImageParser22.getMetadata(byteSource28);
        boolean boolean31 = pcxImageParser22.canAcceptExtension("");
        boolean boolean33 = pcxImageParser22.canAcceptExtension("hi!");
        org.apache.commons.imaging.bytesource.ByteSource byteSource34 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser35 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource36 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters37 = null;
        byte[] byteArray38 = pcxImageParser35.getIccProfileBytes(byteSource36, pcxImagingParameters37);
        java.lang.String str39 = pcxImageParser35.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource40 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata41 = pcxImageParser35.getMetadata(byteSource40);
        org.apache.commons.imaging.bytesource.ByteSource byteSource42 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance43 = pcxImageParser35.getFormatCompliance(byteSource42);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters44 = pcxImageParser35.getDefaultParameters();
        org.apache.commons.imaging.bytesource.ByteSource byteSource45 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser46 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource47 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters48 = null;
        byte[] byteArray49 = pcxImageParser46.getIccProfileBytes(byteSource47, pcxImagingParameters48);
        java.lang.String str50 = pcxImageParser46.getName();
        java.lang.String str51 = pcxImageParser46.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource52 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser53 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder54 = pcxImageParser53.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource55 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance56 = pcxImageParser53.getFormatCompliance(byteSource55);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters57 = pcxImageParser53.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata58 = pcxImageParser46.getMetadata(byteSource52, pcxImagingParameters57);
        org.apache.commons.imaging.bytesource.ByteSource byteSource59 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser60 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource61 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata62 = pcxImageParser60.getMetadata(byteSource61);
        org.apache.commons.imaging.bytesource.ByteSource byteSource63 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser64 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder65 = pcxImageParser64.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource66 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance67 = pcxImageParser64.getFormatCompliance(byteSource66);
        org.apache.commons.imaging.bytesource.ByteSource byteSource68 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata69 = pcxImageParser64.getMetadata(byteSource68);
        boolean boolean71 = pcxImageParser64.canAcceptExtension("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters72 = pcxImageParser64.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata73 = pcxImageParser60.getMetadata(byteSource63, pcxImagingParameters72);
        byte[] byteArray74 = pcxImageParser46.getIccProfileBytes(byteSource59, pcxImagingParameters72);
        org.apache.commons.imaging.bytesource.ByteSource byteSource75 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance76 = pcxImageParser46.getFormatCompliance(byteSource75);
        org.apache.commons.imaging.bytesource.ByteSource byteSource77 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser78 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource79 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters80 = null;
        byte[] byteArray81 = pcxImageParser78.getIccProfileBytes(byteSource79, pcxImagingParameters80);
        java.nio.ByteOrder byteOrder82 = pcxImageParser78.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource83 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser84 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder85 = pcxImageParser84.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource86 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance87 = pcxImageParser84.getFormatCompliance(byteSource86);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters88 = pcxImageParser84.getDefaultParameters();
        org.apache.commons.imaging.ImageFormat imageFormat89 = null;
        boolean boolean90 = pcxImageParser84.canAcceptType(imageFormat89);
        java.lang.String str91 = pcxImageParser84.getDefaultExtension();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters92 = pcxImageParser84.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata93 = pcxImageParser78.getMetadata(byteSource83, pcxImagingParameters92);
        byte[] byteArray94 = pcxImageParser46.getIccProfileBytes(byteSource77, pcxImagingParameters92);
        org.apache.commons.imaging.common.ImageMetadata imageMetadata95 = pcxImageParser35.getMetadata(byteSource45, pcxImagingParameters92);
        byte[] byteArray96 = pcxImageParser22.getIccProfileBytes(byteSource34, pcxImagingParameters92);
        org.apache.commons.imaging.common.ImageMetadata imageMetadata97 = pcxImageParser0.getMetadata(byteSource21, pcxImagingParameters92);
        org.apache.commons.imaging.bytesource.ByteSource byteSource98 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance99 = pcxImageParser0.getFormatCompliance(byteSource98);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Pcx-Custom" + "'", str4, "Pcx-Custom");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pcx-Custom" + "'", str5, "Pcx-Custom");
        org.junit.Assert.assertNotNull(byteOrder8);
        org.junit.Assert.assertNull(formatCompliance10);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(imageMetadata12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(formatCompliance16);
        org.junit.Assert.assertNull(formatCompliance18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteOrder23);
        org.junit.Assert.assertNull(formatCompliance25);
        org.junit.Assert.assertNotNull(pcxImagingParameters26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "pcx" + "'", str27, "pcx");
        org.junit.Assert.assertNull(imageMetadata29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(byteArray38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Pcx-Custom" + "'", str39, "Pcx-Custom");
        org.junit.Assert.assertNull(imageMetadata41);
        org.junit.Assert.assertNull(formatCompliance43);
        org.junit.Assert.assertNotNull(pcxImagingParameters44);
        org.junit.Assert.assertNull(byteArray49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Pcx-Custom" + "'", str50, "Pcx-Custom");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Pcx-Custom" + "'", str51, "Pcx-Custom");
        org.junit.Assert.assertNotNull(byteOrder54);
        org.junit.Assert.assertNull(formatCompliance56);
        org.junit.Assert.assertNotNull(pcxImagingParameters57);
        org.junit.Assert.assertNull(imageMetadata58);
        org.junit.Assert.assertNull(imageMetadata62);
        org.junit.Assert.assertNotNull(byteOrder65);
        org.junit.Assert.assertNull(formatCompliance67);
        org.junit.Assert.assertNull(imageMetadata69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters72);
        org.junit.Assert.assertNull(imageMetadata73);
        org.junit.Assert.assertNull(byteArray74);
        org.junit.Assert.assertNull(formatCompliance76);
        org.junit.Assert.assertNull(byteArray81);
        org.junit.Assert.assertNotNull(byteOrder82);
        org.junit.Assert.assertNotNull(byteOrder85);
        org.junit.Assert.assertNull(formatCompliance87);
        org.junit.Assert.assertNotNull(pcxImagingParameters88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "pcx" + "'", str91, "pcx");
        org.junit.Assert.assertNotNull(pcxImagingParameters92);
        org.junit.Assert.assertNull(imageMetadata93);
        org.junit.Assert.assertNull(byteArray94);
        org.junit.Assert.assertNull(imageMetadata95);
        org.junit.Assert.assertNull(byteArray96);
        org.junit.Assert.assertNull(imageMetadata97);
        org.junit.Assert.assertNull(formatCompliance99);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser0 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource1 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = null;
        byte[] byteArray3 = pcxImageParser0.getIccProfileBytes(byteSource1, pcxImagingParameters2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImageParser0.getDefaultParameters();
        java.lang.String str5 = pcxImageParser0.getName();
        java.awt.image.BufferedImage bufferedImage6 = null;
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser8 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder9 = pcxImageParser8.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource10 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance11 = pcxImageParser8.getFormatCompliance(byteSource10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImageParser8.getDefaultParameters();
        org.apache.commons.imaging.bytesource.ByteSource byteSource13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser14 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource15 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata16 = pcxImageParser14.getMetadata(byteSource15);
        org.apache.commons.imaging.bytesource.ByteSource byteSource17 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser18 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder19 = pcxImageParser18.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource20 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance21 = pcxImageParser18.getFormatCompliance(byteSource20);
        org.apache.commons.imaging.bytesource.ByteSource byteSource22 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata23 = pcxImageParser18.getMetadata(byteSource22);
        boolean boolean25 = pcxImageParser18.canAcceptExtension("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters26 = pcxImageParser18.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata27 = pcxImageParser14.getMetadata(byteSource17, pcxImagingParameters26);
        byte[] byteArray28 = pcxImageParser8.getIccProfileBytes(byteSource13, pcxImagingParameters26);
        java.lang.String str29 = pcxImageParser8.getDefaultExtension();
        org.apache.commons.imaging.bytesource.ByteSource byteSource30 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata31 = pcxImageParser8.getMetadata(byteSource30);
        boolean boolean33 = pcxImageParser8.canAcceptExtension("Pcx-Custom");
        org.apache.commons.imaging.ImageFormat imageFormat34 = null;
        boolean boolean35 = pcxImageParser8.canAcceptType(imageFormat34);
        org.apache.commons.imaging.bytesource.ByteSource byteSource36 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser37 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder38 = pcxImageParser37.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource39 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance40 = pcxImageParser37.getFormatCompliance(byteSource39);
        org.apache.commons.imaging.bytesource.ByteSource byteSource41 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata42 = pcxImageParser37.getMetadata(byteSource41);
        boolean boolean44 = pcxImageParser37.canAcceptExtension("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters45 = pcxImageParser37.getDefaultParameters();
        org.apache.commons.imaging.bytesource.ByteSource byteSource46 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser47 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource48 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters49 = null;
        byte[] byteArray50 = pcxImageParser47.getIccProfileBytes(byteSource48, pcxImagingParameters49);
        java.lang.String str51 = pcxImageParser47.getName();
        java.lang.String str52 = pcxImageParser47.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource53 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance54 = pcxImageParser47.getFormatCompliance(byteSource53);
        org.apache.commons.imaging.bytesource.ByteSource byteSource55 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser56 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder57 = pcxImageParser56.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource58 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance59 = pcxImageParser56.getFormatCompliance(byteSource58);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters60 = pcxImageParser56.getDefaultParameters();
        org.apache.commons.imaging.ImageFormat imageFormat61 = null;
        boolean boolean62 = pcxImageParser56.canAcceptType(imageFormat61);
        java.lang.String str63 = pcxImageParser56.getDefaultExtension();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters64 = pcxImageParser56.getDefaultParameters();
        byte[] byteArray65 = pcxImageParser47.getIccProfileBytes(byteSource55, pcxImagingParameters64);
        byte[] byteArray66 = pcxImageParser37.getIccProfileBytes(byteSource46, pcxImagingParameters64);
        byte[] byteArray67 = pcxImageParser8.getIccProfileBytes(byteSource36, pcxImagingParameters64);
        // The following exception was thrown during execution in test generation
        try {
            pcxImageParser0.writeImage(bufferedImage6, outputStream7, pcxImagingParameters64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pcx-Custom" + "'", str5, "Pcx-Custom");
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNull(formatCompliance11);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNull(imageMetadata16);
        org.junit.Assert.assertNotNull(byteOrder19);
        org.junit.Assert.assertNull(formatCompliance21);
        org.junit.Assert.assertNull(imageMetadata23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters26);
        org.junit.Assert.assertNull(imageMetadata27);
        org.junit.Assert.assertNull(byteArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "pcx" + "'", str29, "pcx");
        org.junit.Assert.assertNull(imageMetadata31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(byteOrder38);
        org.junit.Assert.assertNull(formatCompliance40);
        org.junit.Assert.assertNull(imageMetadata42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters45);
        org.junit.Assert.assertNull(byteArray50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Pcx-Custom" + "'", str51, "Pcx-Custom");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Pcx-Custom" + "'", str52, "Pcx-Custom");
        org.junit.Assert.assertNull(formatCompliance54);
        org.junit.Assert.assertNotNull(byteOrder57);
        org.junit.Assert.assertNull(formatCompliance59);
        org.junit.Assert.assertNotNull(pcxImagingParameters60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "pcx" + "'", str63, "pcx");
        org.junit.Assert.assertNotNull(pcxImagingParameters64);
        org.junit.Assert.assertNull(byteArray65);
        org.junit.Assert.assertNull(byteArray66);
        org.junit.Assert.assertNull(byteArray67);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser0 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource1 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata2 = pcxImageParser0.getMetadata(byteSource1);
        org.apache.commons.imaging.bytesource.ByteSource byteSource3 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata4 = pcxImageParser0.getMetadata(byteSource3);
        org.apache.commons.imaging.ImageFormat imageFormat5 = null;
        boolean boolean6 = pcxImageParser0.canAcceptType(imageFormat5);
        java.lang.String str7 = pcxImageParser0.getDefaultExtension();
        java.lang.String str8 = pcxImageParser0.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser10 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder11 = pcxImageParser10.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource12 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance13 = pcxImageParser10.getFormatCompliance(byteSource12);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImageParser10.getDefaultParameters();
        org.apache.commons.imaging.bytesource.ByteSource byteSource15 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser16 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource17 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata18 = pcxImageParser16.getMetadata(byteSource17);
        org.apache.commons.imaging.bytesource.ByteSource byteSource19 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser20 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder21 = pcxImageParser20.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource22 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance23 = pcxImageParser20.getFormatCompliance(byteSource22);
        org.apache.commons.imaging.bytesource.ByteSource byteSource24 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata25 = pcxImageParser20.getMetadata(byteSource24);
        boolean boolean27 = pcxImageParser20.canAcceptExtension("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters28 = pcxImageParser20.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata29 = pcxImageParser16.getMetadata(byteSource19, pcxImagingParameters28);
        byte[] byteArray30 = pcxImageParser10.getIccProfileBytes(byteSource15, pcxImagingParameters28);
        java.lang.String str31 = pcxImageParser10.getName();
        java.lang.String str32 = pcxImageParser10.getDefaultExtension();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters33 = pcxImageParser10.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata34 = pcxImageParser0.getMetadata(byteSource9, pcxImagingParameters33);
        org.apache.commons.imaging.bytesource.ByteSource byteSource35 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser36 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder37 = pcxImageParser36.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource38 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance39 = pcxImageParser36.getFormatCompliance(byteSource38);
        org.apache.commons.imaging.bytesource.ByteSource byteSource40 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata41 = pcxImageParser36.getMetadata(byteSource40);
        boolean boolean43 = pcxImageParser36.canAcceptExtension("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters44 = pcxImageParser36.getDefaultParameters();
        org.apache.commons.imaging.bytesource.ByteSource byteSource45 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser46 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource47 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters48 = null;
        byte[] byteArray49 = pcxImageParser46.getIccProfileBytes(byteSource47, pcxImagingParameters48);
        java.lang.String str50 = pcxImageParser46.getName();
        java.lang.String str51 = pcxImageParser46.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource52 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser53 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder54 = pcxImageParser53.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource55 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance56 = pcxImageParser53.getFormatCompliance(byteSource55);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters57 = pcxImageParser53.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata58 = pcxImageParser46.getMetadata(byteSource52, pcxImagingParameters57);
        java.lang.String str59 = pcxImageParser46.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource60 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata61 = pcxImageParser46.getMetadata(byteSource60);
        org.apache.commons.imaging.bytesource.ByteSource byteSource62 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser63 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource64 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters65 = null;
        byte[] byteArray66 = pcxImageParser63.getIccProfileBytes(byteSource64, pcxImagingParameters65);
        java.lang.String str67 = pcxImageParser63.getName();
        java.lang.String str68 = pcxImageParser63.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource69 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser70 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder71 = pcxImageParser70.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource72 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance73 = pcxImageParser70.getFormatCompliance(byteSource72);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters74 = pcxImageParser70.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata75 = pcxImageParser63.getMetadata(byteSource69, pcxImagingParameters74);
        org.apache.commons.imaging.bytesource.ByteSource byteSource76 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser77 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource78 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters79 = null;
        byte[] byteArray80 = pcxImageParser77.getIccProfileBytes(byteSource78, pcxImagingParameters79);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters81 = pcxImageParser77.getDefaultParameters();
        byte[] byteArray82 = pcxImageParser63.getIccProfileBytes(byteSource76, pcxImagingParameters81);
        byte[] byteArray83 = pcxImageParser46.getIccProfileBytes(byteSource62, pcxImagingParameters81);
        org.apache.commons.imaging.common.ImageMetadata imageMetadata84 = pcxImageParser36.getMetadata(byteSource45, pcxImagingParameters81);
        byte[] byteArray85 = pcxImageParser0.getIccProfileBytes(byteSource35, pcxImagingParameters81);
        org.junit.Assert.assertNull(imageMetadata2);
        org.junit.Assert.assertNull(imageMetadata4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "pcx" + "'", str7, "pcx");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Pcx-Custom" + "'", str8, "Pcx-Custom");
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertNull(formatCompliance13);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNull(imageMetadata18);
        org.junit.Assert.assertNotNull(byteOrder21);
        org.junit.Assert.assertNull(formatCompliance23);
        org.junit.Assert.assertNull(imageMetadata25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters28);
        org.junit.Assert.assertNull(imageMetadata29);
        org.junit.Assert.assertNull(byteArray30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Pcx-Custom" + "'", str31, "Pcx-Custom");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "pcx" + "'", str32, "pcx");
        org.junit.Assert.assertNotNull(pcxImagingParameters33);
        org.junit.Assert.assertNull(imageMetadata34);
        org.junit.Assert.assertNotNull(byteOrder37);
        org.junit.Assert.assertNull(formatCompliance39);
        org.junit.Assert.assertNull(imageMetadata41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters44);
        org.junit.Assert.assertNull(byteArray49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Pcx-Custom" + "'", str50, "Pcx-Custom");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Pcx-Custom" + "'", str51, "Pcx-Custom");
        org.junit.Assert.assertNotNull(byteOrder54);
        org.junit.Assert.assertNull(formatCompliance56);
        org.junit.Assert.assertNotNull(pcxImagingParameters57);
        org.junit.Assert.assertNull(imageMetadata58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Pcx-Custom" + "'", str59, "Pcx-Custom");
        org.junit.Assert.assertNull(imageMetadata61);
        org.junit.Assert.assertNull(byteArray66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Pcx-Custom" + "'", str67, "Pcx-Custom");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Pcx-Custom" + "'", str68, "Pcx-Custom");
        org.junit.Assert.assertNotNull(byteOrder71);
        org.junit.Assert.assertNull(formatCompliance73);
        org.junit.Assert.assertNotNull(pcxImagingParameters74);
        org.junit.Assert.assertNull(imageMetadata75);
        org.junit.Assert.assertNull(byteArray80);
        org.junit.Assert.assertNotNull(pcxImagingParameters81);
        org.junit.Assert.assertNull(byteArray82);
        org.junit.Assert.assertNull(byteArray83);
        org.junit.Assert.assertNull(imageMetadata84);
        org.junit.Assert.assertNull(byteArray85);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser0 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource1 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = null;
        byte[] byteArray3 = pcxImageParser0.getIccProfileBytes(byteSource1, pcxImagingParameters2);
        java.lang.String str4 = pcxImageParser0.getName();
        java.lang.String str5 = pcxImageParser0.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser7 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder8 = pcxImageParser7.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource9 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance10 = pcxImageParser7.getFormatCompliance(byteSource9);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImageParser7.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata12 = pcxImageParser0.getMetadata(byteSource6, pcxImagingParameters11);
        java.lang.String str13 = pcxImageParser0.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource14 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata15 = pcxImageParser0.getMetadata(byteSource14);
        org.apache.commons.imaging.bytesource.ByteSource byteSource16 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser17 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource18 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = null;
        byte[] byteArray20 = pcxImageParser17.getIccProfileBytes(byteSource18, pcxImagingParameters19);
        java.lang.String str21 = pcxImageParser17.getName();
        java.lang.String str22 = pcxImageParser17.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource23 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser24 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder25 = pcxImageParser24.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource26 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance27 = pcxImageParser24.getFormatCompliance(byteSource26);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters28 = pcxImageParser24.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata29 = pcxImageParser17.getMetadata(byteSource23, pcxImagingParameters28);
        org.apache.commons.imaging.bytesource.ByteSource byteSource30 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser31 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource32 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters33 = null;
        byte[] byteArray34 = pcxImageParser31.getIccProfileBytes(byteSource32, pcxImagingParameters33);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters35 = pcxImageParser31.getDefaultParameters();
        byte[] byteArray36 = pcxImageParser17.getIccProfileBytes(byteSource30, pcxImagingParameters35);
        byte[] byteArray37 = pcxImageParser0.getIccProfileBytes(byteSource16, pcxImagingParameters35);
        org.apache.commons.imaging.bytesource.ByteSource byteSource38 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance39 = pcxImageParser0.getFormatCompliance(byteSource38);
        java.nio.ByteOrder byteOrder40 = pcxImageParser0.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource41 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser42 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource43 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters44 = null;
        byte[] byteArray45 = pcxImageParser42.getIccProfileBytes(byteSource43, pcxImagingParameters44);
        java.lang.String str46 = pcxImageParser42.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource47 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata48 = pcxImageParser42.getMetadata(byteSource47);
        org.apache.commons.imaging.bytesource.ByteSource byteSource49 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance50 = pcxImageParser42.getFormatCompliance(byteSource49);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters51 = pcxImageParser42.getDefaultParameters();
        org.apache.commons.imaging.bytesource.ByteSource byteSource52 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser53 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder54 = pcxImageParser53.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource55 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance56 = pcxImageParser53.getFormatCompliance(byteSource55);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters57 = pcxImageParser53.getDefaultParameters();
        org.apache.commons.imaging.bytesource.ByteSource byteSource58 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser59 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource60 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata61 = pcxImageParser59.getMetadata(byteSource60);
        org.apache.commons.imaging.bytesource.ByteSource byteSource62 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser63 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder64 = pcxImageParser63.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource65 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance66 = pcxImageParser63.getFormatCompliance(byteSource65);
        org.apache.commons.imaging.bytesource.ByteSource byteSource67 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata68 = pcxImageParser63.getMetadata(byteSource67);
        boolean boolean70 = pcxImageParser63.canAcceptExtension("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters71 = pcxImageParser63.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata72 = pcxImageParser59.getMetadata(byteSource62, pcxImagingParameters71);
        byte[] byteArray73 = pcxImageParser53.getIccProfileBytes(byteSource58, pcxImagingParameters71);
        java.lang.String str74 = pcxImageParser53.getName();
        java.lang.String str75 = pcxImageParser53.getDefaultExtension();
        org.apache.commons.imaging.ImageFormat imageFormat76 = null;
        boolean boolean77 = pcxImageParser53.canAcceptType(imageFormat76);
        org.apache.commons.imaging.ImageFormat imageFormat78 = null;
        boolean boolean79 = pcxImageParser53.canAcceptType(imageFormat78);
        java.lang.String str80 = pcxImageParser53.getName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters81 = pcxImageParser53.getDefaultParameters();
        byte[] byteArray82 = pcxImageParser42.getIccProfileBytes(byteSource52, pcxImagingParameters81);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage83 = pcxImageParser0.getBufferedImage(byteSource41, pcxImagingParameters81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Pcx-Custom" + "'", str4, "Pcx-Custom");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pcx-Custom" + "'", str5, "Pcx-Custom");
        org.junit.Assert.assertNotNull(byteOrder8);
        org.junit.Assert.assertNull(formatCompliance10);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(imageMetadata12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pcx-Custom" + "'", str13, "Pcx-Custom");
        org.junit.Assert.assertNull(imageMetadata15);
        org.junit.Assert.assertNull(byteArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Pcx-Custom" + "'", str21, "Pcx-Custom");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Pcx-Custom" + "'", str22, "Pcx-Custom");
        org.junit.Assert.assertNotNull(byteOrder25);
        org.junit.Assert.assertNull(formatCompliance27);
        org.junit.Assert.assertNotNull(pcxImagingParameters28);
        org.junit.Assert.assertNull(imageMetadata29);
        org.junit.Assert.assertNull(byteArray34);
        org.junit.Assert.assertNotNull(pcxImagingParameters35);
        org.junit.Assert.assertNull(byteArray36);
        org.junit.Assert.assertNull(byteArray37);
        org.junit.Assert.assertNull(formatCompliance39);
        org.junit.Assert.assertNotNull(byteOrder40);
        org.junit.Assert.assertNull(byteArray45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Pcx-Custom" + "'", str46, "Pcx-Custom");
        org.junit.Assert.assertNull(imageMetadata48);
        org.junit.Assert.assertNull(formatCompliance50);
        org.junit.Assert.assertNotNull(pcxImagingParameters51);
        org.junit.Assert.assertNotNull(byteOrder54);
        org.junit.Assert.assertNull(formatCompliance56);
        org.junit.Assert.assertNotNull(pcxImagingParameters57);
        org.junit.Assert.assertNull(imageMetadata61);
        org.junit.Assert.assertNotNull(byteOrder64);
        org.junit.Assert.assertNull(formatCompliance66);
        org.junit.Assert.assertNull(imageMetadata68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters71);
        org.junit.Assert.assertNull(imageMetadata72);
        org.junit.Assert.assertNull(byteArray73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Pcx-Custom" + "'", str74, "Pcx-Custom");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "pcx" + "'", str75, "pcx");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Pcx-Custom" + "'", str80, "Pcx-Custom");
        org.junit.Assert.assertNotNull(pcxImagingParameters81);
        org.junit.Assert.assertNull(byteArray82);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser0 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource1 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = null;
        byte[] byteArray3 = pcxImageParser0.getIccProfileBytes(byteSource1, pcxImagingParameters2);
        java.lang.String str4 = pcxImageParser0.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource5 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance6 = pcxImageParser0.getFormatCompliance(byteSource5);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImageParser0.getDefaultParameters();
        java.lang.Class<?> wildcardClass8 = pcxImageParser0.getClass();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Pcx-Custom" + "'", str4, "Pcx-Custom");
        org.junit.Assert.assertNull(formatCompliance6);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser0 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.lang.String str1 = pcxImageParser0.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource2 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance3 = pcxImageParser0.getFormatCompliance(byteSource2);
        boolean boolean5 = pcxImageParser0.canAcceptExtension("");
        org.apache.commons.imaging.bytesource.ByteSource byteSource6 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance7 = pcxImageParser0.getFormatCompliance(byteSource6);
        org.apache.commons.imaging.bytesource.ByteSource byteSource8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser9 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource10 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata11 = pcxImageParser9.getMetadata(byteSource10);
        org.apache.commons.imaging.bytesource.ByteSource byteSource12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser13 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder14 = pcxImageParser13.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource15 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance16 = pcxImageParser13.getFormatCompliance(byteSource15);
        org.apache.commons.imaging.bytesource.ByteSource byteSource17 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata18 = pcxImageParser13.getMetadata(byteSource17);
        boolean boolean20 = pcxImageParser13.canAcceptExtension("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters21 = pcxImageParser13.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata22 = pcxImageParser9.getMetadata(byteSource12, pcxImagingParameters21);
        byte[] byteArray23 = pcxImageParser0.getIccProfileBytes(byteSource8, pcxImagingParameters21);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters24 = pcxImageParser0.getDefaultParameters();
        java.nio.ByteOrder byteOrder25 = pcxImageParser0.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource26 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser27 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder28 = pcxImageParser27.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource29 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance30 = pcxImageParser27.getFormatCompliance(byteSource29);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters31 = pcxImageParser27.getDefaultParameters();
        org.apache.commons.imaging.bytesource.ByteSource byteSource32 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser33 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource34 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters35 = null;
        byte[] byteArray36 = pcxImageParser33.getIccProfileBytes(byteSource34, pcxImagingParameters35);
        java.lang.String str37 = pcxImageParser33.getDefaultExtension();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters38 = pcxImageParser33.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata39 = pcxImageParser27.getMetadata(byteSource32, pcxImagingParameters38);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters40 = pcxImageParser27.getDefaultParameters();
        byte[] byteArray41 = pcxImageParser0.getIccProfileBytes(byteSource26, pcxImagingParameters40);
        boolean boolean43 = pcxImageParser0.canAcceptExtension("Pcx-Custom");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Pcx-Custom" + "'", str1, "Pcx-Custom");
        org.junit.Assert.assertNull(formatCompliance3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(formatCompliance7);
        org.junit.Assert.assertNull(imageMetadata11);
        org.junit.Assert.assertNotNull(byteOrder14);
        org.junit.Assert.assertNull(formatCompliance16);
        org.junit.Assert.assertNull(imageMetadata18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters21);
        org.junit.Assert.assertNull(imageMetadata22);
        org.junit.Assert.assertNull(byteArray23);
        org.junit.Assert.assertNotNull(pcxImagingParameters24);
        org.junit.Assert.assertNotNull(byteOrder25);
        org.junit.Assert.assertNotNull(byteOrder28);
        org.junit.Assert.assertNull(formatCompliance30);
        org.junit.Assert.assertNotNull(pcxImagingParameters31);
        org.junit.Assert.assertNull(byteArray36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "pcx" + "'", str37, "pcx");
        org.junit.Assert.assertNotNull(pcxImagingParameters38);
        org.junit.Assert.assertNull(imageMetadata39);
        org.junit.Assert.assertNotNull(pcxImagingParameters40);
        org.junit.Assert.assertNull(byteArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser0 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder1 = pcxImageParser0.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource2 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance3 = pcxImageParser0.getFormatCompliance(byteSource2);
        org.apache.commons.imaging.bytesource.ByteSource byteSource4 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata5 = pcxImageParser0.getMetadata(byteSource4);
        boolean boolean7 = pcxImageParser0.canAcceptExtension("hi!");
        boolean boolean9 = pcxImageParser0.canAcceptExtension("pcx");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImageParser0.getDefaultParameters();
        org.apache.commons.imaging.bytesource.ByteSource byteSource11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = pcxImageParser0.dumpImageFile(byteSource11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder1);
        org.junit.Assert.assertNull(formatCompliance3);
        org.junit.Assert.assertNull(imageMetadata5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser0 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource1 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = null;
        byte[] byteArray3 = pcxImageParser0.getIccProfileBytes(byteSource1, pcxImagingParameters2);
        java.lang.String str4 = pcxImageParser0.getName();
        java.lang.String str5 = pcxImageParser0.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser7 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder8 = pcxImageParser7.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource9 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance10 = pcxImageParser7.getFormatCompliance(byteSource9);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImageParser7.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata12 = pcxImageParser0.getMetadata(byteSource6, pcxImagingParameters11);
        java.lang.String str13 = pcxImageParser0.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource14 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata15 = pcxImageParser0.getMetadata(byteSource14);
        org.apache.commons.imaging.bytesource.ByteSource byteSource16 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser17 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource18 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = null;
        byte[] byteArray20 = pcxImageParser17.getIccProfileBytes(byteSource18, pcxImagingParameters19);
        java.lang.String str21 = pcxImageParser17.getName();
        java.lang.String str22 = pcxImageParser17.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource23 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser24 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder25 = pcxImageParser24.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource26 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance27 = pcxImageParser24.getFormatCompliance(byteSource26);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters28 = pcxImageParser24.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata29 = pcxImageParser17.getMetadata(byteSource23, pcxImagingParameters28);
        org.apache.commons.imaging.bytesource.ByteSource byteSource30 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser31 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource32 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters33 = null;
        byte[] byteArray34 = pcxImageParser31.getIccProfileBytes(byteSource32, pcxImagingParameters33);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters35 = pcxImageParser31.getDefaultParameters();
        byte[] byteArray36 = pcxImageParser17.getIccProfileBytes(byteSource30, pcxImagingParameters35);
        byte[] byteArray37 = pcxImageParser0.getIccProfileBytes(byteSource16, pcxImagingParameters35);
        org.apache.commons.imaging.bytesource.ByteSource byteSource38 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance39 = pcxImageParser0.getFormatCompliance(byteSource38);
        java.nio.ByteOrder byteOrder40 = pcxImageParser0.getByteOrder();
        java.io.File file41 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = pcxImageParser0.dumpImageFile(file41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Pcx-Custom" + "'", str4, "Pcx-Custom");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pcx-Custom" + "'", str5, "Pcx-Custom");
        org.junit.Assert.assertNotNull(byteOrder8);
        org.junit.Assert.assertNull(formatCompliance10);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(imageMetadata12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pcx-Custom" + "'", str13, "Pcx-Custom");
        org.junit.Assert.assertNull(imageMetadata15);
        org.junit.Assert.assertNull(byteArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Pcx-Custom" + "'", str21, "Pcx-Custom");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Pcx-Custom" + "'", str22, "Pcx-Custom");
        org.junit.Assert.assertNotNull(byteOrder25);
        org.junit.Assert.assertNull(formatCompliance27);
        org.junit.Assert.assertNotNull(pcxImagingParameters28);
        org.junit.Assert.assertNull(imageMetadata29);
        org.junit.Assert.assertNull(byteArray34);
        org.junit.Assert.assertNotNull(pcxImagingParameters35);
        org.junit.Assert.assertNull(byteArray36);
        org.junit.Assert.assertNull(byteArray37);
        org.junit.Assert.assertNull(formatCompliance39);
        org.junit.Assert.assertNotNull(byteOrder40);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser0 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource1 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata2 = pcxImageParser0.getMetadata(byteSource1);
        org.apache.commons.imaging.bytesource.ByteSource byteSource3 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata4 = pcxImageParser0.getMetadata(byteSource3);
        java.lang.String str5 = pcxImageParser0.getDefaultExtension();
        java.lang.String str6 = pcxImageParser0.getDefaultExtension();
        org.apache.commons.imaging.bytesource.ByteSource byteSource7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.awt.image.BufferedImage> bufferedImageList8 = pcxImageParser0.getAllBufferedImages(byteSource7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(imageMetadata2);
        org.junit.Assert.assertNull(imageMetadata4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "pcx" + "'", str5, "pcx");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "pcx" + "'", str6, "pcx");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser0 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource1 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = null;
        byte[] byteArray3 = pcxImageParser0.getIccProfileBytes(byteSource1, pcxImagingParameters2);
        java.lang.String str4 = pcxImageParser0.getName();
        java.lang.String str5 = pcxImageParser0.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser7 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder8 = pcxImageParser7.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource9 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance10 = pcxImageParser7.getFormatCompliance(byteSource9);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImageParser7.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata12 = pcxImageParser0.getMetadata(byteSource6, pcxImagingParameters11);
        org.apache.commons.imaging.bytesource.ByteSource byteSource13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser14 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource15 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata16 = pcxImageParser14.getMetadata(byteSource15);
        org.apache.commons.imaging.bytesource.ByteSource byteSource17 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser18 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder19 = pcxImageParser18.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource20 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance21 = pcxImageParser18.getFormatCompliance(byteSource20);
        org.apache.commons.imaging.bytesource.ByteSource byteSource22 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata23 = pcxImageParser18.getMetadata(byteSource22);
        boolean boolean25 = pcxImageParser18.canAcceptExtension("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters26 = pcxImageParser18.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata27 = pcxImageParser14.getMetadata(byteSource17, pcxImagingParameters26);
        byte[] byteArray28 = pcxImageParser0.getIccProfileBytes(byteSource13, pcxImagingParameters26);
        boolean boolean30 = pcxImageParser0.canAcceptExtension("pcx");
        java.nio.ByteOrder byteOrder31 = pcxImageParser0.getByteOrder();
        org.apache.commons.imaging.ImageFormat imageFormat32 = null;
        boolean boolean33 = pcxImageParser0.canAcceptType(imageFormat32);
        org.apache.commons.imaging.bytesource.ByteSource byteSource34 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata35 = pcxImageParser0.getMetadata(byteSource34);
        java.awt.image.BufferedImage bufferedImage36 = null;
        java.io.OutputStream outputStream37 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser38 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder39 = pcxImageParser38.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource40 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance41 = pcxImageParser38.getFormatCompliance(byteSource40);
        java.nio.ByteOrder byteOrder42 = pcxImageParser38.getByteOrder();
        java.lang.String str43 = pcxImageParser38.getName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters44 = pcxImageParser38.getDefaultParameters();
        org.apache.commons.imaging.bytesource.ByteSource byteSource45 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser46 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource47 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters48 = null;
        byte[] byteArray49 = pcxImageParser46.getIccProfileBytes(byteSource47, pcxImagingParameters48);
        java.lang.String str50 = pcxImageParser46.getName();
        java.lang.String str51 = pcxImageParser46.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource52 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance53 = pcxImageParser46.getFormatCompliance(byteSource52);
        org.apache.commons.imaging.bytesource.ByteSource byteSource54 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser55 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder56 = pcxImageParser55.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource57 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance58 = pcxImageParser55.getFormatCompliance(byteSource57);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters59 = pcxImageParser55.getDefaultParameters();
        org.apache.commons.imaging.ImageFormat imageFormat60 = null;
        boolean boolean61 = pcxImageParser55.canAcceptType(imageFormat60);
        java.lang.String str62 = pcxImageParser55.getDefaultExtension();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters63 = pcxImageParser55.getDefaultParameters();
        byte[] byteArray64 = pcxImageParser46.getIccProfileBytes(byteSource54, pcxImagingParameters63);
        org.apache.commons.imaging.bytesource.ByteSource byteSource65 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser66 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder67 = pcxImageParser66.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource68 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance69 = pcxImageParser66.getFormatCompliance(byteSource68);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters70 = pcxImageParser66.getDefaultParameters();
        org.apache.commons.imaging.ImageFormat imageFormat71 = null;
        boolean boolean72 = pcxImageParser66.canAcceptType(imageFormat71);
        java.lang.String str73 = pcxImageParser66.getDefaultExtension();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters74 = pcxImageParser66.getDefaultParameters();
        byte[] byteArray75 = pcxImageParser46.getIccProfileBytes(byteSource65, pcxImagingParameters74);
        byte[] byteArray76 = pcxImageParser38.getIccProfileBytes(byteSource45, pcxImagingParameters74);
        // The following exception was thrown during execution in test generation
        try {
            pcxImageParser0.writeImage(bufferedImage36, outputStream37, pcxImagingParameters74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Pcx-Custom" + "'", str4, "Pcx-Custom");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pcx-Custom" + "'", str5, "Pcx-Custom");
        org.junit.Assert.assertNotNull(byteOrder8);
        org.junit.Assert.assertNull(formatCompliance10);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(imageMetadata12);
        org.junit.Assert.assertNull(imageMetadata16);
        org.junit.Assert.assertNotNull(byteOrder19);
        org.junit.Assert.assertNull(formatCompliance21);
        org.junit.Assert.assertNull(imageMetadata23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters26);
        org.junit.Assert.assertNull(imageMetadata27);
        org.junit.Assert.assertNull(byteArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteOrder31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(imageMetadata35);
        org.junit.Assert.assertNotNull(byteOrder39);
        org.junit.Assert.assertNull(formatCompliance41);
        org.junit.Assert.assertNotNull(byteOrder42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Pcx-Custom" + "'", str43, "Pcx-Custom");
        org.junit.Assert.assertNotNull(pcxImagingParameters44);
        org.junit.Assert.assertNull(byteArray49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Pcx-Custom" + "'", str50, "Pcx-Custom");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Pcx-Custom" + "'", str51, "Pcx-Custom");
        org.junit.Assert.assertNull(formatCompliance53);
        org.junit.Assert.assertNotNull(byteOrder56);
        org.junit.Assert.assertNull(formatCompliance58);
        org.junit.Assert.assertNotNull(pcxImagingParameters59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "pcx" + "'", str62, "pcx");
        org.junit.Assert.assertNotNull(pcxImagingParameters63);
        org.junit.Assert.assertNull(byteArray64);
        org.junit.Assert.assertNotNull(byteOrder67);
        org.junit.Assert.assertNull(formatCompliance69);
        org.junit.Assert.assertNotNull(pcxImagingParameters70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "pcx" + "'", str73, "pcx");
        org.junit.Assert.assertNotNull(pcxImagingParameters74);
        org.junit.Assert.assertNull(byteArray75);
        org.junit.Assert.assertNull(byteArray76);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser0 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource1 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = null;
        byte[] byteArray3 = pcxImageParser0.getIccProfileBytes(byteSource1, pcxImagingParameters2);
        java.lang.String str4 = pcxImageParser0.getName();
        java.lang.String str5 = pcxImageParser0.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser7 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder8 = pcxImageParser7.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource9 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance10 = pcxImageParser7.getFormatCompliance(byteSource9);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImageParser7.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata12 = pcxImageParser0.getMetadata(byteSource6, pcxImagingParameters11);
        java.lang.String str13 = pcxImageParser0.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource14 = null;
        org.apache.commons.imaging.common.ImageMetadata imageMetadata15 = pcxImageParser0.getMetadata(byteSource14);
        org.apache.commons.imaging.bytesource.ByteSource byteSource16 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser17 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource18 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = null;
        byte[] byteArray20 = pcxImageParser17.getIccProfileBytes(byteSource18, pcxImagingParameters19);
        java.lang.String str21 = pcxImageParser17.getName();
        java.lang.String str22 = pcxImageParser17.getName();
        org.apache.commons.imaging.bytesource.ByteSource byteSource23 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser24 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        java.nio.ByteOrder byteOrder25 = pcxImageParser24.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource26 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance27 = pcxImageParser24.getFormatCompliance(byteSource26);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters28 = pcxImageParser24.getDefaultParameters();
        org.apache.commons.imaging.common.ImageMetadata imageMetadata29 = pcxImageParser17.getMetadata(byteSource23, pcxImagingParameters28);
        org.apache.commons.imaging.bytesource.ByteSource byteSource30 = null;
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser31 = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        org.apache.commons.imaging.bytesource.ByteSource byteSource32 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters33 = null;
        byte[] byteArray34 = pcxImageParser31.getIccProfileBytes(byteSource32, pcxImagingParameters33);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters35 = pcxImageParser31.getDefaultParameters();
        byte[] byteArray36 = pcxImageParser17.getIccProfileBytes(byteSource30, pcxImagingParameters35);
        byte[] byteArray37 = pcxImageParser0.getIccProfileBytes(byteSource16, pcxImagingParameters35);
        java.lang.String str38 = pcxImageParser0.getName();
        java.io.File file39 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.awt.image.BufferedImage> bufferedImageList40 = pcxImageParser0.getAllBufferedImages(file39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Pcx-Custom" + "'", str4, "Pcx-Custom");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pcx-Custom" + "'", str5, "Pcx-Custom");
        org.junit.Assert.assertNotNull(byteOrder8);
        org.junit.Assert.assertNull(formatCompliance10);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(imageMetadata12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pcx-Custom" + "'", str13, "Pcx-Custom");
        org.junit.Assert.assertNull(imageMetadata15);
        org.junit.Assert.assertNull(byteArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Pcx-Custom" + "'", str21, "Pcx-Custom");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Pcx-Custom" + "'", str22, "Pcx-Custom");
        org.junit.Assert.assertNotNull(byteOrder25);
        org.junit.Assert.assertNull(formatCompliance27);
        org.junit.Assert.assertNotNull(pcxImagingParameters28);
        org.junit.Assert.assertNull(imageMetadata29);
        org.junit.Assert.assertNull(byteArray34);
        org.junit.Assert.assertNotNull(pcxImagingParameters35);
        org.junit.Assert.assertNull(byteArray36);
        org.junit.Assert.assertNull(byteArray37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Pcx-Custom" + "'", str38, "Pcx-Custom");
    }
}

