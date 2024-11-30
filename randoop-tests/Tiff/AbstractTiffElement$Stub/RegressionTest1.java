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
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        long long8 = stub2.offset;
        int int9 = stub2.length;
        java.lang.String str10 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str5, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str10, "Element, offset: -1, length: 1, last: 0");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 100, 10);
        long long3 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 52, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 10, (int) (short) 10);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(100L, 32);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 32, last: 132" + "'", str3, "Element, offset: 100, length: 32, last: 132");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 100, length: 32, last: 132" + "'", str4, "Element, offset: 100, length: 32, last: 132");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', (int) 'a');
        long long3 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        int int8 = stub2.length;
        long long9 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str6, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str7, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, (int) '#');
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 35, last: 45" + "'", str4, "Element, offset: 10, length: 35, last: 45");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 35, last: 45" + "'", str5, "Element, offset: 10, length: 35, last: 45");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 35, last: 45" + "'", str6, "Element, offset: 10, length: 35, last: 45");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 35, last: 45" + "'", str7, "Element, offset: 10, length: 35, last: 45");
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 0, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(97L, (int) (short) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 97, length: -1, last: 96" + "'", str3, "Element, offset: 97, length: -1, last: 96");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str6, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str7, "Element, offset: 0, length: -1, last: -1");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        int int8 = stub2.length;
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass10 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, 10);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str3, "Element, offset: 1, length: 10, last: 11");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str5, "Element, offset: 1, length: 10, last: 11");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
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
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) 0);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 0, (int) (short) 0);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str6, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str7, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str8, "Element, offset: -1, length: 0, last: -1");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(52L, (int) 'a');
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 100, (-1));
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 100, length: -1, last: 99" + "'", str5, "Element, offset: 100, length: -1, last: 99");
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 1, last: 101" + "'", str3, "Element, offset: 100, length: 1, last: 101");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 100, length: 1, last: 101" + "'", str4, "Element, offset: 100, length: 1, last: 101");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', (-1));
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: -1, last: 31" + "'", str3, "Element, offset: 32, length: -1, last: 31");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', 0);
        int int3 = stub2.length;
        int int4 = stub2.length;
        int int5 = stub2.length;
        long long6 = stub2.offset;
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 97, (int) (byte) -1);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', (int) ' ');
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 97, length: 32, last: 129" + "'", str3, "Element, offset: 97, length: 32, last: 129");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', (int) (short) 10);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 97, length: 10, last: 107" + "'", str4, "Element, offset: 97, length: 10, last: 107");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 97, length: 10, last: 107" + "'", str5, "Element, offset: 97, length: 10, last: 107");
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 35, (-1));
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 35, length: -1, last: 34" + "'", str3, "Element, offset: 35, length: -1, last: 34");
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 52, (int) '#');
        long long3 = stub2.offset;
        int int4 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass8 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str5, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str7, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (-1), (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) -1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str7, "Element, offset: 0, length: -1, last: -1");
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str3, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str6, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str7, "Element, offset: -1, length: 0, last: -1");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 100, (-1));
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 100, length: -1, last: 99" + "'", str5, "Element, offset: 100, length: -1, last: 99");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) -1, (-1));
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str3, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass9 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str6, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str7, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str8, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        long long8 = stub2.offset;
        java.lang.String str9 = stub2.getElementDescription();
        int int10 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 100);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        long long5 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 100, last: 99" + "'", str3, "Element, offset: -1, length: 100, last: 99");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '4', (int) (byte) 1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 52, length: 1, last: 53" + "'", str3, "Element, offset: 52, length: 1, last: 53");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 52, length: 1, last: 53" + "'", str5, "Element, offset: 52, length: 1, last: 53");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, (int) ' ');
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass8 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str4, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str7, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '4', (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
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
        long long13 = stub2.offset;
        long long14 = stub2.offset;
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str6, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) '4');
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 52, last: 52" + "'", str3, "Element, offset: 0, length: 52, last: 52");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) -1, (int) (byte) 1);
        long long3 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), (int) (byte) 1);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 52, (int) (short) 100);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, 100);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 100, last: 100" + "'", str3, "Element, offset: 0, length: 100, last: 100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 100, last: 100" + "'", str5, "Element, offset: 0, length: 100, last: 100");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        long long6 = stub2.offset;
        int int7 = stub2.length;
        int int8 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', 100);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 97, length: 100, last: 197" + "'", str6, "Element, offset: 97, length: 100, last: 197");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 97, length: 100, last: 197" + "'", str7, "Element, offset: 97, length: 100, last: 197");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 97, length: 100, last: 197" + "'", str8, "Element, offset: 97, length: 100, last: 197");
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, 0);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 100, length: 0, last: 100" + "'", str4, "Element, offset: 100, length: 0, last: 100");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 100, length: 0, last: 100" + "'", str5, "Element, offset: 100, length: 0, last: 100");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 100, length: 0, last: 100" + "'", str7, "Element, offset: 100, length: 0, last: 100");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, 32);
        int int3 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        int int9 = stub2.length;
        int int10 = stub2.length;
        java.lang.Class<?> wildcardClass11 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 1, 0);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) '#');
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 35, last: 35" + "'", str3, "Element, offset: 0, length: 35, last: 35");
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 52, (int) ' ');
        int int3 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', 100);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str5, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(32L, (int) 'a');
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str5, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(35L, 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 35, length: 100, last: 135" + "'", str3, "Element, offset: 35, length: 100, last: 135");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 35, length: 100, last: 135" + "'", str4, "Element, offset: 35, length: 100, last: 135");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        long long11 = stub2.offset;
        java.lang.Class<?> wildcardClass12 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str10, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 32, (int) (short) 100);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str5, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 10, 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 1, last: 11" + "'", str3, "Element, offset: 10, length: 1, last: 11");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 1, last: 11" + "'", str4, "Element, offset: 10, length: 1, last: 11");
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(100L, 32);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 100, length: 32, last: 132" + "'", str6, "Element, offset: 100, length: 32, last: 132");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        int int7 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 1, 0);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 0, last: 1" + "'", str3, "Element, offset: 1, length: 0, last: 1");
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, 100);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 0, (int) (short) 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str4, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str6, "Element, offset: 0, length: 0, last: 0");
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(32L, (int) '4');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 52, last: 84" + "'", str3, "Element, offset: 32, length: 52, last: 84");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 52, last: 84" + "'", str4, "Element, offset: 32, length: 52, last: 84");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) ' ');
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str3, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str5, "Element, offset: 1, length: 32, last: 33");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        int int5 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, (int) 'a');
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 97, last: 98" + "'", str3, "Element, offset: 1, length: 97, last: 98");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(35L, (-1));
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        long long7 = stub2.offset;
        java.lang.Class<?> wildcardClass8 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 1, (int) (short) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: -1, last: 0" + "'", str3, "Element, offset: 1, length: -1, last: 0");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 35, (int) (byte) 100);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 1, 35);
        long long3 = stub2.offset;
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass9 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str5, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str7, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str8, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', (int) ' ');
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 0, 10);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (byte) 1);
        long long3 = stub2.offset;
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) ' ');
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (-1), (int) ' ');
        int int3 = stub2.length;
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 32, last: 31" + "'", str6, "Element, offset: -1, length: 32, last: 31");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        int int8 = stub2.length;
        long long9 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str3, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str7, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 10, 0);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) '4');
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, 52);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 52, last: 52" + "'", str3, "Element, offset: 0, length: 52, last: 52");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 10, 1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 1, last: 11" + "'", str4, "Element, offset: 10, length: 1, last: 11");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        java.lang.Class<?> wildcardClass8 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        int int8 = stub2.length;
        java.lang.Class<?> wildcardClass9 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str6, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 100, 0);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 0, last: 100" + "'", str3, "Element, offset: 100, length: 0, last: 100");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 10, (int) (short) -1);
        long long3 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        int int6 = stub2.length;
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        int int10 = stub2.length;
        java.lang.String str11 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str8, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str9, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str11, "Element, offset: 0, length: -1, last: -1");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, (int) 'a');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 97, last: 98" + "'", str3, "Element, offset: 1, length: 97, last: 98");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 97, last: 98" + "'", str4, "Element, offset: 1, length: 97, last: 98");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str5, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(100L, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 1, last: 101" + "'", str3, "Element, offset: 100, length: 1, last: 101");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 100, length: 1, last: 101" + "'", str5, "Element, offset: 100, length: 1, last: 101");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        int int8 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str3, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str4, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str5, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 35, length: 0, last: 35" + "'", str4, "Element, offset: 35, length: 0, last: 35");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 35, length: 0, last: 35" + "'", str5, "Element, offset: 35, length: 0, last: 35");
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) (short) -1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: -1, last: 0" + "'", str4, "Element, offset: 1, length: -1, last: 0");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str5, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str7, "Element, offset: -1, length: 1, last: 0");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        long long8 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str3, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str4, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str5, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str6, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        int int6 = stub2.length;
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        int int9 = stub2.length;
        int int10 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str8, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        long long8 = stub2.offset;
        java.lang.String str9 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str9, "Element, offset: -1, length: 0, last: -1");
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 10, 0);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        int int7 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) -1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str6, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, (int) '4');
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 52, last: 62" + "'", str4, "Element, offset: 10, length: 52, last: 62");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', (int) (byte) 100);
        int int3 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(32L, (int) (byte) 1);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        int int7 = stub2.length;
        long long8 = stub2.offset;
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass10 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str4, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str5, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str9, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        long long6 = stub2.offset;
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 1, 35);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) ' ');
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str5, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str6, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 100);
        int int3 = stub2.length;
        long long4 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 32, (int) (short) 100);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        long long5 = stub2.offset;
        int int6 = stub2.length;
        int int7 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 97, (int) (short) 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 97, length: 100, last: 197" + "'", str3, "Element, offset: 97, length: 100, last: 197");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        int int6 = stub2.length;
        int int7 = stub2.length;
        java.lang.Class<?> wildcardClass8 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        int int6 = stub2.length;
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        long long9 = stub2.offset;
        long long10 = stub2.offset;
        java.lang.String str11 = stub2.getElementDescription();
        java.lang.String str12 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str8, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str11, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str12, "Element, offset: 0, length: -1, last: -1");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) (byte) 10);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str3, "Element, offset: 1, length: 10, last: 11");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str4, "Element, offset: 1, length: 10, last: 11");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str5, "Element, offset: 1, length: 10, last: 11");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (-1), (int) (byte) -1);
        int int3 = stub2.length;
        long long4 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 1, (int) (short) -1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: -1, last: 0" + "'", str3, "Element, offset: 1, length: -1, last: 0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str3, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', 100);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 97, length: 100, last: 197" + "'", str4, "Element, offset: 97, length: 100, last: 197");
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(100L, (int) (byte) -1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 100, length: -1, last: 99" + "'", str4, "Element, offset: 100, length: -1, last: 99");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) ' ');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str3, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str4, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str5, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str6, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str7, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str8, "Element, offset: 1, length: 32, last: 33");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 97, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) -1, (int) (short) 10);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 10, last: 9" + "'", str3, "Element, offset: -1, length: 10, last: 9");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
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
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str6, "Element, offset: 0, length: -1, last: -1");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 35);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        int int8 = stub2.length;
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass11 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str6, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str9, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str10, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 0, (int) (short) 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str4, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (-1), 1);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        long long3 = stub2.offset;
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        int int5 = stub2.length;
        long long6 = stub2.offset;
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        java.lang.Class<?> wildcardClass8 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', (int) '#');
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) 1);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass9 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str6, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str7, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str8, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(97L, 1);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) ' ');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str3, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str4, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str5, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 52, (int) 'a');
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', (int) '#');
        long long3 = stub2.offset;
        int int4 = stub2.length;
        int int5 = stub2.length;
        int int6 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        java.lang.String str8 = stub2.getElementDescription();
        long long9 = stub2.offset;
        java.lang.String str10 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str10, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 100, (-1));
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: -1, last: 99" + "'", str3, "Element, offset: 100, length: -1, last: 99");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 100, length: -1, last: 99" + "'", str4, "Element, offset: 100, length: -1, last: 99");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 100, length: -1, last: 99" + "'", str5, "Element, offset: 100, length: -1, last: 99");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', 100);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        long long5 = stub2.offset;
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        int int7 = stub2.length;
        java.lang.Class<?> wildcardClass8 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, 10);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str3, "Element, offset: 1, length: 10, last: 11");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str6, "Element, offset: 1, length: 10, last: 11");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        long long8 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 10, 100);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 100, last: 110" + "'", str3, "Element, offset: 10, length: 100, last: 110");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) ' ');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str3, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str4, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str5, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 0, (int) (short) 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 100, last: 100" + "'", str3, "Element, offset: 0, length: 100, last: 100");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 100, last: 100" + "'", str4, "Element, offset: 0, length: 100, last: 100");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 100, last: 100" + "'", str6, "Element, offset: 0, length: 100, last: 100");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        int int8 = stub2.length;
        long long9 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str4, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str5, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str6, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str7, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        long long8 = stub2.offset;
        java.lang.Class<?> wildcardClass9 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        long long8 = stub2.offset;
        long long9 = stub2.offset;
        java.lang.String str10 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass11 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str10, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        int int6 = stub2.length;
        int int7 = stub2.length;
        int int8 = stub2.length;
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass10 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(97L, (int) (short) -1);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        int int7 = stub2.length;
        java.lang.Class<?> wildcardClass8 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str3, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) -1, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str3, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        int int8 = stub2.length;
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        long long11 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str3, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str7, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str9, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str10, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (byte) 1);
        int int3 = stub2.length;
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        long long8 = stub2.offset;
        java.lang.String str9 = stub2.getElementDescription();
        int int10 = stub2.length;
        int int11 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str3, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str4, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str5, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str6, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str9, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 35, (int) (byte) 10);
        int int3 = stub2.length;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 35, length: 10, last: 45" + "'", str5, "Element, offset: 35, length: 10, last: 45");
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(32L, (int) ' ');
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', 0);
        int int3 = stub2.length;
        int int4 = stub2.length;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 35, length: 0, last: 35" + "'", str6, "Element, offset: 35, length: 0, last: 35");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, (int) (byte) 10);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 100, length: 10, last: 110" + "'", str5, "Element, offset: 100, length: 10, last: 110");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        long long10 = stub2.offset;
        java.lang.String str11 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str7, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str8, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str9, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str11, "Element, offset: 0, length: -1, last: -1");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, (int) (byte) 1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 100, length: 1, last: 101" + "'", str4, "Element, offset: 100, length: 1, last: 101");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 100, length: 1, last: 101" + "'", str5, "Element, offset: 100, length: 1, last: 101");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 100, length: 1, last: 101" + "'", str7, "Element, offset: 100, length: 1, last: 101");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, 97);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', (int) (byte) 1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 1, last: 33" + "'", str4, "Element, offset: 32, length: 1, last: 33");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        long long9 = stub2.offset;
        java.lang.Class<?> wildcardClass10 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 100, 0);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', 0);
        int int3 = stub2.length;
        int int4 = stub2.length;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        int int8 = stub2.length;
        int int9 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 35, length: 0, last: 35" + "'", str6, "Element, offset: 35, length: 0, last: 35");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 35, length: 0, last: 35" + "'", str7, "Element, offset: 35, length: 0, last: 35");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) (byte) 10);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str3, "Element, offset: 1, length: 10, last: 11");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str5, "Element, offset: 1, length: 10, last: 11");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str6, "Element, offset: 1, length: 10, last: 11");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass9 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str5, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str7, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str8, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, 10);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str3, "Element, offset: 1, length: 10, last: 11");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str6, "Element, offset: 1, length: 10, last: 11");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', 100);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str5, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str6, "Element, offset: 32, length: 100, last: 132");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, 10);
        long long3 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
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
        int int13 = stub2.length;
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(32L, (int) (byte) 10);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 10, last: 42" + "'", str3, "Element, offset: 32, length: 10, last: 42");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, (int) ' ');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str3, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) ' ');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass9 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str3, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str4, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str7, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str8, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
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
        java.lang.String str14 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass15 = stub2.getClass();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str14, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 52);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, 97);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(97L, (int) (short) -1);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 97, length: -1, last: 96" + "'", str3, "Element, offset: 97, length: -1, last: 96");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) '4');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 52, last: 52" + "'", str3, "Element, offset: 0, length: 52, last: 52");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', (int) (byte) 0);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass8 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str7, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
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
        java.lang.Class<?> wildcardClass13 = stub2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(35L, 1);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 35, length: 1, last: 36" + "'", str3, "Element, offset: 35, length: 1, last: 36");
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', 0);
        int int3 = stub2.length;
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 35, (int) '#');
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 35, length: 35, last: 70" + "'", str4, "Element, offset: 35, length: 35, last: 70");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (byte) 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 100, last: 99" + "'", str3, "Element, offset: -1, length: 100, last: 99");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 100, last: 99" + "'", str4, "Element, offset: -1, length: 100, last: 99");
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', (int) (short) 10);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, (int) (short) -1);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        long long9 = stub2.offset;
        java.lang.String str10 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str7, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str10, "Element, offset: 0, length: -1, last: -1");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, 52);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '4', 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 52, length: 0, last: 52" + "'", str3, "Element, offset: 52, length: 0, last: 52");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str5, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str6, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str7, "Element, offset: 0, length: -1, last: -1");
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 0, (int) (byte) -1);
        int int3 = stub2.length;
        int int4 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(52L, 1);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, 0);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 100, length: 0, last: 100" + "'", str4, "Element, offset: 100, length: 0, last: 100");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass8 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str7, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        long long8 = stub2.offset;
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        java.lang.String str11 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str10, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str11, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 35, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(32L, (int) (byte) 10);
        int int3 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', 32);
        int int3 = stub2.length;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 32, last: 64" + "'", str5, "Element, offset: 32, length: 32, last: 64");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        long long9 = stub2.offset;
        java.lang.String str10 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass11 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str4, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str5, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str6, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str7, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str8, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str10, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 100, (int) (byte) 10);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 100, length: 10, last: 110" + "'", str4, "Element, offset: 100, length: 10, last: 110");
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', (int) (short) 10);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 97, length: 10, last: 107" + "'", str5, "Element, offset: 97, length: 10, last: 107");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        int int7 = stub2.length;
        long long8 = stub2.offset;
        java.lang.String str9 = stub2.getElementDescription();
        long long10 = stub2.offset;
        java.lang.String str11 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass12 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str4, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str5, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str9, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str11, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 100, last: 101" + "'", str3, "Element, offset: 1, length: 100, last: 101");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, 0);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 0, last: 1" + "'", str3, "Element, offset: 1, length: 0, last: 1");
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
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
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        int int8 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str6, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '4', (int) (byte) 10);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str5, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        int int8 = stub2.length;
        long long9 = stub2.offset;
        java.lang.Class<?> wildcardClass10 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str6, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) -1, (int) (byte) 10);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 10, last: 9" + "'", str3, "Element, offset: -1, length: 10, last: 9");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) ' ');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str3, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str4, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str5, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str8, "Element, offset: 1, length: 32, last: 33");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(35L, (int) (short) 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        long long6 = stub2.offset;
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 35, length: 100, last: 135" + "'", str3, "Element, offset: 35, length: 100, last: 135");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 35, length: 100, last: 135" + "'", str4, "Element, offset: 35, length: 100, last: 135");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, 32);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str3, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str4, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str5, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        int int7 = stub2.length;
        long long8 = stub2.offset;
        long long9 = stub2.offset;
        java.lang.String str10 = stub2.getElementDescription();
        java.lang.String str11 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str5, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str10, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str11, "Element, offset: -1, length: 1, last: 0");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        long long8 = stub2.offset;
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass11 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str10, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) -1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        int int8 = stub2.length;
        java.lang.Class<?> wildcardClass9 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str5, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 32, (int) (byte) 100);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        long long8 = stub2.offset;
        long long9 = stub2.offset;
        java.lang.String str10 = stub2.getElementDescription();
        java.lang.String str11 = stub2.getElementDescription();
        long long12 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str6, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str10, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str11, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', (int) ' ');
        int int3 = stub2.length;
        long long4 = stub2.offset;
        int int5 = stub2.length;
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', 0);
        long long3 = stub2.offset;
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, (int) (short) 0);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 0, last: 1" + "'", str4, "Element, offset: 1, length: 0, last: 1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 0, last: 1" + "'", str5, "Element, offset: 1, length: 0, last: 1");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 100, (int) 'a');
        int int3 = stub2.length;
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass8 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str5, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str6, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str7, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        long long10 = stub2.offset;
        java.lang.Class<?> wildcardClass11 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 32, 100);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str3, "Element, offset: 32, length: 100, last: 132");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
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
        long long12 = stub2.offset;
        java.lang.String str13 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str13, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, (int) '#');
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 35, last: 45" + "'", str4, "Element, offset: 10, length: 35, last: 45");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 35, last: 45" + "'", str5, "Element, offset: 10, length: 35, last: 45");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, (int) (short) 100);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 100, last: 101" + "'", str3, "Element, offset: 1, length: 100, last: 101");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        int int8 = stub2.length;
        int int9 = stub2.length;
        java.lang.String str10 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str10, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 1, 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 1, last: 2" + "'", str3, "Element, offset: 1, length: 1, last: 2");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        int int8 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str6, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        long long11 = stub2.offset;
        java.lang.Class<?> wildcardClass12 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str10, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
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
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        long long5 = stub2.offset;
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (-1));
        int int3 = stub2.length;
        long long4 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(100L, 32);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        int int6 = stub2.length;
        int int7 = stub2.length;
        java.lang.Class<?> wildcardClass8 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 32, last: 132" + "'", str3, "Element, offset: 100, length: 32, last: 132");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 100, length: 32, last: 132" + "'", str4, "Element, offset: 100, length: 32, last: 132");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 0, (int) (short) 0);
        int int3 = stub2.length;
        long long4 = stub2.offset;
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        java.lang.String str11 = stub2.getElementDescription();
        java.lang.String str12 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str10, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str11, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str12, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) ' ');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str3, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str4, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str5, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, 32);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        long long7 = stub2.offset;
        java.lang.Class<?> wildcardClass8 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str3, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str5, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, (int) (byte) 1);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 100, length: 1, last: 101" + "'", str5, "Element, offset: 100, length: 1, last: 101");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        int int7 = stub2.length;
        int int8 = stub2.length;
        java.lang.Class<?> wildcardClass9 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str4, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str5, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 97, length: 1, last: 98" + "'", str3, "Element, offset: 97, length: 1, last: 98");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 97, length: 1, last: 98" + "'", str4, "Element, offset: 97, length: 1, last: 98");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 100, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: -1, last: 99" + "'", str3, "Element, offset: 100, length: -1, last: 99");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 100, length: -1, last: 99" + "'", str5, "Element, offset: 100, length: -1, last: 99");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', (-1));
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 35, length: -1, last: 34" + "'", str3, "Element, offset: 35, length: -1, last: 34");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        int int8 = stub2.length;
        int int9 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, 32);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str3, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str5, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str6, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 100, 10);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (-1), (-1));
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 10, (int) (short) 100);
        int int3 = stub2.length;
        long long4 = stub2.offset;
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 97, (int) (short) -1);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, (int) '#');
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 35, last: 45" + "'", str3, "Element, offset: 10, length: 35, last: 45");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        long long10 = stub2.offset;
        java.lang.String str11 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass12 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str11, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        long long10 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) '#');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 35, last: 45" + "'", str3, "Element, offset: 10, length: 35, last: 45");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 35, last: 45" + "'", str4, "Element, offset: 10, length: 35, last: 45");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str5, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str3, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 0, (int) (short) 0);
        int int3 = stub2.length;
        long long4 = stub2.offset;
        int int5 = stub2.length;
        int int6 = stub2.length;
        long long7 = stub2.offset;
        int int8 = stub2.length;
        java.lang.Class<?> wildcardClass9 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        int int6 = stub2.length;
        long long7 = stub2.offset;
        java.lang.Class<?> wildcardClass8 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', (-1));
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: -1, last: 31" + "'", str3, "Element, offset: 32, length: -1, last: 31");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 32, length: -1, last: 31" + "'", str6, "Element, offset: 32, length: -1, last: 31");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 10, 1);
        int int3 = stub2.length;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 1, last: 11" + "'", str5, "Element, offset: 10, length: 1, last: 11");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', (int) (byte) 0);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(35L, 97);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (-1), (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 10, 1);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) -1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str5, "Element, offset: 0, length: -1, last: -1");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', (int) (short) 10);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 97, length: 10, last: 107" + "'", str5, "Element, offset: 97, length: 10, last: 107");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 97, length: 10, last: 107" + "'", str6, "Element, offset: 97, length: 10, last: 107");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 97, length: 10, last: 107" + "'", str7, "Element, offset: 97, length: 10, last: 107");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 52, (-1));
        long long3 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 1, (int) (byte) 100);
        int int3 = stub2.length;
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 0, (int) (short) 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str4, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str5, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str6, "Element, offset: 0, length: 0, last: 0");
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 97, (int) (short) -1);
        long long3 = stub2.offset;
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 10, 32);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str3, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 35, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
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
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 1, (int) (short) 10);
        long long3 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 1, (int) (short) 0);
        long long3 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        long long6 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, 10);
        int int3 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(52L, (int) (byte) 0);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 52, length: 0, last: 52" + "'", str3, "Element, offset: 52, length: 0, last: 52");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(100L, 35);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) '#');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 35, last: 35" + "'", str3, "Element, offset: 0, length: 35, last: 35");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (-1), (int) (byte) 10);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 10, last: 9" + "'", str3, "Element, offset: -1, length: 10, last: 9");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) -1, (int) (byte) 1);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) 0);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
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
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        int int6 = stub2.length;
        long long7 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 100, (int) 'a');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        long long6 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 97, last: 197" + "'", str3, "Element, offset: 100, length: 97, last: 197");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 100, length: 97, last: 197" + "'", str4, "Element, offset: 100, length: 97, last: 197");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        java.lang.String str8 = stub2.getElementDescription();
        int int9 = stub2.length;
        java.lang.Class<?> wildcardClass10 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str6, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str8, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', (int) (short) 0);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, (int) (byte) 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        int int8 = stub2.length;
        java.lang.String str9 = stub2.getElementDescription();
        long long10 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str5, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str9, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 10, 32);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass11 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str10, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 1, (int) (short) 10);
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str5, "Element, offset: 1, length: 10, last: 11");
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) -1, (-1));
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str4, "Element, offset: -1, length: -1, last: -2");
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str5, "Element, offset: -1, length: 1, last: 0");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 0, 0);
        int int3 = stub2.length;
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) '#');
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 35, last: 35" + "'", str4, "Element, offset: 0, length: 35, last: 35");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        int int8 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 0, (int) (short) 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str4, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str5, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str6, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str7, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str8, "Element, offset: 0, length: -1, last: -1");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
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
        java.lang.Class<?> wildcardClass12 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str6, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str9, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str10, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str11, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) ' ');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass8 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str3, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str4, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str5, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str6, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str7, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) -1);
        int int3 = stub2.length;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str5, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) (byte) 10);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str3, "Element, offset: 1, length: 10, last: 11");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str5, "Element, offset: 1, length: 10, last: 11");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 100, 100);
        int int3 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (short) -1);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 1, (int) (byte) 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 1, last: 2" + "'", str3, "Element, offset: 1, length: 1, last: 2");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        long long9 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str4, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str5, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str6, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str7, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str8, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, 0);
        int int3 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str6, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) 'a');
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 97, last: 97" + "'", str4, "Element, offset: 0, length: 97, last: 97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, (int) (byte) 1);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 1, last: 2" + "'", str3, "Element, offset: 1, length: 1, last: 2");
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) 'a');
        int int3 = stub2.length;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 97, last: 97" + "'", str5, "Element, offset: 0, length: 97, last: 97");
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        long long3 = stub2.offset;
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, 10);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str3, "Element, offset: 1, length: 10, last: 11");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str6, "Element, offset: 1, length: 10, last: 11");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str7, "Element, offset: 1, length: 10, last: 11");
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str8, "Element, offset: -1, length: 1, last: 0");
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 1, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: -1, last: 0" + "'", str3, "Element, offset: 1, length: -1, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: -1, last: 0" + "'", str4, "Element, offset: 1, length: -1, last: 0");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) -1, 32);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass9 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', (int) ' ');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 97, length: 32, last: 129" + "'", str3, "Element, offset: 97, length: 32, last: 129");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 97, (int) (short) -1);
        int int3 = stub2.length;
        int int4 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', (int) 'a');
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 35, length: 97, last: 132" + "'", str3, "Element, offset: 35, length: 97, last: 132");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 35, length: 97, last: 132" + "'", str5, "Element, offset: 35, length: 97, last: 132");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(35L, (int) (short) 100);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 35, length: 100, last: 135" + "'", str4, "Element, offset: 35, length: 100, last: 135");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 35, length: 100, last: 135" + "'", str5, "Element, offset: 35, length: 100, last: 135");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(97L, (int) (short) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 97, length: -1, last: 96" + "'", str3, "Element, offset: 97, length: -1, last: 96");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 97, length: -1, last: 96" + "'", str4, "Element, offset: 97, length: -1, last: 96");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 97, length: -1, last: 96" + "'", str7, "Element, offset: 97, length: -1, last: 96");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(52L, 32);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 52, length: 32, last: 84" + "'", str4, "Element, offset: 52, length: 32, last: 84");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 52, length: 32, last: 84" + "'", str5, "Element, offset: 52, length: 32, last: 84");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 100, (-1));
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: -1, last: 99" + "'", str3, "Element, offset: 100, length: -1, last: 99");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 100, length: -1, last: 99" + "'", str4, "Element, offset: 100, length: -1, last: 99");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 100, length: -1, last: 99" + "'", str5, "Element, offset: 100, length: -1, last: 99");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 0, (int) (short) 0);
        int int3 = stub2.length;
        long long4 = stub2.offset;
        int int5 = stub2.length;
        int int6 = stub2.length;
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass10 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str8, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str9, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        java.lang.Class<?> wildcardClass8 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        int int9 = stub2.length;
        java.lang.String str10 = stub2.getElementDescription();
        int int11 = stub2.length;
        long long12 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str5, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str7, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str10, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, (int) (byte) 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 10, 32);
        int int3 = stub2.length;
        long long4 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        int int6 = stub2.length;
        long long7 = stub2.offset;
        long long8 = stub2.offset;
        int int9 = stub2.length;
        int int10 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 35, (-1));
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(97L, 10);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) ' ');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str3, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str4, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 52, (int) '4');
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (-1));
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(52L, 32);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 52, length: 32, last: 84" + "'", str3, "Element, offset: 52, length: 32, last: 84");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 52, length: 32, last: 84" + "'", str5, "Element, offset: 52, length: 32, last: 84");
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 1, 10);
        int int3 = stub2.length;
        long long4 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        int int9 = stub2.length;
        int int10 = stub2.length;
        long long11 = stub2.offset;
        java.lang.String str12 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass13 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str12, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
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
        java.lang.Class<?> wildcardClass14 = stub2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(32L, 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str3, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str6, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str5, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str5, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str6, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str7, "Element, offset: 0, length: -1, last: -1");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 52);
        int int3 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        java.lang.Class<?> wildcardClass8 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str4, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str5, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, (-1));
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) '4');
        int int3 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 1, 97);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) 100);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 100, last: 100" + "'", str3, "Element, offset: 0, length: 100, last: 100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) (short) -1);
        long long3 = stub2.offset;
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, 52);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        int int9 = stub2.length;
        java.lang.String str10 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str10, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 100, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: -1, last: 99" + "'", str3, "Element, offset: 100, length: -1, last: 99");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass9 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str4, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str5, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str6, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str8, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', (int) (byte) 10);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 35, length: 10, last: 45" + "'", str3, "Element, offset: 35, length: 10, last: 45");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(100L, (int) (short) 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 0, last: 100" + "'", str3, "Element, offset: 100, length: 0, last: 100");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (-1), (int) (short) 100);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 100, last: 110" + "'", str3, "Element, offset: 10, length: 100, last: 110");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 100, last: 110" + "'", str4, "Element, offset: 10, length: 100, last: 110");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        int int5 = stub2.length;
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', (int) '4');
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 97, length: 52, last: 149" + "'", str4, "Element, offset: 97, length: 52, last: 149");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 97, length: 52, last: 149" + "'", str5, "Element, offset: 97, length: 52, last: 149");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 97, length: 52, last: 149" + "'", str6, "Element, offset: 97, length: 52, last: 149");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (-1), (int) '4');
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, 32);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 32, last: 32" + "'", str3, "Element, offset: 0, length: 32, last: 32");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 32, last: 32" + "'", str4, "Element, offset: 0, length: 32, last: 32");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 32, last: 32" + "'", str5, "Element, offset: 0, length: 32, last: 32");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) '4');
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 52, last: 51" + "'", str3, "Element, offset: -1, length: 52, last: 51");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 0, (int) (short) 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        java.lang.Class<?> wildcardClass8 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        java.lang.String str10 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str6, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str8, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str9, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str10, "Element, offset: 0, length: 0, last: 0");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, 32);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str3, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 10, (int) (short) 1);
        long long3 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(100L, (-1));
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: -1, last: 99" + "'", str3, "Element, offset: 100, length: -1, last: 99");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 100, length: -1, last: 99" + "'", str4, "Element, offset: 100, length: -1, last: 99");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 100, length: -1, last: 99" + "'", str5, "Element, offset: 100, length: -1, last: 99");
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 1, (int) (short) 0);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 0, last: 1" + "'", str3, "Element, offset: 1, length: 0, last: 1");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 0, (int) (short) 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str6, "Element, offset: 0, length: 0, last: 0");
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, (int) '4');
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 52, last: 62" + "'", str4, "Element, offset: 10, length: 52, last: 62");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 52, last: 62" + "'", str5, "Element, offset: 10, length: 52, last: 62");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        long long8 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str3, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str7, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '4', (int) (byte) 1);
        int int3 = stub2.length;
        int int4 = stub2.length;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 52, length: 1, last: 53" + "'", str6, "Element, offset: 52, length: 1, last: 53");
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
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
        long long12 = stub2.offset;
        java.lang.Class<?> wildcardClass13 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 35, (int) (byte) -1);
        int int3 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        long long10 = stub2.offset;
        java.lang.String str11 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str7, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str8, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str9, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str11, "Element, offset: 0, length: -1, last: -1");
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        int int8 = stub2.length;
        long long9 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str4, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str5, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str8, "Element, offset: 0, length: 0, last: 0");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        long long10 = stub2.offset;
        java.lang.String str11 = stub2.getElementDescription();
        java.lang.String str12 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass13 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str11, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str12, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(32L, (int) (short) 1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 1, last: 33" + "'", str4, "Element, offset: 32, length: 1, last: 33");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 32, length: 1, last: 33" + "'", str6, "Element, offset: 32, length: 1, last: 33");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(32L, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', (int) ' ');
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 97, length: 32, last: 129" + "'", str4, "Element, offset: 97, length: 32, last: 129");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 100, (-1));
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: -1, last: 99" + "'", str3, "Element, offset: 100, length: -1, last: 99");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        long long9 = stub2.offset;
        java.lang.String str10 = stub2.getElementDescription();
        long long11 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str3, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str7, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str8, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str10, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, (int) ' ');
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str4, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str5, "Element, offset: 1, length: 32, last: 33");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, 32);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        int int8 = stub2.length;
        java.lang.String str9 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str3, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str4, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str5, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str7, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str9, "Element, offset: 10, length: 32, last: 42");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        long long5 = stub2.offset;
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        int int8 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(32L, (int) '4');
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 52, last: 84" + "'", str3, "Element, offset: 32, length: 52, last: 84");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 32, length: 52, last: 84" + "'", str6, "Element, offset: 32, length: 52, last: 84");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) (byte) 10);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str3, "Element, offset: 1, length: 10, last: 11");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str5, "Element, offset: 1, length: 10, last: 11");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        long long8 = stub2.offset;
        java.lang.String str9 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str3, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str4, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str5, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str6, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str9, "Element, offset: 32, length: 100, last: 132");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, (int) ' ');
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 35, 1);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(100L, 32);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 32, last: 132" + "'", str3, "Element, offset: 100, length: 32, last: 132");
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 35, length: 1, last: 36" + "'", str3, "Element, offset: 35, length: 1, last: 36");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 35, length: 1, last: 36" + "'", str4, "Element, offset: 35, length: 1, last: 36");
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, 100);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 97, 0);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', (int) 'a');
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (byte) 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 100, last: 99" + "'", str3, "Element, offset: -1, length: 100, last: 99");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
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
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) (byte) 100);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        long long5 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 100, last: 100" + "'", str3, "Element, offset: 0, length: 100, last: 100");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', (int) '4');
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 97, length: 52, last: 149" + "'", str4, "Element, offset: 97, length: 52, last: 149");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 97, length: 52, last: 149" + "'", str5, "Element, offset: 97, length: 52, last: 149");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str5, "Element, offset: 0, length: -1, last: -1");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        long long6 = stub2.offset;
        java.lang.Class<?> wildcardClass7 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass9 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str3, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str7, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str8, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 35, 10);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        int int6 = stub2.length;
        long long7 = stub2.offset;
        java.lang.Class<?> wildcardClass8 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 10, (int) (short) 100);
        long long3 = stub2.offset;
        int int4 = stub2.length;
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, 32);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        int int7 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str3, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str5, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, (int) ' ');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str3, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str4, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (byte) 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 10, (int) (short) 100);
        int int3 = stub2.length;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 100, last: 110" + "'", str5, "Element, offset: 10, length: 100, last: 110");
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
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
        java.lang.String str14 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass15 = stub2.getClass();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str14, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 10, (int) (short) 0);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        long long7 = stub2.offset;
        java.lang.String str8 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str3, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str4, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str5, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str6, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str8, "Element, offset: 32, length: 100, last: 132");
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
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
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) -1, (int) (short) 1);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        long long10 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str3, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str5, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str7, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str8, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: -1, length: 1, last: 0" + "'", str9, "Element, offset: -1, length: 1, last: 0");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        int int8 = stub2.length;
        java.lang.Class<?> wildcardClass9 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, 52);
        long long3 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 1, last: 101" + "'", str3, "Element, offset: 100, length: 1, last: 101");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 100, length: 1, last: 101" + "'", str4, "Element, offset: 100, length: 1, last: 101");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 100, length: 1, last: 101" + "'", str5, "Element, offset: 100, length: 1, last: 101");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 100, length: 1, last: 101" + "'", str6, "Element, offset: 100, length: 1, last: 101");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, (int) ' ');
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str3, "Element, offset: 1, length: 32, last: 33");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 32, last: 33" + "'", str5, "Element, offset: 1, length: 32, last: 33");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        java.lang.String str9 = stub2.getElementDescription();
        long long10 = stub2.offset;
        java.lang.Class<?> wildcardClass11 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str6, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 10, 10);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(0L, (int) '4');
        java.lang.Class<?> wildcardClass3 = stub2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, 52);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 1, (int) (byte) 100);
        java.lang.String str3 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 100, last: 101" + "'", str3, "Element, offset: 1, length: 100, last: 101");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 100, 100);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 100, length: 100, last: 200" + "'", str3, "Element, offset: 100, length: 100, last: 200");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, 0);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        long long6 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: 0, last: 0" + "'", str3, "Element, offset: 0, length: 0, last: 0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((-1L), 0);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        int int7 = stub2.length;
        long long8 = stub2.offset;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str4, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str5, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: -1, length: 0, last: -1" + "'", str6, "Element, offset: -1, length: 0, last: -1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', (int) ' ');
        int int3 = stub2.length;
        long long4 = stub2.offset;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        long long7 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 97, length: 32, last: 129" + "'", str5, "Element, offset: 97, length: 32, last: 129");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', (int) (byte) 100);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str4, "Element, offset: 32, length: 100, last: 132");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(35L, (int) (short) 100);
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 35, length: 100, last: 135" + "'", str4, "Element, offset: 35, length: 100, last: 135");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '#', 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 35, length: 0, last: 35" + "'", str3, "Element, offset: 35, length: 0, last: 35");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(35L, (int) (short) 100);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 35, length: 100, last: 135" + "'", str3, "Element, offset: 35, length: 100, last: 135");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(32L, 1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 1, last: 33" + "'", str3, "Element, offset: 32, length: 1, last: 33");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 1, last: 33" + "'", str4, "Element, offset: 32, length: 1, last: 33");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 97, (int) (short) -1);
        int int3 = stub2.length;
        long long4 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        long long5 = stub2.offset;
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass8 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str4, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str6, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str7, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 0, (int) (short) 100);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(97L, (int) (short) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 97, length: -1, last: 96" + "'", str3, "Element, offset: 97, length: -1, last: 96");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 97, length: -1, last: 96" + "'", str4, "Element, offset: 97, length: -1, last: 96");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(97L, 97);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(10L, 32);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        long long6 = stub2.offset;
        java.lang.String str7 = stub2.getElementDescription();
        int int8 = stub2.length;
        int int9 = stub2.length;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str3, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str4, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str5, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 32, last: 42" + "'", str7, "Element, offset: 10, length: 32, last: 42");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 1, 97);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 97, last: 98" + "'", str3, "Element, offset: 1, length: 97, last: 98");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 1, length: 97, last: 98" + "'", str5, "Element, offset: 1, length: 97, last: 98");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 1, length: 97, last: 98" + "'", str6, "Element, offset: 1, length: 97, last: 98");
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 100, (int) (byte) -1);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 'a', 1);
        int int3 = stub2.length;
        long long4 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (-1), (int) (short) -1);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass6 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str3, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str4, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: -1, length: -1, last: -2" + "'", str5, "Element, offset: -1, length: -1, last: -2");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        int int4 = stub2.length;
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        java.lang.String str8 = stub2.getElementDescription();
        long long9 = stub2.offset;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str7, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str8, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 0, (int) (byte) -1);
        java.lang.String str3 = stub2.getElementDescription();
        int int4 = stub2.length;
        int int5 = stub2.length;
        int int6 = stub2.length;
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str3, "Element, offset: 0, length: -1, last: -1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 0, length: -1, last: -1" + "'", str7, "Element, offset: 0, length: -1, last: -1");
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) ' ', 100);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        java.lang.String str6 = stub2.getElementDescription();
        java.lang.String str7 = stub2.getElementDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str3, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str4, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str5, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str6, "Element, offset: 32, length: 100, last: 132");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Element, offset: 32, length: 100, last: 132" + "'", str7, "Element, offset: 32, length: 100, last: 132");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 52, (int) ' ');
        long long3 = stub2.offset;
        java.lang.String str4 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 52, length: 32, last: 84" + "'", str4, "Element, offset: 52, length: 32, last: 84");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, (int) (short) 0);
        int int3 = stub2.length;
        java.lang.String str4 = stub2.getElementDescription();
        int int5 = stub2.length;
        long long6 = stub2.offset;
        long long7 = stub2.offset;
        long long8 = stub2.offset;
        java.lang.String str9 = stub2.getElementDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str9, "Element, offset: 10, length: 0, last: 10");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (short) 100, (int) '#');
        long long3 = stub2.offset;
        long long4 = stub2.offset;
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) '4', (int) '#');
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.Class<?> wildcardClass4 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 52, length: 35, last: 87" + "'", str3, "Element, offset: 52, length: 35, last: 87");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub(1L, (int) (byte) 10);
        java.lang.String str3 = stub2.getElementDescription();
        long long4 = stub2.offset;
        java.lang.Class<?> wildcardClass5 = stub2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 1, length: 10, last: 11" + "'", str3, "Element, offset: 1, length: 10, last: 11");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) (byte) 10, 0);
        java.lang.String str3 = stub2.getElementDescription();
        java.lang.String str4 = stub2.getElementDescription();
        java.lang.String str5 = stub2.getElementDescription();
        int int6 = stub2.length;
        long long7 = stub2.offset;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str3, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str4, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Element, offset: 10, length: 0, last: 10" + "'", str5, "Element, offset: 10, length: 0, last: 10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }
}

