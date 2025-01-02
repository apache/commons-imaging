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
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        java.lang.Class<?> wildcardClass2 = pcxImagingParameters1.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        int int5 = pcxImagingParameters4.getCompression();
        int int6 = pcxImagingParameters4.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setPixelDensity(pixelDensity7);
        java.lang.Class<?> wildcardClass9 = pcxImagingParameters4.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        java.lang.Class<?> wildcardClass5 = pcxImagingParameters4.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters0.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) ' ');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters6.setBitDepth((int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = pcxImagingParameters6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) ' ');
        java.lang.Class<?> wildcardClass11 = pcxImagingParameters6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        java.lang.Class<?> wildcardClass5 = pcxImagingParameters3.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        int int4 = pcxImagingParameters2.getCompression();
        java.lang.Class<?> wildcardClass5 = pcxImagingParameters2.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        int int4 = pcxImagingParameters2.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        java.lang.Class<?> wildcardClass7 = pcxImagingParameters6.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = pcxImagingParameters2.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBitDepth(0);
        int int5 = pcxImagingParameters0.getCompression();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters0.isStrict();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = pcxImagingParameters0.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(pixelDensity8);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.PixelDensity pixelDensity7 = pcxImagingParameters5.getPixelDensity();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNull(pixelDensity7);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBitDepth(0);
        java.lang.Class<?> wildcardClass5 = pcxImagingParameters4.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters0.getBufferedImageFactory();
        int int6 = pcxImagingParameters0.getPlanes();
        java.lang.String str7 = pcxImagingParameters0.getFileName();
        java.lang.Class<?> wildcardClass8 = pcxImagingParameters0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        java.lang.Class<?> wildcardClass6 = pcxImagingParameters0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters14.asThis();
        java.lang.Class<?> wildcardClass16 = pcxImagingParameters14.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        boolean boolean8 = pcxImagingParameters6.isStrict();
        int int9 = pcxImagingParameters6.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        java.lang.String str13 = pcxImagingParameters12.getFileName();
        java.lang.Class<?> wildcardClass14 = pcxImagingParameters12.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters14.asThis();
        int int16 = pcxImagingParameters15.getPlanes();
        java.lang.Class<?> wildcardClass17 = pcxImagingParameters15.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        int int6 = pcxImagingParameters5.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        boolean boolean3 = pcxImagingParameters2.isStrict();
        org.apache.commons.imaging.PixelDensity pixelDensity4 = pcxImagingParameters2.getPixelDensity();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = pixelDensity4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(pixelDensity4);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setFileName("hi!");
        java.lang.String str8 = pcxImagingParameters3.getFileName();
        org.apache.commons.imaging.PixelDensity pixelDensity9 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters3.setPlanes((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(pixelDensity9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setPixelDensity(pixelDensity6);
        java.lang.String str8 = pcxImagingParameters7.getFileName();
        int int9 = pcxImagingParameters7.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setStrict(true);
        java.lang.Class<?> wildcardClass7 = pcxImagingParameters4.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setPixelDensity(pixelDensity6);
        boolean boolean8 = pcxImagingParameters3.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        java.lang.Class<?> wildcardClass6 = pcxImagingParameters5.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        int int13 = pcxImagingParameters12.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters12.setStrict(true);
        int int16 = pcxImagingParameters15.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity17 = pcxImagingParameters15.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(pixelDensity17);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBitDepth((int) (byte) 1);
        java.lang.String str7 = pcxImagingParameters6.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters6.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(bufferedImageFactory10);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        int int13 = pcxImagingParameters12.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters12.setStrict(true);
        java.lang.String str16 = pcxImagingParameters12.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setPixelDensity(pixelDensity6);
        java.lang.String str8 = pcxImagingParameters4.getFileName();
        boolean boolean9 = pcxImagingParameters4.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getBitDepth();
        java.lang.Class<?> wildcardClass3 = pcxImagingParameters0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setFileName("hi!");
        java.lang.Class<?> wildcardClass9 = pcxImagingParameters6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBitDepth(0);
        java.lang.String str5 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setFileName("");
        int int8 = pcxImagingParameters7.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity9 = pcxImagingParameters7.getPixelDensity();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(pixelDensity9);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = pcxImagingParameters6.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setStrict(true);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setBufferedImageFactory(bufferedImageFactory11);
        java.lang.Class<?> wildcardClass13 = pcxImagingParameters10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(pixelDensity8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setCompression((int) (byte) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setPixelDensity(pixelDensity14);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters15.setStrict(true);
        int int18 = pcxImagingParameters15.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setFileName("");
        int int14 = pcxImagingParameters10.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters0.getBufferedImageFactory();
        int int6 = pcxImagingParameters0.getPlanes();
        java.lang.String str7 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setCompression(0);
        int int10 = pcxImagingParameters0.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters14.asThis();
        java.lang.Class<?> wildcardClass16 = pcxImagingParameters15.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setFileName("hi!");
        int int12 = pcxImagingParameters11.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters11.setBitDepth((int) (short) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters11.setCompression((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setPlanes((int) 'a');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters7.asThis();
        java.lang.String str9 = pcxImagingParameters8.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setPixelDensity(pixelDensity4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters5.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setPixelDensity(pixelDensity7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) ' ');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters6.setBitDepth((int) (byte) 100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory13 = pcxImagingParameters12.getBufferedImageFactory();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = bufferedImageFactory13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNull(bufferedImageFactory13);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        boolean boolean3 = pcxImagingParameters2.isStrict();
        org.apache.commons.imaging.PixelDensity pixelDensity4 = pcxImagingParameters2.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters2.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(pixelDensity4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        java.lang.Class<?> wildcardClass11 = pcxImagingParameters10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        int int3 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setFileName("");
        boolean boolean6 = pcxImagingParameters0.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = pcxImagingParameters0.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setStrict(true);
        java.lang.Class<?> wildcardClass7 = pcxImagingParameters6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNull(pixelDensity4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory6);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters7.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNull(bufferedImageFactory8);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = pcxImagingParameters8.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(bufferedImageFactory9);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setFileName("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setStrict(true);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters0.getBufferedImageFactory();
        java.lang.Class<?> wildcardClass7 = pcxImagingParameters0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setFileName("hi!");
        java.lang.String str8 = pcxImagingParameters3.getFileName();
        org.apache.commons.imaging.PixelDensity pixelDensity9 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.PixelDensity pixelDensity10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters3.setPixelDensity(pixelDensity10);
        boolean boolean12 = pcxImagingParameters3.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(pixelDensity9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        java.lang.Class<?> wildcardClass9 = pcxImagingParameters0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters0.setPixelDensity(pixelDensity9);
        int int11 = pcxImagingParameters0.getCompression();
        int int12 = pcxImagingParameters0.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity7 = pcxImagingParameters6.getPixelDensity();
        java.lang.Class<?> wildcardClass8 = pcxImagingParameters6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(pixelDensity7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setFileName("hi!");
        boolean boolean9 = pcxImagingParameters6.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = pcxImagingParameters6.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setStrict(true);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setBufferedImageFactory(bufferedImageFactory11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setCompression((int) (short) 100);
        int int15 = pcxImagingParameters12.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(pixelDensity8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setCompression(1);
        org.apache.commons.imaging.PixelDensity pixelDensity5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setPixelDensity(pixelDensity5);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setCompression((int) (short) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters4.setCompression((int) (byte) 10);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setStrict(true);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters0.getBufferedImageFactory();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = bufferedImageFactory6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setStrict(true);
        java.lang.Class<?> wildcardClass8 = pcxImagingParameters3.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setPlanes((int) (short) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters11.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setBitDepth((int) (short) 100);
        java.lang.Class<?> wildcardClass15 = pcxImagingParameters12.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setStrict(false);
        java.lang.Class<?> wildcardClass12 = pcxImagingParameters9.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setCompression((int) (short) 0);
        int int4 = pcxImagingParameters3.getCompression();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        java.lang.Class<?> wildcardClass6 = pcxImagingParameters5.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setPixelDensity(pixelDensity4);
        java.lang.Class<?> wildcardClass6 = pcxImagingParameters5.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setCompression((-1));
        int int13 = pcxImagingParameters10.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters10.setBitDepth(100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters10.setPlanes((-1));
        java.lang.Class<?> wildcardClass19 = pcxImagingParameters10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setPixelDensity(pixelDensity6);
        org.apache.commons.imaging.PixelDensity pixelDensity8 = pcxImagingParameters7.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNull(pixelDensity8);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setCompression(1);
        int int5 = pcxImagingParameters4.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setStrict(true);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters0.getBufferedImageFactory();
        int int6 = pcxImagingParameters0.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setStrict(false);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory11);
        int int13 = pcxImagingParameters12.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity14 = pcxImagingParameters12.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory15 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters12.setBufferedImageFactory(bufferedImageFactory15);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNull(pixelDensity14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        int int5 = pcxImagingParameters4.getCompression();
        int int6 = pcxImagingParameters4.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters4.setBufferedImageFactory(bufferedImageFactory9);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        java.lang.Class<?> wildcardClass12 = pcxImagingParameters10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBitDepth((int) (short) 100);
        boolean boolean9 = pcxImagingParameters5.isStrict();
        int int10 = pcxImagingParameters5.getPlanes();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setCompression(0);
        int int16 = pcxImagingParameters10.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setCompression(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setBitDepth((int) ' ');
        boolean boolean10 = pcxImagingParameters9.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPlanes((-1));
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setBufferedImageFactory(bufferedImageFactory13);
        java.lang.Class<?> wildcardClass15 = pcxImagingParameters12.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        boolean boolean8 = pcxImagingParameters6.isStrict();
        java.lang.String str9 = pcxImagingParameters6.getFileName();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setStrict(true);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        int int5 = pcxImagingParameters4.getCompression();
        int int6 = pcxImagingParameters4.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters4.setBufferedImageFactory(bufferedImageFactory9);
        java.lang.Class<?> wildcardClass11 = pcxImagingParameters10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        java.lang.Class<?> wildcardClass6 = pcxImagingParameters5.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters8.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters8.setFileName("hi!");
        java.lang.String str14 = pcxImagingParameters13.getFileName();
        java.lang.String str15 = pcxImagingParameters13.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPlanes((int) (short) -1);
        boolean boolean9 = pcxImagingParameters8.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setCompression(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters10.setCompression((int) (short) 10);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory18 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters10.setBufferedImageFactory(bufferedImageFactory18);
        org.apache.commons.imaging.PixelDensity pixelDensity20 = pcxImagingParameters10.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertNull(pixelDensity20);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        java.lang.String str7 = pcxImagingParameters5.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setPlanes(100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters9.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters9.setCompression((int) (byte) 0);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory13 = pcxImagingParameters9.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(bufferedImageFactory10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNull(bufferedImageFactory13);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setCompression(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setBitDepth((int) ' ');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters9.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPlanes((-1));
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory13 = pcxImagingParameters12.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNull(bufferedImageFactory13);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        int int13 = pcxImagingParameters12.getCompression();
        boolean boolean14 = pcxImagingParameters12.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters12.setBitDepth((-1));
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory17 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters12.setBufferedImageFactory(bufferedImageFactory17);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setBitDepth((int) (byte) -1);
        boolean boolean10 = pcxImagingParameters6.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setPlanes(0);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setCompression((int) ' ');
        org.apache.commons.imaging.PixelDensity pixelDensity10 = pcxImagingParameters3.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(pixelDensity10);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory5);
        java.lang.Class<?> wildcardClass7 = pcxImagingParameters0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters0.getBufferedImageFactory();
        int int6 = pcxImagingParameters0.getPlanes();
        java.lang.String str7 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setCompression((-1));
        org.apache.commons.imaging.PixelDensity pixelDensity10 = pcxImagingParameters9.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(pixelDensity10);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory5);
        int int7 = pcxImagingParameters6.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setPlanes((int) (byte) -1);
        java.lang.String str8 = pcxImagingParameters3.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters6.asThis();
        int int8 = pcxImagingParameters7.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setBitDepth((int) '#');
        java.lang.Class<?> wildcardClass9 = pcxImagingParameters8.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setPlanes((int) (byte) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.asThis();
        int int8 = pcxImagingParameters0.getCompression();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setPlanes((int) (byte) 10);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters3.getPixelDensity();
        boolean boolean7 = pcxImagingParameters3.isStrict();
        int int8 = pcxImagingParameters3.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters14.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters14.setFileName("hi!");
        int int18 = pcxImagingParameters14.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setCompression((int) ' ');
        java.lang.Class<?> wildcardClass10 = pcxImagingParameters3.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setPlanes((int) '4');
        boolean boolean8 = pcxImagingParameters7.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        java.lang.String str13 = pcxImagingParameters12.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = pcxImagingParameters12.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters12.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters12.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters17.setPlanes((int) (short) 10);
        org.apache.commons.imaging.PixelDensity pixelDensity20 = pcxImagingParameters17.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(bufferedImageFactory14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertNull(pixelDensity20);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        java.lang.String str7 = pcxImagingParameters5.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setPlanes(100);
        java.lang.Class<?> wildcardClass10 = pcxImagingParameters5.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setPixelDensity(pixelDensity6);
        boolean boolean8 = pcxImagingParameters7.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        boolean boolean4 = pcxImagingParameters3.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setStrict(true);
        java.lang.Class<?> wildcardClass8 = pcxImagingParameters7.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        java.lang.Class<?> wildcardClass7 = pcxImagingParameters0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        java.lang.String str7 = pcxImagingParameters5.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setPlanes(100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters9.getBufferedImageFactory();
        java.lang.Class<?> wildcardClass11 = pcxImagingParameters9.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(bufferedImageFactory10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setStrict(true);
        int int11 = pcxImagingParameters10.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setCompression((int) 'a');
        java.lang.Class<?> wildcardClass14 = pcxImagingParameters13.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setFileName("");
        java.lang.Class<?> wildcardClass11 = pcxImagingParameters10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.PixelDensity pixelDensity9 = pcxImagingParameters8.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(pixelDensity9);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters0.getBufferedImageFactory();
        int int6 = pcxImagingParameters0.getPlanes();
        java.lang.String str7 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setCompression(0);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters0.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(bufferedImageFactory10);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        int int4 = pcxImagingParameters0.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.asThis();
        java.lang.String str6 = pcxImagingParameters0.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters8.setFileName("");
        org.apache.commons.imaging.PixelDensity pixelDensity12 = pcxImagingParameters11.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters11.setPlanes((int) (short) 0);
        java.lang.Class<?> wildcardClass15 = pcxImagingParameters14.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(pixelDensity12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters14.asThis();
        int int16 = pcxImagingParameters15.getPlanes();
        java.lang.String str17 = pcxImagingParameters15.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters15.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters21 = pcxImagingParameters15.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters23 = pcxImagingParameters15.setFileName("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertNotNull(pcxImagingParameters21);
        org.junit.Assert.assertNotNull(pcxImagingParameters23);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters14.asThis();
        int int16 = pcxImagingParameters15.getPlanes();
        int int17 = pcxImagingParameters15.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setStrict(false);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setPixelDensity(pixelDensity11);
        int int13 = pcxImagingParameters12.getPlanes();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        java.lang.String str5 = pcxImagingParameters3.getFileName();
        java.lang.Class<?> wildcardClass6 = pcxImagingParameters3.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setFileName("hi!");
        int int12 = pcxImagingParameters11.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters11.setBitDepth((int) (short) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters14.setCompression((int) (short) -1);
        java.lang.String str17 = pcxImagingParameters14.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setPlanes((int) (byte) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setCompression(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory9);
        java.lang.Class<?> wildcardClass11 = pcxImagingParameters10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setFileName("");
        org.apache.commons.imaging.PixelDensity pixelDensity14 = pcxImagingParameters10.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters10.setPlanes((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNull(pixelDensity14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        int int3 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setPixelDensity(pixelDensity6);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters7.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNull(bufferedImageFactory8);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        int int13 = pcxImagingParameters12.getCompression();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = pcxImagingParameters12.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(bufferedImageFactory14);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters8.setFileName("hi!");
        java.lang.Class<?> wildcardClass12 = pcxImagingParameters11.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setBitDepth((int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = pcxImagingParameters10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters6.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity12 = pcxImagingParameters6.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(pixelDensity12);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory6);
        int int8 = pcxImagingParameters7.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity9 = pcxImagingParameters7.getPixelDensity();
        org.apache.commons.imaging.PixelDensity pixelDensity10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters7.setPixelDensity(pixelDensity10);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setBufferedImageFactory(bufferedImageFactory12);
        boolean boolean14 = pcxImagingParameters13.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters13.setBitDepth((int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = pcxImagingParameters13.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(pixelDensity9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        int int7 = pcxImagingParameters6.getBitDepth();
        int int8 = pcxImagingParameters6.getCompression();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression(10);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters0.getPixelDensity();
        org.apache.commons.imaging.PixelDensity pixelDensity7 = pcxImagingParameters0.getPixelDensity();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNull(pixelDensity7);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        java.lang.String str7 = pcxImagingParameters5.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setPlanes(100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters9.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters9.setCompression((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setPlanes((int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = pcxImagingParameters14.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(bufferedImageFactory10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setFileName("hi!");
        int int12 = pcxImagingParameters11.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters11.setBitDepth((int) (short) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters14.setCompression((int) (short) -1);
        org.apache.commons.imaging.PixelDensity pixelDensity17 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters14.setPixelDensity(pixelDensity17);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory19 = pcxImagingParameters14.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertNull(bufferedImageFactory19);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        int int11 = pcxImagingParameters10.getCompression();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setBufferedImageFactory(bufferedImageFactory12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setStrict(false);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setPlanes(52);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.PixelDensity pixelDensity3 = pcxImagingParameters2.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters2.asThis();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(pixelDensity3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBitDepth(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setPlanes((int) '#');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setBitDepth((int) (short) 0);
        int int10 = pcxImagingParameters9.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setFileName("hi!");
        int int12 = pcxImagingParameters11.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters11.setBitDepth((int) (short) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters14.setCompression((int) (short) -1);
        int int17 = pcxImagingParameters14.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters8.setFileName("");
        org.apache.commons.imaging.PixelDensity pixelDensity12 = pcxImagingParameters11.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters11.setPlanes((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters14.setCompression((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(pixelDensity12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters14.asThis();
        int int16 = pcxImagingParameters15.getPlanes();
        java.lang.String str17 = pcxImagingParameters15.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters15.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory20 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters21 = pcxImagingParameters19.setBufferedImageFactory(bufferedImageFactory20);
        boolean boolean22 = pcxImagingParameters19.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertNotNull(pcxImagingParameters21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setPixelDensity(pixelDensity7);
        java.lang.String str9 = pcxImagingParameters8.getFileName();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setCompression(1);
        org.apache.commons.imaging.PixelDensity pixelDensity5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setPixelDensity(pixelDensity5);
        java.lang.Class<?> wildcardClass7 = pcxImagingParameters4.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setCompression(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters10.setCompression((int) (short) 10);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory18 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters17.setBufferedImageFactory(bufferedImageFactory18);
        boolean boolean20 = pcxImagingParameters17.isStrict();
        org.apache.commons.imaging.PixelDensity pixelDensity21 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters22 = pcxImagingParameters17.setPixelDensity(pixelDensity21);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(pcxImagingParameters22);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        int int9 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters0.setStrict(true);
        java.lang.String str12 = pcxImagingParameters0.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters9.asThis();
        int int13 = pcxImagingParameters12.getBitDepth();
        int int14 = pcxImagingParameters12.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setPixelDensity(pixelDensity4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBitDepth((int) '#');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setFileName("");
        java.lang.Class<?> wildcardClass10 = pcxImagingParameters9.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setCompression((int) (short) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setPlanes((-1));
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters7.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters7.setPlanes(32);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPlanes((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters10.setFileName("hi!");
        int int17 = pcxImagingParameters16.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        java.lang.String str3 = pcxImagingParameters0.getFileName();
        java.lang.Class<?> wildcardClass4 = pcxImagingParameters0.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters6.getBufferedImageFactory();
        java.lang.String str9 = pcxImagingParameters6.getFileName();
        int int10 = pcxImagingParameters6.getPlanes();
        int int11 = pcxImagingParameters6.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(bufferedImageFactory8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        boolean boolean11 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory12 = pcxImagingParameters6.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(bufferedImageFactory12);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        int int6 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = pcxImagingParameters3.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters3.setPlanes(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(bufferedImageFactory9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setPlanes(32);
        java.lang.String str8 = pcxImagingParameters7.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.setFileName("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setBitDepth((int) '#');
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setPixelDensity(pixelDensity9);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = pcxImagingParameters8.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters8.setBitDepth((int) ' ');
        org.apache.commons.imaging.PixelDensity pixelDensity14 = pcxImagingParameters8.getPixelDensity();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(pixelDensity11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNull(pixelDensity14);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setCompression(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setBitDepth(10);
        boolean boolean10 = pcxImagingParameters9.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.PixelDensity pixelDensity3 = pcxImagingParameters0.getPixelDensity();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(pixelDensity3);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setStrict(false);
        int int12 = pcxImagingParameters11.getPlanes();
        java.lang.String str13 = pcxImagingParameters11.getFileName();
        int int14 = pcxImagingParameters11.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity15 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters11.setPixelDensity(pixelDensity15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setCompression((int) (byte) 0);
        java.lang.Class<?> wildcardClass10 = pcxImagingParameters6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        boolean boolean11 = pcxImagingParameters6.isStrict();
        int int12 = pcxImagingParameters6.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters0.getBufferedImageFactory();
        int int6 = pcxImagingParameters0.getPlanes();
        java.lang.String str7 = pcxImagingParameters0.getFileName();
        java.lang.String str8 = pcxImagingParameters0.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setCompression(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setBitDepth(10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters7.setPlanes((int) (short) 1);
        int int12 = pcxImagingParameters11.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = pcxImagingParameters0.getPixelDensity();
        java.lang.Class<?> wildcardClass5 = pcxImagingParameters0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNull(pixelDensity4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setPlanes((int) 'a');
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters4.setPixelDensity(pixelDensity8);
        boolean boolean10 = pcxImagingParameters9.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setCompression(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setBitDepth((int) ' ');
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setBufferedImageFactory(bufferedImageFactory10);
        org.apache.commons.imaging.PixelDensity pixelDensity12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setPixelDensity(pixelDensity12);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = pcxImagingParameters13.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNull(bufferedImageFactory14);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters0.setPixelDensity(pixelDensity9);
        java.lang.Class<?> wildcardClass11 = pcxImagingParameters0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        int int13 = pcxImagingParameters12.getCompression();
        boolean boolean14 = pcxImagingParameters12.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters12.setBitDepth((-1));
        int int17 = pcxImagingParameters12.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setCompression(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setBitDepth((int) ' ');
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setBufferedImageFactory(bufferedImageFactory10);
        int int12 = pcxImagingParameters11.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setStrict(false);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setPixelDensity(pixelDensity11);
        int int13 = pcxImagingParameters8.getPlanes();
        boolean boolean14 = pcxImagingParameters8.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters14.asThis();
        int int16 = pcxImagingParameters15.getPlanes();
        java.lang.String str17 = pcxImagingParameters15.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters15.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity20 = pcxImagingParameters15.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters22 = pcxImagingParameters15.setCompression((int) (byte) 0);
        java.lang.Class<?> wildcardClass23 = pcxImagingParameters22.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertNull(pixelDensity20);
        org.junit.Assert.assertNotNull(pcxImagingParameters22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters6.getBufferedImageFactory();
        java.lang.String str9 = pcxImagingParameters6.getFileName();
        int int10 = pcxImagingParameters6.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters6.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory13 = pcxImagingParameters12.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(bufferedImageFactory8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNull(bufferedImageFactory13);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getBitDepth();
        int int2 = pcxImagingParameters0.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setFileName("");
        int int5 = pcxImagingParameters4.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBitDepth((int) (byte) 1);
        java.lang.String str7 = pcxImagingParameters6.getFileName();
        java.lang.Class<?> wildcardClass8 = pcxImagingParameters6.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        java.lang.String str9 = pcxImagingParameters6.getFileName();
        java.lang.Class<?> wildcardClass10 = pcxImagingParameters6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setCompression((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters9.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity11 = pcxImagingParameters10.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(pixelDensity11);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setCompression(1);
        int int11 = pcxImagingParameters8.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters8.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters8.setPlanes(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setStrict(false);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = pcxImagingParameters4.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(bufferedImageFactory9);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters0.getBufferedImageFactory();
        int int6 = pcxImagingParameters0.getPlanes();
        java.lang.String str7 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setCompression((-1));
        int int10 = pcxImagingParameters0.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory6);
        int int8 = pcxImagingParameters5.getBitDepth();
        int int9 = pcxImagingParameters5.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        java.lang.String str5 = pcxImagingParameters0.getFileName();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters6.getBufferedImageFactory();
        java.lang.String str9 = pcxImagingParameters6.getFileName();
        int int10 = pcxImagingParameters6.getPlanes();
        boolean boolean11 = pcxImagingParameters6.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(bufferedImageFactory8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setCompression(1);
        int int5 = pcxImagingParameters4.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setBitDepth(10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters4.setFileName("hi!");
        org.apache.commons.imaging.PixelDensity pixelDensity10 = pcxImagingParameters4.getPixelDensity();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(pixelDensity10);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters0.setPixelDensity(pixelDensity9);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters0.asThis();
        int int12 = pcxImagingParameters0.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters2.asThis();
        java.lang.Class<?> wildcardClass5 = pcxImagingParameters4.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        boolean boolean11 = pcxImagingParameters6.isStrict();
        java.lang.Class<?> wildcardClass12 = pcxImagingParameters6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBitDepth(0);
        java.lang.String str5 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.PixelDensity pixelDensity8 = pcxImagingParameters7.getPixelDensity();
        boolean boolean9 = pcxImagingParameters7.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNull(pixelDensity8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setCompression(0);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory9);
        int int11 = pcxImagingParameters6.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPlanes((-1));
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setCompression((int) (byte) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity15 = pcxImagingParameters10.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters10.setBitDepth((int) (short) 10);
        int int18 = pcxImagingParameters17.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNull(pixelDensity15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setPlanes((int) 'a');
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters4.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.PixelDensity pixelDensity10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters4.setPixelDensity(pixelDensity10);
        org.apache.commons.imaging.PixelDensity pixelDensity12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setPixelDensity(pixelDensity12);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = pcxImagingParameters13.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNull(bufferedImageFactory14);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBitDepth((int) (byte) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setBitDepth((int) 'a');
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setCompression(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setBitDepth(10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters7.setPlanes((int) (short) 1);
        java.lang.Class<?> wildcardClass12 = pcxImagingParameters7.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters14.asThis();
        int int16 = pcxImagingParameters15.getPlanes();
        java.lang.String str17 = pcxImagingParameters15.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters15.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity20 = pcxImagingParameters15.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters22 = pcxImagingParameters15.setCompression((int) (byte) 0);
        java.lang.String str23 = pcxImagingParameters15.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertNull(pixelDensity20);
        org.junit.Assert.assertNotNull(pcxImagingParameters22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters5.setPlanes(100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setBufferedImageFactory(bufferedImageFactory11);
        java.lang.Class<?> wildcardClass13 = pcxImagingParameters12.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setStrict(false);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setCompression((int) (short) 100);
        boolean boolean8 = pcxImagingParameters7.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setCompression((int) ' ');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setPlanes((int) 'a');
        int int12 = pcxImagingParameters11.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setPixelDensity(pixelDensity6);
        int int8 = pcxImagingParameters3.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setStrict(false);
        java.lang.String str12 = pcxImagingParameters11.getFileName();
        java.lang.String str13 = pcxImagingParameters11.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters11.setFileName("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBitDepth(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters7.asThis();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setCompression((int) ' ');
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters3.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters3.asThis();
        java.lang.String str12 = pcxImagingParameters11.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(bufferedImageFactory10);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setStrict(false);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setPixelDensity(pixelDensity11);
        int int13 = pcxImagingParameters8.getPlanes();
        java.lang.Class<?> wildcardClass14 = pcxImagingParameters8.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        int int7 = pcxImagingParameters4.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = pcxImagingParameters4.getPixelDensity();
        int int9 = pcxImagingParameters4.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(pixelDensity8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setCompression((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setBitDepth(1);
        java.lang.Class<?> wildcardClass16 = pcxImagingParameters10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        int int9 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters0.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity12 = pcxImagingParameters0.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(pixelDensity12);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setPlanes((int) (short) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters11.asThis();
        boolean boolean13 = pcxImagingParameters12.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters9.asThis();
        int int13 = pcxImagingParameters12.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters12.setStrict(false);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory16 = pcxImagingParameters15.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNull(bufferedImageFactory16);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters10.setBitDepth(100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters10.setPlanes((-1));
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters10.setPlanes((int) ' ');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters21 = pcxImagingParameters10.asThis();
        int int22 = pcxImagingParameters21.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertNotNull(pcxImagingParameters20);
        org.junit.Assert.assertNotNull(pcxImagingParameters21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.asThis();
        boolean boolean11 = pcxImagingParameters10.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setBitDepth((int) (byte) 0);
        int int8 = pcxImagingParameters3.getBitDepth();
        java.lang.String str9 = pcxImagingParameters3.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.setCompression((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setFileName("");
        int int9 = pcxImagingParameters8.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        java.lang.String str9 = pcxImagingParameters6.getFileName();
        int int10 = pcxImagingParameters6.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity11 = pcxImagingParameters6.getPixelDensity();
        org.apache.commons.imaging.PixelDensity pixelDensity12 = pcxImagingParameters6.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(pixelDensity11);
        org.junit.Assert.assertNull(pixelDensity12);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.asThis();
        int int14 = pcxImagingParameters13.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters5.asThis();
        int int7 = pcxImagingParameters5.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPlanes((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity15 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters10.setPixelDensity(pixelDensity15);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory17 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters10.setBufferedImageFactory(bufferedImageFactory17);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        int int6 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters3.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters3.setPlanes((int) (short) -1);
        int int11 = pcxImagingParameters10.getBitDepth();
        int int12 = pcxImagingParameters10.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory6);
        int int8 = pcxImagingParameters5.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setPlanes((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setFileName("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = pcxImagingParameters0.getPixelDensity();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters0.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNull(pixelDensity4);
        org.junit.Assert.assertNull(pixelDensity5);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        java.lang.String str7 = pcxImagingParameters5.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setPlanes(100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters9.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters9.setCompression((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setPlanes((int) (byte) 0);
        int int15 = pcxImagingParameters14.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters14.asThis();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(bufferedImageFactory10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters10.setBitDepth(100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters10.setPlanes((-1));
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters18.setStrict(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertNotNull(pcxImagingParameters20);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        int int4 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.PixelDensity pixelDensity7 = pcxImagingParameters6.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(pixelDensity7);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        int int11 = pcxImagingParameters10.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setStrict(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(false);
        boolean boolean6 = pcxImagingParameters3.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setCompression(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters10.setCompression((int) (short) 10);
        org.apache.commons.imaging.PixelDensity pixelDensity18 = pcxImagingParameters17.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters17.setFileName("hi!");
        java.lang.String str21 = pcxImagingParameters20.getFileName();
        java.lang.Class<?> wildcardClass22 = pcxImagingParameters20.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNull(pixelDensity18);
        org.junit.Assert.assertNotNull(pcxImagingParameters20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.asThis();
        boolean boolean11 = pcxImagingParameters6.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory6);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setStrict(true);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        int int7 = pcxImagingParameters4.getCompression();
        java.lang.String str8 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters4.setBitDepth(97);
        int int11 = pcxImagingParameters4.getCompression();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setPlanes(1);
        java.lang.Class<?> wildcardClass9 = pcxImagingParameters8.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters0.setPixelDensity(pixelDensity9);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPlanes((int) '4');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setPlanes((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters8.setFileName("");
        boolean boolean12 = pcxImagingParameters8.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory9);
        int int11 = pcxImagingParameters8.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters8.setPlanes((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setCompression(1);
        org.apache.commons.imaging.PixelDensity pixelDensity5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setPixelDensity(pixelDensity5);
        int int7 = pcxImagingParameters6.getBitDepth();
        int int8 = pcxImagingParameters6.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = pcxImagingParameters6.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory12 = pcxImagingParameters6.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters6.setBitDepth((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters6.setCompression((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(pixelDensity11);
        org.junit.Assert.assertNull(bufferedImageFactory12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setCompression(1);
        int int11 = pcxImagingParameters8.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters8.setStrict(false);
        java.lang.Class<?> wildcardClass14 = pcxImagingParameters13.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        java.lang.String str13 = pcxImagingParameters12.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = pcxImagingParameters12.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters12.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters12.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters17.setStrict(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(bufferedImageFactory14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setPlanes((int) (short) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters9.setBitDepth(0);
        java.lang.String str14 = pcxImagingParameters13.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = pcxImagingParameters3.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNull(bufferedImageFactory4);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        int int9 = pcxImagingParameters6.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters6.setBitDepth(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory12 = pcxImagingParameters11.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory13 = pcxImagingParameters11.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(bufferedImageFactory12);
        org.junit.Assert.assertNull(bufferedImageFactory13);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setCompression(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setStrict(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        java.lang.String str13 = pcxImagingParameters12.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = pcxImagingParameters12.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters12.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters12.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters18.setBitDepth(1);
        java.lang.String str21 = pcxImagingParameters20.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(bufferedImageFactory14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertNotNull(pcxImagingParameters20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setCompression((int) (byte) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setPixelDensity(pixelDensity14);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters15.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters17.setFileName("");
        java.lang.Class<?> wildcardClass20 = pcxImagingParameters19.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setCompression(1);
        org.apache.commons.imaging.PixelDensity pixelDensity5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setPixelDensity(pixelDensity5);
        int int7 = pcxImagingParameters0.getCompression();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        int int6 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = pcxImagingParameters3.getBufferedImageFactory();
        org.apache.commons.imaging.PixelDensity pixelDensity10 = pcxImagingParameters3.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(bufferedImageFactory9);
        org.junit.Assert.assertNull(pixelDensity10);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters6.getBufferedImageFactory();
        java.lang.String str9 = pcxImagingParameters6.getFileName();
        int int10 = pcxImagingParameters6.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters6.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters6.asThis();
        java.lang.Class<?> wildcardClass14 = pcxImagingParameters6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(bufferedImageFactory8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setPixelDensity(pixelDensity6);
        int int8 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters3.setPlanes((int) '4');
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = pcxImagingParameters10.getBufferedImageFactory();
        int int12 = pcxImagingParameters10.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setBufferedImageFactory(bufferedImageFactory13);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(bufferedImageFactory11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setBitDepth((int) (short) -1);
        org.apache.commons.imaging.PixelDensity pixelDensity14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setPixelDensity(pixelDensity14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters5.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = pcxImagingParameters5.getPixelDensity();
        java.lang.String str9 = pcxImagingParameters5.getFileName();
        int int10 = pcxImagingParameters5.getPlanes();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNull(bufferedImageFactory7);
        org.junit.Assert.assertNull(pixelDensity8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        boolean boolean2 = pcxImagingParameters0.isStrict();
        java.lang.String str3 = pcxImagingParameters0.getFileName();
        int int4 = pcxImagingParameters0.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        int int4 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory8);
        org.apache.commons.imaging.PixelDensity pixelDensity10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters0.setPixelDensity(pixelDensity10);
        java.lang.String str12 = pcxImagingParameters11.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setBitDepth((int) (byte) 0);
        int int8 = pcxImagingParameters7.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.setBitDepth(100);
        int int11 = pcxImagingParameters10.getBitDepth();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory12 = pcxImagingParameters10.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNull(bufferedImageFactory12);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.asThis();
        java.lang.Class<?> wildcardClass6 = pcxImagingParameters2.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        int int4 = pcxImagingParameters3.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters3.setCompression((int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = pcxImagingParameters8.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setStrict(false);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory11);
        int int13 = pcxImagingParameters12.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity14 = pcxImagingParameters12.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters12.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters15.setPlanes((int) 'a');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters15.asThis();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNull(pixelDensity14);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPlanes((-1));
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setBufferedImageFactory(bufferedImageFactory13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters12.setPlanes(0);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory17 = pcxImagingParameters16.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNull(bufferedImageFactory17);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory6);
        int int8 = pcxImagingParameters5.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters5.setPixelDensity(pixelDensity9);
        boolean boolean11 = pcxImagingParameters5.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        boolean boolean11 = pcxImagingParameters10.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setPlanes((int) '#');
        boolean boolean14 = pcxImagingParameters10.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBitDepth((int) (byte) 100);
        boolean boolean8 = pcxImagingParameters7.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters10.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity12 = pcxImagingParameters11.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(pixelDensity12);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setCompression((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters6.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(bufferedImageFactory10);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters0.getPixelDensity();
        boolean boolean7 = pcxImagingParameters0.isStrict();
        int int8 = pcxImagingParameters0.getBitDepth();
        int int9 = pcxImagingParameters0.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters0.setCompression((int) '#');
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        int int6 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters3.setFileName("");
        boolean boolean9 = pcxImagingParameters8.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = pcxImagingParameters10.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(pixelDensity11);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBitDepth(0);
        java.lang.String str5 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters0.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = pcxImagingParameters0.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNull(bufferedImageFactory7);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters0.setPixelDensity(pixelDensity9);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters0.setStrict(true);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setBufferedImageFactory(bufferedImageFactory14);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory16 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters15.setBufferedImageFactory(bufferedImageFactory16);
        int int18 = pcxImagingParameters17.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        boolean boolean11 = pcxImagingParameters10.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setBufferedImageFactory(bufferedImageFactory14);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters10.setCompression((int) (byte) 100);
        java.lang.String str18 = pcxImagingParameters10.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters14.asThis();
        int int16 = pcxImagingParameters15.getPlanes();
        java.lang.String str17 = pcxImagingParameters15.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters15.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity20 = pcxImagingParameters15.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters22 = pcxImagingParameters15.setStrict(false);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory23 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters24 = pcxImagingParameters22.setBufferedImageFactory(bufferedImageFactory23);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertNull(pixelDensity20);
        org.junit.Assert.assertNotNull(pcxImagingParameters22);
        org.junit.Assert.assertNotNull(pcxImagingParameters24);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        boolean boolean2 = pcxImagingParameters0.isStrict();
        java.lang.String str3 = pcxImagingParameters0.getFileName();
        java.lang.String str4 = pcxImagingParameters0.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory6);
        int int8 = pcxImagingParameters7.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity9 = pcxImagingParameters7.getPixelDensity();
        java.lang.String str10 = pcxImagingParameters7.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters7.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setPlanes((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(pixelDensity9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters10.setBitDepth(100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters16.setStrict(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = pcxImagingParameters0.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory5);
        int int7 = pcxImagingParameters6.getCompression();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNull(pixelDensity4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters14.asThis();
        int int16 = pcxImagingParameters15.getPlanes();
        java.lang.String str17 = pcxImagingParameters15.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters15.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity20 = pcxImagingParameters15.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters22 = pcxImagingParameters15.setCompression((int) (byte) 0);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory23 = pcxImagingParameters15.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertNull(pixelDensity20);
        org.junit.Assert.assertNotNull(pcxImagingParameters22);
        org.junit.Assert.assertNull(bufferedImageFactory23);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPixelDensity(pixelDensity9);
        boolean boolean11 = pcxImagingParameters10.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setPlanes((int) (short) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters9.setPlanes((int) (byte) 1);
        int int14 = pcxImagingParameters9.getPlanes();
        int int15 = pcxImagingParameters9.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        boolean boolean11 = pcxImagingParameters10.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setPlanes((int) '#');
        org.apache.commons.imaging.PixelDensity pixelDensity14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setPixelDensity(pixelDensity14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPlanes((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters10.setFileName("hi!");
        int int17 = pcxImagingParameters16.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters8.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters8.setFileName("hi!");
        int int14 = pcxImagingParameters8.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setCompression((int) (byte) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setPixelDensity(pixelDensity14);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters15.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity17 = pcxImagingParameters16.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNull(pixelDensity17);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        boolean boolean3 = pcxImagingParameters2.isStrict();
        org.apache.commons.imaging.PixelDensity pixelDensity4 = pcxImagingParameters2.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters2.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setFileName("hi!");
        org.apache.commons.imaging.PixelDensity pixelDensity9 = pcxImagingParameters8.getPixelDensity();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(pixelDensity4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(pixelDensity9);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.asThis();
        java.lang.String str16 = pcxImagingParameters10.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPlanes((int) (short) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = pcxImagingParameters6.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters6.setStrict(true);
        java.lang.String str14 = pcxImagingParameters13.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(bufferedImageFactory9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters14.asThis();
        int int16 = pcxImagingParameters15.getPlanes();
        java.lang.String str17 = pcxImagingParameters15.getFileName();
        boolean boolean18 = pcxImagingParameters15.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setPlanes((int) '4');
        int int8 = pcxImagingParameters2.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters2.setPixelDensity(pixelDensity9);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters2.setBitDepth((int) '4');
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setPixelDensity(pixelDensity5);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters0.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNull(bufferedImageFactory8);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setStrict(false);
        java.lang.Class<?> wildcardClass5 = pcxImagingParameters4.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters0.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.asThis();
        java.lang.String str7 = pcxImagingParameters0.getFileName();
        java.lang.Class<?> wildcardClass8 = pcxImagingParameters0.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters3.getPixelDensity();
        int int7 = pcxImagingParameters3.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters3.setPixelDensity(pixelDensity9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(pixelDensity8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        boolean boolean6 = pcxImagingParameters4.isStrict();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = pcxImagingParameters4.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(bufferedImageFactory7);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setPlanes((int) (short) 100);
        int int7 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setCompression((int) (byte) 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setStrict(true);
        int int15 = pcxImagingParameters14.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory16 = pcxImagingParameters14.getBufferedImageFactory();
        org.apache.commons.imaging.PixelDensity pixelDensity17 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters14.setPixelDensity(pixelDensity17);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters14.setBitDepth((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(bufferedImageFactory16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertNotNull(pcxImagingParameters20);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setPlanes((int) 'a');
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters4.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.PixelDensity pixelDensity10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters4.setPixelDensity(pixelDensity10);
        java.lang.String str12 = pcxImagingParameters11.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters3.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBitDepth((int) (byte) 1);
        java.lang.String str7 = pcxImagingParameters6.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setFileName("");
        java.lang.Class<?> wildcardClass10 = pcxImagingParameters6.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setFileName("hi!");
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setPixelDensity(pixelDensity8);
        java.lang.Class<?> wildcardClass10 = pcxImagingParameters3.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setCompression((int) (byte) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setPixelDensity(pixelDensity14);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters15.asThis();
        int int17 = pcxImagingParameters15.getBitDepth();
        int int18 = pcxImagingParameters15.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory6);
        int int8 = pcxImagingParameters7.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity9 = pcxImagingParameters7.getPixelDensity();
        org.apache.commons.imaging.PixelDensity pixelDensity10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters7.setPixelDensity(pixelDensity10);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setBufferedImageFactory(bufferedImageFactory12);
        boolean boolean14 = pcxImagingParameters13.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters13.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.PixelDensity pixelDensity17 = pcxImagingParameters16.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(pixelDensity9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNull(pixelDensity17);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setStrict(true);
        int int7 = pcxImagingParameters4.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setStrict(false);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory5);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        java.lang.String str9 = pcxImagingParameters8.getFileName();
        int int10 = pcxImagingParameters8.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setFileName("");
        boolean boolean6 = pcxImagingParameters5.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setPlanes((int) 'a');
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters4.setPixelDensity(pixelDensity8);
        int int10 = pcxImagingParameters4.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setStrict(false);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = pcxImagingParameters8.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters8.setPlanes((int) 'a');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters11.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(bufferedImageFactory9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setCompression((int) (byte) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setPixelDensity(pixelDensity14);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters15.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters17.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters21 = pcxImagingParameters19.setStrict(true);
        java.lang.Class<?> wildcardClass22 = pcxImagingParameters19.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertNotNull(pcxImagingParameters21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setFileName("hi!");
        java.lang.Class<?> wildcardClass8 = pcxImagingParameters3.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        boolean boolean6 = pcxImagingParameters5.isStrict();
        int int7 = pcxImagingParameters5.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setBufferedImageFactory(bufferedImageFactory14);
        int int16 = pcxImagingParameters13.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setCompression(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters10.setCompression((int) (short) 10);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory18 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters17.setBufferedImageFactory(bufferedImageFactory18);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters21 = pcxImagingParameters19.setCompression(100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory22 = pcxImagingParameters19.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertNotNull(pcxImagingParameters21);
        org.junit.Assert.assertNull(bufferedImageFactory22);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.PixelDensity pixelDensity14 = pcxImagingParameters13.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNull(pixelDensity14);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters0.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory6);
        int int8 = pcxImagingParameters0.getBitDepth();
        boolean boolean9 = pcxImagingParameters0.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setCompression(0);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory16 = pcxImagingParameters15.getBufferedImageFactory();
        org.apache.commons.imaging.PixelDensity pixelDensity17 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters15.setPixelDensity(pixelDensity17);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory19 = pcxImagingParameters15.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNull(bufferedImageFactory16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertNull(bufferedImageFactory19);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters6.getBufferedImageFactory();
        java.lang.String str9 = pcxImagingParameters6.getFileName();
        int int10 = pcxImagingParameters6.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters6.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory13 = pcxImagingParameters6.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(bufferedImageFactory8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNull(bufferedImageFactory13);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        java.lang.String str7 = pcxImagingParameters5.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setPlanes(100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters9.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters9.setCompression((int) (byte) 0);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setBufferedImageFactory(bufferedImageFactory13);
        boolean boolean15 = pcxImagingParameters14.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(bufferedImageFactory10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression(10);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters0.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters0.setCompression(0);
        java.lang.Class<?> wildcardClass11 = pcxImagingParameters0.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters5.getPixelDensity();
        java.lang.String str7 = pcxImagingParameters5.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters5.setCompression(1);
        int int12 = pcxImagingParameters11.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters14.asThis();
        int int16 = pcxImagingParameters15.getPlanes();
        java.lang.String str17 = pcxImagingParameters15.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters15.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters21 = pcxImagingParameters15.setFileName("hi!");
        int int22 = pcxImagingParameters21.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertNotNull(pcxImagingParameters21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory6);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters9.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters9.setFileName("hi!");
        boolean boolean13 = pcxImagingParameters12.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setFileName("");
        int int16 = pcxImagingParameters10.getBitDepth();
        java.lang.String str17 = pcxImagingParameters10.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setPixelDensity(pixelDensity6);
        int int8 = pcxImagingParameters3.getCompression();
        int int9 = pcxImagingParameters3.getPlanes();
        java.lang.Class<?> wildcardClass10 = pcxImagingParameters3.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBitDepth((int) (short) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setStrict(false);
        int int11 = pcxImagingParameters6.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.asThis();
        boolean boolean7 = pcxImagingParameters3.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters9.asThis();
        int int13 = pcxImagingParameters12.getBitDepth();
        java.lang.Class<?> wildcardClass14 = pcxImagingParameters12.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.asThis();
        java.lang.String str7 = pcxImagingParameters6.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        boolean boolean4 = pcxImagingParameters2.isStrict();
        int int5 = pcxImagingParameters2.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        int int6 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters8.setPlanes((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setPixelDensity(pixelDensity6);
        int int8 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters3.setPlanes((int) '4');
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = pcxImagingParameters10.getBufferedImageFactory();
        org.apache.commons.imaging.PixelDensity pixelDensity12 = pcxImagingParameters10.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory13 = pcxImagingParameters10.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(bufferedImageFactory11);
        org.junit.Assert.assertNull(pixelDensity12);
        org.junit.Assert.assertNull(bufferedImageFactory13);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setFileName("hi!");
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.PixelDensity pixelDensity10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters3.setPixelDensity(pixelDensity10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setFileName("");
        org.apache.commons.imaging.PixelDensity pixelDensity14 = pcxImagingParameters13.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNull(pixelDensity14);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setPixelDensity(pixelDensity6);
        int int8 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters3.setPlanes((int) '4');
        int int11 = pcxImagingParameters10.getCompression();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory12 = pcxImagingParameters10.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(bufferedImageFactory12);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setCompression(1);
        int int5 = pcxImagingParameters4.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setPixelDensity(pixelDensity8);
        int int10 = pcxImagingParameters6.getPlanes();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters10.setBitDepth(100);
        org.apache.commons.imaging.PixelDensity pixelDensity17 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters16.setPixelDensity(pixelDensity17);
        org.apache.commons.imaging.PixelDensity pixelDensity19 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters18.setPixelDensity(pixelDensity19);
        java.lang.Class<?> wildcardClass21 = pcxImagingParameters20.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertNotNull(pcxImagingParameters20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity9 = pcxImagingParameters5.getPixelDensity();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(pixelDensity9);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.PixelDensity pixelDensity3 = pcxImagingParameters2.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBitDepth((-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(pixelDensity3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = pcxImagingParameters0.getPixelDensity();
        int int8 = pcxImagingParameters0.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(pixelDensity7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        int int3 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters5.asThis();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBitDepth((int) (byte) 0);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory6);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters5.setPlanes((-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setPixelDensity(pixelDensity4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters5.asThis();
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters9.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = pcxImagingParameters0.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNull(pixelDensity4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity7 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setBitDepth((int) '#');
        java.lang.Class<?> wildcardClass10 = pcxImagingParameters9.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(pixelDensity7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBitDepth(0);
        java.lang.String str5 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setFileName("");
        java.lang.String str8 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters0.setCompression((int) (byte) 0);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = pcxImagingParameters10.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(bufferedImageFactory11);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters6.setStrict(true);
        int int12 = pcxImagingParameters6.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        boolean boolean5 = pcxImagingParameters0.isStrict();
        java.lang.Class<?> wildcardClass6 = pcxImagingParameters0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setStrict(true);
        java.lang.String str6 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setBitDepth((int) (byte) 1);
        java.lang.String str9 = pcxImagingParameters0.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        int int5 = pcxImagingParameters4.getCompression();
        int int6 = pcxImagingParameters4.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters4.setBufferedImageFactory(bufferedImageFactory9);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters4.setBufferedImageFactory(bufferedImageFactory11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters5.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory7);
        java.lang.Class<?> wildcardClass9 = pcxImagingParameters8.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        int int4 = pcxImagingParameters3.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters3.setCompression((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setStrict(false);
        int int11 = pcxImagingParameters10.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        int int6 = pcxImagingParameters3.getBitDepth();
        java.lang.String str7 = pcxImagingParameters3.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setStrict(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setCompression(10);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = pcxImagingParameters8.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(pixelDensity11);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setStrict(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        int int6 = pcxImagingParameters3.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters3.setBitDepth(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean4 = pcxImagingParameters3.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters4.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setBitDepth((int) '#');
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setPixelDensity(pixelDensity9);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setPlanes((int) (byte) 100);
        int int13 = pcxImagingParameters12.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters12.setPixelDensity(pixelDensity14);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        java.lang.String str9 = pcxImagingParameters8.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setBitDepth((int) (byte) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setStrict(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        boolean boolean2 = pcxImagingParameters0.isStrict();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        int int4 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setPixelDensity(pixelDensity5);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("");
        boolean boolean9 = pcxImagingParameters0.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPlanes((-1));
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setCompression((int) (byte) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity15 = pcxImagingParameters10.getPixelDensity();
        org.apache.commons.imaging.PixelDensity pixelDensity16 = pcxImagingParameters10.getPixelDensity();
        org.apache.commons.imaging.PixelDensity pixelDensity17 = pcxImagingParameters10.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNull(pixelDensity15);
        org.junit.Assert.assertNull(pixelDensity16);
        org.junit.Assert.assertNull(pixelDensity17);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = pcxImagingParameters6.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setStrict(true);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setBufferedImageFactory(bufferedImageFactory11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setCompression((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity15 = pcxImagingParameters14.getPixelDensity();
        java.lang.String str16 = pcxImagingParameters14.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(pixelDensity8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNull(pixelDensity15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        int int11 = pcxImagingParameters10.getBitDepth();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory12 = pcxImagingParameters10.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.asThis();
        int int14 = pcxImagingParameters10.getCompression();
        int int15 = pcxImagingParameters10.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity15 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters10.setPixelDensity(pixelDensity15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters5.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory7);
        java.lang.Class<?> wildcardClass9 = pcxImagingParameters5.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        boolean boolean2 = pcxImagingParameters0.isStrict();
        java.lang.Class<?> wildcardClass3 = pcxImagingParameters0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setCompression(0);
        int int16 = pcxImagingParameters15.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        int int9 = pcxImagingParameters6.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters6.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setBitDepth((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters14.asThis();
        int int16 = pcxImagingParameters15.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters15.setBitDepth(10);
        org.apache.commons.imaging.PixelDensity pixelDensity19 = pcxImagingParameters15.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertNull(pixelDensity19);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters0.getPixelDensity();
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters0.getPixelDensity();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNull(pixelDensity6);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBitDepth(0);
        java.lang.String str5 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.PixelDensity pixelDensity8 = pcxImagingParameters7.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = pcxImagingParameters10.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNull(pixelDensity8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(bufferedImageFactory11);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        int int10 = pcxImagingParameters8.getPlanes();
        int int11 = pcxImagingParameters8.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBitDepth(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setStrict(true);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setBufferedImageFactory(bufferedImageFactory8);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters7.setBufferedImageFactory(bufferedImageFactory10);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBitDepth(0);
        java.lang.String str5 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setFileName("");
        int int8 = pcxImagingParameters7.getCompression();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.setBufferedImageFactory(bufferedImageFactory9);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setCompression((int) (byte) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setPixelDensity(pixelDensity14);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters15.setStrict(true);
        java.lang.Class<?> wildcardClass18 = pcxImagingParameters15.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean4 = pcxImagingParameters0.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBitDepth(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setStrict(false);
        java.lang.Class<?> wildcardClass10 = pcxImagingParameters9.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        int int11 = pcxImagingParameters10.getCompression();
        boolean boolean12 = pcxImagingParameters10.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.asThis();
        int int11 = pcxImagingParameters7.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPlanes((-1));
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setCompression((int) (byte) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity15 = pcxImagingParameters10.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters10.setFileName("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNull(pixelDensity15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        boolean boolean2 = pcxImagingParameters0.isStrict();
        int int3 = pcxImagingParameters0.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setBufferedImageFactory(bufferedImageFactory14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory6);
        int int8 = pcxImagingParameters7.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity9 = pcxImagingParameters7.getPixelDensity();
        org.apache.commons.imaging.PixelDensity pixelDensity10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters7.setPixelDensity(pixelDensity10);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setBufferedImageFactory(bufferedImageFactory12);
        boolean boolean14 = pcxImagingParameters13.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters13.setFileName("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(pixelDensity9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters9.setCompression((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters0.getBufferedImageFactory();
        int int6 = pcxImagingParameters0.getPlanes();
        boolean boolean7 = pcxImagingParameters0.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBitDepth((int) (byte) 0);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory6);
        int int8 = pcxImagingParameters5.getPlanes();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPlanes((-1));
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setCompression((int) (byte) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity15 = pcxImagingParameters10.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters10.setBitDepth((int) (short) 10);
        int int18 = pcxImagingParameters10.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNull(pixelDensity15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        int int9 = pcxImagingParameters6.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters6.setBitDepth(1);
        java.lang.Class<?> wildcardClass12 = pcxImagingParameters11.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters0.getBufferedImageFactory();
        int int6 = pcxImagingParameters0.getPlanes();
        java.lang.String str7 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setBitDepth(52);
        int int10 = pcxImagingParameters0.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setBufferedImageFactory(bufferedImageFactory11);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPlanes((-1));
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setCompression((int) (byte) 100);
        java.lang.String str15 = pcxImagingParameters10.getFileName();
        java.lang.Class<?> wildcardClass16 = pcxImagingParameters10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        boolean boolean9 = pcxImagingParameters6.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory6);
        int int8 = pcxImagingParameters7.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.setCompression((int) '#');
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setPixelDensity(pixelDensity6);
        org.apache.commons.imaging.PixelDensity pixelDensity8 = pcxImagingParameters3.getPixelDensity();
        int int9 = pcxImagingParameters3.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNull(pixelDensity8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters0.getPixelDensity();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = pixelDensity5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(pixelDensity5);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity8 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNull(pixelDensity8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory6);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters9.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters9.setFileName("hi!");
        int int13 = pcxImagingParameters12.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setPlanes((int) (byte) 100);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPlanes((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters10.setFileName("hi!");
        java.lang.String str17 = pcxImagingParameters16.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters16.setFileName("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setCompression((int) (byte) -1);
        int int9 = pcxImagingParameters4.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBitDepth(0);
        int int5 = pcxImagingParameters0.getBitDepth();
        boolean boolean6 = pcxImagingParameters0.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory6);
        int int8 = pcxImagingParameters7.getBitDepth();
        boolean boolean9 = pcxImagingParameters7.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory6);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters9.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters9.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters12.asThis();
        int int14 = pcxImagingParameters12.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setCompression(1);
        int int11 = pcxImagingParameters8.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters8.setStrict(false);
        org.apache.commons.imaging.PixelDensity pixelDensity14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters8.setPixelDensity(pixelDensity14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters6.getBufferedImageFactory();
        java.lang.String str9 = pcxImagingParameters6.getFileName();
        int int10 = pcxImagingParameters6.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters6.setCompression(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters6.setBitDepth(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters6.setFileName("hi!");
        int int17 = pcxImagingParameters6.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(bufferedImageFactory8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        int int9 = pcxImagingParameters8.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters8.getBufferedImageFactory();
        org.apache.commons.imaging.PixelDensity pixelDensity11 = pcxImagingParameters8.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(bufferedImageFactory10);
        org.junit.Assert.assertNull(pixelDensity11);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setFileName("hi!");
        java.lang.Class<?> wildcardClass11 = pcxImagingParameters10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setStrict(false);
        org.apache.commons.imaging.PixelDensity pixelDensity12 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters11.setPixelDensity(pixelDensity12);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters11.setBitDepth((int) ' ');
        int int16 = pcxImagingParameters11.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBitDepth(0);
        int int6 = pcxImagingParameters5.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setFileName("hi!");
        int int9 = pcxImagingParameters8.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.asThis();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        java.lang.String str7 = pcxImagingParameters5.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setPlanes(100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters5.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(bufferedImageFactory10);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        int int4 = pcxImagingParameters0.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.PixelDensity pixelDensity7 = pcxImagingParameters0.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(pixelDensity7);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        int int9 = pcxImagingParameters8.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters8.getBufferedImageFactory();
        int int11 = pcxImagingParameters8.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(bufferedImageFactory10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setPixelDensity(pixelDensity5);
        java.lang.Class<?> wildcardClass7 = pcxImagingParameters6.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        int int4 = pcxImagingParameters3.getBitDepth();
        boolean boolean5 = pcxImagingParameters3.isStrict();
        int int6 = pcxImagingParameters3.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity7 = pcxImagingParameters3.getPixelDensity();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(pixelDensity7);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        int int5 = pcxImagingParameters4.getCompression();
        int int6 = pcxImagingParameters4.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setCompression((int) (short) 10);
        int int9 = pcxImagingParameters4.getCompression();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters3.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setFileName("hi!");
        java.lang.Class<?> wildcardClass9 = pcxImagingParameters8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setCompression(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters10.setCompression((int) (short) 10);
        org.apache.commons.imaging.PixelDensity pixelDensity18 = pcxImagingParameters17.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters17.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters17.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory21 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters22 = pcxImagingParameters17.setBufferedImageFactory(bufferedImageFactory21);
        java.lang.Class<?> wildcardClass23 = pcxImagingParameters17.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNull(pixelDensity18);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertNotNull(pcxImagingParameters20);
        org.junit.Assert.assertNotNull(pcxImagingParameters22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = pcxImagingParameters0.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setStrict(true);
        java.lang.String str7 = pcxImagingParameters6.getFileName();
        java.lang.String str8 = pcxImagingParameters6.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNull(pixelDensity4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        int int9 = pcxImagingParameters8.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setFileName("");
        boolean boolean16 = pcxImagingParameters10.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setCompression((int) ' ');
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters3.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters3.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters3.setCompression((int) (short) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters3.setFileName("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(bufferedImageFactory10);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        java.lang.String str13 = pcxImagingParameters12.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = pcxImagingParameters12.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters12.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters16.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters16.setPlanes((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(bufferedImageFactory14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertNotNull(pcxImagingParameters20);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setCompression((-1));
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.asThis();
        boolean boolean14 = pcxImagingParameters13.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters5.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = pcxImagingParameters5.getPixelDensity();
        java.lang.Class<?> wildcardClass9 = pcxImagingParameters5.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNull(bufferedImageFactory7);
        org.junit.Assert.assertNull(pixelDensity8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBitDepth(0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setFileName("");
        boolean boolean8 = pcxImagingParameters2.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setBitDepth((int) '#');
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setPixelDensity(pixelDensity9);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = pcxImagingParameters8.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters8.setBitDepth((int) ' ');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters8.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory16 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory16);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(pixelDensity11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setCompression(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setPixelDensity(pixelDensity5);
        int int7 = pcxImagingParameters6.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters6.setStrict(false);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory4);
        java.lang.Class<?> wildcardClass6 = pcxImagingParameters5.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setBitDepth((int) '#');
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setPixelDensity(pixelDensity9);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = pcxImagingParameters8.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters8.setBitDepth((int) ' ');
        java.lang.Class<?> wildcardClass14 = pcxImagingParameters8.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(pixelDensity11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setPlanes((int) '4');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters7.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters7.setBufferedImageFactory(bufferedImageFactory11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters7.setBitDepth((-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters9.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(bufferedImageFactory10);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters0.setPixelDensity(pixelDensity9);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters0.setStrict(true);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setBufferedImageFactory(bufferedImageFactory14);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory16 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters15.setBufferedImageFactory(bufferedImageFactory16);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters15.setBitDepth((int) (short) -1);
        java.lang.Class<?> wildcardClass20 = pcxImagingParameters15.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters0.getBufferedImageFactory();
        int int6 = pcxImagingParameters0.getPlanes();
        java.lang.String str7 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters0.setCompression(0);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setBufferedImageFactory(bufferedImageFactory10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        java.lang.String str3 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression(100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setFileName("hi!");
        java.lang.Class<?> wildcardClass8 = pcxImagingParameters0.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setCompression((-1));
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.asThis();
        java.lang.String str14 = pcxImagingParameters13.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setCompression((int) ' ');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setPlanes((-1));
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters9.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters12.setBitDepth((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters16.setStrict(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBitDepth(0);
        java.lang.String str5 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setFileName("");
        java.lang.String str8 = pcxImagingParameters0.getFileName();
        boolean boolean9 = pcxImagingParameters0.isStrict();
        java.lang.Class<?> wildcardClass10 = pcxImagingParameters0.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        int int9 = pcxImagingParameters8.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters8.getBufferedImageFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(bufferedImageFactory10);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setCompression((int) ' ');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setPlanes((int) 'a');
        int int12 = pcxImagingParameters9.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters9.setPixelDensity(pixelDensity13);
        java.lang.String str15 = pcxImagingParameters9.getFileName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setPlanes((int) (short) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters11.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory15 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters12.setBufferedImageFactory(bufferedImageFactory15);
        boolean boolean17 = pcxImagingParameters16.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPlanes((int) (short) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setFileName("");
        java.lang.Class<?> wildcardClass13 = pcxImagingParameters12.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        java.lang.String str5 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setPixelDensity(pixelDensity6);
        boolean boolean8 = pcxImagingParameters7.isStrict();
        int int9 = pcxImagingParameters7.getCompression();
        int int10 = pcxImagingParameters7.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters5.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory8);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNull(bufferedImageFactory7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory6);
        int int8 = pcxImagingParameters7.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity9 = pcxImagingParameters7.getPixelDensity();
        org.apache.commons.imaging.PixelDensity pixelDensity10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters7.setPixelDensity(pixelDensity10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters7.setPlanes((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(pixelDensity9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setCompression(1);
        int int11 = pcxImagingParameters8.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters8.setBitDepth((int) (byte) -1);
        java.lang.Class<?> wildcardClass14 = pcxImagingParameters13.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setBitDepth((int) '#');
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setPixelDensity(pixelDensity9);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = pcxImagingParameters8.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters8.setBitDepth((int) ' ');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters8.asThis();
        int int15 = pcxImagingParameters8.getPlanes();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(pixelDensity11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters10.setBitDepth(100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters10.setPlanes((-1));
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters10.setPlanes((int) ' ');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters21 = pcxImagingParameters10.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory22 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters23 = pcxImagingParameters21.setBufferedImageFactory(bufferedImageFactory22);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertNotNull(pcxImagingParameters20);
        org.junit.Assert.assertNotNull(pcxImagingParameters21);
        org.junit.Assert.assertNotNull(pcxImagingParameters23);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory2 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory3);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters4.setBufferedImageFactory(bufferedImageFactory9);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters4.setBufferedImageFactory(bufferedImageFactory11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setPlanes(100);
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNull(bufferedImageFactory2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        java.lang.String str13 = pcxImagingParameters12.getFileName();
        java.lang.String str14 = pcxImagingParameters12.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters12.setBitDepth(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters12.setFileName("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setFileName("hi!");
        int int12 = pcxImagingParameters11.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters11.setBitDepth((int) (short) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters11.setBitDepth(97);
        java.lang.Class<?> wildcardClass17 = pcxImagingParameters16.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters5.getBufferedImageFactory();
        boolean boolean9 = pcxImagingParameters5.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNull(bufferedImageFactory8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.setStrict(true);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setBufferedImageFactory(bufferedImageFactory7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        int int6 = pcxImagingParameters5.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity7 = pcxImagingParameters5.getPixelDensity();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(pixelDensity7);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setStrict(false);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory11);
        int int13 = pcxImagingParameters12.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity14 = pcxImagingParameters12.getPixelDensity();
        int int15 = pcxImagingParameters12.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity16 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters12.setPixelDensity(pixelDensity16);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters12.setFileName("");
        boolean boolean20 = pcxImagingParameters12.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(bufferedImageFactory6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNull(pixelDensity14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.PixelDensity pixelDensity4 = pcxImagingParameters0.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setStrict(true);
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setPixelDensity(pixelDensity9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNull(pixelDensity4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setPixelDensity(pixelDensity6);
        int int8 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters3.setPlanes((int) '4');
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = pcxImagingParameters10.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setFileName("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(bufferedImageFactory11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters5.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setPixelDensity(pixelDensity8);
        boolean boolean10 = pcxImagingParameters9.isStrict();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNull(bufferedImageFactory7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        java.lang.String str9 = pcxImagingParameters6.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters6.getBufferedImageFactory();
        int int11 = pcxImagingParameters6.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(bufferedImageFactory10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        java.lang.String str3 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setStrict(false);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setCompression(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setBitDepth(10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters7.setPlanes((int) (short) 1);
        int int12 = pcxImagingParameters11.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setPlanes((int) (byte) 10);
        int int7 = pcxImagingParameters0.getPlanes();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters0.setPixelDensity(pixelDensity9);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters0.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters0.setCompression(100);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory16 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters0.setBufferedImageFactory(bufferedImageFactory16);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setCompression((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setBitDepth(1);
        int int16 = pcxImagingParameters15.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setCompression((int) (byte) 0);
        boolean boolean14 = pcxImagingParameters10.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters10.setCompression((int) 'a');
        org.apache.commons.imaging.PixelDensity pixelDensity17 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters10.setPixelDensity(pixelDensity17);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        int int5 = pcxImagingParameters4.getCompression();
        int int6 = pcxImagingParameters4.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters4.setBufferedImageFactory(bufferedImageFactory9);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setCompression((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setFileName("hi!");
        java.lang.Class<?> wildcardClass15 = pcxImagingParameters14.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBitDepth(0);
        int int6 = pcxImagingParameters5.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setFileName("hi!");
        int int9 = pcxImagingParameters8.getBitDepth();
        int int10 = pcxImagingParameters8.getPlanes();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setCompression((int) (short) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setPlanes((-1));
        boolean boolean10 = pcxImagingParameters7.isStrict();
        java.lang.Class<?> wildcardClass11 = pcxImagingParameters7.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters5.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = pcxImagingParameters5.getBufferedImageFactory();
        java.lang.Class<?> wildcardClass8 = pcxImagingParameters5.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNull(bufferedImageFactory7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters14.asThis();
        int int16 = pcxImagingParameters15.getPlanes();
        java.lang.String str17 = pcxImagingParameters15.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters15.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity20 = pcxImagingParameters15.getPixelDensity();
        int int21 = pcxImagingParameters15.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
        org.junit.Assert.assertNull(pixelDensity20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        boolean boolean11 = pcxImagingParameters10.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setPlanes(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        java.lang.String str13 = pcxImagingParameters12.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = pcxImagingParameters12.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters12.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters12.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters18.setBitDepth(1);
        org.apache.commons.imaging.PixelDensity pixelDensity21 = pcxImagingParameters18.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(bufferedImageFactory14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertNotNull(pcxImagingParameters20);
        org.junit.Assert.assertNull(pixelDensity21);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBitDepth((int) (short) 10);
        int int9 = pcxImagingParameters6.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters6.setPixelDensity(pixelDensity10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBitDepth(0);
        int int8 = pcxImagingParameters7.getPlanes();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.PixelDensity pixelDensity3 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters2.setPixelDensity(pixelDensity3);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = pcxImagingParameters4.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.asThis();
        int int7 = pcxImagingParameters6.getCompression();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNull(bufferedImageFactory5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setBitDepth((int) (byte) 10);
        int int4 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = pcxImagingParameters3.getPixelDensity();
        int int6 = pcxImagingParameters3.getCompression();
        int int7 = pcxImagingParameters3.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setBitDepth((int) (byte) -1);
        int int12 = pcxImagingParameters11.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pixelDensity5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters10.setBitDepth(100);
        org.apache.commons.imaging.PixelDensity pixelDensity17 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters16.setPixelDensity(pixelDensity17);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters20 = pcxImagingParameters16.setBitDepth((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
        org.junit.Assert.assertNotNull(pcxImagingParameters20);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory10);
        org.apache.commons.imaging.PixelDensity pixelDensity12 = pcxImagingParameters11.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNull(pixelDensity12);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        int int9 = pcxImagingParameters8.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters8.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setStrict(true);
        boolean boolean13 = pcxImagingParameters12.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(bufferedImageFactory10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory10 = pcxImagingParameters8.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setCompression((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(bufferedImageFactory10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        java.lang.String str3 = pcxImagingParameters0.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression(100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters0.setFileName("");
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setBitDepth((int) (byte) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setBitDepth((int) '#');
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setPixelDensity(pixelDensity9);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory11);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters8.setStrict(true);
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory8 = pcxImagingParameters6.getBufferedImageFactory();
        java.lang.String str9 = pcxImagingParameters6.getFileName();
        int int10 = pcxImagingParameters6.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters6.setFileName("hi!");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setFileName("hi!");
        int int15 = pcxImagingParameters12.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(bufferedImageFactory8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters0.setFileName("hi!");
        org.apache.commons.imaging.PixelDensity pixelDensity9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters0.setPixelDensity(pixelDensity9);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters0.setStrict(true);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters13.setBufferedImageFactory(bufferedImageFactory14);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters13.asThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters3.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters3.setCompression((int) ' ');
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters9.setPlanes((int) 'a');
        boolean boolean12 = pcxImagingParameters11.isStrict();
        java.lang.String str13 = pcxImagingParameters11.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters11.setFileName("hi!");
        int int16 = pcxImagingParameters15.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters1 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression(10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.asThis();
        int int7 = pcxImagingParameters0.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters1);
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        int int5 = pcxImagingParameters4.getCompression();
        int int6 = pcxImagingParameters4.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters4.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters4.setBufferedImageFactory(bufferedImageFactory9);
        java.lang.String str11 = pcxImagingParameters4.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters4.setCompression(0);
        boolean boolean14 = pcxImagingParameters13.isStrict();
        org.apache.commons.imaging.PixelDensity pixelDensity15 = pcxImagingParameters13.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(pixelDensity15);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setCompression((int) (byte) 0);
        boolean boolean14 = pcxImagingParameters13.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        java.lang.String str13 = pcxImagingParameters12.getFileName();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory14 = pcxImagingParameters12.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters12.setFileName("hi!");
        int int17 = pcxImagingParameters12.getPlanes();
        int int18 = pcxImagingParameters12.getCompression();
        java.lang.Class<?> wildcardClass19 = pcxImagingParameters12.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(bufferedImageFactory14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setCompression((int) (short) 100);
        java.lang.String str9 = pcxImagingParameters6.getFileName();
        int int10 = pcxImagingParameters6.getPlanes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        boolean boolean3 = pcxImagingParameters2.isStrict();
        org.apache.commons.imaging.PixelDensity pixelDensity4 = pcxImagingParameters2.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters2.setStrict(true);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setFileName("hi!");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = pcxImagingParameters6.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(pixelDensity4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNull(bufferedImageFactory9);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        org.apache.commons.imaging.PixelDensity pixelDensity13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters10.setPixelDensity(pixelDensity13);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters16 = pcxImagingParameters10.setBitDepth(100);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters18 = pcxImagingParameters10.setCompression(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertNotNull(pcxImagingParameters16);
        org.junit.Assert.assertNotNull(pcxImagingParameters18);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setPixelDensity(pixelDensity7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters8.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters8.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters8.setFileName("hi!");
        java.lang.String str14 = pcxImagingParameters13.getFileName();
        int int15 = pcxImagingParameters13.getPlanes();
        java.lang.Class<?> wildcardClass16 = pcxImagingParameters13.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setCompression(1);
        int int5 = pcxImagingParameters4.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters4.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters6.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters6.setFileName("hi!");
        java.lang.String str12 = pcxImagingParameters11.getFileName();
        int int13 = pcxImagingParameters11.getCompression();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (byte) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPlanes((-1));
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory13 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters14 = pcxImagingParameters12.setBufferedImageFactory(bufferedImageFactory13);
        boolean boolean15 = pcxImagingParameters14.isStrict();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory16 = pcxImagingParameters14.getBufferedImageFactory();
        org.apache.commons.imaging.PixelDensity pixelDensity17 = pcxImagingParameters14.getPixelDensity();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(pcxImagingParameters14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(bufferedImageFactory16);
        org.junit.Assert.assertNull(pixelDensity17);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.PixelDensity pixelDensity2 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPixelDensity(pixelDensity2);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters3.setBufferedImageFactory(bufferedImageFactory4);
        java.lang.String str6 = pcxImagingParameters5.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters5.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setFileName("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBitDepth((int) (short) 10);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setStrict(false);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setFileName("hi!");
        java.lang.Class<?> wildcardClass13 = pcxImagingParameters10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        int int7 = pcxImagingParameters6.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = pcxImagingParameters6.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setCompression(1);
        java.lang.Class<?> wildcardClass11 = pcxImagingParameters6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(pixelDensity8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setBitDepth((int) (short) 100);
        org.apache.commons.imaging.PixelDensity pixelDensity11 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters12 = pcxImagingParameters10.setPixelDensity(pixelDensity11);
        int int13 = pcxImagingParameters12.getCompression();
        int int14 = pcxImagingParameters12.getBitDepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertNotNull(pcxImagingParameters12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setFileName("");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.setBufferedImageFactory(bufferedImageFactory7);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters6.setPlanes((int) (short) 10);
        java.lang.String str11 = pcxImagingParameters10.getFileName();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters13 = pcxImagingParameters10.setFileName("");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters15 = pcxImagingParameters10.setFileName("");
        int int16 = pcxImagingParameters10.getBitDepth();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters17 = pcxImagingParameters10.asThis();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters19 = pcxImagingParameters10.setPlanes(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(pcxImagingParameters13);
        org.junit.Assert.assertNotNull(pcxImagingParameters15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters17);
        org.junit.Assert.assertNotNull(pcxImagingParameters19);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.PixelDensity pixelDensity6 = pcxImagingParameters5.getPixelDensity();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory7 = pcxImagingParameters5.getBufferedImageFactory();
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters5.setPixelDensity(pixelDensity8);
        int int10 = pcxImagingParameters5.getBitDepth();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNull(pixelDensity6);
        org.junit.Assert.assertNull(bufferedImageFactory7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters0.getBufferedImageFactory();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters0.setCompression((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory6 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters5.setBufferedImageFactory(bufferedImageFactory6);
        int int8 = pcxImagingParameters7.getBitDepth();
        org.apache.commons.imaging.PixelDensity pixelDensity9 = pcxImagingParameters7.getPixelDensity();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters11 = pcxImagingParameters7.setStrict(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(pixelDensity9);
        org.junit.Assert.assertNotNull(pcxImagingParameters11);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters3 = pcxImagingParameters0.setPlanes((int) (short) 1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.asThis();
        int int5 = pcxImagingParameters4.getCompression();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters4.setBitDepth((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters3);
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters2 = pcxImagingParameters0.setBitDepth((int) (byte) -1);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory3 = pcxImagingParameters2.getBufferedImageFactory();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory4 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters5 = pcxImagingParameters2.setBufferedImageFactory(bufferedImageFactory4);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters7 = pcxImagingParameters2.setPlanes((int) '4');
        org.apache.commons.imaging.PixelDensity pixelDensity8 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters9 = pcxImagingParameters7.setPixelDensity(pixelDensity8);
        org.apache.commons.imaging.PixelDensity pixelDensity10 = pcxImagingParameters9.getPixelDensity();
        java.lang.Class<?> wildcardClass11 = pcxImagingParameters9.getClass();
        org.junit.Assert.assertNotNull(pcxImagingParameters2);
        org.junit.Assert.assertNull(bufferedImageFactory3);
        org.junit.Assert.assertNotNull(pcxImagingParameters5);
        org.junit.Assert.assertNotNull(pcxImagingParameters7);
        org.junit.Assert.assertNotNull(pcxImagingParameters9);
        org.junit.Assert.assertNull(pixelDensity10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters0 = new org.apache.commons.imaging.formats.pcx.PcxImagingParameters();
        int int1 = pcxImagingParameters0.getPlanes();
        int int2 = pcxImagingParameters0.getPlanes();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters4 = pcxImagingParameters0.setPlanes(1);
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters6 = pcxImagingParameters0.setCompression((int) (short) 0);
        boolean boolean7 = pcxImagingParameters6.isStrict();
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters8 = pcxImagingParameters6.asThis();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory9 = null;
        org.apache.commons.imaging.formats.pcx.PcxImagingParameters pcxImagingParameters10 = pcxImagingParameters8.setBufferedImageFactory(bufferedImageFactory9);
        boolean boolean11 = pcxImagingParameters8.isStrict();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(pcxImagingParameters4);
        org.junit.Assert.assertNotNull(pcxImagingParameters6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pcxImagingParameters8);
        org.junit.Assert.assertNotNull(pcxImagingParameters10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }
}

