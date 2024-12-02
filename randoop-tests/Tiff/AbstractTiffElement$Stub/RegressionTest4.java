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
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (-1), (int) (short) 10);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 10, last: 9" + "'", str3, "Element, offset: -1, length: 10, last: 9");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, (int) ' ');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str3, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str4, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str5, "Element, offset: 1, length: 32, last: 33");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        long long5 = stub2.offset;
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str7, "Element, offset: 0, length: -1, last: -1");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str6, "Element, offset: 0, length: -1, last: -1");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, 32);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str3, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str5, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 0, (int) (short) 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str4, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str6, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 52, (int) (byte) 0);
        long long3 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (byte) 100);
        int int3 = stub2.length;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 100, last: 99" + "'", str5, "Element, offset: -1, length: 100, last: 99");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, (int) (byte) 100);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 100, last: 200" + "'", str3, "Element, offset: 100, length: 100, last: 200");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        int int7 = stub2.length;
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str8, "Element, offset: -1, length: 0, last: -1");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, 97);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 1, (int) 'a');
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 32, 35);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) 'a');
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 97, last: 97" + "'", str3, "Element, offset: 0, length: 97, last: 97");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', 97);
        long long3 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass9 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str6, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str7, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str8, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, 32);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        int int8 = stub2.length;
        java.lang.String str9 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str3, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str4, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str5, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str9, "Element, offset: 10, length: 32, last: 42");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        long long9 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str8, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 10, 1);
        int int3 = stub2.length;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        long long7 = stub2.offset;
        long long8 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 1, last: 11" + "'", str5, "Element, offset: 10, length: 1, last: 11");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 0, (int) (byte) 1);
        long long3 = stub2.offset;
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, (int) '#');
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 35, last: 45" + "'", str4, "Element, offset: 10, length: 35, last: 45");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str5, "Element, offset: -1, length: 1, last: 0");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 35, (int) ' ');
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) ' ');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str3, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str4, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str5, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str6, "Element, offset: 1, length: 32, last: 33");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', (int) 'a');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 35, length: 97, last: 132" + "'", str3, "Element, offset: 35, length: 97, last: 132");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 35, length: 97, last: 132" + "'", str4, "Element, offset: 35, length: 97, last: 132");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 35, length: 97, last: 132" + "'", str5, "Element, offset: 35, length: 97, last: 132");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        long long8 = stub2.offset;
        int int9 = stub2.length;
        long long10 = stub2.offset;
        java.lang.String str11 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str5, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str11, "Element, offset: -1, length: 1, last: 0");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', 100);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        int int9 = stub2.length;
        int int10 = stub2.length;
        int int11 = stub2.length;
        java.lang.String str12 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str12, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 0, (int) (short) 0);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str4, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str5, "Element, offset: 0, length: 0, last: 0");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', (int) (short) 100);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 97, length: 100, last: 197" + "'", str3, "Element, offset: 97, length: 100, last: 197");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 0, (int) (short) 10);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, 1);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (-1), (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 1, 1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 1, last: 2" + "'", str3, "Element, offset: 1, length: 1, last: 2");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', (-1));
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: -1, last: 31" + "'", str3, "Element, offset: 32, length: -1, last: 31");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 32, length: -1, last: 31" + "'", str6, "Element, offset: 32, length: -1, last: 31");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, 97);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        int int5 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 97, last: 197" + "'", str3, "Element, offset: 100, length: 97, last: 197");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 10, (-1));
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        java.lang.String str11 = stub2.getElementDescription();
        java.lang.String str12 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str6, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str7, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str9, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str10, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str11, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str12, "Element, offset: 0, length: -1, last: -1");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', 100);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str3, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str5, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str8, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str9, "Element, offset: 32, length: 100, last: 132");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        java.lang.String str11 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str6, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str7, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str9, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str10, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str11, "Element, offset: 0, length: -1, last: -1");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 1, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 0, last: 1" + "'", str4, "Element, offset: 1, length: 0, last: 1");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str5, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str6, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (byte) 100);
        long long3 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, (int) ' ');
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        long long9 = stub2.offset;
        java.lang.String str10 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str4, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str7, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str10, "Element, offset: 1, length: 32, last: 33");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '4', (int) 'a');
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 52, length: 97, last: 149" + "'", str3, "Element, offset: 52, length: 97, last: 149");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 52, length: 97, last: 149" + "'", str6, "Element, offset: 52, length: 97, last: 149");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 0, (int) (short) 0);
        int int3 = stub2.length;
        long long4 = stub2.offset;
        int int5 = stub2.length;
        int int6 = stub2.length;
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        long long9 = stub2.offset;
        java.lang.String str10 = stub2.getElementDescription();
        java.lang.String str11 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass12 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str8, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str10, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str11, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 1, (int) (byte) -1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: -1, last: 0" + "'", str4, "Element, offset: 1, length: -1, last: 0");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(35L, (int) (short) 100);
        int int3 = stub2.length;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 35, length: 100, last: 135" + "'", str5, "Element, offset: 35, length: 100, last: 135");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 100);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (-1), (int) (short) -1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        java.lang.String str9 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str3, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str5, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str6, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str7, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str9, "Element, offset: -1, length: -1, last: -2");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', 1);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        java.lang.Class<?> wildcardClass8 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 97, length: 1, last: 98" + "'", str5, "Element, offset: 97, length: 1, last: 98");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 97, length: 1, last: 98" + "'", str6, "Element, offset: 97, length: 1, last: 98");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, 0);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, (int) '4');
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 52, last: 152" + "'", str3, "Element, offset: 100, length: 52, last: 152");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        int int7 = stub2.length;
        java.lang.String str8 = stub2.getElementDescription();
        long long9 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str5, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str8, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str3, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str4, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str5, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str7, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str8, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str9, "Element, offset: 32, length: 100, last: 132");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str8, "Element, offset: -1, length: 1, last: 0");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        int int6 = stub2.length;
        long long7 = stub2.offset;
        int int8 = stub2.length;
        long long9 = stub2.offset;
        java.lang.String str10 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str10, "Element, offset: -1, length: 0, last: -1");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, 10);
        int int3 = stub2.length;
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 100, (int) 'a');
        long long3 = stub2.offset;
        int int4 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str3, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str4, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str5, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str6, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str7, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str8, "Element, offset: 32, length: 100, last: 132");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) 'a');
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 97, last: 97" + "'", str3, "Element, offset: 0, length: 97, last: 97");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 32, (int) (short) 100);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str6, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str7, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(97L, 100);
        long long3 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) ' ');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        int int6 = stub2.length;
        int int7 = stub2.length;
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str3, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str4, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str8, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str9, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str10, "Element, offset: 1, length: 32, last: 33");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(100L, (int) (byte) 10);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 10, last: 110" + "'", str3, "Element, offset: 100, length: 10, last: 110");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str6, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str8, "Element, offset: -1, length: 0, last: -1");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, 52);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 52, last: 53" + "'", str4, "Element, offset: 1, length: 52, last: 53");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) 10);
        long long3 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(100L, 32);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 32, last: 132" + "'", str3, "Element, offset: 100, length: 32, last: 132");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 100, length: 32, last: 132" + "'", str4, "Element, offset: 100, length: 32, last: 132");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 100, length: 32, last: 132" + "'", str5, "Element, offset: 100, length: 32, last: 132");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        int int5 = stub2.length;
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str7, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str8, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str9, "Element, offset: -1, length: 1, last: 0");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str6, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str8, "Element, offset: 0, length: -1, last: -1");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str7, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str8, "Element, offset: -1, length: 1, last: 0");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 1, (int) 'a');
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 97, last: 98" + "'", str4, "Element, offset: 1, length: 97, last: 98");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(97L, (int) (short) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        long long6 = stub2.offset;
        int int7 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 97, length: -1, last: 96" + "'", str3, "Element, offset: 97, length: -1, last: 96");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 97, length: -1, last: 96" + "'", str4, "Element, offset: 97, length: -1, last: 96");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 35, (int) (short) -1);
        long long3 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', 0);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 35, length: 0, last: 35" + "'", str5, "Element, offset: 35, length: 0, last: 35");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 1, last: 101" + "'", str3, "Element, offset: 100, length: 1, last: 101");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 100, length: 1, last: 101" + "'", str4, "Element, offset: 100, length: 1, last: 101");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, (int) (byte) 10);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', (int) (short) 10);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 97, length: 10, last: 107" + "'", str4, "Element, offset: 97, length: 10, last: 107");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 97, length: 10, last: 107" + "'", str5, "Element, offset: 97, length: 10, last: 107");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(100L, 32);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        long long6 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, (int) '#');
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 35, last: 45" + "'", str4, "Element, offset: 10, length: 35, last: 45");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 35, last: 45" + "'", str5, "Element, offset: 10, length: 35, last: 45");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 35, last: 45" + "'", str6, "Element, offset: 10, length: 35, last: 45");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 1, (int) (byte) 1);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 1, last: 2" + "'", str3, "Element, offset: 1, length: 1, last: 2");
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', (int) (short) 100);
        long long3 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(52L, (int) (byte) 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 52, length: 0, last: 52" + "'", str3, "Element, offset: 52, length: 0, last: 52");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 52, length: 0, last: 52" + "'", str4, "Element, offset: 52, length: 0, last: 52");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        int int9 = stub2.length;
        java.lang.String str10 = stub2.getElementDescription();
        long long11 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str8, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str10, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', 0);
        int int3 = stub2.length;
        int int4 = stub2.length;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        long long8 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 35, length: 0, last: 35" + "'", str6, "Element, offset: 35, length: 0, last: 35");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, 100);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 100, last: 100" + "'", str3, "Element, offset: 0, length: 100, last: 100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 100, last: 100" + "'", str5, "Element, offset: 0, length: 100, last: 100");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, 32);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str3, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str5, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str6, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str7, "Element, offset: 10, length: 32, last: 42");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, (int) (byte) -1);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) -1);
        int int3 = stub2.length;
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        long long6 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) -1, (-1));
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str3, "Element, offset: -1, length: -1, last: -2");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(32L, (int) '#');
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 10, 52);
        long long3 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        int int3 = stub2.length;
        int int4 = stub2.length;
        long long5 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, (int) (short) 100);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 100, length: 100, last: 200" + "'", str4, "Element, offset: 100, length: 100, last: 200");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 100, length: 100, last: 200" + "'", str5, "Element, offset: 100, length: 100, last: 200");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) 'a');
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 97, last: 97" + "'", str4, "Element, offset: 0, length: 97, last: 97");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) (byte) 1);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 1, last: 2" + "'", str3, "Element, offset: 1, length: 1, last: 2");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(32L, 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 1, last: 33" + "'", str3, "Element, offset: 32, length: 1, last: 33");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 1, last: 33" + "'", str4, "Element, offset: 32, length: 1, last: 33");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 32, length: 1, last: 33" + "'", str6, "Element, offset: 32, length: 1, last: 33");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 32, length: 1, last: 33" + "'", str7, "Element, offset: 32, length: 1, last: 33");
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', 52);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        int int9 = stub2.length;
        java.lang.String str10 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str4, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str5, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str6, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str7, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str10, "Element, offset: 0, length: 0, last: 0");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', 32);
        int int3 = stub2.length;
        int int4 = stub2.length;
        int int5 = stub2.length;
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 52, (int) ' ');
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 52, length: 32, last: 84" + "'", str4, "Element, offset: 52, length: 32, last: 84");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 52, length: 32, last: 84" + "'", str5, "Element, offset: 52, length: 32, last: 84");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, 100);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 100, last: 100" + "'", str3, "Element, offset: 0, length: 100, last: 100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 100, last: 100" + "'", str6, "Element, offset: 0, length: 100, last: 100");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: 100, last: 100" + "'", str8, "Element, offset: 0, length: 100, last: 100");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        int int7 = stub2.length;
        int int8 = stub2.length;
        java.lang.String str9 = stub2.getElementDescription();
        long long10 = stub2.offset;
        java.lang.String str11 = stub2.getElementDescription();
        int int12 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str4, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str5, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str9, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str11, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 100, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 1, last: 101" + "'", str3, "Element, offset: 100, length: 1, last: 101");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 100, length: 1, last: 101" + "'", str4, "Element, offset: 100, length: 1, last: 101");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 32, 35);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 35, last: 67" + "'", str3, "Element, offset: 32, length: 35, last: 67");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 35, last: 67" + "'", str4, "Element, offset: 32, length: 35, last: 67");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 97, 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 97, length: 1, last: 98" + "'", str3, "Element, offset: 97, length: 1, last: 98");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 97, length: 1, last: 98" + "'", str4, "Element, offset: 97, length: 1, last: 98");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 0, (int) (byte) 1);
        int int3 = stub2.length;
        long long4 = stub2.offset;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 1, last: 1" + "'", str6, "Element, offset: 0, length: 1, last: 1");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(35L, (int) (short) 100);
        int int3 = stub2.length;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        int int7 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 35, length: 100, last: 135" + "'", str5, "Element, offset: 35, length: 100, last: 135");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 0, (int) (byte) 0);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str6, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) ' ');
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str3, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str5, "Element, offset: 1, length: 32, last: 33");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 0, (int) (short) 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        long long6 = stub2.offset;
        int int7 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(100L, (int) (byte) 100);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 32, (int) (short) 100);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str5, "Element, offset: 32, length: 100, last: 132");
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        long long8 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str6, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(100L, 32);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        long long7 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 100, length: 32, last: 132" + "'", str5, "Element, offset: 100, length: 32, last: 132");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        int int8 = stub2.length;
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        java.lang.String str11 = stub2.getElementDescription();
        java.lang.String str12 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass13 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str3, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str7, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str9, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str10, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str11, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str12, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 32);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', (int) ' ');
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        long long5 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 32, last: 64" + "'", str3, "Element, offset: 32, length: 32, last: 64");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        int int8 = stub2.length;
        java.lang.String str9 = stub2.getElementDescription();
        long long10 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str4, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str5, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str6, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str7, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str9, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', (int) (short) 10);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 97, length: 10, last: 107" + "'", str4, "Element, offset: 97, length: 10, last: 107");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 97, length: 10, last: 107" + "'", str5, "Element, offset: 97, length: 10, last: 107");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 97, length: 10, last: 107" + "'", str6, "Element, offset: 97, length: 10, last: 107");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        int int8 = stub2.length;
        java.lang.String str9 = stub2.getElementDescription();
        long long10 = stub2.offset;
        long long11 = stub2.offset;
        java.lang.String str12 = stub2.getElementDescription();
        long long13 = stub2.offset;
        long long14 = stub2.offset;
        long long15 = stub2.offset;
        java.lang.String str16 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str6, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str9, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str12, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str16, "Element, offset: -1, length: 0, last: -1");
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(35L, 1);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        int int5 = stub2.length;
        int int6 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, (int) '#');
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 35, last: 45" + "'", str3, "Element, offset: 10, length: 35, last: 45");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str3, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', (int) '#');
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 35, length: 35, last: 70" + "'", str4, "Element, offset: 35, length: 35, last: 70");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        long long10 = stub2.offset;
        java.lang.String str11 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str11, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        int int8 = stub2.length;
        java.lang.String str9 = stub2.getElementDescription();
        long long10 = stub2.offset;
        long long11 = stub2.offset;
        java.lang.String str12 = stub2.getElementDescription();
        long long13 = stub2.offset;
        long long14 = stub2.offset;
        int int15 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str6, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str9, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str12, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, (int) (byte) 1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 100, length: 1, last: 101" + "'", str4, "Element, offset: 100, length: 1, last: 101");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 100, length: 1, last: 101" + "'", str5, "Element, offset: 100, length: 1, last: 101");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', 97);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 97, length: 97, last: 194" + "'", str3, "Element, offset: 97, length: 97, last: 194");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(32L, 100);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        int int7 = stub2.length;
        java.lang.Class<?> wildcardClass8 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        long long8 = stub2.offset;
        java.lang.String str9 = stub2.getElementDescription();
        int int10 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str6, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str9, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 35, (int) (short) 10);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 35, length: 10, last: 45" + "'", str3, "Element, offset: 35, length: 10, last: 45");
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 100, (int) (short) 1);
        int int3 = stub2.length;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 100, length: 1, last: 101" + "'", str5, "Element, offset: 100, length: 1, last: 101");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 100, length: 1, last: 101" + "'", str6, "Element, offset: 100, length: 1, last: 101");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(32L, (int) (short) 1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 1, last: 33" + "'", str4, "Element, offset: 32, length: 1, last: 33");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 32, length: 1, last: 33" + "'", str6, "Element, offset: 32, length: 1, last: 33");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        long long8 = stub2.offset;
        int int9 = stub2.length;
        java.lang.String str10 = stub2.getElementDescription();
        long long11 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str3, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str4, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str5, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str10, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str3, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: -1, last: 9" + "'", str3, "Element, offset: 10, length: -1, last: 9");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: -1, last: 9" + "'", str4, "Element, offset: 10, length: -1, last: 9");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(35L, (int) (short) 10);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 35, length: 10, last: 45" + "'", str3, "Element, offset: 35, length: 10, last: 45");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 35, length: 10, last: 45" + "'", str4, "Element, offset: 35, length: 10, last: 45");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 35, length: 10, last: 45" + "'", str5, "Element, offset: 35, length: 10, last: 45");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 35, length: 10, last: 45" + "'", str6, "Element, offset: 35, length: 10, last: 45");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, 32);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        int int8 = stub2.length;
        int int9 = stub2.length;
        java.lang.String str10 = stub2.getElementDescription();
        java.lang.String str11 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str10, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str11, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(100L, 32);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass8 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 100, length: 32, last: 132" + "'", str6, "Element, offset: 100, length: 32, last: 132");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 100, length: 32, last: 132" + "'", str7, "Element, offset: 100, length: 32, last: 132");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, 32);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        long long5 = stub2.offset;
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass9 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str3, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str7, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str8, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        int int9 = stub2.length;
        java.lang.String str10 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str10, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', 1);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        long long8 = stub2.offset;
        java.lang.String str9 = stub2.getElementDescription();
        long long10 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 97, length: 1, last: 98" + "'", str6, "Element, offset: 97, length: 1, last: 98");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 97, length: 1, last: 98" + "'", str9, "Element, offset: 97, length: 1, last: 98");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 10, (int) (short) 0);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(32L, (int) (short) 1);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, (int) '4');
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 52, last: 62" + "'", str3, "Element, offset: 10, length: 52, last: 62");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 10, (int) (byte) 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        int int6 = stub2.length;
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) '#');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 35, last: 35" + "'", str3, "Element, offset: 0, length: 35, last: 35");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 35, last: 35" + "'", str4, "Element, offset: 0, length: 35, last: 35");
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 52, 32);
        int int3 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, (int) (byte) 100);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 100, last: 101" + "'", str4, "Element, offset: 1, length: 100, last: 101");
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        int int6 = stub2.length;
        int int7 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str4, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) '4');
        long long3 = stub2.offset;
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', (-1));
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: -1, last: 31" + "'", str4, "Element, offset: 32, length: -1, last: 31");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, (int) '4');
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 52, last: 62" + "'", str4, "Element, offset: 10, length: 52, last: 62");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(97L, (int) (short) 10);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 97, length: 10, last: 107" + "'", str3, "Element, offset: 97, length: 10, last: 107");
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, (int) (short) 0);
        long long3 = stub2.offset;
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, (int) ' ');
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str4, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str7, "Element, offset: 1, length: 32, last: 33");
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass9 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str6, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str7, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str8, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(52L, (-1));
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) (short) 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 100, last: 101" + "'", str3, "Element, offset: 1, length: 100, last: 101");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 100, last: 101" + "'", str4, "Element, offset: 1, length: 100, last: 101");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, 10);
        long long3 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 100, (int) (short) -1);
        int int3 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 100, (int) (byte) 10);
        long long3 = stub2.offset;
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        long long8 = stub2.offset;
        int int9 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        long long10 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', (int) 'a');
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 35, length: 97, last: 132" + "'", str4, "Element, offset: 35, length: 97, last: 132");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 35, length: 97, last: 132" + "'", str6, "Element, offset: 35, length: 97, last: 132");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 35, length: 97, last: 132" + "'", str8, "Element, offset: 35, length: 97, last: 132");
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '4', (int) '#');
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 52, length: 35, last: 87" + "'", str3, "Element, offset: 52, length: 35, last: 87");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 52, length: 35, last: 87" + "'", str5, "Element, offset: 52, length: 35, last: 87");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 0, (int) (short) 0);
        int int3 = stub2.length;
        long long4 = stub2.offset;
        int int5 = stub2.length;
        int int6 = stub2.length;
        int int7 = stub2.length;
        long long8 = stub2.offset;
        int int9 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, (int) (byte) 10);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 100, length: 10, last: 110" + "'", str6, "Element, offset: 100, length: 10, last: 110");
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 97, (-1));
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, 32);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str3, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str4, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str5, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str6, "Element, offset: 10, length: 32, last: 42");
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        long long8 = stub2.offset;
        long long9 = stub2.offset;
        java.lang.String str10 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str4, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str5, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str6, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str10, "Element, offset: 0, length: 0, last: 0");
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(97L, (int) (short) 0);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '4', (int) 'a');
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 52, length: 97, last: 149" + "'", str3, "Element, offset: 52, length: 97, last: 149");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 52, length: 97, last: 149" + "'", str5, "Element, offset: 52, length: 97, last: 149");
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, 97);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 97, last: 197" + "'", str3, "Element, offset: 100, length: 97, last: 197");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 100, length: 97, last: 197" + "'", str5, "Element, offset: 100, length: 97, last: 197");
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 1, 35);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 35, last: 36" + "'", str3, "Element, offset: 1, length: 35, last: 36");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        int int8 = stub2.length;
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        java.lang.String str11 = stub2.getElementDescription();
        int int12 = stub2.length;
        java.lang.String str13 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str6, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str9, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str10, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str11, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str13, "Element, offset: -1, length: 0, last: -1");
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(100L, 32);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        int int8 = stub2.length;
        java.lang.String str9 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 100, length: 32, last: 132" + "'", str6, "Element, offset: 100, length: 32, last: 132");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 100, length: 32, last: 132" + "'", str9, "Element, offset: 100, length: 32, last: 132");
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, (int) ' ');
        long long3 = stub2.offset;
        int int4 = stub2.length;
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 0, (int) 'a');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 97, last: 97" + "'", str3, "Element, offset: 0, length: 97, last: 97");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, 52);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 52, last: 52" + "'", str3, "Element, offset: 0, length: 52, last: 52");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 52, last: 52" + "'", str4, "Element, offset: 0, length: 52, last: 52");
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 1, last: 11" + "'", str3, "Element, offset: 10, length: 1, last: 11");
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        long long9 = stub2.offset;
        long long10 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str3, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str4, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str5, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str6, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str7, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str8, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str5, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str7, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str8, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str9, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str10, "Element, offset: 0, length: 0, last: 0");
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) -1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        int int6 = stub2.length;
        int int7 = stub2.length;
        int int8 = stub2.length;
        long long9 = stub2.offset;
        long long10 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 10, (int) '4');
        int int3 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, 32);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str3, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 0, (int) (short) 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        long long8 = stub2.offset;
        java.lang.String str9 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str9, "Element, offset: 0, length: 0, last: 0");
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) -1, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str3, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str4, "Element, offset: -1, length: -1, last: -2");
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', (int) ' ');
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 97, length: 32, last: 129" + "'", str4, "Element, offset: 97, length: 32, last: 129");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, (int) ' ');
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        java.lang.String str9 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str4, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str7, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str9, "Element, offset: 1, length: 32, last: 33");
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(100L, 32);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        int int6 = stub2.length;
        int int7 = stub2.length;
        long long8 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 32, last: 132" + "'", str3, "Element, offset: 100, length: 32, last: 132");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 100, length: 32, last: 132" + "'", str4, "Element, offset: 100, length: 32, last: 132");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (-1), (int) ' ');
        int int3 = stub2.length;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 32, last: 31" + "'", str5, "Element, offset: -1, length: 32, last: 31");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 32, last: 31" + "'", str6, "Element, offset: -1, length: 32, last: 31");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 32, last: 31" + "'", str7, "Element, offset: -1, length: 32, last: 31");
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(35L, (int) (short) 1);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, (int) (short) 10);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str3, "Element, offset: 1, length: 10, last: 11");
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 1, (int) (byte) 0);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 100);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 100, last: 110" + "'", str3, "Element, offset: 10, length: 100, last: 110");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 100, last: 110" + "'", str6, "Element, offset: 10, length: 100, last: 110");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 100, last: 110" + "'", str7, "Element, offset: 10, length: 100, last: 110");
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, (int) 'a');
        long long3 = stub2.offset;
        int int4 = stub2.length;
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        int int11 = stub2.length;
        java.lang.String str12 = stub2.getElementDescription();
        java.lang.String str13 = stub2.getElementDescription();
        java.lang.String str14 = stub2.getElementDescription();
        int int15 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str10, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str12, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str13, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str14, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 10, (int) (short) 100);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 100, last: 110" + "'", str3, "Element, offset: 10, length: 100, last: 110");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 100, last: 110" + "'", str5, "Element, offset: 10, length: 100, last: 110");
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        int int9 = stub2.length;
        java.lang.String str10 = stub2.getElementDescription();
        java.lang.String str11 = stub2.getElementDescription();
        java.lang.String str12 = stub2.getElementDescription();
        long long13 = stub2.offset;
        int int14 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str5, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str7, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str10, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str11, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str12, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        long long9 = stub2.offset;
        int int10 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str3, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str4, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str5, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str6, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str7, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str8, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        java.lang.String str11 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str5, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str7, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str8, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str9, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str10, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str11, "Element, offset: -1, length: 1, last: 0");
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        long long9 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str3, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str7, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str8, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str3, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str7, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str8, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str9, "Element, offset: -1, length: 0, last: -1");
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 52, 0);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 52, length: 0, last: 52" + "'", str3, "Element, offset: 52, length: 0, last: 52");
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) ' ');
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        int int8 = stub2.length;
        java.lang.String str9 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str3, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str5, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str7, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str9, "Element, offset: 1, length: 32, last: 33");
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        int int7 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', 97);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 97, length: 97, last: 194" + "'", str4, "Element, offset: 97, length: 97, last: 194");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 97, length: 97, last: 194" + "'", str6, "Element, offset: 97, length: 97, last: 194");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(35L, (int) '#');
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, (int) (short) 10);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 10, last: 110" + "'", str3, "Element, offset: 100, length: 10, last: 110");
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', (-1));
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: -1, last: 31" + "'", str3, "Element, offset: 32, length: -1, last: 31");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: -1, last: 31" + "'", str4, "Element, offset: 32, length: -1, last: 31");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, (int) (byte) 10);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        long long6 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        int int8 = stub2.length;
        int int9 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str3, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str7, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 0, (int) '4');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 52, last: 52" + "'", str3, "Element, offset: 0, length: 52, last: 52");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 52, last: 52" + "'", str4, "Element, offset: 0, length: 52, last: 52");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (-1), (int) (short) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str3, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str4, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 1, (int) (byte) 100);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 100, last: 101" + "'", str4, "Element, offset: 1, length: 100, last: 101");
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(35L, 10);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 35, length: 10, last: 45" + "'", str3, "Element, offset: 35, length: 10, last: 45");
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 0, 32);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 100, (int) (byte) 1);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '4', 97);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 52, length: 97, last: 149" + "'", str3, "Element, offset: 52, length: 97, last: 149");
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', (int) ' ');
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        long long6 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 97, length: 32, last: 129" + "'", str4, "Element, offset: 97, length: 32, last: 129");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(97L, (int) (short) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 97, length: -1, last: 96" + "'", str3, "Element, offset: 97, length: -1, last: 96");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 97, length: -1, last: 96" + "'", str4, "Element, offset: 97, length: -1, last: 96");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 97, length: -1, last: 96" + "'", str6, "Element, offset: 97, length: -1, last: 96");
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        int int9 = stub2.length;
        java.lang.String str10 = stub2.getElementDescription();
        java.lang.String str11 = stub2.getElementDescription();
        java.lang.String str12 = stub2.getElementDescription();
        int int13 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str5, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str7, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str10, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str11, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str12, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(100L, 32);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        int int6 = stub2.length;
        int int7 = stub2.length;
        int int8 = stub2.length;
        java.lang.String str9 = stub2.getElementDescription();
        int int10 = stub2.length;
        long long11 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 32, last: 132" + "'", str3, "Element, offset: 100, length: 32, last: 132");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 100, length: 32, last: 132" + "'", str4, "Element, offset: 100, length: 32, last: 132");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 100, length: 32, last: 132" + "'", str9, "Element, offset: 100, length: 32, last: 132");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', 0);
        int int3 = stub2.length;
        int int4 = stub2.length;
        int int5 = stub2.length;
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 35, length: 0, last: 35" + "'", str7, "Element, offset: 35, length: 0, last: 35");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 35, length: 0, last: 35" + "'", str8, "Element, offset: 35, length: 0, last: 35");
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        long long10 = stub2.offset;
        java.lang.String str11 = stub2.getElementDescription();
        int int12 = stub2.length;
        java.lang.Class<?> wildcardClass13 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str11, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 100, 0);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 100, length: 0, last: 100" + "'", str5, "Element, offset: 100, length: 0, last: 100");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', 100);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str4, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str5, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str6, "Element, offset: 32, length: 100, last: 132");
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        int int8 = stub2.length;
        int int9 = stub2.length;
        int int10 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str6, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str7, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        int int11 = stub2.length;
        int int12 = stub2.length;
        int int13 = stub2.length;
        java.lang.String str14 = stub2.getElementDescription();
        java.lang.String str15 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str10, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str14, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str15, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        int int8 = stub2.length;
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        int int11 = stub2.length;
        int int12 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str3, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str7, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str9, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str10, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        long long10 = stub2.offset;
        int int11 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str7, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str8, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str9, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        int int6 = stub2.length;
        long long7 = stub2.offset;
        long long8 = stub2.offset;
        java.lang.String str9 = stub2.getElementDescription();
        long long10 = stub2.offset;
        java.lang.String str11 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str11, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str7, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str8, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str9, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str10, "Element, offset: -1, length: 1, last: 0");
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 10, 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 1, last: 11" + "'", str3, "Element, offset: 10, length: 1, last: 11");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 1, last: 11" + "'", str4, "Element, offset: 10, length: 1, last: 11");
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) '4');
        long long3 = stub2.offset;
        int int4 = stub2.length;
        int int5 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) (byte) 10);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str4, "Element, offset: 1, length: 10, last: 11");
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', 97);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 97, length: 97, last: 194" + "'", str5, "Element, offset: 97, length: 97, last: 194");
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 0, (int) (short) 0);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str4, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str6, "Element, offset: 0, length: 0, last: 0");
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, (int) (byte) 1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 1, last: 2" + "'", str4, "Element, offset: 1, length: 1, last: 2");
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) (byte) 10);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        int int7 = stub2.length;
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str3, "Element, offset: 1, length: 10, last: 11");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str5, "Element, offset: 1, length: 10, last: 11");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str8, "Element, offset: 1, length: 10, last: 11");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str9, "Element, offset: 1, length: 10, last: 11");
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        int int9 = stub2.length;
        java.lang.String str10 = stub2.getElementDescription();
        java.lang.String str11 = stub2.getElementDescription();
        java.lang.String str12 = stub2.getElementDescription();
        java.lang.String str13 = stub2.getElementDescription();
        java.lang.String str14 = stub2.getElementDescription();
        long long15 = stub2.offset;
        java.lang.String str16 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str5, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str7, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str10, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str11, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str12, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str13, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str14, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str16, "Element, offset: -1, length: 1, last: 0");
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 1, 100);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str3, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        long long11 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str6, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str7, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str8, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str9, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str10, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 100, (int) 'a');
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        int int5 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 97, last: 197" + "'", str3, "Element, offset: 100, length: 97, last: 197");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) (short) 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        int int6 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 0, last: 1" + "'", str3, "Element, offset: 1, length: 0, last: 1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 0, last: 1" + "'", str4, "Element, offset: 1, length: 0, last: 1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        int int7 = stub2.length;
        long long8 = stub2.offset;
        long long9 = stub2.offset;
        java.lang.String str10 = stub2.getElementDescription();
        java.lang.String str11 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str10, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str11, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        int int8 = stub2.length;
        java.lang.String str9 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str4, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str5, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str6, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str9, "Element, offset: 0, length: 0, last: 0");
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        java.lang.Class<?> wildcardClass8 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str3, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str4, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str5, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str6, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        long long9 = stub2.offset;
        java.lang.String str10 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str10, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) (short) 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 0, last: 1" + "'", str3, "Element, offset: 1, length: 0, last: 1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 0, last: 1" + "'", str4, "Element, offset: 1, length: 0, last: 1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 0, last: 1" + "'", str5, "Element, offset: 1, length: 0, last: 1");
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 100, (int) '4');
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', 35);
        int int3 = stub2.length;
        long long4 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (byte) 0);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        int int9 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str7, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str8, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(100L, 32);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        int int8 = stub2.length;
        java.lang.Class<?> wildcardClass9 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 100, length: 32, last: 132" + "'", str6, "Element, offset: 100, length: 32, last: 132");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', (int) (short) 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 35, length: 0, last: 35" + "'", str3, "Element, offset: 35, length: 0, last: 35");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) -1, (-1));
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str3, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        int int9 = stub2.length;
        java.lang.String str10 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str10, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '4', (-1));
        int int3 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) -1, 52);
        int int3 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 0, 1);
        long long3 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 0, 100);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        long long9 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str4, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str5, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str7, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str8, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) ' ');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str3, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str4, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str5, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str6, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str7, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str8, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str9, "Element, offset: -1, length: 1, last: 0");
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        int int9 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str3, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str7, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str8, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(35L, (int) (byte) 0);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 52);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 52, last: 62" + "'", str4, "Element, offset: 10, length: 52, last: 62");
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (-1), (int) (short) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str3, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str4, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', 1);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 97, length: 1, last: 98" + "'", str6, "Element, offset: 97, length: 1, last: 98");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 97, length: 1, last: 98" + "'", str7, "Element, offset: 97, length: 1, last: 98");
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 10);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, 100);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 100, last: 100" + "'", str4, "Element, offset: 0, length: 100, last: 100");
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        int int9 = stub2.length;
        java.lang.String str10 = stub2.getElementDescription();
        java.lang.String str11 = stub2.getElementDescription();
        java.lang.String str12 = stub2.getElementDescription();
        java.lang.String str13 = stub2.getElementDescription();
        java.lang.String str14 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str5, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str7, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str10, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str11, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str12, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str13, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str14, "Element, offset: -1, length: 1, last: 0");
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 35, (int) (byte) 10);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 35, length: 10, last: 45" + "'", str4, "Element, offset: 35, length: 10, last: 45");
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (-1));
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 52, (int) (byte) 10);
        long long3 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(32L, (int) (short) 1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 1, last: 33" + "'", str4, "Element, offset: 32, length: 1, last: 33");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 32, length: 1, last: 33" + "'", str6, "Element, offset: 32, length: 1, last: 33");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 32, length: 1, last: 33" + "'", str8, "Element, offset: 32, length: 1, last: 33");
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, (int) (byte) 10);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        int int9 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 100, length: 10, last: 110" + "'", str5, "Element, offset: 100, length: 10, last: 110");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 100, length: 10, last: 110" + "'", str6, "Element, offset: 100, length: 10, last: 110");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 100, length: 10, last: 110" + "'", str7, "Element, offset: 100, length: 10, last: 110");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 100, length: 10, last: 110" + "'", str8, "Element, offset: 100, length: 10, last: 110");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, 10);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 10, last: 9" + "'", str3, "Element, offset: -1, length: 10, last: 9");
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (-1), (int) (short) -1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str3, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str6, "Element, offset: -1, length: -1, last: -2");
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(32L, 0);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 0, last: 32" + "'", str3, "Element, offset: 32, length: 0, last: 32");
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str6, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        int int8 = stub2.length;
        java.lang.Class<?> wildcardClass9 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str3, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str4, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str5, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str6, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) ' ');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str3, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str4, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str5, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str7, "Element, offset: 1, length: 32, last: 33");
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) -1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        int int8 = stub2.length;
        int int9 = stub2.length;
        long long10 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str5, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str6, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str7, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 0, 97);
        int int3 = stub2.length;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 97, last: 97" + "'", str5, "Element, offset: 0, length: 97, last: 97");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 97, last: 97" + "'", str6, "Element, offset: 0, length: 97, last: 97");
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str3, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str4, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str5, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str6, "Element, offset: 32, length: 100, last: 132");
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 0, 97);
        int int3 = stub2.length;
        int int4 = stub2.length;
        long long5 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, (int) (byte) 10);
        int int3 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 100, 0);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 100, length: 0, last: 100" + "'", str4, "Element, offset: 100, length: 0, last: 100");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 100, length: 0, last: 100" + "'", str5, "Element, offset: 100, length: 0, last: 100");
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) (byte) 10);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str3, "Element, offset: 1, length: 10, last: 11");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 97, length: 1, last: 98" + "'", str3, "Element, offset: 97, length: 1, last: 98");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 97, length: 1, last: 98" + "'", str4, "Element, offset: 97, length: 1, last: 98");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 97, length: 1, last: 98" + "'", str5, "Element, offset: 97, length: 1, last: 98");
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(97L, (int) (byte) 10);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        long long9 = stub2.offset;
        long long10 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str8, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, (int) (short) 100);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 100, last: 200" + "'", str3, "Element, offset: 100, length: 100, last: 200");
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (byte) 1);
        int int3 = stub2.length;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str5, "Element, offset: -1, length: 1, last: 0");
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str5, "Element, offset: -1, length: 1, last: 0");
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        int int6 = stub2.length;
        long long7 = stub2.offset;
        int int8 = stub2.length;
        java.lang.String str9 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str9, "Element, offset: 0, length: -1, last: -1");
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        int int8 = stub2.length;
        long long9 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str7, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 0, (int) (byte) 1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 1, last: 1" + "'", str4, "Element, offset: 0, length: 1, last: 1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 1, last: 1" + "'", str6, "Element, offset: 0, length: 1, last: 1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: 1, last: 1" + "'", str7, "Element, offset: 0, length: 1, last: 1");
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        int int5 = stub2.length;
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass9 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str7, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str8, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        int int6 = stub2.length;
        int int7 = stub2.length;
        java.lang.String str8 = stub2.getElementDescription();
        long long9 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 100, 32);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 32, last: 132" + "'", str3, "Element, offset: 100, length: 32, last: 132");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 1);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 35, (int) '4');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 35, length: 52, last: 87" + "'", str3, "Element, offset: 35, length: 52, last: 87");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 35, length: 52, last: 87" + "'", str4, "Element, offset: 35, length: 52, last: 87");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 35, length: 52, last: 87" + "'", str5, "Element, offset: 35, length: 52, last: 87");
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, 97);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 97, last: 197" + "'", str3, "Element, offset: 100, length: 97, last: 197");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 10);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 1, (int) 'a');
        int int3 = stub2.length;
        int int4 = stub2.length;
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        int int7 = stub2.length;
        int int8 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str4, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str5, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str3, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str4, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str5, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str6, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str7, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        int int3 = stub2.length;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str5, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', (int) 'a');
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 35, length: 97, last: 132" + "'", str3, "Element, offset: 35, length: 97, last: 132");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) -1, (int) (short) 1);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(35L, (int) (short) -1);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        int int5 = stub2.length;
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str7, "Element, offset: 0, length: -1, last: -1");
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(97L, (int) (short) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 97, length: -1, last: 96" + "'", str3, "Element, offset: 97, length: -1, last: 96");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 97, length: -1, last: 96" + "'", str4, "Element, offset: 97, length: -1, last: 96");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 97, length: -1, last: 96" + "'", str6, "Element, offset: 97, length: -1, last: 96");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 97, length: -1, last: 96" + "'", str7, "Element, offset: 97, length: -1, last: 96");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 97, length: -1, last: 96" + "'", str8, "Element, offset: 97, length: -1, last: 96");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 97, length: -1, last: 96" + "'", str9, "Element, offset: 97, length: -1, last: 96");
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 1, 1);
        int int3 = stub2.length;
        int int4 = stub2.length;
        long long5 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 0, 52);
        int int3 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass9 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        long long8 = stub2.offset;
        int int9 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str6, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        int int9 = stub2.length;
        java.lang.String str10 = stub2.getElementDescription();
        long long11 = stub2.offset;
        java.lang.String str12 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str10, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str12, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '4', (int) (short) 10);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 52, length: 10, last: 62" + "'", str3, "Element, offset: 52, length: 10, last: 62");
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass9 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str8, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 32, (int) (short) 100);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        int int8 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str5, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str6, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 35, 1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 35, length: 1, last: 36" + "'", str3, "Element, offset: 35, length: 1, last: 36");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 35, length: 1, last: 36" + "'", str5, "Element, offset: 35, length: 1, last: 36");
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        int int8 = stub2.length;
        java.lang.String str9 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str6, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str7, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str9, "Element, offset: -1, length: 0, last: -1");
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', (int) ' ');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 32, last: 64" + "'", str3, "Element, offset: 32, length: 32, last: 64");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 32, last: 64" + "'", str4, "Element, offset: 32, length: 32, last: 64");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        int int8 = stub2.length;
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        java.lang.String str11 = stub2.getElementDescription();
        java.lang.String str12 = stub2.getElementDescription();
        int int13 = stub2.length;
        int int14 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str6, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str9, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str10, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str11, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str12, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(52L, 32);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 52, length: 32, last: 84" + "'", str3, "Element, offset: 52, length: 32, last: 84");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 52, length: 32, last: 84" + "'", str4, "Element, offset: 52, length: 32, last: 84");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 52, length: 32, last: 84" + "'", str5, "Element, offset: 52, length: 32, last: 84");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 52, length: 32, last: 84" + "'", str7, "Element, offset: 52, length: 32, last: 84");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 52, length: 32, last: 84" + "'", str8, "Element, offset: 52, length: 32, last: 84");
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        long long5 = stub2.offset;
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(32L, 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        java.lang.Class<?> wildcardClass8 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 1, last: 33" + "'", str3, "Element, offset: 32, length: 1, last: 33");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 1, last: 33" + "'", str4, "Element, offset: 32, length: 1, last: 33");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 32, length: 1, last: 33" + "'", str6, "Element, offset: 32, length: 1, last: 33");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 100, 0);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 100, length: 0, last: 100" + "'", str5, "Element, offset: 100, length: 0, last: 100");
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) (byte) 1);
        long long3 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str3, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str4, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str5, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str7, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str5, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        long long10 = stub2.offset;
        java.lang.String str11 = stub2.getElementDescription();
        java.lang.String str12 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str11, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str12, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        java.lang.String str9 = stub2.getElementDescription();
        int int10 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str7, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str9, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str5, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 0, (int) 'a');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 97, last: 97" + "'", str3, "Element, offset: 0, length: 97, last: 97");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 97, last: 97" + "'", str4, "Element, offset: 0, length: 97, last: 97");
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        int int8 = stub2.length;
        java.lang.String str9 = stub2.getElementDescription();
        long long10 = stub2.offset;
        long long11 = stub2.offset;
        java.lang.String str12 = stub2.getElementDescription();
        int int13 = stub2.length;
        java.lang.String str14 = stub2.getElementDescription();
        java.lang.String str15 = stub2.getElementDescription();
        long long16 = stub2.offset;
        java.lang.Class<?> wildcardClass17 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str6, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str9, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str12, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str14, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str15, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        long long9 = stub2.offset;
        long long10 = stub2.offset;
        int int11 = stub2.length;
        java.lang.Class<?> wildcardClass12 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) (byte) 10);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str5, "Element, offset: 1, length: 10, last: 11");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) ' ');
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str6, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        long long8 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 1, last: 1" + "'", str3, "Element, offset: 0, length: 1, last: 1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 1, last: 1" + "'", str4, "Element, offset: 0, length: 1, last: 1");
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, 100);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        long long9 = stub2.offset;
        java.lang.String str10 = stub2.getElementDescription();
        java.lang.String str11 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 100, last: 100" + "'", str3, "Element, offset: 0, length: 100, last: 100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 100, last: 100" + "'", str6, "Element, offset: 0, length: 100, last: 100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: 100, last: 100" + "'", str7, "Element, offset: 0, length: 100, last: 100");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: 100, last: 100" + "'", str8, "Element, offset: 0, length: 100, last: 100");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 0, length: 100, last: 100" + "'", str10, "Element, offset: 0, length: 100, last: 100");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: 0, length: 100, last: 100" + "'", str11, "Element, offset: 0, length: 100, last: 100");
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str7, "Element, offset: -1, length: 1, last: 0");
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) 'a');
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        int int8 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(32L, 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 1, last: 33" + "'", str3, "Element, offset: 32, length: 1, last: 33");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 1, last: 33" + "'", str4, "Element, offset: 32, length: 1, last: 33");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 1, last: 33" + "'", str5, "Element, offset: 32, length: 1, last: 33");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 32, length: 1, last: 33" + "'", str6, "Element, offset: 32, length: 1, last: 33");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) ' ');
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str5, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str6, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str7, "Element, offset: 1, length: 32, last: 33");
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', (int) (short) 100);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 35, length: 100, last: 135" + "'", str3, "Element, offset: 35, length: 100, last: 135");
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', (int) 'a');
        int int3 = stub2.length;
        long long4 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(97L, (int) 'a');
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 1, (int) 'a');
        int int3 = stub2.length;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 97, last: 98" + "'", str5, "Element, offset: 1, length: 97, last: 98");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 1, length: 97, last: 98" + "'", str6, "Element, offset: 1, length: 97, last: 98");
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str4, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str5, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str7, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str8, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str9, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str10, "Element, offset: 0, length: 0, last: 0");
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 10, 1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 1, last: 11" + "'", str4, "Element, offset: 10, length: 1, last: 11");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (-1), (int) (short) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        long long9 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str3, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str4, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str5, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str6, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str7, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str8, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 10, (int) (short) 100);
        int int3 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 10, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: -1, last: 9" + "'", str3, "Element, offset: 10, length: -1, last: 9");
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        int int9 = stub2.length;
        int int10 = stub2.length;
        java.lang.String str11 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass12 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str11, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        int int8 = stub2.length;
        long long9 = stub2.offset;
        java.lang.String str10 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 1, last: 101" + "'", str3, "Element, offset: 100, length: 1, last: 101");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 100, length: 1, last: 101" + "'", str4, "Element, offset: 100, length: 1, last: 101");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 100, length: 1, last: 101" + "'", str6, "Element, offset: 100, length: 1, last: 101");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 100, length: 1, last: 101" + "'", str10, "Element, offset: 100, length: 1, last: 101");
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        long long9 = stub2.offset;
        long long10 = stub2.offset;
        int int11 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str7, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str8, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, 1);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        long long6 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 1, last: 101" + "'", str3, "Element, offset: 100, length: 1, last: 101");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 100, (int) 'a');
        int int3 = stub2.length;
        long long4 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 0, (int) 'a');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 97, last: 97" + "'", str3, "Element, offset: 0, length: 97, last: 97");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 97, last: 97" + "'", str4, "Element, offset: 0, length: 97, last: 97");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 97, last: 97" + "'", str5, "Element, offset: 0, length: 97, last: 97");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 97, last: 97" + "'", str6, "Element, offset: 0, length: 97, last: 97");
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', (int) (byte) 100);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        long long5 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str5, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str6, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str7, "Element, offset: 0, length: 0, last: 0");
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 10, 32);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str3, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str4, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str5, "Element, offset: 10, length: 32, last: 42");
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (-1), (int) (byte) 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str3, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 35, length: 0, last: 35" + "'", str4, "Element, offset: 35, length: 0, last: 35");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) 'a');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 97, last: 97" + "'", str3, "Element, offset: 0, length: 97, last: 97");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 97, last: 97" + "'", str4, "Element, offset: 0, length: 97, last: 97");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 97, last: 97" + "'", str5, "Element, offset: 0, length: 97, last: 97");
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        int int8 = stub2.length;
        java.lang.String str9 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 0, (int) (byte) 10);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 10, last: 10" + "'", str4, "Element, offset: 0, length: 10, last: 10");
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str7, "Element, offset: -1, length: 1, last: 0");
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 35, length: 1, last: 36" + "'", str3, "Element, offset: 35, length: 1, last: 36");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 1, last: 11" + "'", str3, "Element, offset: 10, length: 1, last: 11");
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, 100);
        int int3 = stub2.length;
        long long4 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, 100);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 100, last: 100" + "'", str3, "Element, offset: 0, length: 100, last: 100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 100, last: 100" + "'", str5, "Element, offset: 0, length: 100, last: 100");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 100, last: 100" + "'", str6, "Element, offset: 0, length: 100, last: 100");
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) (byte) 10);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str6, "Element, offset: 1, length: 10, last: 11");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 97, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 97, length: 0, last: 97" + "'", str3, "Element, offset: 97, length: 0, last: 97");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 97, length: 0, last: 97" + "'", str4, "Element, offset: 97, length: 0, last: 97");
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 32, (int) (short) 100);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str4, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str5, "Element, offset: 32, length: 100, last: 132");
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: -1, last: 31" + "'", str3, "Element, offset: 32, length: -1, last: 31");
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        long long8 = stub2.offset;
        long long9 = stub2.offset;
        java.lang.String str10 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str6, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str10, "Element, offset: 0, length: -1, last: -1");
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', (int) (short) 0);
        int int3 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 100, 0);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 100, length: 0, last: 100" + "'", str5, "Element, offset: 100, length: 0, last: 100");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 100, length: 0, last: 100" + "'", str6, "Element, offset: 100, length: 0, last: 100");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 100, length: 0, last: 100" + "'", str8, "Element, offset: 100, length: 0, last: 100");
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) -1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        int int8 = stub2.length;
        long long9 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str5, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str6, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str7, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, 32);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        int int8 = stub2.length;
        int int9 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str3, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str4, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str5, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        long long9 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) ' ');
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str3, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str5, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str7, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(52L, 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 52, length: 0, last: 52" + "'", str4, "Element, offset: 52, length: 0, last: 52");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 52, length: 0, last: 52" + "'", str5, "Element, offset: 52, length: 0, last: 52");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 52, length: 0, last: 52" + "'", str6, "Element, offset: 52, length: 0, last: 52");
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 10, (int) (byte) 10);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (byte) 1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str7, "Element, offset: -1, length: 1, last: 0");
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, (int) (byte) 1);
        int int3 = stub2.length;
        int int4 = stub2.length;
        long long5 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, 1);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        java.lang.String str11 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str7, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str8, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str9, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str10, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str11, "Element, offset: 0, length: -1, last: -1");
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', 35);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, 100);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 100, last: 100" + "'", str3, "Element, offset: 0, length: 100, last: 100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        int int9 = stub2.length;
        long long10 = stub2.offset;
        int int11 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, (int) (short) 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 0, last: 100" + "'", str3, "Element, offset: 100, length: 0, last: 100");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 100, length: 0, last: 100" + "'", str4, "Element, offset: 100, length: 0, last: 100");
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 32, (int) (byte) 0);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 0, last: 32" + "'", str3, "Element, offset: 32, length: 0, last: 32");
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (-1), (int) (byte) 1);
        long long3 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 10, 0);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 1, (int) (byte) -1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: -1, last: 0" + "'", str4, "Element, offset: 1, length: -1, last: 0");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) ' ');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str3, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str4, "Element, offset: 1, length: 32, last: 33");
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 10, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 1, last: 11" + "'", str3, "Element, offset: 10, length: 1, last: 11");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (byte) 100);
        int int3 = stub2.length;
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '4', (int) (short) 0);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 35, 0);
        long long3 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) (byte) 10);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str3, "Element, offset: 1, length: 10, last: 11");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 1, (int) (byte) -1);
        int int3 = stub2.length;
        int int4 = stub2.length;
        int int5 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', 1);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        int int7 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 97, length: 1, last: 98" + "'", str5, "Element, offset: 97, length: 1, last: 98");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: -1, last: 9" + "'", str3, "Element, offset: 10, length: -1, last: 9");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 32, (int) (short) 100);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str5, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str8, "Element, offset: 32, length: 100, last: 132");
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str4, "Element, offset: 0, length: 0, last: 0");
    }
}

